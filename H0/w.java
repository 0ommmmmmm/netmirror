package H0;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x.a f321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X.n f322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected y f323g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f326j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f319c = new WeakHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f324h = SystemClock.uptimeMillis();

    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f327a;

        a(D d4) {
            this.f327a = d4;
        }

        @Override // H0.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f325i ? aVar.f307f : this.f327a.a(aVar.f303b.P());
        }
    }

    class b implements p005b0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f329a;

        b(n.a aVar) {
            this.f329a = aVar;
        }

        @Override // p005b0.h
        public void a(Object obj) {
            w.this.y(this.f329a);
        }
    }

    public w(D d4, x.a aVar, X.n nVar, n.b bVar, boolean z3, boolean z4) {
        this.f320d = d4;
        this.f317a = new m(A(d4));
        this.f318b = new m(A(d4));
        this.f321e = aVar;
        this.f322f = nVar;
        this.f323g = (y) X.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f325i = z3;
        this.f326j = z4;
    }

    private D A(D d4) {
        return new a(d4);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    private synchronized boolean i(int i3) {
        boolean z3;
        if (i3 <= this.f323g.f335e) {
            z3 = k() <= this.f323g.f332b - 1 && l() <= this.f323g.f331a - i3;
        }
        return z3;
    }

    private synchronized void j(n.a aVar) {
        X.k.g(aVar);
        X.k.i(aVar.f304c > 0);
        aVar.f304c--;
    }

    private synchronized void m(n.a aVar) {
        X.k.g(aVar);
        X.k.i(!aVar.f305d);
        aVar.f304c++;
    }

    private synchronized void n(n.a aVar) {
        X.k.g(aVar);
        X.k.i(!aVar.f305d);
        aVar.f305d = true;
    }

    private synchronized void o(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((n.a) it.next());
            }
        }
    }

    private synchronized boolean p(n.a aVar) {
        if (aVar.f305d || aVar.f304c != 0) {
            return false;
        }
        this.f317a.g(aVar.f302a, aVar);
        return true;
    }

    private void q(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p005b0.a.D(x((n.a) it.next()));
            }
        }
    }

    private static void s(n.a aVar) {
    }

    private static void t(n.a aVar) {
    }

    private void u(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t((n.a) it.next());
            }
        }
    }

    private synchronized void v() {
        if (this.f324h + this.f323g.f336f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f324h = SystemClock.uptimeMillis();
        this.f323g = (y) X.k.h((y) this.f322f.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized p005b0.a w(n.a aVar) {
        m(aVar);
        return p005b0.a.n0(aVar.f303b.P(), new b(aVar));
    }

    private synchronized p005b0.a x(n.a aVar) {
        X.k.g(aVar);
        return (aVar.f305d && aVar.f304c == 0) ? aVar.f303b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(n.a aVar) {
        boolean zP;
        p005b0.a aVarX;
        X.k.g(aVar);
        synchronized (this) {
            j(aVar);
            zP = p(aVar);
            aVarX = x(aVar);
        }
        p005b0.a.D(aVarX);
        if (!zP) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    private synchronized ArrayList z(int i3, int i4) {
        int iMax = Math.max(i3, 0);
        int iMax2 = Math.max(i4, 0);
        if (this.f317a.b() <= iMax && this.f317a.e() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f317a.b() <= iMax && this.f317a.e() <= iMax2) {
                break;
            }
            Object objC = this.f317a.c();
            if (objC == null) {
                if (!this.f326j) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f317a.b()), Integer.valueOf(this.f317a.e())));
                }
                this.f317a.j();
                break;
            }
            this.f317a.h(objC);
            arrayList.add((n.a) this.f318b.h(objC));
        }
        return arrayList;
    }

    @Override // H0.x
    public p005b0.a b(Object obj, p005b0.a aVar) {
        return h(obj, aVar, null);
    }

    @Override // H0.x
    public void c(Object obj) {
        X.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f317a.h(obj);
                if (aVar != null) {
                    this.f317a.g(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.x
    public synchronized boolean d(X.l lVar) {
        return !this.f318b.d(lVar).isEmpty();
    }

    @Override // H0.x
    public int e(X.l lVar) {
        ArrayList arrayListI;
        ArrayList arrayListI2;
        synchronized (this) {
            arrayListI = this.f317a.i(lVar);
            arrayListI2 = this.f318b.i(lVar);
            o(arrayListI2);
        }
        q(arrayListI2);
        u(arrayListI);
        v();
        r();
        return arrayListI2.size();
    }

    @Override // H0.x
    public p005b0.a get(Object obj) {
        n.a aVar;
        p005b0.a aVarW;
        X.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f317a.h(obj);
                n.a aVar2 = (n.a) this.f318b.a(obj);
                aVarW = aVar2 != null ? w(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        t(aVar);
        v();
        r();
        return aVarW;
    }

    public p005b0.a h(Object obj, p005b0.a aVar, n.b bVar) {
        n.a aVar2;
        p005b0.a aVarW;
        p005b0.a aVarX;
        X.k.g(obj);
        X.k.g(aVar);
        v();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f317a.h(obj);
                n.a aVar3 = (n.a) this.f318b.h(obj);
                aVarW = null;
                if (aVar3 != null) {
                    n(aVar3);
                    aVarX = x(aVar3);
                } else {
                    aVarX = null;
                }
                int iA = this.f320d.a(aVar.P());
                if (i(iA)) {
                    n.a aVarA = this.f325i ? n.a.a(obj, aVar, iA, bVar) : n.a.b(obj, aVar, bVar);
                    this.f318b.g(obj, aVarA);
                    aVarW = w(aVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p005b0.a.D(aVarX);
        t(aVar2);
        r();
        return aVarW;
    }

    public synchronized int k() {
        return this.f318b.b() - this.f317a.b();
    }

    public synchronized int l() {
        return this.f318b.e() - this.f317a.e();
    }

    public void r() {
        ArrayList arrayListZ;
        synchronized (this) {
            y yVar = this.f323g;
            int iMin = Math.min(yVar.f334d, yVar.f332b - k());
            y yVar2 = this.f323g;
            arrayListZ = z(iMin, Math.min(yVar2.f333c, yVar2.f331a - l()));
            o(arrayListZ);
        }
        q(arrayListZ);
        u(arrayListZ);
    }
}
