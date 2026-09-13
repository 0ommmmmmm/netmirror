package p096y;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC0268w;
import androidx.core.view.C0230a;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.List;
import p068r.v;

/* JADX INFO: loaded from: classes.dex */
public class a extends ViewGroup {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f10978M = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final int[] f10979N = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final boolean f10980O = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final boolean f10981P = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Drawable f10982A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f10983B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f10984C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Object f10985D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f10986E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Drawable f10987F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Drawable f10988G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Drawable f10989H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Drawable f10990I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final ArrayList f10991J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Rect f10992K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Matrix f10993L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f10998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f10999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p092x.c f11000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p092x.c f11001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f11002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f11003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f11013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f11014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f11015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f11016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f11017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f11018z;

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    class ViewOnApplyWindowInsetsListenerC0157a implements View.OnApplyWindowInsetsListener {
        ViewOnApplyWindowInsetsListenerC0157a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends C0230a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f11020d = new Rect();

        b() {
        }

        private void n(v vVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (a.A(childAt)) {
                    vVar.c(childAt);
                }
            }
        }

        private void o(v vVar, v vVar2) {
            Rect rect = this.f11020d;
            vVar2.m(rect);
            vVar.l0(rect);
            vVar2.n(rect);
            vVar.m0(rect);
            vVar.O0(vVar2.b0());
            vVar.A0(vVar2.A());
            vVar.p0(vVar2.q());
            vVar.t0(vVar2.u());
            vVar.u0(vVar2.Q());
            vVar.q0(vVar2.O());
            vVar.v0(vVar2.R());
            vVar.w0(vVar2.S());
            vVar.j0(vVar2.L());
            vVar.I0(vVar2.Z());
            vVar.z0(vVar2.V());
            vVar.a(vVar2.k());
        }

