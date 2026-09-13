package com.facebook.imagepipeline.producers;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends V.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0317n f6194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f6195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f6196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6197f;

    public n0(InterfaceC0317n interfaceC0317n, h0 h0Var, f0 f0Var, String str) {
        D2.h.f(interfaceC0317n, "consumer");
        D2.h.f(h0Var, "producerListener");
        D2.h.f(f0Var, "producerContext");
        D2.h.f(str, "producerName");
        this.f6194c = interfaceC0317n;
        this.f6195d = h0Var;
        this.f6196e = f0Var;
        this.f6197f = str;
        h0Var.g(f0Var, str);
    }

    @Override // V.e
    protected void d() {
        h0 h0Var = this.f6195d;
        f0 f0Var = this.f6196e;
        String str = this.f6197f;
        h0Var.f(f0Var, str, h0Var.j(f0Var, str) ? g() : null);
        this.f6194c.b();
    }

    @Override // V.e
    protected void e(Exception exc) {
        D2.h.f(exc, "e");
        h0 h0Var = this.f6195d;
        f0 f0Var = this.f6196e;
        String str = this.f6197f;
        h0Var.i(f0Var, str, exc, h0Var.j(f0Var, str) ? h(exc) : null);
        this.f6194c.a(exc);
    }

    @Override // V.e
    protected void f(Object obj) {
        h0 h0Var = this.f6195d;
        f0 f0Var = this.f6196e;
        String str = this.f6197f;
        h0Var.d(f0Var, str, h0Var.j(f0Var, str) ? i(obj) : null);
        this.f6194c.d(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
