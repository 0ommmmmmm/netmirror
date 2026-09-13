package com.facebook.soloader;

/* JADX INFO: loaded from: classes.dex */
public class C extends UnsatisfiedLinkError {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8192b;

    public C(String str, String str2) {
        super(str2);
        this.f8192b = str;
    }

    public String a() {
        return this.f8192b;
    }

    public C(String str) {
        this.f8192b = str;
    }
}
