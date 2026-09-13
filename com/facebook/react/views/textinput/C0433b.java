package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0433b extends P1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f8095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f8096i;

    @Deprecated
    public C0433b(int i3, float f3, float f4) {
        this(-1, i3, f3, f4);
    }

    @Override // P1.d
    protected WritableMap j() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("width", this.f8095h);
        writableMapCreateMap2.putDouble("height", this.f8096i);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", o());
        return writableMapCreateMap;
    }

    @Override // P1.d
    public String k() {
        return "topContentSizeChange";
    }

    public C0433b(int i3, int i4, float f3, float f4) {
        super(i3, i4);
        this.f8095h = f3;
        this.f8096i = f4;
    }
}
