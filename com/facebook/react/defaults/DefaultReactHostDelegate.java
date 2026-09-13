package com.facebook.react.defaults;

import C2.l;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC0361f;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.O;
import p014d1.V;
import p071r2.r;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultReactHostDelegate implements InterfaceC0361f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSBundleLoader f6555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSRuntimeFactory f6557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BindingsInstaller f6558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f6559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.a f6560g;

    public DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List<? extends O> list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, l lVar, V.a aVar) {
        D2.h.f(str, "jsMainModulePath");
        D2.h.f(jSBundleLoader, "jsBundleLoader");
        D2.h.f(list, "reactPackages");
        D2.h.f(jSRuntimeFactory, "jsRuntimeFactory");
        D2.h.f(lVar, "exceptionHandler");
        D2.h.f(aVar, "turboModuleManagerDelegateBuilder");
        this.f6554a = str;
        this.f6555b = jSBundleLoader;
        this.f6556c = list;
        this.f6557d = jSRuntimeFactory;
        this.f6558e = bindingsInstaller;
        this.f6559f = lVar;
        this.f6560g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(Exception exc) throws Exception {
        D2.h.f(exc, "it");
        throw exc;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public void a(Exception exc) {
        D2.h.f(exc, "error");
        this.f6559f.d(exc);
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public JSBundleLoader b() {
        return this.f6555b;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public V.a c() {
        return this.f6560g;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public JSRuntimeFactory d() {
        return this.f6557d;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public String e() {
        return this.f6554a;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public List f() {
        return this.f6556c;
    }

    @Override // com.facebook.react.runtime.InterfaceC0361f
    public BindingsInstaller getBindingsInstaller() {
        return this.f6558e;
    }

    public /* synthetic */ DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, l lVar, V.a aVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i3 & 4) != 0 ? AbstractC0492n.g() : list, (i3 & 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (i3 & 16) != 0 ? null : bindingsInstaller, (i3 & 32) != 0 ? new l() { // from class: com.facebook.react.defaults.e
            @Override // C2.l
            public final Object d(Object obj) {
                return DefaultReactHostDelegate.h((Exception) obj);
            }
        } : lVar, aVar);
    }
}
