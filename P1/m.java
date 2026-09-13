package P1;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.C0427x0;
import com.facebook.react.uimanager.InterfaceC0425w0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f1650a = new m();

    private m() {
    }

    public static final void a(View view, MotionEvent motionEvent) {
        D2.h.f(view, "view");
        D2.h.f(motionEvent, "event");
        InterfaceC0425w0 interfaceC0425w0A = C0427x0.a(view);
        if (interfaceC0425w0A != null) {
            interfaceC0425w0A.b(view, motionEvent);
        }
    }

    public static final void b(View view, MotionEvent motionEvent) {
        D2.h.f(view, "view");
        D2.h.f(motionEvent, "event");
        InterfaceC0425w0 interfaceC0425w0A = C0427x0.a(view);
        if (interfaceC0425w0A != null) {
            interfaceC0425w0A.c(view, motionEvent);
        }
    }
}
