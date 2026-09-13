package b3;

import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes.dex */
public final class m implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f5645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Deflater f5646d;

    public m(j jVar, Deflater deflater) {
        D2.h.f(jVar, "sink");
        D2.h.f(deflater, "deflater");
        this.f5645c = jVar;
        this.f5646d = deflater;
    }

    private final void a(boolean z3) {
        A aI0;
        int iDeflate;
        i iVarE = this.f5645c.e();
        while (true) {
            aI0 = iVarE.I0(1);
            if (z3) {
                Deflater deflater = this.f5646d;
                byte[] bArr = aI0.f5591a;
                int i3 = aI0.f5593c;
                iDeflate = deflater.deflate(bArr, i3, 8192 - i3, 2);
            } else {
                Deflater deflater2 = this.f5646d;
                byte[] bArr2 = aI0.f5591a;
                int i4 = aI0.f5593c;
                iDeflate = deflater2.deflate(bArr2, i4, 8192 - i4);
            }
            if (iDeflate > 0) {
                aI0.f5593c += iDeflate;
                iVarE.E0(iVarE.F0() + ((long) iDeflate));
                this.f5645c.U();
            } else if (this.f5646d.needsInput()) {
                break;
            }
        }
        if (aI0.f5592b == aI0.f5593c) {
            iVarE.f5628b = aI0.b();
            B.b(aI0);
        }
    }

    @Override // b3.D
    public void Q(i iVar, long j3) {
        D2.h.f(iVar, "source");
        AbstractC0301f.b(iVar.F0(), 0L, j3);
        while (j3 > 0) {
            A a4 = iVar.f5628b;
            D2.h.c(a4);
            int iMin = (int) Math.min(j3, a4.f5593c - a4.f5592b);
            this.f5646d.setInput(a4.f5591a, a4.f5592b, iMin);
            a(false);
            long j4 = iMin;
            iVar.E0(iVar.F0() - j4);
            int i3 = a4.f5592b + iMin;
            a4.f5592b = i3;
            if (i3 == a4.f5593c) {
                iVar.f5628b = a4.b();
                B.b(a4);
            }
            j3 -= j4;
        }
    }

    @Override // b3.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f5644b) {
            return;
        }
        i();
        th = null;
        try {
            this.f5646d.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f5645c.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5644b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // b3.D
    public G f() {
        return this.f5645c.f();
    }

    @Override // b3.D, java.io.Flushable
    public void flush() {
        a(true);
        this.f5645c.flush();
    }

    public final void i() {
        this.f5646d.finish();
        a(false);
    }

    public String toString() {
        return "DeflaterSink(" + this.f5645c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(D d4, Deflater deflater) {
        this(t.c(d4), deflater);
        D2.h.f(d4, "sink");
        D2.h.f(deflater, "deflater");
    }
}
