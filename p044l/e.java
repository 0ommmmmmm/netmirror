package p044l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f9631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9638h;

    public e(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f9633c = i3;
        this.f9631a = new LinkedHashMap(0, 0.75f, true);
    }

    private int e(Object obj, Object obj2) {
        int iF = f(obj, obj2);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected Object a(Object obj) {
        return null;
    }

    protected void b(boolean z3, Object obj, Object obj2, Object obj3) {
    }

    public final Object c(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f9631a.get(obj);
                if (obj2 != null) {
                    this.f9637g++;
                    return obj2;
                }
                this.f9638h++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f9635e++;
                        objPut = this.f9631a.put(obj, objA);
                        if (objPut != null) {
                            this.f9631a.put(obj, objPut);
                        } else {
                            this.f9632b += e(obj, objA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objPut != null) {
                    b(false, obj, objA, objPut);
                    return objPut;
                }
                g(this.f9633c);
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f9634d++;
                this.f9632b += e(obj, obj2);
                objPut = this.f9631a.put(obj, obj2);
                if (objPut != null) {
                    this.f9632b -= e(obj, objPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        g(this.f9633c);
        return objPut;
    }

    protected int f(Object obj, Object obj2) {
        return 1;
    }

    public void g(int i3) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f9632b < 0 || (this.f9631a.isEmpty() && this.f9632b != 0)) {
                        break;
                    }
                    if (this.f9632b > i3 && !this.f9631a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) this.f9631a.entrySet().iterator().next();
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f9631a.remove(key);
                        this.f9632b -= e(key, value);
                        this.f9636f++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i3;
        int i4;
        try {
            i3 = this.f9637g;
            i4 = this.f9638h + i3;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f9633c), Integer.valueOf(this.f9637g), Integer.valueOf(this.f9638h), Integer.valueOf(i4 != 0 ? (i3 * 100) / i4 : 0));
    }
}
