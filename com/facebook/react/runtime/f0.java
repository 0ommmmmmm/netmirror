package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p014d1.a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final a f7181A = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e0 f7182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.facebook.react.uimanager.S f7183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.facebook.react.uimanager.Q f7184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f7186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7187z;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, e0 e0Var) {
        super(context);
        D2.h.f(e0Var, "surface");
        this.f7182u = e0Var;
        this.f7183v = new com.facebook.react.uimanager.S(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f7184w = new com.facebook.react.uimanager.Q(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // p014d1.a0, com.facebook.react.uimanager.InterfaceC0425w0
    public void b(View view, MotionEvent motionEvent) {
        D2.h.f(view, "childView");
        D2.h.f(motionEvent, "ev");
        EventDispatcher eventDispatcherI = this.f7182u.i();
        if (eventDispatcherI == null) {
            return;
        }
        this.f7183v.e(motionEvent, eventDispatcherI);
        com.facebook.react.uimanager.Q q3 = this.f7184w;
        if (q3 != null) {
            q3.o();
        }
    }

    @Override // p014d1.a0, com.facebook.react.uimanager.InterfaceC0425w0
    public void c(View view, MotionEvent motionEvent) {
        com.facebook.react.uimanager.Q q3;
        D2.h.f(motionEvent, "ev");
        EventDispatcher eventDispatcherI = this.f7182u.i();
        if (eventDispatcherI == null) {
            return;
        }
        this.f7183v.f(motionEvent, eventDispatcherI);
        if (view == null || (q3 = this.f7184w) == null) {
            return;
        }
        q3.p(view, motionEvent, eventDispatcherI);
    }

    @Override // p014d1.a0
    protected void f(MotionEvent motionEvent, boolean z3) {
        D2.h.f(motionEvent, "event");
        if (this.f7184w == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                Y.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcherI = this.f7182u.i();
        if (eventDispatcherI == null) {
            Y.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        com.facebook.react.uimanager.Q q3 = this.f7184w;
        if (q3 != null) {
            q3.k(motionEvent, eventDispatcherI, z3);
        }
    }

    @Override // p014d1.a0
    protected void g(MotionEvent motionEvent) {
        D2.h.f(motionEvent, "event");
        EventDispatcher eventDispatcherI = this.f7182u.i();
        if (eventDispatcherI != null) {
            this.f7183v.c(motionEvent, eventDispatcherI, this.f7182u.l().f0());
        } else {
            Y.a.I("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    @Override // p014d1.a0
    public ReactContext getCurrentReactContext() {
        if (this.f7182u.o()) {
            return this.f7182u.l().f0();
        }
        return null;
    }

    @Override // p014d1.a0, com.facebook.react.uimanager.InterfaceC0410o0
    public String getJSModuleName() {
        String strJ = this.f7182u.j();
        D2.h.e(strJ, "<get-moduleName>(...)");
        return strJ;
    }

    @Override // p014d1.a0, com.facebook.react.uimanager.InterfaceC0410o0
    public int getUIManagerType() {
        return 2;
    }

    @Override // p014d1.a0
    public void h(Throwable th) {
        D2.h.f(th, "t");
        ReactHostImpl reactHostImplL = this.f7182u.l();
        D2.h.e(reactHostImplL, "getReactHost(...)");
        String string = Objects.toString(th.getMessage(), "");
        D2.h.c(string);
        reactHostImplL.y0(new com.facebook.react.uimanager.P(string, this, th));
    }

    @Override // p014d1.a0
    public boolean i() {
        return this.f7182u.o() && this.f7182u.l().f0() != null;
    }

    @Override // p014d1.a0
    public boolean j() {
        return this.f7182u.o() && this.f7182u.l().A0();
    }

    @Override // p014d1.a0
    public boolean o() {
        return this.f7182u.o();
    }

    @Override // p014d1.a0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        if (this.f7185x && z3) {
            Point viewportOffset = getViewportOffset();
            this.f7182u.s(this.f7186y, this.f7187z, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // p014d1.a0, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        int size;
        int size2;
        p015d2.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i3);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i4);
        }
        setMeasuredDimension(size, size2);
        this.f7185x = true;
        this.f7186y = i3;
        this.f7187z = i4;
        Point viewportOffset = getViewportOffset();
        this.f7182u.s(i3, i4, viewportOffset.x, viewportOffset.y);
        p015d2.a.i(0L);
    }

    @Override // p014d1.a0, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    @Override // p014d1.a0
    public void setIsFabric(boolean z3) {
        super.setIsFabric(true);
    }
}
