package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C0339i;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p014d1.ComponentCallbacks2C0458i;

/* JADX INFO: loaded from: classes.dex */
public class ReactHostImpl implements p014d1.A {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AtomicInteger f7087B = new AtomicInteger(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private I1.d f7088A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0361f f7090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentFactory f7091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p042k1.e f7092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f7093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f7094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f7095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ComponentCallbacks2C0458i f7096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f7098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0356a f7099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ReactInstance f7100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0356a f7101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f7102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f7103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0358c f7104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c0 f7105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f7106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MemoryPressureListener f7107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private B1.a f7108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f7109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f7110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ReactHostInspectorTarget f7111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f7112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private I1.d f7113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private I1.d f7114z;

    class a implements k1.e.a {
        a() {
        }

        @Override // k1.e.a
        public void a() {
            UiThreadUtil.assertOnUiThread();
            if (ReactHostImpl.this.f7111w != null) {
                ReactHostImpl.this.f7111w.sendDebuggerResumeCommand();
            }
        }
    }

    class b implements p042k1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.E f7117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ I1.e f7118c;

        b(String str, com.facebook.react.devsupport.E e4, I1.e eVar) {
            this.f7116a = str;
            this.f7117b = e4;
            this.f7118c = eVar;
        }

        @Override // p042k1.a
        public void a() {
            ReactHostImpl.this.q1("loadJSBundleFromMetro()", "Creating BundleLoader");
            this.f7118c.d(JSBundleLoader.createCachedBundleFromNetworkLoader(this.f7116a, this.f7117b.j()));
        }

        @Override // p042k1.a
        public void b(Exception exc) {
            this.f7118c.c(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ReactInstance f7120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReactContext f7121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f7122c;

        private c(ReactInstance reactInstance, ReactContext reactContext, boolean z3) {
            this.f7120a = reactInstance;
            this.f7121b = reactContext;
            this.f7122c = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(ReactInstance reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {
        ReactInstance a(I1.d dVar, String str);
    }

    public ReactHostImpl(Context context, InterfaceC0361f interfaceC0361f, ComponentFactory componentFactory, boolean z3, boolean z4) {
        this(context, interfaceC0361f, componentFactory, Executors.newSingleThreadExecutor(), I1.d.f435j, z3, z4);
    }

    private I1.d B0() {
        p1("isMetroRunning()");
        final I1.e eVar = new I1.e();
        b().k(new p042k1.g() { // from class: com.facebook.react.runtime.I
            @Override // p042k1.g
            public final void a(boolean z3) {
                this.f7064a.g1(eVar, z3);
            }
        });
        return eVar.a();
    }

    private void B1(String str, ReactInstance reactInstance) {
        q1(str, "Stopping all React Native surfaces");
        synchronized (this.f7095g) {
            try {
                for (e0 e0Var : this.f7095g) {
                    reactInstance.D(e0Var);
                    e0Var.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object D0(String str, d dVar, I1.d dVar2) {
        ReactInstance reactInstance = (ReactInstance) dVar2.o();
        if (reactInstance == null) {
            u1(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        dVar.a(reactInstance);
        return null;
    }

    private void D1(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.f7111w;
                p002a1.a.b(reactHostInspectorTarget != null && reactHostInspectorTarget.isValid(), "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void E0(I1.d dVar) {
        if (!dVar.s()) {
            return null;
        }
        y0(dVar.n());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public I1.d E1() {
        return F1(0, 4);
    }

    private I1.d F1(final int i3, final int i4) {
        if (this.f7114z != null) {
            q1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.f7114z;
        }
        if (this.f7088A != null) {
            if (i3 < i4) {
                q1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i3 + ").");
                return this.f7088A.v(new I1.a() { // from class: com.facebook.react.runtime.v
                    @Override // I1.a
                    public final Object a(I1.d dVar) {
                        return this.f7218a.n1(i3, i4, dVar);
                    }
                }, this.f7093e);
            }
            u1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean G0(String str, d dVar, I1.d dVar2) {
        ReactInstance reactInstance = (ReactInstance) dVar2.o();
        if (reactInstance == null) {
            u1(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        dVar.a(reactInstance);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H0(WeakReference weakReference, int i3) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.r(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(final WeakReference weakReference, final int i3) {
        this.f7093e.execute(new Runnable() { // from class: com.facebook.react.runtime.K
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.H0(weakReference, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance J0(String str, String str2, String str3, I1.d dVar, String str4) {
        ReactInstance reactInstance = (ReactInstance) dVar.o();
        ReactInstance reactInstance2 = this.f7100l;
        String str5 = "Stage: " + str4;
        String str6 = str + " reason: " + str2;
        if (dVar.s()) {
            u1(str3, str + ": ReactInstance task faulted. " + str5 + ". " + ("Fault reason: " + dVar.n().getMessage()) + ". " + str6);
            return reactInstance2;
        }
        if (dVar.q()) {
            u1(str3, str + ": ReactInstance task cancelled. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance == null) {
            u1(str3, str + ": ReactInstance task returned null. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance2 != null && reactInstance != reactInstance2) {
            u1(str3, str + ": Detected two different ReactInstances. Returning old. " + str5 + ". " + str6);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d K0(String str, Exception exc, I1.d dVar) {
        return p0(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d L0(final String str, final Exception exc) {
        if (this.f7114z == null) {
            return p0(str, exc);
        }
        q1("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.f7114z.k(new I1.a() { // from class: com.facebook.react.runtime.S
            @Override // I1.a
            public final Object a(I1.d dVar) {
                return this.f7139a.K0(str, exc, dVar);
            }
        }, this.f7093e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        UiThreadUtil.assertOnUiThread();
        B1.a aVar = this.f7108t;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d N0(I1.d dVar) {
        return ((Boolean) dVar.o()).booleanValue() ? o1() : I1.d.m(this.f7090b.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader O0() {
        return this.f7090b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d P0(e eVar, String str, I1.d dVar) {
        ReactHostInspectorTarget reactHostInspectorTarget;
        q1("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance reactInstanceA = eVar.a(dVar, "1: Starting destroy");
        D1(reactInstanceA);
        if (this.f7112x && (reactHostInspectorTarget = this.f7111w) != null) {
            reactHostInspectorTarget.close();
            this.f7111w = null;
        }
        if (this.f7098j) {
            q1("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.f7092d.m();
        }
        ReactContext reactContext = (ReactContext) this.f7101m.c();
        if (reactContext == null) {
            u1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        q1("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.f7105q.b(reactContext);
        return I1.d.m(reactInstanceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d Q0(e eVar, I1.d dVar) {
        ReactInstance reactInstanceA = eVar.a(dVar, "2: Stopping surfaces");
        if (reactInstanceA == null) {
            u1("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        B1("getOrCreateDestroyTask()", reactInstanceA);
        synchronized (this.f7095g) {
            this.f7095g.clear();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d R0(e eVar, String str, I1.d dVar) {
        eVar.a(dVar, "3: Destroying ReactContext");
        Iterator it = this.f7110v.iterator();
        while (it.hasNext()) {
            ((C2.a) it.next()).a();
        }
        ReactContext reactContext = (ReactContext) this.f7101m.c();
        if (reactContext == null) {
            u1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        q1("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.f7096h.b(this.f7089a);
        if (reactContext != null) {
            q1("getOrCreateDestroyTask()", "Resetting ReactContext ref");
            this.f7101m.e();
            q1("getOrCreateDestroyTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        y1(null);
        X1.c.d().c();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d S0(e eVar, I1.d dVar) {
        ReactInstance reactInstanceA = eVar.a(dVar, "4: Destroying ReactInstance");
        if (reactInstanceA == null) {
            u1("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            q1("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
            this.f7100l = null;
            q1("getOrCreateDestroyTask()", "Destroying ReactInstance");
            reactInstanceA.j();
        }
        q1("getOrCreateDestroyTask()", "Resetting start task ref");
        this.f7113y = null;
        q1("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.f7088A = null;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void T0(String str, I1.d dVar) {
        if (dVar.s()) {
            v1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + dVar.n().getMessage() + ". Destroy reason: " + str, dVar.n());
        }
        if (!dVar.q()) {
            return null;
        }
        u1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0357b U0() {
        q1("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new C0357b(this.f7089a, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c W0(I1.d dVar) {
        JSBundleLoader jSBundleLoader = (JSBundleLoader) dVar.o();
        C0357b c0357bQ0 = q0();
        p042k1.e eVarB = b();
        c0357bQ0.setJSExceptionHandler(eVarB);
        q1("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(c0357bQ0, this.f7090b, this.f7091c, eVarB, new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.E
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                this.f7060a.y0(exc);
            }
        }, this.f7098j, r0());
        this.f7100l = reactInstance;
        MemoryPressureListener memoryPressureListenerA0 = a0(reactInstance);
        this.f7107s = memoryPressureListenerA0;
        this.f7096h.a(memoryPressureListenerA0);
        reactInstance.t();
        q1("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.z(jSBundleLoader);
        q1("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        eVarB.r(c0357bQ0);
        c0357bQ0.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.F
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.V0();
            }
        });
        return new c(reactInstance, c0357bQ0, this.f7114z != null);
    }

    private I1.d X(String str, final d dVar, Executor executor) {
        final String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = I1.d.f434i;
        }
        return s0().u(new I1.a() { // from class: com.facebook.react.runtime.P
            @Override // I1.a
            public final Object a(I1.d dVar2) {
                return this.f7083a.D0(str2, dVar, dVar2);
            }
        }, executor).h(new I1.a() { // from class: com.facebook.react.runtime.Q
            @Override // I1.a
            public final Object a(I1.d dVar2) {
                return this.f7086a.E0(dVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance X0(I1.d dVar) {
        ReactInstance reactInstance = ((c) dVar.o()).f7120a;
        ReactContext reactContext = ((c) dVar.o()).f7121b;
        boolean z3 = ((c) dVar.o()).f7122c;
        boolean z4 = this.f7105q.a() == LifecycleState.RESUMED;
        if (!z3 || z4) {
            this.f7105q.e(reactContext, e0());
        } else {
            this.f7105q.d(reactContext, e0());
        }
        q1("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        Iterator it = this.f7109u.iterator();
        while (it.hasNext()) {
            androidx.activity.result.d.a(it.next());
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ReactInstance Y0(I1.d dVar) {
        return ((c) dVar.o()).f7120a;
    }

    private I1.d Z(String str, final d dVar, Executor executor) {
        final String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = I1.d.f434i;
        }
        return ((I1.d) this.f7099k.a()).u(new I1.a() { // from class: com.facebook.react.runtime.T
            @Override // I1.a
            public final Object a(I1.d dVar2) {
                return this.f7142a.G0(str2, dVar, dVar2);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d Z0() {
        q1("getOrCreateReactInstanceTask()", "Start");
        p002a1.a.b(!this.f7112x, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        I1.d dVarU = k0().u(new I1.a() { // from class: com.facebook.react.runtime.y
            @Override // I1.a
            public final Object a(I1.d dVar) {
                return this.f7226a.W0(dVar);
            }
        }, this.f7093e);
        dVarU.u(new I1.a() { // from class: com.facebook.react.runtime.z
            @Override // I1.a
            public final Object a(I1.d dVar) {
                return this.f7227a.X0(dVar);
            }
        }, this.f7094f);
        return dVarU.u(new I1.a() { // from class: com.facebook.react.runtime.A
            @Override // I1.a
            public final Object a(I1.d dVar) {
                return ReactHostImpl.Y0(dVar);
            }
        }, I1.d.f434i);
    }

    private MemoryPressureListener a0(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.H
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i3) {
                this.f7062a.I0(weakReference, i3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d a1(e eVar, String str, I1.d dVar) {
        q1("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance reactInstanceA = eVar.a(dVar, "1: Starting reload");
        D1(reactInstanceA);
        ReactContext reactContext = (ReactContext) this.f7101m.c();
        if (reactContext == null) {
            u1("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (reactContext != null && this.f7105q.a() == LifecycleState.RESUMED) {
            q1("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            reactContext.onHostPause();
        }
        return I1.d.m(reactInstanceA);
    }

    private e b0(final String str, final String str2, final String str3) {
        return new e() { // from class: com.facebook.react.runtime.w
            @Override // com.facebook.react.runtime.ReactHostImpl.e
            public final ReactInstance a(I1.d dVar, String str4) {
                return this.f7221a.J0(str, str3, str2, dVar, str4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d b1(e eVar, I1.d dVar) {
        ReactInstance reactInstanceA = eVar.a(dVar, "2: Surface shutdown");
        if (reactInstanceA == null) {
            u1("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        B1("getOrCreateReloadTask()", reactInstanceA);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d c1(e eVar, I1.d dVar) {
        eVar.a(dVar, "3: Destroying ReactContext");
        Iterator it = this.f7110v.iterator();
        while (it.hasNext()) {
            ((C2.a) it.next()).a();
        }
        if (this.f7107s != null) {
            q1("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.f7096h.d(this.f7107s);
        }
        ReactContext reactContext = (ReactContext) this.f7101m.c();
        if (reactContext != null) {
            q1("getOrCreateReloadTask()", "Resetting ReactContext ref");
            this.f7101m.e();
            q1("getOrCreateReloadTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        if (this.f7098j && reactContext != null) {
            q1("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.f7092d.z(reactContext);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d d1(e eVar, I1.d dVar) {
        ReactInstance reactInstanceA = eVar.a(dVar, "4: Destroying ReactInstance");
        if (reactInstanceA == null) {
            u1("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            q1("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
            this.f7100l = null;
            q1("getOrCreateReloadTask()", "Destroying ReactInstance");
            reactInstanceA.j();
        }
        q1("getOrCreateReloadTask()", "Resetting start task ref");
        this.f7113y = null;
        return t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d e1(e eVar, I1.d dVar) {
        ReactInstance reactInstanceA = eVar.a(dVar, "5: Restarting surfaces");
        if (reactInstanceA == null) {
            u1("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return dVar;
        }
        z1("getOrCreateReloadTask()", reactInstanceA);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d f1(String str, I1.d dVar) {
        if (dVar.s()) {
            v1("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + dVar.n().getMessage() + ". Reload reason: " + str, dVar.n());
        }
        if (dVar.q()) {
            u1("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        q1("getOrCreateReloadTask()", "Resetting reload task ref");
        this.f7114z = null;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(I1.e eVar, boolean z3) {
        q1("isMetroRunning()", "Async result = " + z3);
        eVar.d(Boolean.valueOf(z3));
    }

    private Map<String, String> getHostMetadata() {
        return com.facebook.react.modules.systeminfo.a.e(this.f7089a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(String str, int i3, String str2, Callback callback, ReactInstance reactInstance) {
        q1(str, "Execute");
        reactInstance.B(i3, str2);
        ((Callback) p002a1.a.c(callback)).invoke(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d i1(String str, I1.d dVar) {
        return u0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d j1(I1.d dVar) {
        if (!dVar.s()) {
            return dVar;
        }
        Exception excN = dVar.n();
        if (this.f7098j) {
            this.f7092d.handleException(excN);
        } else {
            this.f7090b.a(excN);
        }
        return p0("Reload failed", excN);
    }

    private I1.d k0() {
        p1("getJSBundleLoader()");
        if (this.f7098j && this.f7097i) {
            return B0().v(new I1.a() { // from class: com.facebook.react.runtime.B
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7054a.N0(dVar);
                }
            }, this.f7093e);
        }
        if (p026g1.a.f9424b) {
            Y.a.b("ReactHost", "Packager server access is disabled in this environment");
        }
        return I1.d.c(new Callable() { // from class: com.facebook.react.runtime.D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7059a.O0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d k1(final String str) {
        I1.d dVarT;
        if (this.f7088A != null) {
            q1("reload()", "Waiting for destroy to finish, before reloading React Native.");
            dVarT = this.f7088A.k(new I1.a() { // from class: com.facebook.react.runtime.U
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7145a.i1(str, dVar);
                }
            }, this.f7093e).t();
        } else {
            dVarT = u0(str).t();
        }
        return dVarT.k(new I1.a() { // from class: com.facebook.react.runtime.h
            @Override // I1.a
            public final Object a(I1.d dVar) {
                return this.f7190a.j1(dVar);
            }
        }, this.f7093e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(String str, e0 e0Var, ReactInstance reactInstance) {
        q1(str, "Execute");
        reactInstance.C(e0Var);
    }

    private void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        p038j1.a.a(str, inspectorNetworkRequestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(String str, e0 e0Var, ReactInstance reactInstance) {
        q1(str, "Execute");
        reactInstance.D(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ I1.d n1(int i3, int i4, I1.d dVar) {
        return F1(i3 + 1, i4);
    }

    private I1.d o1() {
        p1("loadJSBundleFromMetro()");
        I1.e eVar = new I1.e();
        com.facebook.react.devsupport.E e4 = (com.facebook.react.devsupport.E) b();
        String strQ = e4.f0().q((String) p002a1.a.c(e4.g0()));
        e4.D0(strQ, new b(strQ, e4, eVar));
        return eVar.a();
    }

    private I1.d p0(final String str, Exception exc) {
        p1("getOrCreateDestroyTask()");
        v1("getOrCreateDestroyTask()", str, exc);
        final e eVarB0 = b0("Destroy", "getOrCreateDestroyTask()", str);
        if (this.f7088A == null) {
            q1("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
            this.f7088A = ((I1.d) this.f7099k.b()).k(new I1.a() { // from class: com.facebook.react.runtime.p
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7206a.P0(eVarB0, str, dVar);
                }
            }, this.f7094f).k(new I1.a() { // from class: com.facebook.react.runtime.q
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7209a.Q0(eVarB0, dVar);
                }
            }, this.f7093e).k(new I1.a() { // from class: com.facebook.react.runtime.s
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7211a.R0(eVarB0, str, dVar);
                }
            }, this.f7094f).k(new I1.a() { // from class: com.facebook.react.runtime.t
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7214a.S0(eVarB0, dVar);
                }
            }, this.f7093e).h(new I1.a() { // from class: com.facebook.react.runtime.u
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7216a.T0(str, dVar);
                }
            });
        }
        return this.f7088A;
    }

    private void p1(String str) {
        this.f7104p.a("ReactHost{" + this.f7106r + "}." + str);
    }

    private C0357b q0() {
        return (C0357b) this.f7101m.d(new C0356a.InterfaceC0109a() { // from class: com.facebook.react.runtime.G
            @Override // com.facebook.react.runtime.C0356a.InterfaceC0109a
            public final Object get() {
                return this.f7061a.U0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1(String str, String str2) {
        this.f7104p.a("ReactHost{" + this.f7106r + "}." + str + ": " + str2);
    }

    private ReactHostInspectorTarget r0() {
        if (this.f7111w == null && InspectorFlags.getFuseboxEnabled()) {
            this.f7111w = new ReactHostInspectorTarget(this);
        }
        return this.f7111w;
    }

    private void r1(boolean z3) {
        if (this.f7098j) {
            this.f7092d.A(z3);
        }
    }

    private I1.d s0() {
        return I1.d.d(new Callable() { // from class: com.facebook.react.runtime.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7192a.E1();
            }
        }, this.f7093e).j(new r());
    }

    private void s1(ReactContext reactContext) {
        this.f7105q.b(reactContext);
        y1(null);
    }

    private void setPausedInDebuggerMessage(String str) {
        if (str == null) {
            this.f7092d.e();
        } else {
            this.f7092d.d(str, new a());
        }
    }

    private I1.d t0() {
        p1("getOrCreateReactInstanceTask()");
        return (I1.d) this.f7099k.d(new C0356a.InterfaceC0109a() { // from class: com.facebook.react.runtime.x
            @Override // com.facebook.react.runtime.C0356a.InterfaceC0109a
            public final Object get() {
                return this.f7225a.Z0();
            }
        });
    }

    private I1.d u0(final String str) {
        p1("getOrCreateReloadTask()");
        u1("getOrCreateReloadTask()", str);
        final e eVarB0 = b0("Reload", "getOrCreateReloadTask()", str);
        if (this.f7114z == null) {
            q1("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
            this.f7114z = ((I1.d) this.f7099k.b()).k(new I1.a() { // from class: com.facebook.react.runtime.j
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7193a.a1(eVarB0, str, dVar);
                }
            }, this.f7094f).k(new I1.a() { // from class: com.facebook.react.runtime.k
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7196a.b1(eVarB0, dVar);
                }
            }, this.f7093e).k(new I1.a() { // from class: com.facebook.react.runtime.l
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7198a.c1(eVarB0, dVar);
                }
            }, this.f7094f).k(new I1.a() { // from class: com.facebook.react.runtime.m
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7200a.d1(eVarB0, dVar);
                }
            }, this.f7093e).k(new I1.a() { // from class: com.facebook.react.runtime.n
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7202a.e1(eVarB0, dVar);
                }
            }, this.f7093e).k(new I1.a() { // from class: com.facebook.react.runtime.o
                @Override // I1.a
                public final Object a(I1.d dVar) {
                    return this.f7204a.f1(str, dVar);
                }
            }, this.f7093e);
        }
        return this.f7114z;
    }

    private void u1(String str, String str2) {
        v1(str, str2, null);
    }

    private void v1(String str, String str2, Throwable th) {
        String str3 = "raiseSoftException(" + str + ")";
        q1(str3, str2);
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2, th));
    }

    private void y1(Activity activity) {
        this.f7102n.set(activity);
        if (activity != null) {
            this.f7103o.set(new WeakReference(activity));
        }
    }

    private void z1(String str, ReactInstance reactInstance) {
        q1(str, "Restarting previously running React Native Surfaces");
        synchronized (this.f7095g) {
            try {
                Iterator it = this.f7095g.iterator();
                while (it.hasNext()) {
                    reactInstance.C((e0) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean A0() {
        return this.f7100l != null;
    }

    p058o1.a A1(final e0 e0Var) {
        final String str = "startSurface(surfaceId = " + e0Var.n() + ")";
        q1(str, "Schedule");
        W(e0Var);
        return X(str, new d() { // from class: com.facebook.react.runtime.C
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f7056a.l1(str, e0Var, reactInstance);
            }
        }, this.f7093e);
    }

    boolean C0(String str) {
        synchronized (this.f7095g) {
            try {
                Iterator it = this.f7095g.iterator();
                while (it.hasNext()) {
                    if (((e0) it.next()).j().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    p058o1.a C1(final e0 e0Var) {
        final String str = "stopSurface(surfaceId = " + e0Var.n() + ")";
        q1(str, "Schedule");
        d0(e0Var);
        return Z(str, new d() { // from class: com.facebook.react.runtime.N
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f7077a.m1(str, e0Var, reactInstance);
            }
        }, this.f7093e).t();
    }

    void W(e0 e0Var) {
        p1("attachSurface(surfaceId = " + e0Var.n() + ")");
        synchronized (this.f7095g) {
            this.f7095g.add(e0Var);
        }
    }

    I1.d Y(final String str, final String str2, final NativeArray nativeArray) {
        return Z("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new d() { // from class: com.facebook.react.runtime.M
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                reactInstance.callFunctionOnModule(str, str2, nativeArray);
            }
        }, null);
    }

    @Override // p014d1.A
    public p062p1.a a(Context context, String str, Bundle bundle) {
        e0 e0Var = new e0(context, str, bundle);
        f0 f0Var = new f0(context, e0Var);
        f0Var.setShouldLogContentAppeared(true);
        e0Var.d(f0Var);
        e0Var.c(this);
        return e0Var;
    }

    @Override // p014d1.A
    public p042k1.e b() {
        return (p042k1.e) p002a1.a.c(this.f7092d);
    }

    @Override // p014d1.A
    public void c(Context context) {
        AppearanceModule appearanceModule;
        ReactContext reactContextF0 = f0();
        if (reactContextF0 == null || (appearanceModule = (AppearanceModule) reactContextF0.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public p058o1.a c0(final String str, final Exception exc) {
        return I1.d.d(new Callable() { // from class: com.facebook.react.runtime.O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7080a.L0(str, exc);
            }
        }, this.f7093e).j(new r());
    }

    @Override // p014d1.A
    public void d(Activity activity) {
        p1("onUserLeaveHint(activity)");
        ReactContext reactContextF0 = f0();
        if (reactContextF0 != null) {
            reactContextF0.onUserLeaveHint(activity);
        }
    }

    void d0(e0 e0Var) {
        p1("detachSurface(surfaceId = " + e0Var.n() + ")");
        synchronized (this.f7095g) {
            this.f7095g.remove(e0Var);
        }
    }

    @Override // p014d1.A
    public void e(Activity activity, B1.a aVar) {
        this.f7108t = aVar;
        t1(activity);
    }

    Activity e0() {
        return (Activity) this.f7102n.get();
    }

    @Override // p014d1.A
    public void f(Activity activity) {
        p1("onHostPause(activity)");
        ReactContext reactContextF0 = f0();
        Activity activityE0 = e0();
        if (activityE0 != null) {
            String simpleName = activityE0.getClass().getSimpleName();
            String simpleName2 = activity == null ? "null" : activity.getClass().getSimpleName();
            p002a1.a.b(activity == activityE0, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        r1(false);
        this.f7108t = null;
        this.f7105q.c(reactContextF0, activityE0);
    }

    public ReactContext f0() {
        return (ReactContext) this.f7101m.c();
    }

    @Override // p014d1.A
    public boolean g() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.m(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    B1.a g0() {
        return new B1.a() { // from class: com.facebook.react.runtime.J
            @Override // B1.a
            public final void c() {
                this.f7066b.M0();
            }
        };
    }

    @Override // p014d1.A
    public void h(Activity activity) {
        p1("onHostDestroy(activity)");
        if (e0() == activity) {
            r1(false);
            s1(f0());
        }
    }

    EventDispatcher h0() {
        ReactInstance reactInstance = this.f7100l;
        return reactInstance == null ? P1.b.k() : reactInstance.k();
    }

    CallInvokerHolder i0() {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        u1("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    JavaScriptContextHolder j0() {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.l();
        }
        return null;
    }

    Activity l0() {
        WeakReference weakReference = (WeakReference) this.f7103o.get();
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    NativeModule m0(Class cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.m(cls);
        }
        return null;
    }

    NativeModule n0(String str) {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.n(str);
        }
        return null;
    }

    Collection o0() {
        ReactInstance reactInstance = this.f7100l;
        return reactInstance != null ? reactInstance.o() : new ArrayList();
    }

    @Override // p014d1.A
    public void onActivityResult(Activity activity, int i3, int i4, Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i3 + "\", resultCode = \"" + i4 + "\", data = \"" + intent + "\")";
        ReactContext reactContextF0 = f0();
        if (reactContextF0 != null) {
            reactContextF0.onActivityResult(activity, i3, i4, intent);
        } else {
            u1(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    @Override // p014d1.A
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext reactContextF0 = f0();
        if (reactContextF0 == null) {
            u1(str, "Tried to access onNewIntent while context is not ready");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextF0.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextF0.onNewIntent(e0(), intent);
    }

    @Override // p014d1.A
    public void onWindowFocusChange(boolean z3) {
        String str = "onWindowFocusChange(hasFocus = \"" + z3 + "\")";
        ReactContext reactContextF0 = f0();
        if (reactContextF0 != null) {
            reactContextF0.onWindowFocusChange(z3);
        } else {
            u1(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    public void t1(Activity activity) {
        p1("onHostResume(activity)");
        y1(activity);
        ReactContext reactContextF0 = f0();
        r1(true);
        this.f7105q.d(reactContextF0, e0());
    }

    public ReactQueueConfiguration v0() {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.p();
        }
        return null;
    }

    RuntimeExecutor w0() {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        u1("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    I1.d w1(final int i3, final String str, final Callback callback) {
        final String str2 = "registerSegment(segmentId = \"" + i3 + "\", path = \"" + str + "\")";
        q1(str2, "Schedule");
        return Z(str2, new d() { // from class: com.facebook.react.runtime.L
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f7069a.h1(str2, i3, str, callback, reactInstance);
            }
        }, null);
    }

    FabricUIManager x0() {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.q();
    }

    public p058o1.a x1(final String str) {
        return I1.d.d(new Callable() { // from class: com.facebook.react.runtime.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7188a.k1(str);
            }
        }, this.f7093e).j(new r());
    }

    void y0(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        p1(str);
        if (this.f7098j) {
            this.f7092d.handleException(exc);
        } else {
            this.f7090b.a(exc);
        }
        c0(str, exc);
    }

    boolean z0(Class cls) {
        ReactInstance reactInstance = this.f7100l;
        if (reactInstance != null) {
            return reactInstance.s(cls);
        }
        return false;
    }

    public ReactHostImpl(Context context, InterfaceC0361f interfaceC0361f, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z3, boolean z4) {
        this(context, interfaceC0361f, componentFactory, executor, executor2, z3, z4, null);
    }

    public ReactHostImpl(Context context, InterfaceC0361f interfaceC0361f, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z3, boolean z4, com.facebook.react.devsupport.H h3) {
        this.f7095g = new HashSet();
        this.f7099k = new C0356a(I1.d.m(null));
        this.f7101m = new C0356a();
        this.f7102n = new AtomicReference();
        this.f7103o = new AtomicReference(new WeakReference(null));
        C0358c c0358c = new C0358c(p026g1.a.f9424b);
        this.f7104p = c0358c;
        this.f7105q = new c0(c0358c);
        this.f7106r = f7087B.getAndIncrement();
        this.f7109u = new CopyOnWriteArrayList();
        this.f7110v = new CopyOnWriteArrayList();
        this.f7112x = false;
        this.f7113y = null;
        this.f7114z = null;
        this.f7088A = null;
        this.f7089a = context;
        this.f7090b = interfaceC0361f;
        this.f7091c = componentFactory;
        this.f7093e = executor;
        this.f7094f = executor2;
        this.f7096h = new ComponentCallbacks2C0458i(context);
        this.f7097i = z3;
        this.f7098j = z4;
        this.f7092d = (h3 == null ? new C0339i() : h3).a(context.getApplicationContext(), new W(this), interfaceC0361f.e(), true, null, null, 2, null, null, null, null, z4);
    }
}
