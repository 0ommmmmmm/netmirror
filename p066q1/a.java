package p066q1;

import D2.h;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10412a = new a();

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    private static final class C0143a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f10413a;

        public C0143a() {
            Choreographer choreographer = Choreographer.getInstance();
            h.e(choreographer, "getInstance(...)");
            this.f10413a = choreographer;
        }

        @Override // q1.b.a
        public void a(Choreographer.FrameCallback frameCallback) {
            h.f(frameCallback, "callback");
            this.f10413a.postFrameCallback(frameCallback);
        }

        @Override // q1.b.a
        public void b(Choreographer.FrameCallback frameCallback) {
            h.f(frameCallback, "callback");
            this.f10413a.removeFrameCallback(frameCallback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f10412a;
    }

    @Override // p066q1.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0143a();
    }
}
