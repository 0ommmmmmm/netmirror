package p092x;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC0243g0;
import androidx.core.view.C0230a;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.List;
import p044l.h;
import p068r.v;
import p068r.w;
import p068r.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C0230a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f10915n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final x.b.a f10916o = new C0152a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p092x.b.InterfaceC0153b f10917p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f10922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f10923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f10924j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f10918d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f10919e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f10920f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f10921g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f10925k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f10926l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10927m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x.a$a, reason: collision with other inner class name */
    static class C0152a implements x.b.a {
        C0152a() {
        }

        @Override // x.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Rect rect) {
            vVar.m(rect);
        }
    }

    static class b implements p092x.b.InterfaceC0153b {
        b() {
        }

        @Override // p092x.b.InterfaceC0153b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(h hVar, int i3) {
            return (v) hVar.p(i3);
        }

        @Override // p092x.b.InterfaceC0153b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(h hVar) {
            return hVar.n();
        }
    }

    private class c extends w {
        c() {
        }

        @Override // p068r.w
        public v b(int i3) {
            return v.e0(a.this.F(i3));
        }

        @Override // p068r.w
        public v d(int i3) {
            int i4 = i3 == 2 ? a.this.f10925k : a.this.f10926l;
            if (i4 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i4);
        }

        @Override // p068r.w
        public boolean f(int i3, int i4, Bundle bundle) {
            return a.this.N(i3, i4, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f10923i = view;
        this.f10922h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (Z.r(view) == 0) {
            Z.f0(view, 1);
        }
    }

    private static Rect B(View view, int i3, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i3 == 17) {
            rect.set(width, 0, width, height);
        } else if (i3 == 33) {
            rect.set(0, height, width, height);
        } else if (i3 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean C(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f10923i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f10923i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int D(int i3) {
        if (i3 == 19) {
            return 33;
        }
        if (i3 != 21) {
            return i3 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean E(int i3, Rect rect) {
        v vVar;
        h hVarX = x();
        int i4 = this.f10926l;
        v vVar2 = i4 == Integer.MIN_VALUE ? null : (v) hVarX.g(i4);
        if (i3 == 1 || i3 == 2) {
            vVar = (v) p092x.b.d(hVarX, f10917p, f10916o, vVar2, i3, Z.s(this.f10923i) == 1, false);
        } else {
            if (i3 != 17 && i3 != 33 && i3 != 66 && i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i5 = this.f10926l;
            if (i5 != Integer.MIN_VALUE) {
                y(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                B(this.f10923i, i3, rect2);
            }
            vVar = (v) p092x.b.c(hVarX, f10917p, f10916o, vVar2, rect2, i3);
        }
        return R(vVar != null ? hVarX.l(hVarX.k(vVar)) : Integer.MIN_VALUE);
    }

    private boolean O(int i3, int i4, Bundle bundle) {
        if (i4 == 1) {
            return R(i3);
        }
        if (i4 == 2) {
            return o(i3);
        }
        if (i4 != 64) {
            return i4 != 128 ? H(i3, i4, bundle) : n(i3);
        }
        return Q(i3);
    }

    private boolean P(int i3, Bundle bundle) {
        return Z.P(this.f10923i, i3, bundle);
    }

    private boolean Q(int i3) {
        int i4;
        if (!this.f10922h.isEnabled() || !this.f10922h.isTouchExplorationEnabled() || (i4 = this.f10925k) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            n(i4);
        }
        this.f10925k = i3;
        this.f10923i.invalidate();
        S(i3, 32768);
        return true;
    }

    private void T(int i3) {
        int i4 = this.f10927m;
        if (i4 == i3) {
            return;
        }
        this.f10927m = i3;
        S(i3, 128);
        S(i4, 256);
    }

    private boolean n(int i3) {
        if (this.f10925k != i3) {
            return false;
        }
        this.f10925k = Integer.MIN_VALUE;
        this.f10923i.invalidate();
        S(i3, 65536);
        return true;
    }

    private boolean p() {
        int i3 = this.f10926l;
        return i3 != Integer.MIN_VALUE && H(i3, 16, null);
    }

    private AccessibilityEvent q(int i3, int i4) {
        return i3 != -1 ? r(i3, i4) : s(i4);
    }

    private AccessibilityEvent r(int i3, int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        v vVarF = F(i3);
        accessibilityEventObtain.getText().add(vVarF.E());
        accessibilityEventObtain.setContentDescription(vVarF.u());
        accessibilityEventObtain.setScrollable(vVarF.Y());
        accessibilityEventObtain.setPassword(vVarF.W());
        accessibilityEventObtain.setEnabled(vVarF.Q());
        accessibilityEventObtain.setChecked(vVarF.N());
        J(i3, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(vVarF.q());
        x.c(accessibilityEventObtain, this.f10923i, i3);
        accessibilityEventObtain.setPackageName(this.f10923i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        this.f10923i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private v t(int i3) {
        v vVarC0 = v.c0();
        vVarC0.u0(true);
        vVarC0.v0(true);
        vVarC0.p0("android.view.View");
        Rect rect = f10915n;
        vVarC0.l0(rect);
        vVarC0.m0(rect);
        vVarC0.C0(this.f10923i);
        L(i3, vVarC0);
        if (vVarC0.E() == null && vVarC0.u() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        vVarC0.m(this.f10919e);
        if (this.f10919e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = vVarC0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        vVarC0.A0(this.f10923i.getContext().getPackageName());
        vVarC0.K0(this.f10923i, i3);
        if (this.f10925k == i3) {
            vVarC0.j0(true);
            vVarC0.a(128);
        } else {
            vVarC0.j0(false);
            vVarC0.a(64);
        }
        boolean z3 = this.f10926l == i3;
        if (z3) {
            vVarC0.a(2);
        } else if (vVarC0.R()) {
            vVarC0.a(1);
        }
        vVarC0.w0(z3);
        this.f10923i.getLocationOnScreen(this.f10921g);
        vVarC0.n(this.f10918d);
        if (this.f10918d.equals(rect)) {
            vVarC0.m(this.f10918d);
            if (vVarC0.f10454b != -1) {
                v vVarC1 = v.c0();
                for (int i4 = vVarC0.f10454b; i4 != -1; i4 = vVarC1.f10454b) {
                    vVarC1.D0(this.f10923i, -1);
                    vVarC1.l0(f10915n);
                    L(i4, vVarC1);
                    vVarC1.m(this.f10919e);
                    Rect rect2 = this.f10918d;
                    Rect rect3 = this.f10919e;
                    rect2.offset(rect3.left, rect3.top);
                }
                vVarC1.g0();
            }
            this.f10918d.offset(this.f10921g[0] - this.f10923i.getScrollX(), this.f10921g[1] - this.f10923i.getScrollY());
        }
        if (this.f10923i.getLocalVisibleRect(this.f10920f)) {
            this.f10920f.offset(this.f10921g[0] - this.f10923i.getScrollX(), this.f10921g[1] - this.f10923i.getScrollY());
            if (this.f10918d.intersect(this.f10920f)) {
                vVarC0.m0(this.f10918d);
                if (C(this.f10918d)) {
                    vVarC0.O0(true);
                }
            }
        }
        return vVarC0;
    }

    private v u() {
        v vVarD0 = v.d0(this.f10923i);
        Z.N(this.f10923i, vVarD0);
        ArrayList arrayList = new ArrayList();
        A(arrayList);
        if (vVarD0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            vVarD0.d(this.f10923i, ((Integer) arrayList.get(i3)).intValue());
        }
        return vVarD0;
    }

    private h x() {
        ArrayList arrayList = new ArrayList();
        A(arrayList);
        h hVar = new h();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hVar.m(i3, t(i3));
        }
        return hVar;
    }

    private void y(int i3, Rect rect) {
        F(i3).m(rect);
    }

    protected abstract void A(List list);

    v F(int i3) {
        return i3 == -1 ? u() : t(i3);
    }

    public final void G(boolean z3, int i3, Rect rect) {
        int i4 = this.f10926l;
        if (i4 != Integer.MIN_VALUE) {
            o(i4);
        }
        if (z3) {
            E(i3, rect);
        }
    }

    protected abstract boolean H(int i3, int i4, Bundle bundle);

    protected void I(AccessibilityEvent accessibilityEvent) {
    }

    protected void J(int i3, AccessibilityEvent accessibilityEvent) {
    }

    protected void K(v vVar) {
    }

    protected abstract void L(int i3, v vVar);

    protected void M(int i3, boolean z3) {
    }

    boolean N(int i3, int i4, Bundle bundle) {
        return i3 != -1 ? O(i3, i4, bundle) : P(i4, bundle);
    }

    public final boolean R(int i3) {
        int i4;
        if ((!this.f10923i.isFocused() && !this.f10923i.requestFocus()) || (i4 = this.f10926l) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            o(i4);
        }
        this.f10926l = i3;
        M(i3, true);
        S(i3, 8);
        return true;
    }

    public final boolean S(int i3, int i4) {
        ViewParent parent;
        if (i3 == Integer.MIN_VALUE || !this.f10922h.isEnabled() || (parent = this.f10923i.getParent()) == null) {
            return false;
        }
        return AbstractC0243g0.h(parent, this.f10923i, q(i3, i4));
    }

    @Override // androidx.core.view.C0230a
    public w b(View view) {
        if (this.f10924j == null) {
            this.f10924j = new c();
        }
        return this.f10924j;
    }

    @Override // androidx.core.view.C0230a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        I(accessibilityEvent);
    }

    @Override // androidx.core.view.C0230a
    public void g(View view, v vVar) {
        super.g(view, vVar);
        K(vVar);
    }

    public final boolean o(int i3) {
        if (this.f10926l != i3) {
            return false;
        }
        this.f10926l = Integer.MIN_VALUE;
        M(i3, false);
        S(i3, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f10922h.isEnabled() || !this.f10922h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iZ = z(motionEvent.getX(), motionEvent.getY());
            T(iZ);
            return iZ != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f10927m == Integer.MIN_VALUE) {
            return false;
        }
        T(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i3 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return E(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return E(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iD = D(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z3 = false;
                    while (i3 < repeatCount && E(iD, null)) {
                        i3++;
                        z3 = true;
                    }
                    return z3;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    protected abstract int z(float f3, float f4);
}
