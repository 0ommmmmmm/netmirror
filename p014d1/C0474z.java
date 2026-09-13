package p014d1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.K;
import com.facebook.react.devsupport.k0;
import p042k1.e;
import p062p1.a;
import p070r1.b;

/* JADX INFO: renamed from: d1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0474z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f9324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f9325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f9327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private K f9328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private N f9329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A f9330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f9331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9332i;

    @Deprecated
    public C0474z(Activity activity, N n3, String str, Bundle bundle) {
        this.f9332i = b.f();
        this.f9324a = activity;
        this.f9326c = str;
        this.f9327d = bundle;
        this.f9328e = new K();
        this.f9329f = n3;
    }

    private e b() {
        A a4;
        if (b.c() && (a4 = this.f9330g) != null && a4.b() != null) {
            return this.f9330g.b();
        }
        if (!d().v() || d().o() == null) {
            return null;
        }
        return d().o().D();
    }

    private N d() {
        return this.f9329f;
    }

    protected a0 a() {
        a0 a0Var = new a0(this.f9324a);
        a0Var.setIsFabric(f());
        return a0Var;
    }

    public J c() {
        return d().o();
    }

    public a0 e() {
        if (!b.c()) {
            return this.f9325b;
        }
        a aVar = this.f9331h;
        if (aVar != null) {
            return (a0) aVar.a();
        }
        return null;
    }

    protected boolean f() {
        return this.f9332i;
    }

    public void g(String str) {
        if (b.c()) {
            if (this.f9331h == null) {
                this.f9331h = this.f9330g.a(this.f9324a, str, this.f9327d);
            }
            this.f9331h.start();
        } else {
            if (this.f9325b != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            a0 a0VarA = a();
            this.f9325b = a0VarA;
            a0VarA.u(d().o(), str, this.f9327d);
        }
    }

    public void h(int i3, int i4, Intent intent, boolean z3) {
        if (b.c()) {
            this.f9330g.onActivityResult(this.f9324a, i3, i4, intent);
        } else if (d().v() && z3) {
            d().o().W(this.f9324a, i3, i4, intent);
        }
    }

    public boolean i() {
        if (b.c()) {
            this.f9330g.g();
            return true;
        }
        if (!d().v()) {
            return false;
        }
        d().o().X();
        return true;
    }

    public void j(Configuration configuration) {
        if (b.c()) {
            this.f9330g.c((Context) p002a1.a.c(this.f9324a));
        } else if (d().v()) {
            c().Y((Context) p002a1.a.c(this.f9324a), configuration);
        }
    }

    public void k() {
        t();
        if (b.c()) {
            this.f9330g.h(this.f9324a);
        } else if (d().v()) {
            d().o().a0(this.f9324a);
        }
    }

    public void l() {
        if (b.c()) {
            this.f9330g.f(this.f9324a);
        } else if (d().v()) {
            d().o().c0(this.f9324a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void m() {
        if (!(this.f9324a instanceof B1.a)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (b.c()) {
            A a4 = this.f9330g;
            Activity activity = this.f9324a;
            a4.e(activity, (B1.a) activity);
        } else if (d().v()) {
            J jO = d().o();
            Activity activity2 = this.f9324a;
            jO.e0(activity2, (B1.a) activity2);
        }
    }

    public boolean n(int i3, KeyEvent keyEvent) {
        A a4;
        if (i3 != 90) {
            return false;
        }
        if ((!b.c() || (a4 = this.f9330g) == null || a4.b() == null) && !(d().v() && d().u())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean o(int i3) {
        A a4;
        if (i3 != 90) {
            return false;
        }
        if (!b.c() || (a4 = this.f9330g) == null) {
            if (!d().v() || !d().u()) {
                return false;
            }
            d().o().r0();
            return true;
        }
        e eVarB = a4.b();
        if (eVarB == null || (eVarB instanceof k0)) {
            return false;
        }
        eVarB.x();
        return true;
    }

    public boolean p(Intent intent) {
        if (b.c()) {
            this.f9330g.onNewIntent(intent);
            return true;
        }
        if (!d().v()) {
            return false;
        }
        d().o().g0(intent);
        return true;
    }

    public void q() {
        if (b.c()) {
            this.f9330g.d(this.f9324a);
        } else if (d().v()) {
            d().o().h0(this.f9324a);
        }
    }

    public void r(boolean z3) {
        if (b.c()) {
            this.f9330g.onWindowFocusChange(z3);
        } else if (d().v()) {
            d().o().i0(z3);
        }
    }

    public boolean s(int i3, KeyEvent keyEvent) {
        e eVarB = b();
        if (eVarB != null && !(eVarB instanceof k0)) {
            if (i3 == 82) {
                eVarB.x();
                return true;
            }
            if (((K) p002a1.a.c(this.f9328e)).b(i3, this.f9324a.getCurrentFocus())) {
                eVarB.s();
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (b.c()) {
            a aVar = this.f9331h;
            if (aVar != null) {
                aVar.stop();
                this.f9331h = null;
                return;
            }
            return;
        }
        a0 a0Var = this.f9325b;
        if (a0Var != null) {
            a0Var.v();
            this.f9325b = null;
        }
    }

    public C0474z(Activity activity, A a4, String str, Bundle bundle) {
        this.f9332i = b.f();
        this.f9324a = activity;
        this.f9326c = str;
        this.f9327d = bundle;
        this.f9328e = new K();
        this.f9330g = a4;
    }

    public C0474z(Activity activity, N n3, String str, Bundle bundle, boolean z3) {
        b.f();
        this.f9332i = z3;
        this.f9324a = activity;
        this.f9326c = str;
        this.f9327d = bundle;
        this.f9328e = new K();
        this.f9329f = n3;
    }
}
