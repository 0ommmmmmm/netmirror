package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: renamed from: com.facebook.react.uimanager.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0417s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ReadableMap f7631a;

    public C0417s0(ReadableMap readableMap) {
        this.f7631a = readableMap;
    }

    public boolean a(String str, boolean z3) {
        return this.f7631a.isNull(str) ? z3 : this.f7631a.getBoolean(str);
    }

    public String b(String str) {
        return this.f7631a.getString(str);
    }

    public boolean c(String str) {
        return this.f7631a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f7631a.toString() + " }";
    }
}
