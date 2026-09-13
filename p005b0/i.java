package p005b0;

import X.k;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f5584d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f5587c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(Object obj, h hVar, boolean z3) {
        this.f5585a = k.g(obj);
        this.f5587c = hVar;
        this.f5586b = 1;
        if (z3) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f5584d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int c() {
        int i3;
        e();
        k.b(Boolean.valueOf(this.f5586b > 0));
        i3 = this.f5586b - 1;
        this.f5586b = i3;
        return i3;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i iVar) {
        return iVar != null && iVar.g();
    }

    private static void i(Object obj) {
        Map map = f5584d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    Y.a.N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f5586b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f5585a;
                this.f5585a = null;
            }
            if (obj != null) {
                h hVar = this.f5587c;
                if (hVar != null) {
                    hVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f5585a;
    }

    public synchronized boolean g() {
        return this.f5586b > 0;
    }

    public i(Object obj, h hVar) {
        this(obj, hVar, false);
    }
}
