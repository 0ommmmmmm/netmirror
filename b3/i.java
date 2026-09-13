package b3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import p075s2.AbstractC0486h;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k, j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f5628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5629c;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f5630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private A f5632d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f5634f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5633e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5635g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5636h = -1;

        public final int a() {
            long j3 = this.f5633e;
            i iVar = this.f5630b;
            D2.h.c(iVar);
            if (!(j3 != iVar.F0())) {
                throw new IllegalStateException("no more bytes");
            }
            long j4 = this.f5633e;
            return o(j4 == -1 ? 0L : j4 + ((long) (this.f5636h - this.f5635g)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f5630b != null)) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f5630b = null;
            this.f5632d = null;
            this.f5633e = -1L;
            this.f5634f = null;
            this.f5635g = -1;
            this.f5636h = -1;
        }

        public final long i(long j3) {
            i iVar = this.f5630b;
            if (iVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f5631c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long jF0 = iVar.F0();
            int i3 = 1;
            if (j3 <= jF0) {
                if (!(j3 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j3).toString());
                }
                long j4 = jF0 - j3;
                while (j4 > 0) {
                    A a4 = iVar.f5628b;
                    D2.h.c(a4);
                    A a5 = a4.f5597g;
                    D2.h.c(a5);
                    int i4 = a5.f5593c;
                    long j5 = i4 - a5.f5592b;
                    if (j5 > j4) {
                        a5.f5593c = i4 - ((int) j4);
                        break;
                    }
                    iVar.f5628b = a5.b();
                    B.b(a5);
                    j4 -= j5;
                }
                this.f5632d = null;
                this.f5633e = j3;
                this.f5634f = null;
                this.f5635g = -1;
                this.f5636h = -1;
            } else if (j3 > jF0) {
                long j6 = j3 - jF0;
                boolean z3 = true;
                while (j6 > 0) {
                    A aI0 = iVar.I0(i3);
                    int iMin = (int) Math.min(j6, 8192 - aI0.f5593c);
                    int i5 = aI0.f5593c + iMin;
                    aI0.f5593c = i5;
                    j6 -= (long) iMin;
                    if (z3) {
                        this.f5632d = aI0;
                        this.f5633e = jF0;
                        this.f5634f = aI0.f5591a;
                        this.f5635g = i5 - iMin;
                        this.f5636h = i5;
                        z3 = false;
                    }
                    i3 = 1;
                }
            }
            iVar.E0(j3);
            return jF0;
        }

        public final int o(long j3) {
            A aC;
            i iVar = this.f5630b;
            if (iVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j3 < -1 || j3 > iVar.F0()) {
                D2.u uVar = D2.u.f192a;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(iVar.F0())}, 2));
                D2.h.e(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (j3 == -1 || j3 == iVar.F0()) {
                this.f5632d = null;
                this.f5633e = j3;
                this.f5634f = null;
                this.f5635g = -1;
                this.f5636h = -1;
                return -1;
            }
            long jF0 = iVar.F0();
            A a4 = iVar.f5628b;
            A a5 = this.f5632d;
            long j4 = 0;
            if (a5 != null) {
                long j5 = this.f5633e;
                int i3 = this.f5635g;
                D2.h.c(a5);
                long j6 = j5 - ((long) (i3 - a5.f5592b));
                if (j6 > j3) {
                    aC = a4;
                    a4 = this.f5632d;
                    jF0 = j6;
                } else {
                    aC = this.f5632d;
                    j4 = j6;
                }
            } else {
                aC = a4;
            }
            if (jF0 - j3 > j3 - j4) {
                while (true) {
                    D2.h.c(aC);
                    int i4 = aC.f5593c;
                    int i5 = aC.f5592b;
                    if (j3 < ((long) (i4 - i5)) + j4) {
                        break;
                    }
                    j4 += (long) (i4 - i5);
                    aC = aC.f5596f;
                }
            } else {
                while (jF0 > j3) {
                    D2.h.c(a4);
                    a4 = a4.f5597g;
                    D2.h.c(a4);
                    jF0 -= (long) (a4.f5593c - a4.f5592b);
                }
                j4 = jF0;
                aC = a4;
            }
            if (this.f5631c) {
                D2.h.c(aC);
                if (aC.f5594d) {
                    A aF = aC.f();
                    if (iVar.f5628b == aC) {
                        iVar.f5628b = aF;
                    }
                    aC = aC.c(aF);
                    A a6 = aC.f5597g;
                    D2.h.c(a6);
                    a6.b();
                }
            }
            this.f5632d = aC;
            this.f5633e = j3;
            D2.h.c(aC);
            this.f5634f = aC.f5591a;
            int i6 = aC.f5592b + ((int) (j3 - j4));
            this.f5635g = i6;
            int i7 = aC.f5593c;
            this.f5636h = i7;
            return i7 - i6;
        }
    }

    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return i.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
            i.this.L(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            D2.h.f(bArr, "data");
            i.this.k(bArr, i3, i4);
        }
    }

    public static /* synthetic */ a y0(i iVar, a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aVar = new a();
        }
        return iVar.x0(aVar);
    }

    public final i A() {
        i iVar = new i();
        if (F0() != 0) {
            A a4 = this.f5628b;
            D2.h.c(a4);
            A aD = a4.d();
            iVar.f5628b = aD;
            aD.f5597g = aD;
            aD.f5596f = aD;
            for (A a5 = a4.f5596f; a5 != a4; a5 = a5.f5596f) {
                A a6 = aD.f5597g;
                D2.h.c(a6);
                D2.h.c(a5);
                a6.c(a5.d());
            }
            iVar.E0(F0());
        }
        return iVar;
    }

    public int A0() {
        return AbstractC0301f.c(B());
    }

    @Override // b3.k
    public int B() throws EOFException {
        if (F0() < 4) {
            throw new EOFException();
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        int i3 = a4.f5592b;
        int i4 = a4.f5593c;
        if (i4 - i3 < 4) {
            return ((r0() & 255) << 24) | ((r0() & 255) << 16) | ((r0() & 255) << 8) | (r0() & 255);
        }
        byte[] bArr = a4.f5591a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = (bArr[i5] & 255) | i6;
        E0(F0() - 4);
        if (i7 == i4) {
            this.f5628b = a4.b();
            B.b(a4);
        } else {
            a4.f5592b = i7;
        }
        return i8;
    }

    public short B0() {
        return AbstractC0301f.d(Y());
    }

    public String C0(long j3, Charset charset) throws EOFException {
        D2.h.f(charset, "charset");
        if (!(j3 >= 0 && j3 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f5629c < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        int i3 = a4.f5592b;
        if (((long) i3) + j3 > a4.f5593c) {
            return new String(M(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(a4.f5591a, i3, i4, charset);
        int i5 = a4.f5592b + i4;
        a4.f5592b = i5;
        this.f5629c -= j3;
        if (i5 == a4.f5593c) {
            this.f5628b = a4.b();
            B.b(a4);
        }
        return str;
    }

    public final i D(i iVar, long j3, long j4) {
        D2.h.f(iVar, "out");
        AbstractC0301f.b(F0(), j3, j4);
        if (j4 != 0) {
            iVar.E0(iVar.F0() + j4);
            A a4 = this.f5628b;
            while (true) {
                D2.h.c(a4);
                int i3 = a4.f5593c;
                int i4 = a4.f5592b;
                if (j3 < i3 - i4) {
                    break;
                }
                j3 -= (long) (i3 - i4);
                a4 = a4.f5596f;
            }
            while (j4 > 0) {
                D2.h.c(a4);
                A aD = a4.d();
                int i5 = aD.f5592b + ((int) j3);
                aD.f5592b = i5;
                aD.f5593c = Math.min(i5 + ((int) j4), aD.f5593c);
                A a5 = iVar.f5628b;
                if (a5 == null) {
                    aD.f5597g = aD;
                    aD.f5596f = aD;
                    iVar.f5628b = aD;
                } else {
                    D2.h.c(a5);
                    A a6 = a5.f5597g;
                    D2.h.c(a6);
                    a6.c(aD);
                }
                j4 -= (long) (aD.f5593c - aD.f5592b);
                a4 = a4.f5596f;
                j3 = 0;
            }
        }
        return this;
    }

    public String D0(long j3) throws EOFException {
        return C0(j3, K2.d.f816b);
    }

    public final void E0(long j3) {
        this.f5629c = j3;
    }

    @Override // b3.k
    public long F() throws EOFException {
        if (F0() < 8) {
            throw new EOFException();
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        int i3 = a4.f5592b;
        int i4 = a4.f5593c;
        if (i4 - i3 < 8) {
            return ((((long) B()) & 4294967295L) << 32) | (4294967295L & ((long) B()));
        }
        byte[] bArr = a4.f5591a;
        int i5 = i3 + 7;
        long j3 = ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 48) | ((((long) bArr[i3 + 2]) & 255) << 40) | ((((long) bArr[i3 + 3]) & 255) << 32) | ((((long) bArr[i3 + 4]) & 255) << 24) | ((((long) bArr[i3 + 5]) & 255) << 16) | ((((long) bArr[i3 + 6]) & 255) << 8);
        int i6 = i3 + 8;
        long j4 = j3 | (((long) bArr[i5]) & 255);
        E0(F0() - 8);
        if (i6 == i4) {
            this.f5628b = a4.b();
            B.b(a4);
        } else {
            a4.f5592b = i6;
        }
        return j4;
    }

    public final long F0() {
        return this.f5629c;
    }

    @Override // b3.k
    public String G() {
        return W(Long.MAX_VALUE);
    }

    public final l G0() {
        if (F0() <= ((long) Integer.MAX_VALUE)) {
            return H0((int) F0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + F0()).toString());
    }

    @Override // b3.k
    public byte[] H() {
        return M(F0());
    }

    public final l H0(int i3) {
        if (i3 == 0) {
            return l.f5639e;
        }
        AbstractC0301f.b(F0(), 0L, i3);
        A a4 = this.f5628b;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            D2.h.c(a4);
            int i7 = a4.f5593c;
            int i8 = a4.f5592b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            a4 = a4.f5596f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        A a5 = this.f5628b;
        int i9 = 0;
        while (i4 < i3) {
            D2.h.c(a5);
            bArr[i9] = a5.f5591a;
            i4 += a5.f5593c - a5.f5592b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = a5.f5592b;
            a5.f5594d = true;
            i9++;
            a5 = a5.f5596f;
        }
        return new C(bArr, iArr);
    }

    public final A I0(int i3) {
        if (!(i3 >= 1 && i3 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        A a4 = this.f5628b;
        if (a4 != null) {
            D2.h.c(a4);
            A a5 = a4.f5597g;
            D2.h.c(a5);
            return (a5.f5593c + i3 > 8192 || !a5.f5595e) ? a5.c(B.c()) : a5;
        }
        A aC = B.c();
        this.f5628b = aC;
        aC.f5597g = aC;
        aC.f5596f = aC;
        return aC;
    }

    @Override // b3.k
    public boolean J() {
        return this.f5629c == 0;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public i u(l lVar) {
        D2.h.f(lVar, "byteString");
        lVar.A(this, 0, lVar.v());
        return this;
    }

    @Override // b3.k
    public int K(w wVar) throws EOFException {
        D2.h.f(wVar, "options");
        int iE = c3.a.e(this, wVar, false, 2, null);
        if (iE == -1) {
            return -1;
        }
        s(wVar.e()[iE].v());
        return iE;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public i R(byte[] bArr) {
        D2.h.f(bArr, "source");
        return k(bArr, 0, bArr.length);
    }

    @Override // b3.j
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public i k(byte[] bArr, int i3, int i4) {
        D2.h.f(bArr, "source");
        long j3 = i4;
        AbstractC0301f.b(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            A aI0 = I0(1);
            int iMin = Math.min(i5 - i3, 8192 - aI0.f5593c);
            int i6 = i3 + iMin;
            AbstractC0486h.e(bArr, aI0.f5591a, aI0.f5593c, i3, i6);
            aI0.f5593c += iMin;
            i3 = i6;
        }
        E0(F0() + j3);
        return this;
    }

    @Override // b3.k
    public byte[] M(long j3) throws EOFException {
        if (!(j3 >= 0 && j3 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (F0() < j3) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j3];
        m(bArr);
        return bArr;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public i L(int i3) {
        A aI0 = I0(1);
        byte[] bArr = aI0.f5591a;
        int i4 = aI0.f5593c;
        aI0.f5593c = i4 + 1;
        bArr[i4] = (byte) i3;
        E0(F0() + 1);
        return this;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public i i0(long j3) {
        boolean z3;
        if (j3 == 0) {
            return L(48);
        }
        int i3 = 1;
        if (j3 < 0) {
            j3 = -j3;
            if (j3 < 0) {
                return h0("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j3 < 100000000) {
            if (j3 < 10000) {
                if (j3 >= 100) {
                    i3 = j3 < 1000 ? 3 : 4;
                } else if (j3 >= 10) {
                    i3 = 2;
                }
            } else if (j3 < 1000000) {
                i3 = j3 < 100000 ? 5 : 6;
            } else {
                i3 = j3 < 10000000 ? 7 : 8;
            }
        } else if (j3 < 1000000000000L) {
            if (j3 < 10000000000L) {
                i3 = j3 < 1000000000 ? 9 : 10;
            } else {
                i3 = j3 < 100000000000L ? 11 : 12;
            }
        } else if (j3 < 1000000000000000L) {
            if (j3 < 10000000000000L) {
                i3 = 13;
            } else {
                i3 = j3 < 100000000000000L ? 14 : 15;
            }
        } else if (j3 < 100000000000000000L) {
            i3 = j3 < 10000000000000000L ? 16 : 17;
        } else {
            i3 = j3 < 1000000000000000000L ? 18 : 19;
        }
        if (z3) {
            i3++;
        }
        A aI0 = I0(i3);
        byte[] bArr = aI0.f5591a;
        int i4 = aI0.f5593c + i3;
        while (j3 != 0) {
            long j4 = 10;
            i4--;
            bArr[i4] = c3.a.a()[(int) (j3 % j4)];
            j3 /= j4;
        }
        if (z3) {
            bArr[i4 - 1] = (byte) 45;
        }
        aI0.f5593c += i3;
        E0(F0() + ((long) i3));
        return this;
    }

    @Override // b3.k
    public String O() {
        return C0(this.f5629c, K2.d.f816b);
    }

    @Override // b3.j
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public i n(long j3) {
        if (j3 == 0) {
            return L(48);
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i3 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        A aI0 = I0(i3);
        byte[] bArr = aI0.f5591a;
        int i4 = aI0.f5593c;
        for (int i5 = (i4 + i3) - 1; i5 >= i4; i5--) {
            bArr[i5] = c3.a.a()[(int) (15 & j3)];
            j3 >>>= 4;
        }
        aI0.f5593c += i3;
        E0(F0() + ((long) i3));
        return this;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public i t() {
        return this;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public i E(int i3) {
        A aI0 = I0(4);
        byte[] bArr = aI0.f5591a;
        int i4 = aI0.f5593c;
        bArr[i4] = (byte) ((i3 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i3 & 255);
        aI0.f5593c = i4 + 4;
        E0(F0() + 4);
        return this;
    }

    @Override // b3.D
    public void Q(i iVar, long j3) {
        A a4;
        D2.h.f(iVar, "source");
        if (!(iVar != this)) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0301f.b(iVar.F0(), 0L, j3);
        while (j3 > 0) {
            A a5 = iVar.f5628b;
            D2.h.c(a5);
            int i3 = a5.f5593c;
            A a6 = iVar.f5628b;
            D2.h.c(a6);
            if (j3 < i3 - a6.f5592b) {
                A a7 = this.f5628b;
                if (a7 != null) {
                    D2.h.c(a7);
                    a4 = a7.f5597g;
                } else {
                    a4 = null;
                }
                if (a4 != null && a4.f5595e) {
                    if ((((long) a4.f5593c) + j3) - ((long) (a4.f5594d ? 0 : a4.f5592b)) <= 8192) {
                        A a8 = iVar.f5628b;
                        D2.h.c(a8);
                        a8.g(a4, (int) j3);
                        iVar.E0(iVar.F0() - j3);
                        E0(F0() + j3);
                        return;
                    }
                }
                A a9 = iVar.f5628b;
                D2.h.c(a9);
                iVar.f5628b = a9.e((int) j3);
            }
            A a10 = iVar.f5628b;
            D2.h.c(a10);
            long j4 = a10.f5593c - a10.f5592b;
            iVar.f5628b = a10.b();
            A a11 = this.f5628b;
            if (a11 == null) {
                this.f5628b = a10;
                a10.f5597g = a10;
                a10.f5596f = a10;
            } else {
                D2.h.c(a11);
                A a12 = a11.f5597g;
                D2.h.c(a12);
                a12.c(a10).a();
            }
            iVar.E0(iVar.F0() - j4);
            E0(F0() + j4);
            j3 -= j4;
        }
    }

    public i Q0(long j3) {
        A aI0 = I0(8);
        byte[] bArr = aI0.f5591a;
        int i3 = aI0.f5593c;
        bArr[i3] = (byte) ((j3 >>> 56) & 255);
        bArr[i3 + 1] = (byte) ((j3 >>> 48) & 255);
        bArr[i3 + 2] = (byte) ((j3 >>> 40) & 255);
        bArr[i3 + 3] = (byte) ((j3 >>> 32) & 255);
        bArr[i3 + 4] = (byte) ((j3 >>> 24) & 255);
        bArr[i3 + 5] = (byte) ((j3 >>> 16) & 255);
        bArr[i3 + 6] = (byte) ((j3 >>> 8) & 255);
        bArr[i3 + 7] = (byte) (j3 & 255);
        aI0.f5593c = i3 + 8;
        E0(F0() + 8);
        return this;
    }

    @Override // b3.j
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public i w(int i3) {
        A aI0 = I0(2);
        byte[] bArr = aI0.f5591a;
        int i4 = aI0.f5593c;
        bArr[i4] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i3 & 255);
        aI0.f5593c = i4 + 2;
        E0(F0() + 2);
        return this;
    }

    @Override // b3.k
    public long S(D d4) {
        D2.h.f(d4, "sink");
        long jF0 = F0();
        if (jF0 > 0) {
            d4.Q(this, jF0);
        }
        return jF0;
    }

    public i S0(String str, int i3, int i4, Charset charset) {
        D2.h.f(str, "string");
        D2.h.f(charset, "charset");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i3).toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i4 + " < " + i3).toString());
        }
        if (!(i4 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        if (D2.h.b(charset, K2.d.f816b)) {
            return U0(str, i3, i4);
        }
        String strSubstring = str.substring(i3, i4);
        D2.h.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strSubstring.getBytes(charset);
        D2.h.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return k(bytes, 0, bytes.length);
    }

    @Override // b3.j
    public long T(F f3) {
        D2.h.f(f3, "source");
        long j3 = 0;
        while (true) {
            long jX = f3.x(this, 8192);
            if (jX == -1) {
                return j3;
            }
            j3 += jX;
        }
    }

    @Override // b3.j
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public i h0(String str) {
        D2.h.f(str, "string");
        return U0(str, 0, str.length());
    }

    public i U0(String str, int i3, int i4) {
        D2.h.f(str, "string");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i3).toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i4 + " < " + i3).toString());
        }
        if (!(i4 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        while (i3 < i4) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                A aI0 = I0(1);
                byte[] bArr = aI0.f5591a;
                int i5 = aI0.f5593c - i3;
                int iMin = Math.min(i4, 8192 - i5);
                int i6 = i3 + 1;
                bArr[i3 + i5] = (byte) cCharAt;
                while (i6 < iMin) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i6 + i5] = (byte) cCharAt2;
                    i6++;
                }
                int i7 = aI0.f5593c;
                int i8 = (i5 + i6) - i7;
                aI0.f5593c = i7 + i8;
                E0(F0() + ((long) i8));
                i3 = i6;
            } else {
                if (cCharAt < 2048) {
                    A aI1 = I0(2);
                    byte[] bArr2 = aI1.f5591a;
                    int i9 = aI1.f5593c;
                    bArr2[i9] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((cCharAt & '?') | 128);
                    aI1.f5593c = i9 + 2;
                    E0(F0() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    A aI2 = I0(3);
                    byte[] bArr3 = aI2.f5591a;
                    int i10 = aI2.f5593c;
                    bArr3[i10] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((cCharAt & '?') | 128);
                    aI2.f5593c = i10 + 3;
                    E0(F0() + 3);
                } else {
                    int i11 = i3 + 1;
                    char cCharAt3 = i11 < i4 ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        L(63);
                        i3 = i11;
                    } else {
                        int i12 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        A aI3 = I0(4);
                        byte[] bArr4 = aI3.f5591a;
                        int i13 = aI3.f5593c;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        aI3.f5593c = i13 + 4;
                        E0(F0() + 4);
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
        return this;
    }

    @Override // b3.k
    public long V() throws EOFException {
        if (F0() == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        boolean z3 = false;
        long j3 = -7;
        long j4 = 0;
        boolean z4 = false;
        do {
            A a4 = this.f5628b;
            D2.h.c(a4);
            byte[] bArr = a4.f5591a;
            int i4 = a4.f5592b;
            int i5 = a4.f5593c;
            while (i4 < i5) {
                byte b4 = bArr[i4];
                byte b5 = (byte) 48;
                if (b4 >= b5 && b4 <= ((byte) 57)) {
                    int i6 = b5 - b4;
                    if (j4 < -922337203685477580L || (j4 == -922337203685477580L && i6 < j3)) {
                        i iVarL = new i().i0(j4).L(b4);
                        if (!z3) {
                            iVarL.r0();
                        }
                        throw new NumberFormatException("Number too large: " + iVarL.O());
                    }
                    j4 = (j4 * 10) + ((long) i6);
                } else {
                    if (b4 != ((byte) 45) || i3 != 0) {
                        if (i3 != 0) {
                            z4 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + AbstractC0301f.e(b4));
                    }
                    j3--;
                    z3 = true;
                }
                i4++;
                i3++;
            }
            if (i4 == i5) {
                this.f5628b = a4.b();
                B.b(a4);
            } else {
                a4.f5592b = i4;
            }
            if (z4) {
                break;
            }
        } while (this.f5628b != null);
        E0(F0() - ((long) i3));
        return z3 ? j4 : -j4;
    }

    public i V0(int i3) {
        if (i3 < 128) {
            L(i3);
        } else if (i3 < 2048) {
            A aI0 = I0(2);
            byte[] bArr = aI0.f5591a;
            int i4 = aI0.f5593c;
            bArr[i4] = (byte) ((i3 >> 6) | 192);
            bArr[i4 + 1] = (byte) ((i3 & 63) | 128);
            aI0.f5593c = i4 + 2;
            E0(F0() + 2);
        } else if (55296 <= i3 && 57343 >= i3) {
            L(63);
        } else if (i3 < 65536) {
            A aI1 = I0(3);
            byte[] bArr2 = aI1.f5591a;
            int i5 = aI1.f5593c;
            bArr2[i5] = (byte) ((i3 >> 12) | 224);
            bArr2[i5 + 1] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[i5 + 2] = (byte) ((i3 & 63) | 128);
            aI1.f5593c = i5 + 3;
            E0(F0() + 3);
        } else {
            if (i3 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC0301f.f(i3));
            }
            A aI2 = I0(4);
            byte[] bArr3 = aI2.f5591a;
            int i6 = aI2.f5593c;
            bArr3[i6] = (byte) ((i3 >> 18) | 240);
            bArr3[i6 + 1] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[i6 + 2] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[i6 + 3] = (byte) ((i3 & 63) | 128);
            aI2.f5593c = i6 + 4;
            E0(F0() + 4);
        }
        return this;
    }

    @Override // b3.k
    public String W(long j3) throws EOFException {
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        byte b4 = (byte) 10;
        long jC0 = c0(b4, 0L, j4);
        if (jC0 != -1) {
            return c3.a.c(this, jC0);
        }
        if (j4 < F0() && a0(j4 - 1) == ((byte) 13) && a0(j4) == b4) {
            return c3.a.c(this, j4);
        }
        i iVar = new i();
        D(iVar, 0L, Math.min(32, F0()));
        throw new EOFException("\\n not found: limit=" + Math.min(F0(), j3) + " content=" + iVar.z0().k() + (char) 8230);
    }

    @Override // b3.j
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public i U() {
        return this;
    }

    @Override // b3.k
    public short Y() throws EOFException {
        if (F0() < 2) {
            throw new EOFException();
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        int i3 = a4.f5592b;
        int i4 = a4.f5593c;
        if (i4 - i3 < 2) {
            return (short) (((r0() & 255) << 8) | (r0() & 255));
        }
        byte[] bArr = a4.f5591a;
        int i5 = i3 + 1;
        int i6 = (bArr[i3] & 255) << 8;
        int i7 = i3 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        E0(F0() - 2);
        if (i7 == i4) {
            this.f5628b = a4.b();
            B.b(a4);
        } else {
            a4.f5592b = i7;
        }
        return (short) i8;
    }

    public final byte a0(long j3) {
        AbstractC0301f.b(F0(), j3, 1L);
        A a4 = this.f5628b;
        if (a4 == null) {
            D2.h.c(null);
            throw null;
        }
        if (F0() - j3 < j3) {
            long jF0 = F0();
            while (jF0 > j3) {
                a4 = a4.f5597g;
                D2.h.c(a4);
                jF0 -= (long) (a4.f5593c - a4.f5592b);
            }
            D2.h.c(a4);
            return a4.f5591a[(int) ((((long) a4.f5592b) + j3) - jF0)];
        }
        long j4 = 0;
        while (true) {
            long j5 = ((long) (a4.f5593c - a4.f5592b)) + j4;
            if (j5 > j3) {
                D2.h.c(a4);
                return a4.f5591a[(int) ((((long) a4.f5592b) + j3) - j4)];
            }
            a4 = a4.f5596f;
            D2.h.c(a4);
            j4 = j5;
        }
    }

    public long c0(byte b4, long j3, long j4) {
        A a4;
        int i3;
        long jF0 = 0;
        if (!(0 <= j3 && j4 >= j3)) {
            throw new IllegalArgumentException(("size=" + F0() + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        if (j4 > F0()) {
            j4 = F0();
        }
        if (j3 == j4 || (a4 = this.f5628b) == null) {
            return -1L;
        }
        if (F0() - j3 < j3) {
            jF0 = F0();
            while (jF0 > j3) {
                a4 = a4.f5597g;
                D2.h.c(a4);
                jF0 -= (long) (a4.f5593c - a4.f5592b);
            }
            while (jF0 < j4) {
                byte[] bArr = a4.f5591a;
                int iMin = (int) Math.min(a4.f5593c, (((long) a4.f5592b) + j4) - jF0);
                i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
                while (i3 < iMin) {
                    if (bArr[i3] != b4) {
                        i3++;
                    }
                }
                jF0 += (long) (a4.f5593c - a4.f5592b);
                a4 = a4.f5596f;
                D2.h.c(a4);
                j3 = jF0;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (a4.f5593c - a4.f5592b)) + jF0;
            if (j5 > j3) {
                break;
            }
            a4 = a4.f5596f;
            D2.h.c(a4);
            jF0 = j5;
        }
        while (jF0 < j4) {
            byte[] bArr2 = a4.f5591a;
            int iMin2 = (int) Math.min(a4.f5593c, (((long) a4.f5592b) + j4) - jF0);
            i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
            while (i3 < iMin2) {
                if (bArr2[i3] != b4) {
                    i3++;
                }
            }
            jF0 += (long) (a4.f5593c - a4.f5592b);
            a4 = a4.f5596f;
            D2.h.c(a4);
            j3 = jF0;
        }
        return -1L;
        return ((long) (i3 - a4.f5592b)) + jF0;
    }

    @Override // b3.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public long d0(l lVar) {
        D2.h.f(lVar, "bytes");
        return e0(lVar, 0L);
    }

    @Override // b3.k, b3.j
    public i e() {
        return this;
    }

    public long e0(l lVar, long j3) {
        long j4 = j3;
        D2.h.f(lVar, "bytes");
        if (!(lVar.v() > 0)) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j5 = 0;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        A a4 = this.f5628b;
        if (a4 != null) {
            if (F0() - j4 < j4) {
                long jF0 = F0();
                while (jF0 > j4) {
                    a4 = a4.f5597g;
                    D2.h.c(a4);
                    jF0 -= (long) (a4.f5593c - a4.f5592b);
                }
                byte[] bArrL = lVar.l();
                byte b4 = bArrL[0];
                int iV = lVar.v();
                long jF1 = (F0() - ((long) iV)) + 1;
                while (jF0 < jF1) {
                    byte[] bArr = a4.f5591a;
                    long j6 = jF0;
                    int iMin = (int) Math.min(a4.f5593c, (((long) a4.f5592b) + jF1) - jF0);
                    for (int i3 = (int) ((((long) a4.f5592b) + j4) - j6); i3 < iMin; i3++) {
                        if (bArr[i3] == b4 && c3.a.b(a4, i3 + 1, bArrL, 1, iV)) {
                            return ((long) (i3 - a4.f5592b)) + j6;
                        }
                    }
                    jF0 = j6 + ((long) (a4.f5593c - a4.f5592b));
                    a4 = a4.f5596f;
                    D2.h.c(a4);
                    j4 = jF0;
                }
            } else {
                while (true) {
                    long j7 = ((long) (a4.f5593c - a4.f5592b)) + j5;
                    if (j7 > j4) {
                        break;
                    }
                    a4 = a4.f5596f;
                    D2.h.c(a4);
                    j5 = j7;
                }
                byte[] bArrL2 = lVar.l();
                byte b5 = bArrL2[0];
                int iV2 = lVar.v();
                long jF2 = (F0() - ((long) iV2)) + 1;
                while (j5 < jF2) {
                    byte[] bArr2 = a4.f5591a;
                    long j8 = jF2;
                    int iMin2 = (int) Math.min(a4.f5593c, (((long) a4.f5592b) + jF2) - j5);
                    for (int i4 = (int) ((((long) a4.f5592b) + j4) - j5); i4 < iMin2; i4++) {
                        if (bArr2[i4] == b5 && c3.a.b(a4, i4 + 1, bArrL2, 1, iV2)) {
                            return ((long) (i4 - a4.f5592b)) + j5;
                        }
                    }
                    j5 += (long) (a4.f5593c - a4.f5592b);
                    a4 = a4.f5596f;
                    D2.h.c(a4);
                    j4 = j5;
                    jF2 = j8;
                }
            }
        }
        return -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (F0() == iVar.F0()) {
                if (F0() == 0) {
                    return true;
                }
                A a4 = this.f5628b;
                D2.h.c(a4);
                A a5 = iVar.f5628b;
                D2.h.c(a5);
                int i3 = a4.f5592b;
                int i4 = a5.f5592b;
                long j3 = 0;
                while (j3 < F0()) {
                    long jMin = Math.min(a4.f5593c - i3, a5.f5593c - i4);
                    long j4 = 0;
                    while (j4 < jMin) {
                        int i5 = i3 + 1;
                        int i6 = i4 + 1;
                        if (a4.f5591a[i3] == a5.f5591a[i4]) {
                            j4++;
                            i3 = i5;
                            i4 = i6;
                        }
                    }
                    if (i3 == a4.f5593c) {
                        a4 = a4.f5596f;
                        D2.h.c(a4);
                        i3 = a4.f5592b;
                    }
                    if (i4 == a5.f5593c) {
                        a5 = a5.f5596f;
                        D2.h.c(a5);
                        i4 = a5.f5592b;
                    }
                    j3 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // b3.F
    public G f() {
        return G.f5606d;
    }

    @Override // b3.j, b3.D, java.io.Flushable
    public void flush() {
    }

    @Override // b3.k
    public void g0(long j3) throws EOFException {
        if (this.f5629c < j3) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        A a4 = this.f5628b;
        if (a4 == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = a4.f5593c;
            for (int i5 = a4.f5592b; i5 < i4; i5++) {
                i3 = (i3 * 31) + a4.f5591a[i5];
            }
            a4 = a4.f5596f;
            D2.h.c(a4);
        } while (a4 != this.f5628b);
        return i3;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // b3.k
    public void j(i iVar, long j3) throws EOFException {
        D2.h.f(iVar, "sink");
        if (F0() >= j3) {
            iVar.Q(this, j3);
        } else {
            iVar.Q(this, F0());
            throw new EOFException();
        }
    }

    @Override // b3.j
    public OutputStream j0() {
        return new c();
    }

    @Override // b3.k
    public void m(byte[] bArr) throws EOFException {
        D2.h.f(bArr, "sink");
        int i3 = 0;
        while (i3 < bArr.length) {
            int iW0 = w0(bArr, i3, bArr.length - i3);
            if (iW0 == -1) {
                throw new EOFException();
            }
            i3 += iW0;
        }
    }

    public long n0(l lVar) {
        D2.h.f(lVar, "targetBytes");
        return t0(lVar, 0L);
    }

    @Override // b3.k
    public long o0() throws EOFException {
        int i3;
        if (F0() == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z3 = false;
        long j3 = 0;
        do {
            A a4 = this.f5628b;
            D2.h.c(a4);
            byte[] bArr = a4.f5591a;
            int i5 = a4.f5592b;
            int i6 = a4.f5593c;
            while (i5 < i6) {
                byte b4 = bArr[i5];
                byte b5 = (byte) 48;
                if (b4 < b5 || b4 > ((byte) 57)) {
                    byte b6 = (byte) 97;
                    if ((b4 < b6 || b4 > ((byte) 102)) && (b4 < (b6 = (byte) 65) || b4 > ((byte) 70))) {
                        if (i4 != 0) {
                            z3 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC0301f.e(b4));
                    }
                    i3 = (b4 - b6) + 10;
                } else {
                    i3 = b4 - b5;
                }
                if (((-1152921504606846976L) & j3) != 0) {
                    throw new NumberFormatException("Number too large: " + new i().n(j3).L(b4).O());
                }
                j3 = (j3 << 4) | ((long) i3);
                i5++;
                i4++;
            }
            if (i5 == i6) {
                this.f5628b = a4.b();
                B.b(a4);
            } else {
                a4.f5592b = i5;
            }
            if (z3) {
                break;
            }
        } while (this.f5628b != null);
        E0(F0() - ((long) i4));
        return j3;
    }

    @Override // b3.k
    public l p(long j3) throws EOFException {
        if (!(j3 >= 0 && j3 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (F0() < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new l(M(j3));
        }
        l lVarH0 = H0((int) j3);
        s(j3);
        return lVarH0;
    }

    @Override // b3.k
    public String p0(Charset charset) {
        D2.h.f(charset, "charset");
        return C0(this.f5629c, charset);
    }

    @Override // b3.k
    public InputStream q0() {
        return new b();
    }

    @Override // b3.k
    public byte r0() throws EOFException {
        if (F0() == 0) {
            throw new EOFException();
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        int i3 = a4.f5592b;
        int i4 = a4.f5593c;
        int i5 = i3 + 1;
        byte b4 = a4.f5591a[i3];
        E0(F0() - 1);
        if (i5 == i4) {
            this.f5628b = a4.b();
            B.b(a4);
        } else {
            a4.f5592b = i5;
        }
        return b4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        D2.h.f(byteBuffer, "sink");
        A a4 = this.f5628b;
        if (a4 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), a4.f5593c - a4.f5592b);
        byteBuffer.put(a4.f5591a, a4.f5592b, iMin);
        int i3 = a4.f5592b + iMin;
        a4.f5592b = i3;
        this.f5629c -= (long) iMin;
        if (i3 == a4.f5593c) {
            this.f5628b = a4.b();
            B.b(a4);
        }
        return iMin;
    }

    @Override // b3.k
    public void s(long j3) throws EOFException {
        while (j3 > 0) {
            A a4 = this.f5628b;
            if (a4 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j3, a4.f5593c - a4.f5592b);
            long j4 = iMin;
            E0(F0() - j4);
            j3 -= j4;
            int i3 = a4.f5592b + iMin;
            a4.f5592b = i3;
            if (i3 == a4.f5593c) {
                this.f5628b = a4.b();
                B.b(a4);
            }
        }
    }

    public long t0(l lVar, long j3) {
        int i3;
        int i4;
        D2.h.f(lVar, "targetBytes");
        long jF0 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        A a4 = this.f5628b;
        if (a4 == null) {
            return -1L;
        }
        if (F0() - j3 < j3) {
            jF0 = F0();
            while (jF0 > j3) {
                a4 = a4.f5597g;
                D2.h.c(a4);
                jF0 -= (long) (a4.f5593c - a4.f5592b);
            }
            if (lVar.v() == 2) {
                byte bF = lVar.f(0);
                byte bF2 = lVar.f(1);
                while (jF0 < F0()) {
                    byte[] bArr = a4.f5591a;
                    i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
                    int i5 = a4.f5593c;
                    while (true) {
                        if (i3 >= i5) {
                            jF0 += (long) (a4.f5593c - a4.f5592b);
                            a4 = a4.f5596f;
                            D2.h.c(a4);
                            j3 = jF0;
                        } else {
                            byte b4 = bArr[i3];
                            if (b4 == bF || b4 == bF2) {
                                i4 = a4.f5592b;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrL = lVar.l();
            while (jF0 < F0()) {
                byte[] bArr2 = a4.f5591a;
                i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
                int i6 = a4.f5593c;
                while (true) {
                    if (i3 < i6) {
                        byte b5 = bArr2[i3];
                        int length = bArrL.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                i3++;
                            } else if (b5 == bArrL[i7]) {
                                i4 = a4.f5592b;
                            } else {
                                i7++;
                            }
                        }
                    } else {
                        jF0 += (long) (a4.f5593c - a4.f5592b);
                        a4 = a4.f5596f;
                        D2.h.c(a4);
                        j3 = jF0;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (a4.f5593c - a4.f5592b)) + jF0;
            if (j4 > j3) {
                break;
            }
            a4 = a4.f5596f;
            D2.h.c(a4);
            jF0 = j4;
        }
        if (lVar.v() == 2) {
            byte bF3 = lVar.f(0);
            byte bF4 = lVar.f(1);
            while (jF0 < F0()) {
                byte[] bArr3 = a4.f5591a;
                i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
                int i8 = a4.f5593c;
                while (true) {
                    if (i3 >= i8) {
                        jF0 += (long) (a4.f5593c - a4.f5592b);
                        a4 = a4.f5596f;
                        D2.h.c(a4);
                        j3 = jF0;
                    } else {
                        byte b6 = bArr3[i3];
                        if (b6 == bF3 || b6 == bF4) {
                            i4 = a4.f5592b;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrL2 = lVar.l();
        while (jF0 < F0()) {
            byte[] bArr4 = a4.f5591a;
            i3 = (int) ((((long) a4.f5592b) + j3) - jF0);
            int i9 = a4.f5593c;
            while (true) {
                if (i3 < i9) {
                    byte b7 = bArr4[i3];
                    int length2 = bArrL2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            i3++;
                        } else if (b7 == bArrL2[i10]) {
                            i4 = a4.f5592b;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    jF0 += (long) (a4.f5593c - a4.f5592b);
                    a4 = a4.f5596f;
                    D2.h.c(a4);
                    j3 = jF0;
                }
            }
        }
        return -1L;
        return ((long) (i3 - i4)) + jF0;
    }

    public String toString() {
        return G0().toString();
    }

    public boolean u0(long j3, l lVar) {
        D2.h.f(lVar, "bytes");
        return v0(j3, lVar, 0, lVar.v());
    }

    public final void v() throws EOFException {
        s(F0());
    }

    public boolean v0(long j3, l lVar, int i3, int i4) {
        D2.h.f(lVar, "bytes");
        if (j3 < 0 || i3 < 0 || i4 < 0 || F0() - j3 < i4 || lVar.v() - i3 < i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (a0(((long) i5) + j3) != lVar.f(i3 + i5)) {
                return false;
            }
        }
        return true;
    }

    public int w0(byte[] bArr, int i3, int i4) {
        D2.h.f(bArr, "sink");
        AbstractC0301f.b(bArr.length, i3, i4);
        A a4 = this.f5628b;
        if (a4 == null) {
            return -1;
        }
        int iMin = Math.min(i4, a4.f5593c - a4.f5592b);
        byte[] bArr2 = a4.f5591a;
        int i5 = a4.f5592b;
        AbstractC0486h.e(bArr2, bArr, i3, i5, i5 + iMin);
        a4.f5592b += iMin;
        E0(F0() - ((long) iMin));
        if (a4.f5592b != a4.f5593c) {
            return iMin;
        }
        this.f5628b = a4.b();
        B.b(a4);
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        D2.h.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i3 = iRemaining;
        while (i3 > 0) {
            A aI0 = I0(1);
            int iMin = Math.min(i3, 8192 - aI0.f5593c);
            byteBuffer.get(aI0.f5591a, aI0.f5593c, iMin);
            i3 -= iMin;
            aI0.f5593c += iMin;
        }
        this.f5629c += (long) iRemaining;
        return iRemaining;
    }

    @Override // b3.F
    public long x(i iVar, long j3) {
        D2.h.f(iVar, "sink");
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (F0() == 0) {
            return -1L;
        }
        if (j3 > F0()) {
            j3 = F0();
        }
        iVar.Q(this, j3);
        return j3;
    }

    public final a x0(a aVar) {
        D2.h.f(aVar, "unsafeCursor");
        if (!(aVar.f5630b == null)) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f5630b = this;
        aVar.f5631c = true;
        return aVar;
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public i clone() {
        return A();
    }

    public final long z() {
        long jF0 = F0();
        if (jF0 == 0) {
            return 0L;
        }
        A a4 = this.f5628b;
        D2.h.c(a4);
        A a5 = a4.f5597g;
        D2.h.c(a5);
        int i3 = a5.f5593c;
        if (i3 < 8192 && a5.f5595e) {
            jF0 -= (long) (i3 - a5.f5592b);
        }
        return jF0;
    }

    public l z0() {
        return p(F0());
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(i.this.F0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (i.this.F0() > 0) {
                return i.this.r0() & 255;
            }
            return -1;
        }

        public String toString() {
            return i.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) {
            D2.h.f(bArr, "sink");
            return i.this.w0(bArr, i3, i4);
        }
    }
}
