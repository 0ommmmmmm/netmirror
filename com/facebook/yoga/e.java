package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f8306a;

    private e(long j3) {
        if (j3 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f8306a = j3;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f8306a, kVar.b());
    }

    @Override // com.facebook.yoga.c
    public void b(float f3) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f8306a, f3);
    }

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
