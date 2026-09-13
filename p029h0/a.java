package p029h0;

import X.k;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p029h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f9451a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f9454d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f9455e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f9456f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9453c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f9452b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f9457g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: h0.a$a, reason: collision with other inner class name */
    class RunnableC0129a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f9459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9460d;

        RunnableC0129a(boolean z3, e eVar, boolean z4) {
            this.f9458b = z3;
            this.f9459c = eVar;
            this.f9460d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9458b) {
                this.f9459c.c(a.this);
            } else if (this.f9460d) {
                this.f9459c.d(a.this);
            } else {
                this.f9459c.a(a.this);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f9462b;

        b(e eVar) {
            this.f9462b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9462b.b(a.this);
        }
    }

    public interface c {
    }

    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c j() {
        return null;
    }

    private void n() {
        boolean zK = k();
        boolean zX = x();
        for (Pair pair : this.f9457g) {
            m((e) pair.first, (Executor) pair.second, zK, zX);
        }
    }

    private synchronized boolean s(Throwable th, Map map) {
        if (!this.f9453c && this.f9452b == d.IN_PROGRESS) {
            this.f9452b = d.FAILURE;
            this.f9455e = th;
            this.f9451a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean u(float f3) {
        if (!this.f9453c && this.f9452b == d.IN_PROGRESS) {
            if (f3 < this.f9456f) {
                return false;
            }
            this.f9456f = f3;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
    
        i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean w(java.lang.Object r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r3.f9453c     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L32
            h0.a$d r1 = r3.f9452b     // Catch: java.lang.Throwable -> L18
            h0.a$d r2 = h0.a.d.IN_PROGRESS     // Catch: java.lang.Throwable -> L18
            if (r1 == r2) goto Ld
            goto L32
        Ld:
            if (r5 == 0) goto L1a
            h0.a$d r5 = h0.a.d.SUCCESS     // Catch: java.lang.Throwable -> L18
            r3.f9452b = r5     // Catch: java.lang.Throwable -> L18
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f9456f = r5     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L3a
        L1a:
            java.lang.Object r5 = r3.f9454d     // Catch: java.lang.Throwable -> L18
            if (r5 == r4) goto L25
            r3.f9454d = r4     // Catch: java.lang.Throwable -> L22
            r4 = r5
            goto L26
        L22:
            r4 = move-exception
            r0 = r5
            goto L3a
        L25:
            r4 = r0
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r3.i(r4)
        L2c:
            r4 = 1
            return r4
        L2e:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L3a
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L38
            r3.i(r4)
        L38:
            r4 = 0
            return r4
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            if (r0 == 0) goto L42
            r3.i(r0)
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p029h0.a.w(java.lang.Object, boolean):boolean");
    }

    private synchronized boolean x() {
        return l() && !e();
    }

    @Override // p029h0.c
    public Map a() {
        return this.f9451a;
    }

    @Override // p029h0.c
    public synchronized Object b() {
        return this.f9454d;
    }

    @Override // p029h0.c
    public boolean c() {
        return false;
    }

    @Override // p029h0.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f9453c) {
                    return false;
                }
                this.f9453c = true;
                Object obj = this.f9454d;
                this.f9454d = null;
                if (obj != null) {
                    i(obj);
                }
                if (!e()) {
                    n();
                }
                synchronized (this) {
                    this.f9457g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p029h0.c
    public synchronized boolean d() {
        return this.f9454d != null;
    }

    @Override // p029h0.c
    public synchronized boolean e() {
        return this.f9452b != d.IN_PROGRESS;
    }

    @Override // p029h0.c
    public synchronized Throwable f() {
        return this.f9455e;
    }

    @Override // p029h0.c
    public synchronized float g() {
        return this.f9456f;
    }

    @Override // p029h0.c
    public void h(e eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f9453c) {
                    return;
                }
                if (this.f9452b == d.IN_PROGRESS) {
                    this.f9457g.add(Pair.create(eVar, executor));
                }
                boolean z3 = d() || e() || x();
                if (z3) {
                    m(eVar, executor, k(), x());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void i(Object obj) {
    }

    public synchronized boolean k() {
        return this.f9452b == d.FAILURE;
    }

    public synchronized boolean l() {
        return this.f9453c;
    }

    protected void m(e eVar, Executor executor, boolean z3, boolean z4) {
        RunnableC0129a runnableC0129a = new RunnableC0129a(z3, eVar, z4);
        j();
        executor.execute(runnableC0129a);
    }

    protected void o() {
        for (Pair pair : this.f9457g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void p(Map map) {
        this.f9451a = map;
    }

    protected boolean q(Throwable th) {
        return r(th, null);
    }

    protected boolean r(Throwable th, Map map) {
        boolean zS = s(th, map);
        if (zS) {
            n();
        }
        return zS;
    }

    protected boolean t(float f3) {
        boolean zU = u(f3);
        if (zU) {
            o();
        }
        return zU;
    }

    protected boolean v(Object obj, boolean z3, Map map) {
        p(map);
        boolean zW = w(obj, z3);
        if (zW) {
            n();
        }
        return zW;
    }
}
