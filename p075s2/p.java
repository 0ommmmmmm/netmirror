package p075s2;

import D2.h;
import H2.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p083u2.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class p extends C0493o {
    public static final Collection d(Object[] objArr) {
        h.f(objArr, "<this>");
        return new C0484f(objArr, false);
    }

    public static final int e(List list, Comparable comparable, int i3, int i4) {
        h.f(list, "<this>");
        n(list.size(), i3, i4);
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int iA = a.a((Comparable) list.get(i6), comparable);
            if (iA < 0) {
                i3 = i6 + 1;
            } else {
                if (iA <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static /* synthetic */ int f(List list, Comparable comparable, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = list.size();
        }
        return e(list, comparable, i3, i4);
    }

    public static List g() {
        return z.f10636b;
    }

    public static c h(Collection collection) {
        h.f(collection, "<this>");
        return new c(0, collection.size() - 1);
    }

    public static int i(List list) {
        h.f(list, "<this>");
        return list.size() - 1;
    }

    public static List j(Object... objArr) {
        h.f(objArr, "elements");
        return objArr.length > 0 ? AbstractC0486h.d(objArr) : AbstractC0492n.g();
    }

    public static List k(Object... objArr) {
        h.f(objArr, "elements");
        return AbstractC0486h.m(objArr);
    }

    public static List l(Object... objArr) {
        h.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0484f(objArr, true));
    }

    public static final List m(List list) {
        h.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : AbstractC0492n.b(list.get(0));
        }
        return AbstractC0492n.g();
    }

    private static final void n(int i3, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException("fromIndex (" + i4 + ") is greater than toIndex (" + i5 + ").");
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i4 + ") is less than zero.");
        }
        if (i5 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is greater than size (" + i3 + ").");
    }

    public static final void o() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void p() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
