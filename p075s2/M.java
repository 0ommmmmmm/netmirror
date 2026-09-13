package p075s2;

import D2.h;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class M {
    public static final Set a(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        h.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
