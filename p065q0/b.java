package p065q0;

import X.i;
import X.k;
import X.n;
import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p029h0.f;
import p029h0.h;
import p089w0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f10381q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f10382r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f10383s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f10386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f10387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f10388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f10389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f10390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f10392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f10393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10397n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f10398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p089w0.a f10399p;

    class a extends p065q0.c {
        a() {
        }

        @Override // p065q0.c, p065q0.d
        public void k(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: q0.b$b, reason: collision with other inner class name */
    class C0142b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p089w0.a f10400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f10403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f10404e;

        C0142b(p089w0.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f10400a = aVar;
            this.f10401b = str;
            this.f10402c = obj;
            this.f10403d = obj2;
            this.f10404e = cVar;
        }

        @Override // X.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p029h0.c get() {
            return b.this.j(this.f10400a, this.f10401b, this.f10402c, this.f10403d, this.f10404e);
        }

        public String toString() {
            return i.b(this).b("request", this.f10402c.toString()).toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set set, Set set2) {
        this.f10384a = context;
        this.f10385b = set;
        this.f10386c = set2;
        t();
    }

    protected static String f() {
        return String.valueOf(f10383s.getAndIncrement());
    }

    private void t() {
        this.f10387d = null;
        this.f10388e = null;
        this.f10389f = null;
        this.f10390g = null;
        this.f10391h = true;
        this.f10393j = null;
        this.f10394k = false;
        this.f10395l = false;
        this.f10397n = false;
        this.f10399p = null;
        this.f10398o = null;
    }

    public b A() {
        t();
        return s();
    }

    public b B(boolean z3) {
        this.f10395l = z3;
        return s();
    }

    public b C(Object obj) {
        this.f10387d = obj;
        return s();
    }

    public b D(d dVar) {
        this.f10393j = dVar;
        return s();
    }

    public b E(Object obj) {
        this.f10388e = obj;
        return s();
    }

    public b F(Object obj) {
        this.f10389f = obj;
        return s();
    }

    @Override // p089w0.d
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b b(p089w0.a aVar) {
        this.f10399p = aVar;
        return s();
    }

    protected void H() {
        boolean z3 = true;
        k.j(this.f10390g == null || this.f10388e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f10392i != null && (this.f10390g != null || this.f10388e != null || this.f10389f != null)) {
            z3 = false;
        }
        k.j(z3, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // p089w0.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p065q0.a a() {
        Object obj;
        H();
        if (this.f10388e == null && this.f10390g == null && (obj = this.f10389f) != null) {
            this.f10388e = obj;
            this.f10389f = null;
        }
        return e();
    }

    protected p065q0.a e() {
        if (V0.b.d()) {
            V0.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        p065q0.a aVarY = y();
        aVarY.d0(u());
        aVarY.e0(r());
        aVarY.Z(h());
        i();
        aVarY.b0(null);
        x(aVarY);
        v(aVarY);
        if (V0.b.d()) {
            V0.b.b();
        }
        return aVarY;
    }

    public Object g() {
        return this.f10387d;
    }

    public String h() {
        return this.f10398o;
    }

    public e i() {
        return null;
    }

    protected abstract p029h0.c j(p089w0.a aVar, String str, Object obj, Object obj2, c cVar);

    protected n k(p089w0.a aVar, String str, Object obj) {
        return l(aVar, str, obj, c.FULL_FETCH);
    }

    protected n l(p089w0.a aVar, String str, Object obj, c cVar) {
        return new C0142b(aVar, str, obj, g(), cVar);
    }

    protected n m(p089w0.a aVar, String str, Object[] objArr, boolean z3) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z3) {
            for (Object obj : objArr) {
                arrayList.add(l(aVar, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(k(aVar, str, obj2));
        }
        return f.b(arrayList);
    }

    public Object[] n() {
        return this.f10390g;
    }

    public Object o() {
        return this.f10388e;
    }

    public Object p() {
        return this.f10389f;
    }

    public p089w0.a q() {
        return this.f10399p;
    }

    public boolean r() {
        return this.f10396m;
    }

    protected final b s() {
        return this;
    }

    public boolean u() {
        return this.f10397n;
    }

    protected void v(p065q0.a aVar) {
        Set set = this.f10385b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aVar.j((d) it.next());
            }
        }
        Set set2 = this.f10386c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                aVar.k((p101z0.b) it2.next());
            }
        }
        d dVar = this.f10393j;
        if (dVar != null) {
            aVar.j(dVar);
        }
        if (this.f10395l) {
            aVar.j(f10381q);
        }
    }

    protected void w(p065q0.a aVar) {
        if (aVar.u() == null) {
            aVar.c0(p085v0.a.c(this.f10384a));
        }
    }

    protected void x(p065q0.a aVar) {
        if (this.f10394k) {
            aVar.A().d(this.f10394k);
            w(aVar);
        }
    }

    protected abstract p065q0.a y();

    protected n z(p089w0.a aVar, String str) {
        n nVarM;
        n nVar = this.f10392i;
        if (nVar != null) {
            return nVar;
        }
        Object obj = this.f10388e;
        if (obj != null) {
            nVarM = k(aVar, str, obj);
        } else {
            Object[] objArr = this.f10390g;
            nVarM = objArr != null ? m(aVar, str, objArr, this.f10391h) : null;
        }
        if (nVarM != null && this.f10389f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVarM);
            arrayList.add(k(aVar, str, this.f10389f));
            nVarM = h.c(arrayList, false);
        }
        return nVarM == null ? p029h0.d.a(f10382r) : nVarM;
    }
}
