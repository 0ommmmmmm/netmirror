package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p017e0.b;

/* JADX INFO: loaded from: classes.dex */
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f5705a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f5705a;
    }

    @Override // p017e0.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p017e0.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
