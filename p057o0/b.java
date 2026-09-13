package p057o0;

import O0.l;
import java.io.Closeable;
import p077t0.G;
import p101z0.a;
import p101z0.e;
import p101z0.i;
import p101z0.j;
import p101z0.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements Closeable, G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p017e0.b f10157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f10158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f10159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f10160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10161h;

    public b(p017e0.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    private void P(j jVar, long j3) {
        jVar.R(false);
        jVar.L(j3);
        d0(jVar, n.INVISIBLE);
    }

    private void c0(j jVar, e eVar) {
        jVar.H(eVar);
        this.f10159f.a(jVar, eVar);
        i iVar = this.f10160g;
        if (iVar != null) {
            iVar.a(jVar, eVar);
        }
    }

    private void d0(j jVar, n nVar) {
        this.f10159f.b(jVar, nVar);
        i iVar = this.f10160g;
        if (iVar != null) {
            iVar.b(jVar, nVar);
        }
    }

    @Override // p101z0.a, p101z0.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void z(String str, l lVar, z0.b.a aVar) {
        long jNow = this.f10157d.now();
        j jVar = this.f10158e;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(lVar);
        c0(jVar, e.SUCCESS);
    }

    @Override // p101z0.a, p101z0.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void a(String str, l lVar) {
        long jNow = this.f10157d.now();
        j jVar = this.f10158e;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(lVar);
        c0(jVar, e.INTERMEDIATE_AVAILABLE);
    }

    public void X(j jVar, long j3) {
        jVar.R(true);
        jVar.Q(j3);
        d0(jVar, n.VISIBLE);
    }

    public void a0() {
        this.f10158e.w();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0();
    }

    @Override // p077t0.G
    public void i(boolean z3) {
        if (z3) {
            X(this.f10158e, this.f10157d.now());
        } else {
            P(this.f10158e, this.f10157d.now());
        }
    }

    @Override // p101z0.a, p101z0.b
    public void o(String str, Object obj, z0.b.a aVar) {
        long jNow = this.f10157d.now();
        j jVar = this.f10158e;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        c0(jVar, e.REQUESTED);
        if (this.f10161h) {
            X(jVar, jNow);
        }
    }

    @Override // p077t0.G
    public void onDraw() {
    }

    @Override // p101z0.a, p101z0.b
    public void v(String str, z0.b.a aVar) {
        long jNow = this.f10157d.now();
        j jVar = this.f10158e;
        jVar.F(aVar);
        jVar.B(str);
        c0(jVar, e.RELEASED);
        if (this.f10161h) {
            P(jVar, jNow);
        }
    }

    @Override // p101z0.a, p101z0.b
    public void y(String str, Throwable th, z0.b.a aVar) {
        long jNow = this.f10157d.now();
        j jVar = this.f10158e;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th);
        c0(jVar, e.ERROR);
        P(jVar, jNow);
    }

    public b(p017e0.b bVar, j jVar, i iVar, boolean z3) {
        this.f10160g = null;
        this.f10157d = bVar;
        this.f10158e = jVar;
        this.f10159f = iVar;
        this.f10161h = z3;
    }
}
