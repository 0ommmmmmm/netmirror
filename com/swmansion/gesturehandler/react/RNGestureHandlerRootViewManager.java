package com.swmansion.gesturehandler.react;

import U1.s;
import android.view.View;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.Q0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = RNGestureHandlerRootViewManager.REACT_CLASS)
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<k> implements W0 {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final Q0 mDelegate = new s(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected Q0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return D.i(p071r2.n.a("onGestureHandlerEvent", D.i(p071r2.n.a("registrationName", "onGestureHandlerEvent"))), p071r2.n.a("onGestureHandlerStateChange", D.i(p071r2.n.a("registrationName", "onGestureHandlerStateChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.N
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(B0 b4) {
        D2.h.f(b4, "reactContext");
        return new k(b4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(k kVar) {
        D2.h.f(kVar, "view");
        kVar.G();
    }
}
