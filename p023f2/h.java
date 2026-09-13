package p023f2;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h implements Runnable, i.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Handler f9397l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List f9398m = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f9400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WindowManager f9401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindowManager.LayoutParams f9402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f9405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p027g2.h f9406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f9407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f9408k;

    public interface a {
        void a(h hVar, View view);
    }

    public h(Activity activity) {
        this((Context) activity);
        View decorView = activity.getWindow().getDecorView();
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if ((attributes.flags & 1024) != 0 || (decorView.getSystemUiVisibility() & 4) != 0) {
            d(1024);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C(attributes.layoutInDisplayCutoutMode);
        }
        int i3 = attributes.systemUiVisibility;
        if (i3 != 0) {
            G(i3);
        }
        if (decorView.getSystemUiVisibility() != 0) {
            this.f9400c.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
        b bVar = new b(this, activity);
        this.f9405h = bVar;
        bVar.a();
    }

    private h E(View view, a aVar) {
        v(16);
        view.setClickable(true);
        view.setOnClickListener(new j(this, aVar));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        p027g2.h hVar = this.f9406i;
        if (hVar != null) {
            hVar.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        p027g2.h hVar = this.f9406i;
        if (hVar != null) {
            hVar.t();
        }
    }

    public h A(int i3) {
        this.f9404g = i3;
        if (m() && this.f9404g != 0) {
            u(this);
            r(this, this.f9404g);
        }
        return this;
    }

    public h B(int i3) {
        this.f9402e.gravity = i3;
        s();
        p(new Runnable() { // from class: f2.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f9395b.n();
            }
        });
        return this;
    }

    public h C(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9402e.layoutInDisplayCutoutMode = i3;
            s();
        }
        return this;
    }

    public h D(int i3, a aVar) {
        return E(f(i3), aVar);
    }

    public h F(boolean z3) {
        if (z3) {
            d(40);
        } else {
            v(40);
        }
        s();
        return this;
    }

    public h G(int i3) {
        this.f9402e.systemUiVisibility = i3;
        s();
        return this;
    }

    public h H(int i3) {
        this.f9402e.type = i3;
        s();
        return this;
    }

    public h I(int i3) {
        this.f9402e.y = i3;
        s();
        p(new Runnable() { // from class: f2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9396b.o();
            }
        });
        return this;
    }

    public void J() {
        if (this.f9400c.getChildCount() == 0 || this.f9402e == null) {
            throw new IllegalArgumentException("WindowParams and view cannot be empty");
        }
        if (this.f9403f) {
            K();
            return;
        }
        Context context = this.f9399b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        try {
            if (this.f9400c.getParent() != null) {
                this.f9401d.removeViewImmediate(this.f9400c);
            }
            this.f9401d.addView(this.f9400c, this.f9402e);
            this.f9403f = true;
            if (this.f9404g != 0) {
                u(this);
                r(this, this.f9404g);
            }
            p027g2.h hVar = this.f9406i;
            if (hVar != null) {
                hVar.v(this);
            }
        } catch (WindowManager.BadTokenException e4) {
            e = e4;
            e.printStackTrace();
        } catch (IllegalArgumentException e5) {
            e = e5;
            e.printStackTrace();
        } catch (IllegalStateException e6) {
            e = e6;
            e.printStackTrace();
        } catch (NullPointerException e7) {
            e = e7;
            e.printStackTrace();
        }
    }

    public void K() {
        if (m()) {
            try {
                this.f9401d.updateViewLayout(this.f9400c, this.f9402e);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // f2.i.a
    public void a(int i3) {
        p027g2.h hVar;
        if (m() && (hVar = this.f9406i) != null) {
            hVar.r();
        }
    }

    public h d(int i3) {
        WindowManager.LayoutParams layoutParams = this.f9402e;
        layoutParams.flags = i3 | layoutParams.flags;
        s();
        return this;
    }

    public void e() {
        if (this.f9403f) {
            try {
                try {
                    this.f9401d.removeViewImmediate(this.f9400c);
                    u(this);
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException e4) {
                    e4.printStackTrace();
                }
            } finally {
                this.f9403f = false;
            }
        }
    }

    public View f(int i3) {
        return this.f9400c.findViewById(i3);
    }

    public View g() {
        if (this.f9400c.getChildCount() == 0) {
            return null;
        }
        return this.f9400c.getChildAt(0);
    }

    public Context h() {
        return this.f9399b;
    }

    public View i() {
        return this.f9400c;
    }

    public int j() {
        return i().getHeight();
    }

    public int k() {
        return i().getWidth();
    }

    public WindowManager.LayoutParams l() {
        return this.f9402e;
    }

    public boolean m() {
        return this.f9403f;
    }

    public boolean p(Runnable runnable) {
        return r(runnable, 0L);
    }

    public boolean q(Runnable runnable, long j3) {
        return f9397l.postAtTime(runnable, this, j3);
    }

    public boolean r(Runnable runnable, long j3) {
        if (j3 < 0) {
            j3 = 0;
        }
        return q(runnable, SystemClock.uptimeMillis() + j3);
    }

    @Override // java.lang.Runnable
    public void run() {
        e();
    }

    public void s() {
        if (m()) {
            u(this.f9408k);
            p(this.f9408k);
        }
    }

    public void t() {
        if (m()) {
            e();
        }
        i iVar = this.f9407j;
        if (iVar != null) {
            iVar.a(this.f9399b);
        }
        b bVar = this.f9405h;
        if (bVar != null) {
            bVar.b();
        }
        this.f9399b = null;
        this.f9400c = null;
        this.f9401d = null;
        this.f9402e = null;
        this.f9405h = null;
        this.f9406i = null;
        this.f9407j = null;
        f9398m.remove(this);
    }

    public void u(Runnable runnable) {
        f9397l.removeCallbacks(runnable);
    }

    public h v(int i3) {
        WindowManager.LayoutParams layoutParams = this.f9402e;
        layoutParams.flags = (~i3) & layoutParams.flags;
        s();
        return this;
    }

    public h w(int i3) {
        this.f9402e.windowAnimations = i3;
        s();
        return this;
    }

    public h x(float f3) {
        if (f3 < 0.0f || f3 > 1.0f) {
            throw new IllegalArgumentException("amount must be a value between 0 and 1");
        }
        this.f9402e.dimAmount = f3;
        if (f3 != 0.0f) {
            d(2);
        } else {
            v(2);
        }
        s();
        return this;
    }

    public h y(int i3) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f9402e.setBlurBehindRadius(i3);
            d(4);
            s();
        }
        return this;
    }

    public h z(View view) {
        int i3;
        if (this.f9400c.getChildCount() > 0) {
            this.f9400c.removeAllViews();
        }
        this.f9400c.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        WindowManager.LayoutParams layoutParams2 = this.f9402e;
        if (layoutParams2.gravity == 0) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int i4 = ((FrameLayout.LayoutParams) layoutParams).gravity;
                if (i4 != -1) {
                    layoutParams2.gravity = i4;
                }
            } else if ((layoutParams instanceof LinearLayout.LayoutParams) && (i3 = ((LinearLayout.LayoutParams) layoutParams).gravity) != -1) {
                layoutParams2.gravity = i3;
            }
            if (layoutParams2.gravity == 0) {
                layoutParams2.gravity = 17;
            }
        }
        if (layoutParams != null) {
            int i5 = layoutParams2.width;
            if (i5 == -2 && layoutParams2.height == -2) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams.width = i5;
                layoutParams.height = layoutParams2.height;
            }
        }
        s();
        return this;
    }

    public h(Application application) {
        this((Context) application);
        if (Build.VERSION.SDK_INT >= 26) {
            H(2038);
        } else {
            H(2003);
        }
    }

    private h(Context context) {
        this.f9408k = new Runnable() { // from class: f2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f9394b.K();
            }
        };
        this.f9399b = context;
        this.f9400c = new k(context);
        this.f9401d = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9402e = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation.Toast;
        layoutParams.packageName = context.getPackageName();
        this.f9402e.flags = 40;
        f9398m.add(this);
    }
}
