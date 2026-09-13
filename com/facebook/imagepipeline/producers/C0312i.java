package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0312i implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H0.x f6146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.k f6147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f6148c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ R.d f6149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0317n interfaceC0317n, R.d dVar, boolean z3) {
            super(interfaceC0317n);
            this.f6149c = dVar;
            this.f6150d = z3;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            p005b0.a aVar2;
            try {
                if (V0.b.d()) {
                    V0.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zE = AbstractC0306c.e(i3);
                if (aVar == null) {
                    if (zE) {
                        p().d(null, i3);
                    }
                    if (V0.b.d()) {
                        V0.b.b();
                        return;
                    }
                    return;
                }
                if (!((O0.d) aVar.P()).l0() && !AbstractC0306c.n(i3, 8)) {
                    if (!zE && (aVar2 = C0312i.this.f6146a.get(this.f6149c)) != null) {
                        try {
                            O0.o oVarL = ((O0.d) aVar.P()).l();
                            O0.o oVarL2 = ((O0.d) aVar2.P()).l();
                            if (oVarL2.a() || oVarL2.c() >= oVarL.c()) {
                                p().d(aVar2, i3);
                                p005b0.a.D(aVar2);
                                if (V0.b.d()) {
                                    V0.b.b();
                                    return;
                                }
                                return;
                            }
                            p005b0.a.D(aVar2);
                        } catch (Throwable th) {
                            p005b0.a.D(aVar2);
                            throw th;
                        }
                    }
                    p005b0.a aVarB = this.f6150d ? C0312i.this.f6146a.b(this.f6149c, aVar) : null;
                    if (zE) {
                        try {
                            p().c(1.0f);
                        } catch (Throwable th2) {
                            p005b0.a.D(aVarB);
                            throw th2;
                        }
                    }
                    InterfaceC0317n interfaceC0317nP = p();
                    if (aVarB != null) {
                        aVar = aVarB;
                    }
                    interfaceC0317nP.d(aVar, i3);
                    p005b0.a.D(aVarB);
                    if (V0.b.d()) {
                        V0.b.b();
                        return;
                    }
                    return;
                }
                p().d(aVar, i3);
                if (V0.b.d()) {
                    V0.b.b();
                }
            } catch (Throwable th3) {
                if (V0.b.d()) {
                    V0.b.b();
                }
                throw th3;
            }
        }
    }

    public C0312i(H0.x xVar, H0.k kVar, e0 e0Var) {
        this.f6146a = xVar;
        this.f6147b = kVar;
        this.f6148c = e0Var;
    }

    private static void f(O0.k kVar, f0 f0Var) {
        f0Var.q(kVar.a());
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        boolean zD;
        try {
            if (V0.b.d()) {
                V0.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            h0 h0VarP = f0Var.P();
            h0VarP.g(f0Var, e());
            R.d dVarB = this.f6147b.b(f0Var.X(), f0Var.i());
            p005b0.a aVar = f0Var.X().y(1) ? this.f6146a.get(dVarB) : null;
            if (aVar != null) {
                f((O0.k) aVar.P(), f0Var);
                boolean zA = ((O0.d) aVar.P()).l().a();
                if (zA) {
                    h0VarP.d(f0Var, e(), h0VarP.j(f0Var, e()) ? X.g.of("cached_value_found", "true") : null);
                    h0VarP.e(f0Var, e(), true);
                    f0Var.n0("memory_bitmap", d());
                    interfaceC0317n.c(1.0f);
                }
                interfaceC0317n.d(aVar, AbstractC0306c.l(zA));
                aVar.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (f0Var.d0().b() >= U0.b.c.BITMAP_MEMORY_CACHE.b()) {
                h0VarP.d(f0Var, e(), h0VarP.j(f0Var, e()) ? X.g.of("cached_value_found", "false") : null);
                h0VarP.e(f0Var, e(), false);
                f0Var.n0("memory_bitmap", d());
                interfaceC0317n.d(null, 1);
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            InterfaceC0317n interfaceC0317nG = g(interfaceC0317n, dVarB, f0Var.X().y(2));
            h0VarP.d(f0Var, e(), h0VarP.j(f0Var, e()) ? X.g.of("cached_value_found", "false") : null);
            if (V0.b.d()) {
                V0.b.a("mInputProducer.produceResult");
            }
            this.f6148c.b(interfaceC0317nG, f0Var);
            if (V0.b.d()) {
                V0.b.b();
            }
        } finally {
            if (V0.b.d()) {
                V0.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC0317n g(InterfaceC0317n interfaceC0317n, R.d dVar, boolean z3) {
        return new a(interfaceC0317n, dVar, z3);
    }
}
