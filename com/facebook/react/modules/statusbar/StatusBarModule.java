package com.facebook.react.modules.statusbar;

import D2.h;
import D2.u;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.C0257n0;
import androidx.core.view.Z;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.views.view.p;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.n;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "StatusBarManager")
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final a Companion = new a(null);
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends GuardedRunnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, boolean z3, int i3, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f7038b = activity;
            this.f7039c = z3;
            this.f7040d = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Activity activity, ValueAnimator valueAnimator) {
            h.f(valueAnimator, "animator");
            Window window = activity.getWindow();
            if (window != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                h.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                window.setStatusBarColor(((Integer) animatedValue).intValue());
            }
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f7038b.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.f7039c) {
                window.setStatusBarColor(this.f7040d);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.f7040d));
            final Activity activity = this.f7038b;
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.b.b(activity, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z3, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f7041b = activity;
            this.f7042c = z3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f7041b.getWindow();
            if (window != null) {
                p.b(window, this.f7042c);
            }
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        C0257n0 c0257n0Y;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (c0257n0Y = Z.y(decorView)) == null) {
            return 0.0f;
        }
        return c0257n0Y.f(C0257n0.m.d() | C0257n0.m.c() | C0257n0.m.a()).f4473b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z3) {
        Window window = activity.getWindow();
        if (window != null) {
            p.d(window, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            h.e(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(h.b("dark-content", str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (h.b("dark-content", str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            str = "black";
        } else {
            int statusBarColor = window.getStatusBarColor();
            u uVar = u.f192a;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            h.e(str, "format(...)");
        }
        return D.h(n.a(HEIGHT_KEY, Float.valueOf(C0392f0.f(getStatusBarHeightPx()))), n.a(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d4, boolean z3) {
        int i3 = (int) d4;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Y.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, z3, i3, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean z3) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Y.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, z3);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Y.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.b
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, str);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z3) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Y.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, z3, getReactApplicationContext()));
        }
    }
}
