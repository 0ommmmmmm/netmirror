package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.U0;
import com.facebook.react.uimanager.V0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import java.util.List;
import p014d1.A;
import p014d1.EnumC0455f;
import p014d1.N;
import p014d1.V;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends N {

    public static final class a implements V0 {
        a() {
        }

        @Override // com.facebook.react.uimanager.V0
        public ViewManager a(String str) {
            D2.h.f(str, "viewManagerName");
            return g.this.o().z(str);
        }

        @Override // com.facebook.react.uimanager.V0
        public Collection b() {
            return g.this.o().H();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected g(Application application) {
        super(application);
        D2.h.f(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager x(g gVar, ReactApplicationContext reactApplicationContext) {
        D2.h.f(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new com.facebook.react.fabric.f(componentFactory, gVar.l() ? new U0(gVar.new a()) : new U0((List<ViewManager>) gVar.o().G(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    public final A A(Context context, JSRuntimeFactory jSRuntimeFactory) {
        D2.h.f(context, "context");
        if (jSRuntimeFactory == null) {
            jSRuntimeFactory = D2.h.b(y(), Boolean.FALSE) ? new JSCInstance() : new HermesInstance();
        }
        JSRuntimeFactory jSRuntimeFactory2 = jSRuntimeFactory;
        List listM = m();
        D2.h.e(listM, "getPackages(...)");
        String strJ = j();
        D2.h.e(strJ, "getJSMainModuleName(...)");
        String strC = c();
        if (strC == null) {
            strC = "index";
        }
        return d.c(context, listM, (128 & 4) != 0 ? "index" : strJ, (128 & 8) == 0 ? strC : "index", (128 & 16) != 0 ? null : g(), (128 & 32) == 0 ? jSRuntimeFactory2 : null, (128 & 64) != 0 ? p026g1.a.f9424b : u(), (128 & 128) != 0 ? AbstractC0492n.g() : null);
    }

    @Override // p014d1.N
    protected EnumC0455f h() {
        Boolean boolY = y();
        if (D2.h.b(boolY, Boolean.TRUE)) {
            return EnumC0455f.HERMES;
        }
        if (D2.h.b(boolY, Boolean.FALSE)) {
            return EnumC0455f.JSC;
        }
        if (boolY == null) {
            return null;
        }
        throw new p071r2.h();
    }

    @Override // p014d1.N
    protected V.a p() {
        if (z()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // p014d1.N
    protected UIManagerProvider t() {
        if (z()) {
            return new UIManagerProvider() { // from class: com.facebook.react.defaults.f
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return g.x(this.f6572a, reactApplicationContext);
                }
            };
        }
        return null;
    }

    protected abstract Boolean y();

    protected abstract boolean z();
}
