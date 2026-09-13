package com.facebook.react.devsupport;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p014d1.AbstractC0465p;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements p042k1.e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final p042k1.b f6595B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List f6596C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Map f6597D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p018e1.k f6598E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p018e1.g f6600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f6601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0341k f6602d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final c0 f6604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f6606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f6607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DefaultJSExceptionHandler f6608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p042k1.c f6609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p042k1.h f6610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p018e1.j f6611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AlertDialog f6612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0334d f6613o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ReactContext f6616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1.a f6617s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f6621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f6622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p042k1.j[] f6623y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p042k1.f f6624z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f6603e = new LinkedHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6614p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6615q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6618t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6619u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6620v = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f6594A = 0;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (E.j0(context).equals(intent.getAction())) {
                E.this.s();
            }
        }
    }

    class b implements p042k1.d {
        b() {
        }

        @Override // p042k1.d
        public void a() {
            if (!E.this.f6617s.n() && E.this.f6617s.o()) {
                Toast.makeText(E.this.f6599a, E.this.f6599a.getString(AbstractC0465p.f9282h), 1).show();
                E.this.f6617s.f(false);
            }
            E.this.s();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f6627b;

        c(EditText editText) {
            this.f6627b = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i3) {
            E.this.f6617s.h().d(this.f6627b.getText().toString());
            E.this.s();
        }
    }

    class d implements p042k1.d {
        d() {
        }

        @Override // p042k1.d
        public void a() {
            E.this.f6617s.i(!E.this.f6617s.g());
            E.this.f6604f.h();
        }
    }

    class e extends ArrayAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f6630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i3, String[] strArr, Set set) {
            super(context, i3, strArr);
            this.f6630b = set;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i3, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i3, view, viewGroup);
            view2.setEnabled(isEnabled(i3));
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i3) {
            return !this.f6630b.contains(getItem(i3));
        }
    }

    class f implements p042k1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0332b.c f6632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p042k1.a f6633b;

        f(C0332b.c cVar, p042k1.a aVar) {
            this.f6632a = cVar;
            this.f6633b = aVar;
        }

        @Override // p042k1.b
        public void a() {
            E.this.l0();
            if (E.this.f6595B != null) {
                E.this.f6595B.a();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f6632a.c());
            this.f6633b.a();
        }

        @Override // p042k1.b
        public void b(String str, Integer num, Integer num2) {
            E.this.f6609k.b(str, num, num2);
            if (E.this.f6595B != null) {
                E.this.f6595B.b(str, num, num2);
            }
        }

        @Override // p042k1.b
        public void c(Exception exc) {
            E.this.l0();
            if (E.this.f6595B != null) {
                E.this.f6595B.c(exc);
            }
            Y.a.n("ReactNative", "Unable to download JS bundle", exc);
            E.this.F0(exc);
            this.f6633b.b(exc);
        }
    }

    class g implements C0341k.g {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h() {
            E.this.x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i() {
            E.this.s();
        }

        @Override // com.facebook.react.devsupport.C0341k.g
        public void a() {
            E.this.f6621w = false;
        }

        @Override // com.facebook.react.devsupport.C0341k.g
        public void b() {
            E.this.f6621w = true;
        }

        @Override // com.facebook.react.devsupport.C0341k.g
        public void c() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6636b.h();
                }
            });
        }

        @Override // com.facebook.react.devsupport.C0341k.g
        public Map d() {
            return E.this.f6597D;
        }

        @Override // com.facebook.react.devsupport.C0341k.g
        public void e() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                E.this.f6602d.n();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6637b.i();
                }
            });
        }
    }

    public E(Context context, c0 c0Var, String str, boolean z3, p042k1.i iVar, p042k1.b bVar, int i3, Map<String, H1.f> map, p018e1.k kVar, p042k1.c cVar, p042k1.h hVar) {
        this.f6604f = c0Var;
        this.f6599a = context;
        this.f6605g = str;
        SharedPreferencesOnSharedPreferenceChangeListenerC0340j sharedPreferencesOnSharedPreferenceChangeListenerC0340j = new SharedPreferencesOnSharedPreferenceChangeListenerC0340j(context, new SharedPreferencesOnSharedPreferenceChangeListenerC0340j.b() { // from class: com.facebook.react.devsupport.o
            @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0340j.b
            public final void a() {
                this.f6777a.E0();
            }
        });
        this.f6617s = sharedPreferencesOnSharedPreferenceChangeListenerC0340j;
        this.f6602d = new C0341k(sharedPreferencesOnSharedPreferenceChangeListenerC0340j, context, sharedPreferencesOnSharedPreferenceChangeListenerC0340j.h());
        this.f6595B = bVar;
        this.f6600b = new p018e1.g(new e1.g.a() { // from class: com.facebook.react.devsupport.p
            @Override // e1.g.a
            public final void a() {
                this.f6778a.x();
            }
        }, i3);
        this.f6597D = map;
        this.f6601c = new a();
        String strK0 = k0();
        this.f6606h = new File(context.getFilesDir(), strK0 + "ReactNativeDevBundle.js");
        this.f6607i = context.getDir(strK0.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.f6608j = new DefaultJSExceptionHandler();
        A(z3);
        this.f6609k = cVar == null ? new C0338h(c0Var) : cVar;
        this.f6598E = kVar;
        this.f6610l = hVar == null ? new a0(new p064q.i() { // from class: com.facebook.react.devsupport.q
            @Override // p064q.i
            public final Object get() {
                return this.f6779a.o0();
            }
        }) : hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        C1.a aVar = this.f6617s;
        aVar.i(!aVar.g());
        this.f6604f.h();
    }

    private void B0(Exception exc) {
        StringBuilder sb = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            J0(sb.toString(), exc);
        } else {
            Y.a.n("ReactNative", "Exception in native call from JS", exc);
            I0(exc.getMessage().toString(), new p042k1.j[0], -1, p042k1.f.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        UiThreadUtil.assertOnUiThread();
        if (!this.f6620v) {
            C0334d c0334d = this.f6613o;
            if (c0334d != null) {
                c0334d.i(false);
            }
            if (this.f6619u) {
                this.f6600b.f();
                this.f6619u = false;
            }
            if (this.f6618t) {
                this.f6599a.unregisterReceiver(this.f6601c);
                this.f6618t = false;
            }
            q();
            m0();
            this.f6609k.c();
            this.f6602d.j();
            return;
        }
        C0334d c0334d2 = this.f6613o;
        if (c0334d2 != null) {
            c0334d2.i(this.f6617s.m());
        }
        if (!this.f6619u) {
            this.f6600b.e((SensorManager) this.f6599a.getSystemService("sensor"));
            this.f6619u = true;
        }
        if (!this.f6618t) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(j0(this.f6599a));
            d0(this.f6599a, this.f6601c, intentFilter, true);
            this.f6618t = true;
        }
        if (this.f6614p) {
            this.f6609k.a("Reloading...");
        }
        this.f6602d.z(getClass().getSimpleName(), new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f6785b.p0(exc);
            }
        });
    }

    private void G0(ReactContext reactContext) {
        if (this.f6616r == reactContext) {
            return;
        }
        this.f6616r = reactContext;
        C0334d c0334d = this.f6613o;
        if (c0334d != null) {
            c0334d.i(false);
        }
        if (reactContext != null) {
            this.f6613o = new C0334d(reactContext);
        }
        if (this.f6616r != null) {
            try {
                URL url = new URL(E());
                ((HMRClient) this.f6616r.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.f6617s.o(), url.getProtocol());
            } catch (MalformedURLException e4) {
                J0(e4.getMessage(), e4);
            }
        }
        E0();
    }

    private void H0(String str) {
        if (this.f6599a == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            this.f6609k.a(this.f6599a.getString(AbstractC0465p.f9286l, url.getHost() + ":" + port));
            this.f6614p = true;
        } catch (MalformedURLException e4) {
            Y.a.m("ReactNative", "Bundle url format is invalid. \n\n" + e4.toString());
        }
    }

    private void I0(final String str, final p042k1.j[] jVarArr, final int i3, final p042k1.f fVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f6788b.z0(str, jVarArr, i3, fVar);
            }
        });
    }

    private void K0(String str, p042k1.j[] jVarArr, int i3, p042k1.f fVar) {
        this.f6622x = str;
        this.f6623y = jVarArr;
        this.f6594A = i3;
        this.f6624z = fVar;
    }

    private void d0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z3) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z3 ? 2 : 4);
        }
    }

    private String h0() {
        try {
            return i0().k().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j0(Context context) {
        return context.getPackageName() + ".RELOAD_APP_ACTION";
    }

    private void m0() {
        AlertDialog alertDialog = this.f6612n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f6612n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(p042k1.g gVar) {
        this.f6602d.w(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context o0() {
        Activity activityI = this.f6604f.i();
        if (activityI == null || activityI.isFinishing()) {
            return null;
        }
        return activityI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Exception exc) {
        if (exc instanceof p018e1.c) {
            J0(((p018e1.c) exc).getMessage(), exc);
        } else {
            J0(this.f6599a.getString(AbstractC0465p.f9291q), exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(boolean z3) {
        this.f6617s.c(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(boolean z3) {
        this.f6617s.f(z3);
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        Activity activityI = this.f6604f.i();
        if (activityI == null || activityI.isFinishing()) {
            Y.a.m("ReactNative", "Unable to launch change bundle location because react activity is not available");
            return;
        }
        EditText editText = new EditText(activityI);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(activityI).setTitle(this.f6599a.getString(AbstractC0465p.f9276b)).setView(editText).setPositiveButton(R.string.ok, new c(editText)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        boolean zO = this.f6617s.o();
        this.f6617s.f(!zO);
        ReactContext reactContext = this.f6616r;
        if (reactContext != null) {
            if (zO) {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).disable();
            } else {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).enable();
            }
        }
        if (zO || this.f6617s.n()) {
            return;
        }
        Context context = this.f6599a;
        Toast.makeText(context, context.getString(AbstractC0465p.f9283i), 1).show();
        this.f6617s.k(true);
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0() {
        if (!this.f6617s.m()) {
            Activity activityI = this.f6604f.i();
            if (activityI == null) {
                Y.a.m("ReactNative", "Unable to get reference to react activity");
            } else {
                C0334d.h(activityI);
            }
        }
        C1.a aVar = this.f6617s;
        aVar.c(!aVar.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0() {
        Intent intent = new Intent(this.f6599a, (Class<?>) C0342l.class);
        intent.setFlags(268435456);
        this.f6599a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(p042k1.d[] dVarArr, DialogInterface dialogInterface, int i3) {
        dVarArr[i3].a();
        this.f6612n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(DialogInterface dialogInterface) {
        this.f6612n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(String str, p042k1.j[] jVarArr, int i3, p042k1.f fVar) {
        K0(str, jVarArr, i3, fVar);
        if (this.f6611m == null) {
            p018e1.j jVarG = g(NativeRedBoxSpec.NAME);
            if (jVarG != null) {
                this.f6611m = jVarG;
            } else {
                this.f6611m = new i0(this);
            }
            this.f6611m.f(NativeRedBoxSpec.NAME);
        }
        if (this.f6611m.a()) {
            return;
        }
        this.f6611m.b();
    }

    @Override // p042k1.e
    public void A(boolean z3) {
        this.f6620v = z3;
        E0();
    }

    @Override // p042k1.e
    public p042k1.f B() {
        return this.f6624z;
    }

    @Override // p042k1.e
    public ReactContext C() {
        return this.f6616r;
    }

    @Override // p042k1.e
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s0() {
        this.f6602d.x(this.f6616r, this.f6599a.getString(AbstractC0465p.f9287m));
    }

    public void D0(String str, p042k1.a aVar) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        H0(str);
        C0332b.c cVar = new C0332b.c();
        this.f6602d.o(new f(cVar, aVar), this.f6606h, str, cVar);
    }

    @Override // p042k1.e
    public String E() {
        String str = this.f6605g;
        return str == null ? "" : this.f6602d.v((String) p002a1.a.c(str));
    }

    public void E0() {
        if (UiThreadUtil.isOnUiThread()) {
            C0();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6787b.C0();
                }
            });
        }
    }

    public void J0(String str, Throwable th) {
        Y.a.n("ReactNative", "Exception in native call", th);
        I0(str, l0.a(th), -1, p042k1.f.NATIVE);
    }

    @Override // p042k1.e
    public View a(String str) {
        return this.f6604f.a(str);
    }

    @Override // p042k1.e
    public void b(View view) {
        this.f6604f.b(view);
    }

    @Override // p042k1.e
    public void c(final boolean z3) {
        if (this.f6620v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6773b.q0(z3);
                }
            });
        }
    }

    @Override // p042k1.e
    public void d(String str, k1.e.a aVar) {
        this.f6610l.d(str, aVar);
    }

    @Override // p042k1.e
    public void e() {
        this.f6610l.e();
    }

    public p042k1.c e0() {
        return this.f6609k;
    }

    @Override // p042k1.e
    public void f(final boolean z3) {
        if (this.f6620v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6782b.r0(z3);
                }
            });
        }
    }

    public C0341k f0() {
        return this.f6602d;
    }

    @Override // p042k1.e
    public p018e1.j g(String str) {
        p018e1.k kVar = this.f6598E;
        if (kVar == null) {
            return null;
        }
        return kVar.g(str);
    }

    public String g0() {
        return this.f6605g;
    }

    @Override // p042k1.e
    public void h() {
        if (this.f6620v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6784b.A0();
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.f6620v) {
            B0(exc);
        } else {
            this.f6608j.handleException(exc);
        }
    }

    @Override // p042k1.e
    public Activity i() {
        return this.f6604f.i();
    }

    public c0 i0() {
        return this.f6604f;
    }

    @Override // p042k1.e
    public String j() {
        return this.f6606h.getAbsolutePath();
    }

    @Override // p042k1.e
    public void k(final p042k1.g gVar) {
        new Runnable() { // from class: com.facebook.react.devsupport.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f6780b.n0(gVar);
            }
        }.run();
    }

    protected abstract String k0();

    @Override // p042k1.e
    public String l() {
        return this.f6622x;
    }

    protected void l0() {
        this.f6609k.c();
        this.f6614p = false;
    }

    @Override // p042k1.e
    public void m() {
        this.f6602d.i();
    }

    @Override // p042k1.e
    public boolean n() {
        return this.f6620v;
    }

    @Override // p042k1.e
    public C1.a o() {
        return this.f6617s;
    }

    @Override // p042k1.e
    public void p(String str, p042k1.d dVar) {
        this.f6603e.put(str, dVar);
    }

    @Override // p042k1.e
    public void q() {
        p018e1.j jVar = this.f6611m;
        if (jVar == null) {
            return;
        }
        jVar.c();
    }

    @Override // p042k1.e
    public void r(ReactContext reactContext) {
        G0(reactContext);
    }

    @Override // p042k1.e
    public p042k1.i t() {
        return null;
    }

    @Override // p042k1.e
    public void u() {
        if (this.f6620v) {
            this.f6602d.y();
        }
    }

    @Override // p042k1.e
    public boolean v() {
        if (this.f6620v && this.f6606h.exists()) {
            try {
                String packageName = this.f6599a.getPackageName();
                if (this.f6606h.lastModified() > this.f6599a.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", packageName));
                    return !file.exists() || this.f6606h.lastModified() > file.lastModified();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Y.a.m("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // p042k1.e
    public p042k1.j[] w() {
        return this.f6623y;
    }

    @Override // p042k1.e
    public void x() {
        if (this.f6612n == null && this.f6620v && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f6599a.getString(AbstractC0465p.f9290p), new b());
            if (this.f6617s.j()) {
                boolean z3 = this.f6621w;
                String string = this.f6599a.getString(z3 ? AbstractC0465p.f9277c : AbstractC0465p.f9278d);
                if (!z3) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new p042k1.d() { // from class: com.facebook.react.devsupport.x
                    @Override // p042k1.d
                    public final void a() {
                        this.f6793a.s0();
                    }
                });
            }
            linkedHashMap.put(this.f6599a.getString(AbstractC0465p.f9276b), new p042k1.d() { // from class: com.facebook.react.devsupport.y
                @Override // p042k1.d
                public final void a() {
                    this.f6794a.t0();
                }
            });
            linkedHashMap.put(this.f6599a.getString(AbstractC0465p.f9285k), new d());
            linkedHashMap.put(this.f6617s.o() ? this.f6599a.getString(AbstractC0465p.f9284j) : this.f6599a.getString(AbstractC0465p.f9281g), new p042k1.d() { // from class: com.facebook.react.devsupport.z
                @Override // p042k1.d
                public final void a() {
                    this.f6795a.u0();
                }
            });
            linkedHashMap.put(this.f6617s.m() ? this.f6599a.getString(AbstractC0465p.f9289o) : this.f6599a.getString(AbstractC0465p.f9288n), new p042k1.d() { // from class: com.facebook.react.devsupport.A
                @Override // p042k1.d
                public final void a() {
                    this.f6576a.v0();
                }
            });
            linkedHashMap.put(this.f6599a.getString(AbstractC0465p.f9292r), new p042k1.d() { // from class: com.facebook.react.devsupport.B
                @Override // p042k1.d
                public final void a() {
                    this.f6577a.w0();
                }
            });
            if (this.f6603e.size() > 0) {
                linkedHashMap.putAll(this.f6603e);
            }
            final p042k1.d[] dVarArr = (p042k1.d[]) linkedHashMap.values().toArray(new p042k1.d[0]);
            Activity activityI = this.f6604f.i();
            if (activityI == null || activityI.isFinishing()) {
                Y.a.m("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(activityI);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(activityI);
            textView.setText(activityI.getString(AbstractC0465p.f9279e, k0()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String strH0 = h0();
            if (strH0 != null) {
                TextView textView2 = new TextView(activityI);
                textView2.setText(activityI.getString(AbstractC0465p.f9280f, strH0));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activityI).setCustomTitle(linearLayout).setAdapter(new e(activityI, R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0]), hashSet), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.C
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f6578b.x0(dVarArr, dialogInterface, i3);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.D
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f6593b.y0(dialogInterface);
                }
            }).create();
            this.f6612n = alertDialogCreate;
            alertDialogCreate.show();
            ReactContext reactContext = this.f6616r;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // p042k1.e
    public Pair y(Pair pair) {
        List list = this.f6596C;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                androidx.activity.result.d.a(it.next());
                throw null;
            }
        }
        return pair;
    }

    @Override // p042k1.e
    public void z(ReactContext reactContext) {
        if (reactContext == this.f6616r) {
            G0(null);
        }
        System.gc();
    }
}
