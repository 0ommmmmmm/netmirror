package p029h0;

import X.i;
import X.k;
import X.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9476b;

    private class a extends p029h0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f9477h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9478i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9479j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f9480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f9481l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f9482m;

        /* JADX INFO: renamed from: h0.h$a$a, reason: collision with other inner class name */
        private class C0131a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f9484a;

            public C0131a(int i3) {
                this.f9484a = i3;
            }

            @Override // p029h0.e
            public void a(c cVar) {
                if (cVar.d()) {
                    a.this.I(this.f9484a, cVar);
                } else if (cVar.e()) {
                    a.this.H(this.f9484a, cVar);
                }
            }

            @Override // p029h0.e
            public void b(c cVar) {
                if (this.f9484a == 0) {
                    a.this.t(cVar.g());
                }
            }

            @Override // p029h0.e
            public void c(c cVar) {
                a.this.H(this.f9484a, cVar);
            }

            @Override // p029h0.e
            public void d(c cVar) {
            }
        }

        public a() {
            if (h.this.f9476b) {
                return;
            }
            B();
        }

        private void A(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void B() {
            if (this.f9480k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f9480k == null) {
                        this.f9480k = new AtomicInteger(0);
                        int size = h.this.f9475a.size();
                        this.f9479j = size;
                        this.f9478i = size;
                        this.f9477h = new ArrayList(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            c cVar = (c) ((n) h.this.f9475a.get(i3)).get();
                            this.f9477h.add(cVar);
                            cVar.h(new C0131a(i3), V.a.b());
                            if (cVar.d()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private synchronized c C(int i3) {
            c cVar;
            ArrayList arrayList = this.f9477h;
            cVar = null;
            if (arrayList != null && i3 < arrayList.size()) {
                cVar = (c) this.f9477h.set(i3, null);
            }
            return cVar;
        }

        private synchronized c D(int i3) {
            ArrayList arrayList;
            arrayList = this.f9477h;
            return (arrayList == null || i3 >= arrayList.size()) ? null : (c) this.f9477h.get(i3);
        }

        private synchronized c E() {
            return D(this.f9478i);
        }

        private void F() {
            Throwable th;
            if (this.f9480k.incrementAndGet() != this.f9479j || (th = this.f9481l) == null) {
                return;
            }
            r(th, this.f9482m);
        }

        private void G(int i3, c cVar, boolean z3) {
            synchronized (this) {
                try {
                    int i4 = this.f9478i;
                    if (cVar == D(i3) && i3 != this.f9478i) {
                        if (E() == null || (z3 && i3 < this.f9478i)) {
                            this.f9478i = i3;
                        } else {
                            i3 = i4;
                        }
                        while (i4 > i3) {
                            A(C(i4));
                            i4--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i3, c cVar) {
            A(J(i3, cVar));
            if (i3 == 0) {
                this.f9481l = cVar.f();
                this.f9482m = cVar.a();
            }
            F();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(int i3, c cVar) {
            G(i3, cVar, cVar.e());
            if (cVar == E()) {
                v(null, i3 == 0 && cVar.e(), cVar.a());
            }
            F();
        }

        private synchronized c J(int i3, c cVar) {
            if (cVar == E()) {
                return null;
            }
            if (cVar != D(i3)) {
                return cVar;
            }
            return C(i3);
        }

        @Override // p029h0.a, p029h0.c
        public synchronized Object b() {
            c cVarE;
            try {
                if (h.this.f9476b) {
                    B();
                }
                cVarE = E();
            } catch (Throwable th) {
                throw th;
            }
            return cVarE != null ? cVarE.b() : null;
        }

        @Override // p029h0.a, p029h0.c
        public boolean close() {
            if (h.this.f9476b) {
                B();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f9477h;
                    this.f9477h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        A((c) arrayList.get(i3));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p029h0.a, p029h0.c
        public synchronized boolean d() {
            c cVarE;
            try {
                if (h.this.f9476b) {
                    B();
                }
                cVarE = E();
            } catch (Throwable th) {
                throw th;
            }
            return cVarE != null && cVarE.d();
        }
    }

    private h(List list, boolean z3) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f9475a = list;
        this.f9476b = z3;
    }

    public static h c(List list, boolean z3) {
        return new h(list, z3);
    }

    @Override // X.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return i.a(this.f9475a, ((h) obj).f9475a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9475a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f9475a).toString();
    }
}
