package p005b0;

import X.k;
import Y.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private b(i iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f5577b) {
                    super.finalize();
                    return;
                }
                Object objF = this.f5578c.f();
                a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f5578c)), objF == null ? null : objF.getClass().getName());
                a.c cVar = this.f5579d;
                if (cVar != null) {
                    cVar.b(this.f5578c, this.f5580e);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p005b0.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a clone() {
        k.i(a0());
        return new b(this.f5578c, this.f5579d, this.f5580e != null ? new Throwable() : null);
    }

    b(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }
}
