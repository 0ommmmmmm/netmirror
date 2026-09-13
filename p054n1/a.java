package p054n1;

import android.view.View;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.yoga.p;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0137a f9850a = C0137a.f9851a;

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    public static final class C0137a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0137a f9851a = new C0137a();

        private C0137a() {
        }

        public final float a(int i3) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return size;
        }

        public final float b(int i3) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824) {
                return size;
            }
            return 0.0f;
        }

        public final p c(float f3, float f4) {
            if (f3 == f4) {
                return p.EXACTLY;
            }
            return Float.isInfinite(f4) ? p.UNDEFINED : p.AT_MOST;
        }

        public final float d(float f3, float f4) {
            if (f3 == f4) {
                return C0392f0.f7477a.b(f4);
            }
            if (Float.isInfinite(f4)) {
                return Float.POSITIVE_INFINITY;
            }
            return C0392f0.f7477a.b(f4);
        }
    }

    static float a(int i3) {
        return f9850a.b(i3);
    }

    static p b(float f3, float f4) {
        return f9850a.c(f3, f4);
    }

    static float c(float f3, float f4) {
        return f9850a.d(f3, f4);
    }

    static float d(int i3) {
        return f9850a.a(i3);
    }
}
