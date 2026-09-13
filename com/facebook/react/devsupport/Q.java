package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements p018e1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p042k1.e f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P f6657c;

    public Q(p042k1.e eVar) {
        D2.h.f(eVar, "devSupportManager");
        this.f6655a = eVar;
    }

    @Override // p018e1.j
    public boolean a() {
        P p3 = this.f6657c;
        if (p3 != null) {
            return p3.isShowing();
        }
        return false;
    }

    @Override // p018e1.j
    public void b() {
        if (a() || !e()) {
            return;
        }
        Activity activityI = this.f6655a.i();
        if (activityI == null || activityI.isFinishing()) {
            T1.c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        P p3 = new P(activityI, this.f6656b);
        this.f6657c = p3;
        p3.setCancelable(false);
        p3.show();
    }

    @Override // p018e1.j
    public void c() {
        P p3;
        if (a() && (p3 = this.f6657c) != null) {
            p3.dismiss();
        }
        View view = this.f6656b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.f6656b);
        }
        this.f6657c = null;
    }

    @Override // p018e1.j
    public void d() {
        View view = this.f6656b;
        if (view != null) {
            this.f6655a.b(view);
            this.f6656b = null;
        }
    }

    @Override // p018e1.j
    public boolean e() {
        return this.f6656b != null;
    }

    @Override // p018e1.j
    public void f(String str) {
        D2.h.f(str, "appKey");
        p002a1.a.b(D2.h.b(str, "LogBox"), "This surface manager can only create LogBox React application");
        View viewA = this.f6655a.a("LogBox");
        this.f6656b = viewA;
        if (viewA == null) {
            T1.c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }
}
