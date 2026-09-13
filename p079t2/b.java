package p079t2;

import D2.h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Object[] a(int i3) {
        if (i3 >= 0) {
            return new Object[i3];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] b(Object[] objArr, int i3) {
        h.f(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
        h.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void c(Object[] objArr, int i3) {
        h.f(objArr, "<this>");
        objArr[i3] = null;
    }

    public static final void d(Object[] objArr, int i3, int i4) {
        h.f(objArr, "<this>");
        while (i3 < i4) {
            c(objArr, i3);
            i3++;
        }
    }
}
