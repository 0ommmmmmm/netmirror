package com.facebook.react.runtime;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0356a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f7150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f7152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f7153d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    interface InterfaceC0109a {
        Object get();
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$b */
    enum b {
        Init,
        Creating,
        Success,
        Failure
    }

    public C0356a(Object obj) {
        this.f7150a = obj;
        this.f7151b = obj;
        this.f7152c = b.Init;
        this.f7153d = "";
    }

    public synchronized Object a() {
        return p002a1.a.c(this.f7150a);
    }

    public synchronized Object b() {
        Object objA;
        objA = a();
        e();
        return objA;
    }

    public synchronized Object c() {
        return this.f7150a;
    }

    public Object d(InterfaceC0109a interfaceC0109a) {
        boolean z3;
        Object objA;
        Object objA2;
        synchronized (this) {
            try {
                b bVar = this.f7152c;
                b bVar2 = b.Success;
                if (bVar == bVar2) {
                    return a();
                }
                if (this.f7152c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f7153d);
                }
                b bVar3 = this.f7152c;
                b bVar4 = b.Creating;
                boolean z4 = false;
                if (bVar3 != bVar4) {
                    this.f7152c = bVar4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    try {
                        this.f7150a = interfaceC0109a.get();
                        synchronized (this) {
                            this.f7152c = bVar2;
                            notifyAll();
                            objA = a();
                        }
                        return objA;
                    } catch (RuntimeException e4) {
                        synchronized (this) {
                            this.f7152c = b.Failure;
                            this.f7153d = Objects.toString(e4.getMessage(), "null");
                            notifyAll();
                            throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e4);
                        }
                    }
                }
                synchronized (this) {
                    while (this.f7152c == b.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.f7152c == b.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f7153d);
                    }
                    objA2 = a();
                }
                return objA2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void e() {
        this.f7150a = this.f7151b;
        this.f7152c = b.Init;
        this.f7153d = "";
    }

    public C0356a() {
        this(null);
    }
}
