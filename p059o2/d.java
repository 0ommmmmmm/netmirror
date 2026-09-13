package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f10175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10179i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar) {
        super(oVar);
        h.f(oVar, "handler");
        this.f10175e = oVar.J();
        this.f10176f = oVar.K();
        this.f10177g = oVar.H();
        this.f10178h = oVar.I();
        this.f10179i = oVar.V0();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", C0392f0.f(this.f10175e));
        writableMap.putDouble("y", C0392f0.f(this.f10176f));
        writableMap.putDouble("absoluteX", C0392f0.f(this.f10177g));
        writableMap.putDouble("absoluteY", C0392f0.f(this.f10178h));
        writableMap.putInt("duration", this.f10179i);
    }
}
