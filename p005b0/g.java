package p005b0;

import X.k;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    private g(i iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // p005b0.a
    /* JADX INFO: renamed from: y */
    public a clone() {
        k.i(a0());
        return new g(this.f5578c, this.f5579d, this.f5580e);
    }

    g(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, false);
    }
}
