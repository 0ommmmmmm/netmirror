package p039j2;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import p043k2.a;
import p043k2.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f9551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WifiManager f9552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TelephonyManager f9553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReactApplicationContext f9554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9555e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f9556f = b.UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f9557g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9558h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f9559i;

    d(ReactApplicationContext reactApplicationContext) {
        this.f9554d = reactApplicationContext;
        this.f9551a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f9552b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f9553c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private WritableMap b(String str) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        WritableMap writableMapCreateMap = Arguments.createMap();
        str.hashCode();
        switch (str) {
            case "ethernet":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                                writableMapCreateMap.putString("ipAddress", inetAddressNextElement.getHostAddress());
                                writableMapCreateMap.putString("subnet", f(inetAddressNextElement));
                                return writableMapCreateMap;
                            }
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                return writableMapCreateMap;
            case "cellular":
                a aVar = this.f9557g;
                if (aVar != null) {
                    writableMapCreateMap.putString("cellularGeneration", aVar.f9599b);
                }
                String networkOperatorName = this.f9553c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    writableMapCreateMap.putString("carrier", networkOperatorName);
                }
                return writableMapCreateMap;
            case "wifi":
                if (f.b(e()) && (wifiManager = this.f9552b) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            writableMapCreateMap.putString("ssid", ssid.replace("\"", ""));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            writableMapCreateMap.putString("bssid", bssid);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        writableMapCreateMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                        break;
                    } catch (Exception unused3) {
                    }
                    try {
                        writableMapCreateMap.putInt("frequency", connectionInfo.getFrequency());
                        break;
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        f.c(byteArray);
                        writableMapCreateMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                        break;
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        f.c(byteArray2);
                        writableMapCreateMap.putString("subnet", f(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                    }
                    try {
                        writableMapCreateMap.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                        break;
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("rxLinkSpeed", connectionInfo.getRxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("txLinkSpeed", connectionInfo.getTxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused9) {
                    }
                }
                return writableMapCreateMap;
            default:
                return writableMapCreateMap;
        }
    }

    private static String f(InetAddress inetAddress) {
        short networkPrefixLength;
        for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
            if (interfaceAddress.getAddress().getAddress().length == 4) {
                networkPrefixLength = interfaceAddress.getNetworkPrefixLength();
                int i3 = (-1) << (32 - networkPrefixLength);
                return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i3 >> 24) & 255), Integer.valueOf((i3 >> 16) & 255), Integer.valueOf((i3 >> 8) & 255), Integer.valueOf(i3 & 255));
            }
        }
        networkPrefixLength = 0;
        int i4 = (-1) << (32 - networkPrefixLength);
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i4 >> 24) & 255), Integer.valueOf((i4 >> 16) & 255), Integer.valueOf((i4 >> 8) & 255), Integer.valueOf(i4 & 255));
    }

    protected WritableMap a(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        boolean z3 = false;
        if (f.b(e())) {
            WifiManager wifiManager = this.f9552b;
            writableMapCreateMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        writableMapCreateMap.putString("type", str != null ? str : this.f9556f.f9609b);
        boolean z4 = (this.f9556f.equals(b.NONE) || this.f9556f.equals(b.UNKNOWN)) ? false : true;
        writableMapCreateMap.putBoolean("isConnected", z4);
        if (this.f9558h && (str == null || str.equals(this.f9556f.f9609b))) {
            z3 = true;
        }
        writableMapCreateMap.putBoolean("isInternetReachable", z3);
        if (str == null) {
            str = this.f9556f.f9609b;
        }
        WritableMap writableMapB = b(str);
        if (z4) {
            writableMapB.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        writableMapCreateMap.putMap("details", writableMapB);
        return writableMapCreateMap;
    }

    ConnectivityManager c() {
        return this.f9551a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    ReactApplicationContext e() {
        return this.f9554d;
    }

    public abstract void g();

    protected void h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    public void i(boolean z3) {
        this.f9559i = Boolean.valueOf(z3);
        k(this.f9556f, this.f9557g, this.f9558h);
    }

    public abstract void j();

    void k(b bVar, a aVar, boolean z3) {
        Boolean bool = this.f9559i;
        if (bool != null) {
            z3 = bool.booleanValue();
        }
        boolean z4 = bVar != this.f9556f;
        boolean z5 = aVar != this.f9557g;
        boolean z6 = z3 != this.f9558h;
        if (z4 || z5 || z6) {
            this.f9556f = bVar;
            this.f9557g = aVar;
            this.f9558h = z3;
            if (this.f9555e) {
                h();
            }
        }
    }
}
