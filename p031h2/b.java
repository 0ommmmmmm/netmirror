package p031h2;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.a;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9487a;

    public b(Context context) {
        this.f9487a = context;
    }

    private a b() {
        WindowManager windowManager = (WindowManager) this.f9487a.getSystemService("window");
        if (windowManager == null) {
            return a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        if (dSqrt < 3.0d || dSqrt > 6.9d) {
            return (dSqrt <= 6.9d || dSqrt > 18.0d) ? a.UNKNOWN : a.TABLET;
        }
        return a.HANDSET;
    }

    private a c() {
        int i3 = this.f9487a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i3 == 0) {
            return a.UNKNOWN;
        }
        return i3 >= 600 ? a.TABLET : a.HANDSET;
    }

    public a a() {
        if (this.f9487a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f9487a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return a.TV;
        }
        a aVarC = c();
        return (aVarC == null || aVarC == a.UNKNOWN) ? b() : aVarC;
    }

    public boolean d() {
        return a() == a.TABLET;
    }
}
