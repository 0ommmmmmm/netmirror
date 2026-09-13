package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f10233b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f10234c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f10235a;

    private a() {
    }

    public static a a() {
        if (f10234c == null) {
            f10234c = new a();
        }
        return f10234c;
    }

    public void b(b bVar) {
        this.f10235a = bVar;
        if (f10233b.get() == 1) {
            this.f10235a.start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityDestroyed");
        if (f10233b.get() != 0 || (bVar = this.f10235a) == null) {
            return;
        }
        bVar.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d("OrientationModule", "onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d("OrientationModule", "onActivityResumed");
        if (f10233b.incrementAndGet() != 1 || this.f10235a == null) {
            return;
        }
        Log.d("OrientationModule", "Start orientation");
        this.f10235a.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Log.d("OrientationModule", "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityStopped");
        if (f10233b.decrementAndGet() != 0 || (bVar = this.f10235a) == null) {
            return;
        }
        bVar.stop();
    }
}
