package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class u extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f6483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JavaOnlyMap f6484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6487j;

    public u(ReadableMap readableMap, o oVar) {
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        this.f6483f = oVar;
        this.f6484g = JavaOnlyMap.Companion.deepClone(readableMap.getMap("animationConfig"));
        this.f6485h = readableMap.getInt("animationId");
        this.f6486i = readableMap.getInt("toValue");
        this.f6487j = readableMap.getInt("value");
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "TrackingAnimatedNode[" + this.f6382d + "]: animationID: " + this.f6485h + " toValueNode: " + this.f6486i + " valueNode: " + this.f6487j + " animationConfig: " + this.f6484g;
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        b bVarL = this.f6483f.l(this.f6486i);
        w wVar = bVarL instanceof w ? (w) bVarL : null;
        if (wVar != null) {
            this.f6484g.putDouble("toValue", wVar.l());
        } else {
            this.f6484g.putNull("toValue");
        }
        this.f6483f.x(this.f6485h, this.f6487j, this.f6484g, null);
    }
}
