package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class o0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6198a;

    class a extends AbstractC0323u {
        a(InterfaceC0317n interfaceC0317n) {
            super(interfaceC0317n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        protected void i(Object obj, int i3) {
            if (AbstractC0306c.e(i3)) {
                p().d(null, i3);
            }
        }
    }

    public o0(e0 e0Var) {
        this.f6198a = e0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        this.f6198a.b(new a(interfaceC0317n), f0Var);
    }
}
