package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f6638a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f6639b;

    private I() {
    }

    public static final synchronized void a() {
        if (f6639b) {
            return;
        }
        SoLoader.t("react_devsupportjni");
        f6639b = true;
    }
}
