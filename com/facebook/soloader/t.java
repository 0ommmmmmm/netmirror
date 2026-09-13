package com.facebook.soloader;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f8258a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f8259b = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f8261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f8262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f8263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f8264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f8265h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f8260c = 3 + 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f8266i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashSet f8267j = new a();

    class a extends HashSet {
        a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    private static String[] a(String str) {
        if (f8261d) {
            return i(str);
        }
        if (!f8265h) {
            return null;
        }
        f8266i.readLock().lock();
        try {
            return i(str);
        } finally {
            f8266i.readLock().unlock();
        }
    }

    public static String[] b(String str, h hVar) {
        boolean z3 = SoLoader.f8204a;
        if (z3) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        p007b2.b.b();
        try {
            try {
                String[] strArrA = a(str);
                if (strArrA != null) {
                    p007b2.b.a(null);
                    if (z3) {
                        Api18TraceUtils.b();
                    }
                    return strArrA;
                }
                String[] strArrA2 = s.a(hVar);
                p007b2.b.a(null);
                if (z3) {
                    Api18TraceUtils.b();
                }
                return strArrA2;
            } catch (s.a e4) {
                throw D.b(str, e4);
            } catch (Error e5) {
                e = e5;
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                throw e;
            }
        } catch (Throwable th) {
            p007b2.b.a(null);
            if (SoLoader.f8204a) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    private static String[] c(int i3, int i4) {
        byte b4;
        ArrayList arrayList = new ArrayList();
        int i5 = (i3 + i4) - f8260c;
        int i6 = 0;
        boolean z3 = false;
        while (true) {
            byte[] bArr = f8262e;
            if (i5 >= bArr.length || (b4 = bArr[i5]) == 10) {
                break;
            }
            if (b4 == 32) {
                if (z3) {
                    String strD = d(i6);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i6 = 0;
                    z3 = false;
                } else {
                    continue;
                }
            } else {
                if (b4 < 48 || b4 > 57) {
                    return null;
                }
                i6 = (i6 * 10) + (b4 - 48);
                z3 = true;
            }
            i5++;
        }
        if (z3) {
            String strD2 = d(i6);
            if (strD2 == null) {
                return null;
            }
            arrayList.add(strD2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String d(int i3) {
        if (i3 >= f8263f.size()) {
            return null;
        }
        int iIntValue = ((Integer) f8263f.get(i3)).intValue();
        int i4 = iIntValue;
        while (true) {
            byte[] bArr = f8262e;
            if (i4 >= bArr.length || bArr[i4] <= 32) {
                break;
            }
            i4++;
        }
        int i5 = (i4 - iIntValue) + f8260c;
        char[] cArr = new char[i5];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i6 = 0; i6 < i5 - f8260c; i6++) {
            cArr[f8258a + i6] = (char) f8262e[iIntValue + i6];
        }
        cArr[i5 - 3] = '.';
        cArr[i5 - 2] = 's';
        cArr[i5 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List list = (List) f8264g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int iCodePointAt = 5381;
        for (int i3 = f8258a; i3 < str.length() - f8259b; i3++) {
            iCodePointAt = str.codePointAt(i3) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean g(String str, int i3) {
        int i4;
        int i5 = f8258a;
        while (true) {
            int length = str.length();
            i4 = f8259b;
            if (i5 >= length - i4 || i3 >= f8262e.length || (str.codePointAt(i5) & 255) != f8262e[i3]) {
                break;
            }
            i5++;
            i3++;
        }
        return i5 == str.length() - i4;
    }

    public static void h(String str, h hVar, int i3, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrB = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrB));
        for (String str2 : strArrB) {
            if (!str2.startsWith("/") && !f8267j.contains(str2)) {
                SoLoader.s(str2, i3, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int iE;
        if (f8261d && str.length() > f8260c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
