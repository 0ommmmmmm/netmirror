package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class M0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f7259A = "M0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0384b0 f7261b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f7264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactApplicationContext f7265f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private N1.a f7270k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f7275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f7279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f7281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f7283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f7284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f7285z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f7260a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7262c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7263d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f7266g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f7267h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f7268i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque f7269j = new ArrayDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7271l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7272m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7273n = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f7287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayDeque f7288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f7289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f7290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f7291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f7292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f7293i;

        a(int i3, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j3, long j4, long j5, long j6) {
            this.f7286b = i3;
            this.f7287c = arrayList;
            this.f7288d = arrayDeque;
            this.f7289e = arrayList2;
            this.f7290f = j3;
            this.f7291g = j4;
            this.f7292h = j5;
            this.f7293i = j6;
        }

        @Override // java.lang.Runnable
        public void run() {
            p015d2.b.a(0L, "DispatchUI").a("BatchId", this.f7286b).c();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<g> arrayList = this.f7287c;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            try {
                                gVar.c();
                            } catch (RetryableMountingLayerException e4) {
                                if (gVar.b() == 0) {
                                    gVar.d();
                                    M0.this.f7266g.add(gVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(M0.f7259A, new ReactNoCrashSoftException(e4));
                                }
                            } catch (Throwable th) {
                                ReactSoftExceptionLogger.logSoftException(M0.f7259A, th);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f7288d;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).a();
                        }
                    }
                    ArrayList arrayList2 = this.f7289e;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).a();
                        }
                    }
                    if (M0.this.f7273n && M0.this.f7275p == 0) {
                        M0.this.f7275p = this.f7290f;
                        M0.this.f7276q = SystemClock.uptimeMillis();
                        M0.this.f7277r = this.f7291g;
                        M0.this.f7278s = this.f7292h;
                        M0.this.f7279t = jUptimeMillis;
                        M0 m3 = M0.this;
                        m3.f7280u = m3.f7276q;
                        M0.this.f7283x = this.f7293i;
                        p015d2.a.b(0L, "delayBeforeDispatchViewUpdates", 0, M0.this.f7275p * 1000000);
                        p015d2.a.h(0L, "delayBeforeDispatchViewUpdates", 0, M0.this.f7278s * 1000000);
                        p015d2.a.b(0L, "delayBeforeBatchRunStart", 0, M0.this.f7278s * 1000000);
                        p015d2.a.h(0L, "delayBeforeBatchRunStart", 0, M0.this.f7279t * 1000000);
                    }
                    M0.this.f7261b.f();
                    if (M0.this.f7270k != null) {
                        M0.this.f7270k.b();
                    }
                    p015d2.a.i(0L);
                } catch (Exception e5) {
                    M0.this.f7272m = true;
                    throw e5;
                }
            } catch (Throwable th2) {
                p015d2.a.i(0L);
                throw th2;
            }
        }
    }

    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            M0.this.R();
        }
    }

    private final class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f7298e;

        public c(int i3, int i4, boolean z3, boolean z4) {
            super(i3);
            this.f7296c = i4;
            this.f7298e = z3;
            this.f7297d = z4;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            if (this.f7298e) {
                M0.this.f7261b.e();
            } else {
                M0.this.f7261b.y(this.f7350a, this.f7296c, this.f7297d);
            }
        }
    }

    private class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReadableMap f7300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f7301b;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.h(this.f7300a, this.f7301b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f7300a = readableMap;
            this.f7301b = callback;
        }
    }

    private final class e extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final B0 f7303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f7304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0417s0 f7305e;

        public e(B0 b4, int i3, String str, C0417s0 c0417s0) {
            super(i3);
            this.f7303c = b4;
            this.f7304d = str;
            this.f7305e = c0417s0;
            p015d2.a.l(0L, "createView", this.f7350a);
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            p015d2.a.f(0L, "createView", this.f7350a);
            M0.this.f7261b.j(this.f7303c, this.f7350a, this.f7304d, this.f7305e);
        }
    }

    private final class f extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f7308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7309e;

        public f(int i3, int i4, ReadableArray readableArray) {
            super(i3);
            this.f7309e = 0;
            this.f7307c = i4;
            this.f7308d = readableArray;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.k(this.f7350a, this.f7307c, this.f7308d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(M0.f7259A, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.M0.g
        public int b() {
            return this.f7309e;
        }

        @Override // com.facebook.react.uimanager.M0.g
        public void c() {
            M0.this.f7261b.k(this.f7350a, this.f7307c, this.f7308d);
        }

        @Override // com.facebook.react.uimanager.M0.g
        public void d() {
            this.f7309e++;
        }
    }

    private interface g {
        int b();

        void c();

        void d();
    }

    private final class h extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f7311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f7312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7313e;

        public h(int i3, String str, ReadableArray readableArray) {
            super(i3);
            this.f7313e = 0;
            this.f7311c = str;
            this.f7312d = readableArray;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.l(this.f7350a, this.f7311c, this.f7312d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(M0.f7259A, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.M0.g
        public int b() {
            return this.f7313e;
        }

        @Override // com.facebook.react.uimanager.M0.g
        public void c() {
            M0.this.f7261b.l(this.f7350a, this.f7311c, this.f7312d);
        }

        @Override // com.facebook.react.uimanager.M0.g
        public void d() {
            this.f7313e++;
        }
    }

    private class i extends M {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7315b;

        private void b(long j3) throws Exception {
            r rVar;
            while (16 - ((System.nanoTime() - j3) / 1000000) >= this.f7315b) {
                synchronized (M0.this.f7263d) {
                    try {
                        if (M0.this.f7269j.isEmpty()) {
                            return;
                        } else {
                            rVar = (r) M0.this.f7269j.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    rVar.a();
                    M0.this.f7274o += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e4) {
                    M0.this.f7272m = true;
                    throw e4;
                }
            }
        }

        @Override // com.facebook.react.uimanager.M
        public void a(long j3) {
            if (M0.this.f7272m) {
                Y.a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            p015d2.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                b(j3);
                p015d2.a.i(0L);
                M0.this.R();
                com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.DISPATCH_UI, this);
            } catch (Throwable th) {
                p015d2.a.i(0L);
                throw th;
            }
        }

        private i(ReactContext reactContext, int i3) {
            super(reactContext);
            this.f7315b = i3;
        }
    }

    private final class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f7318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f7319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callback f7320d;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.s(this.f7317a, M0.this.f7260a);
                float f3 = M0.this.f7260a[0];
                float f4 = M0.this.f7260a[1];
                int iN = M0.this.f7261b.n(this.f7317a, this.f7318b, this.f7319c);
                try {
                    M0.this.f7261b.s(iN, M0.this.f7260a);
                    this.f7320d.invoke(Integer.valueOf(iN), Float.valueOf(C0392f0.f(M0.this.f7260a[0] - f3)), Float.valueOf(C0392f0.f(M0.this.f7260a[1] - f4)), Float.valueOf(C0392f0.f(M0.this.f7260a[2])), Float.valueOf(C0392f0.f(M0.this.f7260a[3])));
                } catch (P unused) {
                    this.f7320d.invoke(new Object[0]);
                }
            } catch (P unused2) {
                this.f7320d.invoke(new Object[0]);
            }
        }

        private j(int i3, float f3, float f4, Callback callback) {
            this.f7317a = i3;
            this.f7318b = f3;
            this.f7319c = f4;
            this.f7320d = callback;
        }
    }

    private final class k extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f7322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final O0[] f7323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f7324e;

        public k(int i3, int[] iArr, O0[] o0Arr, int[] iArr2) {
            super(i3);
            this.f7322c = iArr;
            this.f7323d = o0Arr;
            this.f7324e = iArr2;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.q(this.f7350a, this.f7322c, this.f7323d, this.f7324e);
        }
    }

    private final class l implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f7327b;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.t(this.f7326a, M0.this.f7260a);
                this.f7327b.invoke(Float.valueOf(C0392f0.f(M0.this.f7260a[0])), Float.valueOf(C0392f0.f(M0.this.f7260a[1])), Float.valueOf(C0392f0.f(M0.this.f7260a[2])), Float.valueOf(C0392f0.f(M0.this.f7260a[3])));
            } catch (C0388d0 unused) {
                this.f7327b.invoke(new Object[0]);
            }
        }

        private l(int i3, Callback callback) {
            this.f7326a = i3;
            this.f7327b = callback;
        }
    }

    private final class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f7330b;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.s(this.f7329a, M0.this.f7260a);
                this.f7330b.invoke(0, 0, Float.valueOf(C0392f0.f(M0.this.f7260a[2])), Float.valueOf(C0392f0.f(M0.this.f7260a[3])), Float.valueOf(C0392f0.f(M0.this.f7260a[0])), Float.valueOf(C0392f0.f(M0.this.f7260a[1])));
            } catch (C0388d0 unused) {
                this.f7330b.invoke(new Object[0]);
            }
        }

        private m(int i3, Callback callback) {
            this.f7329a = i3;
            this.f7330b = callback;
        }
    }

    private final class n extends v {
        public n(int i3) {
            super(i3);
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.u(this.f7350a);
        }
    }

    private final class o extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7333c;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            try {
                M0.this.f7261b.x(this.f7350a, this.f7333c);
            } catch (RetryableMountingLayerException e4) {
                ReactSoftExceptionLogger.logSoftException(M0.f7259A, e4);
            }
        }

        private o(int i3, int i4) {
            super(i3);
            this.f7333c = i4;
        }
    }

    private class p implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f7335a;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.z(this.f7335a);
        }

        private p(boolean z3) {
            this.f7335a = z3;
        }
    }

    private class q implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F0 f7337a;

        public q(F0 f3) {
            this.f7337a = f3;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            this.f7337a.a(M0.this.f7261b);
        }
    }

    public interface r {
        void a();
    }

    private final class s extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f7340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.facebook.yoga.h f7344h;

        public s(int i3, int i4, int i5, int i6, int i7, int i8, com.facebook.yoga.h hVar) {
            super(i4);
            this.f7339c = i3;
            this.f7340d = i5;
            this.f7341e = i6;
            this.f7342f = i7;
            this.f7343g = i8;
            this.f7344h = hVar;
            p015d2.a.l(0L, "updateLayout", this.f7350a);
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            p015d2.a.f(0L, "updateLayout", this.f7350a);
            M0.this.f7261b.A(this.f7339c, this.f7350a, this.f7340d, this.f7341e, this.f7342f, this.f7343g, this.f7344h);
        }
    }

    private final class t extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0417s0 f7346c;

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.C(this.f7350a, this.f7346c);
        }

        private t(int i3, C0417s0 c0417s0) {
            super(i3);
            this.f7346c = c0417s0;
        }
    }

    private final class u extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f7348c;

        public u(int i3, Object obj) {
            super(i3);
            this.f7348c = obj;
        }

        @Override // com.facebook.react.uimanager.M0.r
        public void a() {
            M0.this.f7261b.D(this.f7350a, this.f7348c);
        }
    }

    private abstract class v implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7350a;

        public v(int i3) {
            this.f7350a = i3;
        }
    }

    public M0(ReactApplicationContext reactApplicationContext, C0384b0 c0384b0, int i3) {
        this.f7261b = c0384b0;
        this.f7264e = new i(reactApplicationContext, i3 == -1 ? 8 : i3);
        this.f7265f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.f7272m) {
            Y.a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f7262c) {
            if (this.f7268i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.f7268i;
            this.f7268i = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.f7273n) {
                this.f7281v = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f7282w = this.f7274o;
                this.f7273n = false;
                p015d2.a.b(0L, "batchedExecutionTime", 0, jUptimeMillis * 1000000);
                p015d2.a.g(0L, "batchedExecutionTime", 0);
            }
            this.f7274o = 0L;
        }
    }

    public void A() {
        this.f7267h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f7267h.add(new d(readableMap, callback));
    }

    public void C(B0 b4, int i3, String str, C0417s0 c0417s0) {
        synchronized (this.f7263d) {
            this.f7284y++;
            this.f7269j.addLast(new e(b4, i3, str, c0417s0));
        }
    }

    public void D(int i3, int i4, ReadableArray readableArray) {
        this.f7266g.add(new f(i3, i4, readableArray));
    }

    public void E(int i3, String str, ReadableArray readableArray) {
        this.f7266g.add(new h(i3, str, readableArray));
    }

    public void F(int i3, float f3, float f4, Callback callback) {
        this.f7267h.add(new j(i3, f3, f4, callback));
    }

    public void G(int i3, int[] iArr, O0[] o0Arr, int[] iArr2) {
        this.f7267h.add(new k(i3, iArr, o0Arr, iArr2));
    }

    public void H(int i3, Callback callback) {
        this.f7267h.add(new m(i3, callback));
    }

    public void I(int i3, Callback callback) {
        this.f7267h.add(new l(i3, callback));
    }

    public void J(int i3) {
        this.f7267h.add(new n(i3));
    }

    public void K(int i3, int i4) {
        this.f7267h.add(new o(i3, i4));
    }

    public void L(int i3, int i4, boolean z3) {
        this.f7267h.add(new c(i3, i4, false, z3));
    }

    public void M(boolean z3) {
        this.f7267h.add(new p(z3));
    }

    public void N(F0 f3) {
        this.f7267h.add(new q(f3));
    }

    public void O(int i3, Object obj) {
        this.f7267h.add(new u(i3, obj));
    }

    public void P(int i3, int i4, int i5, int i6, int i7, int i8, com.facebook.yoga.h hVar) {
        this.f7267h.add(new s(i3, i4, i5, i6, i7, i8, hVar));
    }

    public void Q(int i3, String str, C0417s0 c0417s0) {
        this.f7285z++;
        this.f7267h.add(new t(i3, c0417s0));
    }

    C0384b0 S() {
        return this.f7261b;
    }

    public Map T() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.f7275p));
        map.put("CommitEndTime", Long.valueOf(this.f7276q));
        map.put("LayoutTime", Long.valueOf(this.f7277r));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.f7278s));
        map.put("RunStartTime", Long.valueOf(this.f7279t));
        map.put("RunEndTime", Long.valueOf(this.f7280u));
        map.put("BatchedExecutionTime", Long.valueOf(this.f7281v));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.f7282w));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.f7283x));
        map.put("CreateViewCount", Long.valueOf(this.f7284y));
        map.put("UpdatePropsCount", Long.valueOf(this.f7285z));
        return map;
    }

    public boolean U() {
        return this.f7267h.isEmpty() && this.f7266g.isEmpty();
    }

    void V() {
        this.f7271l = false;
        com.facebook.react.modules.core.b.h().n(com.facebook.react.modules.core.b.a.DISPATCH_UI, this.f7264e);
        R();
    }

    public void W(F0 f3) {
        this.f7267h.add(0, new q(f3));
    }

    public void X() {
        this.f7273n = true;
        this.f7275p = 0L;
        this.f7284y = 0L;
        this.f7285z = 0L;
    }

    void Y() {
        this.f7271l = true;
        com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.DISPATCH_UI, this.f7264e);
    }

    public void Z(N1.a aVar) {
        this.f7270k = aVar;
    }

    public void y(int i3, View view) {
        this.f7261b.b(i3, view);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ba */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r20, long r21, long r23) throws java.lang.Throwable {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            java.lang.String r1 = "UIViewOperationQueue.dispatchViewUpdates"
            r13 = 0
            d2.b$a r1 = p015d2.b.a(r13, r1)
            java.lang.String r2 = "batchId"
            d2.b$a r1 = r1.a(r2, r0)
            r1.c()
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L31
            long r16 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r1 = r15.f7266g     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 != 0) goto L35
            java.util.ArrayList r1 = r15.f7266g     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r15.f7266g = r3     // Catch: java.lang.Throwable -> L31
            r4 = r1
            goto L36
        L31:
            r0 = move-exception
            r2 = r13
            goto Lbc
        L35:
            r4 = r2
        L36:
            java.util.ArrayList r1 = r15.f7267h     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L49
            java.util.ArrayList r1 = r15.f7267h     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r15.f7267h = r3     // Catch: java.lang.Throwable -> L31
            r6 = r1
            goto L4a
        L49:
            r6 = r2
        L4a:
            java.lang.Object r1 = r15.f7263d     // Catch: java.lang.Throwable -> L31
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque r3 = r15.f7269j     // Catch: java.lang.Throwable -> L60
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L5e
            java.util.ArrayDeque r2 = r15.f7269j     // Catch: java.lang.Throwable -> L60
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L60
            r15.f7269j = r3     // Catch: java.lang.Throwable -> L60
        L5e:
            r5 = r2
            goto L63
        L60:
            r0 = move-exception
            r2 = r13
            goto Lb8
        L63:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            N1.a r1 = r15.f7270k     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L6b
            r1.a()     // Catch: java.lang.Throwable -> L31
        L6b:
            com.facebook.react.uimanager.M0$a r9 = new com.facebook.react.uimanager.M0$a     // Catch: java.lang.Throwable -> L31
            r1 = r9
            r2 = r19
            r3 = r20
            r7 = r21
            r18 = r9
            r9 = r23
            r13 = r16
            r1.<init>(r3, r4, r5, r6, r7, r9, r11, r13)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "acquiring mDispatchRunnablesLock"
            r2 = 0
            d2.b$a r1 = p015d2.b.a(r2, r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "batchId"
            d2.b$a r0 = r1.a(r4, r0)     // Catch: java.lang.Throwable -> Lab
            r0.c()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r15.f7262c     // Catch: java.lang.Throwable -> Lab
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lab
            p015d2.a.i(r2)     // Catch: java.lang.Throwable -> Lb1
            java.util.ArrayList r0 = r15.f7268i     // Catch: java.lang.Throwable -> Lb1
            r4 = r18
            r0.add(r4)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r15.f7271l     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto Lad
            com.facebook.react.uimanager.M0$b r0 = new com.facebook.react.uimanager.M0$b     // Catch: java.lang.Throwable -> Lab
            com.facebook.react.bridge.ReactApplicationContext r1 = r15.f7265f     // Catch: java.lang.Throwable -> Lab
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lab
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch: java.lang.Throwable -> Lab
            goto Lad
        Lab:
            r0 = move-exception
            goto Lbc
        Lad:
            p015d2.a.i(r2)
            return
        Lb1:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lb4:
            r0 = move-exception
            r2 = 0
            goto Lbc
        Lb8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lba:
            r0 = move-exception
            goto Lb8
        Lbc:
            p015d2.a.i(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.M0.z(int, long, long):void");
    }
}
