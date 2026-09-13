package p075s2;

import D2.h;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class N extends M {
    public static Set b() {
        return B.f10612b;
    }

    public static final Set c(Set set) {
        h.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : M.a(set.iterator().next());
        }
        return L.b();
    }
}
