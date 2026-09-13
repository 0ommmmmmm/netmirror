package p057o0;

import p017e0.b;
import p101z0.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends Q0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f10155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f10156b;

    public a(b bVar, j jVar) {
        this.f10155a = bVar;
        this.f10156b = jVar;
    }

    @Override // Q0.a, Q0.e
    public void a(U0.b bVar, Object obj, String str, boolean z3) {
        this.f10156b.K(this.f10155a.now());
        this.f10156b.I(bVar);
        this.f10156b.y(obj);
        this.f10156b.P(str);
        this.f10156b.O(z3);
    }

    @Override // Q0.a, Q0.e
    public void b(U0.b bVar, String str, boolean z3) {
        this.f10156b.J(this.f10155a.now());
        this.f10156b.I(bVar);
        this.f10156b.P(str);
        this.f10156b.O(z3);
    }

    @Override // Q0.a, Q0.e
    public void i(String str) {
        this.f10156b.J(this.f10155a.now());
        this.f10156b.P(str);
    }

    @Override // Q0.a, Q0.e
    public void k(U0.b bVar, String str, Throwable th, boolean z3) {
        this.f10156b.J(this.f10155a.now());
        this.f10156b.I(bVar);
        this.f10156b.P(str);
        this.f10156b.O(z3);
    }
}
