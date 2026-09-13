package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f8442b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f8444d;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8445b;

        a(Runnable runnable) {
            this.f8445b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8445b.run();
            } finally {
                l.this.b();
            }
        }
    }

    public l(Executor executor) {
        this.f8444d = executor;
    }

    synchronized void b() {
        Runnable runnable = (Runnable) this.f8442b.poll();
        this.f8443c = runnable;
        if (runnable != null) {
            this.f8444d.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f8442b.offer(new a(runnable));
        if (this.f8443c == null) {
            b();
        }
    }
}
