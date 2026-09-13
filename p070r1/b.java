package p070r1;

import C2.a;
import D2.h;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10533a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f10534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f10535c;

    static {
        a aVar = new a() { // from class: r1.a
            @Override // C2.a
            public final Object a() {
                return b.b();
            }
        };
        f10534b = aVar;
        f10535c = (c) aVar.a();
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d b() {
        return new d();
    }

    public static final boolean c() {
        return f10535c.enableBridgelessArchitecture();
    }

    public static final boolean d() {
        return f10535c.enableEagerRootViewAttachment();
    }

    public static final boolean e() {
        return f10535c.enableFabricLogs();
    }

    public static final boolean f() {
        return f10535c.enableFabricRenderer();
    }

    public static final boolean g() {
        return f10535c.enableImagePrefetchingAndroid();
    }

    public static final boolean h() {
        return f10535c.enableNewBackgroundAndBorderDrawables();
    }

    public static final boolean i() {
        return f10535c.enablePreciseSchedulingForPremountItemsOnAndroid();
    }

    public static final boolean j() {
        return f10535c.enableViewRecycling();
    }

    public static final boolean k() {
        return f10535c.enableViewRecyclingForText();
    }

    public static final boolean l() {
        return f10535c.enableViewRecyclingForView();
    }

    public static final boolean m() {
        return f10535c.lazyAnimationCallbacks();
    }

    public static final void n(ReactNativeFeatureFlagsProvider reactNativeFeatureFlagsProvider) {
        h.f(reactNativeFeatureFlagsProvider, "provider");
        f10535c.a(reactNativeFeatureFlagsProvider);
    }

    public static final boolean o() {
        return f10535c.useEditTextStockAndroidFocusBehavior();
    }

    public static final boolean p() {
        return f10535c.useFabricInterop();
    }

    public static final boolean q() {
        return f10535c.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean r() {
        return f10535c.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean s() {
        return f10535c.useTurboModuleInterop();
    }

    public static final boolean t() {
        return f10535c.useTurboModules();
    }
}
