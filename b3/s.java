package b3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class s implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f5659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f5660c;

    public s(InputStream inputStream, G g3) {
        D2.h.f(inputStream, "input");
        D2.h.f(g3, "timeout");
        this.f5659b = inputStream;
        this.f5660c = g3;
    }

    @Override // b3.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5659b.close();
    }

    @Override // b3.F
    public G f() {
        return this.f5660c;
    }

    public String toString() {
        return "source(" + this.f5659b + ')';
    }

    @Override // b3.F
    public long x(i iVar, long j3) throws IOException {
        D2.h.f(iVar, "sink");
        if (j3 == 0) {
            return 0L;
        }
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        try {
            this.f5660c.f();
            A aI0 = iVar.I0(1);
            int i3 = this.f5659b.read(aI0.f5591a, aI0.f5593c, (int) Math.min(j3, 8192 - aI0.f5593c));
            if (i3 != -1) {
                aI0.f5593c += i3;
                long j4 = i3;
                iVar.E0(iVar.F0() + j4);
                return j4;
            }
            if (aI0.f5592b != aI0.f5593c) {
                return -1L;
            }
            iVar.f5628b = aI0.b();
            B.b(aI0);
            return -1L;
        } catch (AssertionError e4) {
            if (t.e(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }
}
