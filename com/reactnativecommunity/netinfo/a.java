package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import p039j2.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0120a f8449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f8450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f8451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8452f = false;

    /* JADX INFO: renamed from: com.reactnativecommunity.netinfo.a$a, reason: collision with other inner class name */
    public interface InterfaceC0120a {
        void onAmazonFireDeviceConnectivityChanged(boolean z3);
    }

    private class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f8452f) {
                a.this.f8448b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f8451e.postDelayed(a.this.f8450d, 10000L);
            }
        }

        private b() {
        }
    }

    private class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f8455b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z3;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z3 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z3 = true;
            }
            Boolean bool = this.f8455b;
            if (bool == null || bool.booleanValue() != z3) {
                this.f8455b = Boolean.valueOf(z3);
                a.this.f8449c.onAmazonFireDeviceConnectivityChanged(z3);
            }
        }

        private c() {
            this.f8454a = false;
        }
    }

    a(Context context, InterfaceC0120a interfaceC0120a) {
        this.f8447a = new c();
        this.f8450d = new b();
        this.f8448b = context;
        this.f8449c = interfaceC0120a;
    }

    private boolean f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        if (this.f8447a.f8454a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        f.a(this.f8448b, this.f8447a, intentFilter, false);
        this.f8447a.f8454a = true;
    }

    private void i() {
        if (this.f8452f) {
            return;
        }
        Handler handler = new Handler();
        this.f8451e = handler;
        this.f8452f = true;
        handler.post(this.f8450d);
    }

    private void j() {
        if (this.f8452f) {
            this.f8452f = false;
            this.f8451e.removeCallbacksAndMessages(null);
            this.f8451e = null;
        }
    }

    private void l() {
        c cVar = this.f8447a;
        if (cVar.f8454a) {
            this.f8448b.unregisterReceiver(cVar);
            this.f8447a.f8454a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
