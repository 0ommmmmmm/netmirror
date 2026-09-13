package p059o2;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.u;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f10190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f10193h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar) {
        super(uVar);
        D2.h.f(uVar, "handler");
        this.f10190e = uVar.Z0();
        this.f10191f = uVar.X0();
        this.f10192g = uVar.Y0();
        this.f10193h = uVar.a1();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        D2.h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("scale", this.f10190e);
        writableMap.putDouble("focalX", C0392f0.f(this.f10191f));
        writableMap.putDouble("focalY", C0392f0.f(this.f10192g));
        writableMap.putDouble("velocity", this.f10193h);
    }
}
