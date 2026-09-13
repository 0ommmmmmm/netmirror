package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H0.x f6105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.k f6106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f6107c;

    public static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final R.d f6108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final H0.x f6110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f6111f;

        public a(InterfaceC0317n interfaceC0317n, R.d dVar, boolean z3, H0.x xVar, boolean z4) {
            super(interfaceC0317n);
            this.f6108c = dVar;
            this.f6109d = z3;
            this.f6110e = xVar;
            this.f6111f = z4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            if (aVar == null) {
                if (AbstractC0306c.e(i3)) {
                    p().d(null, i3);
                }
            } else if (!AbstractC0306c.f(i3) || this.f6109d) {
                p005b0.a aVarB = this.f6111f ? this.f6110e.b(this.f6108c, aVar) : null;
                try {
                    p().c(1.0f);
                    InterfaceC0317n interfaceC0317nP = p();
                    if (aVarB != null) {
                        aVar = aVarB;
                    }
                    interfaceC0317nP.d(aVar, i3);
                } finally {
                    p005b0.a.D(aVarB);
                }
            }
        }
    }

    public b0(H0.x xVar, H0.k kVar, e0 e0Var) {
        this.f6105a = xVar;
        this.f6106b = kVar;
        this.f6107c = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        h0 h0VarP = f0Var.P();
        U0.b bVarX = f0Var.X();
        Object objI = f0Var.i();
        U0.d dVarL = bVarX.l();
        if (dVarL == null || dVarL.b() == null) {
            this.f6107c.b(interfaceC0317n, f0Var);
            return;
        }
        h0VarP.g(f0Var, c());
        R.d dVarA = this.f6106b.a(bVarX, objI);
        p005b0.a aVar = f0Var.X().y(1) ? this.f6105a.get(dVarA) : null;
        if (aVar == null) {
            a aVar2 = new a(interfaceC0317n, dVarA, false, this.f6105a, f0Var.X().y(2));
            h0VarP.d(f0Var, c(), h0VarP.j(f0Var, c()) ? X.g.of("cached_value_found", "false") : null);
            this.f6107c.b(aVar2, f0Var);
        } else {
            h0VarP.d(f0Var, c(), h0VarP.j(f0Var, c()) ? X.g.of("cached_value_found", "true") : null);
            h0VarP.e(f0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            f0Var.n0("memory_bitmap", "postprocessed");
            interfaceC0317n.c(1.0f);
            interfaceC0317n.d(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
