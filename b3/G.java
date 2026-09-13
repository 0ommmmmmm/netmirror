package b3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5610c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f5607e = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f5606d = new a();

    public static final class a extends G {
        a() {
        }

        @Override // b3.G
        public G d(long j3) {
            return this;
        }

        @Override // b3.G
        public void f() {
        }

        @Override // b3.G
        public G g(long j3, TimeUnit timeUnit) {
            D2.h.f(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public G a() {
        this.f5608a = false;
        return this;
    }

    public G b() {
        this.f5610c = 0L;
        return this;
    }

    public long c() {
        if (this.f5608a) {
            return this.f5609b;
        }
        throw new IllegalStateException("No deadline");
    }

    public G d(long j3) {
        this.f5608a = true;
        this.f5609b = j3;
        return this;
    }

    public boolean e() {
        return this.f5608a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5608a && this.f5609b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public G g(long j3, TimeUnit timeUnit) {
        D2.h.f(timeUnit, "unit");
        if (j3 >= 0) {
            this.f5610c = timeUnit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j3).toString());
    }

    public long h() {
        return this.f5610c;
    }
}
