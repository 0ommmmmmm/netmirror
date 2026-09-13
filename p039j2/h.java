package p039j2;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import p043k2.b;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f9561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Network f9562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private NetworkCapabilities f9563l;

    private class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            h.this.f9562k = network;
            h.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.this.f9562k = network;
            h.this.f9563l = networkCapabilities;
            h.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (h.this.f9562k != null) {
                h.this.f9562k = network;
            }
            h.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i3) {
            h.this.f9562k = network;
            h.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            h.this.f9562k = null;
            h.this.f9563l = null;
            h.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            h.this.f9562k = null;
            h.this.f9563l = null;
            h.this.s();
        }

        private a() {
        }
    }

    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f9562k = null;
        this.f9563l = null;
        this.f9561j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i3) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: j2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9560b.r();
            }
        }, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        try {
            this.f9563l = c().getNetworkCapabilities(this.f9562k);
            s();
        } catch (SecurityException unused) {
        }
    }

    @Override // p039j2.d
    public void g() {
        try {
            this.f9562k = c().getActiveNetwork();
            q(0);
            c().registerDefaultNetworkCallback(this.f9561j);
        } catch (SecurityException unused) {
        }
    }

    @Override // p039j2.d
    public void j() {
        try {
            c().unregisterNetworkCallback(this.f9561j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    void s() {
        NetworkInfo networkInfo;
        boolean z3;
        b bVar = b.UNKNOWN;
        Network network = this.f9562k;
        NetworkCapabilities networkCapabilities = this.f9563l;
        p043k2.a aVarB = null;
        boolean z4 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = b.VPN;
            }
            if (network != null) {
                try {
                    networkInfo = c().getNetworkInfo(network);
                } catch (SecurityException unused) {
                    networkInfo = null;
                }
            } else {
                networkInfo = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = !networkCapabilities.hasCapability(21);
            } else {
                z3 = (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            boolean z5 = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z3;
            if (!networkCapabilities.hasTransport(4)) {
                z4 = z5;
            } else if (z5 && networkCapabilities.getLinkDownstreamBandwidthKbps() != 0) {
                z4 = true;
            }
            if (network != null && bVar == b.CELLULAR && z4) {
                aVarB = p043k2.a.b(networkInfo);
            }
        } else {
            bVar = b.NONE;
        }
        k(bVar, aVarB, z4);
    }
}
