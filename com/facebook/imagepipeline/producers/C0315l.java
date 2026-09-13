package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0315l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f6175b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l$a */
    private class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f0 f6176c;

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void h(Throwable th) {
            C0315l.this.f6175b.b(p(), this.f6176c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            U0.b bVarX = this.f6176c.X();
            boolean zE = AbstractC0306c.e(i3);
            boolean zC = w0.c(jVar, bVarX.r());
            if (jVar != null && (zC || bVarX.j())) {
                if (zE && zC) {
                    p().d(jVar, i3);
                } else {
                    p().d(jVar, AbstractC0306c.o(i3, 1));
                }
            }
            if (!zE || zC || bVarX.i()) {
                return;
            }
            O0.j.o(jVar);
            C0315l.this.f6175b.b(p(), this.f6176c);
        }

        private a(InterfaceC0317n interfaceC0317n, f0 f0Var) {
            super(interfaceC0317n);
            this.f6176c = f0Var;
        }
    }

    public C0315l(e0 e0Var, e0 e0Var2) {
        this.f6174a = e0Var;
        this.f6175b = e0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        this.f6174a.b(new a(interfaceC0317n, f0Var), f0Var);
    }
}
