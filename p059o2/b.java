package p059o2;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10169d;

    public b(C0478d c0478d) {
        h.f(c0478d, "handler");
        this.f10166a = c0478d.M();
        this.f10167b = c0478d.R();
        this.f10168c = c0478d.Q();
        this.f10169d = c0478d.O();
    }

    public void a(WritableMap writableMap) {
        h.f(writableMap, "eventData");
        writableMap.putInt("numberOfPointers", this.f10166a);
        writableMap.putInt("handlerTag", this.f10167b);
        writableMap.putInt("state", this.f10168c);
        writableMap.putInt("pointerType", this.f10169d);
    }
}
