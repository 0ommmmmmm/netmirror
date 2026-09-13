package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f6396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f6397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f6399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f6400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6402k;

    public g(ReadableMap readableMap) {
        D2.h.f(readableMap, "config");
        this.f6398g = -1L;
        this.f6401j = 1;
        this.f6402k = 1;
        a(readableMap);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap readableMap) {
        D2.h.f(readableMap, "config");
        this.f6396e = readableMap.getDouble("velocity");
        this.f6397f = readableMap.getDouble("deceleration");
        this.f6398g = -1L;
        this.f6399h = 0.0d;
        this.f6400i = 0.0d;
        int i3 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f6401j = i3;
        this.f6402k = 1;
        this.f6383a = i3 == 0;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j3) {
        w wVar = this.f6384b;
        if (wVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j4 = j3 / ((long) 1000000);
        if (this.f6398g == -1) {
            this.f6398g = j4 - ((long) 16);
            double d4 = this.f6399h;
            if (d4 == this.f6400i) {
                this.f6399h = wVar.f6496f;
            } else {
                wVar.f6496f = d4;
            }
            this.f6400i = wVar.f6496f;
        }
        double d5 = this.f6399h;
        double d6 = this.f6396e;
        double d7 = 1;
        double d8 = this.f6397f;
        double dExp = d5 + ((d6 / (d7 - d8)) * (d7 - Math.exp((-(d7 - d8)) * (j4 - this.f6398g))));
        if (Math.abs(this.f6400i - dExp) < 0.1d) {
            int i3 = this.f6401j;
            if (i3 != -1 && this.f6402k >= i3) {
                this.f6383a = true;
                return;
            } else {
                this.f6398g = -1L;
                this.f6402k++;
            }
        }
        this.f6400i = dExp;
        wVar.f6496f = dExp;
    }
}
