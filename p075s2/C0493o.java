package p075s2;

import D2.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: s2.o */
/* JADX INFO: loaded from: classes.dex */
public class C0493o {
    public static final Object[] a(Object[] objArr, boolean z3) {
        h.f(objArr, "<this>");
        if (z3 && h.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        h.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        h.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final Object[] c(int i3, Object[] objArr) {
        h.f(objArr, "array");
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
