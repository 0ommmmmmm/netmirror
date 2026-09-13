package p075s2;

import D2.h;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class t extends s {
    public static void r(List list) {
        h.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void s(List list, Comparator comparator) {
        h.f(list, "<this>");
        h.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
