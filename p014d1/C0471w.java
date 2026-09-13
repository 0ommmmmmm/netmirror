package p014d1;

import B1.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import p070r1.b;

/* JADX INFO: renamed from: d1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0471w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f9315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f9317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Callback f9318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0474z f9319e;

    /* JADX INFO: renamed from: d1.w$a */
    class a extends C0474z {
        a(Activity activity, N n3, String str, Bundle bundle, boolean z3) {
            super(activity, n3, str, bundle, z3);
        }

        @Override // p014d1.C0474z
        protected a0 a() {
            a0 a0VarD = C0471w.this.d();
            return a0VarD == null ? super.a() : a0VarD;
        }
    }

    @Deprecated
    public C0471w(Activity activity, String str) {
        this.f9315a = activity;
        this.f9316b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        String strG = g();
        Bundle bundleC = c();
        if (Build.VERSION.SDK_INT >= 26 && l()) {
            this.f9315a.getWindow().setColorMode(1);
        }
        if (b.c()) {
            this.f9319e = new C0474z(h(), i(), strG, bundleC);
        } else {
            this.f9319e = new a(h(), j(), strG, bundleC, k());
        }
        if (strG != null) {
            o(strG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(int i3, String[] strArr, int[] iArr, Object[] objArr) {
        g gVar = this.f9317c;
        if (gVar == null || !gVar.onRequestPermissionsResult(i3, strArr, iArr)) {
            return;
        }
        this.f9317c = null;
    }

    public void A() {
        this.f9319e.m();
        Callback callback = this.f9318d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f9318d = null;
        }
    }

    public void B() {
        C0474z c0474z = this.f9319e;
        if (c0474z != null) {
            c0474z.q();
        }
    }

    public void C(boolean z3) {
        this.f9319e.r(z3);
    }

    public void D(String[] strArr, int i3, g gVar) {
        this.f9317c = gVar;
        h().requestPermissions(strArr, i3);
    }

    protected Bundle c() {
        return f();
    }

    protected a0 d() {
        return null;
    }

    protected Context e() {
        return (Context) p002a1.a.c(this.f9315a);
    }

    protected Bundle f() {
        return null;
    }

    public String g() {
        return this.f9316b;
    }

    protected Activity h() {
        return (Activity) e();
    }

    public A i() {
        return ((InterfaceC0473y) h().getApplication()).b();
    }

    protected N j() {
        return ((InterfaceC0473y) h().getApplication()).a();
    }

    protected boolean k() {
        return b.f();
    }

    protected boolean l() {
        return false;
    }

    protected void o(String str) {
        this.f9319e.g(str);
        h().setContentView(this.f9319e.e());
    }

    public void p(int i3, int i4, Intent intent) {
        this.f9319e.h(i3, i4, intent, true);
    }

    public boolean q() {
        return this.f9319e.i();
    }

    public void r(Configuration configuration) {
        this.f9319e.j(configuration);
    }

    public void s(Bundle bundle) {
        p015d2.a.o(0L, "ReactActivityDelegate.onCreate::init", new Runnable() { // from class: d1.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f9310b.m();
            }
        });
    }

    public void t() {
        this.f9319e.k();
    }

    public boolean u(int i3, KeyEvent keyEvent) {
        return this.f9319e.n(i3, keyEvent);
    }

    public boolean v(int i3, KeyEvent keyEvent) {
        return this.f9319e.o(i3);
    }

    public boolean w(int i3, KeyEvent keyEvent) {
        return this.f9319e.s(i3, keyEvent);
    }

    public boolean x(Intent intent) {
        return this.f9319e.p(intent);
    }

    public void y() {
        this.f9319e.l();
    }

    public void z(final int i3, final String[] strArr, final int[] iArr) {
        this.f9318d = new Callback() { // from class: d1.v
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f9311b.n(i3, strArr, iArr, objArr);
            }
        };
    }

    public C0471w(AbstractActivityC0467s abstractActivityC0467s, String str) {
        this.f9315a = abstractActivityC0467s;
        this.f9316b = str;
    }
}
