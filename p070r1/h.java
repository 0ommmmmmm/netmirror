package p070r1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10581d;

    public h(boolean z3, boolean z4, boolean z5) {
        super(z4);
        this.f10579b = z3;
        this.f10580c = z4;
        this.f10581d = z5;
    }

    @Override // p070r1.i, p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        return this.f10580c || this.f10579b;
    }

    @Override // p070r1.i, p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        return this.f10580c || this.f10579b;
    }

    @Override // p070r1.i, p070r1.e, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        return this.f10580c || this.f10581d;
    }
}
