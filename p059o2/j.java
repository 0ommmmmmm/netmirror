package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import p055n2.B;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f10198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f10199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f10200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f10201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B b4) {
        super(b4);
        h.f(b4, "handler");
        this.f10198e = b4.J();
        this.f10199f = b4.K();
        this.f10200g = b4.H();
        this.f10201h = b4.I();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putDouble("x", C0392f0.f(this.f10198e));
        writableMap.putDouble("y", C0392f0.f(this.f10199f));
        writableMap.putDouble("absoluteX", C0392f0.f(this.f10200g));
        writableMap.putDouble("absoluteY", C0392f0.f(this.f10201h));
    }
}
