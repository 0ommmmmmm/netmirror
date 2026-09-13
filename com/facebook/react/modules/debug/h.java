package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f6943n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f6944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Choreographer f6945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UIManagerModule f6946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f6947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f6955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TreeMap f6956m;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f6961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final double f6962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f6963g;

        public b(int i3, int i4, int i5, int i6, double d4, double d5, int i7) {
            this.f6957a = i3;
            this.f6958b = i4;
            this.f6959c = i5;
            this.f6960d = i6;
            this.f6961e = d4;
            this.f6962f = d5;
            this.f6963g = i7;
        }
    }

    public h(ReactContext reactContext) {
        D2.h.f(reactContext, "reactContext");
        this.f6944a = reactContext;
        this.f6946c = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f6947d = new d();
        this.f6948e = -1L;
        this.f6949f = -1L;
        this.f6955l = 60.0d;
    }

    public static /* synthetic */ void l(h hVar, double d4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d4 = hVar.f6955l;
        }
        hVar.k(d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f6945b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f6945b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(hVar);
        }
    }

    public final int c() {
        return this.f6952i;
    }

    public final int d() {
        return (int) (((this.f6955l * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j3) {
        if (this.f6948e == -1) {
            this.f6948e = j3;
        }
        long j4 = this.f6949f;
        this.f6949f = j3;
        if (this.f6947d.d(j4, j3)) {
            this.f6953j++;
        }
        this.f6950g++;
        int iD = d();
        if ((iD - this.f6951h) - 1 >= 4) {
            this.f6952i++;
        }
        if (this.f6954k) {
            p002a1.a.c(this.f6956m);
            b bVar = new b(g(), h(), iD, this.f6952i, e(), f(), i());
            TreeMap treeMap = this.f6956m;
            if (treeMap != null) {
            }
        }
        this.f6951h = iD;
        Choreographer choreographer = this.f6945b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f6949f == this.f6948e) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.f6949f - this.f6948e);
    }

    public final double f() {
        if (this.f6949f == this.f6948e) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.f6949f - this.f6948e);
    }

    public final int g() {
        return this.f6950g - 1;
    }

    public final int h() {
        return this.f6953j - 1;
    }

    public final int i() {
        return (int) ((this.f6949f - this.f6948e) / 1000000.0d);
    }

    public final void j() {
        this.f6948e = -1L;
        this.f6949f = -1L;
        this.f6950g = 0;
        this.f6952i = 0;
        this.f6953j = 0;
        this.f6954k = false;
        this.f6956m = null;
    }

    public final void k(double d4) {
        if (!this.f6944a.isBridgeless()) {
            this.f6944a.getCatalystInstance().addBridgeIdleDebugListener(this.f6947d);
        }
        UIManagerModule uIManagerModule = this.f6946c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.f6947d);
        }
        this.f6955l = d4;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.f
            @Override // java.lang.Runnable
            public final void run() {
                h.m(this.f6941b);
            }
        });
    }

    public final void n() {
        if (!this.f6944a.isBridgeless()) {
            this.f6944a.getCatalystInstance().removeBridgeIdleDebugListener(this.f6947d);
        }
        UIManagerModule uIManagerModule = this.f6946c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.g
            @Override // java.lang.Runnable
            public final void run() {
                h.o(this.f6942b);
            }
        });
    }
}
