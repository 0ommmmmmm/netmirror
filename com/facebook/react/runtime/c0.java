package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LifecycleState f7171a = LifecycleState.BEFORE_CREATE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0358c f7172b;

    c0(C0358c c0358c) {
        this.f7172b = c0358c;
    }

    public LifecycleState a() {
        return this.f7171a;
    }

    public void b(ReactContext reactContext) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f7171a;
            if (lifecycleState == LifecycleState.BEFORE_RESUME) {
                this.f7172b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f7172b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f7172b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f7171a = LifecycleState.BEFORE_CREATE;
    }

    public void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f7171a;
            if (lifecycleState == LifecycleState.BEFORE_CREATE) {
                this.f7172b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                this.f7172b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f7172b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.f7171a = LifecycleState.BEFORE_RESUME;
    }

    public void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f7171a;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            this.f7172b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
        this.f7171a = lifecycleState2;
    }

    public void e(ReactContext reactContext, Activity activity) {
        if (this.f7171a == LifecycleState.RESUMED) {
            this.f7172b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
    }
}
