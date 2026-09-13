package b3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0302g extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f5617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f5618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static C0302g f5619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f5620l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0302g f5622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5623h;

    /* JADX INFO: renamed from: b3.g$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C0302g c0302g) {
            synchronized (C0302g.class) {
                for (C0302g c0302g2 = C0302g.f5619k; c0302g2 != null; c0302g2 = c0302g2.f5622g) {
                    if (c0302g2.f5622g == c0302g) {
                        c0302g2.f5622g = c0302g.f5622g;
                        c0302g.f5622g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(C0302g c0302g, long j3, boolean z3) {
            synchronized (C0302g.class) {
                try {
                    if (C0302g.f5619k == null) {
                        C0302g.f5619k = new C0302g();
                        new b().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j3 != 0 && z3) {
                        c0302g.f5623h = Math.min(j3, c0302g.c() - jNanoTime) + jNanoTime;
                    } else if (j3 != 0) {
                        c0302g.f5623h = j3 + jNanoTime;
                    } else {
                        if (!z3) {
                            throw new AssertionError();
                        }
                        c0302g.f5623h = c0302g.c();
                    }
                    long jU = c0302g.u(jNanoTime);
                    C0302g c0302g2 = C0302g.f5619k;
                    D2.h.c(c0302g2);
                    while (c0302g2.f5622g != null) {
                        C0302g c0302g3 = c0302g2.f5622g;
                        D2.h.c(c0302g3);
                        if (jU < c0302g3.u(jNanoTime)) {
                            break;
                        }
                        c0302g2 = c0302g2.f5622g;
                        D2.h.c(c0302g2);
                    }
                    c0302g.f5622g = c0302g2.f5622g;
                    c0302g2.f5622g = c0302g;
                    if (c0302g2 == C0302g.f5619k) {
                        C0302g.class.notify();
                    }
                    p071r2.r rVar = p071r2.r.f10603a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C0302g c() throws InterruptedException {
            C0302g c0302g = C0302g.f5619k;
            D2.h.c(c0302g);
            C0302g c0302g2 = c0302g.f5622g;
            if (c0302g2 == null) {
                long jNanoTime = System.nanoTime();
                C0302g.class.wait(C0302g.f5617i);
                C0302g c0302g3 = C0302g.f5619k;
                D2.h.c(c0302g3);
                if (c0302g3.f5622g != null || System.nanoTime() - jNanoTime < C0302g.f5618j) {
                    return null;
                }
                return C0302g.f5619k;
            }
            long jU = c0302g2.u(System.nanoTime());
            if (jU > 0) {
                long j3 = jU / 1000000;
                C0302g.class.wait(j3, (int) (jU - (1000000 * j3)));
                return null;
            }
            C0302g c0302g4 = C0302g.f5619k;
            D2.h.c(c0302g4);
            c0302g4.f5622g = c0302g2.f5622g;
            c0302g2.f5622g = null;
            return c0302g2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: b3.g$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C0302g c0302gC;
            while (true) {
                try {
                    synchronized (C0302g.class) {
                        c0302gC = C0302g.f5620l.c();
                        if (c0302gC == C0302g.f5619k) {
                            C0302g.f5619k = null;
                            return;
                        }
                        p071r2.r rVar = p071r2.r.f10603a;
                    }
                    if (c0302gC != null) {
                        c0302gC.x();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b3.g$c */
    public static final class c implements D {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f5625c;

        c(D d4) {
            this.f5625c = d4;
        }

        @Override // b3.D
        public void Q(i iVar, long j3) throws IOException {
            D2.h.f(iVar, "source");
            AbstractC0301f.b(iVar.F0(), 0L, j3);
            while (true) {
                long j4 = 0;
                if (j3 <= 0) {
                    return;
                }
                A a4 = iVar.f5628b;
                D2.h.c(a4);
                while (j4 < 65536) {
                    j4 += (long) (a4.f5593c - a4.f5592b);
                    if (j4 >= j3) {
                        j4 = j3;
                        break;
                    } else {
                        a4 = a4.f5596f;
                        D2.h.c(a4);
                    }
                }
                C0302g c0302g = C0302g.this;
                c0302g.r();
                try {
                    try {
                        this.f5625c.Q(iVar, j4);
                        p071r2.r rVar = p071r2.r.f10603a;
                        if (c0302g.s()) {
                            throw c0302g.m(null);
                        }
                        j3 -= j4;
                    } catch (IOException e4) {
                        if (!c0302g.s()) {
                            throw e4;
                        }
                        throw c0302g.m(e4);
                    }
                } catch (Throwable th) {
                    c0302g.s();
                    throw th;
                }
            }
        }

        @Override // b3.D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0302g f() {
            return C0302g.this;
        }

        @Override // b3.D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0302g c0302g = C0302g.this;
            c0302g.r();
            try {
                try {
                    this.f5625c.close();
                    p071r2.r rVar = p071r2.r.f10603a;
                    if (c0302g.s()) {
                        throw c0302g.m(null);
                    }
                } catch (IOException e4) {
                    if (!c0302g.s()) {
                        throw e4;
                    }
                    throw c0302g.m(e4);
                }
            } catch (Throwable th) {
                c0302g.s();
                throw th;
            }
        }

        @Override // b3.D, java.io.Flushable
        public void flush() throws IOException {
            C0302g c0302g = C0302g.this;
            c0302g.r();
            try {
                try {
                    this.f5625c.flush();
                    p071r2.r rVar = p071r2.r.f10603a;
                    if (c0302g.s()) {
                        throw c0302g.m(null);
                    }
                } catch (IOException e4) {
                    if (!c0302g.s()) {
                        throw e4;
                    }
                    throw c0302g.m(e4);
                }
            } catch (Throwable th) {
                c0302g.s();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f5625c + ')';
        }
    }

    /* JADX INFO: renamed from: b3.g$d */
    public static final class d implements F {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ F f5627c;

        d(F f3) {
            this.f5627c = f3;
        }

        @Override // b3.F
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0302g f() {
            return C0302g.this;
        }

        @Override // b3.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0302g c0302g = C0302g.this;
            c0302g.r();
            try {
                try {
                    this.f5627c.close();
                    p071r2.r rVar = p071r2.r.f10603a;
                    if (c0302g.s()) {
                        throw c0302g.m(null);
                    }
                } catch (IOException e4) {
                    if (!c0302g.s()) {
                        throw e4;
                    }
                    throw c0302g.m(e4);
                }
            } catch (Throwable th) {
                c0302g.s();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f5627c + ')';
        }

        @Override // b3.F
        public long x(i iVar, long j3) throws IOException {
            D2.h.f(iVar, "sink");
            C0302g c0302g = C0302g.this;
            c0302g.r();
            try {
                try {
                    long jX = this.f5627c.x(iVar, j3);
                    if (c0302g.s()) {
                        throw c0302g.m(null);
                    }
                    return jX;
                } catch (IOException e4) {
                    if (c0302g.s()) {
                        throw c0302g.m(e4);
                    }
                    throw e4;
                }
            } catch (Throwable th) {
                c0302g.s();
                throw th;
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5617i = millis;
        f5618j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j3) {
        return this.f5623h - j3;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (this.f5621f) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            this.f5621f = true;
            f5620l.e(this, jH, zE);
        }
    }

    public final boolean s() {
        if (!this.f5621f) {
            return false;
        }
        this.f5621f = false;
        return f5620l.d(this);
    }

    protected IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final D v(D d4) {
        D2.h.f(d4, "sink");
        return new c(d4);
    }

    public final F w(F f3) {
        D2.h.f(f3, "source");
        return new d(f3);
    }

    protected void x() {
    }
}
