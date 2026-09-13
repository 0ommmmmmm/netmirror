package com.facebook.react.views.text.frescosupport;

import D2.h;
import android.view.View;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p049m0.d;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
public final class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, com.facebook.react.views.text.frescosupport.a> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object callerContext;
    private final p065q0.b draweeControllerBuilder;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(B0 b4) {
        h.f(b4, "context");
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<com.facebook.react.views.text.frescosupport.a> getShadowNodeClass() {
        return com.facebook.react.views.text.frescosupport.a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        h.f(view, "root");
        h.f(obj, "extraData");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrescoBasedReactTextInlineImageViewManager(p065q0.b bVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(bVar, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.frescosupport.a createShadowNodeInstance() {
        p065q0.b bVarF = this.draweeControllerBuilder;
        if (bVarF == null) {
            bVarF = d.f();
        }
        return new com.facebook.react.views.text.frescosupport.a(bVarF, this.callerContext);
    }

    public /* synthetic */ FrescoBasedReactTextInlineImageViewManager(p065q0.b bVar, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : bVar, (i3 & 2) != 0 ? null : obj);
    }

    public FrescoBasedReactTextInlineImageViewManager(p065q0.b bVar, Object obj) {
        this.draweeControllerBuilder = bVar;
        this.callerContext = obj;
    }
}
