package p055n2;

import C2.l;
import D2.h;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.swmansion.gesturehandler.react.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.r;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f10010m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PointF f10011n = new PointF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f10012o = new float[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Matrix f10013p = new Matrix();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float[] f10014q = new float[2];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Comparator f10015r = new Comparator() { // from class: n2.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i.t((C0478d) obj, (C0478d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f10016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f10017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f10018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f10020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f10021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f10022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet f10023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10027l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(C0478d c0478d, C0478d c0478d2) {
            return c0478d == c0478d2 || c0478d.J0(c0478d2) || c0478d2.J0(c0478d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(int i3) {
            return i3 == 3 || i3 == 1 || i3 == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float f3, float f4, View view) {
            return 0.0f <= f3 && f3 <= ((float) view.getWidth()) && 0.0f <= f4 && f4 <= ((float) view.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(C0478d c0478d, C0478d c0478d2) {
            if (!c0478d.W(c0478d2) || h(c0478d, c0478d2)) {
                return false;
            }
            if (c0478d == c0478d2 || !(c0478d.Y() || c0478d.Q() == 4)) {
                return true;
            }
            return c0478d.I0(c0478d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(C0478d c0478d, C0478d c0478d2) {
            return c0478d != c0478d2 && (c0478d.L0(c0478d2) || c0478d2.K0(c0478d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(float f3, float f4, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f3 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f4 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = i.f10012o;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(i.f10013p);
                i.f10013p.mapPoints(fArr);
                float f5 = fArr[0];
                scrollY = fArr[1];
                scrollX = f5;
            }
            pointF.set(scrollX, scrollY);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10028a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10028a = iArr;
        }
    }

    public i(ViewGroup viewGroup, j jVar, D d4) {
        h.f(viewGroup, "wrapperView");
        h.f(jVar, "handlerRegistry");
        h.f(d4, "viewConfigHelper");
        this.f10016a = viewGroup;
        this.f10017b = jVar;
        this.f10018c = d4;
        this.f10020e = new ArrayList();
        this.f10021f = new ArrayList();
        this.f10022g = new ArrayList();
        this.f10023h = new HashSet();
    }

    private final void C(C0478d c0478d, View view) {
        if (this.f10020e.contains(c0478d)) {
            return;
        }
        this.f10020e.add(c0478d);
        c0478d.t0(false);
        c0478d.u0(false);
        c0478d.s0(Integer.MAX_VALUE);
        c0478d.m0(view, this);
    }

    private final boolean D(View view, float[] fArr, int i3, MotionEvent motionEvent) {
        boolean z3;
        ArrayList arrayListA = this.f10017b.a(view);
        if (arrayListA != null) {
            synchronized (arrayListA) {
                try {
                    Iterator it = arrayListA.iterator();
                    h.e(it, "iterator(...)");
                    z3 = false;
                    while (it.hasNext()) {
                        C0478d c0478d = (C0478d) it.next();
                        if (c0478d.b0() && c0478d.d0(view, fArr[0], fArr[1]) && !I(c0478d, motionEvent.getAction())) {
                            C(c0478d, view);
                            c0478d.M0(i3);
                            z3 = true;
                        }
                    }
                    r rVar = r.f10603a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z3 = false;
        }
        float width = view.getWidth();
        float f3 = fArr[0];
        if (0.0f <= f3 && f3 <= width) {
            float height = view.getHeight();
            float f4 = fArr[1];
            if (0.0f <= f4 && f4 <= height && y(view) && p(view, fArr, i3)) {
                return true;
            }
        }
        return z3;
    }

    private final void E() {
        if (this.f10024i || this.f10025j != 0) {
            this.f10026k = true;
        } else {
            l();
        }
    }

    private final boolean G(C0478d c0478d) {
        ArrayList<C0478d> arrayList = this.f10020e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C0478d c0478d2 : arrayList) {
            if (c0478d.W(c0478d2) && c0478d2.Q() == 4 && !f10010m.h(c0478d, c0478d2) && c0478d.a0(c0478d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(C0478d c0478d) {
        ArrayList<C0478d> arrayList = this.f10020e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C0478d c0478d2 : arrayList) {
            if (f10010m.l(c0478d, c0478d2) && c0478d2.Q() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(C0478d c0478d, int i3) {
        return ((c0478d instanceof m) || (c0478d instanceof j.b) || !AbstractC0492n.j(10, 9, 7).contains(Integer.valueOf(i3))) ? false : true;
    }

    private final boolean L(View view, float[] fArr, int i3, MotionEvent motionEvent) {
        int i4 = b.f10028a[this.f10018c.a(view).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new p071r2.h();
                    }
                    boolean zR = view instanceof ViewGroup ? r((ViewGroup) view, fArr, i3, motionEvent) : false;
                    if (D(view, fArr, i3, motionEvent) || zR || f10010m.m(view, fArr)) {
                        return true;
                    }
                } else {
                    if (view instanceof ViewGroup) {
                        boolean zR2 = r((ViewGroup) view, fArr, i3, motionEvent);
                        if (!zR2) {
                            return zR2;
                        }
                        D(view, fArr, i3, motionEvent);
                        return zR2;
                    }
                    if (view instanceof EditText) {
                        return D(view, fArr, i3, motionEvent);
                    }
                }
            } else if (D(view, fArr, i3, motionEvent) || f10010m.m(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    private final void M(C0478d c0478d) {
        if (H(c0478d) || G(c0478d)) {
            c0478d.o();
        } else if (u(c0478d)) {
            h(c0478d);
        } else {
            z(c0478d);
            c0478d.u0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r g(C0478d c0478d) {
        q qVar = (q) c0478d;
        qVar.n();
        qVar.i();
        qVar.z();
        return r.f10603a;
    }

    private final void h(C0478d c0478d) {
        if (this.f10021f.contains(c0478d)) {
            return;
        }
        this.f10021f.add(c0478d);
        this.f10023h.add(Integer.valueOf(c0478d.R()));
        c0478d.u0(true);
        int i3 = this.f10027l;
        this.f10027l = i3 + 1;
        c0478d.s0(i3);
    }

    private final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f10019d;
    }

    private final void j() {
        Iterator it = AbstractC0492n.Y(this.f10021f).iterator();
        while (it.hasNext()) {
            ((C0478d) it.next()).o();
        }
        this.f10022g.clear();
        this.f10022g.addAll(this.f10020e);
        Iterator it2 = AbstractC0492n.Y(this.f10020e).iterator();
        while (it2.hasNext()) {
            ((C0478d) it2.next()).o();
        }
    }

    private final void k() {
        for (C0478d c0478d : AbstractC0492n.e0(this.f10021f)) {
            if (!c0478d.Y()) {
                this.f10021f.remove(c0478d);
                this.f10023h.remove(Integer.valueOf(c0478d.R()));
            }
        }
    }

    private final void l() {
        for (C0478d c0478d : AbstractC0492n.C(this.f10020e)) {
            if (f10010m.i(c0478d.Q()) && !c0478d.Y()) {
                c0478d.n0();
                c0478d.t0(false);
                c0478d.u0(false);
                c0478d.s0(Integer.MAX_VALUE);
            }
        }
        AbstractC0492n.x(this.f10020e, new l() { // from class: n2.g
            @Override // C2.l
            public final Object d(Object obj) {
                return Boolean.valueOf(i.m((C0478d) obj));
            }
        });
        this.f10026k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(C0478d c0478d) {
        h.f(c0478d, "it");
        return f10010m.i(c0478d.Q()) && !c0478d.Y();
    }

    private final void n(C0478d c0478d, MotionEvent motionEvent) {
        if (!x(c0478d.U())) {
            c0478d.o();
            return;
        }
        if (c0478d.Q0()) {
            int actionMasked = motionEvent.getActionMasked();
            View viewU = c0478d.U();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            h.e(motionEventObtain, "obtain(...)");
            MotionEvent motionEventJ = J(viewU, motionEventObtain);
            if (c0478d.L() && c0478d.Q() != 0) {
                c0478d.P0(motionEventJ, motionEvent);
            }
            if (!c0478d.Y() || actionMasked != 2) {
                boolean z3 = c0478d.Q() == 0;
                c0478d.V(motionEventJ, motionEvent);
                if (c0478d.X()) {
                    if (c0478d.P()) {
                        c0478d.F0(false);
                        c0478d.p0();
                    }
                    c0478d.t(motionEventJ);
                }
                if (c0478d.L() && z3) {
                    c0478d.P0(motionEventJ, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    c0478d.N0(motionEventJ.getPointerId(motionEventJ.getActionIndex()));
                }
            }
            motionEventJ.recycle();
        }
    }

    private final void o(MotionEvent motionEvent) {
        this.f10022g.clear();
        this.f10022g.addAll(this.f10020e);
        AbstractC0492n.s(this.f10022g, f10015r);
        Iterator it = this.f10022g.iterator();
        h.e(it, "iterator(...)");
        while (it.hasNext()) {
            n((C0478d) it.next(), motionEvent);
        }
    }

    private final boolean p(View view, float[] fArr, int i3) {
        boolean z3 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList arrayListA = this.f10017b.a((View) parent);
                if (arrayListA != null) {
                    synchronized (arrayListA) {
                        try {
                            Iterator it = arrayListA.iterator();
                            h.e(it, "iterator(...)");
                            while (it.hasNext()) {
                                C0478d c0478d = (C0478d) it.next();
                                if (c0478d.b0() && c0478d.d0(view, fArr[0], fArr[1])) {
                                    C(c0478d, viewGroup);
                                    c0478d.M0(i3);
                                    z3 = true;
                                }
                            }
                            r rVar = r.f10603a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z3;
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f10014q;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        L(this.f10016a, fArr, pointerId, motionEvent);
        r(this.f10016a, fArr, pointerId, motionEvent);
    }

    private final boolean r(ViewGroup viewGroup, float[] fArr, int i3, MotionEvent motionEvent) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View viewB = this.f10018c.b(viewGroup, childCount);
            if (i(viewB)) {
                PointF pointF = f10011n;
                a aVar = f10010m;
                aVar.n(fArr[0], fArr[1], viewGroup, viewB, pointF);
                float f3 = fArr[0];
                float f4 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zL = (!w(viewB) || aVar.j(fArr[0], fArr[1], viewB)) ? L(viewB, fArr, i3, motionEvent) : false;
                fArr[0] = f3;
                fArr[1] = f4;
                if (zL) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(C0478d c0478d, C0478d c0478d2) {
        if ((c0478d.X() && c0478d2.X()) || (c0478d.Y() && c0478d2.Y())) {
            return Integer.signum(c0478d2.E() - c0478d.E());
        }
        if (!c0478d.X()) {
            if (!c0478d2.X()) {
                if (!c0478d.Y()) {
                    if (!c0478d2.Y()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    private final boolean u(C0478d c0478d) {
        ArrayList<C0478d> arrayList = this.f10020e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C0478d c0478d2 : arrayList) {
            a aVar = f10010m;
            if (!aVar.i(c0478d2.Q()) && aVar.l(c0478d, c0478d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.f10018c.c((ViewGroup) view);
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f10016a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f10016a) {
            parent = parent.getParent();
        }
        return parent == this.f10016a;
    }

    private final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f10012o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void z(C0478d c0478d) {
        int iQ = c0478d.Q();
        c0478d.u0(false);
        c0478d.t0(true);
        c0478d.F0(true);
        int i3 = this.f10027l;
        this.f10027l = i3 + 1;
        c0478d.s0(i3);
        for (C0478d c0478d2 : AbstractC0492n.C(this.f10020e)) {
            if (f10010m.k(c0478d2, c0478d)) {
                c0478d2.o();
            }
        }
        for (C0478d c0478d3 : AbstractC0492n.Y(this.f10021f)) {
            if (f10010m.k(c0478d3, c0478d)) {
                c0478d3.u0(false);
            }
        }
        k();
        if (iQ == 1 || iQ == 3) {
            return;
        }
        c0478d.u(4, 2);
        if (iQ != 4) {
            c0478d.u(5, 4);
            if (iQ != 5) {
                c0478d.u(0, 5);
            }
        }
    }

    public final void A(C0478d c0478d, int i3, int i4) {
        h.f(c0478d, "handler");
        this.f10025j++;
        if (f10010m.i(i3)) {
            for (C0478d c0478d2 : AbstractC0492n.e0(this.f10021f)) {
                if (f10010m.l(c0478d2, c0478d) && this.f10023h.contains(Integer.valueOf(c0478d2.R()))) {
                    if (i3 == 5) {
                        c0478d2.o();
                        if (c0478d2.Q() == 5) {
                            c0478d2.u(3, 2);
                        }
                        c0478d2.u0(false);
                    } else {
                        M(c0478d2);
                    }
                }
            }
            k();
        }
        if (i3 == 4) {
            M(c0478d);
        } else if (i4 == 4 || i4 == 5) {
            if (c0478d.X()) {
                c0478d.u(i3, i4);
            } else if (i4 == 4 && (i3 == 3 || i3 == 1)) {
                c0478d.u(i3, 2);
            }
        } else if (i4 != 0 || i3 != 3) {
            c0478d.u(i3, i4);
        }
        this.f10025j--;
        E();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public final boolean B(MotionEvent motionEvent) {
        h.f(motionEvent, "event");
        this.f10024i = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            q(motionEvent);
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5 || actionMasked == 7) {
            q(motionEvent);
        }
        o(motionEvent);
        this.f10024i = false;
        if (this.f10026k && this.f10025j == 0) {
            l();
        }
        return true;
    }

    public final void F(float f3) {
        this.f10019d = f3;
    }

    public final MotionEvent J(View view, MotionEvent motionEvent) {
        h.f(motionEvent, "event");
        if (view == null) {
            return motionEvent;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!h.b(viewGroup, this.f10016a)) {
            J(viewGroup, motionEvent);
        }
        if (viewGroup != null) {
            motionEvent.setLocation((motionEvent.getX() + viewGroup.getScrollX()) - view.getLeft(), (motionEvent.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f10013p;
            matrix.invert(matrix2);
            motionEvent.transform(matrix2);
        }
        return motionEvent;
    }

    public final PointF K(View view, PointF pointF) {
        h.f(pointF, "point");
        if (view == null) {
            return pointF;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!h.b(viewGroup, this.f10016a)) {
            K(viewGroup, pointF);
        }
        if (viewGroup != null) {
            pointF.x += viewGroup.getScrollX() - view.getLeft();
            pointF.y += viewGroup.getScrollY() - view.getTop();
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f10013p;
            matrix.invert(matrix2);
            float[] fArr = f10014q;
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
            matrix2.mapPoints(fArr);
            pointF.x = fArr[0];
            pointF.y = fArr[1];
        }
        return pointF;
    }

    public final void f(View view) {
        h.f(view, "view");
        ArrayList<C0478d> arrayListA = this.f10017b.a(view);
        if (arrayListA != null) {
            for (final C0478d c0478d : arrayListA) {
                if (c0478d instanceof q) {
                    C(c0478d, view);
                    ((q) c0478d).R0(new C2.a() { // from class: n2.h
                        @Override // C2.a
                        public final Object a() {
                            return i.g(c0478d);
                        }
                    });
                }
            }
        }
    }

    public final ArrayList s(View view) {
        h.f(view, "view");
        return this.f10017b.a(view);
    }

    public final boolean v() {
        ArrayList arrayList = this.f10020e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C0478d) it.next()).Q() == 4) {
                return true;
            }
        }
        return false;
    }
}
