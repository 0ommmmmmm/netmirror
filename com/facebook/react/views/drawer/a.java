package com.facebook.react.views.drawer;

import D2.h;
import P1.m;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0230a;
import androidx.core.view.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C0396h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.AbstractC0462m;
import p068r.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p096y.a {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final b f7660T = new b(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f7661Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f7662R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f7663S;

    /* JADX INFO: renamed from: com.facebook.react.views.drawer.a$a, reason: collision with other inner class name */
    public static final class C0112a extends C0230a {
        C0112a() {
        }

        @Override // androidx.core.view.C0230a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            h.f(view, "host");
            h.f(accessibilityEvent, "event");
            super.f(view, accessibilityEvent);
            Object tag = view.getTag(AbstractC0462m.f9235g);
            if (tag instanceof C0396h0.d) {
                accessibilityEvent.setClassName(C0396h0.d.e((C0396h0.d) tag));
            }
        }

        @Override // androidx.core.view.C0230a
        public void g(View view, v vVar) {
            h.f(view, "host");
            h.f(vVar, "info");
            super.g(view, vVar);
            C0396h0.d dVarD = C0396h0.d.d(view);
            if (dVarD != null) {
                vVar.p0(C0396h0.d.e(dVarD));
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        h.f(reactContext, "reactContext");
        this.f7661Q = 8388611;
        this.f7662R = -1;
        Z.X(this, new C0112a());
    }

    public final void V() {
        d(this.f7661Q);
    }

    public final void W() {
        I(this.f7661Q);
    }

    public final void X() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            h.d(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            y.a.e eVar = (y.a.e) layoutParams;
            eVar.f11022a = this.f7661Q;
            ((ViewGroup.MarginLayoutParams) eVar).width = this.f7662R;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    @Override // p096y.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.f(motionEvent, "ev");
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            m.b(this, motionEvent);
            this.f7663S = true;
            return true;
        } catch (IllegalArgumentException e4) {
            Y.a.J("ReactNative", "Error intercepting touch event.", e4);
            return false;
        }
    }

    @Override // p096y.a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h.f(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 1 && this.f7663S) {
            m.a(this, motionEvent);
            this.f7663S = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDrawerPosition$ReactAndroid_release(int i3) {
        this.f7661Q = i3;
        X();
    }

    public final void setDrawerWidth$ReactAndroid_release(int i3) {
        this.f7662R = i3;
        X();
    }
}
