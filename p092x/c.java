package p092x;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.Z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Interpolator f10933w = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10935b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f10937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f10938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f10939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f10940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f10941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f10942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f10943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f10945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f10946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f10947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private OverScroller f10950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AbstractC0154c f10951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f10952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ViewGroup f10954u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10936c = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f10955v = new b();

    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.J(0);
        }
    }

    /* JADX INFO: renamed from: x.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0154c {
        public int a(View view, int i3, int i4) {
            return 0;
        }

        public int b(View view, int i3, int i4) {
            return 0;
        }

        public int c(int i3) {
            return i3;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i3, int i4) {
        }

        public boolean g(int i3) {
            return false;
        }

        public void h(int i3, int i4) {
        }

        public void i(View view, int i3) {
        }

        public void j(int i3) {
        }

        public void k(View view, int i3, int i4, int i5, int i6) {
        }

        public void l(View view, float f3, float f4) {
        }

        public abstract boolean m(View view, int i3);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0154c abstractC0154c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0154c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10954u = viewGroup;
        this.f10951r = abstractC0154c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10948o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10935b = viewConfiguration.getScaledTouchSlop();
        this.f10946m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10947n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10950q = new OverScroller(context, f10933w);
    }

    private boolean C(int i3) {
        if (B(i3)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void F() {
        this.f10945l.computeCurrentVelocity(1000, this.f10946m);
        p(g(this.f10945l.getXVelocity(this.f10936c), this.f10947n, this.f10946m), g(this.f10945l.getYVelocity(this.f10936c), this.f10947n, this.f10946m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [x.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
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
    private void G(float f3, float f4, int i3) {
        int i4;
        boolean zC = c(f3, f4, i3, 1);
        ?? r3 = zC;
        if (c(f4, f3, i3, 4)) {
            r3 = (zC ? 1 : 0) | 4;
        }
        ?? r4 = r3;
        if (c(f3, f4, i3, 2)) {
            r4 = (r3 == true ? 1 : 0) | 2;
        }
        ?? r5 = r4;
        if (c(f4, f3, i3, 8)) {
            i4 = (r4 == true ? 1 : 0) | 8;
        }
        if (r5 == 0) {
            r5 = i4;
            return;
        }
        r5 = i4;
        int[] iArr = this.f10942i;
        iArr[i3] = (iArr[i3] | r5) == true ? 1 : 0;
        this.f10951r.f(r5, i3);
    }

    private void H(float f3, float f4, int i3) {
        s(i3);
        float[] fArr = this.f10937d;
        this.f10939f[i3] = f3;
        fArr[i3] = f3;
        float[] fArr2 = this.f10938e;
        this.f10940g[i3] = f4;
        fArr2[i3] = f4;
        this.f10941h[i3] = x((int) f3, (int) f4);
        this.f10944k |= 1 << i3;
    }

    private void I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (C(pointerId)) {
                float x3 = motionEvent.getX(i3);
                float y3 = motionEvent.getY(i3);
                this.f10939f[pointerId] = x3;
                this.f10940g[pointerId] = y3;
            }
        }
    }

    private boolean c(float f3, float f4, int i3, int i4) {
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        if ((this.f10941h[i3] & i4) != i4 || (this.f10949p & i4) == 0 || (this.f10943j[i3] & i4) == i4 || (this.f10942i[i3] & i4) == i4) {
            return false;
        }
        int i5 = this.f10935b;
        if (fAbs <= i5 && fAbs2 <= i5) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f10951r.g(i4)) {
            return (this.f10942i[i3] & i4) == 0 && fAbs > ((float) this.f10935b);
        }
        int[] iArr = this.f10943j;
        iArr[i3] = iArr[i3] | i4;
        return false;
    }

    private boolean f(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        boolean z3 = this.f10951r.d(view) > 0;
        boolean z4 = this.f10951r.e(view) > 0;
        if (z3 && z4) {
            float f5 = (f3 * f3) + (f4 * f4);
            int i3 = this.f10935b;
            return f5 > ((float) (i3 * i3));
        }
        if (z3) {
            return Math.abs(f3) > ((float) this.f10935b);
        }
        return z4 && Math.abs(f4) > ((float) this.f10935b);
    }

    private float g(float f3, float f4, float f5) {
        float fAbs = Math.abs(f3);
        if (fAbs < f4) {
            return 0.0f;
        }
        if (fAbs > f5) {
            return f3 > 0.0f ? f5 : -f5;
        }
        return f3;
    }

    private int h(int i3, int i4, int i5) {
        int iAbs = Math.abs(i3);
        if (iAbs < i4) {
            return 0;
        }
        if (iAbs > i5) {
            return i3 > 0 ? i5 : -i5;
        }
        return i3;
    }

    private void i() {
        float[] fArr = this.f10937d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f10938e, 0.0f);
        Arrays.fill(this.f10939f, 0.0f);
        Arrays.fill(this.f10940g, 0.0f);
        Arrays.fill(this.f10941h, 0);
        Arrays.fill(this.f10942i, 0);
        Arrays.fill(this.f10943j, 0);
        this.f10944k = 0;
    }

    private void j(int i3) {
        if (this.f10937d == null || !B(i3)) {
            return;
        }
        this.f10937d[i3] = 0.0f;
        this.f10938e[i3] = 0.0f;
        this.f10939f[i3] = 0.0f;
        this.f10940g[i3] = 0.0f;
        this.f10941h[i3] = 0;
        this.f10942i[i3] = 0;
        this.f10943j[i3] = 0;
        this.f10944k = (~(1 << i3)) & this.f10944k;
    }

    private int k(int i3, int i4, int i5) {
        if (i3 == 0) {
            return 0;
        }
        int width = this.f10954u.getWidth();
        float f3 = width / 2;
        float fQ = f3 + (q(Math.min(1.0f, Math.abs(i3) / width)) * f3);
        int iAbs = Math.abs(i4);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float f5;
        float f6;
        int iH = h(i5, (int) this.f10947n, (int) this.f10946m);
        int iH2 = h(i6, (int) this.f10947n, (int) this.f10946m);
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i4);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (iH != 0) {
            f3 = iAbs3;
            f4 = i7;
        } else {
            f3 = iAbs;
            f4 = i8;
        }
        float f7 = f3 / f4;
        if (iH2 != 0) {
            f5 = iAbs4;
            f6 = i7;
        } else {
            f5 = iAbs2;
            f6 = i8;
        }
        return (int) ((k(i3, iH, this.f10951r.d(view)) * f7) + (k(i4, iH2, this.f10951r.e(view)) * (f5 / f6)));
    }

    public static c n(ViewGroup viewGroup, float f3, AbstractC0154c abstractC0154c) {
        c cVarO = o(viewGroup, abstractC0154c);
        cVarO.f10935b = (int) (cVarO.f10935b * (1.0f / f3));
        return cVarO;
    }

    public static c o(ViewGroup viewGroup, AbstractC0154c abstractC0154c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0154c);
    }

    private void p(float f3, float f4) {
        this.f10953t = true;
        this.f10951r.l(this.f10952s, f3, f4);
        this.f10953t = false;
        if (this.f10934a == 1) {
            J(0);
        }
    }

    private float q(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    private void r(int i3, int i4, int i5, int i6) {
        int left = this.f10952s.getLeft();
        int top = this.f10952s.getTop();
        if (i5 != 0) {
            i3 = this.f10951r.a(this.f10952s, i3, i5);
            Z.K(this.f10952s, i3 - left);
        }
        int i7 = i3;
        if (i6 != 0) {
            i4 = this.f10951r.b(this.f10952s, i4, i6);
            Z.L(this.f10952s, i4 - top);
        }
        int i8 = i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        this.f10951r.k(this.f10952s, i7, i8, i7 - left, i8 - top);
    }

    private void s(int i3) {
        float[] fArr = this.f10937d;
        if (fArr == null || fArr.length <= i3) {
            int i4 = i3 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10938e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10939f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10940g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10941h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10942i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10943j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10937d = fArr2;
            this.f10938e = fArr3;
            this.f10939f = fArr4;
            this.f10940g = fArr5;
            this.f10941h = iArr;
            this.f10942i = iArr2;
            this.f10943j = iArr3;
        }
    }

    private boolean u(int i3, int i4, int i5, int i6) {
        int left = this.f10952s.getLeft();
        int top = this.f10952s.getTop();
        int i7 = i3 - left;
        int i8 = i4 - top;
        if (i7 == 0 && i8 == 0) {
            this.f10950q.abortAnimation();
            J(0);
            return false;
        }
        this.f10950q.startScroll(left, top, i7, i8, l(this.f10952s, i7, i8, i5, i6));
        J(2);
        return true;
    }

    private int x(int i3, int i4) {
        int i5 = i3 < this.f10954u.getLeft() + this.f10948o ? 1 : 0;
        if (i4 < this.f10954u.getTop() + this.f10948o) {
            i5 |= 4;
        }
        if (i3 > this.f10954u.getRight() - this.f10948o) {
            i5 |= 2;
        }
        return i4 > this.f10954u.getBottom() - this.f10948o ? i5 | 8 : i5;
    }

    public boolean A(int i3, int i4) {
        return D(this.f10952s, i3, i4);
    }

    public boolean B(int i3) {
        return ((1 << i3) & this.f10944k) != 0;
    }

    public boolean D(View view, int i3, int i4) {
        return view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom();
    }

    public void E(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10945l == null) {
            this.f10945l = VelocityTracker.obtain();
        }
        this.f10945l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x3, (int) y3);
            H(x3, y3, pointerId);
            P(viewT, pointerId);
            int i5 = this.f10941h[pointerId];
            int i6 = this.f10949p;
            if ((i5 & i6) != 0) {
                this.f10951r.h(i5 & i6, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f10934a == 1) {
                F();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f10934a == 1) {
                if (C(this.f10936c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f10936c);
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f10939f;
                    int i7 = this.f10936c;
                    int i8 = (int) (x4 - fArr[i7]);
                    int i9 = (int) (y4 - this.f10940g[i7]);
                    r(this.f10952s.getLeft() + i8, this.f10952s.getTop() + i9, i8, i9);
                    I(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i4 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i4);
                if (C(pointerId2)) {
                    float x5 = motionEvent.getX(i4);
                    float y5 = motionEvent.getY(i4);
                    float f3 = x5 - this.f10937d[pointerId2];
                    float f4 = y5 - this.f10938e[pointerId2];
                    G(f3, f4, pointerId2);
                    if (this.f10934a != 1) {
                        View viewT2 = t((int) x5, (int) y5);
                        if (f(viewT2, f3, f4) && P(viewT2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i4++;
            }
            I(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f10934a == 1) {
                p(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x6 = motionEvent.getX(actionIndex);
            float y6 = motionEvent.getY(actionIndex);
            H(x6, y6, pointerId3);
            if (this.f10934a != 0) {
                if (A((int) x6, (int) y6)) {
                    P(this.f10952s, pointerId3);
                    return;
                }
                return;
            } else {
                P(t((int) x6, (int) y6), pointerId3);
                int i10 = this.f10941h[pointerId3];
                int i11 = this.f10949p;
                if ((i10 & i11) != 0) {
                    this.f10951r.h(i10 & i11, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f10934a == 1 && pointerId4 == this.f10936c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i4 >= pointerCount2) {
                    i3 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i4);
                if (pointerId5 != this.f10936c) {
                    View viewT3 = t((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                    View view = this.f10952s;
                    if (viewT3 == view && P(view, pointerId5)) {
                        i3 = this.f10936c;
                        break;
                    }
                }
                i4++;
            }
            if (i3 == -1) {
                F();
            }
        }
        j(pointerId4);
    }

    void J(int i3) {
        this.f10954u.removeCallbacks(this.f10955v);
        if (this.f10934a != i3) {
            this.f10934a = i3;
            this.f10951r.j(i3);
            if (this.f10934a == 0) {
                this.f10952s = null;
            }
        }
    }

    public void K(int i3) {
        this.f10949p = i3;
    }

    public void L(float f3) {
        this.f10947n = f3;
    }

    public boolean M(int i3, int i4) {
        if (this.f10953t) {
            return u(i3, i4, (int) this.f10945l.getXVelocity(this.f10936c), (int) this.f10945l.getYVelocity(this.f10936c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public boolean N(MotionEvent motionEvent) {
        boolean z3;
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10945l == null) {
            this.f10945l = VelocityTracker.obtain();
        }
        this.f10945l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                a();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    a();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    H(x3, y3, pointerId);
                    int i3 = this.f10934a;
                    if (i3 == 0) {
                        int i4 = this.f10941h[pointerId];
                        int i5 = this.f10949p;
                        if ((i4 & i5) != 0) {
                            this.f10951r.h(i4 & i5, pointerId);
                        }
                    } else if (i3 == 2 && (viewT = t((int) x3, (int) y3)) == this.f10952s) {
                        P(viewT, pointerId);
                    }
                } else if (actionMasked == 6) {
                    j(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f10937d != null && this.f10938e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    int pointerId2 = motionEvent.getPointerId(i6);
                    if (C(pointerId2)) {
                        float x4 = motionEvent.getX(i6);
                        float y4 = motionEvent.getY(i6);
                        float f3 = x4 - this.f10937d[pointerId2];
                        float f4 = y4 - this.f10938e[pointerId2];
                        View viewT2 = t((int) x4, (int) y4);
                        boolean z4 = viewT2 != null && f(viewT2, f3, f4);
                        if (!z4) {
                            G(f3, f4, pointerId2);
                            if (this.f10934a != 1) {
                                break;
                            }
                        } else {
                            int left = viewT2.getLeft();
                            int i7 = (int) f3;
                            int iA = this.f10951r.a(viewT2, left + i7, i7);
                            int top = viewT2.getTop();
                            int i8 = (int) f4;
                            int iB = this.f10951r.b(viewT2, top + i8, i8);
                            int iD = this.f10951r.d(viewT2);
                            int iE = this.f10951r.e(viewT2);
                            if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                                break;
                            }
                            G(f3, f4, pointerId2);
                            if (this.f10934a != 1 || (z4 && P(viewT2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                I(motionEvent);
            }
            z3 = false;
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            z3 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            H(x5, y5, pointerId3);
            View viewT3 = t((int) x5, (int) y5);
            if (viewT3 == this.f10952s && this.f10934a == 2) {
                P(viewT3, pointerId3);
            }
            int i9 = this.f10941h[pointerId3];
            int i10 = this.f10949p;
            if ((i9 & i10) != 0) {
                this.f10951r.h(i9 & i10, pointerId3);
            }
        }
        if (this.f10934a == 1) {
            return true;
        }
        return z3;
    }

    public boolean O(View view, int i3, int i4) {
        this.f10952s = view;
        this.f10936c = -1;
        boolean zU = u(i3, i4, 0, 0);
        if (!zU && this.f10934a == 0 && this.f10952s != null) {
            this.f10952s = null;
        }
        return zU;
    }

    boolean P(View view, int i3) {
        if (view == this.f10952s && this.f10936c == i3) {
            return true;
        }
        if (view == null || !this.f10951r.m(view, i3)) {
            return false;
        }
        this.f10936c = i3;
        b(view, i3);
        return true;
    }

    public void a() {
        this.f10936c = -1;
        i();
        VelocityTracker velocityTracker = this.f10945l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10945l = null;
        }
    }

    public void b(View view, int i3) {
        if (view.getParent() == this.f10954u) {
            this.f10952s = view;
            this.f10936c = i3;
            this.f10951r.i(view, i3);
            J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f10954u + ")");
    }

    public boolean d(int i3) {
        int length = this.f10937d.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (e(i3, i4)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i3, int i4) {
        if (!B(i4)) {
            return false;
        }
        boolean z3 = (i3 & 1) == 1;
        boolean z4 = (i3 & 2) == 2;
        float f3 = this.f10939f[i4] - this.f10937d[i4];
        float f4 = this.f10940g[i4] - this.f10938e[i4];
        if (z3 && z4) {
            float f5 = (f3 * f3) + (f4 * f4);
            int i5 = this.f10935b;
            return f5 > ((float) (i5 * i5));
        }
        if (z3) {
            return Math.abs(f3) > ((float) this.f10935b);
        }
        return z4 && Math.abs(f4) > ((float) this.f10935b);
    }

    public boolean m(boolean z3) {
        if (this.f10934a == 2) {
            boolean zComputeScrollOffset = this.f10950q.computeScrollOffset();
            int currX = this.f10950q.getCurrX();
            int currY = this.f10950q.getCurrY();
            int left = currX - this.f10952s.getLeft();
            int top = currY - this.f10952s.getTop();
            if (left != 0) {
                Z.K(this.f10952s, left);
            }
            if (top != 0) {
                Z.L(this.f10952s, top);
            }
            if (left != 0 || top != 0) {
                this.f10951r.k(this.f10952s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f10950q.getFinalX() && currY == this.f10950q.getFinalY()) {
                this.f10950q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z3) {
                    this.f10954u.post(this.f10955v);
                } else {
                    J(0);
                }
            }
        }
        return this.f10934a == 2;
    }

    public View t(int i3, int i4) {
        for (int childCount = this.f10954u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f10954u.getChildAt(this.f10951r.c(childCount));
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f10952s;
    }

    public int w() {
        return this.f10948o;
    }

    public int y() {
        return this.f10935b;
    }

    public int z() {
        return this.f10934a;
    }
}
