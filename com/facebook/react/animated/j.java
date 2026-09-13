package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f6410l = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[] f6412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f6413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f6414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6417k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReadableMap readableMap) {
        D2.h.f(readableMap, "config");
        this.f6411e = -1L;
        this.f6412f = new double[0];
        this.f6415i = 1;
        this.f6416j = 1;
        a(readableMap);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap readableMap) {
        int size;
        D2.h.f(readableMap, "config");
        ReadableArray array = readableMap.getArray("frames");
        if (array != null && this.f6412f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i3 = 0; i3 < size; i3++) {
                dArr[i3] = array.getDouble(i3);
            }
            this.f6412f = dArr;
        }
        this.f6413g = (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) ? readableMap.getDouble("toValue") : 0.0d;
        int i4 = (readableMap.hasKey("iterations") && readableMap.getType("iterations") == ReadableType.Number) ? readableMap.getInt("iterations") : 1;
        this.f6415i = i4;
        this.f6416j = 1;
        this.f6383a = i4 == 0;
        this.f6411e = -1L;
    }

    @Override // com.facebook.react.animated.e
    public void b(long j3) {
        double d4;
        w wVar = this.f6384b;
        if (wVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.f6411e < 0) {
            this.f6411e = j3;
            if (this.f6416j == 1) {
                this.f6414h = wVar.f6496f;
            }
        }
        int iRound = (int) Math.round(((j3 - this.f6411e) / ((long) 1000000)) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j3 + " and mStartFrameTimeNanos " + this.f6411e;
            if (p026g1.a.f9424b) {
                throw new IllegalStateException(str.toString());
            }
            if (this.f6417k < 100) {
                Y.a.I("ReactNative", str);
                this.f6417k++;
                return;
            }
            return;
        }
        if (this.f6383a) {
            return;
        }
        double[] dArr = this.f6412f;
        if (iRound >= dArr.length - 1) {
            int i3 = this.f6415i;
            if (i3 == -1 || this.f6416j < i3) {
                double d5 = this.f6414h;
                d4 = d5 + (dArr[dArr.length - 1] * (this.f6413g - d5));
                this.f6411e = -1L;
                this.f6416j++;
            } else {
                d4 = this.f6413g;
                this.f6383a = true;
            }
        } else {
            double d6 = this.f6414h;
            d4 = d6 + (dArr[iRound] * (this.f6413g - d6));
        }
        wVar.f6496f = d4;
    }
}
