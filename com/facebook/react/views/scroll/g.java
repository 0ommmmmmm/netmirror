package com.facebook.react.views.scroll;

import R1.p;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.Z;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0400j0;
import com.facebook.react.uimanager.EnumC0394g0;
import com.facebook.react.uimanager.InterfaceC0398i0;
import com.facebook.react.uimanager.InterfaceC0406m0;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import java.lang.reflect.Field;
import java.util.List;
import p014d1.AbstractC0462m;

/* JADX INFO: loaded from: classes.dex */
public class g extends ScrollView implements InterfaceC0398i0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, d, InterfaceC0406m0, j.c, j.e, j.a, j.b, j.d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static Field f7813J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static boolean f7814K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f7815A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f7816B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private A0 f7817C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final j.g f7818D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ValueAnimator f7819E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private EnumC0394g0 f7820F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f7821G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7822H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.facebook.react.views.scroll.b f7823I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OverScroller f7825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f7826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f7827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f7828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rect f7830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f7831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Runnable f7834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f7838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f7839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f7843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f7847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ReadableMap f7848z;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7849b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7850c = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (g.this.f7829g) {
                g.this.f7829g = false;
                this.f7850c = 0;
                Z.T(g.this, this, 20L);
                return;
            }
            j.s(g.this);
            int i3 = this.f7850c + 1;
            this.f7850c = i3;
            if (i3 < 3) {
                if (g.this.f7833k && !this.f7849b) {
                    this.f7849b = true;
                    g.this.u(0);
                }
                Z.T(g.this, this, 20L);
                return;
            }
            g.this.f7834l = null;
            if (g.this.f7837o) {
                j.j(g.this);
            }
            ReactContext reactContext = (ReactContext) g.this.getContext();
            if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                nativeAnimatedModule.userDrivenScrollEnded(g.this.getId());
            }
            g.this.r();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7852a;

        static {
            int[] iArr = new int[p.values().length];
            f7852a = iArr;
            try {
                iArr[p.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7852a[p.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7852a[p.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        this(context, null);
    }

    private boolean A() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean B() {
        return false;
    }

    private int C(int i3) {
        if (getFlingAnimator() == this.f7819E) {
            return j.p(this, 0, i3, 0, getMaxScrollY()).y;
        }
        return v(i3) + j.m(this, getScrollY(), getReactScrollViewScrollState().b().y, i3);
    }

    private void D(int i3) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f7825c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.f7825c.getCurrY();
        boolean zComputeScrollOffset = this.f7825c.computeScrollOffset();
        this.f7825c.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), i3 + (this.f7825c.getCurrX() - currY));
            return;
        }
        this.f7825c.fling(getScrollX(), i3, 0, (int) (this.f7825c.getCurrVelocity() * Math.signum(this.f7825c.getFinalY() - this.f7825c.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    private void E(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void G(int i3, int i4) {
        if (A()) {
            this.f7815A = -1;
            this.f7816B = -1;
        } else {
            this.f7815A = i3;
            this.f7816B = i4;
        }
    }

    private void H(int i3) {
        double snapInterval = getSnapInterval();
        double dM = j.m(this, getScrollY(), getReactScrollViewScrollState().b().y, i3);
        double dC = C(i3);
        double d4 = dM / snapInterval;
        int iFloor = (int) Math.floor(d4);
        int iCeil = (int) Math.ceil(d4);
        int iRound = (int) Math.round(d4);
        int iRound2 = (int) Math.round(dC / snapInterval);
        if (i3 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i3 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i3 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i3 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d5 = ((double) iRound) * snapInterval;
        if (d5 != dM) {
            this.f7829g = true;
            f(getScrollX(), (int) d5);
        }
    }

    private void I(int i3) {
        getReactScrollViewScrollState().l(i3);
        j.k(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f7847y;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f7814K) {
            f7814K = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f7813J = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Y.a.I("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f7813J;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    Y.a.I("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e4);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i3 = this.f7842t;
        return i3 != 0 ? i3 : getHeight();
    }

    private void p() {
        Runnable runnable = this.f7834l;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f7834l = null;
            getFlingAnimator().cancel();
        }
    }

    private int q(int i3) {
        if (Build.VERSION.SDK_INT != 28) {
            return i3;
        }
        float fSignum = Math.signum(this.f7824b.b());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i3);
        }
        return (int) (Math.abs(i3) * fSignum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (B()) {
            p002a1.a.c(null);
            p002a1.a.c(this.f7838p);
            throw null;
        }
    }

    private void s() {
        if (B()) {
            p002a1.a.c(null);
            p002a1.a.c(this.f7838p);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    public void u(int i3) {
        int iMin;
        int iMax;
        int iIntValue;
        int top;
        int top2;
        int height;
        int scrollY;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f7842t == 0 && this.f7843u == null && this.f7846x == 0) {
            H(i3);
            return;
        }
        int i4 = 1;
        boolean z3 = getFlingAnimator() != this.f7819E;
        int maxScrollY = getMaxScrollY();
        int iC = C(i3);
        if (this.f7841s) {
            iC = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List list = this.f7843u;
        if (list != null) {
            iIntValue = ((Integer) list.get(0)).intValue();
            List list2 = this.f7843u;
            maxScrollY = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = maxScrollY;
            iMax = 0;
            for (int i5 = 0; i5 < this.f7843u.size(); i5++) {
                int iIntValue2 = ((Integer) this.f7843u.get(i5)).intValue();
                if (iIntValue2 <= iC && iC - iIntValue2 < iC - iMax) {
                    iMax = iIntValue2;
                }
                if (iIntValue2 >= iC && iIntValue2 - iC < iMin - iC) {
                    iMin = iIntValue2;
                }
            }
        } else {
            int i6 = this.f7846x;
            if (i6 != 0) {
                int i7 = this.f7842t;
                if (i7 > 0) {
                    double d4 = ((double) iC) / ((double) i7);
                    double dFloor = Math.floor(d4);
                    int i8 = this.f7842t;
                    int iMax2 = Math.max(w(i6, (int) (dFloor * ((double) i8)), i8, height2), 0);
                    int i9 = this.f7846x;
                    double dCeil = Math.ceil(d4);
                    int i10 = this.f7842t;
                    iMin = Math.min(w(i9, (int) (dCeil * ((double) i10)), i10, height2), maxScrollY);
                    iMax = iMax2;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i11 = iMin2;
                    int i12 = 0;
                    int i13 = 0;
                    int iMax3 = 0;
                    while (i12 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i12);
                        int i14 = this.f7846x;
                        if (i14 != i4) {
                            if (i14 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i14 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f7846x);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= iC && iC - top < iC - i13) {
                            i13 = top;
                        }
                        if (top >= iC && top - iC < i11 - iC) {
                            i11 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax3 = Math.max(iMax3, top);
                        i12++;
                        i4 = 1;
                    }
                    iMax = Math.max(i13, iMin2);
                    iMin = Math.min(i11, iMax3);
                }
            } else {
                double snapInterval = getSnapInterval();
                double d5 = ((double) iC) / snapInterval;
                int iFloor = (int) (Math.floor(d5) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d5) * snapInterval), maxScrollY);
                iMax = iFloor;
            }
            iIntValue = 0;
        }
        int i15 = iC - iMax;
        int i16 = iMin - iC;
        int i17 = Math.abs(i15) < Math.abs(i16) ? iMax : iMin;
        if (this.f7845w || iC < maxScrollY) {
            if (this.f7844v || iC > iIntValue) {
                if (i3 > 0) {
                    scrollY = !z3 ? i3 + ((int) (((double) i16) * 10.0d)) : i3;
                    iC = iMin;
                } else if (i3 < 0) {
                    scrollY = !z3 ? i3 - ((int) (((double) i15) * 10.0d)) : i3;
                    iC = iMax;
                } else {
                    scrollY = i3;
                    iC = i17;
                }
            } else if (getScrollY() <= iIntValue) {
                scrollY = i3;
            } else {
                scrollY = i3;
                iC = iIntValue;
            }
        } else if (getScrollY() >= maxScrollY) {
            scrollY = i3;
        } else {
            scrollY = i3;
            iC = maxScrollY;
        }
        int iMin3 = Math.min(Math.max(0, iC), maxScrollY);
        if (z3 || (overScroller = this.f7825c) == null) {
            f(getScrollX(), iMin3);
            return;
        }
        this.f7829g = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private int w(int i3, int i4, int i5, int i6) {
        int i7;
        if (i3 == 1) {
            return i4;
        }
        if (i3 == 2) {
            i7 = (i6 - i5) / 2;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f7846x);
            }
            i7 = i6 - i5;
        }
        return i4 - i7;
    }

    private int x(View view) {
        view.getDrawingRect(this.f7827e);
        offsetDescendantRectToMyCoords(view, this.f7827e);
        return computeScrollDeltaToGetChildRectOnScreen(this.f7827e);
    }

    private void z(int i3, int i4) {
        if (this.f7834l != null) {
            return;
        }
        if (this.f7837o) {
            s();
            j.i(this, i3, i4);
        }
        this.f7829g = false;
        a aVar = new a();
        this.f7834l = aVar;
        Z.T(this, aVar, 20L);
    }

    public void F(float f3, int i3) {
        C0381a.q(this, R1.d.values()[i3], Float.isNaN(f3) ? null : new W(C0392f0.f(f3), X.POINT));
    }

    @Override // com.facebook.react.views.scroll.j.a
    public void a(int i3, int i4) {
        this.f7819E.cancel();
        int iL = j.l(getContext());
        this.f7819E.setDuration(iL).setIntValues(i3, i4);
        this.f7819E.start();
        if (this.f7837o) {
            j.i(this, 0, iL > 0 ? (i4 - i3) / iL : 0);
            j.a(this);
        }
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void b(int i3, int i4) {
        scrollTo(i3, i4);
        D(i4);
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean c(View view) {
        int iX = x(view);
        view.getDrawingRect(this.f7827e);
        return iX != 0 && Math.abs(iX) < this.f7827e.width();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0406m0
    public void d(int i3, int i4, int i5, int i6) {
        this.f7828f.set(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (EnumC0394g0.c(this.f7820F)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f7840r != 0) {
            View contentView = getContentView();
            if (this.f7839q != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f7839q.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f7839q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0398i0
    public void e() {
        if (this.f7835m) {
            p015d2.a.c(0L, "ReactScrollView.updateClippingRect");
            try {
                p002a1.a.c(this.f7830h);
                C0400j0.a(this, this.f7830h);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof InterfaceC0398i0) {
                    ((InterfaceC0398i0) contentView).e();
                }
            } finally {
                p015d2.a.i(0L);
            }
        }
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f7836n || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void f(int i3, int i4) {
        j.r(this, i3, i4);
        G(i3, i4);
    }

    @Override // android.widget.ScrollView
    public void fling(int i3) {
        int iQ = q(i3);
        if (this.f7833k) {
            u(iQ);
        } else if (this.f7825c != null) {
            this.f7825c.fling(getScrollX(), getScrollY(), 0, iQ, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            Z.R(this);
        } else {
            super.fling(iQ);
        }
        z(0, iQ);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0398i0
    public void g(Rect rect) {
        rect.set((Rect) p002a1.a.c(this.f7830h));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.views.scroll.j.a
    public ValueAnimator getFlingAnimator() {
        return this.f7819E;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public long getLastScrollDispatchTime() {
        return this.f7821G;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0404l0
    public String getOverflow() {
        int i3 = b.f7852a[this.f7831i.ordinal()];
        if (i3 == 1) {
            return "hidden";
        }
        if (i3 == 2) {
            return "scroll";
        }
        if (i3 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.InterfaceC0406m0
    public Rect getOverflowInset() {
        return this.f7828f;
    }

    public EnumC0394g0 getPointerEvents() {
        return this.f7820F;
    }

    @Override // com.facebook.react.views.scroll.j.c
    public j.g getReactScrollViewScrollState() {
        return this.f7818D;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0398i0
    public boolean getRemoveClippedSubviews() {
        return this.f7835m;
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean getScrollEnabled() {
        return this.f7836n;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public int getScrollEventThrottle() {
        return this.f7822H;
    }

    @Override // com.facebook.react.views.scroll.j.e
    public A0 getStateWrapper() {
        return this.f7817C;
    }

    public void o() {
        OverScroller overScroller = this.f7825c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f7825c.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7835m) {
            e();
        }
        com.facebook.react.views.scroll.b bVar = this.f7823I;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f7847y = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f7847y;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f7847y = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.b bVar = this.f7823I;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f7831i != p.VISIBLE) {
            C0381a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(AbstractC0462m.f9248t);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f7836n) {
            return false;
        }
        if (!EnumC0394g0.c(this.f7820F)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                y(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e4) {
            Y.a.J("ReactNative", "Error intercepting touch event.", e4);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        if (A()) {
            int scrollX = this.f7815A;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f7816B;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        j.c(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (this.f7847y == null) {
            return;
        }
        com.facebook.react.views.scroll.b bVar = this.f7823I;
        if (bVar != null) {
            bVar.h();
        }
        if (isShown() && A()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        j.b(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        com.facebook.react.uimanager.Z.a(i3, i4);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        int maxScrollY;
        OverScroller overScroller = this.f7825c;
        if (overScroller != null && this.f7847y != null && !overScroller.isFinished() && this.f7825c.getCurrY() != this.f7825c.getFinalY() && i4 >= (maxScrollY = getMaxScrollY())) {
            this.f7825c.abortAnimation();
            i4 = maxScrollY;
        }
        super.onOverScrolled(i3, i4, z3, z4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i3, int i4, int i5, int i6) {
        p015d2.a.c(0L, "ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i3, i4, i5, i6);
            this.f7829g = true;
            if (this.f7824b.c(i3, i4)) {
                if (this.f7835m) {
                    e();
                }
                j.u(this, this.f7824b.a(), this.f7824b.b());
            }
        } finally {
            p015d2.a.i(0L);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (this.f7835m) {
            e();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7836n || !EnumC0394g0.b(this.f7820F)) {
            return false;
        }
        this.f7826d.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f7832j) {
            j.s(this);
            float fB = this.f7826d.b();
            float fC = this.f7826d.c();
            j.e(this, fB, fC);
            P1.m.a(this, motionEvent);
            this.f7832j = false;
            z(Math.round(fB), Math.round(fC));
        }
        if (actionMasked == 0) {
            p();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            E(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i3, int i4) {
        super.scrollTo(i3, i4);
        j.s(this);
        G(i3, i4);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        C0381a.n(this, Integer.valueOf(i3));
    }

    public void setBorderRadius(float f3) {
        F(f3, R1.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        C0381a.r(this, str == null ? null : R1.f.b(str));
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f7848z;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f7848z = readableMap;
            if (readableMap != null) {
                scrollTo((int) C0392f0.g(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) C0392f0.g(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f3) {
        getReactScrollViewScrollState().h(f3);
        OverScroller overScroller = this.f7825c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f3);
        }
    }

    public void setDisableIntervalMomentum(boolean z3) {
        this.f7841s = z3;
    }

    public void setEndFillColor(int i3) {
        if (i3 != this.f7840r) {
            this.f7840r = i3;
            this.f7839q = new ColorDrawable(this.f7840r);
        }
    }

    @Override // com.facebook.react.views.scroll.j.b
    public void setLastScrollDispatchTime(long j3) {
        this.f7821G = j3;
    }

    public void setMaintainVisibleContentPosition(com.facebook.react.views.scroll.b.C0115b c0115b) {
        com.facebook.react.views.scroll.b bVar;
        if (c0115b != null && this.f7823I == null) {
            com.facebook.react.views.scroll.b bVar2 = new com.facebook.react.views.scroll.b(this, false);
            this.f7823I = bVar2;
            bVar2.f();
        } else if (c0115b == null && (bVar = this.f7823I) != null) {
            bVar.g();
            this.f7823I = null;
        }
        com.facebook.react.views.scroll.b bVar3 = this.f7823I;
        if (bVar3 != null) {
            bVar3.e(c0115b);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f7831i = p.SCROLL;
        } else {
            p pVarB = p.b(str);
            if (pVarB == null) {
                pVarB = p.SCROLL;
            }
            this.f7831i = pVarB;
        }
        invalidate();
    }

    public void setPagingEnabled(boolean z3) {
        this.f7833k = z3;
    }

    public void setPointerEvents(EnumC0394g0 enumC0394g0) {
        this.f7820F = enumC0394g0;
    }

    public void setRemoveClippedSubviews(boolean z3) {
        if (z3 && this.f7830h == null) {
            this.f7830h = new Rect();
        }
        this.f7835m = z3;
        e();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i3) {
        int childCount = getChildCount();
        p002a1.a.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                getChildAt(i4).setTranslationY(i3);
            }
            setPadding(0, 0, 0, i3);
        }
        I(i3);
        setRemoveClippedSubviews(this.f7835m);
    }

    public void setScrollEnabled(boolean z3) {
        this.f7836n = z3;
    }

    public void setScrollEventThrottle(int i3) {
        this.f7822H = i3;
    }

    public void setScrollPerfTag(String str) {
        this.f7838p = str;
    }

    public void setSendMomentumEvents(boolean z3) {
        this.f7837o = z3;
    }

    public void setSnapInterval(int i3) {
        this.f7842t = i3;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f7843u = list;
    }

    public void setSnapToAlignment(int i3) {
        this.f7846x = i3;
    }

    public void setSnapToEnd(boolean z3) {
        this.f7845w = z3;
    }

    public void setSnapToStart(boolean z3) {
        this.f7844v = z3;
    }

    public void setStateWrapper(A0 a4) {
        this.f7817C = a4;
    }

    public void t() {
        awakenScrollBars();
    }

    public int v(int i3) {
        return j.p(this, 0, i3, 0, getMaxScrollY()).y;
    }

    protected void y(MotionEvent motionEvent) {
        P1.m.b(this, motionEvent);
        j.d(this);
        this.f7832j = true;
        s();
        getFlingAnimator().cancel();
    }

    public g(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f7824b = new c();
        this.f7826d = new m();
        this.f7827e = new Rect();
        this.f7828f = new Rect();
        this.f7831i = p.SCROLL;
        this.f7833k = false;
        this.f7836n = true;
        this.f7840r = 0;
        this.f7841s = false;
        this.f7842t = 0;
        this.f7844v = true;
        this.f7845w = true;
        this.f7846x = 0;
        this.f7848z = null;
        this.f7815A = -1;
        this.f7816B = -1;
        this.f7817C = null;
        this.f7818D = new j.g();
        this.f7819E = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.f7820F = EnumC0394g0.AUTO;
        this.f7821G = 0L;
        this.f7822H = 0;
        this.f7823I = null;
        this.f7825c = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        Z.X(this, new h());
    }
}
