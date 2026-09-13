package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f7897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7899c;

    public final void a(MotionEvent motionEvent) {
        D2.h.f(motionEvent, "ev");
        if (this.f7897a == null) {
            this.f7897a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f7897a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f7898b = velocityTracker.getXVelocity();
                this.f7899c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f7897a = null;
            }
        }
    }

    public final float b() {
        return this.f7898b;
    }

    public final float c() {
        return this.f7899c;
    }
}