        @Override // androidx.core.view.C0230a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = a.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = a.this.s(a.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.C0230a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.class.getName());
        }

        @Override // androidx.core.view.C0230a
        public void g(View view, v vVar) {
            if (a.f10980O) {
                super.g(view, vVar);
            } else {
                v vVarE0 = v.e0(vVar);
                super.g(view, vVarE0);
                vVar.J0(view);
                Object objX = Z.x(view);
                if (objX instanceof View) {
                    vVar.C0((View) objX);
                }
                o(vVar, vVarE0);
                vVarE0.g0();
                n(vVar, (ViewGroup) view);
            }
            vVar.p0(a.class.getName());
            vVar.v0(false);
            vVar.w0(false);
            vVar.h0(v.a.f10477d);
            vVar.h0(v.a.f10478e);
        }

        @Override // androidx.core.view.C0230a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f10980O || a.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class c extends C0230a {
        c() {
        }

        @Override // androidx.core.view.C0230a
        public void g(View view, v vVar) {
            super.g(view, vVar);
            if (a.A(view)) {
                return;
            }
            vVar.C0(null);
        }
    }

    public interface d {
        void a(int i3);

        void b(View view, float f3);

        void c(View view);

        void d(View view);
    }

    private class g extends p092x.c.AbstractC0154c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p092x.c f11032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f11033c = new RunnableC0159a();

        /* JADX INFO: renamed from: y.a$g$a, reason: collision with other inner class name */
        class RunnableC0159a implements Runnable {
            RunnableC0159a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        g(int i3) {
            this.f11031a = i3;
        }

        private void n() {
            View viewN = a.this.n(this.f11031a == 3 ? 5 : 3);
            if (viewN != null) {
                a.this.f(viewN);
            }
        }

        @Override // p092x.c.AbstractC0154c
        public int a(View view, int i3, int i4) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i3, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i3, width));
        }

        @Override // p092x.c.AbstractC0154c
        public int b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // p092x.c.AbstractC0154c
        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p092x.c.AbstractC0154c
        public void f(int i3, int i4) {
            View viewN = (i3 & 1) == 1 ? a.this.n(3) : a.this.n(5);
            if (viewN == null || a.this.r(viewN) != 0) {
                return;
            }
            this.f11032b.b(viewN, i4);
        }

        @Override // p092x.c.AbstractC0154c
        public boolean g(int i3) {
            return false;
        }

        @Override // p092x.c.AbstractC0154c
        public void h(int i3, int i4) {
            a.this.postDelayed(this.f11033c, 160L);
        }

        @Override // p092x.c.AbstractC0154c
        public void i(View view, int i3) {
            ((e) view.getLayoutParams()).f11024c = false;
            n();
        }

        @Override // p092x.c.AbstractC0154c
        public void j(int i3) {
            a.this.U(this.f11031a, i3, this.f11032b.v());
        }

        @Override // p092x.c.AbstractC0154c
        public void k(View view, int i3, int i4, int i5, int i6) {
            int width = view.getWidth();
            float width2 = (a.this.c(view, 3) ? i3 + width : a.this.getWidth() - i3) / width;
            a.this.S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            a.this.invalidate();
        }

        @Override // p092x.c.AbstractC0154c
        public void l(View view, float f3, float f4) {
            int i3;
            float fU = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                i3 = (f3 > 0.0f || (f3 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f3 < 0.0f || (f3 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i3 = width2;
            }
            this.f11032b.M(i3, view.getTop());
            a.this.invalidate();
        }

        @Override // p092x.c.AbstractC0154c
        public boolean m(View view, int i3) {
            return a.this.D(view) && a.this.c(view, this.f11031a) && a.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iW = this.f11032b.w();
            boolean z3 = this.f11031a == 3;
            if (z3) {
                viewN = a.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iW;
            } else {
                viewN = a.this.n(5);
                width = a.this.getWidth() - iW;
            }
            if (viewN != null) {
                if (((!z3 || viewN.getLeft() >= width) && (z3 || viewN.getLeft() <= width)) || a.this.r(viewN) != 0) {
                    return;
                }
                e eVar = (e) viewN.getLayoutParams();
                this.f11032b.O(viewN, width, viewN.getTop());
                eVar.f11024c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f11033c);
        }

        public void q(p092x.c cVar) {
            this.f11032b = cVar;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (Z.r(view) == 4 || Z.r(view) == 2) ? false : true;
    }

    private boolean F(float f3, float f4, View view) {
        if (this.f10992K == null) {
            this.f10992K = new Rect();
        }
        view.getHitRect(this.f10992K);
        return this.f10992K.contains((int) f3, (int) f4);
    }

    private boolean G(Drawable drawable, int i3) {
        if (drawable == null || !androidx.core.graphics.drawable.a.a(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.e(drawable, i3);
        return true;
    }

    private Drawable N() {
        int iS = Z.s(this);
        if (iS == 0) {
            Drawable drawable = this.f10987F;
            if (drawable != null) {
                G(drawable, iS);
                return this.f10987F;
            }
        } else {
            Drawable drawable2 = this.f10988G;
            if (drawable2 != null) {
                G(drawable2, iS);
                return this.f10988G;
            }
        }
        return this.f10989H;
    }

    private Drawable O() {
        int iS = Z.s(this);
        if (iS == 0) {
            Drawable drawable = this.f10988G;
            if (drawable != null) {
                G(drawable, iS);
                return this.f10988G;
            }
        } else {
            Drawable drawable2 = this.f10987F;
            if (drawable2 != null) {
                G(drawable2, iS);
                return this.f10987F;
            }
        }
        return this.f10990I;
    }

    private void P() {
        if (f10981P) {
            return;
        }
        this.f11018z = N();
        this.f10982A = O();
    }

    private void T(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((z3 || D(childAt)) && !(z3 && childAt == view)) {
                Z.f0(childAt, 4);
            } else {
                Z.f0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f10993L == null) {
                this.f10993L = new Matrix();
            }
            matrix.invert(this.f10993L);
            motionEventObtain.transform(this.f10993L);
        }
        return motionEventObtain;
    }

    static String w(int i3) {
        if ((i3 & 3) == 3) {
            return "LEFT";
        }
        return (i3 & 5) == 5 ? "RIGHT" : Integer.toHexString(i3);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((e) getChildAt(i3).getLayoutParams()).f11024c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((e) view.getLayoutParams()).f11022a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((e) view.getLayoutParams()).f11025d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int iA = AbstractC0268w.a(((e) view.getLayoutParams()).f11022a, Z.s(view));
        return ((iA & 3) == 0 && (iA & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((e) view.getLayoutParams()).f11023b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f3) {
        float fU = u(view);
        float width = view.getWidth();
        int i3 = ((int) (width * f3)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i3 = -i3;
        }
        view.offsetLeftAndRight(i3);
        S(view, f3);
    }

    public void I(int i3) {
        J(i3, true);
    }

    public void J(int i3, boolean z3) {
        View viewN = n(i3);
        if (viewN != null) {
            L(viewN, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i3));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z3) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f11006n) {
            eVar.f11023b = 1.0f;
            eVar.f11025d = 1;
            T(view, true);
        } else if (z3) {
            eVar.f11025d |= 2;
            if (c(view, 3)) {
                this.f11000h.O(view, 0, view.getTop());
            } else {
                this.f11001i.O(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            U(eVar.f11022a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(d dVar) {
        List list;
        if (dVar == null || (list = this.f11014v) == null) {
            return;
        }
        list.remove(dVar);
    }

    public void Q(Object obj, boolean z3) {
        this.f10985D = obj;
        this.f10986E = z3;
        setWillNotDraw(!z3 && getBackground() == null);
        requestLayout();
    }

    public void R(int i3, int i4) {
        View viewN;
        int iA = AbstractC0268w.a(i4, Z.s(this));
        if (i4 == 3) {
            this.f11007o = i3;
        } else if (i4 == 5) {
            this.f11008p = i3;
        } else if (i4 == 8388611) {
            this.f11009q = i3;
        } else if (i4 == 8388613) {
            this.f11010r = i3;
        }
        if (i3 != 0) {
            (iA == 3 ? this.f11000h : this.f11001i).a();
        }
        if (i3 != 1) {
            if (i3 == 2 && (viewN = n(iA)) != null) {
                K(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iA);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    void S(View view, float f3) {
        e eVar = (e) view.getLayoutParams();
        if (f3 == eVar.f11023b) {
            return;
        }
        eVar.f11023b = f3;
        l(view, f3);
    }

    void U(int i3, int i4, View view) {
        int i5;
        int iZ = this.f11000h.z();
        int iZ2 = this.f11001i.z();
        if (iZ == 1 || iZ2 == 1) {
            i5 = 1;
        } else {
            i5 = 2;
            if (iZ != 2 && iZ2 != 2) {
                i5 = 0;
            }
        }
        if (view != null && i4 == 0) {
            float f3 = ((e) view.getLayoutParams()).f11023b;
            if (f3 == 0.0f) {
                j(view);
            } else if (f3 == 1.0f) {
                k(view);
            }
        }
        if (i5 != this.f11004l) {
            this.f11004l = i5;
            List list = this.f11014v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f11014v.get(size)).a(i5);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f11014v == null) {
            this.f11014v = new ArrayList();
        }
        this.f11014v.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i3, int i4) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!D(childAt)) {
                this.f10991J.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i3, i4);
                z3 = true;
            }
        }
        if (!z3) {
            int size = this.f10991J.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) this.f10991J.get(i6);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i3, i4);
                }
            }
        }
        this.f10991J.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (o() != null || D(view)) {
            Z.f0(view, 4);
        } else {
            Z.f0(view, 1);
        }
        if (f10980O) {
            return;
        }
        Z.X(view, this.f10994b);
    }

    void b() {
        if (this.f11012t) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f11012t = true;
    }

    boolean c(View view, int i3) {
        return (t(view) & i3) == i3;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            fMax = Math.max(fMax, ((e) getChildAt(i3).getLayoutParams()).f11023b);
        }
        this.f10998f = fMax;
        boolean zM = this.f11000h.m(true);
        boolean zM2 = this.f11001i.m(true);
        if (zM || zM2) {
            Z.R(this);
        }
    }

    public void d(int i3) {
        e(i3, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f10998f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt = getChildAt(i3);
            if (F(x3, y3, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j3) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i3 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, width, getHeight());
            i3 = i4;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(iSave);
        float f3 = this.f10998f;
        if (f3 > 0.0f && zB) {
            int i6 = this.f10997e;
            this.f10999g.setColor((i6 & 16777215) | (((int) ((((-16777216) & i6) >>> 24) * f3)) << 24));
            canvas.drawRect(i3, 0.0f, width, getHeight(), this.f10999g);
        } else if (this.f11018z != null && c(view, 3)) {
            int intrinsicWidth = this.f11018z.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f11000h.w(), 1.0f));
            this.f11018z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f11018z.setAlpha((int) (fMax * 255.0f));
            this.f11018z.draw(canvas);
        } else if (this.f10982A != null && c(view, 5)) {
            int intrinsicWidth2 = this.f10982A.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f11001i.w(), 1.0f));
            this.f10982A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f10982A.setAlpha((int) (fMax2 * 255.0f));
            this.f10982A.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i3, boolean z3) {
        View viewN = n(i3);
        if (viewN != null) {
            g(viewN, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i3));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z3) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f11006n) {
            eVar.f11023b = 0.0f;
            eVar.f11025d = 0;
        } else if (z3) {
            eVar.f11025d |= 4;
            if (c(view, 3)) {
                this.f11000h.O(view, -view.getWidth(), view.getTop());
            } else {
                this.f11001i.O(view, getWidth(), view.getTop());
            }
        } else {
            H(view, 0.0f);
            U(eVar.f11022a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f10981P) {
            return this.f10995c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f11017y;
    }

    public void h() {
        i(false);
    }

    void i(boolean z3) {
        int childCount = getChildCount();
        boolean zO = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (D(childAt) && (!z3 || eVar.f11024c)) {
                zO |= c(childAt, 3) ? this.f11000h.O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f11001i.O(childAt, getWidth(), childAt.getTop());
                eVar.f11024c = false;
            }
        }
        this.f11002j.p();
        this.f11003k.p();
        if (zO) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f11025d & 1) == 1) {
            eVar.f11025d = 0;
            List list = this.f11014v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f11014v.get(size)).d(view);
                }
            }
            T(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f11025d & 1) == 0) {
            eVar.f11025d = 1;
            List list = this.f11014v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((d) this.f11014v.get(size)).c(view);
                }
            }
            T(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f3) {
        List list = this.f11014v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((d) this.f11014v.get(size)).b(view, f3);
            }
        }
    }

    View n(int i3) {
        int iA = AbstractC0268w.a(i3, Z.s(this)) & 7;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((t(childAt) & 7) == iA) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((((e) childAt.getLayoutParams()).f11025d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11006n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11006n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f10986E || this.f11017y == null) {
            return;
        }
        Object obj = this.f10985D;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f11017y.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f11017y.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        boolean zN = this.f11000h.N(motionEvent) | this.f11001i.N(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f11011s = false;
                this.f11012t = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f11011s = false;
                    this.f11012t = false;
                }
            } else if (this.f11000h.d(3)) {
                this.f11002j.p();
                this.f11003k.p();
            }
            z3 = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f11015w = x3;
            this.f11016x = y3;
            z3 = this.f10998f > 0.0f && (viewT = this.f11000h.t((int) x3, (int) y3)) != null && B(viewT);
            this.f11011s = false;
            this.f11012t = false;
        }
        return zN || z3 || y() || this.f11012t;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 4 || !z()) {
            return super.onKeyDown(i3, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 != 4) {
            return super.onKeyUp(i3, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        float f3;
        int i7;
        boolean z4 = true;
        this.f11005m = true;
        int i8 = i5 - i3;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f4 = measuredWidth;
                        i7 = (-measuredWidth) + ((int) (eVar.f11023b * f4));
                        f3 = (measuredWidth + i7) / f4;
                    } else {
                        float f5 = measuredWidth;
                        int i11 = i8 - ((int) (eVar.f11023b * f5));
                        f3 = (i8 - i11) / f5;
                        i7 = i11;
                    }
                    boolean z5 = f3 != eVar.f11023b ? z4 : false;
                    int i12 = eVar.f11022a & 112;
                    if (i12 == 16) {
                        int i13 = i6 - i4;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight;
                            }
                        }
                        childAt.layout(i7, i14, measuredWidth + i7, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i7, i18, measuredWidth + i7, measuredHeight + i18);
                    } else {
                        int i19 = i6 - i4;
                        childAt.layout(i7, (i19 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i19 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z5) {
                        S(childAt, f3);
                    }
                    int i20 = eVar.f11023b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
            i9++;
            z4 = true;
        }
        this.f11005m = false;
        this.f11006n = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z3 = this.f10985D != null && Z.q(this);
        int iS = Z.s(this);
        int childCount = getChildCount();
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z3) {
                    int iA = AbstractC0268w.a(eVar.f11022a, iS);
                    if (Z.q(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f10985D;
                        if (iA == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iA == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f10985D;
                        if (iA == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iA == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f10981P) {
                        float fO = Z.o(childAt);
                        float f3 = this.f10995c;
                        if (fO != f3) {
                            Z.e0(childAt, f3);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z6 = iT == 3;
                    if ((z6 && z4) || (!z6 && z5)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z6) {
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i3, this.f10996d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i4, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        int i3 = fVar.f11026c;
        if (i3 != 0 && (viewN = n(i3)) != null) {
            K(viewN);
        }
        int i4 = fVar.f11027d;
        if (i4 != 3) {
            R(i4, 3);
        }
        int i5 = fVar.f11028e;
        if (i5 != 3) {
            R(i5, 5);
        }
        int i6 = fVar.f11029f;
        if (i6 != 3) {
            R(i6, 8388611);
        }
        int i7 = fVar.f11030g;
        if (i7 != 3) {
            R(i7, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i3) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            e eVar = (e) getChildAt(i3).getLayoutParams();
            int i4 = eVar.f11025d;
            boolean z3 = i4 == 1;
            boolean z4 = i4 == 2;
            if (z3 || z4) {
                fVar.f11026c = eVar.f11022a;
                break;
            }
        }
        fVar.f11027d = this.f11007o;
        fVar.f11028e = this.f11008p;
        fVar.f11029f = this.f11009q;
        fVar.f11030g = this.f11010r;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View viewO;
        this.f11000h.E(motionEvent);
        this.f11001i.E(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f11015w = x3;
            this.f11016x = y3;
            this.f11011s = false;
            this.f11012t = false;
        } else if (action == 1) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            View viewT = this.f11000h.t((int) x4, (int) y4);
            if (viewT == null || !B(viewT)) {
                z3 = true;
            } else {
                float f3 = x4 - this.f11015w;
                float f4 = y4 - this.f11016x;
                int iY = this.f11000h.y();
                if ((f3 * f3) + (f4 * f4) >= iY * iY || (viewO = o()) == null || r(viewO) == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            i(z3);
            this.f11011s = false;
        } else if (action == 3) {
            i(true);
            this.f11011s = false;
            this.f11012t = false;
        }
        return true;
    }

    View p() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i3) {
        int iS = Z.s(this);
        if (i3 == 3) {
            int i4 = this.f11007o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iS == 0 ? this.f11009q : this.f11010r;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i3 == 5) {
            int i6 = this.f11008p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iS == 0 ? this.f11010r : this.f11009q;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i3 == 8388611) {
            int i8 = this.f11009q;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iS == 0 ? this.f11007o : this.f11008p;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i3 != 8388613) {
            return 0;
        }
        int i10 = this.f11010r;
        if (i10 != 3) {
            return i10;
        }
        int i11 = iS == 0 ? this.f11008p : this.f11007o;
        if (i11 != 3) {
            return i11;
        }
        return 0;
    }

    public int r(View view) {
        if (D(view)) {
            return q(((e) view.getLayoutParams()).f11022a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        this.f11011s = z3;
        if (z3) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f11005m) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i3) {
        int iA = AbstractC0268w.a(i3, Z.s(this));
        if (iA == 3) {
            return this.f10983B;
        }
        if (iA == 5) {
            return this.f10984C;
        }
        return null;
    }

    public void setDrawerElevation(float f3) {
        this.f10995c = f3;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (D(childAt)) {
                Z.e0(childAt, this.f10995c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f11013u;
        if (dVar2 != null) {
            M(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.f11013u = dVar;
    }

    public void setDrawerLockMode(int i3) {
        R(i3, 3);
        R(i3, 5);
    }

    public void setScrimColor(int i3) {
        this.f10997e = i3;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f11017y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i3) {
        this.f11017y = new ColorDrawable(i3);
        invalidate();
    }

    int t(View view) {
        return AbstractC0268w.a(((e) view.getLayoutParams()).f11022a, Z.s(this));
    }

    float u(View view) {
        return ((e) view.getLayoutParams()).f11023b;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f10994b = new c();
        this.f10997e = -1728053248;
        this.f10999g = new Paint();
        this.f11006n = true;
        this.f11007o = 3;
        this.f11008p = 3;
        this.f11009q = 3;
        this.f11010r = 3;
        this.f10987F = null;
        this.f10988G = null;
        this.f10989H = null;
        this.f10990I = null;
        setDescendantFocusability(262144);
        float f3 = getResources().getDisplayMetrics().density;
        this.f10996d = (int) ((64.0f * f3) + 0.5f);
        float f4 = 400.0f * f3;
        g gVar = new g(3);
        this.f11002j = gVar;
        g gVar2 = new g(5);
        this.f11003k = gVar2;
        p092x.c cVarN = p092x.c.n(this, 1.0f, gVar);
        this.f11000h = cVarN;
        cVarN.K(1);
        cVarN.L(f4);
        gVar.q(cVarN);
        p092x.c cVarN2 = p092x.c.n(this, 1.0f, gVar2);
        this.f11001i = cVarN2;
        cVarN2.K(2);
        cVarN2.L(f4);
        gVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        Z.f0(this, 1);
        Z.X(this, new b());
        setMotionEventSplittingEnabled(false);
        if (Z.q(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0157a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f10978M);
            try {
                this.f11017y = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f10995c = f3 * 10.0f;
        this.f10991J = new ArrayList();
    }

    public void setStatusBarBackground(int i3) {
        this.f11017y = i3 != 0 ? androidx.core.content.a.d(getContext(), i3) : null;
        invalidate();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11025d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11022a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10979N);
            this.f11022a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(int i3, int i4) {
            super(i3, i4);
            this.f11022a = 0;
        }

        public e(int i3, int i4, int i5) {
            this(i3, i4);
            this.f11022a = i5;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f11022a = 0;
            this.f11022a = eVar.f11022a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11022a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11022a = 0;
        }
    }

    protected static class f extends p088w.a {
        public static final Parcelable.Creator<f> CREATOR = new C0158a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f11028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11030g;

        /* JADX INFO: renamed from: y.a$f$a, reason: collision with other inner class name */
        static class C0158a implements Parcelable.ClassLoaderCreator {
            C0158a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i3) {
                return new f[i3];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11026c = 0;
            this.f11026c = parcel.readInt();
            this.f11027d = parcel.readInt();
            this.f11028e = parcel.readInt();
            this.f11029f = parcel.readInt();
            this.f11030g = parcel.readInt();
        }

        @Override // p088w.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f11026c);
            parcel.writeInt(this.f11027d);
            parcel.writeInt(this.f11028e);
            parcel.writeInt(this.f11029f);
            parcel.writeInt(this.f11030g);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f11026c = 0;
        }
    }
}
