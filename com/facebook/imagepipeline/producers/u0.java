package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0[] f6256a;

    private class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f6257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final I0.g f6259e;

        public a(InterfaceC0317n interfaceC0317n, f0 f0Var, int i3) {
            super(interfaceC0317n);
            this.f6257c = f0Var;
            this.f6258d = i3;
            this.f6259e = f0Var.X().r();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void h(Throwable th) {
            if (u0.this.e(this.f6258d + 1, p(), this.f6257c)) {
                return;
            }
            p().a(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            if (jVar != null && (AbstractC0306c.f(i3) || w0.c(jVar, this.f6259e))) {
                p().d(jVar, i3);
            } else if (AbstractC0306c.e(i3)) {
                O0.j.o(jVar);
                if (u0.this.e(this.f6258d + 1, p(), this.f6257c)) {
                    return;
                }
                p().d(null, 1);
            }
        }
    }

    public u0(v0... v0VarArr) {
        v0[] v0VarArr2 = (v0[]) X.k.g(v0VarArr);
        this.f6256a = v0VarArr2;
        X.k.e(0, v0VarArr2.length);
    }

    private int d(int i3, I0.g gVar) {
        while (true) {
            v0[] v0VarArr = this.f6256a;
            if (i3 >= v0VarArr.length) {
                return -1;
            }
            if (v0VarArr[i3].a(gVar)) {
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i3, InterfaceC0317n interfaceC0317n, f0 f0Var) {
        int iD = d(i3, f0Var.X().r());
        if (iD == -1) {
            return false;
        }
        this.f6256a[iD].b(new a(interfaceC0317n, f0Var, iD), f0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        if (f0Var.X().r() == null) {
            interfaceC0317n.d(null, 1);
        } else {
            if (e(0, interfaceC0317n, f0Var)) {
                return;
            }
            interfaceC0317n.d(null, 1);
        }
    }
}
