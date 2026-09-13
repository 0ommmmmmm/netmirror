package com.facebook.react.fabric.mounting.mountitems;

/* JADX INFO: loaded from: classes.dex */
public final class b implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6847b;

    public b(int i3, int i4) {
        this.f6846a = i3;
        this.f6847b = i4;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(p054n1.d dVar) {
        D2.h.f(dVar, "mountingManager");
        p054n1.g gVarF = dVar.f(this.f6846a);
        if (gVarF == null) {
            return;
        }
        gVarF.i(this.f6847b);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f6846a;
    }
}
