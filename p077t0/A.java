package p077t0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
class A extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f10637l = new A();

    private A() {
    }

    @Override // p077t0.q
    public void b(Matrix matrix, Rect rect, int i3, int i4, float f3, float f4, float f5, float f6) {
        float f7 = rect.left;
        float f8 = rect.top;
        matrix.setScale(f5, f6);
        matrix.postTranslate((int) (f7 + 0.5f), (int) (f8 + 0.5f));
    }

    public String toString() {
        return "fit_xy";
    }
}
