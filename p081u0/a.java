package p081u0;

import V0.b;
import X.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import p077t0.C0499f;
import p077t0.C0500g;
import p077t0.InterfaceC0496c;
import p077t0.h;
import p077t0.p;
import p077t0.r;
import p089w0.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f10825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f10826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0499f f10827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0500g f10828f;

    a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f10823a = colorDrawable;
        if (b.d()) {
            b.a("GenericDraweeHierarchy()");
        }
        this.f10824b = bVar.p();
        this.f10825c = bVar.s();
        C0500g c0500g = new C0500g(colorDrawable);
        this.f10828f = c0500g;
        int i3 = 1;
        int size = bVar.j() != null ? bVar.j().size() : 1;
        int i4 = (size == 0 ? 1 : size) + (bVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i4 + 6];
        drawableArr[0] = j(bVar.e(), null);
        drawableArr[1] = j(bVar.k(), bVar.l());
        drawableArr[2] = i(c0500g, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = j(bVar.n(), bVar.o());
        drawableArr[4] = j(bVar.q(), bVar.r());
        drawableArr[5] = j(bVar.h(), bVar.i());
        if (i4 > 0) {
            if (bVar.j() != null) {
                Iterator it = bVar.j().iterator();
                i3 = 0;
                while (it.hasNext()) {
                    drawableArr[i3 + 6] = j((Drawable) it.next(), null);
                    i3++;
                }
            }
            if (bVar.m() != null) {
                drawableArr[i3 + 6] = j(bVar.m(), null);
            }
        }
        C0499f c0499f = new C0499f(drawableArr, false, 2);
        this.f10827e = c0499f;
        c0499f.u(bVar.g());
        d dVar = new d(f.e(c0499f, this.f10825c));
        this.f10826d = dVar;
        dVar.mutate();
        u();
        if (b.d()) {
            b.b();
        }
    }

    private Drawable i(Drawable drawable, r rVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return f.g(drawable, rVar, pointF);
    }

    private Drawable j(Drawable drawable, r rVar) {
        return f.f(f.d(drawable, this.f10825c, this.f10824b), rVar);
    }

    private void k(int i3) {
        if (i3 >= 0) {
            this.f10827e.k(i3);
        }
    }

    private void l() {
        m(1);
        m(2);
        m(3);
        m(4);
        m(5);
    }

    private void m(int i3) {
        if (i3 >= 0) {
            this.f10827e.l(i3);
        }
    }

    private InterfaceC0496c p(int i3) {
        InterfaceC0496c interfaceC0496cC = this.f10827e.c(i3);
        if (interfaceC0496cC.q() instanceof h) {
            interfaceC0496cC = (h) interfaceC0496cC.q();
        }
        return interfaceC0496cC.q() instanceof p ? (p) interfaceC0496cC.q() : interfaceC0496cC;
    }

    private p r(int i3) {
        InterfaceC0496c interfaceC0496cP = p(i3);
        return interfaceC0496cP instanceof p ? (p) interfaceC0496cP : f.k(interfaceC0496cP, r.f10769a);
    }

    private boolean s(int i3) {
        return p(i3) instanceof p;
    }

    private void t() {
        this.f10828f.d(this.f10823a);
    }

    private void u() {
        C0499f c0499f = this.f10827e;
        if (c0499f != null) {
            c0499f.f();
            this.f10827e.j();
            l();
            k(1);
            this.f10827e.m();
            this.f10827e.i();
        }
    }

    private void w(int i3, Drawable drawable) {
        if (drawable == null) {
            this.f10827e.e(i3, null);
        } else {
            p(i3).d(f.d(drawable, this.f10825c, this.f10824b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z(float f3) {
        Drawable drawableB = this.f10827e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f3 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            m(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            k(3);
        }
        drawableB.setLevel(Math.round(f3 * 10000.0f));
    }

    public void A(Drawable drawable) {
        w(3, drawable);
    }

    public void B(e eVar) {
        this.f10825c = eVar;
        f.j(this.f10826d, eVar);
        for (int i3 = 0; i3 < this.f10827e.d(); i3++) {
            f.i(p(i3), this.f10825c, this.f10824b);
        }
    }

    @Override // p089w0.c
    public void a(float f3, boolean z3) {
        if (this.f10827e.b(3) == null) {
            return;
        }
        this.f10827e.f();
        z(f3);
        if (z3) {
            this.f10827e.m();
        }
        this.f10827e.i();
    }

    @Override // p089w0.b
    public Rect b() {
        return this.f10826d.getBounds();
    }

    @Override // p089w0.c
    public void c(Drawable drawable) {
        this.f10826d.x(drawable);
    }

    @Override // p089w0.b
    public Drawable d() {
        return this.f10826d;
    }

    @Override // p089w0.c
    public void e(Drawable drawable, float f3, boolean z3) {
        Drawable drawableD = f.d(drawable, this.f10825c, this.f10824b);
        drawableD.mutate();
        this.f10828f.d(drawableD);
        this.f10827e.f();
        l();
        k(2);
        z(f3);
        if (z3) {
            this.f10827e.m();
        }
        this.f10827e.i();
    }

    @Override // p089w0.c
    public void f(Throwable th) {
        this.f10827e.f();
        l();
        if (this.f10827e.b(4) != null) {
            k(4);
        } else {
            k(1);
        }
        this.f10827e.i();
    }

    @Override // p089w0.c
    public void g(Throwable th) {
        this.f10827e.f();
        l();
        if (this.f10827e.b(5) != null) {
            k(5);
        } else {
            k(1);
        }
        this.f10827e.i();
    }

    @Override // p089w0.c
    public void h() {
        t();
        u();
    }

    public PointF n() {
        if (s(2)) {
            return r(2).z();
        }
        return null;
    }

    public r o() {
        if (s(2)) {
            return r(2).A();
        }
        return null;
    }

    public e q() {
        return this.f10825c;
    }

    public void v(r rVar) {
        k.g(rVar);
        r(2).C(rVar);
    }

    public void x(int i3) {
        this.f10827e.u(i3);
    }

    public void y(Drawable drawable, r rVar) {
        w(1, drawable);
        r(1).C(rVar);
    }
}
