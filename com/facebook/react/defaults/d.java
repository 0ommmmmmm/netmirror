package com.facebook.react.defaults;

import C2.l;
import K2.o;
import android.content.Context;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.Iterator;
import java.util.List;
import p014d1.A;
import p014d1.N;
import p071r2.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6570a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static A f6571b;

    private d() {
    }

    public static final A b(Context context, N n3, JSRuntimeFactory jSRuntimeFactory) {
        D2.h.f(context, "context");
        D2.h.f(n3, "reactNativeHost");
        if (n3 instanceof g) {
            return ((g) n3).A(context, jSRuntimeFactory);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost");
    }

    public static final A c(Context context, List list, String str, String str2, String str3, JSRuntimeFactory jSRuntimeFactory, boolean z3, List list2) {
        D2.h.f(context, "context");
        D2.h.f(list, "packageList");
        D2.h.f(str, "jsMainModulePath");
        D2.h.f(str2, "jsBundleAssetPath");
        D2.h.f(list2, "cxxReactPackageProviders");
        return d(context, list, str, str2, str3, jSRuntimeFactory, z3, list2, new l() { // from class: com.facebook.react.defaults.c
            @Override // C2.l
            public final Object d(Object obj) {
                return d.g((Exception) obj);
            }
        }, null);
    }

    public static final A d(Context context, List list, String str, String str2, String str3, JSRuntimeFactory jSRuntimeFactory, boolean z3, List list2, l lVar, BindingsInstaller bindingsInstaller) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        D2.h.f(context, "context");
        D2.h.f(list, "packageList");
        D2.h.f(str, "jsMainModulePath");
        D2.h.f(str2, "jsBundleAssetPath");
        D2.h.f(list2, "cxxReactPackageProviders");
        D2.h.f(lVar, "exceptionHandler");
        if (f6571b == null) {
            if (str3 != null) {
                jSBundleLoaderCreateAssetLoader = o.z(str3, "assets://", false, 2, null) ? JSBundleLoader.createAssetLoader(context, str3, true) : JSBundleLoader.createFileLoader(str3);
            } else {
                jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, "assets://" + str2, true);
            }
            JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
            DefaultTurboModuleManagerDelegate.a aVar = new DefaultTurboModuleManagerDelegate.a();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                aVar.f((l) it.next());
            }
            D2.h.c(jSBundleLoader);
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(str, jSBundleLoader, list, jSRuntimeFactory == null ? new HermesInstance() : jSRuntimeFactory, bindingsInstaller, lVar, aVar);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            f6571b = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, z3);
        }
        A a4 = f6571b;
        D2.h.d(a4, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return a4;
    }

    public static /* synthetic */ A e(Context context, N n3, JSRuntimeFactory jSRuntimeFactory, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            jSRuntimeFactory = null;
        }
        return b(context, n3, jSRuntimeFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r g(Exception exc) throws Exception {
        D2.h.f(exc, "it");
        throw exc;
    }
}
