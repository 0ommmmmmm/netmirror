package p051m2;

import D2.h;
import P1.d;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.H0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final void a(ReactContext reactContext, d dVar) {
        h.f(reactContext, "<this>");
        h.f(dVar, "event");
        UIManager uIManagerG = H0.g(reactContext, 2);
        h.d(uIManagerG, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) uIManagerG).getEventDispatcher().b(dVar);
    }
}
