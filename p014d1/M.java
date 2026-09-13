package p014d1;

import B1.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C0339i;
import com.facebook.react.devsupport.H;
import com.facebook.react.jscexecutor.JSCExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p018e1.k;
import p042k1.b;
import p042k1.c;
import p042k1.h;
import p042k1.i;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f9122B = "M";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSBundleLoader f9126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f9128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Application f9129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H f9131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LifecycleState f9134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSExceptionHandler f9135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Activity f9136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f9137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f9139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JavaScriptExecutorFactory f9140q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private UIManagerProvider f9143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map f9144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private V.a f9145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private k f9146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f9147x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9124a = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9141r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9142s = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private EnumC0455f f9148y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p066q1.b f9149z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private h f9123A = null;

    M() {
    }

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        J.J(context);
        EnumC0455f enumC0455f = this.f9148y;
        if (enumC0455f != null) {
            if (enumC0455f == EnumC0455f.HERMES) {
                HermesExecutor.e();
                return new C0.a();
            }
            JSCExecutor.b();
            return new p078t1.a(str, str2);
        }
        try {
            try {
                HermesExecutor.e();
                return new C0.a();
            } catch (UnsatisfiedLinkError e4) {
                Y.a.m(f9122B, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute");
                if (e4.getMessage().contains("__cxa_bad_typeid")) {
                    throw e4;
                }
                return null;
            }
        } catch (UnsatisfiedLinkError unused) {
            JSCExecutor.b();
            return new p078t1.a(str, str2);
        }
    }

    public M a(O o3) {
        this.f9124a.add(o3);
        return this;
    }

    public J b() {
        String str;
        p002a1.a.d(this.f9129f, "Application property has not been set with this builder");
        if (this.f9134k == LifecycleState.RESUMED) {
            p002a1.a.d(this.f9136m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z3 = true;
        p002a1.a.b((!this.f9130g && this.f9125b == null && this.f9126c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f9127d == null && this.f9125b == null && this.f9126c == null) {
            z3 = false;
        }
        p002a1.a.b(z3, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f9129f.getPackageName();
        String strD = com.facebook.react.modules.systeminfo.a.d();
        Application application = this.f9129f;
        Activity activity = this.f9136m;
        a aVar = this.f9137n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f9140q;
        JavaScriptExecutorFactory javaScriptExecutorFactoryC = javaScriptExecutorFactory == null ? c(packageName, strD, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.f9126c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = this.f9125b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(this.f9129f, str, false);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        String str2 = this.f9127d;
        List list = this.f9124a;
        boolean z4 = this.f9130g;
        H c0339i = this.f9131h;
        if (c0339i == null) {
            c0339i = new C0339i();
        }
        return new J(application, activity, aVar, javaScriptExecutorFactoryC, jSBundleLoader, str2, list, z4, c0339i, this.f9132i, this.f9133j, this.f9128e, (LifecycleState) p002a1.a.d(this.f9134k, "Initial lifecycle state was not set"), this.f9135l, null, this.f9138o, this.f9139p, this.f9141r, this.f9142s, this.f9143t, this.f9144u, this.f9145v, this.f9146w, this.f9147x, this.f9149z, this.f9123A);
    }

    public M d(Application application) {
        this.f9129f = application;
        return this;
    }

    public M e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f9125b = str2;
        this.f9126c = null;
        return this;
    }

    public M f(p066q1.b bVar) {
        this.f9149z = bVar;
        return this;
    }

    public M g(c cVar) {
        this.f9147x = cVar;
        return this;
    }

    public M h(H h3) {
        this.f9131h = h3;
        return this;
    }

    public M i(LifecycleState lifecycleState) {
        this.f9134k = lifecycleState;
        return this;
    }

    public M j(String str) {
        if (!str.startsWith("assets://")) {
            return k(JSBundleLoader.createFileLoader(str));
        }
        this.f9125b = str;
        this.f9126c = null;
        return this;
    }

    public M k(JSBundleLoader jSBundleLoader) {
        this.f9126c = jSBundleLoader;
        this.f9125b = null;
        return this;
    }

    public M l(EnumC0455f enumC0455f) {
        this.f9148y = enumC0455f;
        return this;
    }

    public M m(JSExceptionHandler jSExceptionHandler) {
        this.f9135l = jSExceptionHandler;
        return this;
    }

    public M n(String str) {
        this.f9127d = str;
        return this;
    }

    public M o(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f9140q = javaScriptExecutorFactory;
        return this;
    }

    public M p(boolean z3) {
        this.f9138o = z3;
        return this;
    }

    public M q(h hVar) {
        this.f9123A = hVar;
        return this;
    }

    public M r(V.a aVar) {
        this.f9145v = aVar;
        return this;
    }

    public M s(i iVar) {
        return this;
    }

    public M t(boolean z3) {
        this.f9132i = z3;
        return this;
    }

    public M u(k kVar) {
        this.f9146w = kVar;
        return this;
    }

    public M v(UIManagerProvider uIManagerProvider) {
        this.f9143t = uIManagerProvider;
        return this;
    }

    public M w(boolean z3) {
        this.f9130g = z3;
        return this;
    }
}
