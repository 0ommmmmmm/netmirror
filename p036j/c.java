package p036j;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f9535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f9536d = new Executor() { // from class: j.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f9537e = new Executor() { // from class: j.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f9538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f9539b;

    private c() {
        d dVar = new d();
        this.f9539b = dVar;
        this.f9538a = dVar;
    }

    public static c f() {
        if (f9535c != null) {
            return f9535c;
        }
        synchronized (c.class) {
            try {
                if (f9535c == null) {
                    f9535c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9535c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // p036j.e
    public void a(Runnable runnable) {
        this.f9538a.a(runnable);
    }

    @Override // p036j.e
    public boolean b() {
        return this.f9538a.b();
    }

    @Override // p036j.e
    public void c(Runnable runnable) {
        this.f9538a.c(runnable);
    }
}
