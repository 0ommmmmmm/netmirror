package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f6403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f6405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double f6406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f6407m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReadableMap readableMap, o oVar) {
        super(null, 1, null);
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        this.f6403i = oVar;
        this.f6404j = readableMap.getInt("input");
        this.f6405k = readableMap.getDouble("min");
        this.f6406l = readableMap.getDouble("max");
        this.f6496f = this.f6407m;
    }

    private final double o() {
        b bVarL = this.f6403i.l(this.f6404j);
        if (bVarL == null || !(bVarL instanceof w)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((w) bVarL).l();
    }

    @Override // com.facebook.react.animated.w, com.facebook.react.animated.b
    public String e() {
        return "DiffClampAnimatedNode[" + this.f6382d + "]: InputNodeTag: " + this.f6404j + " min: " + this.f6405k + " max: " + this.f6406l + " lastValue: " + this.f6407m + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        double dO = o();
        double d4 = dO - this.f6407m;
        this.f6407m = dO;
        this.f6496f = Math.min(Math.max(this.f6496f + d4, this.f6405k), this.f6406l);
    }
}
