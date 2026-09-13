package p074s1;

import D2.h;
import P1.d;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WritableMap f10610i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, WritableMap writableMap, int i3, int i4) {
        super(i3, i4);
        h.f(str, "eventName");
        this.f10609h = str;
        this.f10610i = writableMap;
    }

    @Override // P1.d
    protected WritableMap j() {
        return this.f10610i;
    }

    @Override // P1.d
    public String k() {
        return this.f10609h;
    }
}
