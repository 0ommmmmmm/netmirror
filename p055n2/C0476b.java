package p055n2;

import D2.h;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0476b extends C0478d {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final a f9953V = new a(null);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final double f9954W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final double f9955X;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Handler f9960R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f9961S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private VelocityTracker f9963U;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f9956N = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f9957O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final long f9958P = 800;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final long f9959Q = 2000;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Runnable f9962T = new Runnable() { // from class: n2.a
        @Override // java.lang.Runnable
        public final void run() {
            C0476b.V0(this.f9952b);
        }
    };

    /* JADX INFO: renamed from: n2.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        k kVar = k.f10029a;
        f9954W = kVar.a(30.0d);
        f9955X = kVar.a(60.0d);
    }

    private final void T0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        h.c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void U0(MotionEvent motionEvent) {
        if (Z0(motionEvent)) {
            return;
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(C0476b c0476b) {
        c0476b.B();
    }

    private final void Y0(MotionEvent motionEvent) {
        this.f9963U = VelocityTracker.obtain();
        n();
        this.f9961S = 1;
        Handler handler = this.f9960R;
        if (handler == null) {
            this.f9960R = new Handler(Looper.getMainLooper());
        } else {
            h.c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f9960R;
        h.c(handler2);
        handler2.postDelayed(this.f9962T, this.f9958P);
    }

    private final boolean Z0(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        T0(this.f9963U, motionEvent);
        C.a aVar = C.f9937f;
        VelocityTracker velocityTracker = this.f9963U;
        h.c(velocityTracker);
        C cB = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList.add(Boolean.valueOf(a1(this, cB, numArr[i3].intValue(), f9954W)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i4 = 0; i4 < 4; i4++) {
            arrayList2.add(Boolean.valueOf(a1(this, cB, numArr2[i4].intValue(), f9955X)));
        }
        if (arrayList.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            if (((Boolean) it.next()).booleanValue()) {
                z3 = true;
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z4 = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = false;
                break;
            }
            if (((Boolean) it2.next()).booleanValue()) {
                z4 = true;
                break;
            }
        }
        boolean z5 = z3 | z4;
        boolean z6 = cB.k() > ((double) this.f9959Q);
        if (this.f9961S != this.f9956N || !z5 || !z6) {
            return false;
        }
        Handler handler = this.f9960R;
        h.c(handler);
        handler.removeCallbacksAndMessages(null);
        i();
        return true;
    }

    private static final boolean a1(C0476b c0476b, C c4, int i3, double d4) {
        return (c0476b.f9957O & i3) == i3 && c4.l(C.f9937f.a(i3), d4);
    }

    public final void W0(int i3) {
        this.f9957O = i3;
    }

    public final void X0(int i3) {
        this.f9956N = i3;
    }

    @Override // p055n2.C0478d
    protected void g0() {
        Handler handler = this.f9960R;
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
            if (iQ == 0) {
                Y0(motionEvent2);
            }
            if (iQ == 2) {
                Z0(motionEvent2);
                if (motionEvent2.getPointerCount() > this.f9961S) {
                    this.f9961S = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() == 1) {
                    U0(motionEvent2);
                }
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
        VelocityTracker velocityTracker = this.f9963U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f9963U = null;
        Handler handler = this.f9960R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p055n2.C0478d
    public void o0() {
        super.o0();
        this.f9956N = 1;
        this.f9957O = 1;
    }
}
