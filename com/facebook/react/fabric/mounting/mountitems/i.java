package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6869d = "Fabric.SendAccessibilityEvent";

    public i(int i3, int i4, int i5) {
        this.f6866a = i3;
        this.f6867b = i4;
        this.f6868c = i5;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(p054n1.d dVar) {
        D2.h.f(dVar, "mountingManager");
        try {
            dVar.q(this.f6866a, this.f6867b, this.f6868c);
        } catch (RetryableMountingLayerException e4) {
            ReactSoftExceptionLogger.logSoftException(this.f6869d, e4);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f6866a;
    }

    public String toString() {
        return "SendAccessibilityEventMountItem [" + this.f6867b + "] " + this.f6868c;
    }
}
