package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class k extends P1.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7875r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f7876s = k.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p064q.f f7877t = new p064q.f(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f7878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f7879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f7880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f7881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l f7886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7887q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(int i3, int i4, l lVar, float f3, float f4, float f5, float f6, int i5, int i6, int i7, int i8) {
            k kVar = (k) k.f7877t.b();
            if (kVar == null) {
                kVar = new k(null);
            }
            kVar.w(i3, i4, lVar, f3, f4, f5, f6, i5, i6, i7, i8);
            return kVar;
        }

        public final k b(int i3, l lVar, float f3, float f4, float f5, float f6, int i4, int i5, int i6, int i7) {
            return a(-1, i3, lVar, f3, f4, f5, f6, i4, i5, i6, i7);
        }

        private a() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i3, int i4, l lVar, float f3, float f4, float f5, float f6, int i5, int i6, int i7, int i8) {
        super.q(i3, i4);
        this.f7886p = lVar;
        this.f7878h = f3;
        this.f7879i = f4;
        this.f7880j = f5;
        this.f7881k = f6;
        this.f7882l = i5;
        this.f7883m = i6;
        this.f7884n = i7;
        this.f7885o = i8;
        this.f7887q = SystemClock.uptimeMillis();
    }

    public static final k x(int i3, int i4, l lVar, float f3, float f4, float f5, float f6, int i5, int i6, int i7, int i8) {
        return f7875r.a(i3, i4, lVar, f3, f4, f5, f6, i5, i6, i7, i8);
    }

    public static final k y(int i3, l lVar, float f3, float f4, float f5, float f6, int i4, int i5, int i6, int i7) {
        return f7875r.b(i3, lVar, f3, f4, f5, f6, i4, i5, i6, i7);
    }

    @Override // P1.d
    public boolean a() {
        return this.f7886p == l.SCROLL;
    }

    @Override // P1.d
    protected WritableMap j() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", 0.0d);
        writableMapCreateMap.putDouble("bottom", 0.0d);
        writableMapCreateMap.putDouble("left", 0.0d);
        writableMapCreateMap.putDouble("right", 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", C0392f0.f(this.f7878h));
        writableMapCreateMap2.putDouble("y", C0392f0.f(this.f7879i));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("width", C0392f0.f(this.f7882l));
        writableMapCreateMap3.putDouble("height", C0392f0.f(this.f7883m));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("width", C0392f0.f(this.f7884n));
        writableMapCreateMap4.putDouble("height", C0392f0.f(this.f7885o));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.f7880j);
        writableMapCreateMap5.putDouble("y", this.f7881k);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", o());
        writableMapCreateMap6.putDouble("timestamp", this.f7887q);
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        D2.h.c(writableMapCreateMap6);
        return writableMapCreateMap6;
    }

    @Override // P1.d
    public String k() {
        l.a aVar = l.f7888b;
        Object objC = p002a1.a.c(this.f7886p);
        D2.h.e(objC, "assertNotNull(...)");
        return aVar.a((l) objC);
    }

    @Override // P1.d
    public void t() {
        try {
            f7877t.a(this);
        } catch (IllegalStateException e4) {
            String str = f7876s;
            D2.h.e(str, "TAG");
            ReactSoftExceptionLogger.logSoftException(str, e4);
        }
    }

    private k() {
    }
}
