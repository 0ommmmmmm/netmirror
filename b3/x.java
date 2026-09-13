package b3;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class x implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OutputStream f5665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f5666c;

    public x(OutputStream outputStream, G g3) {
        D2.h.f(outputStream, "out");
        D2.h.f(g3, "timeout");
        this.f5665b = outputStream;
        this.f5666c = g3;
    }

    @Override // b3.D
    public void Q(i iVar, long j3) throws IOException {
        D2.h.f(iVar, "source");
        AbstractC0301f.b(iVar.F0(), 0L, j3);
        while (j3 > 0) {
            this.f5666c.f();
            A a4 = iVar.f5628b;
            D2.h.c(a4);
            int iMin = (int) Math.min(j3, a4.f5593c - a4.f5592b);
            this.f5665b.write(a4.f5591a, a4.f5592b, iMin);
            a4.f5592b += iMin;
            long j4 = iMin;
            j3 -= j4;
            iVar.E0(iVar.F0() - j4);
            if (a4.f5592b == a4.f5593c) {
                iVar.f5628b = a4.b();
                B.b(a4);
            }
        }
    }

    @Override // b3.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5665b.close();
    }

    @Override // b3.D
    public G f() {
        return this.f5666c;
    }

    @Override // b3.D, java.io.Flushable
    public void flush() throws IOException {
        this.f5665b.flush();
    }

    public String toString() {
        return "sink(" + this.f5665b + ')';
    }
}
