package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static HashMap a(List list, Object obj, List list2) {
        Object obj2;
        Object objO;
        Object objR;
        HashMap map = new HashMap();
        e.a aVarF = B0.d.h(B0.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objB = B0.d.b();
            if (!aVarF.f5897b.isEmpty() && aVarF.f5897b.containsKey(str)) {
                String str2 = (String) aVarF.f5897b.get(str);
                if (str2.isEmpty()) {
                    obj2 = objB;
                    obj2 = objB;
                    objR = str2;
                    objR = B0.d.r("true");
                }
                obj2 = objB;
                obj2 = objB;
                objR = str2;
                hashSet.add(str);
                obj2 = objR;
            }
            obj2 = objB;
            obj2 = objB;
            obj2 = objB;
            Object obj3 = obj2;
            if (B0.d.g(obj).containsKey(str)) {
                Object objA = B0.d.a(obj, str);
                if (B0.d.m(objA) && B0.d.h(objA).isEmpty()) {
                    objO = objA;
                    objO = objA;
                    objO = B0.d.o(true);
                }
                objO = objA;
                objO = objA;
                objO = objA;
                obj3 = obj2;
                if (!B0.d.n(objO) && !objO.equals(obj2)) {
                    obj3 = obj2;
                    hashSet.remove(str);
                    obj3 = objO;
                }
            }
            obj3 = obj2;
            boolean zJ = B0.d.j(obj3);
            Object objF = obj3;
            if (!zJ) {
                objF = B0.i.f(str, obj3);
            }
            if (!B0.d.m(objF) || B0.i.c(str, B0.d.h(objF), aVarF.f5896a)) {
                map.put(str, objF);
            } else {
                map.put(str, B0.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String strH = B0.d.h(B0.i.f(str3, B0.d.r((String) aVarF.f5897b.get(str3))));
            if (!B0.d.m(strH) || B0.i.c(str3, B0.d.h(strH), aVarF.f5896a)) {
                arrayList.add(strH);
                aVarF.f5896a.g(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f5896a);
        return map;
    }
}
