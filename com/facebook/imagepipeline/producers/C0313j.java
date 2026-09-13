package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0313j implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6155d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6157d;

        a(InterfaceC0317n interfaceC0317n, int i3, int i4) {
            super(interfaceC0317n);
            this.f6156c = i3;
            this.f6157d = i4;
        }

        private void q(p005b0.a aVar) {
            O0.d dVar;
            Bitmap bitmapC;
            int rowBytes;
            if (aVar == null || !aVar.a0() || (dVar = (O0.d) aVar.P()) == null || dVar.b() || !(dVar instanceof O0.e) || (bitmapC = ((O0.e) dVar).C()) == null || (rowBytes = bitmapC.getRowBytes() * bitmapC.getHeight()) < this.f6156c || rowBytes > this.f6157d) {
                return;
            }
            bitmapC.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            q(aVar);
            p().d(aVar, i3);
        }
    }

    public C0313j(e0 e0Var, int i3, int i4, boolean z3) {
        X.k.b(Boolean.valueOf(i3 <= i4));
        this.f6152a = (e0) X.k.g(e0Var);
        this.f6153b = i3;
        this.f6154c = i4;
        this.f6155d = z3;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        if (!f0Var.v() || this.f6155d) {
            this.f6152a.b(new a(interfaceC0317n, this.f6153b, this.f6154c), f0Var);
        } else {
            this.f6152a.b(interfaceC0317n, f0Var);
        }
    }
}
