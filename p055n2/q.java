package p055n2;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.views.text.m;
import com.facebook.react.views.textinput.C0441j;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C0478d {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final b f10048Q = new b(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final a f10049R = new a();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f10050N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f10051O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private d f10052P = f10049R;

    public static final class a implements d {
        a() {
        }

        @Override // n2.q.d
        public boolean a() {
            return d.a.f(this);
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            d.a.d(this, motionEvent);
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            return d.a.e(this, view, motionEvent);
        }

        @Override // n2.q.d
        public boolean e() {
            return d.a.h(this);
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            return d.a.g(this, c0478d);
        }

        @Override // n2.q.d
        public boolean h(View view) {
            return d.a.b(this, view);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }

        private b() {
        }
    }

    private static final class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f10053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0441j f10054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f10055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f10056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10057f;

        public c(q qVar, C0441j c0441j) {
            D2.h.f(qVar, "handler");
            D2.h.f(c0441j, "editText");
            this.f10053b = qVar;
            this.f10054c = c0441j;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(c0441j.getContext());
            this.f10057f = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // n2.q.d
        public boolean a() {
            return true;
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            D2.h.f(motionEvent, "event");
            this.f10053b.i();
            this.f10054c.onTouchEvent(motionEvent);
            this.f10055d = motionEvent.getX();
            this.f10056e = motionEvent.getY();
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            return d.a.e(this, view, motionEvent);
        }

        @Override // n2.q.d
        public boolean e() {
            return true;
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            D2.h.f(motionEvent, "event");
            if (((motionEvent.getX() - this.f10055d) * (motionEvent.getX() - this.f10055d)) + ((motionEvent.getY() - this.f10056e) * (motionEvent.getY() - this.f10056e)) < this.f10057f) {
                this.f10054c.S();
            }
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            D2.h.f(c0478d, "handler");
            return Boolean.valueOf(c0478d.R() > 0 && !(c0478d instanceof q));
        }

        @Override // n2.q.d
        public boolean h(View view) {
            return d.a.b(this, view);
        }
    }

    public interface d {

        public static final class a {
            public static void a(d dVar, MotionEvent motionEvent) {
                D2.h.f(motionEvent, "event");
            }

            public static boolean b(d dVar, View view) {
                D2.h.f(view, "view");
                return view.isPressed();
            }

            public static boolean c(d dVar, MotionEvent motionEvent) {
                D2.h.f(motionEvent, "event");
                return true;
            }

            public static void d(d dVar, MotionEvent motionEvent) {
                D2.h.f(motionEvent, "event");
            }

            public static Boolean e(d dVar, View view, MotionEvent motionEvent) {
                D2.h.f(motionEvent, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(motionEvent));
                }
                return null;
            }

            public static boolean f(d dVar) {
                return false;
            }

            public static Boolean g(d dVar, C0478d c0478d) {
                D2.h.f(c0478d, "handler");
                return null;
            }

            public static boolean h(d dVar) {
                return false;
            }
        }

        boolean a();

        void b(MotionEvent motionEvent);

        boolean c(MotionEvent motionEvent);

        Boolean d(View view, MotionEvent motionEvent);

        boolean e();

        void f(MotionEvent motionEvent);

        Boolean g(C0478d c0478d);

        boolean h(View view);
    }

    private static final class e implements d {
        @Override // n2.q.d
        public boolean a() {
            return d.a.f(this);
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            d.a.d(this, motionEvent);
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            D2.h.f(motionEvent, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // n2.q.d
        public boolean e() {
            return d.a.h(this);
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            return d.a.g(this, c0478d);
        }

        @Override // n2.q.d
        public boolean h(View view) {
            return d.a.b(this, view);
        }
    }

    private static final class f implements d {
        @Override // n2.q.d
        public boolean a() {
            return true;
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            d.a.d(this, motionEvent);
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            return d.a.e(this, view, motionEvent);
        }

        @Override // n2.q.d
        public boolean e() {
            return d.a.h(this);
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            return d.a.g(this, c0478d);
        }

        @Override // n2.q.d
        public boolean h(View view) {
            return d.a.b(this, view);
        }
    }

    private static final class g implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f10058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.facebook.react.views.swiperefresh.a f10059c;

        public g(q qVar, com.facebook.react.views.swiperefresh.a aVar) {
            D2.h.f(qVar, "handler");
            D2.h.f(aVar, "swipeRefreshLayout");
            this.f10058b = qVar;
            this.f10059c = aVar;
        }

        @Override // n2.q.d
        public boolean a() {
            return d.a.f(this);
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            ArrayList arrayListS;
            D2.h.f(motionEvent, "event");
            View childAt = this.f10059c.getChildAt(0);
            C0478d c0478d = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            i iVarN = this.f10058b.N();
            if (iVarN != null && (arrayListS = iVarN.s(scrollView)) != null) {
                Iterator it = arrayListS.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    c0478d = (C0478d) it.next();
                } while (!(c0478d instanceof q));
            }
            if (c0478d == null || c0478d.Q() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.f10058b.B();
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            return d.a.e(this, view, motionEvent);
        }

        @Override // n2.q.d
        public boolean e() {
            return true;
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            return d.a.g(this, c0478d);
        }

        @Override // n2.q.d
        public boolean h(View view) {
            return d.a.b(this, view);
        }
    }

    private static final class h implements d {
        @Override // n2.q.d
        public boolean a() {
            return d.a.f(this);
        }

        @Override // n2.q.d
        public void b(MotionEvent motionEvent) {
            d.a.d(this, motionEvent);
        }

        @Override // n2.q.d
        public boolean c(MotionEvent motionEvent) {
            return d.a.c(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean d(View view, MotionEvent motionEvent) {
            return d.a.e(this, view, motionEvent);
        }

        @Override // n2.q.d
        public boolean e() {
            return d.a.h(this);
        }

        @Override // n2.q.d
        public void f(MotionEvent motionEvent) {
            d.a.a(this, motionEvent);
        }

        @Override // n2.q.d
        public Boolean g(C0478d c0478d) {
            D2.h.f(c0478d, "handler");
            return Boolean.FALSE;
        }

        @Override // n2.q.d
        public boolean h(View view) {
            D2.h.f(view, "view");
            return view instanceof m;
        }
    }

    public q() {
        E0(true);
    }

    @Override // p055n2.C0478d
    public boolean I0(C0478d c0478d) {
        D2.h.f(c0478d, "handler");
        return !this.f10051O;
    }

    @Override // p055n2.C0478d
    public boolean J0(C0478d c0478d) {
        D2.h.f(c0478d, "handler");
        Boolean boolG = this.f10052P.g(c0478d);
        if (boolG != null) {
            return boolG.booleanValue();
        }
        if (super.J0(c0478d)) {
            return true;
        }
        if (c0478d instanceof q) {
            q qVar = (q) c0478d;
            if (qVar.Q() == 4 && qVar.f10051O) {
                return false;
            }
        }
        boolean z3 = this.f10051O;
        return !(Q() == 4 && c0478d.Q() == 4 && !z3) && Q() == 4 && !z3 && (!this.f10052P.a() || c0478d.R() > 0);
    }

    public final boolean S0() {
        return this.f10051O;
    }

    public final q T0(boolean z3) {
        this.f10051O = z3;
        return this;
    }

    public final q U0(boolean z3) {
        this.f10050N = z3;
        return this;
    }

    @Override // p055n2.C0478d
    protected void g0() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        d dVar = this.f10052P;
        View viewU = U();
        D2.h.c(motionEventObtain);
        dVar.d(viewU, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // p055n2.C0478d
    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        D2.h.f(motionEvent, "event");
        D2.h.f(motionEvent2, "sourceEvent");
        View viewU = U();
        D2.h.c(viewU);
        Context context = viewU.getContext();
        D2.h.e(context, "getContext(...)");
        boolean zC = com.swmansion.gesturehandler.react.a.c(context);
        if ((viewU instanceof RNGestureHandlerButtonViewManager.a) && zC) {
            return;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (Q() != 0 || this.f10052P.c(motionEvent)) {
                this.f10052P.d(viewU, motionEvent);
                if ((Q() == 0 || Q() == 2) && this.f10052P.h(viewU)) {
                    i();
                }
                if (Q() == 0) {
                    o();
                } else {
                    z();
                }
            } else {
                o();
            }
            this.f10052P.f(motionEvent);
            return;
        }
        if (Q() != 0 && Q() != 2) {
            if (Q() == 4) {
                this.f10052P.d(viewU, motionEvent);
                return;
            }
            return;
        }
        if (this.f10050N) {
            f10048Q.b(viewU, motionEvent);
            this.f10052P.d(viewU, motionEvent);
            i();
        } else if (f10048Q.b(viewU, motionEvent)) {
            this.f10052P.d(viewU, motionEvent);
            i();
        } else if (this.f10052P.e()) {
            this.f10052P.b(motionEvent);
        } else {
            if (Q() == 2 || !this.f10052P.c(motionEvent)) {
                return;
            }
            n();
        }
    }

    @Override // p055n2.C0478d
    protected void j0() {
        KeyEvent.Callback callbackU = U();
        if (callbackU instanceof d) {
            this.f10052P = (d) callbackU;
            return;
        }
        if (callbackU instanceof C0441j) {
            this.f10052P = new c(this, (C0441j) callbackU);
            return;
        }
        if (callbackU instanceof com.facebook.react.views.swiperefresh.a) {
            this.f10052P = new g(this, (com.facebook.react.views.swiperefresh.a) callbackU);
            return;
        }
        if (callbackU instanceof com.facebook.react.views.scroll.g) {
            this.f10052P = new f();
            return;
        }
        if (callbackU instanceof com.facebook.react.views.scroll.f) {
            this.f10052P = new f();
        } else if (callbackU instanceof m) {
            this.f10052P = new h();
        } else if (callbackU instanceof com.facebook.react.views.view.g) {
            this.f10052P = new e();
        }
    }

    @Override // p055n2.C0478d
    protected void k0() {
        this.f10052P = f10049R;
    }

    @Override // p055n2.C0478d
    public void o0() {
        super.o0();
        this.f10050N = false;
        this.f10051O = false;
    }
}
