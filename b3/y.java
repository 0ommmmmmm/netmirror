package b3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class y implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f5669d;

    public y(D d4) {
        D2.h.f(d4, "sink");
        this.f5669d = d4;
        this.f5667b = new i();
    }

    @Override // b3.j
    public j E(int i3) {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.E(i3);
        return U();
    }

    @Override // b3.j
    public j L(int i3) {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.L(i3);
        return U();
    }

    @Override // b3.D
    public void Q(i iVar, long j3) {
        D2.h.f(iVar, "source");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.Q(iVar, j3);
        U();
    }

    @Override // b3.j
    public j R(byte[] bArr) {
        D2.h.f(bArr, "source");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.R(bArr);
        return U();
    }

    @Override // b3.j
    public long T(F f3) {
        D2.h.f(f3, "source");
        long j3 = 0;
        while (true) {
            long jX = f3.x(this.f5667b, 8192);
            if (jX == -1) {
                return j3;
            }
            j3 += jX;
            U();
        }
    }

    @Override // b3.j
    public j U() {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        long jZ = this.f5667b.z();
        if (jZ > 0) {
            this.f5669d.Q(this.f5667b, jZ);
        }
        return this;
    }

    @Override // b3.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f5668c) {
            return;
        }
        if (this.f5667b.F0() > 0) {
            D d4 = this.f5669d;
            i iVar = this.f5667b;
            d4.Q(iVar, iVar.F0());
        }
        th = null;
        try {
            this.f5669d.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f5668c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // b3.j
    public i e() {
        return this.f5667b;
    }

    @Override // b3.D
    public G f() {
        return this.f5669d.f();
    }

    @Override // b3.j, b3.D, java.io.Flushable
    public void flush() {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        if (this.f5667b.F0() > 0) {
            D d4 = this.f5669d;
            i iVar = this.f5667b;
            d4.Q(iVar, iVar.F0());
        }
        this.f5669d.flush();
    }

    @Override // b3.j
    public j h0(String str) {
        D2.h.f(str, "string");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.h0(str);
        return U();
    }

    @Override // b3.j
    public j i0(long j3) {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.i0(j3);
        return U();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f5668c;
    }

    @Override // b3.j
    public OutputStream j0() {
        return new a();
    }

    @Override // b3.j
    public j k(byte[] bArr, int i3, int i4) {
        D2.h.f(bArr, "source");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.k(bArr, i3, i4);
        return U();
    }

    @Override // b3.j
    public j n(long j3) {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.n(j3);
        return U();
    }

    @Override // b3.j
    public j t() {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        long jF0 = this.f5667b.F0();
        if (jF0 > 0) {
            this.f5669d.Q(this.f5667b, jF0);
        }
        return this;
    }

    public String toString() {
        return "buffer(" + this.f5669d + ')';
    }

    @Override // b3.j
    public j u(l lVar) {
        D2.h.f(lVar, "byteString");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.u(lVar);
        return U();
    }

    @Override // b3.j
    public j w(int i3) {
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        this.f5667b.w(i3);
        return U();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        D2.h.f(byteBuffer, "source");
        if (this.f5668c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f5667b.write(byteBuffer);
        U();
        return iWrite;
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            y.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            y yVar = y.this;
            if (yVar.f5668c) {
                return;
            }
            yVar.flush();
        }

        public String toString() {
            return y.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            y yVar = y.this;
            if (yVar.f5668c) {
                throw new IOException("closed");
            }
            yVar.f5667b.L((byte) i3);
            y.this.U();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) throws IOException {
            D2.h.f(bArr, "data");
            y yVar = y.this;
            if (!yVar.f5668c) {
                yVar.f5667b.k(bArr, i3, i4);
                y.this.U();
                return;
            }
            throw new IOException("closed");
        }
    }
}
