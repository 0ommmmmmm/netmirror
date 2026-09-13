package com.facebook.soloader;

/* JADX INFO: loaded from: classes.dex */
public class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f8255a;

    public o(x xVar) {
        this.f8255a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i3) {
        p007b2.b.j(this.f8255a, "load", i3);
        try {
            this.f8255a.a(str, i3);
            p007b2.b.i(null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p007b2.b.i(th);
                throw th2;
            }
        }
    }
}
