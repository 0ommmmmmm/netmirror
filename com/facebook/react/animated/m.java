package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f6437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f6438j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ReadableMap readableMap, o oVar) {
        int[] iArr;
        super(null, 1, null);
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        this.f6437i = oVar;
        ReadableArray array = readableMap.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr2[i3] = array.getInt(i3);
            }
            iArr = iArr2;
        }
        this.f6438j = iArr;
    }

    @Override // com.facebook.react.animated.w, com.facebook.react.animated.b
    public String e() {
        return "MultiplicationAnimatedNode[" + this.f6382d + "]: input nodes: " + this.f6438j + " - super: " + super.e();
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        this.f6496f = 1.0d;
        int length = this.f6438j.length;
        for (int i3 = 0; i3 < length; i3++) {
            b bVarL = this.f6437i.l(this.f6438j[i3]);
            if (bVarL == null || !(bVarL instanceof w)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
            }
            this.f6496f *= ((w) bVarL).l();
        }
    }
}
