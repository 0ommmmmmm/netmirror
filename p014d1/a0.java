package p014d1;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0412p0;
import com.facebook.react.uimanager.C0424w;
import com.facebook.react.uimanager.C0426x;
import com.facebook.react.uimanager.C0427x0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.InterfaceC0410o0;
import com.facebook.react.uimanager.InterfaceC0425w0;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends FrameLayout implements InterfaceC0425w0, InterfaceC0410o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J f9173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f9175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f9176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private S f9180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Q f9181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0472x f9182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicInteger f9191t;

    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f9192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9194d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9195e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9196f = 0;

        a() {
            C0426x.f(a0.this.getContext().getApplicationContext());
            this.f9192b = new Rect();
            this.f9193c = (int) C0392f0.h(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) a0.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f9196f == rotation) {
                return;
            }
            this.f9196f = rotation;
            C0426x.e(a0.this.getContext().getApplicationContext());
            f(rotation);
        }

        private void c() {
            boolean zIsVisible;
            a0.this.getRootView().getWindowVisibleDisplayFrame(this.f9192b);
            WindowInsets rootWindowInsets = a0.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null || (zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) == this.f9194d) {
                return;
            }
            this.f9194d = zIsVisible;
            if (!zIsVisible) {
                a0.this.r("keyboardDidHide", e(C0392f0.f(this.f9192b.height()), 0.0d, C0392f0.f(this.f9192b.width()), 0.0d));
                return;
            }
            int i3 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
            ViewGroup.LayoutParams layoutParams = a0.this.getRootView().getLayoutParams();
            p002a1.a.a(layoutParams instanceof WindowManager.LayoutParams);
            a0.this.r("keyboardDidShow", e(C0392f0.f(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.f9192b.bottom - i3 : this.f9192b.bottom), C0392f0.f(this.f9192b.left), C0392f0.f(this.f9192b.width()), C0392f0.f(i3)));
        }

        private void d() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            a0.this.getRootView().getWindowVisibleDisplayFrame(this.f9192b);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = a0.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i3 = C0426x.d().heightPixels;
            Rect rect = this.f9192b;
            int i4 = rect.bottom;
            int i5 = (i3 - i4) + safeInsetTop;
            int i6 = this.f9195e;
            if (i6 != i5 && i5 > this.f9193c) {
                this.f9195e = i5;
                this.f9194d = true;
                a0.this.r("keyboardDidShow", e(C0392f0.f(i4), C0392f0.f(this.f9192b.left), C0392f0.f(this.f9192b.width()), C0392f0.f(this.f9195e)));
            } else {
                if (i6 == 0 || i5 > this.f9193c) {
                    return;
                }
                this.f9195e = 0;
                this.f9194d = false;
                a0.this.r("keyboardDidHide", e(C0392f0.f(rect.height()), 0.0d, C0392f0.f(this.f9192b.width()), 0.0d));
            }
        }

        private WritableMap e(double d4, double d5, double d6, double d7) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d7);
            writableMapCreateMap2.putDouble("screenX", d5);
            writableMapCreateMap2.putDouble("width", d6);
            writableMapCreateMap2.putDouble("screenY", d4);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        private void f(int i3) {
            String str;
            double d4;
            boolean z3 = false;
            if (i3 != 0) {
                if (i3 == 1) {
                    str = "landscape-primary";
                    d4 = -90.0d;
                } else if (i3 == 2) {
                    str = "portrait-secondary";
                    d4 = 180.0d;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d4 = 90.0d;
                }
                z3 = true;
            } else {
                str = "portrait-primary";
                d4 = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d4);
            writableMapCreateMap.putBoolean("isLandscape", z3);
            a0.this.r("namedOrientationDidChange", writableMapCreateMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = a0.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (a0.this.i() && a0.this.o()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    public interface b {
    }

    public a0(Context context) {
        super(context);
        this.f9177f = 0;
        this.f9182k = new C0472x(this);
        this.f9183l = false;
        this.f9184m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9185n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9186o = 0;
        this.f9187p = 0;
        this.f9188q = Integer.MIN_VALUE;
        this.f9189r = Integer.MIN_VALUE;
        this.f9190s = 1;
        this.f9191t = new AtomicInteger(0);
        k();
    }

    private void e() {
        p015d2.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new P("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.f9178g) {
                return;
            }
            this.f9178g = true;
            ((J) p002a1.a.c(this.f9173b)).s(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            p015d2.a.i(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f9176e == null) {
            this.f9176e = new a();
        }
        return this.f9176e;
    }

    private void k() {
        setRootViewTag(C0412p0.a());
        setClipChildren(false);
    }

    private boolean l() {
        if (!i() || !o()) {
            Y.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        }
        if (this.f9180i == null) {
            Y.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.f9181j != null) {
            return true;
        }
        Y.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i3 = this.f9177f;
        return (i3 == 0 || i3 == -1) ? false : true;
    }

    private void q() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void s() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f9184m = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f9185n = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void w(boolean z3, int i3, int i4) {
        UIManager uIManagerG;
        int i5;
        int i6;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!j()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            Y.a.I("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean zM = m();
        if (zM && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            Y.a.m("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerG = H0.g(currentReactContext, getUIManagerType())) != null) {
            if (zM) {
                Point pointB = C0427x0.b(this);
                i5 = pointB.x;
                i6 = pointB.y;
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (z3 || i5 != this.f9188q || i6 != this.f9189r) {
                uIManagerG.updateRootLayoutSpecs(getRootViewTag(), i3, i4, i5, i6);
            }
            this.f9188q = i5;
            this.f9189r = i6;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public void a(int i3) {
        if (i3 != 101) {
            return;
        }
        p();
    }

    public void b(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherB;
        if (l() && (eventDispatcherB = H0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f9180i.e(motionEvent, eventDispatcherB);
            Q q3 = this.f9181j;
            if (q3 != null) {
                q3.o();
            }
        }
    }

    public void c(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherB;
        Q q3;
        if (l() && (eventDispatcherB = H0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f9180i.f(motionEvent, eventDispatcherB);
            if (view == null || (q3 = this.f9181j) == null) {
                return;
            }
            q3.p(view, motionEvent, eventDispatcherB);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public void d() {
        p015d2.a.c(0L, "ReactRootView.runApplication");
        try {
            if (j() && o()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f9183l) {
                    w(true, this.f9184m, this.f9185n);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f9179h = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            p015d2.a.i(0L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e4) {
            h(e4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (i() && o()) {
            this.f9182k.d(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        Y.a.I("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j3) {
        BlendMode blendModeA;
        if (Build.VERSION.SDK_INT >= 29 && M1.a.c(this) == 2 && C0424w.a(this)) {
            blendModeA = W.a(view.getTag(AbstractC0462m.f9246r));
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), paint);
            }
        } else {
            blendModeA = null;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j3);
        if (blendModeA != null) {
            canvas.restore();
        }
        return zDrawChild;
    }

    protected void f(MotionEvent motionEvent, boolean z3) {
        if (!i() || !o()) {
            Y.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f9181j == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                Y.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            }
        } else {
            EventDispatcher eventDispatcherB = H0.b(getCurrentReactContext(), getUIManagerType());
            if (eventDispatcherB != null) {
                this.f9181j.k(motionEvent, eventDispatcherB, z3);
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        p002a1.a.b(!this.f9178g, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    protected void g(MotionEvent motionEvent) {
        if (!i() || !o()) {
            Y.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f9180i == null) {
            Y.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return;
        }
        EventDispatcher eventDispatcherB = H0.b(getCurrentReactContext(), getUIManagerType());
        if (eventDispatcherB != null) {
            this.f9180i.c(motionEvent, eventDispatcherB, getCurrentReactContext());
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public Bundle getAppProperties() {
        return this.f9175d;
    }

    public ReactContext getCurrentReactContext() {
        J j3 = this.f9173b;
        if (j3 == null) {
            return null;
        }
        return j3.C();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public int getHeightMeasureSpec() {
        return this.f9185n;
    }

    public String getJSModuleName() {
        return (String) p002a1.a.c(this.f9174c);
    }

    public J getReactInstanceManager() {
        return this.f9173b;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public int getRootViewTag() {
        return this.f9177f;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public AtomicInteger getState() {
        return this.f9191t;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.f9190s;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public int getWidthMeasureSpec() {
        return this.f9184m;
    }

    public void h(Throwable th) {
        if (!i()) {
            throw new RuntimeException(th);
        }
        getCurrentReactContext().handleException(new P(th.getMessage(), this, th));
    }

    public boolean i() {
        J j3 = this.f9173b;
        return (j3 == null || j3.C() == null) ? false : true;
    }

    public boolean j() {
        return this.f9173b != null;
    }

    public boolean o() {
        return this.f9178g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            q();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (o()) {
            q();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z3, int i3, Rect rect) {
        if (i() && o()) {
            this.f9182k.a();
            super.onFocusChanged(z3, i3, rect);
        } else {
            Y.a.I("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z3, i3, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            g(motionEvent);
        }
        f(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        if (this.f9183l && m()) {
            w(false, this.f9184m, this.f9185n);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        int iMax;
        int iMax2;
        p015d2.a.c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z3 = (i3 == this.f9184m && i4 == this.f9185n) ? false : true;
            this.f9184m = i3;
            this.f9185n = i4;
            int mode = View.MeasureSpec.getMode(i3);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i3);
            }
            int mode2 = View.MeasureSpec.getMode(i4);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt2 = getChildAt(i6);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i4);
            }
            setMeasuredDimension(iMax, iMax2);
            this.f9183l = true;
            if (j() && !o()) {
                e();
            } else if (z3 || this.f9186o != iMax || this.f9187p != iMax2) {
                w(true, this.f9184m, this.f9185n);
            }
            this.f9186o = iMax;
            this.f9187p = iMax2;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            p015d2.a.i(0L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            g(motionEvent);
        }
        f(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f9179h) {
            this.f9179h = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f9177f);
        }
    }

    public void p() {
        this.f9180i = new S(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f9181j = new Q(this);
        }
    }

    void r(String str, WritableMap writableMap) {
        if (j()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (i() && o()) {
            this.f9182k.e(view2);
            super.requestChildFocus(view, view2);
        } else {
            Y.a.I("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z3);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f9175d = bundle;
        if (n()) {
            d();
        }
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z3) {
        this.f9190s = z3 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public void setRootViewTag(int i3) {
        this.f9177f = i3;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0410o0
    public void setShouldLogContentAppeared(boolean z3) {
        this.f9179h = z3;
    }

    public boolean t(MotionEvent motionEvent) {
        return true;
    }

    public void u(J j3, String str, Bundle bundle) {
        p015d2.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            p002a1.a.b(this.f9173b == null, "This root view has already been attached to a catalyst instance manager");
            this.f9173b = j3;
            this.f9174c = str;
            this.f9175d = bundle;
            j3.y();
            if (p070r1.b.d()) {
                if (!this.f9183l) {
                    s();
                }
                e();
            }
        } finally {
            p015d2.a.i(0L);
        }
    }

    public void v() {
        UiThreadUtil.assertOnUiThread();
        J j3 = this.f9173b;
        if (j3 != null && this.f9178g) {
            j3.A(this);
            this.f9178g = false;
        }
        this.f9173b = null;
        this.f9179h = false;
    }

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9177f = 0;
        this.f9182k = new C0472x(this);
        this.f9183l = false;
        this.f9184m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9185n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9186o = 0;
        this.f9187p = 0;
        this.f9188q = Integer.MIN_VALUE;
        this.f9189r = Integer.MIN_VALUE;
        this.f9190s = 1;
        this.f9191t = new AtomicInteger(0);
        k();
    }

    public a0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f9177f = 0;
        this.f9182k = new C0472x(this);
        this.f9183l = false;
        this.f9184m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9185n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9186o = 0;
        this.f9187p = 0;
        this.f9188q = Integer.MIN_VALUE;
        this.f9189r = Integer.MIN_VALUE;
        this.f9190s = 1;
        this.f9191t = new AtomicInteger(0);
        k();
    }
}
