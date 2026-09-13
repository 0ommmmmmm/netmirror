package p005b0;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SoftReference f5581a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SoftReference f5582b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SoftReference f5583c = null;

    public void a() {
        SoftReference softReference = this.f5581a;
        if (softReference != null) {
            softReference.clear();
            this.f5581a = null;
        }
        SoftReference softReference2 = this.f5582b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f5582b = null;
        }
        SoftReference softReference3 = this.f5583c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f5583c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f5581a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f5581a = new SoftReference(obj);
        this.f5582b = new SoftReference(obj);
        this.f5583c = new SoftReference(obj);
    }
}
