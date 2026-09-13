package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f5708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5709c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f5712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B0.b f5713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B0.b f5714h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f5710d = "default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f5715i = new h();

    public Collator(List<String> list, Map<String, Object> map) throws B0.e {
        a(list, map);
        this.f5715i.b(this.f5713g).c(this.f5711e).a(this.f5712f).e(this.f5708b).g(this.f5709c);
    }

    private void a(List list, Map map) throws B0.e {
        g.a aVar = g.a.STRING;
        this.f5707a = (a.d) g.d(a.d.class, B0.d.h(g.c(map, "usage", aVar, B0.a.f56e, "sort")));
        Object objQ = B0.d.q();
        B0.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, B0.a.f52a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, B0.d.d(), B0.d.d());
        if (!B0.d.n(objC)) {
            objC = B0.d.r(String.valueOf(B0.d.e(objC)));
        }
        B0.d.c(objQ, "kn", objC);
        B0.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, B0.a.f55d, B0.d.d()));
        HashMap mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        B0.b bVar = (B0.b) B0.d.g(mapA).get("locale");
        this.f5713g = bVar;
        this.f5714h = bVar.e();
        Object objA = B0.d.a(mapA, "co");
        if (B0.d.j(objA)) {
            objA = B0.d.r("default");
        }
        this.f5710d = B0.d.h(objA);
        Object objA2 = B0.d.a(mapA, "kn");
        if (B0.d.j(objA2)) {
            this.f5711e = false;
        } else {
            this.f5711e = Boolean.parseBoolean(B0.d.h(objA2));
        }
        Object objA3 = B0.d.a(mapA, "kf");
        if (B0.d.j(objA3)) {
            objA3 = B0.d.r("false");
        }
        this.f5712f = (a.b) g.d(a.b.class, B0.d.h(objA3));
        if (this.f5707a == a.d.SEARCH) {
            ArrayList arrayListC = this.f5713g.c("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                arrayList.add(B0.i.e((String) it.next()));
            }
            arrayList.add(B0.i.e("search"));
            this.f5713g.g("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, B0.a.f54c, B0.d.d());
        if (!B0.d.n(objC2)) {
            this.f5708b = (a.c) g.d(a.c.class, B0.d.h(objC2));
        } else if (this.f5707a == a.d.SORT) {
            this.f5708b = a.c.VARIANT;
        } else {
            this.f5708b = a.c.LOCALE;
        }
        this.f5709c = B0.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, B0.d.d(), Boolean.FALSE));
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return B0.d.h(g.c(map, "localeMatcher", g.a.STRING, B0.a.f52a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    public double compare(String str, String str2) {
        return this.f5715i.d(str, str2);
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f5714h.a().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f5707a.toString());
        a.c cVar = this.f5708b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f5715i.f().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f5709c));
        linkedHashMap.put("collation", this.f5710d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f5711e));
        linkedHashMap.put("caseFirst", this.f5712f.toString());
        return linkedHashMap;
    }
}
