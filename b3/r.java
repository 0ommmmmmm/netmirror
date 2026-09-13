package b3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class r implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f5657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Inflater f5658e;

    public r(k kVar, Inflater inflater) {
        D2.h.f(kVar, "source");
        D2.h.f(inflater, "inflater");
        this.f5657d = kVar;
        this.f5658e = inflater;
    }

    private final void o() {
        int i3 = this.f5655b;
        if (i3 == 0) {
            return;
        }
        int remaining = i3 - this.f5658e.getRemaining();
        this.f5655b -= remaining;
        this.f5657d.s(remaining);
    }

    public final long a(i iVar, long j3) throws IOException {
        D2.h.f(iVar, "sink");
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f5656c) {
            throw new IllegalStateException("closed");
        }
        if (j3 == 0) {
            return 0L;
        }
        try {
            A aI0 = iVar.I0(1);
            int iMin = (int) Math.min(j3, 8192 - aI0.f5593c);
            i();
            int iInflate = this.f5658e.inflate(aI0.f5591a, aI0.f5593c, iMin);
            o();
            if (iInflate > 0) {
                aI0.f5593c += iInflate;
                long j4 = iInflate;
                iVar.E0(iVar.F0() + j4);
                return j4;
            }
            if (aI0.f5592b == aI0.f5593c) {
                iVar.f5628b = aI0.b();
                B.b(aI0);
            }
            return 0L;
        } catch (DataFormatException e4) {
            throw new IOException(e4);
        }
    }

    @Override // b3.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5656c) {
            return;
        }
        this.f5658e.end();
        this.f5656c = true;
        this.f5657d.close();
    }

    @Override // b3.F
    public G f() {
        return this.f5657d.f();
    }

    public final boolean i() {
        if (!this.f5658e.needsInput()) {
            return false;
        }
        if (this.f5657d.J()) {
            return true;
        }
        A a4 = this.f5657d.e().f5628b;
        D2.h.c(a4);
        int i3 = a4.f5593c;
        int i4 = a4.f5592b;
        int i5 = i3 - i4;
        this.f5655b = i5;
        this.f5658e.setInput(a4.f5591a, i4, i5);
        return false;
    }

    @Override // b3.F
    public long x(i iVar, long j3) throws IOException {
        D2.h.f(iVar, "sink");
        do {
            long jA = a(iVar, j3);
            if (jA > 0) {
                return jA;
            }
            if (this.f5658e.finished() || this.f5658e.needsDictionary()) {
                return -1L;
            }
        } while (!this.f5657d.J());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(F f3, Inflater inflater) {
        this(t.d(f3), inflater);
        D2.h.f(f3, "source");
        D2.h.f(inflater, "inflater");
    }
}
