package p044l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a extends g implements Map {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f9610i;

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    class C0135a extends f {
        C0135a() {
        }

        @Override // p044l.f
        protected void a() {
            a.this.clear();
        }

        @Override // p044l.f
        protected Object b(int i3, int i4) {
            return a.this.f9659c[(i3 << 1) + i4];
        }

        @Override // p044l.f
        protected Map c() {
            return a.this;
        }

        @Override // p044l.f
        protected int d() {
            return a.this.f9660d;
        }

        @Override // p044l.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // p044l.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // p044l.f
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // p044l.f
        protected void h(int i3) {
            a.this.k(i3);
        }

        @Override // p044l.f
        protected Object i(int i3, Object obj) {
            return a.this.l(i3, obj);
        }
    }

    public a() {
    }

    private f n() {
        if (this.f9610i == null) {
            this.f9610i = new C0135a();
        }
        return this.f9610i;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f9660d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public a(int i3) {
        super(i3);
    }

    public a(g gVar) {
        super(gVar);
    }
}
