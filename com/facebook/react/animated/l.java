package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f6434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f6436k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ReadableMap readableMap, o oVar) {
        super(null, 1, null);
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        this.f6434i = oVar;
        this.f6435j = readableMap.getInt("input");
        this.f6436k = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.w, com.facebook.react.animated.b
    public String e() {
        return "NativeAnimatedNodesManager[" + this.f6382d + "] inputNode: " + this.f6435j + " modulus: " + this.f6436k + " super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b bVarL = this.f6434i.l(this.f6435j);
        if (!(bVarL instanceof w)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dL = ((w) bVarL).l();
        double d4 = this.f6436k;
        this.f6496f = ((dL % d4) + d4) % d4;
    }
}
