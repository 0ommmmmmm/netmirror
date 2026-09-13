package p061p0;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f10284a;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0140a {
        void release();
    }

    public static synchronized a b() {
        try {
            if (f10284a == null) {
                f10284a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10284a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0140a interfaceC0140a);

    public abstract void d(InterfaceC0140a interfaceC0140a);
}
