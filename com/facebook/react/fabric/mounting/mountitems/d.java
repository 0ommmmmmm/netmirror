package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f6852e;

    public d(int i3, int i4, int i5, ReadableArray readableArray) {
        this.f6849b = i3;
        this.f6850c = i4;
        this.f6851d = i5;
        this.f6852e = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(p054n1.d dVar) {
        D2.h.f(dVar, "mountingManager");
        dVar.o(this.f6849b, this.f6850c, this.f6851d, this.f6852e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f6849b;
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.f6850c + "] " + this.f6851d;
    }
}
