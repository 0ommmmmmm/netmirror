package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: renamed from: com.facebook.react.devsupport.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0334d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f6690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactContext f6691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f6692c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6693b;

        a(boolean z3) {
            this.f6693b = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f6693b || C0334d.this.f6692c != null) {
                if (this.f6693b || C0334d.this.f6692c == null) {
                    return;
                }
                C0334d.this.f6692c.removeAllViews();
                C0334d.this.f6690a.removeView(C0334d.this.f6692c);
                C0334d.this.f6692c = null;
                return;
            }
            if (!C0334d.g(C0334d.this.f6691b)) {
                Y.a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            }
            C0334d.this.f6692c = new L(C0334d.this.f6691b);
            C0334d.this.f6690a.addView(C0334d.this.f6692c, new WindowManager.LayoutParams(-1, -1, n0.f6776b, 24, -3));
        }
    }

    public C0334d(ReactContext reactContext) {
        this.f6691b = reactContext;
        this.f6690a = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean f(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        Y.a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (f(context, intent)) {
            context.startActivity(intent);
        }
    }

    public void i(boolean z3) {
        UiThreadUtil.runOnUiThread(new a(z3));
    }
}
