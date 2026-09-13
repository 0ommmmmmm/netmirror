package com.facebook.imagepipeline.memory;

import X.k;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f5932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5934e;

    public b(int i3, int i4, int i5, boolean z3) {
        k.i(i3 > 0);
        k.i(i4 >= 0);
        k.i(i5 >= 0);
        this.f5930a = i3;
        this.f5931b = i4;
        this.f5932c = new LinkedList();
        this.f5934e = i5;
        this.f5933d = z3;
    }

    void a(Object obj) {
        this.f5932c.add(obj);
    }

    public void b() {
        k.i(this.f5934e > 0);
        this.f5934e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f5934e++;
        }
        return objG;
    }

    int d() {
        return this.f5932c.size();
    }

    public void e() {
        this.f5934e++;
    }

    public boolean f() {
        return this.f5934e + d() > this.f5931b;
    }

    public Object g() {
        return this.f5932c.poll();
    }

    public void h(Object obj) {
        k.g(obj);
        if (this.f5933d) {
            k.i(this.f5934e > 0);
            this.f5934e--;
            a(obj);
        } else {
            int i3 = this.f5934e;
            if (i3 <= 0) {
                Y.a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f5934e = i3 - 1;
                a(obj);
            }
        }
    }
}
