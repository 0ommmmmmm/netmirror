package p014d1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.H;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.c0;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C0426x;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.InterfaceC0410o0;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p018e1.k;
import p042k1.g;
import p042k1.h;
import p042k1.i;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f9077E = "J";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final V.a f9078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f9079B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile LifecycleState f9083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f9084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Thread f9085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaScriptExecutorFactory f9086e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSBundleLoader f9088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f9090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p042k1.e f9091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f9093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f9095n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile ReactContext f9097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f9098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private B1.a f9099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Activity f9100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ReactInstanceManagerInspectorTarget f9101t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ComponentCallbacks2C0458i f9105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final JSExceptionHandler f9106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final UIManagerProvider f9107z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9082a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Collection f9087f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f9096o = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection f9102u = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f9103v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile Boolean f9104w = Boolean.FALSE;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f9080C = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile boolean f9081D = false;

    class a implements B1.a {
        a() {
        }

        @Override // B1.a
        public void c() {
            J.this.K();
        }
    }

    class b implements c0 {
        b() {
        }

        @Override // com.facebook.react.devsupport.c0
        public View a(String str) {
            Activity activityI = i();
            if (activityI == null) {
                return null;
            }
            a0 a0Var = new a0(activityI);
            a0Var.setIsFabric(p070r1.b.f());
            a0Var.u(J.this, str, new Bundle());
            return a0Var;
        }

        @Override // com.facebook.react.devsupport.c0
        public void b(View view) {
            if (view instanceof a0) {
                ((a0) view).v();
            }
        }

        @Override // com.facebook.react.devsupport.c0
        public void h() {
            J.this.t0();
        }

        @Override // com.facebook.react.devsupport.c0
        public Activity i() {
            return J.this.f9100s;
        }

        @Override // com.facebook.react.devsupport.c0
        public void j(String str) {
        }

        @Override // com.facebook.react.devsupport.c0
        public JavaScriptExecutorFactory k() {
            return J.this.E();
        }
    }

    class c implements g {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z3) {
            if (J.this.f9081D) {
                return;
            }
            if (z3) {
                J.this.f9091j.s();
            } else if (!J.this.f9091j.v() || J.this.f9080C) {
                J.this.m0();
            } else {
                J.this.f0();
            }
        }

        @Override // p042k1.g
        public void a(final boolean z3) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: d1.K
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9119b.c(z3);
                }
            });
        }
    }

    class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9111b;

        d(View view) {
            this.f9111b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f9111b.removeOnAttachStateChangeListener(this);
            J.this.f9091j.A(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f9113a;

        class a implements k1.e.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ J f9114a;

            a(J j3) {
                this.f9114a = j3;
            }

            @Override // k1.e.a
            public void a() {
                UiThreadUtil.assertOnUiThread();
                if (this.f9114a.f9101t != null) {
                    this.f9114a.f9101t.sendDebuggerResumeCommand();
                }
            }
        }

        public e(J j3) {
            this.f9113a = new WeakReference(j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            J j3 = (J) this.f9113a.get();
            if (j3 != null) {
                j3.f9091j.s();
            }
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public Map getMetadata() {
            J j3 = (J) this.f9113a.get();
            return com.facebook.react.modules.systeminfo.a.e(j3 != null ? j3.f9098q : null);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            p038j1.a.a(str, inspectorNetworkRequestListener);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onReload() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: d1.L
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9121b.b();
                }
            });
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onSetPausedInDebuggerMessage(String str) {
            J j3 = (J) this.f9113a.get();
            if (j3 == null) {
                return;
            }
            if (str == null) {
                j3.f9091j.e();
            } else {
                j3.f9091j.d(str, new a(j3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaScriptExecutorFactory f9116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSBundleLoader f9117b;

        public f(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f9116a = (JavaScriptExecutorFactory) p002a1.a.c(javaScriptExecutorFactory);
            this.f9117b = (JSBundleLoader) p002a1.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f9117b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f9116a;
        }
    }

    J(Context context, Activity activity, B1.a aVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z3, H h3, boolean z4, boolean z5, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, i iVar, boolean z6, p042k1.b bVar, int i3, int i4, UIManagerProvider uIManagerProvider, Map map, V.a aVar2, k kVar, p042k1.c cVar, p066q1.b bVar2, h hVar) {
        Y.a.b(f9077E, "ReactInstanceManager.ctor()");
        J(context);
        C0426x.f(context);
        this.f9098q = context;
        this.f9100s = activity;
        this.f9099r = aVar;
        this.f9086e = javaScriptExecutorFactory;
        this.f9088g = jSBundleLoader;
        this.f9089h = str;
        ArrayList arrayList = new ArrayList();
        this.f9090i = arrayList;
        this.f9092k = z3;
        this.f9093l = z4;
        this.f9094m = z5;
        p015d2.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        p042k1.e eVarB = h3.b(context, w(), str, z3, iVar, bVar, i3, map, kVar, cVar, hVar);
        this.f9091j = eVarB;
        p015d2.a.i(0L);
        this.f9095n = notThreadSafeBridgeIdleDebugListener;
        this.f9083b = lifecycleState;
        this.f9105x = new ComponentCallbacks2C0458i(context);
        this.f9106y = jSExceptionHandler;
        this.f9078A = aVar2;
        synchronized (arrayList) {
            try {
                p037j0.c.a().c(p041k0.a.f9582d, "RNCore: Use Split Packages");
                arrayList.add(new C0452c(this, new a(), z6, i4));
                if (z3) {
                    arrayList.add(new C0454e());
                }
                arrayList.addAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9107z = uIManagerProvider;
        com.facebook.react.modules.core.b.i(bVar2 != null ? bVar2 : p066q1.a.b());
        if (z3) {
            eVarB.u();
        }
        o0();
    }

    private void B(InterfaceC0410o0 interfaceC0410o0, ReactContext reactContext) {
        Y.a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (interfaceC0410o0.getState().compareAndSet(1, 0)) {
            int uIManagerType = interfaceC0410o0.getUIManagerType();
            if (uIManagerType != 2) {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(interfaceC0410o0.getRootViewTag());
                return;
            }
            int rootViewTag = interfaceC0410o0.getRootViewTag();
            if (rootViewTag != -1) {
                UIManager uIManagerG = H0.g(reactContext, uIManagerType);
                if (uIManagerG != null) {
                    uIManagerG.stopSurface(rootViewTag);
                } else {
                    Y.a.I("ReactNative", "Failed to stop surface, UIManager has already gone away");
                }
            } else {
                ReactSoftExceptionLogger.logSoftException(f9077E, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
            }
            v(interfaceC0410o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory E() {
        return this.f9086e;
    }

    private ReactInstanceManagerInspectorTarget F() {
        if (this.f9101t == null && InspectorFlags.getFuseboxEnabled()) {
            this.f9101t = new ReactInstanceManagerInspectorTarget(new e(this));
        }
        return this.f9101t;
    }

    static void J(Context context) {
        SoLoader.m(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        UiThreadUtil.assertOnUiThread();
        B1.a aVar = this.f9099r;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(int i3, InterfaceC0410o0 interfaceC0410o0) {
        p015d2.a.g(0L, "pre_rootView.onAttachedToReactInstance", i3);
        interfaceC0410o0.a(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        f fVar = this.f9084c;
        if (fVar != null) {
            p0(fVar);
            this.f9084c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(ReactApplicationContext reactApplicationContext) {
        try {
            q0(reactApplicationContext);
        } catch (Exception e4) {
            this.f9091j.handleException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(f fVar) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.f9104w) {
            while (this.f9104w.booleanValue()) {
                try {
                    this.f9104w.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.f9103v = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            final ReactApplicationContext reactApplicationContextX = x(fVar.b().create(), fVar.a());
            try {
                this.f9085d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                Runnable runnable = new Runnable() { // from class: d1.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9071b.M();
                    }
                };
                reactApplicationContextX.runOnNativeModulesQueueThread(new Runnable() { // from class: d1.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9072b.N(reactApplicationContextX);
                    }
                });
                UiThreadUtil.runOnUiThread(runnable);
            } catch (Exception e4) {
                this.f9091j.handleException(e4);
            }
        } catch (Exception e5) {
            this.f9103v = false;
            this.f9085d = null;
            this.f9091j.handleException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(B[] bArr, ReactApplicationContext reactApplicationContext) {
        S();
        for (B b4 : bArr) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private synchronized void S() {
        if (this.f9083b == LifecycleState.RESUMED) {
            V(true);
        }
    }

    private synchronized void T() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f9083b == LifecycleState.RESUMED) {
                    reactContextC.onHostPause();
                    this.f9083b = LifecycleState.BEFORE_RESUME;
                }
                if (this.f9083b == LifecycleState.BEFORE_RESUME) {
                    reactContextC.onHostDestroy(this.f9094m);
                }
            }
            this.f9083b = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void U() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f9083b == LifecycleState.BEFORE_CREATE) {
                    reactContextC.onHostResume(this.f9100s);
                    reactContextC.onHostPause();
                } else if (this.f9083b == LifecycleState.RESUMED) {
                    reactContextC.onHostPause();
                }
            }
            this.f9083b = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void V(boolean z3) {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null && (z3 || this.f9083b == LifecycleState.BEFORE_RESUME || this.f9083b == LifecycleState.BEFORE_CREATE)) {
                reactContextC.onHostResume(this.f9100s);
            }
            this.f9083b = LifecycleState.RESUMED;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        Y.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        l0(this.f9086e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f9091j.E(), this.f9091j.j()));
    }

    private void j0(O o3, C0459j c0459j) {
        p015d2.b.a(0L, "processPackage").b("className", o3.getClass().getSimpleName()).c();
        boolean z3 = o3 instanceof Q;
        if (z3) {
            ((Q) o3).b();
        }
        c0459j.b(o3);
        if (z3) {
            ((Q) o3).c();
        }
        p015d2.b.b(0L).c();
    }

    private NativeModuleRegistry k0(ReactApplicationContext reactApplicationContext, List list) {
        C0459j c0459j = new C0459j(reactApplicationContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f9090i) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        O o3 = (O) it.next();
                        p015d2.a.c(0L, "createAndProcessCustomReactPackage");
                        try {
                            j0(o3, c0459j);
                            p015d2.a.i(0L);
                        } catch (Throwable th) {
                            p015d2.a.i(0L);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        p015d2.a.c(0L, "buildNativeModuleRegistry");
        try {
            return c0459j.a();
        } finally {
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void l0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        Y.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        f fVar = new f(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f9085d == null) {
            p0(fVar);
        } else {
            this.f9084c = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        Y.a.b(f9077E, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        p037j0.c.a().c(p041k0.a.f9582d, "RNCore: load from BundleLoader");
        l0(this.f9086e, this.f9088g);
    }

    private void n0() {
        Y.a.b(f9077E, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        p037j0.c.a().c(p041k0.a.f9582d, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f9092k && this.f9089h != null) {
            this.f9091j.o();
            if (!p015d2.a.j(0L)) {
                if (this.f9088g == null) {
                    this.f9091j.s();
                    return;
                } else {
                    this.f9091j.k(new c());
                    return;
                }
            }
        }
        m0();
    }

    private void o0() {
        Method method;
        try {
            method = J.class.getMethod("I", Exception.class);
        } catch (NoSuchMethodException e4) {
            Y.a.n("ReactInstanceHolder", "Failed to set cxx error handler function", e4);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void p0(final f fVar) {
        Y.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        p002a1.a.b(!this.f9081D, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f9082a) {
            synchronized (this.f9096o) {
                try {
                    if (this.f9097p != null) {
                        s0(this.f9097p);
                        this.f9097p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f9085d = new Thread(null, new Runnable() { // from class: d1.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f9069b.O(fVar);
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f9085d.start();
    }

    private void q0(final ReactApplicationContext reactApplicationContext) {
        Y.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        p015d2.a.c(0L, "setupReactContext");
        synchronized (this.f9082a) {
            try {
                synchronized (this.f9096o) {
                    this.f9097p = (ReactContext) p002a1.a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) p002a1.a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f9091j.r(reactApplicationContext);
                this.f9105x.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.f9082a.iterator();
                while (it.hasNext()) {
                    t((InterfaceC0410o0) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        final B[] bArr = (B[]) this.f9102u.toArray(new B[this.f9102u.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: d1.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f9074b.P(bArr, reactApplicationContext);
            }
        });
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: d1.H
            @Override // java.lang.Runnable
            public final void run() {
                J.Q();
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: d1.I
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
        p015d2.a.i(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void s0(ReactContext reactContext) {
        Y.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f9083b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f9082a) {
            try {
                Iterator it = this.f9082a.iterator();
                while (it.hasNext()) {
                    B((InterfaceC0410o0) it.next(), reactContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9105x.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f9091j.z(reactContext);
    }

    private void t(final InterfaceC0410o0 interfaceC0410o0) {
        final int iAddRootView;
        Y.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (interfaceC0410o0.getState().compareAndSet(0, 1)) {
            p015d2.a.c(0L, "attachRootViewToInstance");
            UIManager uIManagerG = H0.g(this.f9097p, interfaceC0410o0.getUIManagerType());
            if (uIManagerG == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = interfaceC0410o0.getAppProperties();
            if (interfaceC0410o0.getUIManagerType() == 2) {
                iAddRootView = uIManagerG.startSurface(interfaceC0410o0.getRootViewGroup(), interfaceC0410o0.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), interfaceC0410o0.getWidthMeasureSpec(), interfaceC0410o0.getHeightMeasureSpec());
                interfaceC0410o0.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerG.addRootView(interfaceC0410o0.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                interfaceC0410o0.setRootViewTag(iAddRootView);
                interfaceC0410o0.d();
            }
            p015d2.a.a(0L, "pre_rootView.onAttachedToReactInstance", iAddRootView);
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: d1.C
                @Override // java.lang.Runnable
                public final void run() {
                    J.L(iAddRootView, interfaceC0410o0);
                }
            });
            p015d2.a.i(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ReactContext reactContextC = C();
        if (reactContextC == null || !reactContextC.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f9077E, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            reactContextC.emitDeviceEvent("toggleElementInspector");
        }
    }

    public static M u() {
        return new M();
    }

    private void v(InterfaceC0410o0 interfaceC0410o0) {
        UiThreadUtil.assertOnUiThread();
        interfaceC0410o0.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = interfaceC0410o0.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private c0 w() {
        return new b();
    }

    private ReactApplicationContext x(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        V.a aVar;
        Y.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f9098q);
        JSExceptionHandler jSExceptionHandler = this.f9106y;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f9091j;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(k0(bridgeReactContext, this.f9090i)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(F());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        p015d2.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
            catalystInstanceImplBuild.getRuntimeScheduler();
            if (p070r1.b.t() && (aVar = this.f9078A) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(catalystInstanceImplBuild.getRuntimeExecutor(), aVar.c(this.f9090i).d(bridgeReactContext).a(), catalystInstanceImplBuild.getJSCallInvokerHolder(), catalystInstanceImplBuild.getNativeMethodCallInvokerHolder());
                catalystInstanceImplBuild.setTurboModuleRegistry(turboModuleManager);
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
            }
            UIManagerProvider uIManagerProvider = this.f9107z;
            if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                uIManagerCreateUIManager.initialize();
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f9095n;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                catalystInstanceImplBuild.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (p015d2.a.j(0L)) {
                catalystInstanceImplBuild.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            p015d2.a.c(0L, "runJSBundle");
            catalystInstanceImplBuild.runJSBundle();
            p015d2.a.i(0L);
            return bridgeReactContext;
        } catch (Throwable th) {
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    public void A(InterfaceC0410o0 interfaceC0410o0) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f9082a.remove(interfaceC0410o0) && (reactContext = this.f9097p) != null && reactContext.hasActiveReactInstance()) {
            B(interfaceC0410o0, reactContext);
        }
    }

    public ReactContext C() {
        ReactContext reactContext;
        synchronized (this.f9096o) {
            reactContext = this.f9097p;
        }
        return reactContext;
    }

    public p042k1.e D() {
        return this.f9091j;
    }

    public List G(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        p015d2.a.c(0L, "createAllViewManagers");
        try {
            if (this.f9079B == null) {
                synchronized (this.f9090i) {
                    try {
                        if (this.f9079B == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.f9090i.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((O) it.next()).f(reactApplicationContext));
                            }
                            this.f9079B = arrayList;
                            p015d2.a.i(0L);
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            List list = this.f9079B;
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th2) {
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th2;
        }
    }

    public Collection H() {
        Collection collection;
        p015d2.a.c(0L, "ReactInstanceManager.getViewManagerNames");
        try {
            Collection collection2 = this.f9087f;
            if (collection2 != null) {
                p015d2.a.i(0L);
                return collection2;
            }
            synchronized (this.f9096o) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.f9090i) {
                        try {
                            if (this.f9087f == null) {
                                HashSet hashSet = new HashSet();
                                for (O o3 : this.f9090i) {
                                    p015d2.b.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", o3.getClass().getSimpleName()).c();
                                    if (o3 instanceof c0) {
                                        Collection collectionD = ((c0) o3).d(reactApplicationContext);
                                        if (collectionD != null) {
                                            hashSet.addAll(collectionD);
                                        }
                                    } else {
                                        Y.a.K("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", o3.getClass().getSimpleName());
                                    }
                                    p015d2.a.i(0L);
                                }
                                this.f9087f = hashSet;
                            }
                            collection = this.f9087f;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    p015d2.a.i(0L);
                    return collection;
                }
                Y.a.I("ReactNative", "Calling getViewManagerNames without active context");
                List listEmptyList = Collections.emptyList();
                p015d2.a.i(0L);
                return listEmptyList;
            }
        } catch (Throwable th2) {
            p015d2.a.i(0L);
            throw th2;
        }
    }

    public void I(Exception exc) {
        this.f9091j.handleException(exc);
    }

    public void W(Activity activity, int i3, int i4, Intent intent) {
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onActivityResult(activity, i3, i4, intent);
        }
    }

    public void X() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f9097p;
        if (reactContext == null) {
            Y.a.I(f9077E, "Instance detached from instance manager");
            K();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void Y(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC == null || (appearanceModule = (AppearanceModule) reactContextC.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void Z() {
        UiThreadUtil.assertOnUiThread();
        if (this.f9092k) {
            this.f9091j.A(false);
        }
        T();
        if (this.f9094m) {
            return;
        }
        this.f9100s = null;
    }

    public void a0(Activity activity) {
        if (activity == this.f9100s) {
            Z();
        }
    }

    public void b0() {
        UiThreadUtil.assertOnUiThread();
        this.f9099r = null;
        if (this.f9092k) {
            this.f9091j.A(false);
        }
        U();
    }

    public void c0(Activity activity) {
        if (this.f9093l) {
            if (this.f9100s == null) {
                Y.a.m(f9077E, "ReactInstanceManager.onHostPause called with null activity, expected:" + this.f9100s.getClass().getSimpleName());
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                for (int i3 = 0; i3 < length; i3++) {
                    Y.a.m(f9077E, stackTrace[i3].toString());
                }
            }
            p002a1.a.a(this.f9100s != null);
        }
        Activity activity2 = this.f9100s;
        if (activity2 != null) {
            p002a1.a.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f9100s.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        b0();
    }

    public void d0(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f9100s = activity;
        if (this.f9092k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (Z.E(decorView)) {
                    this.f9091j.A(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new d(decorView));
                }
            } else if (!this.f9093l) {
                this.f9091j.A(true);
            }
        }
        V(false);
    }

    public void e0(Activity activity, B1.a aVar) {
        UiThreadUtil.assertOnUiThread();
        this.f9099r = aVar;
        d0(activity);
    }

    public void g0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC == null) {
            Y.a.I(f9077E, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextC.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextC.onNewIntent(this.f9100s, intent);
    }

    public void h0(Activity activity) {
        Activity activity2 = this.f9100s;
        if (activity2 == null || activity != activity2) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onUserLeaveHint(activity);
        }
    }

    public void i0(boolean z3) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onWindowFocusChange(z3);
        }
    }

    public void r0() {
        UiThreadUtil.assertOnUiThread();
        this.f9091j.x();
    }

    public void s(InterfaceC0410o0 interfaceC0410o0) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f9082a) {
            try {
                if (this.f9082a.add(interfaceC0410o0)) {
                    v(interfaceC0410o0);
                } else {
                    Y.a.m("ReactNative", "ReactRoot was attached multiple times");
                }
                ReactContext reactContextC = C();
                if (this.f9085d == null && reactContextC != null) {
                    t(interfaceC0410o0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y() {
        Y.a.b(f9077E, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f9103v) {
            return;
        }
        this.f9103v = true;
        n0();
    }

    public ViewManager z(String str) {
        ViewManager viewManagerA;
        synchronized (this.f9096o) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f9090i) {
                    try {
                        for (O o3 : this.f9090i) {
                            if ((o3 instanceof c0) && (viewManagerA = ((c0) o3).a(reactApplicationContext, str)) != null) {
                                return viewManagerA;
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return null;
        }
    }
}
