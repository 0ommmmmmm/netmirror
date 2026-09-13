package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0323u extends AbstractC0306c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0317n f6255b;

    public AbstractC0323u(InterfaceC0317n interfaceC0317n) {
        D2.h.f(interfaceC0317n, "consumer");
        this.f6255b = interfaceC0317n;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0306c
    protected void g() {
        this.f6255b.b();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0306c
    protected void h(Throwable th) {
        D2.h.f(th, "t");
        this.f6255b.a(th);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0306c
    protected void j(float f3) {
        this.f6255b.c(f3);
    }

    public final InterfaceC0317n p() {
        return this.f6255b;
    }
}
