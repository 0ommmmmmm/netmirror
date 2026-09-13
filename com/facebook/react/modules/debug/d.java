package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements NotThreadSafeBridgeIdleDebugListener, N1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f6936a = new ArrayList(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f6937b = new ArrayList(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f6938c = new ArrayList(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f6939d = new ArrayList(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f6940e = true;

    private final boolean c(long j3, long j4) {
        long jE = e.e(this.f6936a, j3, j4);
        long jE2 = e.e(this.f6937b, j3, j4);
        if (jE == -1 && jE2 == -1) {
            return this.f6940e;
        }
        return jE > jE2;
    }

    @Override // N1.a
    public synchronized void a() {
        this.f6938c.add(Long.valueOf(System.nanoTime()));
    }

    @Override // N1.a
    public synchronized void b() {
        this.f6939d.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j3, long j4) {
        boolean z3;
        try {
            boolean zF = e.f(this.f6939d, j3, j4);
            boolean zC = c(j3, j4);
            z3 = true;
            if (!zF && (!zC || e.f(this.f6938c, j3, j4))) {
                z3 = false;
            }
            e.d(this.f6936a, j4);
            e.d(this.f6937b, j4);
            e.d(this.f6938c, j4);
            e.d(this.f6939d, j4);
            this.f6940e = zC;
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f6937b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f6936a.add(Long.valueOf(System.nanoTime()));
    }
}
