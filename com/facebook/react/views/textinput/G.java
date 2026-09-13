package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
class G extends P1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8068i;

    @Deprecated
    public G(int i3, int i4, int i5) {
        this(-1, i3, i4, i5);
    }

    @Override // P1.d
    protected WritableMap j() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("end", this.f8068i);
        writableMapCreateMap2.putInt("start", this.f8067h);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // P1.d
    public String k() {
        return "topSelectionChange";
    }

    public G(int i3, int i4, int i5, int i6) {
        super(i3, i4);
        this.f8067h = i5;
        this.f8068i = i6;
    }
}
