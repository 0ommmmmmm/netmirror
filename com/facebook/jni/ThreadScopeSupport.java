package com.facebook.jni;

/* JADX INFO: loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        p003a2.a.d("fbjni");
    }

    private static void runStdFunction(long j3) {
        runStdFunctionImpl(j3);
    }

    private static native void runStdFunctionImpl(long j3);
}
