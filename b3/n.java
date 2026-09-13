package b3;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f5647b;

    public n(D d4) {
        D2.h.f(d4, "delegate");
        this.f5647b = d4;
    }

    @Override // b3.D
    public void Q(i iVar, long j3) {
        D2.h.f(iVar, "source");
        this.f5647b.Q(iVar, j3);
    }

    @Override // b3.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5647b.close();
    }

    @Override // b3.D
    public G f() {
        return this.f5647b.f();
    }

    @Override // b3.D, java.io.Flushable
    public void flush() {
        this.f5647b.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f5647b + ')';
    }
}
