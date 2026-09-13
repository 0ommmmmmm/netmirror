package p075s2;

import D2.h;
import java.util.Collections;
import java.util.Map;
import p071r2.i;
import p079t2.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class F extends E {
    public static Map a(Map map) {
        h.f(map, "builder");
        return ((c) map).l();
    }

    public static Map b() {
        return new c();
    }

    public static int c(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map d(i iVar) {
        h.f(iVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(iVar.c(), iVar.d());
        h.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map e(Map map) {
        h.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        h.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
