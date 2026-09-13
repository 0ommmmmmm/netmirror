package com.facebook.common.time;

import p017e0.c;

/* JADX INFO: loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements c {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p017e0.c, p017e0.b
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p017e0.c, p017e0.b
    public long nowNanos() {
        return System.nanoTime();
    }
}
