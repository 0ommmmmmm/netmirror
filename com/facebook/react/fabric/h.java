package com.facebook.react.fabric;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6838c;

    public h(int i3, int i4, String str) {
        D2.h.f(str, "eventName");
        this.f6836a = i3;
        this.f6837b = i4;
        this.f6838c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6836a == hVar.f6836a && this.f6837b == hVar.f6837b && D2.h.b(this.f6838c, hVar.f6838c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f6836a) * 31) + Integer.hashCode(this.f6837b)) * 31) + this.f6838c.hashCode();
    }

    public String toString() {
        return "SynchronousEvent(surfaceId=" + this.f6836a + ", viewTag=" + this.f6837b + ", eventName=" + this.f6838c + ")";
    }
}
