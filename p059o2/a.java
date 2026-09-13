package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.C0476b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f10162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0476b c0476b) {
        super(c0476b);
        h.f(c0476b, "handler");
        this.f10162e = c0476b.J();
        this.f10163f = c0476b.K();
        this.f10164g = c0476b.H();
        this.f10165h = c0476b.I();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", C0392f0.f(this.f10162e));
        writableMap.putDouble("y", C0392f0.f(this.f10163f));
        writableMap.putDouble("absoluteX", C0392f0.f(this.f10164g));
        writableMap.putDouble("absoluteY", C0392f0.f(this.f10165h));
    }
}
