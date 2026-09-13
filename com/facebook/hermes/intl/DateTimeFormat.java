package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f5723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f5724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f5725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f5726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f5727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f5728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f5729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f5730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f5731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f5732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f5733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f5734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0090b f5735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f5736u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B0.b f5717b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B0.b f5718c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f5737v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f5716a = new i();

    public DateTimeFormat(List<String> list, Map<String, Object> map) throws B0.e {
        c(list, map);
        this.f5716a.h(this.f5717b, this.f5719d ? "" : this.f5720e, this.f5721f ? "" : this.f5722g, this.f5725j, this.f5726k, this.f5727l, this.f5728m, this.f5729n, this.f5730o, this.f5731p, this.f5732q, this.f5733r, this.f5734s, this.f5724i, this.f5737v, this.f5735t, this.f5736u, this.f5723h);
    }

    private Object a() {
        return this.f5716a.f(this.f5717b);
    }

    private Object b(Object obj, String str, String str2) throws B0.e {
        if (!B0.d.l(obj)) {
            throw new B0.e("Invalid options object !");
        }
        boolean z3 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i3 = 0; i3 < 4; i3++) {
                if (!B0.d.n(B0.d.a(obj, strArr[i3]))) {
                    z3 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i4 = 0; i4 < 3; i4++) {
                if (!B0.d.n(B0.d.a(obj, strArr2[i4]))) {
                    z3 = false;
                }
            }
        }
        if (!B0.d.n(B0.d.a(obj, "dateStyle")) || !B0.d.n(B0.d.a(obj, "timeStyle"))) {
            z3 = false;
        }
        if (z3 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i5 = 0; i5 < 3; i5++) {
                B0.d.c(obj, strArr3[i5], "numeric");
            }
        }
        if (z3 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i6 = 0; i6 < 3; i6++) {
                B0.d.c(obj, strArr4[i6], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) throws B0.e {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", "date");
        Object objQ = B0.d.q();
        g.a aVar = g.a.STRING;
        B0.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, B0.a.f52a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, B0.d.d(), B0.d.d());
        if (!B0.d.n(objC) && !d(B0.d.h(objC))) {
            throw new B0.e("Invalid calendar option !");
        }
        B0.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, B0.d.d(), B0.d.d());
        if (!B0.d.n(objC2) && !d(B0.d.h(objC2))) {
            throw new B0.e("Invalid numbering system !");
        }
        B0.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, B0.d.d(), B0.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, B0.d.d());
        if (!B0.d.n(objC3)) {
            objC4 = B0.d.b();
        }
        B0.d.c(objQ, "hc", objC4);
        HashMap mapA = f.a(list, objQ, listAsList);
        B0.b bVar = (B0.b) B0.d.g(mapA).get("locale");
        this.f5717b = bVar;
        this.f5718c = bVar.e();
        Object objA = B0.d.a(mapA, "ca");
        if (B0.d.j(objA)) {
            this.f5719d = true;
            this.f5720e = this.f5716a.d(this.f5717b);
        } else {
            this.f5719d = false;
            this.f5720e = B0.d.h(objA);
        }
        Object objA2 = B0.d.a(mapA, "nu");
        if (B0.d.j(objA2)) {
            this.f5721f = true;
            this.f5722g = this.f5716a.c(this.f5717b);
        } else {
            this.f5721f = false;
            this.f5722g = B0.d.h(objA2);
        }
        Object objA3 = B0.d.a(mapA, "hc");
        Object objA4 = B0.d.a(objB, "timeZone");
        this.f5737v = B0.d.n(objA4) ? a() : e(objA4.toString());
        this.f5725j = (b.e) g.d(b.e.class, B0.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f5726k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{"long", "short", "narrow"}, B0.d.d()));
        this.f5727l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{"long", "short", "narrow"}, B0.d.d()));
        this.f5728m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, B0.d.d()));
        this.f5729n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, B0.d.d()));
        this.f5730o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, B0.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, B0.d.d());
        this.f5731p = (b.f) g.d(b.f.class, objC5);
        this.f5732q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, B0.d.d()));
        this.f5733r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, B0.d.d()));
        this.f5734s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, B0.d.d()));
        this.f5735t = (b.EnumC0090b) g.d(b.EnumC0090b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, B0.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, B0.d.d());
        this.f5736u = (b.k) g.d(b.k.class, objC6);
        if (B0.d.n(objC5) && B0.d.n(objC6)) {
            this.f5724i = b.g.UNDEFINED;
        } else {
            b.g gVarG = this.f5716a.g(this.f5717b);
            b.g gVar = B0.d.j(objA3) ? gVarG : (b.g) g.d(b.g.class, objA3);
            if (!B0.d.n(objC3)) {
                if (B0.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarG != gVar && gVarG != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarG == b.g.H11 || gVarG == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f5724i = gVar;
        }
        this.f5723h = objC3;
    }

    private boolean d(String str) {
        return B0.c.e(str, 0, str.length() - 1);
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = B0.d.h(g.c(map, "localeMatcher", g.a.STRING, B0.a.f52a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) throws B0.e {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new B0.e("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt + ' '));
            }
        }
        return sb.toString();
    }

    public String format(double d4) {
        return this.f5716a.b(d4);
    }

    public List<Map<String, String>> formatToParts(double d4) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f5716a.a(d4);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strE = it.hasNext() ? this.f5716a.e(it.next(), sb.toString()) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strE);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f5718c.a());
        linkedHashMap.put("numberingSystem", this.f5722g);
        linkedHashMap.put("calendar", this.f5720e);
        linkedHashMap.put("timeZone", this.f5737v);
        b.g gVar = this.f5724i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f5724i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f5726k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f5727l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f5728m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f5729n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f5730o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f5731p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f5732q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f5733r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f5734s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0090b enumC0090b = this.f5735t;
        if (enumC0090b != b.EnumC0090b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0090b.toString());
        }
        b.k kVar = this.f5736u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
