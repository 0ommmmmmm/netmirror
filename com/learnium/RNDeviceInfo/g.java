package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class f8397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Class f8398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class f8399h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f8400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f8401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f8402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f8403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f8404e;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements InvocationHandler {

        /* JADX INFO: renamed from: com.learnium.RNDeviceInfo.g$a$a, reason: collision with other inner class name */
        class RunnableC0119a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f8406b;

            RunnableC0119a(int i3) {
                this.f8406b = i3;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f8406b);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) g.f8399h.getMethod("getInstallReferrer", new Class[0]).invoke(g.f8397f.getMethod("getInstallReferrer", new Class[0]).invoke(g.this.f8401b, new Object[0]), new Object[0]);
                SharedPreferences.Editor editorEdit = g.this.f8400a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                g.f8397f.getMethod("endConnection", new Class[0]).invoke(g.this.f8401b, new Object[0]);
            } catch (Exception e4) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e4.getMessage());
                e4.printStackTrace(printStream);
            }
        }

        public void c() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void d(int i3) {
            if (i3 == 0) {
                g.this.f8403d.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8396b.b();
                    }
                });
            } else if (i3 == 1) {
                Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
            } else {
                if (i3 != 2) {
                    return;
                }
                Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        g.this.f8404e.post(new RunnableC0119a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                g.this.f8404e.post(new b());
                return null;
            } catch (Exception e4) {
                throw new RuntimeException("unexpected invocation exception: " + e4.getMessage());
            }
        }

        private a() {
        }
    }

    static {
        try {
            f8397f = P.a.class;
            f8398g = P.b.class;
            f8399h = P.c.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    g(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f8403d = executorServiceNewSingleThreadExecutor;
        this.f8404e = new Handler(Looper.getMainLooper());
        this.f8400a = context.getSharedPreferences("react-native-device-info", 0);
        if (f8397f == null || f8398g == null || f8399h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f8394b.h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        try {
            Object objInvoke = f8397f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f8401b = objInvoke.getClass().getMethod("build", new Class[0]).invoke(objInvoke, new Object[0]);
            this.f8402c = Proxy.newProxyInstance(f8398g.getClassLoader(), new Class[]{f8398g}, new a());
            f8397f.getMethod("startConnection", f8398g).invoke(this.f8401b, this.f8402c);
        } catch (Exception e4) {
            PrintStream printStream = System.err;
            printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e4.getMessage());
            e4.printStackTrace(printStream);
        }
    }
}
