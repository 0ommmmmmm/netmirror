package p070r1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10582a;

    public i() {
        this(false, 1, null);
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        return this.f10582a;
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        return this.f10582a;
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        return this.f10582a;
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        return this.f10582a || super.useNativeViewConfigsInBridgelessMode();
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        return this.f10582a || super.useTurboModuleInterop();
    }

    @Override // p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        return this.f10582a;
    }

    public /* synthetic */ i(boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z3);
    }

    public i(boolean z3) {
        this.f10582a = z3;
    }
}
