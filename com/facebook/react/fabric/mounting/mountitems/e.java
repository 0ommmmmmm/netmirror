package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f6856e;

    public e(int i3, int i4, String str, ReadableArray readableArray) {
        D2.h.f(str, "commandId");
        this.f6853b = i3;
        this.f6854c = i4;
        this.f6855d = str;
        this.f6856e = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(p054n1.d dVar) {
        D2.h.f(dVar, "mountingManager");
        dVar.p(this.f6853b, this.f6854c, this.f6855d, this.f6856e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f6853b;
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f6854c + "] " + this.f6855d;
    }
}
