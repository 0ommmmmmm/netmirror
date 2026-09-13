package p055n2;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f10130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f10131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f10132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f10133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f10134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f10135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f10136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f10137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f10138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f10142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f10143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f10144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f10146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10147x;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f10143t = motionEvent.getX();
            y.this.f10144u = motionEvent.getY();
            y.this.f10145v = 1;
            return true;
        }
    }

    public interface b {
        boolean a(y yVar);

        boolean b(y yVar);

        void c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, null);
    }

    private boolean j() {
        return this.f10145v != 0;
    }

    public float d() {
        return this.f10130g;
    }

    public float e() {
        return this.f10126c;
    }

    public float f() {
        return this.f10127d;
    }

    public float g() {
        if (!j()) {
            float f3 = this.f10131h;
            if (f3 > 0.0f) {
                return this.f10130g / f3;
            }
            return 1.0f;
        }
        boolean z3 = this.f10147x;
        boolean z4 = (z3 && this.f10130g < this.f10131h) || (!z3 && this.f10130g > this.f10131h);
        float fAbs = Math.abs(1.0f - (this.f10130g / this.f10131h)) * 0.5f;
        if (this.f10131h <= this.f10140q) {
            return 1.0f;
        }
        return z4 ? 1.0f + fAbs : 1.0f - fAbs;
    }

    public long h() {
        return this.f10137n - this.f10138o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f3;
        float f4;
        this.f10137n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10128e) {
            this.f10146w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z3 = (motionEvent.getButtonState() & 32) != 0;
        boolean z4 = this.f10145v == 2 && !z3;
        boolean z5 = actionMasked == 1 || actionMasked == 3 || z4;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z5) {
            if (this.f10139p) {
                this.f10125b.c(this);
                this.f10139p = false;
                this.f10132i = 0.0f;
                this.f10145v = 0;
            } else if (j() && z5) {
                this.f10139p = false;
                this.f10132i = 0.0f;
                this.f10145v = 0;
            }
            if (z5) {
                return true;
            }
        }
        if (!this.f10139p && this.f10129f && !j() && !z5 && z3) {
            this.f10143t = motionEvent.getX();
            this.f10144u = motionEvent.getY();
            this.f10145v = 2;
            this.f10132i = 0.0f;
        }
        boolean z6 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z4;
        boolean z7 = actionMasked == 6;
        int actionIndex = z7 ? motionEvent.getActionIndex() : -1;
        int i3 = z7 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f4 = this.f10143t;
            f3 = this.f10144u;
            if (motionEvent.getY() < f3) {
                this.f10147x = true;
            } else {
                this.f10147x = false;
            }
        } else {
            float x3 = 0.0f;
            float y3 = 0.0f;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (actionIndex != i4) {
                    x3 += motionEvent.getX(i4);
                    y3 += motionEvent.getY(i4);
                }
            }
            float f5 = i3;
            float f6 = x3 / f5;
            f3 = y3 / f5;
            f4 = f6;
        }
        float fAbs2 = 0.0f;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (actionIndex != i5) {
                fAbs += Math.abs(motionEvent.getX(i5) - f4);
                fAbs2 += Math.abs(motionEvent.getY(i5) - f3);
            }
        }
        float f7 = i3;
        float f8 = (fAbs / f7) * 2.0f;
        float f9 = (fAbs2 / f7) * 2.0f;
        float fHypot = j() ? f9 : (float) Math.hypot(f8, f9);
        boolean z8 = this.f10139p;
        this.f10126c = f4;
        this.f10127d = f3;
        if (!j() && this.f10139p && (fHypot < this.f10141r || z6)) {
            this.f10125b.c(this);
            this.f10139p = false;
            this.f10132i = fHypot;
        }
        if (z6) {
            this.f10133j = f8;
            this.f10135l = f8;
            this.f10134k = f9;
            this.f10136m = f9;
            this.f10130g = fHypot;
            this.f10131h = fHypot;
            this.f10132i = fHypot;
        }
        int i6 = j() ? this.f10140q : this.f10141r;
        if (!this.f10139p && fHypot >= i6 && (z8 || Math.abs(fHypot - this.f10132i) > this.f10140q)) {
            this.f10133j = f8;
            this.f10135l = f8;
            this.f10134k = f9;
            this.f10136m = f9;
            this.f10130g = fHypot;
            this.f10131h = fHypot;
            this.f10138o = this.f10137n;
            this.f10139p = this.f10125b.a(this);
        }
        if (actionMasked == 2) {
            this.f10133j = f8;
            this.f10134k = f9;
            this.f10130g = fHypot;
            if (this.f10139p ? this.f10125b.b(this) : true) {
                this.f10135l = this.f10133j;
                this.f10136m = this.f10134k;
                this.f10131h = this.f10130g;
                this.f10138o = this.f10137n;
            }
        }
        return true;
    }

    public void l(boolean z3) {
        this.f10128e = z3;
        if (z3 && this.f10146w == null) {
            this.f10146w = new GestureDetector(this.f10124a, new a(), this.f10142s);
        }
    }

    public void m(boolean z3) {
        this.f10129f = z3;
    }

    public y(Context context, b bVar, Handler handler) {
        this.f10145v = 0;
        this.f10124a = context;
        this.f10125b = bVar;
        this.f10140q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f10141r = 0;
        this.f10142s = handler;
        int i3 = context.getApplicationInfo().targetSdkVersion;
        if (i3 > 18) {
            l(true);
        }
        if (i3 > 22) {
            m(true);
        }
    }
}
