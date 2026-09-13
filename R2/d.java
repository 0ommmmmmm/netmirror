package R2;

import M2.C0190a;
import M2.F;
import M2.r;
import M2.u;
import M2.z;
import U2.n;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k.b f2125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f2126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f2130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f2131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0190a f2132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f2133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f2134j;

    public d(h hVar, C0190a c0190a, e eVar, r rVar) {
        D2.h.f(hVar, "connectionPool");
        D2.h.f(c0190a, "address");
        D2.h.f(eVar, "call");
        D2.h.f(rVar, "eventListener");
        this.f2131g = hVar;
        this.f2132h = c0190a;
        this.f2133i = eVar;
        this.f2134j = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int i3, int i4, int i5, int i6, boolean z3) throws IOException {
        List listA;
        f fVar;
        Socket socketY;
        if (this.f2133i.q()) {
            throw new IOException("Canceled");
        }
        f fVarM = this.f2133i.m();
        if (fVarM != null) {
            synchronized (fVarM) {
                try {
                    socketY = (fVarM.p() || !g(fVarM.A().a().l())) ? this.f2133i.y() : null;
                    p071r2.r rVar = p071r2.r.f10603a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f2133i.m() != null) {
                if (socketY == null) {
                    return fVarM;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketY != null) {
                N2.c.k(socketY);
            }
            this.f2134j.l(this.f2133i, fVarM);
        }
        this.f2127c = 0;
        this.f2128d = 0;
        this.f2129e = 0;
        if (this.f2131g.a(this.f2132h, this.f2133i, null, false)) {
            f fVarM2 = this.f2133i.m();
            D2.h.c(fVarM2);
            this.f2134j.k(this.f2133i, fVarM2);
            return fVarM2;
        }
        F fC = this.f2130f;
        try {
            if (fC == null) {
                k.b bVar = this.f2125a;
                if (bVar != null) {
                    D2.h.c(bVar);
                    if (bVar.b()) {
                        k.b bVar2 = this.f2125a;
                        D2.h.c(bVar2);
                        fC = bVar2.c();
                    }
                    fVar = new f(this.f2131g, fC);
                    this.f2133i.A(fVar);
                    fVar.f(i3, i4, i5, i6, z3, this.f2133i, this.f2134j);
                    this.f2133i.A(null);
                    this.f2133i.l().x().a(fVar.A());
                    if (this.f2131g.a(this.f2132h, this.f2133i, listA, true)) {
                        f fVarM3 = this.f2133i.m();
                        D2.h.c(fVarM3);
                        this.f2130f = fC;
                        N2.c.k(fVar.E());
                        this.f2134j.k(this.f2133i, fVarM3);
                        return fVarM3;
                    }
                    synchronized (fVar) {
                        this.f2131g.e(fVar);
                        this.f2133i.d(fVar);
                        p071r2.r rVar2 = p071r2.r.f10603a;
                    }
                    this.f2134j.k(this.f2133i, fVar);
                    return fVar;
                }
                k kVar = this.f2126b;
                if (kVar == null) {
                    kVar = new k(this.f2132h, this.f2133i.l().x(), this.f2133i, this.f2134j);
                    this.f2126b = kVar;
                }
                k.b bVarD = kVar.d();
                this.f2125a = bVarD;
                listA = bVarD.a();
                if (this.f2133i.q()) {
                    throw new IOException("Canceled");
                }
                if (this.f2131g.a(this.f2132h, this.f2133i, listA, false)) {
                    f fVarM4 = this.f2133i.m();
                    D2.h.c(fVarM4);
                    this.f2134j.k(this.f2133i, fVarM4);
                    return fVarM4;
                }
                fC = bVarD.c();
                fVar = new f(this.f2131g, fC);
                this.f2133i.A(fVar);
                fVar.f(i3, i4, i5, i6, z3, this.f2133i, this.f2134j);
                this.f2133i.A(null);
                this.f2133i.l().x().a(fVar.A());
                if (this.f2131g.a(this.f2132h, this.f2133i, listA, true)) {
                    f fVarM5 = this.f2133i.m();
                    D2.h.c(fVarM5);
                    this.f2130f = fC;
                    N2.c.k(fVar.E());
                    this.f2134j.k(this.f2133i, fVarM5);
                    return fVarM5;
                }
                synchronized (fVar) {
                    this.f2131g.e(fVar);
                    this.f2133i.d(fVar);
                    p071r2.r rVar3 = p071r2.r.f10603a;
                    this.f2134j.k(this.f2133i, fVar);
                    return fVar;
                }
            }
            D2.h.c(fC);
            this.f2130f = null;
            fVar.f(i3, i4, i5, i6, z3, this.f2133i, this.f2134j);
            this.f2133i.A(null);
            this.f2133i.l().x().a(fVar.A());
            if (this.f2131g.a(this.f2132h, this.f2133i, listA, true)) {
                f fVarM6 = this.f2133i.m();
                D2.h.c(fVarM6);
                this.f2130f = fC;
                N2.c.k(fVar.E());
                this.f2134j.k(this.f2133i, fVarM6);
                return fVarM6;
            }
            synchronized (fVar) {
                this.f2131g.e(fVar);
                this.f2133i.d(fVar);
                p071r2.r rVar4 = p071r2.r.f10603a;
                this.f2134j.k(this.f2133i, fVar);
                return fVar;
            }
        } catch (Throwable th2) {
            this.f2133i.A(null);
            throw th2;
        }
        listA = null;
        fVar = new f(this.f2131g, fC);
        this.f2133i.A(fVar);
    }

    private final f c(int i3, int i4, int i5, int i6, boolean z3, boolean z4) throws IOException {
        while (true) {
            f fVarB = b(i3, i4, i5, i6, z3);
            if (fVarB.u(z4)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f2130f == null) {
                k.b bVar = this.f2125a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    k kVar = this.f2126b;
                    if (!(kVar != null ? kVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final F f() {
        f fVarM;
        if (this.f2127c > 1 || this.f2128d > 1 || this.f2129e > 0 || (fVarM = this.f2133i.m()) == null) {
            return null;
        }
        synchronized (fVarM) {
            if (fVarM.q() != 0) {
                return null;
            }
            if (N2.c.g(fVarM.A().a().l(), this.f2132h.l())) {
                return fVarM.A();
            }
            return null;
        }
    }

    public final S2.d a(z zVar, S2.g gVar) {
        D2.h.f(zVar, "client");
        D2.h.f(gVar, "chain");
        try {
            return c(gVar.e(), gVar.g(), gVar.j(), zVar.E(), zVar.K(), !D2.h.b(gVar.h().h(), "GET")).w(zVar, gVar);
        } catch (j e4) {
            h(e4.c());
            throw e4;
        } catch (IOException e5) {
            h(e5);
            throw new j(e5);
        }
    }

    public final C0190a d() {
        return this.f2132h;
    }

    public final boolean e() {
        k kVar;
        if (this.f2127c == 0 && this.f2128d == 0 && this.f2129e == 0) {
            return false;
        }
        if (this.f2130f != null) {
            return true;
        }
        F f3 = f();
        if (f3 != null) {
            this.f2130f = f3;
            return true;
        }
        k.b bVar = this.f2125a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f2126b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final boolean g(u uVar) {
        D2.h.f(uVar, "url");
        u uVarL = this.f2132h.l();
        return uVar.l() == uVarL.l() && D2.h.b(uVar.h(), uVarL.h());
    }

    public final void h(IOException iOException) {
        D2.h.f(iOException, "e");
        this.f2130f = null;
        if ((iOException instanceof n) && ((n) iOException).f2667b == U2.b.REFUSED_STREAM) {
            this.f2127c++;
        } else if (iOException instanceof U2.a) {
            this.f2128d++;
        } else {
            this.f2129e++;
        }
    }
}
