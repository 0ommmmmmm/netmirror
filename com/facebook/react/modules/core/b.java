package com.facebook.react.modules.core;

import D2.h;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0107b f6917f = new C0107b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f6918g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q1.b.a f6919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f6920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Choreographer.FrameCallback f6923e;

    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f6930i = p091w2.a.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6931b;

        a(int i3) {
            this.f6931b = i3;
        }

        public static EnumEntries b() {
            return f6930i;
        }

        public final int c() {
            return this.f6931b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.core.b$b, reason: collision with other inner class name */
    public static final class C0107b {
        public /* synthetic */ C0107b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = b.f6918g;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(p066q1.b bVar) {
            h.f(bVar, "choreographerProvider");
            if (b.f6918g == null) {
                b.f6918g = new b(bVar, null);
            }
        }

        private C0107b() {
        }
    }

    public /* synthetic */ b(p066q1.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, p066q1.b bVar2) {
        bVar.f6919a = bVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j3) {
        synchronized (bVar.f6920b) {
            try {
                bVar.f6922d = false;
                int length = bVar.f6920b.length;
                for (int i3 = 0; i3 < length; i3++) {
                    ArrayDeque arrayDeque = bVar.f6920b[i3];
                    int size = arrayDeque.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j3);
                            bVar.f6921c--;
                        } else {
                            Y.a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                r rVar = r.f10603a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final b h() {
        return f6917f.a();
    }

    public static final void i(p066q1.b bVar) {
        f6917f.b(bVar);
    }

    private final void j() {
        p002a1.a.a(this.f6921c >= 0);
        if (this.f6921c == 0 && this.f6922d) {
            q1.b.a aVar = this.f6919a;
            if (aVar != null) {
                aVar.b(this.f6923e);
            }
            this.f6922d = false;
        }
    }

    private final void l() {
        if (this.f6922d) {
            return;
        }
        q1.b.a aVar = this.f6919a;
        if (aVar == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: B1.j
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.react.modules.core.b.m(this.f87b);
                }
            });
        } else {
            aVar.a(this.f6923e);
            this.f6922d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.f6920b) {
            bVar.l();
            r rVar = r.f10603a;
        }
    }

    public final void k(a aVar, Choreographer.FrameCallback frameCallback) {
        h.f(aVar, "type");
        h.f(frameCallback, "callback");
        synchronized (this.f6920b) {
            this.f6920b[aVar.c()].addLast(frameCallback);
            boolean z3 = true;
            int i3 = this.f6921c + 1;
            this.f6921c = i3;
            if (i3 <= 0) {
                z3 = false;
            }
            p002a1.a.a(z3);
            l();
            r rVar = r.f10603a;
        }
    }

    public final void n(a aVar, Choreographer.FrameCallback frameCallback) {
        h.f(aVar, "type");
        synchronized (this.f6920b) {
            try {
                if (this.f6920b[aVar.c()].removeFirstOccurrence(frameCallback)) {
                    this.f6921c--;
                    j();
                } else {
                    Y.a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                r rVar = r.f10603a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private b(final p066q1.b bVar) {
        int size = a.b().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i3 = 0; i3 < size; i3++) {
            arrayDequeArr[i3] = new ArrayDeque();
        }
        this.f6920b = arrayDequeArr;
        this.f6923e = new Choreographer.FrameCallback() { // from class: B1.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                com.facebook.react.modules.core.b.g(this.f84a, j3);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: B1.i
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.react.modules.core.b.d(this.f85b, bVar);
            }
        });
    }
}
