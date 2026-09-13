package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class A implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H0.x f5958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.k f5959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f5960c;

    private static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final H0.x f5961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final R.d f5962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f5963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f5964f;

        public a(InterfaceC0317n interfaceC0317n, H0.x xVar, R.d dVar, boolean z3, boolean z4) {
            super(interfaceC0317n);
            this.f5961c = xVar;
            this.f5962d = dVar;
            this.f5963e = z3;
            this.f5964f = z4;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            try {
                if (V0.b.d()) {
                    V0.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC0306c.f(i3) && jVar != null && !AbstractC0306c.m(i3, 10) && jVar.D() != D0.c.f151d) {
                    p005b0.a aVarV = jVar.v();
                    if (aVarV != null) {
                        try {
                            p005b0.a aVarB = (this.f5964f && this.f5963e) ? this.f5961c.b(this.f5962d, aVarV) : null;
                            p005b0.a.D(aVarV);
                            if (aVarB != null) {
                                try {
                                    O0.j jVar2 = new O0.j(aVarB);
                                    jVar2.q(jVar);
                                    p005b0.a.D(aVarB);
                                    try {
                                        p().c(1.0f);
                                        p().d(jVar2, i3);
                                        O0.j.o(jVar2);
                                        if (V0.b.d()) {
                                            V0.b.b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        O0.j.o(jVar2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    p005b0.a.D(aVarB);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            p005b0.a.D(aVarV);
                            throw th3;
                        }
                    }
                    p().d(jVar, i3);
                    if (V0.b.d()) {
                        V0.b.b();
                        return;
                    }
                    return;
                }
                p().d(jVar, i3);
                if (V0.b.d()) {
                    V0.b.b();
                }
            } catch (Throwable th4) {
                if (V0.b.d()) {
                    V0.b.b();
                }
                throw th4;
            }
        }
    }

    public A(H0.x xVar, H0.k kVar, e0 e0Var) {
        this.f5958a = xVar;
        this.f5959b = kVar;
        this.f5960c = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        try {
            if (V0.b.d()) {
                V0.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            h0 h0VarP = f0Var.P();
            h0VarP.g(f0Var, "EncodedMemoryCacheProducer");
            R.d dVarC = this.f5959b.c(f0Var.X(), f0Var.i());
            p005b0.a aVar = f0Var.X().y(4) ? this.f5958a.get(dVarC) : null;
            try {
                if (aVar != null) {
                    O0.j jVar = new O0.j(aVar);
                    try {
                        h0VarP.d(f0Var, "EncodedMemoryCacheProducer", h0VarP.j(f0Var, "EncodedMemoryCacheProducer") ? X.g.of("cached_value_found", "true") : null);
                        h0VarP.e(f0Var, "EncodedMemoryCacheProducer", true);
                        f0Var.D("memory_encoded");
                        interfaceC0317n.c(1.0f);
                        interfaceC0317n.d(jVar, 1);
                        O0.j.o(jVar);
                        p005b0.a.D(aVar);
                        if (V0.b.d()) {
                            V0.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        O0.j.o(jVar);
                        throw th;
                    }
                }
                if (f0Var.d0().b() < U0.b.c.ENCODED_MEMORY_CACHE.b()) {
                    a aVar2 = new a(interfaceC0317n, this.f5958a, dVarC, f0Var.X().y(8), f0Var.e0().G().C());
                    h0VarP.d(f0Var, "EncodedMemoryCacheProducer", h0VarP.j(f0Var, "EncodedMemoryCacheProducer") ? X.g.of("cached_value_found", "false") : null);
                    this.f5960c.b(aVar2, f0Var);
                    p005b0.a.D(aVar);
                    if (V0.b.d()) {
                        V0.b.b();
                        return;
                    }
                    return;
                }
                h0VarP.d(f0Var, "EncodedMemoryCacheProducer", h0VarP.j(f0Var, "EncodedMemoryCacheProducer") ? X.g.of("cached_value_found", "false") : null);
                h0VarP.e(f0Var, "EncodedMemoryCacheProducer", false);
                f0Var.n0("memory_encoded", "nil-result");
                interfaceC0317n.d(null, 1);
                p005b0.a.D(aVar);
                if (V0.b.d()) {
                    V0.b.b();
                }
            } catch (Throwable th2) {
                p005b0.a.D(aVar);
                throw th2;
            }
        } catch (Throwable th3) {
            if (V0.b.d()) {
                V0.b.b();
            }
            throw th3;
        }
    }
}
