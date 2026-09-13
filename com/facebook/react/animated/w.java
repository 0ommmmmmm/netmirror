package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class w extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f6498h;

    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ValueAnimatedNode[" + this.f6382d + "]: value: " + this.f6496f + " offset: " + this.f6497g;
    }

    public final void i() {
        this.f6497g += this.f6496f;
        this.f6496f = 0.0d;
    }

    public final void j() {
        this.f6496f += this.f6497g;
        this.f6497g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f6497g + this.f6496f)) {
            h();
        }
        return this.f6497g + this.f6496f;
    }

    public final void m() {
        c cVar = this.f6498h;
        if (cVar != null) {
            cVar.a(l());
        }
    }

    public final void n(c cVar) {
        this.f6498h = cVar;
    }

    public w(ReadableMap readableMap) {
        this.f6496f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f6497g = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    public /* synthetic */ w(ReadableMap readableMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : readableMap);
    }
}
