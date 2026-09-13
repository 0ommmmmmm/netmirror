package p055n2;

import D2.h;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C0478d {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final a f9919e0 = new a(null);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f9928V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f9929W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f9930X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f9931Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f9932Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f9933a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Handler f9934b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f9935c0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f9920N = Float.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f9921O = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f9922P = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f9923Q = 500;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f9924R = 200;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f9925S = 1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f9926T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f9927U = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Runnable f9936d0 = new Runnable() { // from class: n2.A
        @Override // java.lang.Runnable
        public final void run() {
            B.U0(this.f9918b);
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public B() {
        E0(true);
    }

    private final void T0() {
        Handler handler = this.f9934b0;
        if (handler == null) {
            this.f9934b0 = new Handler(Looper.getMainLooper());
        } else {
            h.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i3 = this.f9935c0 + 1;
        this.f9935c0 = i3;
        if (i3 == this.f9925S && this.f9927U >= this.f9926T) {
            i();
            return;
        }
        Handler handler2 = this.f9934b0;
        h.c(handler2);
        handler2.postDelayed(this.f9936d0, this.f9924R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(B b4) {
        b4.B();
    }

    private final boolean c1() {
        float f3 = (this.f9932Z - this.f9928V) + this.f9930X;
        if (this.f9920N != Float.MIN_VALUE && Math.abs(f3) > this.f9920N) {
            return true;
        }
        float f4 = (this.f9933a0 - this.f9929W) + this.f9931Y;
        if (this.f9921O != Float.MIN_VALUE && Math.abs(f4) > this.f9921O) {
            return true;
        }
        float f5 = (f4 * f4) + (f3 * f3);
        float f6 = this.f9922P;
        return f6 != Float.MIN_VALUE && f5 > f6;
    }

    private final void d1() {
        Handler handler = this.f9934b0;
        if (handler == null) {
            this.f9934b0 = new Handler(Looper.getMainLooper());
        } else {
            h.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f9934b0;
        h.c(handler2);
        handler2.postDelayed(this.f9936d0, this.f9923Q);
    }

    public final B V0(long j3) {
        this.f9924R = j3;
        return this;
    }

    public final B W0(float f3) {
        this.f9922P = f3 * f3;
        return this;
    }

    public final B X0(long j3) {
        this.f9923Q = j3;
        return this;
    }

    public final B Y0(float f3) {
        this.f9920N = f3;
        return this;
    }

    public final B Z0(float f3) {
        this.f9921O = f3;
        return this;
    }

    public final B a1(int i3) {
        this.f9926T = i3;
        return this;
    }

    public final B b1(int i3) {
        this.f9925S = i3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void g0() {
        Handler handler = this.f9934b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p055n2.C0478d
    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        if (H0(motionEvent2)) {
            int iQ = Q();
            int actionMasked = motionEvent2.getActionMasked();
            if (iQ == 0) {
                this.f9930X = 0.0f;
                this.f9931Y = 0.0f;
                k kVar = k.f10029a;
                this.f9928V = kVar.b(motionEvent2, true);
                this.f9929W = kVar.c(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f9930X += this.f9932Z - this.f9928V;
                this.f9931Y += this.f9933a0 - this.f9929W;
                k kVar2 = k.f10029a;
                this.f9932Z = kVar2.b(motionEvent2, true);
                float fC = kVar2.c(motionEvent2, true);
                this.f9933a0 = fC;
                this.f9928V = this.f9932Z;
                this.f9929W = fC;
            } else {
                k kVar3 = k.f10029a;
                this.f9932Z = kVar3.b(motionEvent2, true);
                this.f9933a0 = kVar3.c(motionEvent2, true);
            }
            if (this.f9927U < motionEvent2.getPointerCount()) {
                this.f9927U = motionEvent2.getPointerCount();
            }
            if (c1()) {
                B();
                return;
            }
            if (iQ == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    n();
                }
                d1();
                return;
            }
            if (iQ == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    T0();
                    return;
                }
                d1();
            }
        }
    }

    @Override // p055n2.C0478d
    public void j(boolean z3) {
        super.j(z3);
        z();
    }

    @Override // p055n2.C0478d
    protected void k0() {
        this.f9935c0 = 0;
        this.f9927U = 0;
        Handler handler = this.f9934b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p055n2.C0478d
    public void o0() {
        super.o0();
        this.f9920N = Float.MIN_VALUE;
        this.f9921O = Float.MIN_VALUE;
        this.f9922P = Float.MIN_VALUE;
        this.f9923Q = 500L;
        this.f9924R = 200L;
        this.f9925S = 1;
        this.f9926T = 1;
    }
}
