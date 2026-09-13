package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.InterfaceC0271z;
import androidx.lifecycle.AbstractC0292g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0281j extends ComponentActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f5148A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final C0285n f5149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final androidx.lifecycle.m f5150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f5151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f5152z;

    /* JADX INFO: renamed from: androidx.fragment.app.j$a */
    class a extends p implements androidx.core.content.c, androidx.core.content.d, androidx.core.app.j, androidx.core.app.k, androidx.lifecycle.H, androidx.activity.o, androidx.activity.result.f, G.d, B, InterfaceC0271z {
        public a() {
            super(ActivityC0281j.this);
        }

        public void A() {
            ActivityC0281j.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.p
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public ActivityC0281j w() {
            return ActivityC0281j.this;
        }

        @Override // androidx.activity.o
        public OnBackPressedDispatcher a() {
            return ActivityC0281j.this.a();
        }

        @Override // G.d
        public androidx.savedstate.a b() {
            return ActivityC0281j.this.b();
        }

        @Override // androidx.fragment.app.B
        public void c(x xVar, Fragment fragment) {
            ActivityC0281j.this.b0(fragment);
        }

        @Override // androidx.core.view.InterfaceC0271z
        public void d(androidx.core.view.C c4) {
            ActivityC0281j.this.d(c4);
        }

        @Override // androidx.fragment.app.p, androidx.fragment.app.AbstractC0283l
        public View f(int i3) {
            return ActivityC0281j.this.findViewById(i3);
        }

        @Override // androidx.core.app.j
        public void g(p064q.a aVar) {
            ActivityC0281j.this.g(aVar);
        }

        @Override // androidx.fragment.app.p, androidx.fragment.app.AbstractC0283l
        public boolean h() {
            Window window = ActivityC0281j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.core.content.c
        public void i(p064q.a aVar) {
            ActivityC0281j.this.i(aVar);
        }

        @Override // androidx.core.app.k
        public void l(p064q.a aVar) {
            ActivityC0281j.this.l(aVar);
        }

        @Override // androidx.core.view.InterfaceC0271z
        public void n(androidx.core.view.C c4) {
            ActivityC0281j.this.n(c4);
        }

        @Override // androidx.activity.result.f
        public androidx.activity.result.e o() {
            return ActivityC0281j.this.o();
        }

        @Override // androidx.fragment.app.p
        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0281j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.app.j
        public void q(p064q.a aVar) {
            ActivityC0281j.this.q(aVar);
        }

        @Override // androidx.core.content.c
        public void r(p064q.a aVar) {
            ActivityC0281j.this.r(aVar);
        }

        @Override // androidx.lifecycle.H
        public androidx.lifecycle.G s() {
            return ActivityC0281j.this.s();
        }

        @Override // androidx.lifecycle.l
        public AbstractC0292g t() {
            return ActivityC0281j.this.f5150x;
        }

        @Override // androidx.core.app.k
        public void u(p064q.a aVar) {
            ActivityC0281j.this.u(aVar);
        }

        @Override // androidx.core.content.d
        public void v(p064q.a aVar) {
            ActivityC0281j.this.v(aVar);
        }

        @Override // androidx.core.content.d
        public void x(p064q.a aVar) {
            ActivityC0281j.this.x(aVar);
        }

        @Override // androidx.fragment.app.p
        public LayoutInflater y() {
            return ActivityC0281j.this.getLayoutInflater().cloneInContext(ActivityC0281j.this);
        }

        @Override // androidx.fragment.app.p
        public void z() {
            A();
        }
    }

    public ActivityC0281j() {
        this.f5149w = C0285n.b(new a());
        this.f5150x = new androidx.lifecycle.m(this);
        this.f5148A = true;
        U();
    }

    private void U() {
        b().h("android:support:lifecycle", new androidx.savedstate.a.c() { // from class: androidx.fragment.app.f
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return this.f5144a.V();
            }
        });
        r(new p064q.a() { // from class: androidx.fragment.app.g
            @Override // p064q.a
            public final void a(Object obj) {
                this.f5145a.W((Configuration) obj);
            }
        });
        F(new p064q.a() { // from class: androidx.fragment.app.h
            @Override // p064q.a
            public final void a(Object obj) {
                this.f5146a.X((Intent) obj);
            }
        });
        E(new p000a.b() { // from class: androidx.fragment.app.i
            @Override // p000a.b
            public final void a(Context context) {
                this.f5147a.Y(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle V() {
        Z();
        this.f5150x.h(AbstractC0292g.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Configuration configuration) {
        this.f5149w.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(Intent intent) {
        this.f5149w.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Context context) {
        this.f5149w.a(null);
    }

    private static boolean a0(x xVar, AbstractC0292g.b bVar) {
        boolean zA0 = false;
        for (Fragment fragment : xVar.s0()) {
            if (fragment != null) {
                if (fragment.z() != null) {
                    zA0 |= a0(fragment.o(), bVar);
                }
                J j3 = fragment.f4931U;
                if (j3 != null && j3.t().b().b(AbstractC0292g.b.STARTED)) {
                    fragment.f4931U.h(bVar);
                    zA0 = true;
                }
                if (fragment.f4930T.b().b(AbstractC0292g.b.STARTED)) {
                    fragment.f4930T.m(bVar);
                    zA0 = true;
                }
            }
        }
        return zA0;
    }

    final View S(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f5149w.n(view, str, context, attributeSet);
    }

    public x T() {
        return this.f5149w.l();
    }

    void Z() {
        while (a0(T(), AbstractC0292g.b.CREATED)) {
        }
    }

    public void b0(Fragment fragment) {
    }

    protected void c0() {
        this.f5150x.h(AbstractC0292g.a.ON_RESUME);
        this.f5149w.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (y(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f5151y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f5152z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f5148A);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f5149w.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        this.f5149w.m();
        super.onActivityResult(i3, i4, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5150x.h(AbstractC0292g.a.ON_CREATE);
        this.f5149w.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewS = S(view, str, context, attributeSet);
        return viewS == null ? super.onCreateView(view, str, context, attributeSet) : viewS;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f5149w.f();
        this.f5150x.h(AbstractC0292g.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return this.f5149w.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f5152z = false;
        this.f5149w.g();
        this.f5150x.h(AbstractC0292g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        c0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f5149w.m();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f5149w.m();
        super.onResume();
        this.f5152z = true;
        this.f5149w.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f5149w.m();
        super.onStart();
        this.f5148A = false;
        if (!this.f5151y) {
            this.f5151y = true;
            this.f5149w.c();
        }
        this.f5149w.k();
        this.f5150x.h(AbstractC0292g.a.ON_START);
        this.f5149w.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f5149w.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f5148A = true;
        Z();
        this.f5149w.j();
        this.f5150x.h(AbstractC0292g.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewS = S(null, str, context, attributeSet);
        return viewS == null ? super.onCreateView(str, context, attributeSet) : viewS;
    }

    public ActivityC0281j(int i3) {
        super(i3);
        this.f5149w = C0285n.b(new a());
        this.f5150x = new androidx.lifecycle.m(this);
        this.f5148A = true;
        U();
    }
}
