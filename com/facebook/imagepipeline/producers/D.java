package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0317n f5976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f5977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5978c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private I0.b f5980e;

    public D(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        this.f5976a = interfaceC0317n;
        this.f5977b = f0Var;
    }

    public InterfaceC0317n a() {
        return this.f5976a;
    }

    public f0 b() {
        return this.f5977b;
    }

    public long c() {
        return this.f5978c;
    }

    public h0 d() {
        return this.f5977b.P();
    }

    public int e() {
        return this.f5979d;
    }

    public I0.b f() {
        return this.f5980e;
    }

    public Uri g() {
        return this.f5977b.X().v();
    }

    public void h(long j3) {
        this.f5978c = j3;
    }

    public void i(int i3) {
        this.f5979d = i3;
    }

    public void j(I0.b bVar) {
        this.f5980e = bVar;
    }
}
