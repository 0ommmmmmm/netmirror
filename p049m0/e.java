package p049m0;

import H0.x;
import O0.l;
import Q0.c;
import R.d;
import U0.b;
import X.f;
import X.i;
import X.k;
import X.n;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p065q0.a;
import p077t0.C0494a;
import p077t0.InterfaceC0496c;
import p077t0.p;
import p077t0.r;
import p101z0.g;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Class f9809M = e.class;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final N0.a f9810A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final f f9811B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final x f9812C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private d f9813D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private n f9814E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f9815F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private f f9816G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p053n0.a f9817H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Set f9818I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private b f9819J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private b[] f9820K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private b f9821L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Resources f9822z;

    public e(Resources resources, p061p0.a aVar, N0.a aVar2, N0.a aVar3, Executor executor, x xVar, f fVar) {
        super(aVar, executor, null, null);
        this.f9822z = resources;
        this.f9810A = new a(resources, aVar2, aVar3);
        this.f9811B = fVar;
        this.f9812C = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p k0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof p) {
            return (p) drawable;
        }
        if (drawable instanceof InterfaceC0496c) {
            return k0(((InterfaceC0496c) drawable).q());
        }
        if (drawable instanceof C0494a) {
            C0494a c0494a = (C0494a) drawable;
            int iD = c0494a.d();
            for (int i3 = 0; i3 < iD; i3++) {
                p pVarK0 = k0(c0494a.b(i3));
                if (pVarK0 != null) {
                    return pVarK0;
                }
            }
        }
        return null;
    }

    private void q0(n nVar) {
        this.f9814E = nVar;
        u0(null);
    }

    private Drawable t0(f fVar, O0.d dVar) {
        Drawable drawableB;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            N0.a aVar = (N0.a) it.next();
            if (aVar.a(dVar) && (drawableB = aVar.b(dVar)) != null) {
                return drawableB;
            }
        }
        return null;
    }

    private void u0(O0.d dVar) {
        if (this.f9815F) {
            if (r() == null) {
                p069r0.a aVar = new p069r0.a();
                j(new p073s0.a(aVar));
                a0(aVar);
            }
            if (r() instanceof p069r0.a) {
                B0(dVar, (p069r0.a) r());
            }
        }
    }

    public void A0(boolean z3) {
        this.f9815F = z3;
    }

    protected void B0(O0.d dVar, p069r0.a aVar) {
        p pVarK0;
        aVar.j(v());
        p089w0.b bVarB = b();
        r rVarA = null;
        if (bVarB != null && (pVarK0 = k0(bVarB.d())) != null) {
            rVarA = pVarK0.A();
        }
        aVar.m(rVarA);
        String strM0 = m0();
        if (strM0 != null) {
            aVar.b("cc", strM0);
        }
        if (dVar == null) {
            aVar.i();
        } else {
            aVar.k(dVar.h(), dVar.d());
            aVar.l(dVar.b0());
        }
    }

    @Override // p065q0.a
    protected void P(Drawable drawable) {
    }

    @Override // p065q0.a, p089w0.a
    public void c(p089w0.b bVar) {
        super.c(bVar);
        u0(null);
    }

    public synchronized void i0(Q0.e eVar) {
        try {
            if (this.f9818I == null) {
                this.f9818I = new HashSet();
            }
            this.f9818I.add(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Drawable l(p005b0.a aVar) {
        try {
            if (V0.b.d()) {
                V0.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(p005b0.a.c0(aVar));
            O0.d dVar = (O0.d) aVar.P();
            u0(dVar);
            Drawable drawableT0 = t0(this.f9816G, dVar);
            if (drawableT0 != null) {
                if (V0.b.d()) {
                    V0.b.b();
                }
                return drawableT0;
            }
            Drawable drawableT1 = t0(this.f9811B, dVar);
            if (drawableT1 != null) {
                if (V0.b.d()) {
                    V0.b.b();
                }
                return drawableT1;
            }
            Drawable drawableB = this.f9810A.b(dVar);
            if (drawableB != null) {
                if (V0.b.d()) {
                    V0.b.b();
                }
                return drawableB;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + dVar);
        } catch (Throwable th) {
            if (V0.b.d()) {
                V0.b.b();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public p005b0.a n() {
        d dVar;
        if (V0.b.d()) {
            V0.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f9812C;
            if (xVar != null && (dVar = this.f9813D) != null) {
                p005b0.a aVar = xVar.get(dVar);
                if (aVar == null || ((O0.d) aVar.P()).l().a()) {
                    return aVar;
                }
                aVar.close();
                return null;
            }
            return null;
        } finally {
            if (V0.b.d()) {
                V0.b.b();
            }
        }
    }

    protected String m0() {
        Object objO = o();
        if (objO == null) {
            return null;
        }
        return objO.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int x(p005b0.a aVar) {
        if (aVar != null) {
            return aVar.X();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public l y(p005b0.a aVar) {
        k.i(p005b0.a.c0(aVar));
        return ((O0.d) aVar.P()).r();
    }

    public synchronized Q0.e p0() {
        Set set = this.f9818I;
        if (set == null) {
            return null;
        }
        return new c((Set<Q0.e>) set);
    }

    public void r0(n nVar, String str, d dVar, Object obj, f fVar) {
        if (V0.b.d()) {
            V0.b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        q0(nVar);
        this.f9813D = dVar;
        z0(fVar);
        u0(null);
        if (V0.b.d()) {
            V0.b.b();
        }
    }

    @Override // p065q0.a
    protected p029h0.c s() {
        if (V0.b.d()) {
            V0.b.a("PipelineDraweeController#getDataSource");
        }
        if (Y.a.w(2)) {
            Y.a.y(f9809M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        p029h0.c cVar = (p029h0.c) this.f9814E.get();
        if (V0.b.d()) {
            V0.b.b();
        }
        return cVar;
    }

    protected synchronized void s0(g gVar, p065q0.b bVar) {
        try {
            p053n0.a aVar = this.f9817H;
            if (aVar != null) {
                aVar.f();
            }
            if (gVar != null) {
                if (this.f9817H == null) {
                    this.f9817H = new p053n0.a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f9817H.c(gVar);
                this.f9817H.g(true);
            }
            this.f9819J = (b) bVar.o();
            this.f9820K = (b[]) bVar.n();
            this.f9821L = (b) bVar.p();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p065q0.a
    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.f9814E).toString();
    }

    @Override // p065q0.a
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Map K(l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void M(String str, p005b0.a aVar) {
        super.M(str, aVar);
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.a
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void R(p005b0.a aVar) {
        p005b0.a.D(aVar);
    }

    public synchronized void y0(Q0.e eVar) {
        Set set = this.f9818I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }

    @Override // p065q0.a
    protected Uri z() {
        return p101z0.l.a(this.f9819J, this.f9821L, this.f9820K, b.f2380A);
    }

    public void z0(f fVar) {
        this.f9816G = fVar;
    }
}
