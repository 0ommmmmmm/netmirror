package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public class m extends P1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8149i;

    @Deprecated
    public m(int i3, String str, int i4) {
        this(-1, i3, str, i4);
    }

    @Override // P1.d
    protected WritableMap j() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f8148h);
        writableMapCreateMap.putInt("eventCount", this.f8149i);
        writableMapCreateMap.putInt("target", o());
        return writableMapCreateMap;
    }

    @Override // P1.d
    public String k() {
        return "topChange";
    }

    public m(int i3, int i4, String str, int i5) {
        super(i3, i4);
        this.f8148h = str;
        this.f8149i = i5;
    }
}
