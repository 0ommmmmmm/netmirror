package p005b0;

import Y.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    c(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }

    @Override // p005b0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f5577b) {
                    super.finalize();
                    return;
                }
                Object objF = this.f5578c.f();
                a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f5578c)), objF == null ? null : objF.getClass().getName());
                this.f5578c.d();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p005b0.a
    /* JADX INFO: renamed from: y */
    public a clone() {
        return this;
    }
}
