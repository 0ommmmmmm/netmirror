package com.facebook.react.uimanager;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class O0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Comparator f7352c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7354b;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(O0 o3, O0 o4) {
            return o3.f7354b - o4.f7354b;
        }
    }

    public O0(int i3, int i4) {
        this.f7353a = i3;
        this.f7354b = i4;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        O0 o3 = (O0) obj;
        return this.f7354b == o3.f7354b && this.f7353a == o3.f7353a;
    }

    public String toString() {
        return "[" + this.f7353a + ", " + this.f7354b + "]";
    }
}
