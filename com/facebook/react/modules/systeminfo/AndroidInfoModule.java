package com.facebook.react.modules.systeminfo;

import D2.h;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = NativePlatformConstantsAndroidSpec.NAME)
public final class AndroidInfoModule extends NativePlatformConstantsAndroidSpec {
    private static final a Companion = new a(null);
    private static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";
    private static final String IS_TESTING = "IS_TESTING";

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        h.f(reactApplicationContext, "reactContext");
    }

    private final boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final String uiMode() {
        Object systemService = getReactApplicationContext().getSystemService("uimode");
        h.d(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int currentModeType = ((UiModeManager) systemService).getCurrentModeType();
        if (currentModeType == 1) {
            return "normal";
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType != 6) {
            return currentModeType != 7 ? "unknown" : "vrheadset";
        }
        return "watch";
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
        h.e(string, "getString(...)");
        return string;
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("Release", Build.VERSION.RELEASE);
        linkedHashMap.put("Serial", Build.SERIAL);
        linkedHashMap.put("Fingerprint", Build.FINGERPRINT);
        linkedHashMap.put("Model", Build.MODEL);
        linkedHashMap.put("Manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("Brand", Build.BRAND);
        if (p026g1.a.f9424b) {
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            h.e(applicationContext, "getApplicationContext(...)");
            linkedHashMap.put("ServerHost", com.facebook.react.modules.systeminfo.a.h(applicationContext));
        }
        linkedHashMap.put("isTesting", Boolean.valueOf(h.b("true", System.getProperty(IS_TESTING)) || isRunningScreenshotTest()));
        String property = System.getProperty(IS_DISABLE_ANIMATIONS);
        if (property != null) {
            linkedHashMap.put("isDisableAnimations", Boolean.valueOf(h.b("true", property)));
        }
        linkedHashMap.put("reactNativeVersion", b.f7051a);
        linkedHashMap.put("uiMode", uiMode());
        return linkedHashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }
}
