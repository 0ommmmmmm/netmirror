package p075s2;

import D2.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import p071r2.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class G extends F {
    public static Map f() {
        A a4 = A.f10611b;
        h.d(a4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlin.coroutines.Continuation] */
    public static HashMap g(i... iVarArr) {
        h.f(iVarArr, "pairs");
        HashMap map = new HashMap((int) DebugProbesKt.probeCoroutineCreated(iVarArr.length));
        l(map, iVarArr);
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, void] */
    public static Map h(i... iVarArr) {
        h.f(iVarArr, "pairs");
        ?? length = iVarArr.length;
        return length > 0 ? p(iVarArr, new LinkedHashMap((int) DebugProbesKt.probeCoroutineCreated(iVarArr.length))) : DebugProbesKt.probeCoroutineSuspended(length);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlin.coroutines.Continuation] */
    public static Map i(i... iVarArr) {
        h.f(iVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap((int) DebugProbesKt.probeCoroutineCreated(iVarArr.length));
        l(linkedHashMap, iVarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, void] */
    public static final Map j(Map map) {
        h.f(map, "<this>");
        ?? size = map.size();
        if (size != 0) {
            return size != 1 ? map : F.e(map);
        }
        return DebugProbesKt.probeCoroutineSuspended(size);
    }

    public static final void k(Map map, Iterable iterable) {
        h.f(map, "<this>");
        h.f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            map.put(iVar.a(), iVar.b());
        }
    }

    public static final void l(Map map, i[] iVarArr) {
        h.f(map, "<this>");
        h.f(iVarArr, "pairs");
        for (i iVar : iVarArr) {
            map.put(iVar.a(), iVar.b());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map, void] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map, void] */
    public static Map m(Iterable iterable) {
        h.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j(n(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return DebugProbesKt.probeCoroutineSuspended(collection);
        }
        if (size != 1) {
            return n(iterable, new LinkedHashMap((int) DebugProbesKt.probeCoroutineCreated(collection.size())));
        }
        return DebugProbesKt.probeCoroutineResumed((i) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map n(Iterable iterable, Map map) {
        h.f(iterable, "<this>");
        h.f(map, "destination");
        k(map, iterable);
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, void] */
    public static Map o(Map map) {
        h.f(map, "<this>");
        ?? size = map.size();
        if (size != 0) {
            return size != 1 ? D.q(map) : F.e(map);
        }
        return DebugProbesKt.probeCoroutineSuspended(size);
    }

    public static final Map p(i[] iVarArr, Map map) {
        h.f(iVarArr, "<this>");
        h.f(map, "destination");
        l(map, iVarArr);
        return map;
    }

    public static Map q(Map map) {
        h.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
