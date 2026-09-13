package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f10194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f10197h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x xVar) {
        super(xVar);
        h.f(xVar, "handler");
        this.f10194e = xVar.W0();
        this.f10195f = xVar.U0();
        this.f10196g = xVar.V0();
        this.f10197h = xVar.X0();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("rotation", this.f10194e);
        writableMap.putDouble("anchorX", C0392f0.f(this.f10195f));
        writableMap.putDouble("anchorY", C0392f0.f(this.f10196g));
        writableMap.putDouble("velocity", this.f10197h);
    }
}
