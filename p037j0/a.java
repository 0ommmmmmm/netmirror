package p037j0;

import D2.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9545a = new a();

    private a() {
    }

    @Override // p037j0.b
    public boolean a(p033i0.a aVar) {
        h.f(aVar, "tag");
        return false;
    }

    @Override // p037j0.b
    public void b(p033i0.a aVar, String str, Object... objArr) {
        h.f(aVar, "tag");
        h.f(str, "message");
        h.f(objArr, "args");
    }

    @Override // p037j0.b
    public void c(p033i0.a aVar, String str) {
        h.f(aVar, "tag");
        h.f(str, "message");
    }
}
