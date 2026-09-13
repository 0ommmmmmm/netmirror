package p093x0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: x0.a$a, reason: collision with other inner class name */
    public static class C0155a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10958b;
    }

    private static boolean a(int i3) {
        return i3 == 0 || i3 == -2;
    }

    public static void b(C0155a c0155a, float f3, ViewGroup.LayoutParams layoutParams, int i3, int i4) {
        if (f3 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0155a.f10958b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0155a.f10957a) - i3) / f3) + i4), c0155a.f10958b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0155a.f10957a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0155a.f10958b) - i4) * f3) + i3), c0155a.f10957a), 1073741824);
        }
    }
}
