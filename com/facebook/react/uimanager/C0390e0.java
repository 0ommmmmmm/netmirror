package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: com.facebook.react.uimanager.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0390e0 extends P1.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p064q.f f7472l = new p064q.f(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7476k;

    private C0390e0() {
    }

    public static C0390e0 v(int i3, int i4, int i5, int i6, int i7, int i8) {
        C0390e0 c0390e0 = (C0390e0) f7472l.b();
        if (c0390e0 == null) {
            c0390e0 = new C0390e0();
        }
        c0390e0.u(i3, i4, i5, i6, i7, i8);
        return c0390e0;
    }

    @Override // P1.d
    protected WritableMap j() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", C0392f0.f(this.f7473h));
        writableMapCreateMap.putDouble("y", C0392f0.f(this.f7474i));
        writableMapCreateMap.putDouble("width", C0392f0.f(this.f7475j));
        writableMapCreateMap.putDouble("height", C0392f0.f(this.f7476k));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", o());
        return writableMapCreateMap2;
    }

    @Override // P1.d
    public String k() {
        return "topLayout";
    }

    @Override // P1.d
    public void t() {
        f7472l.a(this);
    }

    protected void u(int i3, int i4, int i5, int i6, int i7, int i8) {
        super.q(i3, i4);
        this.f7473h = i5;
        this.f7474i = i6;
        this.f7475j = i7;
        this.f7476k = i8;
    }
}
