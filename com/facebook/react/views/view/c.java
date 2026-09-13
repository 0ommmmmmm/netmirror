package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8161a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f8162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f8163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f8164d;

    private c() {
    }

    public static final void a(Canvas canvas, boolean z3) {
        Method method;
        D2.h.f(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (z3) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        f8161a.b();
        if (z3) {
            try {
                Method method2 = f8162b;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z3 || (method = f8163c) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, new Object[0]);
    }

    private final void b() {
        if (f8164d) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                D2.h.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                f8162b = (Method) objInvoke;
                Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                D2.h.d(objInvoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                f8163c = (Method) objInvoke2;
            } else {
                f8162b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f8163c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method = f8162b;
            if (method != null && f8163c != null) {
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = f8163c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                f8164d = true;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
