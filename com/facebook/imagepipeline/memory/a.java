package com.facebook.imagepipeline.memory;

import R0.E;
import R0.F;
import X.k;
import X.m;
import X.p;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p001a0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f5918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p001a0.d f5919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final E f5920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f5921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f5922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0092a f5924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0092a f5925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f5926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5927j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    static class C0092a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5929b;

        C0092a() {
        }

        public void a(int i3) {
            int i4;
            int i5 = this.f5929b;
            if (i5 < i3 || (i4 = this.f5928a) <= 0) {
                Y.a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i3), Integer.valueOf(this.f5929b), Integer.valueOf(this.f5928a));
            } else {
                this.f5928a = i4 - 1;
                this.f5929b = i5 - i3;
            }
        }

        public void b(int i3) {
            this.f5928a++;
            this.f5929b += i3;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i3, int i4, int i5, int i6) {
            super("Pool hard cap violation? Hard cap = " + i3 + " Used size = " + i4 + " Free size = " + i5 + " Request size = " + i6);
        }
    }

    public a(p001a0.d dVar, E e4, F f3) {
        this.f5918a = getClass();
        this.f5919b = (p001a0.d) k.g(dVar);
        E e5 = (E) k.g(e4);
        this.f5920c = e5;
        this.f5926i = (F) k.g(f3);
        this.f5921d = new SparseArray();
        if (e5.f1951f) {
            q();
        } else {
            u(new SparseIntArray(0));
        }
        this.f5922e = m.b();
        this.f5925h = new C0092a();
        this.f5924g = new C0092a();
    }

    private synchronized void h() {
        try {
            k.i(!s() || this.f5925h.f5929b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void i(SparseIntArray sparseIntArray) {
        this.f5921d.clear();
        for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
            int iKeyAt = sparseIntArray.keyAt(i3);
            this.f5921d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray.valueAt(i3), 0, this.f5920c.f1951f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b l(int i3) {
        return (com.facebook.imagepipeline.memory.b) this.f5921d.get(i3);
    }

    private synchronized void q() {
        try {
            SparseIntArray sparseIntArray = this.f5920c.f1948c;
            if (sparseIntArray != null) {
                i(sparseIntArray);
                this.f5923f = false;
            } else {
                this.f5923f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void u(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f5921d.clear();
            SparseIntArray sparseIntArray2 = this.f5920c.f1948c;
            if (sparseIntArray2 != null) {
                for (int i3 = 0; i3 < sparseIntArray2.size(); i3++) {
                    int iKeyAt = sparseIntArray2.keyAt(i3);
                    this.f5921d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(o(iKeyAt), sparseIntArray2.valueAt(i3), sparseIntArray.get(iKeyAt, 0), this.f5920c.f1951f));
                }
                this.f5923f = false;
            } else {
                this.f5923f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void v() {
        if (Y.a.w(2)) {
            Y.a.B(this.f5918a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f5924g.f5928a), Integer.valueOf(this.f5924g.f5929b), Integer.valueOf(this.f5925h.f5928a), Integer.valueOf(this.f5925h.f5929b));
        }
    }

    @Override // p001a0.f, p005b0.h
    public void a(Object obj) {
        k.g(obj);
        int iN = n(obj);
        int iO = o(iN);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarL = l(iN);
                if (!this.f5922e.remove(obj)) {
                    Y.a.k(this.f5918a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    j(obj);
                    this.f5926i.c(iO);
                } else if (bVarL == null || bVarL.f() || s() || !t(obj)) {
                    if (bVarL != null) {
                        bVarL.b();
                    }
                    if (Y.a.w(2)) {
                        Y.a.z(this.f5918a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    }
                    j(obj);
                    this.f5924g.a(iO);
                    this.f5926i.c(iO);
                } else {
                    bVarL.h(obj);
                    this.f5925h.b(iO);
                    this.f5924g.a(iO);
                    this.f5926i.e(iO);
                    if (Y.a.w(2)) {
                        Y.a.z(this.f5918a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iN));
                    }
                }
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract Object f(int i3);

    synchronized boolean g(int i3) {
        if (this.f5927j) {
            return true;
        }
        E e4 = this.f5920c;
        int i4 = e4.f1946a;
        int i5 = this.f5924g.f5929b;
        if (i3 > i4 - i5) {
            this.f5926i.d();
            return false;
        }
        int i6 = e4.f1947b;
        if (i3 > i6 - (i5 + this.f5925h.f5929b)) {
            x(i6 - i3);
        }
        if (i3 <= i4 - (this.f5924g.f5929b + this.f5925h.f5929b)) {
            return true;
        }
        this.f5926i.d();
        return false;
    }

    @Override // p001a0.f
    public Object get(int i3) throws Throwable {
        Object objF;
        Object objP;
        h();
        int iM = m(i3);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarK = k(iM);
                if (bVarK != null && (objP = p(bVarK)) != null) {
                    k.i(this.f5922e.add(objP));
                    int iN = n(objP);
                    int iO = o(iN);
                    this.f5924g.b(iO);
                    this.f5925h.a(iO);
                    this.f5926i.b(iO);
                    v();
                    if (Y.a.w(2)) {
                        Y.a.z(this.f5918a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objP)), Integer.valueOf(iN));
                    }
                    return objP;
                }
                int iO2 = o(iM);
                if (!g(iO2)) {
                    throw new c(this.f5920c.f1946a, this.f5924g.f5929b, this.f5925h.f5929b, iO2);
                }
                this.f5924g.b(iO2);
                if (bVarK != null) {
                    bVarK.e();
                }
                try {
                    objF = f(iM);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f5924g.a(iO2);
                            com.facebook.imagepipeline.memory.b bVarK2 = k(iM);
                            if (bVarK2 != null) {
                                bVarK2.b();
                            }
                            p.c(th);
                            objF = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f5922e.add(objF));
                        y();
                        this.f5926i.a(iO2);
                        v();
                        if (Y.a.w(2)) {
                            Y.a.z(this.f5918a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objF)), Integer.valueOf(iM));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return objF;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract void j(Object obj);

    synchronized com.facebook.imagepipeline.memory.b k(int i3) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f5921d.get(i3);
            if (bVar == null && this.f5923f) {
                if (Y.a.w(2)) {
                    Y.a.y(this.f5918a, "creating new bucket %s", Integer.valueOf(i3));
                }
                com.facebook.imagepipeline.memory.b bVarW = w(i3);
                this.f5921d.put(i3, bVarW);
                return bVarW;
            }
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract int m(int i3);

    protected abstract int n(Object obj);

    protected abstract int o(int i3);

    protected synchronized Object p(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void r() {
        this.f5919b.a(this);
        this.f5926i.f(this);
    }

    synchronized boolean s() {
        boolean z3;
        z3 = this.f5924g.f5929b + this.f5925h.f5929b > this.f5920c.f1947b;
        if (z3) {
            this.f5926i.g();
        }
        return z3;
    }

    protected boolean t(Object obj) {
        k.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b w(int i3) {
        return new com.facebook.imagepipeline.memory.b(o(i3), Integer.MAX_VALUE, 0, this.f5920c.f1951f);
    }

    synchronized void x(int i3) {
        try {
            int i4 = this.f5924g.f5929b;
            int i5 = this.f5925h.f5929b;
            int iMin = Math.min((i4 + i5) - i3, i5);
            if (iMin <= 0) {
                return;
            }
            if (Y.a.w(2)) {
                Y.a.A(this.f5918a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i3), Integer.valueOf(this.f5924g.f5929b + this.f5925h.f5929b), Integer.valueOf(iMin));
            }
            v();
            for (int i6 = 0; i6 < this.f5921d.size() && iMin > 0; i6++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) k.g((com.facebook.imagepipeline.memory.b) this.f5921d.valueAt(i6));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    j(objG);
                    int i7 = bVar.f5930a;
                    iMin -= i7;
                    this.f5925h.a(i7);
                }
            }
            v();
            if (Y.a.w(2)) {
                Y.a.z(this.f5918a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i3), Integer.valueOf(this.f5924g.f5929b + this.f5925h.f5929b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void y() {
        if (s()) {
            x(this.f5920c.f1947b);
        }
    }

    public a(p001a0.d dVar, E e4, F f3, boolean z3) {
        this(dVar, e4, f3);
        this.f5927j = z3;
    }
}
