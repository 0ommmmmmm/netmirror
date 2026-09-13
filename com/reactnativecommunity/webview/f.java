package com.reactnativecommunity.webview;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.H0;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends WebView implements LifecycleEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f8476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f8477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f8478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected M.f.a f8479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f8480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f8481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f8482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f8483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected RNCWebViewMessagingModule f8484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected i f8485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f8486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.facebook.react.views.scroll.c f8487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f8488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f8489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected d f8490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected List f8491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    WebChromeClient f8492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f8493s;

    class a extends ActionMode.Callback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f8494a;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.f$a$a, reason: collision with other inner class name */
        class C0121a implements ValueCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MenuItem f8496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WritableMap f8497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActionMode f8498c;

            C0121a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f8496a = menuItem;
                this.f8497b = writableMap;
                this.f8498c = actionMode;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String string;
                Map map = (Map) f.this.f8491q.get(this.f8496a.getItemId());
                this.f8497b.putString("label", (String) map.get("label"));
                this.f8497b.putString("key", (String) map.get("key"));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                this.f8497b.putString("selectedText", string);
                f fVar = f.this;
                fVar.g(fVar, new p047l2.a(r.a(f.this), this.f8497b));
                this.f8498c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f8494a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            f.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0121a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i3 = 0; i3 < f.this.f8491q.size(); i3++) {
                menu.add(0, i3, i3, (CharSequence) ((Map) f.this.f8491q.get(i3)).get("label"));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f8494a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements M.f.a {
        b() {
        }

        @Override // M.f.a
        public void a(WebView webView, M.b bVar, Uri uri, boolean z3, M.a aVar) {
            f.this.j(bVar.a(), uri.toString());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f8501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8503d;

        c(WebView webView, String str, String str2) {
            this.f8501b = webView;
            this.f8502c = str;
            this.f8503d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = f.this.f8485k;
            if (iVar == null) {
                return;
            }
            WritableMap writableMapA = iVar.a(this.f8501b, this.f8502c);
            writableMapA.putString("data", this.f8503d);
            f fVar = f.this;
            if (fVar.f8484j != null) {
                fVar.e(writableMapA);
            } else {
                fVar.g(this.f8501b, new p047l2.g(r.a(this.f8501b), writableMapA));
            }
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8505a = false;

        protected d() {
        }

        public boolean a() {
            return this.f8505a;
        }

        public void b(boolean z3) {
            this.f8505a = z3;
        }
    }

    protected class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8506a = "RNCWebViewBridge";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f8507b;

        e(f fVar) {
            this.f8507b = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            f fVar = this.f8507b;
            fVar.j(str, fVar.getUrl());
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            if (this.f8507b.getMessagingEnabled()) {
                this.f8507b.post(new Runnable() { // from class: com.reactnativecommunity.webview.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8509b.b(str);
                    }
                });
            } else {
                Y.a.I(this.f8506a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public f(B0 b4) {
        super(b4);
        this.f8479e = null;
        this.f8480f = true;
        this.f8481g = true;
        this.f8482h = false;
        this.f8486l = false;
        this.f8488n = false;
        this.f8489o = false;
        this.f8493s = null;
        this.f8484j = (RNCWebViewMessagingModule) ((B0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class);
        this.f8490p = new d();
    }

    private void i() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.f8493s == null) {
                str = null;
            } else {
                str = "`" + this.f8493s + "`";
            }
            sb.append(str);
            sb.append("; };\n})();");
            h(sb.toString());
        }
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f8476b) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f8476b + ";\n})();");
        i();
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f8477c) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f8477c + ";\n})();");
        i();
    }

    protected void c() {
        setWebViewClient(null);
        destroy();
    }

    protected void d(f fVar) {
        if (M.g.a("WEB_MESSAGE_LISTENER")) {
            if (this.f8479e == null) {
                this.f8479e = new b();
                M.f.a(fVar, "ReactNativeWebView", com.reactnativecommunity.webview.e.a(new Object[]{"*"}), this.f8479e);
            }
        } else if (this.f8478d == null) {
            e eVar = new e(fVar);
            this.f8478d = eVar;
            addJavascriptInterface(eVar, "ReactNativeWebView");
        }
        i();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f8492r;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f8483i);
        this.f8484j.onMessage(writableNativeMap);
    }

    protected boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f8483i);
        this.f8484j.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void g(WebView webView, P1.d dVar) {
        H0.c(getThemedReactContext(), r.a(webView)).b(dVar);
    }

    public boolean getMessagingEnabled() {
        return this.f8482h;
    }

    public i getRNCWebViewClient() {
        return this.f8485k;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public B0 getThemedReactContext() {
        return (B0) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f8492r;
    }

    protected void h(String str) {
        evaluateJavascript(str, null);
    }

    public void j(String str, String str2) {
        getThemedReactContext();
        if (this.f8485k != null) {
            post(new c(this, str2, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.f8484j != null) {
            e(writableMapCreateMap);
        } else {
            g(this, new p047l2.g(r.a(this), writableMapCreateMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
        if (this.f8488n) {
            if (this.f8487m == null) {
                this.f8487m = new com.facebook.react.views.scroll.c();
            }
            if (this.f8487m.c(i3, i4)) {
                g(this, com.facebook.react.views.scroll.k.y(r.a(this), com.facebook.react.views.scroll.l.SCROLL, i3, i4, this.f8487m.a(), this.f8487m.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (this.f8486l) {
            g(this, new P1.c(r.a(this), i3, i4));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8489o) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f8485k.c(aVar);
    }

    public void setHasScrollEvent(boolean z3) {
        this.f8488n = z3;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.f8485k.d(str);
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f8493s = str;
        i();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f8491q = list;
    }

    public void setMessagingEnabled(boolean z3) {
        if (this.f8482h == z3) {
            return;
        }
        this.f8482h = z3;
        if (z3) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z3) {
        this.f8489o = z3;
    }

    public void setSendContentSizeChangeEvents(boolean z3) {
        this.f8486l = z3;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f8492r = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f8490p);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof i) {
            i iVar = (i) webViewClient;
            this.f8485k = iVar;
            iVar.e(this.f8490p);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        return this.f8491q == null ? super.startActionMode(callback, i3) : super.startActionMode(new a(callback), i3);
    }
}
