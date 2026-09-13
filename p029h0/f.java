package p029h0;

import X.i;
import X.k;
import X.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9469a;

    private class a extends p029h0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9470h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f9471i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f9472j = null;

        /* JADX INFO: renamed from: h0.f$a$a, reason: collision with other inner class name */
        private class C0130a implements e {
            @Override // p029h0.e
            public void a(c cVar) {
                if (cVar.d()) {
                    a.this.G(cVar);
                } else if (cVar.e()) {
                    a.this.F(cVar);
                }
            }

            @Override // p029h0.e
            public void b(c cVar) {
                a.this.t(Math.max(a.this.g(), cVar.g()));
            }

            @Override // p029h0.e
            public void c(c cVar) {
                a.this.F(cVar);
            }

            @Override // p029h0.e
            public void d(c cVar) {
            }

            private C0130a() {
            }
        }

        public a() {
            if (I()) {
                return;
            }
            q(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private synchronized boolean A(c cVar) {
            if (!l() && cVar == this.f9471i) {
                this.f9471i = null;
                return true;
            }
            return false;
        }

        private void B(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c C() {
            return this.f9472j;
        }

        private synchronized n D() {
            if (l() || this.f9470h >= f.this.f9469a.size()) {
                return null;
            }
            List list = f.this.f9469a;
            int i3 = this.f9470h;
            this.f9470h = i3 + 1;
            return (n) list.get(i3);
        }

        private void E(c cVar, boolean z3) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f9471i && cVar != (cVar2 = this.f9472j)) {
                    if (cVar2 == null || z3) {
                        this.f9472j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    B(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c cVar) {
            if (A(cVar)) {
                if (cVar != C()) {
                    B(cVar);
                }
                if (I()) {
                    return;
                }
                r(cVar.f(), cVar.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(c cVar) {
            E(cVar, cVar.e());
            if (cVar == C()) {
                v(null, cVar.e(), cVar.a());
            }
        }

        private synchronized boolean H(c cVar) {
            if (l()) {
                return false;
            }
            this.f9471i = cVar;
            return true;
        }

        private boolean I() {
            n nVarD = D();
            c cVar = nVarD != null ? (c) nVarD.get() : null;
            if (!H(cVar) || cVar == null) {
                B(cVar);
                return false;
            }
            cVar.h(new C0130a(), V.a.b());
            return true;
        }

        @Override // p029h0.a, p029h0.c
        public synchronized Object b() {
            c cVarC;
            cVarC = C();
            return cVarC != null ? cVarC.b() : null;
        }

        @Override // p029h0.a, p029h0.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f9471i;
                    this.f9471i = null;
                    c cVar2 = this.f9472j;
                    this.f9472j = null;
                    B(cVar2);
                    B(cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p029h0.a, p029h0.c
        public synchronized boolean d() {
            c cVarC;
            cVarC = C();
            return cVarC != null && cVarC.d();
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f9469a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // X.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return i.a(this.f9469a, ((f) obj).f9469a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9469a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f9469a).toString();
    }
}
