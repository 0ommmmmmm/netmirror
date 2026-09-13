package com.facebook.react.views.swiperefresh;

import D2.h;
import P1.m;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C0392f0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.swiperefreshlayout.widget.c {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final C0117a f7900c0 = new C0117a(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f7901S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f7902T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f7903U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int f7904V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f7905W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f7906a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f7907b0;

    /* JADX INFO: renamed from: com.facebook.react.views.swiperefresh.a$a, reason: collision with other inner class name */
    private static final class C0117a {
        public /* synthetic */ C0117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0117a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        h.f(reactContext, "reactContext");
        this.f7904V = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7905W = motionEvent.getX();
            this.f7906a0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f7905W);
            if (this.f7906a0 || fAbs > this.f7904V) {
                this.f7906a0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean d() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.d();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.f(motionEvent, "ev");
        if (!B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        m.b(this, motionEvent);
        this.f7907b0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (this.f7901S) {
            return;
        }
        this.f7901S = true;
        setProgressViewOffset(this.f7903U);
        setRefreshing(this.f7902T);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h.f(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 1 && this.f7907b0) {
            m.a(this, motionEvent);
            this.f7907b0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    public final void setProgressViewOffset(float f3) {
        this.f7903U = f3;
        if (this.f7901S) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(C0392f0.h(f3)) - progressCircleDiameter, Math.round(C0392f0.h(f3 + 64.0f)) - progressCircleDiameter);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z3) {
        this.f7902T = z3;
        if (this.f7901S) {
            super.setRefreshing(z3);
        }
    }
}
