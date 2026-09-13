package p064q;

import D2.h;
import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes.dex */
public class f extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10352c;

    public f(int i3) {
        super(i3);
        this.f10352c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, p064q.e
    public boolean a(Object obj) {
        boolean zA;
        h.f(obj, "instance");
        synchronized (this.f10352c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, p064q.e
    public Object b() {
        Object objB;
        synchronized (this.f10352c) {
            objB = super.b();
        }
        return objB;
    }
}
