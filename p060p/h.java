package p060p;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10276b;

        /* JADX INFO: renamed from: p.h$a$a, reason: collision with other inner class name */
        private static class C0139a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f10277b;

            C0139a(Runnable runnable, String str, int i3) {
                super(runnable, str);
                this.f10277b = i3;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f10277b);
                super.run();
            }
        }

        a(String str, int i3) {
            this.f10275a = str;
            this.f10276b = i3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0139a(runnable, this.f10275a, this.f10276b);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Callable f10278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p064q.a f10279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f10280d;

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p064q.a f10281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f10282c;

            a(p064q.a aVar, Object obj) {
                this.f10281b = aVar;
                this.f10282c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f10281b.a(this.f10282c);
            }
        }

        b(Handler handler, Callable callable, p064q.a aVar) {
            this.f10278b = callable;
            this.f10279c = aVar;
            this.f10280d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f10278b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f10280d.post(new a(this.f10279c, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i3, int i4) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i4, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, p064q.a aVar) {
        executor.execute(new b(p060p.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i3) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i3, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
