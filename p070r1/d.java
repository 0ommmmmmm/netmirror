package p070r1;

import D2.h;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Boolean f10536A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Boolean f10537B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Boolean f10538C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Boolean f10539D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Boolean f10540E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Boolean f10541F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Boolean f10542G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Boolean f10543H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Boolean f10544I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Boolean f10545J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Boolean f10546K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Boolean f10547L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Boolean f10548M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Boolean f10549N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Boolean f10550O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Boolean f10551P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Boolean f10552Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f10553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f10554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f10555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f10556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f10557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f10558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f10559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f10560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f10561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f10562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f10563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f10564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f10565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f10566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f10567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f10568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f10569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f10570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f10571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f10572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f10573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f10574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f10575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Boolean f10576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f10577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f10578z;

    @Override // p070r1.c
    public void a(ReactNativeFeatureFlagsProvider reactNativeFeatureFlagsProvider) {
        h.f(reactNativeFeatureFlagsProvider, "provider");
        ReactNativeFeatureFlagsCxxInterop.override(reactNativeFeatureFlagsProvider);
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.f10553a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.f10553a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean boolValueOf = this.f10554b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableMountItemReorderingAndroid());
            this.f10554b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean boolValueOf = this.f10555c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAccumulatedUpdatesInRawPropsAndroid());
            this.f10555c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        Boolean boolValueOf = this.f10556d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBridgelessArchitecture());
            this.f10556d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean boolValueOf = this.f10557e;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCppPropsIteratorSetter());
            this.f10557e = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean boolValueOf = this.f10558f;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.f10558f = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean boolValueOf = this.f10559g;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.f10559g = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean boolValueOf = this.f10560h;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRenderer());
            this.f10560h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean boolValueOf = this.f10561i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.f10561i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean boolValueOf = this.f10562j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableImagePrefetchingAndroid());
            this.f10562j = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableJSRuntimeGCOnMemoryPressureOnIOS() {
        Boolean boolValueOf = this.f10563k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableJSRuntimeGCOnMemoryPressureOnIOS());
            this.f10563k = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean boolValueOf = this.f10564l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnAndroid());
            this.f10564l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean boolValueOf = this.f10565m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.f10565m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean boolValueOf = this.f10566n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLongTaskAPI());
            this.f10566n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        Boolean boolValueOf = this.f10567o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNativeCSSParsing());
            this.f10567o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNewBackgroundAndBorderDrawables() {
        Boolean boolValueOf = this.f10568p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNewBackgroundAndBorderDrawables());
            this.f10568p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreciseSchedulingForPremountItemsOnAndroid() {
        Boolean boolValueOf = this.f10569q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePreciseSchedulingForPremountItemsOnAndroid());
            this.f10569q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean boolValueOf = this.f10570r;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.f10570r = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean boolValueOf = this.f10571s;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableReportEventPaintTime());
            this.f10571s = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = this.f10572t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.f10572t = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = this.f10573u;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.f10573u = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        Boolean boolValueOf = this.f10574v;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewCulling());
            this.f10574v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean boolValueOf = this.f10575w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.f10575w = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        Boolean boolValueOf = this.f10576x;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForText());
            this.f10576x = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        Boolean boolValueOf = this.f10577y;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForView());
            this.f10577y = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean boolValueOf = this.f10578z;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.excludeYogaFromRawProps());
            this.f10578z = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixDifferentiatorEmittingUpdatesWithWrongParentTag() {
        Boolean boolValueOf = this.f10536A;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixDifferentiatorEmittingUpdatesWithWrongParentTag());
            this.f10536A = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean boolValueOf = this.f10537B;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.f10537B = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean boolValueOf = this.f10538C;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.f10538C = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.f10539D;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.f10539D = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        Boolean boolValueOf = this.f10540E;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxNetworkInspectionEnabled());
            this.f10540E = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = this.f10541F;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.f10541F = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean removeTurboModuleManagerDelegateMutex() {
        Boolean boolValueOf = this.f10542G;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.removeTurboModuleManagerDelegateMutex());
            this.f10542G = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS() {
        Boolean boolValueOf = this.f10543H;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS());
            this.f10543H = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean boolValueOf = this.f10544I;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.f10544I = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean boolValueOf = this.f10545J;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useAlwaysAvailableJSErrorHandling());
            this.f10545J = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useEditTextStockAndroidFocusBehavior() {
        Boolean boolValueOf = this.f10546K;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useEditTextStockAndroidFocusBehavior());
            this.f10546K = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean boolValueOf = this.f10547L;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.f10547L = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.f10548M;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.f10548M = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean boolValueOf = this.f10549N;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedEventBatchingOnAndroid());
            this.f10549N = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        Boolean boolValueOf = this.f10550O;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRawPropsJsiValue());
            this.f10550O = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean boolValueOf = this.f10551P;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.f10551P = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p070r1.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean boolValueOf = this.f10552Q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModules());
            this.f10552Q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
