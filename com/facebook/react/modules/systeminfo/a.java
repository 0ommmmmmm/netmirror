package com.facebook.react.modules.systeminfo;

import D2.h;
import D2.u;
import K2.o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import p014d1.AbstractC0463n;
import p071r2.n;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7048a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7049b = a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f7050c;

    private a() {
    }

    public static final String a(int i3) {
        return "adb reverse tcp:" + i3 + " tcp:" + i3;
    }

    public static final String b(Context context) {
        h.f(context, "context");
        return a(f7048a.c(context));
    }

    private final int c(Context context) {
        return context.getResources().getInteger(AbstractC0463n.f9255a);
    }

    public static final String d() {
        if (f7048a.j()) {
            String str = Build.MODEL;
            h.c(str);
            return str;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static final Map e(Context context) {
        String packageName;
        String string;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i3 = applicationInfo.labelRes;
            packageName = context.getPackageName();
            if (i3 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i3);
                h.c(string);
            }
        } else {
            packageName = null;
            string = null;
        }
        return D.h(n.a("appDisplayName", string), n.a("appIdentifier", packageName), n.a("platform", "android"), n.a("deviceName", Build.MODEL), n.a("reactNativeVersion", f7048a.g()));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    private final synchronized String f() {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        Exception e4;
        String str;
        String str2 = f7050c;
        if (str2 != null) {
            h.c(str2);
            return str2;
        }
        try {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
                    String str3 = "";
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str3 = line;
                        } catch (Exception e5) {
                            e4 = e5;
                            Y.a.J(f7049b, "Failed to query for metro.host prop:", e4);
                            f7050c = "";
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (processExec != null) {
                            }
                            str = f7050c;
                            if (str == null) {
                                str = "";
                            }
                            return str;
                        }
                    }
                    f7050c = str3;
                    bufferedReader.close();
                } catch (Exception e6) {
                    bufferedReader = null;
                    e4 = e6;
                } catch (Throwable th2) {
                    bufferedReader = null;
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                bufferedReader = null;
                e4 = e7;
                processExec = null;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                processExec = null;
            }
            processExec.destroy();
            str = f7050c;
            if (str == null) {
                str = "";
            }
            return str;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    private final String g() {
        String str;
        Map map = b.f7051a;
        Object obj = map.get("major");
        Object obj2 = map.get("minor");
        Object obj3 = map.get("patch");
        Object obj4 = map.get("prerelease");
        if (obj4 != null) {
            str = "-" + obj4;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        return obj + "." + obj2 + "." + obj3 + str;
    }

    public static final String h(Context context) {
        h.f(context, "context");
        a aVar = f7048a;
        return aVar.i(aVar.c(context));
    }

    private final String i(int i3) {
        String strF;
        if (f().length() > 0) {
            strF = f();
        } else if (j()) {
            strF = "10.0.3.2";
        } else {
            strF = k() ? "10.0.2.2" : "localhost";
        }
        u uVar = u.f192a;
        String str = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{strF, Integer.valueOf(i3)}, 2));
        h.e(str, "format(...)");
        return str;
    }

    private final boolean j() {
        String str = Build.FINGERPRINT;
        h.e(str, "FINGERPRINT");
        return o.E(str, "vbox", false, 2, null);
    }

    private final boolean k() {
        String str = Build.FINGERPRINT;
        h.e(str, "FINGERPRINT");
        if (!o.E(str, "generic", false, 2, null)) {
            h.e(str, "FINGERPRINT");
            if (!o.z(str, "google/sdk_gphone", false, 2, null)) {
                return false;
            }
        }
        return true;
    }
}
