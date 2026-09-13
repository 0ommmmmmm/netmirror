package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6172a;

    private final class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f6173c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, InterfaceC0317n interfaceC0317n) {
            super(interfaceC0317n);
            D2.h.f(interfaceC0317n, "consumer");
            this.f6173c = k0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            p005b0.a aVarV = null;
            try {
                if (O0.j.w0(jVar) && jVar != null) {
                    aVarV = jVar.v();
                }
                p().d(aVarV, i3);
            } finally {
                p005b0.a.D(aVarV);
            }
        }
    }

    public k0(e0 e0Var) {
        D2.h.f(e0Var, "inputProducer");
        this.f6172a = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        D2.h.f(interfaceC0317n, "consumer");
        D2.h.f(f0Var, "context");
        this.f6172a.b(new a(this, interfaceC0317n), f0Var);
    }
}
