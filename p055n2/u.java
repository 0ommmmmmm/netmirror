package p055n2;

import D2.h;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class u extends C0478d {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private double f10091N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f10092O;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private y f10095R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f10096S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f10097T;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f10093P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f10094Q = Float.NaN;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final y.b f10098U = new a();

    public static final class a implements y.b {
        a() {
            u.this.E0(false);
        }

        @Override // n2.y.b
        public boolean a(y yVar) {
            h.f(yVar, "detector");
            u.this.f10096S = yVar.d();
            return true;
        }

        @Override // n2.y.b
        public boolean b(y yVar) {
            h.f(yVar, "detector");
            double dZ0 = u.this.Z0();
            u uVar = u.this;
            uVar.f10091N = uVar.Z0() * ((double) yVar.g());
            double dI = yVar.i();
            if (dI > 0.0d) {
                u uVar2 = u.this;
                uVar2.f10092O = (uVar2.Z0() - dZ0) / dI;
            }
            if (Math.abs(u.this.f10096S - yVar.d()) < u.this.f10097T || u.this.Q() != 2) {
                return true;
            }
            u.this.i();
            return true;
        }

        @Override // n2.y.b
        public void c(y yVar) {
            h.f(yVar, "detector");
        }
    }

    public final float X0() {
        return this.f10093P;
    }

    public final float Y0() {
        return this.f10094Q;
    }

    public final double Z0() {
        return this.f10091N;
    }

    public final double a1() {
        return this.f10092O;
    }

    @Override // p055n2.C0478d
    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        if (Q() == 0) {
            View viewU = U();
            h.c(viewU);
            Context context = viewU.getContext();
            p0();
            this.f10095R = new y(context, this.f10098U);
            this.f10097T = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f10093P = motionEvent.getX();
            this.f10094Q = motionEvent.getY();
            n();
        }
        y yVar = this.f10095R;
        if (yVar != null) {
            yVar.k(motionEvent2);
        }
        y yVar2 = this.f10095R;
        if (yVar2 != null) {
            PointF pointFO0 = O0(new PointF(yVar2.e(), yVar2.f()));
            this.f10093P = pointFO0.x;
            this.f10094Q = pointFO0.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (Q() == 4) {
                z();
            } else {
                B();
            }
        }
    }

    @Override // p055n2.C0478d
    public void j(boolean z3) {
        if (Q() != 4) {
            p0();
        }
        super.j(z3);
    }

    @Override // p055n2.C0478d
    protected void k0() {
        this.f10095R = null;
        this.f10093P = Float.NaN;
        this.f10094Q = Float.NaN;
        p0();
    }

    @Override // p055n2.C0478d
    public void p0() {
        this.f10092O = 0.0d;
        this.f10091N = 1.0d;
    }
}
