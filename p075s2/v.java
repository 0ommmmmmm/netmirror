package p075s2;

import D2.h;
import H2.c;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class v extends u {
    public static List B(List list) {
        h.f(list, "<this>");
        return new K(list);
    }

    public static List C(List list) {
        h.f(list, "<this>");
        return new J(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(List list, int i3) {
        if (i3 >= 0 && i3 <= AbstractC0492n.i(list)) {
            return AbstractC0492n.i(list) - i3;
        }
        throw new IndexOutOfBoundsException("Element index " + i3 + " must be in range [" + new c(0, AbstractC0492n.i(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(List list, int i3) {
        return AbstractC0492n.i(list) - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(List list, int i3) {
        if (i3 >= 0 && i3 <= list.size()) {
            return list.size() - i3;
        }
        throw new IndexOutOfBoundsException("Position index " + i3 + " must be in range [" + new c(0, list.size()) + "].");
    }
}
