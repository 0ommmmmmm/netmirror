package p005b0;

import X.k;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f5574g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f5577b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final i f5578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final c f5579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Throwable f5580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class f5573f = a.class;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h f5575h = new C0087a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f5576i = new b();

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    class C0087a implements h {
        C0087a() {
        }

        @Override // p005b0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                X.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        @Override // b0.a.c
        public boolean a() {
            return false;
        }

        @Override // b0.a.c
        public void b(i iVar, Throwable th) {
            Object objF = iVar.f();
            Y.a.G(a.f5573f, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF == null ? null : objF.getClass().getName());
        }
    }

    public interface c {
        boolean a();

        void b(i iVar, Throwable th);
    }

    protected a(i iVar, c cVar, Throwable th) {
        this.f5578c = (i) k.g(iVar);
        iVar.b();
        this.f5579d = cVar;
        this.f5580e = th;
    }

    public static a A(a aVar) {
        if (aVar != null) {
            return aVar.z();
        }
        return null;
    }

    public static void D(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static boolean c0(a aVar) {
        return aVar != null && aVar.a0();
    }

    public static a d0(Closeable closeable) {
        return n0(closeable, f5575h);
    }

    public static a e0(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return u0(closeable, f5575h, cVar, cVar.a() ? new Throwable() : null);
    }

    public static a n0(Object obj, h hVar) {
        return t0(obj, hVar, f5576i);
    }

    public static a t0(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return u0(obj, hVar, cVar, cVar.a() ? new Throwable() : null);
    }

    public static a u0(Object obj, h hVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i3 = f5574g;
            if (i3 == 1) {
                return new p005b0.c(obj, hVar, cVar, th);
            }
            if (i3 == 2) {
                return new g(obj, hVar, cVar, th);
            }
            if (i3 == 3) {
                return new e(obj);
            }
        }
        return new p005b0.b(obj, hVar, cVar, th);
    }

    public synchronized Object P() {
        k.i(!this.f5577b);
        return k.g(this.f5578c.f());
    }

    public int X() {
        if (a0()) {
            return System.identityHashCode(this.f5578c.f());
        }
        return 0;
    }

    public synchronized boolean a0() {
        return !this.f5577b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f5577b) {
                    return;
                }
                this.f5577b = true;
                this.f5578c.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract a clone();

    public synchronized a z() {
        if (!a0()) {
            return null;
        }
        return clone();
    }

    protected a(Object obj, h hVar, c cVar, Throwable th, boolean z3) {
        this.f5578c = new i(obj, hVar, z3);
        this.f5579d = cVar;
        this.f5580e = th;
    }
}
