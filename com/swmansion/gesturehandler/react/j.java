package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.InterfaceC0425w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f8633g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f8634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055n2.i f8635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0478d f8636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f8637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8639f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof InterfaceC0425w0)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private a() {
        }
    }

    public final class b extends C0478d {
        public b() {
        }

        private final void S0(MotionEvent motionEvent) {
            p055n2.i iVarN;
            if (Q() == 0 && (!j.this.f8638e || (iVarN = N()) == null || !iVarN.v())) {
                n();
                j.this.f8638e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                z();
            }
        }

        @Override // p055n2.C0478d
        protected void g0() {
            j.this.f8638e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (j.this.f() instanceof InterfaceC0425w0) {
                InterfaceC0425w0 interfaceC0425w0 = (InterfaceC0425w0) j.this.f();
                ViewGroup viewGroupF = j.this.f();
                D2.h.c(motionEventObtain);
                interfaceC0425w0.c(viewGroupF, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // p055n2.C0478d
        protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
            D2.h.f(motionEvent, "event");
            D2.h.f(motionEvent2, "sourceEvent");
            S0(motionEvent);
        }

        @Override // p055n2.C0478d
        protected void i0(MotionEvent motionEvent, MotionEvent motionEvent2) {
            D2.h.f(motionEvent, "event");
            D2.h.f(motionEvent2, "sourceEvent");
            S0(motionEvent);
        }
    }

    public j(ReactContext reactContext, ViewGroup viewGroup) {
        D2.h.f(reactContext, "context");
        D2.h.f(viewGroup, "wrappedView");
        this.f8634a = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + viewGroup).toString());
        }
        D2.h.d(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((B0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        D2.h.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        h registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupB = f8633g.b(viewGroup);
        this.f8637d = viewGroupB;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupB);
        p055n2.i iVar = new p055n2.i(viewGroup, registry, new n());
        iVar.F(0.1f);
        this.f8635b = iVar;
        b bVar = new b();
        bVar.G0(-id);
        this.f8636c = bVar;
        registry.j(bVar);
        registry.c(bVar.R(), id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(j jVar) {
        jVar.k();
    }

    private final void k() {
        C0478d c0478d = this.f8636c;
        if (c0478d == null || c0478d.Q() != 2) {
            return;
        }
        c0478d.i();
        c0478d.z();
    }

    public final void d(View view) {
        D2.h.f(view, "view");
        p055n2.i iVar = this.f8635b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent motionEvent) {
        D2.h.f(motionEvent, "ev");
        this.f8639f = true;
        p055n2.i iVar = this.f8635b;
        D2.h.c(iVar);
        iVar.B(motionEvent);
        this.f8639f = false;
        return this.f8638e;
    }

    public final ViewGroup f() {
        return this.f8637d;
    }

    public final void g(int i3, boolean z3) {
        if (z3) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.h(this.f8632b);
                }
            });
        }
    }

    public final void i() {
        if (this.f8635b == null || this.f8639f) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f8637d);
        ReactContext reactContext = this.f8634a;
        D2.h.d(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((B0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        D2.h.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        h registry = rNGestureHandlerModule.getRegistry();
        C0478d c0478d = this.f8636c;
        D2.h.c(c0478d);
        registry.g(c0478d.R());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
