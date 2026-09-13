package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.t;
import p055n2.z;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f10181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f10185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f10186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f10187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f10188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f10189m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar) {
        super(tVar);
        h.f(tVar, "handler");
        this.f10181e = tVar.J();
        this.f10182f = tVar.K();
        this.f10183g = tVar.H();
        this.f10184h = tVar.I();
        this.f10185i = tVar.V0();
        this.f10186j = tVar.W0();
        this.f10187k = tVar.X0();
        this.f10188l = tVar.Y0();
        this.f10189m = tVar.U0();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", C0392f0.f(this.f10181e));
        writableMap.putDouble("y", C0392f0.f(this.f10182f));
        writableMap.putDouble("absoluteX", C0392f0.f(this.f10183g));
        writableMap.putDouble("absoluteY", C0392f0.f(this.f10184h));
        writableMap.putDouble("translationX", C0392f0.f(this.f10185i));
        writableMap.putDouble("translationY", C0392f0.f(this.f10186j));
        writableMap.putDouble("velocityX", C0392f0.f(this.f10187k));
        writableMap.putDouble("velocityY", C0392f0.f(this.f10188l));
        if (this.f10189m.a() == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", this.f10189m.b());
    }
}
