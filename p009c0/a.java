package p009c0;

import X.p;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f5675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f5676i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f5678b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f5680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5681e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f5677a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f5679c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f5683g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f5682f = new ReentrantLock();

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    public enum EnumC0088a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f5683g) {
            return;
        }
        this.f5682f.lock();
        try {
            if (!this.f5683g) {
                this.f5678b = Environment.getDataDirectory();
                this.f5680d = Environment.getExternalStorageDirectory();
                g();
                this.f5683g = true;
            }
        } finally {
            this.f5682f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f5675h == null) {
                f5675h = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5675h;
    }

    private void e() {
        if (this.f5682f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f5681e > f5676i) {
                    g();
                }
            } finally {
                this.f5682f.unlock();
            }
        }
    }

    private void g() {
        this.f5677a = h(this.f5677a, this.f5678b);
        this.f5679c = h(this.f5679c, this.f5680d);
        this.f5681e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw p.a(th);
        }
    }

    public long c(EnumC0088a enumC0088a) {
        b();
        e();
        StatFs statFs = enumC0088a == EnumC0088a.INTERNAL ? this.f5677a : this.f5679c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0088a enumC0088a, long j3) {
        b();
        long jC = c(enumC0088a);
        return jC <= 0 || jC < j3;
    }
}
