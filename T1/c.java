package T1;

import D2.h;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2348a = new c();

    private c() {
    }

    public static final void a(String str) {
        h.f(str, "message");
        Y.a.m("ReactNative", str);
    }

    private final String b(int i3) {
        if (i3 == 2 || i3 == 3) {
            return "log";
        }
        if (i3 == 4 || i3 == 5) {
            return "warn";
        }
        return i3 != 6 ? "none" : "error";
    }

    private final void c(ReactContext reactContext, String str, int i3) {
        if (i3 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i3), str);
    }

    public static final void d(ReactContext reactContext, String str) {
        h.f(str, "message");
        f2348a.c(reactContext, str, 5);
        Y.a.I("ReactNative", str);
    }
}
