package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements p062p1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f7178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p062p1.b f7179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f7180d;

    public e0(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        this.f7179c.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f7179c.c(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, g(context), p(context), k(context));
    }

    public static e0 f(Context context, String str, Bundle bundle) {
        e0 e0Var = new e0(context, str, bundle);
        e0Var.d(new f0(context, e0Var));
        return e0Var;
    }

    private static boolean g(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().d(context);
    }

    private static float k(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean p(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        f0 f0Var = (f0) a();
        if (f0Var != null) {
            f0Var.removeAllViews();
            f0Var.setId(-1);
        }
    }

    @Override // p062p1.a
    public ViewGroup a() {
        return (ViewGroup) this.f7177a.get();
    }

    public void c(p014d1.A a4) {
        boolean z3 = a4 instanceof ReactHostImpl;
        if (z3 && !com.facebook.jni.a.a(this.f7178b, null, (ReactHostImpl) a4)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
        if (!z3) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
    }

    public void d(f0 f0Var) {
        if (!com.facebook.jni.a.a(this.f7177a, null, f0Var)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.f7180d = f0Var.getContext();
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7174b.r();
            }
        });
    }

    public Context h() {
        return this.f7180d;
    }

    EventDispatcher i() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f7178b.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.h0();
    }

    public String j() {
        return this.f7179c.a();
    }

    ReactHostImpl l() {
        return (ReactHostImpl) this.f7178b.get();
    }

    p062p1.b m() {
        return this.f7179c;
    }

    public int n() {
        return this.f7179c.getSurfaceId();
    }

    boolean o() {
        return this.f7178b.get() != null;
    }

    public boolean q() {
        return this.f7179c.isRunning();
    }

    synchronized void s(int i3, int i4, int i5, int i6) {
        this.f7179c.c(i3, i4, i5, i6, g(this.f7180d), p(this.f7180d), k(this.f7180d));
    }

    @Override // p062p1.a
    public p058o1.a start() {
        if (this.f7177a.get() == null) {
            return I1.d.l(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f7178b.get();
        return reactHostImpl == null ? I1.d.l(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImpl.A1(this);
    }

    @Override // p062p1.a
    public p058o1.a stop() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f7178b.get();
        return reactHostImpl == null ? I1.d.l(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.C1(this);
    }

    e0(p062p1.b bVar, Context context) {
        this.f7177a = new AtomicReference(null);
        this.f7178b = new AtomicReference(null);
        this.f7179c = bVar;
        this.f7180d = context;
    }
}
