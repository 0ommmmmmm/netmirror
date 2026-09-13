package p055n2;

import D2.h;
import H2.c;
import H2.d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.i;
import p075s2.AbstractC0492n;
import p075s2.C;

/* JADX INFO: loaded from: classes.dex */
public final class o extends C0478d {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f10037X = new a(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f10038N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f10039O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f10040P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f10041Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f10042R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f10043S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f10044T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f10045U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Handler f10046V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f10047W;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(Context context) {
        h.f(context, "context");
        this.f10038N = 500L;
        E0(true);
        float f3 = context.getResources().getDisplayMetrics().density * 10.0f;
        float f4 = f3 * f3;
        this.f10039O = f4;
        this.f10040P = f4;
        this.f10041Q = 1;
    }

    private final i T0(MotionEvent motionEvent, boolean z3) {
        if (z3) {
            int pointerCount = motionEvent.getPointerCount();
            float x3 = 0.0f;
            float y3 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != motionEvent.getActionIndex()) {
                    x3 += motionEvent.getX(i3);
                    y3 += motionEvent.getY(i3);
                }
            }
            return new i(Float.valueOf(x3 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y3 / (motionEvent.getPointerCount() - 1)));
        }
        c cVarI = d.i(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(AbstractC0492n.q(cVarI, 10));
        Iterator it = cVarI.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((C) it).a())));
        }
        float fI = (float) AbstractC0492n.I(arrayList);
        c cVarI2 = d.i(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(AbstractC0492n.q(cVarI2, 10));
        Iterator it2 = cVarI2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((C) it2).a())));
        }
        return new i(Float.valueOf(fI), Float.valueOf((float) AbstractC0492n.I(arrayList2)));
    }

    static /* synthetic */ i U0(o oVar, MotionEvent motionEvent, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return oVar.T0(motionEvent, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(o oVar) {
        oVar.i();
    }

    public final int V0() {
        return (int) (this.f10045U - this.f10044T);
    }

    public final o X0(float f3) {
        this.f10040P = f3 * f3;
        return this;
    }

    public final void Y0(long j3) {
        this.f10038N = j3;
    }

    public final o Z0(int i3) {
        this.f10041Q = i3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        if (H0(motionEvent2)) {
            if (Q() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f10045U = jUptimeMillis;
                this.f10044T = jUptimeMillis;
                n();
                i iVarU0 = U0(this, motionEvent2, false, 2, null);
                float fFloatValue = ((Number) iVarU0.a()).floatValue();
                float fFloatValue2 = ((Number) iVarU0.b()).floatValue();
                this.f10042R = fFloatValue;
                this.f10043S = fFloatValue2;
                this.f10047W++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.f10047W++;
                i iVarU1 = U0(this, motionEvent2, false, 2, null);
                float fFloatValue3 = ((Number) iVarU1.a()).floatValue();
                float fFloatValue4 = ((Number) iVarU1.b()).floatValue();
                this.f10042R = fFloatValue3;
                this.f10043S = fFloatValue4;
                if (this.f10047W > this.f10041Q) {
                    B();
                    this.f10047W = 0;
                }
            }
            if (Q() == 2 && this.f10047W == this.f10041Q && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f10046V = handler;
                long j3 = this.f10038N;
                if (j3 > 0) {
                    h.c(handler);
                    handler.postDelayed(new Runnable() { // from class: n2.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.W0(this.f10036b);
                        }
                    }, this.f10038N);
                } else if (j3 == 0) {
                    i();
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.f10047W--;
                Handler handler2 = this.f10046V;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f10046V = null;
                }
                if (Q() == 4) {
                    z();
                    return;
                } else {
                    B();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() != 6) {
                i iVarU2 = U0(this, motionEvent2, false, 2, null);
                float fFloatValue5 = ((Number) iVarU2.a()).floatValue();
                float fFloatValue6 = ((Number) iVarU2.b()).floatValue();
                float f3 = fFloatValue5 - this.f10042R;
                float f4 = fFloatValue6 - this.f10043S;
                if ((f3 * f3) + (f4 * f4) > this.f10040P) {
                    if (Q() == 4) {
                        o();
                        return;
                    } else {
                        B();
                        return;
                    }
                }
                return;
            }
            int i3 = this.f10047W - 1;
            this.f10047W = i3;
            if (i3 < this.f10041Q && Q() != 4) {
                B();
                this.f10047W = 0;
                return;
            }
            i iVarT0 = T0(motionEvent2, true);
            float fFloatValue7 = ((Number) iVarT0.a()).floatValue();
            float fFloatValue8 = ((Number) iVarT0.b()).floatValue();
            this.f10042R = fFloatValue7;
            this.f10043S = fFloatValue8;
        }
    }

    @Override // p055n2.C0478d
    protected void k0() {
        super.k0();
        this.f10047W = 0;
    }

    @Override // p055n2.C0478d
    protected void l0(int i3, int i4) {
        Handler handler = this.f10046V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f10046V = null;
        }
    }

    @Override // p055n2.C0478d
    public void o0() {
        super.o0();
        this.f10038N = 500L;
        this.f10040P = this.f10039O;
    }

    @Override // p055n2.C0478d
    public void t(MotionEvent motionEvent) {
        h.f(motionEvent, "event");
        this.f10045U = SystemClock.uptimeMillis();
        super.t(motionEvent);
    }

    @Override // p055n2.C0478d
    public void u(int i3, int i4) {
        this.f10045U = SystemClock.uptimeMillis();
        super.u(i3, i4);
    }
}
