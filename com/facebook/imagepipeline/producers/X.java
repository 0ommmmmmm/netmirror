package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class X implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p001a0.i f6081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p001a0.a f6082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y f6083c;

    class a implements Y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f6084a;

        a(D d4) {
            this.f6084a = d4;
        }

        @Override // com.facebook.imagepipeline.producers.Y.a
        public void a(Throwable th) {
            X.this.l(this.f6084a, th);
        }

        @Override // com.facebook.imagepipeline.producers.Y.a
        public void b() {
            X.this.k(this.f6084a);
        }

        @Override // com.facebook.imagepipeline.producers.Y.a
        public void c(InputStream inputStream, int i3) throws Throwable {
            if (V0.b.d()) {
                V0.b.a("NetworkFetcher->onResponse");
            }
            X.this.m(this.f6084a, inputStream, i3);
            if (V0.b.d()) {
                V0.b.b();
            }
        }
    }

    public X(p001a0.i iVar, p001a0.a aVar, Y y3) {
        this.f6081a = iVar;
        this.f6082b = aVar;
        this.f6083c = y3;
    }

    protected static float e(int i3, int i4) {
        return i4 > 0 ? i3 / i4 : 1.0f - ((float) Math.exp(((double) (-i3)) / 50000.0d));
    }

    private Map f(D d4, int i3) {
        if (d4.d().j(d4.b(), "NetworkFetchProducer")) {
            return this.f6083c.e(d4, i3);
        }
        return null;
    }

    protected static void j(p001a0.k kVar, int i3, I0.b bVar, InterfaceC0317n interfaceC0317n, f0 f0Var) throws Throwable {
        p005b0.a aVarD0 = p005b0.a.d0(kVar.a());
        O0.j jVar = null;
        try {
            O0.j jVar2 = new O0.j(aVarD0);
            try {
                jVar2.B0(bVar);
                jVar2.x0();
                interfaceC0317n.d(jVar2, i3);
                O0.j.o(jVar2);
                p005b0.a.D(aVarD0);
            } catch (Throwable th) {
                th = th;
                jVar = jVar2;
                O0.j.o(jVar);
                p005b0.a.D(aVarD0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(D d4) {
        d4.d().f(d4.b(), "NetworkFetchProducer", null);
        d4.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(D d4, Throwable th) {
        d4.d().i(d4.b(), "NetworkFetchProducer", th, null);
        d4.d().e(d4.b(), "NetworkFetchProducer", false);
        d4.b().D("network");
        d4.a().a(th);
    }

    private boolean n(D d4, f0 f0Var) {
        M0.e eVarE = f0Var.e0().e();
        if (eVarE != null && eVarE.c() && d4.b().c0()) {
            return this.f6083c.d(d4);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        f0Var.P().g(f0Var, "NetworkFetchProducer");
        D dC = this.f6083c.c(interfaceC0317n, f0Var);
        this.f6083c.b(dC, new a(dC));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(p001a0.k kVar, D d4) throws Throwable {
        Map mapF = f(d4, kVar.size());
        h0 h0VarD = d4.d();
        h0VarD.d(d4.b(), "NetworkFetchProducer", mapF);
        h0VarD.e(d4.b(), "NetworkFetchProducer", true);
        d4.b().D("network");
        j(kVar, d4.e() | 1, d4.f(), d4.a(), d4.b());
    }

    protected void i(p001a0.k kVar, D d4) throws Throwable {
        if (n(d4, d4.b())) {
            long jG = g();
            if (jG - d4.c() >= 100) {
                d4.h(jG);
                d4.d().b(d4.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, d4.e(), d4.f(), d4.a(), d4.b());
            }
        }
    }

    protected void m(D d4, InputStream inputStream, int i3) throws Throwable {
        p001a0.k kVarE = i3 > 0 ? this.f6081a.e(i3) : this.f6081a.b();
        byte[] bArr = (byte[]) this.f6082b.get(16384);
        while (true) {
            try {
                int i4 = inputStream.read(bArr);
                if (i4 < 0) {
                    this.f6083c.a(d4, kVarE.size());
                    h(kVarE, d4);
                    this.f6082b.a(bArr);
                    kVarE.close();
                    return;
                }
                if (i4 > 0) {
                    kVarE.write(bArr, 0, i4);
                    i(kVarE, d4);
                    d4.a().c(e(kVarE.size(), i3));
                }
            } catch (Throwable th) {
                this.f6082b.a(bArr);
                kVarE.close();
                throw th;
            }
        }
    }
}
