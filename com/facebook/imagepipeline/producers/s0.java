package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6246b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f6249e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f6248d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6247c = 0;

    private class a extends AbstractC0323u {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s0$a$a, reason: collision with other inner class name */
        class RunnableC0097a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pair f6251b;

            RunnableC0097a(Pair pair) {
                this.f6251b = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                s0 s0Var = s0.this;
                Pair pair = this.f6251b;
                s0Var.g((InterfaceC0317n) pair.first, (f0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (s0.this) {
                try {
                    pair = (Pair) s0.this.f6248d.poll();
                    if (pair == null) {
                        s0.this.f6247c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                s0.this.f6249e.execute(new RunnableC0097a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void g() {
            p().b();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void h(Throwable th) {
            p().a(th);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        protected void i(Object obj, int i3) {
            p().d(obj, i3);
            if (AbstractC0306c.e(i3)) {
                q();
            }
        }

        private a(InterfaceC0317n interfaceC0317n) {
            super(interfaceC0317n);
        }
    }

    public s0(int i3, Executor executor, e0 e0Var) {
        this.f6246b = i3;
        this.f6249e = (Executor) X.k.g(executor);
        this.f6245a = (e0) X.k.g(e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        boolean z3;
        f0Var.P().g(f0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i3 = this.f6247c;
                z3 = true;
                if (i3 >= this.f6246b) {
                    this.f6248d.add(Pair.create(interfaceC0317n, f0Var));
                } else {
                    this.f6247c = i3 + 1;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        g(interfaceC0317n, f0Var);
    }

    void g(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        f0Var.P().d(f0Var, "ThrottlingProducer", null);
        this.f6245a.b(new a(interfaceC0317n), f0Var);
    }
}
