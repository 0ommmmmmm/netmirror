package p055n2;

import D2.h;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class t extends C0478d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f10061q0 = new a(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f10062N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f10063O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final float f10064P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f10065Q;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f10079e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f10080f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f10081g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f10082h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f10083i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f10084j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private VelocityTracker f10085k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f10086l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f10087m0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Handler f10089o0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f10066R = Float.MAX_VALUE;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f10067S = Float.MIN_VALUE;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f10068T = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f10069U = Float.MAX_VALUE;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f10070V = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f10071W = Float.MIN_VALUE;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f10072X = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f10073Y = Float.MAX_VALUE;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f10074Z = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f10075a0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f10076b0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f10077c0 = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f10078d0 = 10;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Runnable f10088n0 = new Runnable() { // from class: n2.s
        @Override // java.lang.Runnable
        public final void run() {
            t.T0(this.f10060b);
        }
    };

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private z f10090p0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            h.c(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        private a() {
        }
    }

    public t(Context context) {
        this.f10065Q = Float.MIN_VALUE;
        h.c(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f3 = scaledTouchSlop * scaledTouchSlop;
        this.f10064P = f3;
        this.f10065Q = f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(t tVar) {
        tVar.i();
    }

    private final boolean p1() {
        float f3 = (this.f10083i0 - this.f10079e0) + this.f10081g0;
        float f4 = this.f10066R;
        if (f4 != Float.MAX_VALUE && f3 < f4) {
            return true;
        }
        float f5 = this.f10067S;
        if (f5 != Float.MIN_VALUE && f3 > f5) {
            return true;
        }
        float f6 = (this.f10084j0 - this.f10080f0) + this.f10082h0;
        float f7 = this.f10070V;
        if (f7 != Float.MAX_VALUE && f6 < f7) {
            return true;
        }
        float f8 = this.f10071W;
        if (f8 != Float.MIN_VALUE && f6 > f8) {
            return true;
        }
        float f9 = (f3 * f3) + (f6 * f6);
        float f10 = this.f10065Q;
        if (f10 != Float.MAX_VALUE && f9 >= f10) {
            return true;
        }
        float f11 = this.f10062N;
        float f12 = this.f10074Z;
        if (f12 != Float.MAX_VALUE && ((f12 < 0.0f && f11 <= f12) || (0.0f <= f12 && f12 <= f11))) {
            return true;
        }
        float f13 = this.f10063O;
        float f14 = this.f10075a0;
        if (f14 != Float.MAX_VALUE && ((f14 < 0.0f && f11 <= f14) || (0.0f <= f14 && f14 <= f11))) {
            return true;
        }
        float f15 = (f11 * f11) + (f13 * f13);
        float f16 = this.f10076b0;
        return f16 != Float.MAX_VALUE && f15 >= f16;
    }

    private final boolean q1() {
        float f3 = (this.f10083i0 - this.f10079e0) + this.f10081g0;
        float f4 = (this.f10084j0 - this.f10080f0) + this.f10082h0;
        if (this.f10087m0 > 0 && (f3 * f3) + (f4 * f4) > this.f10064P) {
            Handler handler = this.f10089o0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f5 = this.f10068T;
        if (f5 != Float.MIN_VALUE && f3 < f5) {
            return true;
        }
        float f6 = this.f10069U;
        if (f6 != Float.MAX_VALUE && f3 > f6) {
            return true;
        }
        float f7 = this.f10072X;
        if (f7 != Float.MIN_VALUE && f4 < f7) {
            return true;
        }
        float f8 = this.f10073Y;
        return f8 != Float.MAX_VALUE && f4 > f8;
    }

    public final z U0() {
        return this.f10090p0;
    }

    public final float V0() {
        return (this.f10083i0 - this.f10079e0) + this.f10081g0;
    }

    public final float W0() {
        return (this.f10084j0 - this.f10080f0) + this.f10082h0;
    }

    public final float X0() {
        return this.f10062N;
    }

    public final float Y0() {
        return this.f10063O;
    }

    public final t Z0(long j3) {
        this.f10087m0 = j3;
        return this;
    }

    public final t a1(float f3) {
        this.f10067S = f3;
        return this;
    }

    public final t b1(float f3) {
        this.f10066R = f3;
        return this;
    }

    public final t c1(float f3) {
        this.f10071W = f3;
        return this;
    }

    public final t d1(float f3) {
        this.f10070V = f3;
        return this;
    }

    public final t e1(boolean z3) {
        this.f10086l0 = z3;
        return this;
    }

    public final t f1(float f3) {
        this.f10069U = f3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void g0() {
        Handler handler = this.f10089o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final t g1(float f3) {
        this.f10068T = f3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        if (H0(motionEvent2)) {
            if (motionEvent.getToolType(0) == 2) {
                this.f10090p0 = z.f10149f.a(motionEvent);
            }
            int iQ = Q();
            int actionMasked = motionEvent2.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f10081g0 += this.f10083i0 - this.f10079e0;
                this.f10082h0 += this.f10084j0 - this.f10080f0;
                k kVar = k.f10029a;
                this.f10083i0 = kVar.b(motionEvent2, this.f10086l0);
                float fC = kVar.c(motionEvent2, this.f10086l0);
                this.f10084j0 = fC;
                this.f10079e0 = this.f10083i0;
                this.f10080f0 = fC;
            } else {
                k kVar2 = k.f10029a;
                this.f10083i0 = kVar2.b(motionEvent2, this.f10086l0);
                this.f10084j0 = kVar2.c(motionEvent2, this.f10086l0);
            }
            if (iQ != 0 || motionEvent2.getPointerCount() < this.f10077c0) {
                VelocityTracker velocityTracker = this.f10085k0;
                if (velocityTracker != null) {
                    f10061q0.b(velocityTracker, motionEvent2);
                    VelocityTracker velocityTracker2 = this.f10085k0;
                    h.c(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f10085k0;
                    h.c(velocityTracker3);
                    this.f10062N = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f10085k0;
                    h.c(velocityTracker4);
                    this.f10063O = velocityTracker4.getYVelocity();
                }
            } else {
                p0();
                this.f10081g0 = 0.0f;
                this.f10082h0 = 0.0f;
                this.f10062N = 0.0f;
                this.f10063O = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f10085k0 = velocityTrackerObtain;
                f10061q0.b(velocityTrackerObtain, motionEvent2);
                n();
                if (this.f10087m0 > 0) {
                    if (this.f10089o0 == null) {
                        this.f10089o0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f10089o0;
                    h.c(handler);
                    handler.postDelayed(this.f10088n0, this.f10087m0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (iQ == 4) {
                    z();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (actionMasked == 5 && motionEvent2.getPointerCount() > this.f10078d0) {
                if (iQ == 4) {
                    o();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (actionMasked == 6 && iQ == 4 && motionEvent2.getPointerCount() < this.f10077c0) {
                B();
                return;
            }
            if (iQ == 2) {
                if (q1()) {
                    B();
                } else if (p1()) {
                    i();
                }
            }
        }
    }

    public final t h1(float f3) {
        this.f10073Y = f3;
        return this;
    }

    public final t i1(float f3) {
        this.f10072X = f3;
        return this;
    }

    @Override // p055n2.C0478d
    public void j(boolean z3) {
        if (Q() != 4) {
            p0();
        }
        super.j(z3);
    }

    public final t j1(int i3) {
        this.f10078d0 = i3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void k0() {
        Handler handler = this.f10089o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f10085k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10085k0 = null;
        }
        this.f10090p0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final t k1(float f3) {
        this.f10065Q = f3 * f3;
        return this;
    }

    public final t l1(int i3) {
        this.f10077c0 = i3;
        return this;
    }

    public final t m1(float f3) {
        this.f10076b0 = f3 * f3;
        return this;
    }

    public final t n1(float f3) {
        this.f10074Z = f3;
        return this;
    }

    @Override // p055n2.C0478d
    public void o0() {
        super.o0();
        this.f10066R = Float.MAX_VALUE;
        this.f10067S = Float.MIN_VALUE;
        this.f10068T = Float.MIN_VALUE;
        this.f10069U = Float.MAX_VALUE;
        this.f10070V = Float.MAX_VALUE;
        this.f10071W = Float.MIN_VALUE;
        this.f10072X = Float.MIN_VALUE;
        this.f10073Y = Float.MAX_VALUE;
        this.f10074Z = Float.MAX_VALUE;
        this.f10075a0 = Float.MAX_VALUE;
        this.f10076b0 = Float.MAX_VALUE;
        this.f10065Q = this.f10064P;
        this.f10077c0 = 1;
        this.f10078d0 = 10;
        this.f10087m0 = 0L;
        this.f10086l0 = false;
    }

    public final t o1(float f3) {
        this.f10075a0 = f3;
        return this;
    }

    @Override // p055n2.C0478d
    public void p0() {
        this.f10079e0 = this.f10083i0;
        this.f10080f0 = this.f10084j0;
    }
}
