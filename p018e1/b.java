package p018e1;

import D2.h;
import p064q.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f9348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9349b;

    public b(int i3) {
        this.f9348a = new Object[i3];
    }

    @Override // p064q.e
    public synchronized boolean a(Object obj) {
        h.f(obj, "instance");
        int i3 = this.f9349b;
        Object[] objArr = this.f9348a;
        if (i3 == objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f9349b = i3 + 1;
        return true;
    }

    @Override // p064q.e
    public synchronized Object b() {
        int i3 = this.f9349b;
        if (i3 == 0) {
            return null;
        }
        int i4 = i3 - 1;
        this.f9349b = i4;
        Object obj = this.f9348a[i4];
        h.d(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.f9348a[i4] = null;
        return obj;
    }

    public final synchronized void c() {
        try {
            int i3 = this.f9349b;
            for (int i4 = 0; i4 < i3; i4++) {
                this.f9348a[i4] = null;
            }
            this.f9349b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
