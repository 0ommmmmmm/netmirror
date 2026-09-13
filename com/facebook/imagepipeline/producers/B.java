package com.facebook.imagepipeline.producers;

import H0.C0166d;
import J0.InterfaceC0169c;

/* JADX INFO: loaded from: classes.dex */
public class B implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.n f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.k f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f5967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0166d f5968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0166d f5969e;

    private static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f5970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final X.n f5971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final H0.k f5972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C0166d f5973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C0166d f5974g;

        public a(InterfaceC0317n interfaceC0317n, f0 f0Var, X.n nVar, H0.k kVar, C0166d c0166d, C0166d c0166d2) {
            super(interfaceC0317n);
            this.f5970c = f0Var;
            this.f5971d = nVar;
            this.f5972e = kVar;
            this.f5973f = c0166d;
            this.f5974g = c0166d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            boolean zD;
            try {
                if (V0.b.d()) {
                    V0.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC0306c.f(i3) && jVar != null && !AbstractC0306c.m(i3, 10) && jVar.D() != D0.c.f151d) {
                    U0.b bVarX = this.f5970c.X();
                    R.d dVarC = this.f5972e.c(bVarX, this.f5970c.i());
                    this.f5973f.a(dVarC);
                    if ("memory_encoded".equals(this.f5970c.y("origin"))) {
                        if (!this.f5974g.b(dVarC)) {
                            boolean z3 = bVarX.c() == U0.b.EnumC0034b.SMALL;
                            InterfaceC0169c interfaceC0169c = (InterfaceC0169c) this.f5971d.get();
                            (z3 ? interfaceC0169c.c() : interfaceC0169c.a()).f(dVarC);
                            this.f5974g.a(dVarC);
                        }
                    } else if ("disk".equals(this.f5970c.y("origin"))) {
                        this.f5974g.a(dVarC);
                    }
                    p().d(jVar, i3);
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                p().d(jVar, i3);
            } finally {
                if (V0.b.d()) {
                    V0.b.b();
                }
            }
        }
    }

    public B(X.n nVar, H0.k kVar, C0166d c0166d, C0166d c0166d2, e0 e0Var) {
        this.f5965a = nVar;
        this.f5966b = kVar;
        this.f5968d = c0166d;
        this.f5969e = c0166d2;
        this.f5967c = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        try {
            if (V0.b.d()) {
                V0.b.a("EncodedProbeProducer#produceResults");
            }
            h0 h0VarP = f0Var.P();
            h0VarP.g(f0Var, c());
            a aVar = new a(interfaceC0317n, f0Var, this.f5965a, this.f5966b, this.f5968d, this.f5969e);
            h0VarP.d(f0Var, "EncodedProbeProducer", null);
            if (V0.b.d()) {
                V0.b.a("mInputProducer.produceResult");
            }
            this.f5967c.b(aVar, f0Var);
            if (V0.b.d()) {
                V0.b.b();
            }
        } finally {
            if (V0.b.d()) {
                V0.b.b();
            }
        }
    }

    protected String c() {
        return "EncodedProbeProducer";
    }
}
