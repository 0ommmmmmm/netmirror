package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6378e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f6379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6382d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(b bVar) {
        D2.h.f(bVar, "child");
        List arrayList = this.f6379a;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f6379a = arrayList;
        }
        arrayList.add(bVar);
        bVar.c(this);
    }

    public void c(b bVar) {
        D2.h.f(bVar, "parent");
    }

    public void d(b bVar) {
        D2.h.f(bVar, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        List list = this.f6379a;
        String strS = list != null ? AbstractC0492n.S(list, " ", null, null, 0, null, null, 62, null) : null;
        String strE = e();
        if (strS == null || K2.o.Q(strS)) {
            str = "";
        } else {
            str = " children: " + strS;
        }
        return strE + str;
    }

    public final void g(b bVar) {
        D2.h.f(bVar, "child");
        List list = this.f6379a;
        if (list == null) {
            return;
        }
        bVar.d(this);
        list.remove(bVar);
    }

    public void h() {
    }
}
