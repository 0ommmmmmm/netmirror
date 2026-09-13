package com.facebook.imagepipeline.producers;

import J0.InterfaceC0169c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0326x implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.n f6272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.k f6273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f6274c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x$a */
    private static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f6275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final X.n f6276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final H0.k f6277e;

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            this.f6275c.P().g(this.f6275c, "DiskCacheWriteProducer");
            if (AbstractC0306c.f(i3) || jVar == null || AbstractC0306c.m(i3, 10) || jVar.D() == D0.c.f151d) {
                this.f6275c.P().d(this.f6275c, "DiskCacheWriteProducer", null);
                p().d(jVar, i3);
                return;
            }
            U0.b bVarX = this.f6275c.X();
            R.d dVarC = this.f6277e.c(bVarX, this.f6275c.i());
            InterfaceC0169c interfaceC0169c = (InterfaceC0169c) this.f6276d.get();
            H0.j jVarA = C0324v.a(bVarX, interfaceC0169c.c(), interfaceC0169c.a(), interfaceC0169c.b());
            if (jVarA != null) {
                jVarA.p(dVarC, jVar);
                this.f6275c.P().d(this.f6275c, "DiskCacheWriteProducer", null);
                p().d(jVar, i3);
                return;
            }
            this.f6275c.P().i(this.f6275c, "DiskCacheWriteProducer", new C0324v.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarX.c().ordinal()).toString()), null);
            p().d(jVar, i3);
        }

        private a(InterfaceC0317n interfaceC0317n, f0 f0Var, X.n nVar, H0.k kVar) {
            super(interfaceC0317n);
            this.f6275c = f0Var;
            this.f6276d = nVar;
            this.f6277e = kVar;
        }
    }

    public C0326x(X.n nVar, H0.k kVar, e0 e0Var) {
        this.f6272a = nVar;
        this.f6273b = kVar;
        this.f6274c = e0Var;
    }

    private void c(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        if (f0Var.d0().b() >= U0.b.c.DISK_CACHE.b()) {
            f0Var.n0("disk", "nil-result_write");
            interfaceC0317n.d(null, 1);
        } else {
            if (f0Var.X().y(32)) {
                interfaceC0317n = new a(interfaceC0317n, f0Var, this.f6272a, this.f6273b);
            }
            this.f6274c.b(interfaceC0317n, f0Var);
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        c(interfaceC0317n, f0Var);
    }
}
