package com.facebook.imagepipeline.producers;

import H0.C0166d;
import J0.InterfaceC0169c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0314k implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H0.x f6160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X.n f6161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H0.k f6162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f6163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0166d f6164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0166d f6165f;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k$a */
    private static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f6166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final H0.x f6167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final X.n f6168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final H0.k f6169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C0166d f6170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C0166d f6171h;

        public a(InterfaceC0317n interfaceC0317n, f0 f0Var, H0.x xVar, X.n nVar, H0.k kVar, C0166d c0166d, C0166d c0166d2) {
            super(interfaceC0317n);
            this.f6166c = f0Var;
            this.f6167d = xVar;
            this.f6168e = nVar;
            this.f6169f = kVar;
            this.f6170g = c0166d;
            this.f6171h = c0166d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            boolean zD;
            try {
                if (V0.b.d()) {
                    V0.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC0306c.f(i3) && aVar != null && !AbstractC0306c.m(i3, 8)) {
                    U0.b bVarX = this.f6166c.X();
                    R.d dVarC = this.f6169f.c(bVarX, this.f6166c.i());
                    String str = (String) this.f6166c.y("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f6166c.e0().G().D() && !this.f6170g.b(dVarC)) {
                            this.f6167d.c(dVarC);
                            this.f6170g.a(dVarC);
                        }
                        if (this.f6166c.e0().G().B() && !this.f6171h.b(dVarC)) {
                            boolean z3 = bVarX.c() == U0.b.EnumC0034b.SMALL;
                            InterfaceC0169c interfaceC0169c = (InterfaceC0169c) this.f6168e.get();
                            (z3 ? interfaceC0169c.c() : interfaceC0169c.a()).f(dVarC);
                            this.f6171h.a(dVarC);
                        }
                    }
                    p().d(aVar, i3);
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                p().d(aVar, i3);
            } finally {
                if (V0.b.d()) {
                    V0.b.b();
                }
            }
        }
    }

    public C0314k(H0.x xVar, X.n nVar, H0.k kVar, C0166d c0166d, C0166d c0166d2, e0 e0Var) {
        this.f6160a = xVar;
        this.f6161b = nVar;
        this.f6162c = kVar;
        this.f6164e = c0166d;
        this.f6165f = c0166d2;
        this.f6163d = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        try {
            if (V0.b.d()) {
                V0.b.a("BitmapProbeProducer#produceResults");
            }
            h0 h0VarP = f0Var.P();
            h0VarP.g(f0Var, c());
            a aVar = new a(interfaceC0317n, f0Var, this.f6160a, this.f6161b, this.f6162c, this.f6164e, this.f6165f);
            h0VarP.d(f0Var, "BitmapProbeProducer", null);
            if (V0.b.d()) {
                V0.b.a("mInputProducer.produceResult");
            }
            this.f6163d.b(aVar, f0Var);
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
        return "BitmapProbeProducer";
    }
}
