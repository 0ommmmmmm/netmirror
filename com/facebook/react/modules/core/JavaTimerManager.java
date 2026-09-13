package com.facebook.react.modules.core;

import C2.p;
import D2.h;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018e1.l;
import p071r2.r;
import p082u1.f;

/* JADX INFO: loaded from: classes.dex */
public class JavaTimerManager implements LifecycleEventListener, f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f6890r = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactApplicationContext f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B1.c f6892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.facebook.react.modules.core.b f6893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p042k1.e f6894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f6895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f6896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray f6897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f6898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f6899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f6900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f6901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f6902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PriorityQueue f6906q;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d dVar, long j3) {
            return !dVar.b() && ((long) dVar.a()) < j3;
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f6908c;

        public b(long j3) {
            this.f6907b = j3;
        }

        public final void a() {
            this.f6908c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            if (this.f6908c) {
                return;
            }
            long jC = l.c() - (this.f6907b / ((long) 1000000));
            long jA = l.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.f6896g;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z3 = javaTimerManager.f6905p;
                r rVar = r.f10603a;
            }
            if (z3) {
                JavaTimerManager.this.f6892c.callIdleCallbacks(jA);
            }
            JavaTimerManager.this.f6902m = null;
        }
    }

    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j3) {
            if (!JavaTimerManager.this.f6898i.get() || JavaTimerManager.this.f6899j.get()) {
                b bVar = JavaTimerManager.this.f6902m;
                if (bVar != null) {
                    bVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f6902m = javaTimerManager.new b(j3);
                JavaTimerManager.this.f6891b.runOnJSQueueThread(JavaTimerManager.this.f6902m);
                JavaTimerManager.this.f6893d.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6914d;

        public d(int i3, long j3, int i4, boolean z3) {
            this.f6911a = i3;
            this.f6912b = j3;
            this.f6913c = i4;
            this.f6914d = z3;
        }

        public final int a() {
            return this.f6913c;
        }

        public final boolean b() {
            return this.f6914d;
        }

        public final long c() {
            return this.f6912b;
        }

        public final int d() {
            return this.f6911a;
        }

        public final void e(long j3) {
            this.f6912b = j3;
        }
    }

    private final class e implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WritableArray f6915a;

        public e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j3) {
            d dVar;
            if (!JavaTimerManager.this.f6898i.get() || JavaTimerManager.this.f6899j.get()) {
                long j4 = j3 / ((long) 1000000);
                Object obj = JavaTimerManager.this.f6895f;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.f6906q.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.f6906q.peek();
                            h.c(objPeek);
                            if (((d) objPeek).c() >= j4 || (dVar = (d) javaTimerManager.f6906q.poll()) == null) {
                                break;
                                break;
                            }
                            if (this.f6915a == null) {
                                this.f6915a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.f6915a;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.d());
                            }
                            if (dVar.b()) {
                                dVar.e(((long) dVar.a()) + j4);
                                javaTimerManager.f6906q.add(dVar);
                            } else {
                                javaTimerManager.f6897h.remove(dVar.d());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    r rVar = r.f10603a;
                }
                WritableArray writableArray2 = this.f6915a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.f6892c.callTimers(writableArray2);
                    this.f6915a = null;
                }
                JavaTimerManager.this.f6893d.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, B1.c cVar, com.facebook.react.modules.core.b bVar, p042k1.e eVar) {
        h.f(reactApplicationContext, "reactApplicationContext");
        h.f(cVar, "javaScriptTimerExecutor");
        h.f(bVar, "reactChoreographer");
        h.f(eVar, "devSupportManager");
        this.f6891b = reactApplicationContext;
        this.f6892c = cVar;
        this.f6893d = bVar;
        this.f6894e = eVar;
        this.f6895f = new Object();
        this.f6896g = new Object();
        this.f6897h = new SparseArray();
        this.f6898i = new AtomicBoolean(true);
        this.f6899j = new AtomicBoolean(false);
        this.f6900k = new e();
        this.f6901l = new c();
        final p pVar = new p() { // from class: com.facebook.react.modules.core.a
            @Override // C2.p
            public final Object b(Object obj, Object obj2) {
                return Integer.valueOf(JavaTimerManager.B((JavaTimerManager.d) obj, (JavaTimerManager.d) obj2));
            }
        };
        this.f6906q = new PriorityQueue(11, new Comparator() { // from class: B1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return JavaTimerManager.C(pVar, obj, obj2);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        p082u1.e.f10878g.a(reactApplicationContext).e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(JavaTimerManager javaTimerManager, boolean z3) {
        synchronized (javaTimerManager.f6896g) {
            try {
                if (z3) {
                    javaTimerManager.z();
                } else {
                    javaTimerManager.r();
                }
                r rVar = r.f10603a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(d dVar, d dVar2) {
        return F2.a.a(dVar.c() - dVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.b(obj, obj2)).intValue();
    }

    private final void r() {
        if (this.f6904o) {
            this.f6893d.n(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.f6901l);
            this.f6904o = false;
        }
    }

    private final void s() {
        p082u1.e eVarA = p082u1.e.f10878g.a(this.f6891b);
        if (this.f6903n && this.f6898i.get() && !eVarA.h()) {
            this.f6893d.n(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.f6900k);
            this.f6903n = false;
        }
    }

    private final void v() {
        if (!this.f6898i.get() || this.f6899j.get()) {
            return;
        }
        s();
    }

    private final void w() {
        synchronized (this.f6896g) {
            try {
                if (this.f6905p) {
                    z();
                }
                r rVar = r.f10603a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void y() {
        if (this.f6903n) {
            return;
        }
        this.f6893d.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.f6900k);
        this.f6903n = true;
    }

    private final void z() {
        if (this.f6904o) {
            return;
        }
        this.f6893d.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.f6901l);
        this.f6904o = true;
    }

    @Override // p082u1.f
    public void a(int i3) {
        if (this.f6899j.getAndSet(true)) {
            return;
        }
        y();
        w();
    }

    @Override // p082u1.f
    public void b(int i3) {
        if (p082u1.e.f10878g.a(this.f6891b).h()) {
            return;
        }
        this.f6899j.set(false);
        s();
        v();
    }

    public void createTimer(int i3, long j3, boolean z3) {
        d dVar = new d(i3, (l.b() / ((long) 1000000)) + j3, (int) j3, z3);
        synchronized (this.f6895f) {
            this.f6906q.add(dVar);
            this.f6897h.put(i3, dVar);
            r rVar = r.f10603a;
        }
    }

    public void deleteTimer(int i3) {
        synchronized (this.f6895f) {
            d dVar = (d) this.f6897h.get(i3);
            if (dVar == null) {
                return;
            }
            this.f6897h.remove(i3);
            this.f6906q.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f6898i.set(true);
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f6898i.set(false);
        y();
        w();
    }

    public void setSendIdleEvents(final boolean z3) {
        synchronized (this.f6896g) {
            this.f6905p = z3;
            r rVar = r.f10603a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: B1.e
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.A(this.f82b, z3);
            }
        });
    }

    public void t(int i3, int i4, double d4, boolean z3) {
        long jA = l.a();
        long j3 = (long) d4;
        if (this.f6894e.n() && Math.abs(j3 - jA) > 60000) {
            this.f6892c.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j3 - jA) + ((long) i4));
        if (i4 != 0 || z3) {
            createTimer(i3, jMax, z3);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i3);
        B1.c cVar = this.f6892c;
        h.c(writableArrayCreateArray);
        cVar.callTimers(writableArrayCreateArray);
    }

    public final boolean u(long j3) {
        synchronized (this.f6895f) {
            d dVar = (d) this.f6906q.peek();
            if (dVar == null) {
                return false;
            }
            if (f6890r.b(dVar, j3)) {
                return true;
            }
            Iterator it = this.f6906q.iterator();
            h.e(it, "iterator(...)");
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a aVar = f6890r;
                h.c(dVar2);
                if (aVar.b(dVar2, j3)) {
                    return true;
                }
            }
            r rVar = r.f10603a;
            return false;
        }
    }

    public void x() {
        p082u1.e.f10878g.a(this.f6891b).j(this);
        this.f6891b.removeLifecycleEventListener(this);
        s();
        r();
    }
}
