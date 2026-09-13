package com.facebook.imagepipeline.memory;

import X.k;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
class h extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedList f5943f;

    public h(int i3, int i4, int i5) {
        super(i3, i4, i5, false);
        this.f5943f = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(Object obj) {
        p005b0.f fVar = (p005b0.f) this.f5943f.poll();
        if (fVar == null) {
            fVar = new p005b0.f();
        }
        fVar.c(obj);
        this.f5932c.add(fVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public Object g() {
        p005b0.f fVar = (p005b0.f) this.f5932c.poll();
        k.g(fVar);
        Object objB = fVar.b();
        fVar.a();
        this.f5943f.add(fVar);
        return objB;
    }
}
