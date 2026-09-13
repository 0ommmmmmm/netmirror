package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f7381e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7377a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f7378b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7379c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7380d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P1.r f7382f = new P1.r();

    public S(ViewGroup viewGroup) {
        this.f7381e = viewGroup;
    }

    private void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f7377a == -1) {
            Y.a.I("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        p002a1.a.b(!this.f7379c, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) p002a1.a.c(eventDispatcher);
        int iF = H0.f(this.f7381e);
        int i3 = this.f7377a;
        P1.s sVar = P1.s.CANCEL;
        long j3 = this.f7380d;
        float[] fArr = this.f7378b;
        eventDispatcher2.b(P1.q.B(iF, i3, sVar, motionEvent, j3, fArr[0], fArr[1], this.f7382f));
    }

    private int b(MotionEvent motionEvent) {
        return C0.c(motionEvent.getX(), motionEvent.getY(), this.f7381e, this.f7378b, null);
    }

    private void d(int i3, int i4, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = H0.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.markActiveTouchForTag(i3, i4);
    }

    private void g(int i3, int i4, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = H0.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.sweepActiveTouchForTag(i3, i4);
    }

    public void c(MotionEvent motionEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f7377a != -1) {
                Y.a.m("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f7379c = false;
            this.f7380d = motionEvent.getEventTime();
            this.f7377a = b(motionEvent);
            d(H0.f(this.f7381e), this.f7377a, reactContext);
            int iF = H0.f(this.f7381e);
            int i3 = this.f7377a;
            P1.s sVar = P1.s.START;
            long j3 = this.f7380d;
            float[] fArr = this.f7378b;
            eventDispatcher.b(P1.q.B(iF, i3, sVar, motionEvent, j3, fArr[0], fArr[1], this.f7382f));
            return;
        }
        if (this.f7379c) {
            return;
        }
        if (this.f7377a == -1) {
            Y.a.m("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            b(motionEvent);
            int iF2 = H0.f(this.f7381e);
            int i4 = this.f7377a;
            P1.s sVar2 = P1.s.END;
            long j4 = this.f7380d;
            float[] fArr2 = this.f7378b;
            eventDispatcher.b(P1.q.B(iF2, i4, sVar2, motionEvent, j4, fArr2[0], fArr2[1], this.f7382f));
            g(iF2, this.f7377a, reactContext);
            this.f7377a = -1;
            this.f7380d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            b(motionEvent);
            int iF3 = H0.f(this.f7381e);
            int i5 = this.f7377a;
            P1.s sVar3 = P1.s.MOVE;
            long j5 = this.f7380d;
            float[] fArr3 = this.f7378b;
            eventDispatcher.b(P1.q.B(iF3, i5, sVar3, motionEvent, j5, fArr3[0], fArr3[1], this.f7382f));
            return;
        }
        if (action == 5) {
            int iF4 = H0.f(this.f7381e);
            int i6 = this.f7377a;
            P1.s sVar4 = P1.s.START;
            long j6 = this.f7380d;
            float[] fArr4 = this.f7378b;
            eventDispatcher.b(P1.q.B(iF4, i6, sVar4, motionEvent, j6, fArr4[0], fArr4[1], this.f7382f));
            return;
        }
        if (action == 6) {
            int iF5 = H0.f(this.f7381e);
            int i7 = this.f7377a;
            P1.s sVar5 = P1.s.END;
            long j7 = this.f7380d;
            float[] fArr5 = this.f7378b;
            eventDispatcher.b(P1.q.B(iF5, i7, sVar5, motionEvent, j7, fArr5[0], fArr5[1], this.f7382f));
            return;
        }
        if (action == 3) {
            if (this.f7382f.c(motionEvent.getDownTime())) {
                a(motionEvent, eventDispatcher);
            } else {
                Y.a.m("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            g(H0.f(this.f7381e), this.f7377a, reactContext);
            this.f7377a = -1;
            this.f7380d = Long.MIN_VALUE;
            return;
        }
        Y.a.I("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f7377a);
    }

    public void e(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        this.f7379c = false;
    }

    public void f(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f7379c) {
            return;
        }
        a(motionEvent, eventDispatcher);
        this.f7379c = true;
        this.f7377a = -1;
    }
}
