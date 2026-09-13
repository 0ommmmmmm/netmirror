package com.facebook.react.uimanager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0412p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0412p0 f7605a = new C0412p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7606b = 1;

    private C0412p0() {
    }

    public static final synchronized int a() {
        int i3;
        i3 = f7606b;
        f7606b = i3 + 10;
        return i3;
    }
}
