package b3;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f5648b;

    public o(F f3) {
        D2.h.f(f3, "delegate");
        this.f5648b = f3;
    }

    public final F a() {
        return this.f5648b;
    }

    @Override // b3.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5648b.close();
    }

    @Override // b3.F
    public G f() {
        return this.f5648b.f();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f5648b + ')';
    }

    @Override // b3.F
    public long x(i iVar, long j3) {
        D2.h.f(iVar, "sink");
        return this.f5648b.x(iVar, j3);
    }
}
