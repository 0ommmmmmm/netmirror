package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.n;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = ReactImageManager.REACT_CLASS)
public final class ReactImageManager extends SimpleViewManager<h> {
    public static final a Companion = new a(null);
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final f callerContextFactory;
    private final p065q0.b draweeControllerBuilder;
    private final com.facebook.react.views.image.a globalImageLoadListener;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap();
        }
        b.a aVar = b.f7664o;
        exportedCustomDirectEventTypeConstants.put(aVar.f(4), DebugProbesKt.probeCoroutineResumed(n.a(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(5), DebugProbesKt.probeCoroutineResumed(n.a(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(2), DebugProbesKt.probeCoroutineResumed(n.a(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(1), DebugProbesKt.probeCoroutineResumed(n.a(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(3), DebugProbesKt.probeCoroutineResumed(n.a(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @L1.a(name = "accessible")
    public final void setAccessible(h hVar, boolean z3) {
        D2.h.f(hVar, "view");
        hVar.setFocusable(z3);
    }

    @L1.a(name = "blurRadius")
    public final void setBlurRadius(h hVar, float f3) {
        D2.h.f(hVar, "view");
        hVar.setBlurRadius(f3);
    }

    @L1.a(customType = "Color", name = "borderColor")
    public final void setBorderColor(h hVar, Integer num) {
        D2.h.f(hVar, "view");
        C0381a.p(hVar, R1.n.ALL, num);
    }

    @L1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(h hVar, int i3, float f3) {
        D2.h.f(hVar, "view");
        C0381a.q(hVar, R1.d.values()[i3], Float.isNaN(f3) ? null : new W(f3, X.POINT));
    }

    @L1.a(name = "borderWidth")
    public final void setBorderWidth(h hVar, float f3) {
        D2.h.f(hVar, "view");
        C0381a.s(hVar, R1.n.ALL, Float.valueOf(f3));
    }

    @L1.a(name = "defaultSource")
    public final void setDefaultSource(h hVar, String str) {
        D2.h.f(hVar, "view");
        hVar.setDefaultSource(str);
    }

    @L1.a(name = "fadeDuration")
    public final void setFadeDuration(h hVar, int i3) {
        D2.h.f(hVar, "view");
        hVar.setFadeDuration(i3);
    }

    @L1.a(name = "headers")
    public final void setHeaders(h hVar, ReadableMap readableMap) {
        D2.h.f(hVar, "view");
        if (readableMap != null) {
            hVar.setHeaders(readableMap);
        }
    }

    @L1.a(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(h hVar, String str) {
        D2.h.f(hVar, "view");
    }

    @L1.a(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(h hVar, boolean z3) {
        D2.h.f(hVar, "view");
        hVar.setShouldNotifyLoadEvents(z3);
    }

    @L1.a(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(h hVar, String str) {
        D2.h.f(hVar, "view");
        hVar.setLoadingIndicatorSource(str);
    }

    @L1.a(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(h hVar, Integer num) {
        D2.h.f(hVar, "view");
        if (num == null) {
            hVar.setOverlayColor(0);
        } else {
            hVar.setOverlayColor(num.intValue());
        }
    }

    @L1.a(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(h hVar, boolean z3) {
        D2.h.f(hVar, "view");
        hVar.setProgressiveRenderingEnabled(z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r3.equals("auto") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @L1.a(name = "resizeMethod")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeMethod(com.facebook.react.views.image.h r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            D2.h.f(r2, r0)
            if (r3 == 0) goto L65
            int r0 = r3.hashCode()
            switch(r0) {
                case -934437708: goto L36;
                case 3005871: goto L2d;
                case 3387192: goto L1e;
                case 109250890: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            java.lang.String r0 = "scale"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            goto L3e
        L18:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.SCALE
            r2.setResizeMethod(r3)
            goto L6a
        L1e:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto L3e
        L27:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.NONE
            r2.setResizeMethod(r3)
            goto L6a
        L2d:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L65
            goto L3e
        L36:
            java.lang.String r0 = "resize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5f
        L3e:
            com.facebook.react.views.image.c r0 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Invalid resize method: '"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ReactNative"
            Y.a.I(r3, r2)
            goto L6a
        L5f:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.RESIZE
            r2.setResizeMethod(r3)
            goto L6a
        L65:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r3)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.h, java.lang.String):void");
    }

    @L1.a(name = "resizeMode")
    public final void setResizeMode(h hVar, String str) {
        D2.h.f(hVar, "view");
        hVar.setScaleType(d.c(str));
        hVar.setTileMode(d.d(str));
    }

    @L1.a(name = "resizeMultiplier")
    public final void setResizeMultiplier(h hVar, float f3) {
        D2.h.f(hVar, "view");
        if (f3 < 0.01f) {
            Y.a.I("ReactNative", "Invalid resize multiplier: '" + f3 + "'");
        }
        hVar.setResizeMultiplier(f3);
    }

    @L1.a(name = "source")
    public final void setSource(h hVar, ReadableArray readableArray) {
        D2.h.f(hVar, "view");
        hVar.setSource(readableArray);
    }

    @L1.a(name = "src")
    public final void setSrc(h hVar, ReadableArray readableArray) {
        D2.h.f(hVar, "view");
        setSource(hVar, readableArray);
    }

    @L1.a(customType = "Color", name = "tintColor")
    public final void setTintColor(h hVar, Integer num) {
        D2.h.f(hVar, "view");
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(p065q0.b bVar) {
        this(bVar, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(B0 b4) {
        D2.h.f(b4, "context");
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        p065q0.b bVarF = this.draweeControllerBuilder;
        if (bVarF == null) {
            bVarF = p049m0.d.f();
        }
        D2.h.c(bVarF);
        return new h(b4, bVarF, null, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        D2.h.f(hVar, "view");
        super.onAfterUpdateTransaction(hVar);
        hVar.o();
    }

    public ReactImageManager(p065q0.b bVar, com.facebook.react.views.image.a aVar) {
        this(bVar, aVar, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(p065q0.b bVar, com.facebook.react.views.image.a aVar, f fVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : bVar, (i3 & 2) != 0 ? null : aVar, (i3 & 4) != 0 ? null : fVar);
    }

    public ReactImageManager(p065q0.b bVar, com.facebook.react.views.image.a aVar, f fVar) {
        this.draweeControllerBuilder = bVar;
    }

    public ReactImageManager(p065q0.b bVar, Object obj) {
        this(bVar, (com.facebook.react.views.image.a) null, (f) null);
        this.callerContext = obj;
    }

    public ReactImageManager(p065q0.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        this(bVar, aVar, (f) null);
        this.callerContext = obj;
    }
}
