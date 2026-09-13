package R0;

/* JADX INFO: loaded from: classes.dex */
public class x implements p001a0.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p005b0.a f1993c;

    public x(p005b0.a aVar, int i3) {
        X.k.g(aVar);
        X.k.b(Boolean.valueOf(i3 >= 0 && i3 <= ((v) aVar.P()).i()));
        this.f1993c = aVar.clone();
        this.f1992b = i3;
    }

    synchronized void a() {
        if (b()) {
            throw new a0.h.a();
        }
    }

    @Override // p001a0.h
    public synchronized boolean b() {
        return !p005b0.a.c0(this.f1993c);
    }

    @Override // p001a0.h
    public synchronized int c(int i3, byte[] bArr, int i4, int i5) {
        a();
        X.k.b(Boolean.valueOf(i3 + i5 <= this.f1992b));
        X.k.g(this.f1993c);
        return ((v) this.f1993c.P()).c(i3, bArr, i4, i5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        p005b0.a.D(this.f1993c);
        this.f1993c = null;
    }

    @Override // p001a0.h
    public synchronized byte g(int i3) {
        a();
        X.k.b(Boolean.valueOf(i3 >= 0));
        X.k.b(Boolean.valueOf(i3 < this.f1992b));
        X.k.g(this.f1993c);
        return ((v) this.f1993c.P()).g(i3);
    }

    @Override // p001a0.h
    public synchronized int size() {
        a();
        return this.f1992b;
    }
}
