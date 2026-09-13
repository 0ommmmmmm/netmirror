package com.reactnativecommunity.blurview;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.Q0;
import com.facebook.react.uimanager.ViewGroupManager;
import p067q2.c;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "AndroidBlurView")
class BlurViewManager extends ViewGroupManager<c> implements U1.b {
    private final Q0 mDelegate = new U1.a(this);

    public BlurViewManager(ReactApplicationContext reactApplicationContext) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected Q0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AndroidBlurView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.N
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(B0 b4) {
        return a.a(b4);
    }

    @Override // U1.b
    @L1.a(defaultBoolean = true, name = "autoUpdate")
    public void setAutoUpdate(c cVar, boolean z3) {
        a.b(cVar, z3);
    }

    @Override // U1.b
    public void setBlurAmount(c cVar, int i3) {
    }

    @Override // U1.b
    @L1.a(defaultInt = 10, name = "blurRadius")
    public void setBlurRadius(c cVar, int i3) {
        a.e(cVar, i3);
    }

    @Override // U1.b
    public void setBlurType(c cVar, String str) {
    }

    @Override // U1.b
    @L1.a(defaultInt = 10, name = "downsampleFactor")
    public void setDownsampleFactor(c cVar, int i3) {
    }

    @Override // U1.b
    @L1.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(c cVar, boolean z3) {
        a.c(cVar, z3);
    }

    @Override // U1.b
    @L1.a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(c cVar, Integer num) {
        a.d(cVar, num.intValue());
    }
}
