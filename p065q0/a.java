package p065q0;

import X.g;
import X.i;
import X.k;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import java.util.Map;
import java.util.concurrent.Executor;
import p061p0.d;
import p089w0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p089w0.a, p061p0.a.InterfaceC0140a, p085v0.a.InterfaceC0149a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f10353w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f10354x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f10355y = a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p061p0.a f10357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f10358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f10359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p085v0.a f10360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d f10361f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f10363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f10364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f10366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f10372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p029h0.c f10373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f10374s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f10377v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p061p0.c f10356a = p061p0.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p101z0.d f10362g = new p101z0.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10375t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10376u = false;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    class C0141a extends p029h0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10379b;

        C0141a(String str, boolean z3) {
            this.f10378a = str;
            this.f10379b = z3;
        }

        @Override // p029h0.b, p029h0.e
        public void b(p029h0.c cVar) {
            boolean zE = cVar.e();
            a.this.O(this.f10378a, cVar, cVar.g(), zE);
        }

        @Override // p029h0.b
        public void e(p029h0.c cVar) {
            a.this.L(this.f10378a, cVar, cVar.f(), true);
        }

        @Override // p029h0.b
        public void f(p029h0.c cVar) {
            boolean zE = cVar.e();
            boolean zC = cVar.c();
            float fG = cVar.g();
            Object objB = cVar.b();
            if (objB != null) {
                a.this.N(this.f10378a, cVar, objB, fG, zE, this.f10379b, zC);
            } else if (zE) {
                a.this.L(this.f10378a, cVar, new NullPointerException(), true);
            }
        }
    }

    private static class b extends f {
        private b() {
        }

        public static b f(d dVar, d dVar2) {
            if (V0.b.d()) {
                V0.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.c(dVar);
            bVar.c(dVar2);
            if (V0.b.d()) {
                V0.b.b();
            }
            return bVar;
        }
    }

    public a(p061p0.a aVar, Executor executor, String str, Object obj) {
        this.f10357b = aVar;
        this.f10358c = executor;
        C(str, obj);
    }

    private c B() {
        c cVar = this.f10363h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f10366k);
    }

    private synchronized void C(String str, Object obj) {
        p061p0.a aVar;
        try {
            if (V0.b.d()) {
                V0.b.a("AbstractDraweeController#init");
            }
            this.f10356a.b(p0.c.a.ON_INIT_CONTROLLER);
            if (!this.f10375t && (aVar = this.f10357b) != null) {
                aVar.a(this);
            }
            this.f10367l = false;
            this.f10369n = false;
            Q();
            this.f10371p = false;
            d dVar = this.f10359d;
            if (dVar != null) {
                dVar.a();
            }
            p085v0.a aVar2 = this.f10360e;
            if (aVar2 != null) {
                aVar2.a();
                this.f10360e.f(this);
            }
            d dVar2 = this.f10361f;
            if (dVar2 instanceof b) {
                ((b) dVar2).d();
            } else {
                this.f10361f = null;
            }
            c cVar = this.f10363h;
            if (cVar != null) {
                cVar.h();
                this.f10363h.c(null);
                this.f10363h = null;
            }
            this.f10364i = null;
            if (Y.a.w(2)) {
                Y.a.A(f10355y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f10365j, str);
            }
            this.f10365j = str;
            this.f10366k = obj;
            if (V0.b.d()) {
                V0.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean E(String str, p029h0.c cVar) {
        if (cVar == null && this.f10373r == null) {
            return true;
        }
        return str.equals(this.f10365j) && cVar == this.f10373r && this.f10368m;
    }

    private void G(String str, Throwable th) {
        if (Y.a.w(2)) {
            Y.a.B(f10355y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f10365j, str, th);
        }
    }

    private void H(String str, Object obj) {
        if (Y.a.w(2)) {
            Y.a.C(f10355y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f10365j, str, w(obj), Integer.valueOf(x(obj)));
        }
    }

    private z0.b.a I(p029h0.c cVar, Object obj, Uri uri) {
        return J(cVar == null ? null : cVar.a(), K(obj), uri);
    }

    private z0.b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFN;
        c cVar = this.f10363h;
        if (cVar instanceof p081u0.a) {
            p081u0.a aVar = (p081u0.a) cVar;
            String strValueOf = String.valueOf(aVar.o());
            pointFN = aVar.n();
            str = strValueOf;
        } else {
            str = null;
            pointFN = null;
        }
        return p097y0.b.a(f10353w, f10354x, map, null, t(), str, pointFN, map2, o(), F(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, p029h0.c cVar, Throwable th, boolean z3) {
        Drawable drawable;
        if (V0.b.d()) {
            V0.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (V0.b.d()) {
                V0.b.b();
                return;
            }
            return;
        }
        this.f10356a.b(z3 ? p0.c.a.ON_DATASOURCE_FAILURE : p0.c.a.ON_DATASOURCE_FAILURE_INT);
        if (z3) {
            G("final_failed @ onFailure", th);
            this.f10373r = null;
            this.f10370o = true;
            c cVar2 = this.f10363h;
            if (cVar2 != null) {
                if (this.f10371p && (drawable = this.f10377v) != null) {
                    cVar2.e(drawable, 1.0f, true);
                } else if (g0()) {
                    cVar2.f(th);
                } else {
                    cVar2.g(th);
                }
            }
            T(th, cVar);
        } else {
            G("intermediate_failed @ onFailure", th);
            U(th);
        }
        if (V0.b.d()) {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str, p029h0.c cVar, Object obj, float f3, boolean z3, boolean z4, boolean z5) {
        try {
            if (V0.b.d()) {
                V0.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", obj);
                R(obj);
                cVar.close();
                if (V0.b.d()) {
                    V0.b.b();
                    return;
                }
                return;
            }
            this.f10356a.b(z3 ? p0.c.a.ON_DATASOURCE_RESULT : p0.c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableL = l(obj);
                Object obj2 = this.f10374s;
                Drawable drawable = this.f10377v;
                this.f10374s = obj;
                this.f10377v = drawableL;
                try {
                    if (z3) {
                        H("set_final_result @ onNewResult", obj);
                        this.f10373r = null;
                        B().e(drawableL, 1.0f, z4);
                        Y(str, obj, cVar);
                    } else if (z5) {
                        H("set_temporary_result @ onNewResult", obj);
                        B().e(drawableL, 1.0f, z4);
                        Y(str, obj, cVar);
                    } else {
                        H("set_intermediate_result @ onNewResult", obj);
                        B().e(drawableL, f3, z4);
                        V(str, obj);
                    }
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    if (V0.b.d()) {
                        V0.b.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                H("drawable_failed @ onNewResult", obj);
                R(obj);
                L(str, cVar, e4, z3);
                if (V0.b.d()) {
                    V0.b.b();
                }
            }
        } catch (Throwable th2) {
            if (V0.b.d()) {
                V0.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, p029h0.c cVar, float f3, boolean z3) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z3) {
                return;
            }
            this.f10363h.a(f3, false);
        }
    }

    private void Q() {
        Map mapA;
        boolean z3 = this.f10368m;
        this.f10368m = false;
        this.f10370o = false;
        p029h0.c cVar = this.f10373r;
        Map map = null;
        if (cVar != null) {
            mapA = cVar.a();
            this.f10373r.close();
            this.f10373r = null;
        } else {
            mapA = null;
        }
        Drawable drawable = this.f10377v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f10372q != null) {
            this.f10372q = null;
        }
        this.f10377v = null;
        Object obj = this.f10374s;
        if (obj != null) {
            Map mapK = K(y(obj));
            H("release", this.f10374s);
            R(this.f10374s);
            this.f10374s = null;
            map = mapK;
        }
        if (z3) {
            W(mapA, map);
        }
    }

    private void T(Throwable th, p029h0.c cVar) {
        z0.b.a aVarI = I(cVar, null, null);
        p().r(this.f10365j, th);
        q().y(this.f10365j, th, aVarI);
    }

    private void U(Throwable th) {
        p().l(this.f10365j, th);
        q().q(this.f10365j);
    }

    private void V(String str, Object obj) {
        Object objY = y(obj);
        p().a(str, objY);
        q().a(str, objY);
    }

    private void W(Map map, Map map2) {
        p().b(this.f10365j);
        q().v(this.f10365j, J(map, map2, null));
    }

    private void Y(String str, Object obj, p029h0.c cVar) {
        Object objY = y(obj);
        p().k(str, objY, m());
        q().z(str, objY, I(cVar, objY, null));
    }

    private boolean g0() {
        d dVar;
        return this.f10370o && (dVar = this.f10359d) != null && dVar.e();
    }

    private Rect t() {
        c cVar = this.f10363h;
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    protected d A() {
        if (this.f10359d == null) {
            this.f10359d = new d();
        }
        return this.f10359d;
    }

    protected void D(String str, Object obj) {
        C(str, obj);
        this.f10375t = false;
        this.f10376u = false;
    }

    protected boolean F() {
        return this.f10376u;
    }

    public abstract Map K(Object obj);

    protected void M(String str, Object obj) {
    }

    protected abstract void P(Drawable drawable);

    protected abstract void R(Object obj);

    public void S(p101z0.b bVar) {
        this.f10362g.D(bVar);
    }

    protected void X(p029h0.c cVar, Object obj) {
        p().j(this.f10365j, this.f10366k);
        q().o(this.f10365j, this.f10366k, I(cVar, obj, z()));
    }

    public void Z(String str) {
        this.f10372q = str;
    }

    @Override // p089w0.a
    public void a() {
        if (V0.b.d()) {
            V0.b.a("AbstractDraweeController#onDetach");
        }
        if (Y.a.w(2)) {
            Y.a.z(f10355y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f10365j);
        }
        this.f10356a.b(p0.c.a.ON_DETACH_CONTROLLER);
        this.f10367l = false;
        this.f10357b.d(this);
        if (V0.b.d()) {
            V0.b.b();
        }
    }

    protected void a0(Drawable drawable) {
        this.f10364i = drawable;
        c cVar = this.f10363h;
        if (cVar != null) {
            cVar.c(drawable);
        }
    }

    @Override // p089w0.a
    public p089w0.b b() {
        return this.f10363h;
    }

    public void b0(e eVar) {
    }

    @Override // p089w0.a
    public void c(p089w0.b bVar) {
        if (Y.a.w(2)) {
            Y.a.A(f10355y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f10365j, bVar);
        }
        this.f10356a.b(bVar != null ? p0.c.a.ON_SET_HIERARCHY : p0.c.a.ON_CLEAR_HIERARCHY);
        if (this.f10368m) {
            this.f10357b.a(this);
            release();
        }
        c cVar = this.f10363h;
        if (cVar != null) {
            cVar.c(null);
            this.f10363h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof c));
            c cVar2 = (c) bVar;
            this.f10363h = cVar2;
            cVar2.c(this.f10364i);
        }
    }

    protected void c0(p085v0.a aVar) {
        this.f10360e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // p089w0.a
    public boolean d(MotionEvent motionEvent) {
        if (Y.a.w(2)) {
            Y.a.A(f10355y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f10365j, motionEvent);
        }
        p085v0.a aVar = this.f10360e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !f0()) {
            return false;
        }
        this.f10360e.d(motionEvent);
        return true;
    }

    protected void d0(boolean z3) {
        this.f10376u = z3;
    }

    @Override // p089w0.a
    public void e() {
        if (V0.b.d()) {
            V0.b.a("AbstractDraweeController#onAttach");
        }
        if (Y.a.w(2)) {
            Y.a.A(f10355y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f10365j, this.f10368m ? "request already submitted" : "request needs submit");
        }
        this.f10356a.b(p0.c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f10363h);
        this.f10357b.a(this);
        this.f10367l = true;
        if (!this.f10368m) {
            h0();
        }
        if (V0.b.d()) {
            V0.b.b();
        }
    }

    protected void e0(boolean z3) {
        this.f10371p = z3;
    }

    @Override // p085v0.a.InterfaceC0149a
    public boolean f() {
        if (Y.a.w(2)) {
            Y.a.z(f10355y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f10365j);
        }
        if (!g0()) {
            return false;
        }
        this.f10359d.b();
        this.f10363h.h();
        h0();
        return true;
    }

    protected boolean f0() {
        return g0();
    }

    protected void h0() {
        if (V0.b.d()) {
            V0.b.a("AbstractDraweeController#submitRequest");
        }
        Object objN = n();
        if (objN != null) {
            if (V0.b.d()) {
                V0.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f10373r = null;
            this.f10368m = true;
            this.f10370o = false;
            this.f10356a.b(p0.c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f10373r, y(objN));
            M(this.f10365j, objN);
            N(this.f10365j, this.f10373r, objN, 1.0f, true, true, true);
            if (V0.b.d()) {
                V0.b.b();
            }
            if (V0.b.d()) {
                V0.b.b();
                return;
            }
            return;
        }
        this.f10356a.b(p0.c.a.ON_DATASOURCE_SUBMIT);
        this.f10363h.a(0.0f, true);
        this.f10368m = true;
        this.f10370o = false;
        p029h0.c cVarS = s();
        this.f10373r = cVarS;
        X(cVarS, null);
        if (Y.a.w(2)) {
            Y.a.A(f10355y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f10365j, Integer.valueOf(System.identityHashCode(this.f10373r)));
        }
        this.f10373r.h(new C0141a(this.f10365j, this.f10373r.d()), this.f10358c);
        if (V0.b.d()) {
            V0.b.b();
        }
    }

    public void j(d dVar) {
        k.g(dVar);
        d dVar2 = this.f10361f;
        if (dVar2 instanceof b) {
            ((b) dVar2).c(dVar);
        } else if (dVar2 != null) {
            this.f10361f = b.f(dVar2, dVar);
        } else {
            this.f10361f = dVar;
        }
    }

    public void k(p101z0.b bVar) {
        this.f10362g.A(bVar);
    }

    protected abstract Drawable l(Object obj);

    public Animatable m() {
        Object obj = this.f10377v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected Object n() {
        return null;
    }

    public Object o() {
        return this.f10366k;
    }

    protected d p() {
        d dVar = this.f10361f;
        return dVar == null ? c.c() : dVar;
    }

    protected p101z0.b q() {
        return this.f10362g;
    }

    protected Drawable r() {
        return this.f10364i;
    }

    @Override // p061p0.a.InterfaceC0140a
    public void release() {
        this.f10356a.b(p0.c.a.ON_RELEASE_CONTROLLER);
        d dVar = this.f10359d;
        if (dVar != null) {
            dVar.c();
        }
        p085v0.a aVar = this.f10360e;
        if (aVar != null) {
            aVar.e();
        }
        c cVar = this.f10363h;
        if (cVar != null) {
            cVar.h();
        }
        Q();
    }

    protected abstract p029h0.c s();

    public String toString() {
        return i.b(this).c("isAttached", this.f10367l).c("isRequestSubmitted", this.f10368m).c("hasFetchFailed", this.f10370o).a("fetchedImage", x(this.f10374s)).b("events", this.f10356a.toString()).toString();
    }

    protected p085v0.a u() {
        return this.f10360e;
    }

    public String v() {
        return this.f10365j;
    }

    protected String w(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected int x(Object obj) {
        return System.identityHashCode(obj);
    }

    protected abstract Object y(Object obj);

    protected Uri z() {
        return null;
    }
}
