package p093x0;

import X.i;
import X.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p061p0.c;
import p077t0.F;
import p077t0.G;
import p089w0.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements G {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p089w0.b f10962e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10959b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10960c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10961d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f10963f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f10964g = c.a();

    public b(p089w0.b bVar) {
        if (bVar != null) {
            p(bVar);
        }
    }

    private void a() {
        if (this.f10959b) {
            return;
        }
        this.f10964g.b(c.a.ON_ATTACH_CONTROLLER);
        this.f10959b = true;
        a aVar = this.f10963f;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.f10963f.e();
    }

    private void b() {
        if (this.f10960c && this.f10961d) {
            a();
        } else {
            d();
        }
    }

    public static b c(p089w0.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.m(context);
        return bVar2;
    }

    private void d() {
        if (this.f10959b) {
            this.f10964g.b(c.a.ON_DETACH_CONTROLLER);
            this.f10959b = false;
            if (h()) {
                this.f10963f.a();
            }
        }
    }

    private void q(G g3) {
        Object objG = g();
        if (objG instanceof F) {
            ((F) objG).e(g3);
        }
    }

    public a e() {
        return this.f10963f;
    }

    public p089w0.b f() {
        return (p089w0.b) k.g(this.f10962e);
    }

    public Drawable g() {
        p089w0.b bVar = this.f10962e;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public boolean h() {
        a aVar = this.f10963f;
        return aVar != null && aVar.b() == this.f10962e;
    }

    @Override // p077t0.G
    public void i(boolean z3) {
        if (this.f10961d == z3) {
            return;
        }
        this.f10964g.b(z3 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f10961d = z3;
        b();
    }

    public void j() {
        this.f10964g.b(c.a.ON_HOLDER_ATTACH);
        this.f10960c = true;
        b();
    }

    public void k() {
        this.f10964g.b(c.a.ON_HOLDER_DETACH);
        this.f10960c = false;
        b();
    }

    public boolean l(MotionEvent motionEvent) {
        if (h()) {
            return this.f10963f.d(motionEvent);
        }
        return false;
    }

    public void m(Context context) {
    }

    public void n() {
        o(null);
    }

    public void o(a aVar) {
        boolean z3 = this.f10959b;
        if (z3) {
            d();
        }
        if (h()) {
            this.f10964g.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f10963f.c(null);
        }
        this.f10963f = aVar;
        if (aVar != null) {
            this.f10964g.b(c.a.ON_SET_CONTROLLER);
            this.f10963f.c(this.f10962e);
        } else {
            this.f10964g.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z3) {
            a();
        }
    }

    @Override // p077t0.G
    public void onDraw() {
        if (this.f10959b) {
            return;
        }
        Y.a.G(c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f10963f)), toString());
        this.f10960c = true;
        this.f10961d = true;
        b();
    }

    public void p(p089w0.b bVar) {
        this.f10964g.b(c.a.ON_SET_HIERARCHY);
        boolean zH = h();
        q(null);
        p089w0.b bVar2 = (p089w0.b) k.g(bVar);
        this.f10962e = bVar2;
        Drawable drawableD = bVar2.d();
        i(drawableD == null || drawableD.isVisible());
        q(this);
        if (zH) {
            this.f10963f.c(bVar);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f10959b).c("holderAttached", this.f10960c).c("drawableVisible", this.f10961d).b("events", this.f10964g.toString()).toString();
    }
}
