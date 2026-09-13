package p053n0;

import Q0.c;
import android.graphics.Rect;
import androidx.activity.result.d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p017e0.b;
import p049m0.e;
import p101z0.g;
import p101z0.i;
import p101z0.j;
import p101z0.k;
import p101z0.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f9844c = new j(k.DRAWEE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p057o0.a f9845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p057o0.b f9846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f9847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f9848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9849h;

    public a(b bVar, e eVar) {
        this.f9843b = bVar;
        this.f9842a = eVar;
    }

    private void h() {
        if (this.f9846e == null) {
            this.f9846e = new p057o0.b(this.f9843b, this.f9844c, this);
        }
        if (this.f9845d == null) {
            this.f9845d = new p057o0.a(this.f9843b, this.f9844c);
        }
        if (this.f9847f == null) {
            this.f9847f = new c(this.f9845d);
        }
    }

    @Override // p101z0.i
    public void a(j jVar, p101z0.e eVar) {
        List list;
        jVar.H(eVar);
        if (!this.f9849h || (list = this.f9848g) == null || list.isEmpty()) {
            return;
        }
        if (eVar == p101z0.e.SUCCESS) {
            d();
        }
        jVar.S();
        Iterator it = this.f9848g.iterator();
        if (it.hasNext()) {
            d.a(it.next());
            throw null;
        }
    }

    @Override // p101z0.i
    public void b(j jVar, n nVar) {
        List list;
        if (!this.f9849h || (list = this.f9848g) == null || list.isEmpty()) {
            return;
        }
        jVar.S();
        Iterator it = this.f9848g.iterator();
        if (it.hasNext()) {
            d.a(it.next());
            throw null;
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f9848g == null) {
            this.f9848g = new CopyOnWriteArrayList();
        }
        this.f9848g.add(gVar);
    }

    public void d() {
        p089w0.b bVarB = this.f9842a.b();
        if (bVarB == null || bVarB.d() == null) {
            return;
        }
        Rect bounds = bVarB.d().getBounds();
        this.f9844c.N(bounds.width());
        this.f9844c.M(bounds.height());
    }

    public void e() {
        List list = this.f9848g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f9844c.w();
    }

    public void g(boolean z3) {
        this.f9849h = z3;
        if (!z3) {
            p057o0.b bVar = this.f9846e;
            if (bVar != null) {
                this.f9842a.S(bVar);
            }
            c cVar = this.f9847f;
            if (cVar != null) {
                this.f9842a.y0(cVar);
                return;
            }
            return;
        }
        h();
        p057o0.b bVar2 = this.f9846e;
        if (bVar2 != null) {
            this.f9842a.k(bVar2);
        }
        c cVar2 = this.f9847f;
        if (cVar2 != null) {
            this.f9842a.i0(cVar2);
        }
    }
}
