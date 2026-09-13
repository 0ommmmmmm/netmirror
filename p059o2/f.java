package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import p055n2.q;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar) {
        super(qVar);
        h.f(qVar, "handler");
        this.f10180e = qVar.c0();
    }

    @Override // p059o2.b
    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putBoolean("pointerInside", this.f10180e);
    }
}
