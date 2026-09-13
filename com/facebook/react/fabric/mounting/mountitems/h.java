package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.A0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadableMap f6862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f6863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6865f;

    public h(int i3, int i4, String str, ReadableMap readableMap, A0 a4, boolean z3) {
        D2.h.f(str, "component");
        this.f6860a = i3;
        this.f6861b = i4;
        this.f6862c = readableMap;
        this.f6863d = a4;
        this.f6864e = z3;
        this.f6865f = f.a(str);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(p054n1.d dVar) {
        D2.h.f(dVar, "mountingManager");
        p054n1.g gVarF = dVar.f(this.f6860a);
        if (gVarF != null) {
            gVarF.A(this.f6865f, this.f6861b, this.f6862c, this.f6863d, this.f6864e);
            return;
        }
        Y.a.m(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.f6860a + "]");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f6860a;
    }

    public String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("PreAllocateViewMountItem [");
        sb.append(this.f6861b);
        sb.append("] - component: ");
        sb.append(this.f6865f);
        sb.append(" surfaceId: ");
        sb.append(this.f6860a);
        sb.append(" isLayoutable: ");
        sb.append(this.f6864e);
        if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            sb.append(" props: ");
            ReadableMap readableMap = this.f6862c;
            String str = "<null>";
            if (readableMap == null || (string = readableMap.toString()) == null) {
                string = "<null>";
            }
            sb.append(string);
            sb.append(" state: ");
            A0 a4 = this.f6863d;
            if (a4 != null && (string2 = a4.toString()) != null) {
                str = string2;
            }
            sb.append(str);
        }
        String string3 = sb.toString();
        D2.h.e(string3, "toString(...)");
        return string3;
    }
}
