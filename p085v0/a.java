package p085v0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0149a f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f10906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f10907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f10908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f10909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f10910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f10911g;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0149a {
        boolean f();
    }

    public a(Context context) {
        this.f10906b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f10905a = null;
        e();
    }

    public boolean b() {
        return this.f10907c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0149a interfaceC0149a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10907c = true;
            this.f10908d = true;
            this.f10909e = motionEvent.getEventTime();
            this.f10910f = motionEvent.getX();
            this.f10911g = motionEvent.getY();
        } else if (action == 1) {
            this.f10907c = false;
            if (Math.abs(motionEvent.getX() - this.f10910f) > this.f10906b || Math.abs(motionEvent.getY() - this.f10911g) > this.f10906b) {
                this.f10908d = false;
            }
            if (this.f10908d && motionEvent.getEventTime() - this.f10909e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0149a = this.f10905a) != null) {
                interfaceC0149a.f();
            }
            this.f10908d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f10907c = false;
                this.f10908d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f10910f) > this.f10906b || Math.abs(motionEvent.getY() - this.f10911g) > this.f10906b) {
            this.f10908d = false;
        }
        return true;
    }

    public void e() {
        this.f10907c = false;
        this.f10908d = false;
    }

    public void f(InterfaceC0149a interfaceC0149a) {
        this.f10905a = interfaceC0149a;
    }
}
