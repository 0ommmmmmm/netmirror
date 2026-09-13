package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f3831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f3834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f3835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f3836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f3839j = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f3834e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.e();
        }
    }

    public S(View view) {
        this.f3834e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3831b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3832c = tapTimeout;
        this.f3833d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f3836g;
        if (runnable != null) {
            this.f3834e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3835f;
        if (runnable2 != null) {
            this.f3834e.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        P p3;
        View view = this.f3834e;
        p032i.e eVarB = b();
        if (eVarB == null || !eVarB.a() || (p3 = (P) eVarB.g()) == null || !p3.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(p3, motionEventObtainNoHistory);
        boolean zE = p3.e(motionEventObtainNoHistory, this.f3838i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f3834e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3838i = motionEvent.getPointerId(0);
            if (this.f3835f == null) {
                this.f3835f = new a();
            }
            view.postDelayed(this.f3835f, this.f3832c);
            if (this.f3836g == null) {
                this.f3836g = new b();
            }
            view.postDelayed(this.f3836g, this.f3833d);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f3838i);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f3831b)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f3, float f4, float f5) {
        float f6 = -f5;
        return f3 >= f6 && f4 >= f6 && f3 < ((float) (view.getRight() - view.getLeft())) + f5 && f4 < ((float) (view.getBottom() - view.getTop())) + f5;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3839j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3839j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract p032i.e b();

    protected boolean c() {
        p032i.e eVarB = b();
        if (eVarB == null || eVarB.a()) {
            return true;
        }
        eVarB.b();
        return true;
    }

    protected boolean d() {
        p032i.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f3834e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f3837h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f3837h;
        if (z4) {
            z3 = f(motionEvent) || !d();
        } else {
            z3 = g(motionEvent) && c();
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3834e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f3837h = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3837h = false;
        this.f3838i = -1;
        Runnable runnable = this.f3835f;
        if (runnable != null) {
            this.f3834e.removeCallbacks(runnable);
        }
    }
}
