package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.m;
import p055n2.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f10170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f10174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar) {
        super(mVar);
        h.f(mVar, "handler");
        this.f10170e = mVar.J();
        this.f10171f = mVar.K();
        this.f10172g = mVar.H();
        this.f10173h = mVar.I();
        this.f10174i = mVar.V0();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", C0392f0.f(this.f10170e));
        writableMap.putDouble("y", C0392f0.f(this.f10171f));
        writableMap.putDouble("absoluteX", C0392f0.f(this.f10172g));
        writableMap.putDouble("absoluteY", C0392f0.f(this.f10173h));
        if (this.f10174i.a() == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", this.f10174i.b());
    }
}
