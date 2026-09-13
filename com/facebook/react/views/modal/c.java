package com.facebook.react.views.modal;

import D2.h;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.view.C0257n0;
import androidx.core.view.M0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.InterfaceC0425w0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.g;
import com.facebook.react.views.view.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.AbstractC0462m;
import p014d1.AbstractC0466q;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewGroup implements LifecycleEventListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f7717l = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f7718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DialogInterface.OnShowListener f7720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0113c f7721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f7726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7727k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends g implements InterfaceC0425w0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private A0 f7728t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private EventDispatcher f7729u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f7730v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f7731w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final S f7732x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Q f7733y;

        public static final class a extends GuardedRunnable {
            a(B0 b4) {
                super(b4);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(b.this.getId(), b.this.f7730v, b.this.f7731w);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            h.f(context, "context");
            this.f7732x = new S(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.f7733y = new Q(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final B0 getReactContext() {
            Context context = getContext();
            h.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (B0) context;
        }

        public final void I(int i3, int i4) {
            C0392f0 c0392f0 = C0392f0.f7477a;
            float fD = c0392f0.d(i3);
            float fD2 = c0392f0.d(i4);
            A0 a4 = this.f7728t;
            if (a4 == null) {
                getReactContext().runOnNativeModulesQueueThread(new a(getReactContext()));
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", fD);
            writableNativeMap.putDouble("screenHeight", fD2);
            a4.b(writableNativeMap);
        }

        @Override // com.facebook.react.uimanager.InterfaceC0425w0
        public void b(View view, MotionEvent motionEvent) {
            h.f(view, "childView");
            h.f(motionEvent, "ev");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null) {
                this.f7732x.e(motionEvent, eventDispatcher);
            }
            Q q3 = this.f7733y;
            if (q3 != null) {
                q3.o();
            }
        }

        @Override // com.facebook.react.uimanager.InterfaceC0425w0
        public void c(View view, MotionEvent motionEvent) {
            h.f(motionEvent, "ev");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null) {
                this.f7732x.f(motionEvent, eventDispatcher);
                Q q3 = this.f7733y;
                if (q3 != null) {
                    q3.p(view, motionEvent, eventDispatcher);
                }
            }
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.f7729u;
        }

        public final A0 getStateWrapper$ReactAndroid_release() {
            return this.f7728t;
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            Q q3;
            h.f(motionEvent, "event");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null && (q3 = this.f7733y) != null) {
                q3.k(motionEvent, eventDispatcher, false);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            h.f(accessibilityNodeInfo, "info");
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            String str = (String) getTag(AbstractC0462m.f9248t);
            if (str != null) {
                accessibilityNodeInfo.setViewIdResourceName(str);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            Q q3;
            h.f(motionEvent, "event");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null && (q3 = this.f7733y) != null) {
                q3.k(motionEvent, eventDispatcher, true);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            h.f(motionEvent, "event");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null) {
                this.f7732x.c(motionEvent, eventDispatcher, getReactContext());
                Q q3 = this.f7733y;
                if (q3 != null) {
                    q3.k(motionEvent, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        protected void onSizeChanged(int i3, int i4, int i5, int i6) {
            super.onSizeChanged(i3, i4, i5, i6);
            this.f7730v = i3;
            this.f7731w = i4;
            I(i3, i4);
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            h.f(motionEvent, "event");
            EventDispatcher eventDispatcher = this.f7729u;
            if (eventDispatcher != null) {
                this.f7732x.c(motionEvent, eventDispatcher, getReactContext());
                Q q3 = this.f7733y;
                if (q3 != null) {
                    q3.k(motionEvent, eventDispatcher, false);
                }
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z3) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.f7729u = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(A0 a4) {
            this.f7728t = a4;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.modal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0113c {
        void a(DialogInterface dialogInterface);
    }

    public static final class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
            h.f(dialogInterface, "dialog");
            h.f(keyEvent, "event");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i3 == 4 || i3 == 111) {
                InterfaceC0113c onRequestCloseListener = c.this.getOnRequestCloseListener();
                if (onRequestCloseListener == null) {
                    throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
                }
                onRequestCloseListener.a(dialogInterface);
                return true;
            }
            Context context = c.this.getContext();
            h.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i3, keyEvent);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B0 b4) {
        super(b4);
        h.f(b4, "context");
        this.f7726j = new b(b4);
    }

    private final void a() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f7718b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) V1.a.a(dialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                dialog.dismiss();
            }
            this.f7718b = null;
            this.f7727k = true;
            ViewParent parent = this.f7726j.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final boolean b(Activity activity) {
        return (activity == null || (activity.getWindow().getAttributes().flags & 8192) == 0) ? false : true;
    }

    private final void e(C0257n0 c0257n0, M0 m3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (c0257n0.o(iIntValue)) {
                if (m3 != null) {
                    m3.f(iIntValue);
                }
            } else if (m3 != null) {
                m3.a(iIntValue);
            }
        }
    }

    static /* synthetic */ void f(c cVar, C0257n0 c0257n0, M0 m3, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            list = AbstractC0492n.j(Integer.valueOf(C0257n0.m.d()), Integer.valueOf(C0257n0.m.c()));
        }
        cVar.e(c0257n0, m3, list);
    }

    private final void g() {
        Dialog dialog = this.f7718b;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & 1024) != 0) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
            }
            p.e(window, this.f7723g);
            if (!this.f7723g) {
                p.b(window, this.f7722f);
            }
            if (this.f7719c) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e4) {
            Y.a.o("ReactNative", "ReactModalHostView: error while setting window flags: ", e4.getMessage());
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f7726j);
        if (!this.f7722f) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        h.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((B0) context).getCurrentActivity();
    }

    private final void h() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Dialog dialog = this.f7718b;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        M0 m3 = new M0(window2, window2.getDecorView());
        M0 m4 = new M0(window, window.getDecorView());
        m4.d(m3.b());
        WindowInsets rootWindowInsets = window2.getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            C0257n0 c0257n0V = C0257n0.v(rootWindowInsets);
            h.e(c0257n0V, "toWindowInsetsCompat(...)");
            f(this, c0257n0V, m4, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList arrayList) {
        h.f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3) {
        UiThreadUtil.assertOnUiThread();
        this.f7726j.addView(view, i3);
    }

    public final void c() {
        Context context = getContext();
        h.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((B0) context).removeLifecycleEventListener(this);
        a();
    }

    public final void d() {
        int i3;
        Window window;
        Window window2;
        UiThreadUtil.assertOnUiThread();
        if (!this.f7727k) {
            g();
            return;
        }
        a();
        this.f7727k = false;
        String str = this.f7724h;
        if (h.b(str, "fade")) {
            i3 = AbstractC0466q.f9305e;
        } else {
            i3 = h.b(str, "slide") ? AbstractC0466q.f9306f : AbstractC0466q.f9304d;
        }
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i3);
        this.f7718b = dialog;
        Window window3 = dialog.getWindow();
        Objects.requireNonNull(window3);
        window3.setFlags(8, 8);
        dialog.setContentView(getContentView());
        g();
        dialog.setOnShowListener(this.f7720d);
        dialog.setOnKeyListener(new d());
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(16);
        }
        if (this.f7725i && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(16777216);
        }
        if (b(currentActivity) && (window = dialog.getWindow()) != null) {
            window.setFlags(8192, 8192);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        h();
        Window window5 = dialog.getWindow();
        if (window5 != null) {
            window5.clearFlags(8);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        h.f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        h.f(viewStructure, "structure");
        this.f7726j.dispatchProvideStructure(viewStructure);
    }

    public final String getAnimationType() {
        return this.f7724h;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i3) {
        return this.f7726j.getChildAt(i3);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f7726j.getChildCount();
    }

    public final Dialog getDialog() {
        return this.f7718b;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.f7726j.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.f7725i;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.f7723g;
    }

    public final InterfaceC0113c getOnRequestCloseListener() {
        return this.f7721e;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.f7720d;
    }

    public final A0 getStateWrapper() {
        return this.f7726j.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.f7722f;
    }

    public final boolean getTransparent() {
        return this.f7719c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        h.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((B0) context).addLifecycleEventListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
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
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f7726j.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i3) {
        UiThreadUtil.assertOnUiThread();
        this.f7726j.removeView(getChildAt(i3));
    }

    public final void setAnimationType(String str) {
        this.f7724h = str;
        this.f7727k = true;
    }

    public final void setDialogRootViewGroupTestId(String str) {
        this.f7726j.setTag(AbstractC0462m.f9248t, str);
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f7726j.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z3) {
        this.f7725i = z3;
        this.f7727k = true;
    }

    @Override // android.view.View
    public void setId(int i3) {
        super.setId(i3);
        this.f7726j.setId(i3);
    }

    public final void setNavigationBarTranslucent(boolean z3) {
        this.f7723g = z3;
        this.f7727k = true;
    }

    public final void setOnRequestCloseListener(InterfaceC0113c interfaceC0113c) {
        this.f7721e = interfaceC0113c;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f7720d = onShowListener;
    }

    public final void setStateWrapper(A0 a4) {
        this.f7726j.setStateWrapper$ReactAndroid_release(a4);
    }

    public final void setStatusBarTranslucent(boolean z3) {
        this.f7722f = z3;
        this.f7727k = true;
    }

    public final void setTransparent(boolean z3) {
        this.f7719c = z3;
    }
}
