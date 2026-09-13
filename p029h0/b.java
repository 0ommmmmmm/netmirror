package p029h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {
    @Override // p029h0.e
    public void a(c cVar) {
        boolean zE = cVar.e();
        try {
            f(cVar);
        } finally {
            if (zE) {
                cVar.close();
            }
        }
    }

    @Override // p029h0.e
    public void b(c cVar) {
    }

    @Override // p029h0.e
    public void c(c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    @Override // p029h0.e
    public void d(c cVar) {
    }

    protected abstract void e(c cVar);

    protected abstract void f(c cVar);
}
