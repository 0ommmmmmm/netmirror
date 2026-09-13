package com.facebook.imagepipeline.producers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p001a0.i f6179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f6180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0.d f6182e;

    private class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f6183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final W0.d f6184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f0 f6185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final H f6187g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l0$a$a, reason: collision with other inner class name */
        class C0096a implements H.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0 f6189a;

            C0096a(l0 l0Var) {
                this.f6189a = l0Var;
            }

            @Override // com.facebook.imagepipeline.producers.H.d
            public void a(O0.j jVar, int i3) throws Throwable {
                if (jVar == null) {
                    a.this.p().d(null, i3);
                } else {
                    a aVar = a.this;
                    aVar.w(jVar, i3, (W0.c) X.k.g(aVar.f6184d.createImageTranscoder(jVar.D(), a.this.f6183c)));
                }
            }
        }

        class b extends C0309f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0 f6191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0317n f6192b;

            b(l0 l0Var, InterfaceC0317n interfaceC0317n) {
                this.f6191a = l0Var;
                this.f6192b = interfaceC0317n;
            }

            @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
            public void a() {
                a.this.f6187g.c();
                a.this.f6186f = true;
                this.f6192b.b();
            }

            @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
            public void b() {
                if (a.this.f6185e.c0()) {
                    a.this.f6187g.h();
                }
            }
        }

        a(InterfaceC0317n interfaceC0317n, f0 f0Var, boolean z3, W0.d dVar) {
            super(interfaceC0317n);
            this.f6186f = false;
            this.f6185e = f0Var;
            Boolean boolS = f0Var.X().s();
            this.f6183c = boolS != null ? boolS.booleanValue() : z3;
            this.f6184d = dVar;
            this.f6187g = new H(l0.this.f6178a, new C0096a(l0.this), 100);
            f0Var.a0(new b(l0.this, interfaceC0317n));
        }

        private O0.j A(O0.j jVar) {
            I0.h hVarT = this.f6185e.X().t();
            return (hVarT.j() || !hVarT.i()) ? jVar : y(jVar, hVarT.h());
        }

        private O0.j B(O0.j jVar) {
            return (this.f6185e.X().t().f() || jVar.N() == 0 || jVar.N() == -1) ? jVar : y(jVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(O0.j jVar, int i3, W0.c cVar) throws Throwable {
            this.f6185e.P().g(this.f6185e, "ResizeAndRotateProducer");
            U0.b bVarX = this.f6185e.X();
            p001a0.k kVarB = l0.this.f6179b.b();
            try {
                try {
                    W0.b bVarC = cVar.c(jVar, kVarB, bVarX.t(), bVarX.r(), null, 85, jVar.z());
                    if (bVarC.a() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map mapZ = z(jVar, bVarX.r(), bVarC, cVar.a());
                    p005b0.a aVarD0 = p005b0.a.d0(kVarB.a());
                    try {
                        O0.j jVar2 = new O0.j(aVarD0);
                        jVar2.E0(D0.b.f135b);
                        try {
                            jVar2.x0();
                            this.f6185e.P().d(this.f6185e, "ResizeAndRotateProducer", mapZ);
                            if (bVarC.a() != 1) {
                                i3 |= 16;
                            }
                            p().d(jVar2, i3);
                            O0.j.o(jVar2);
                            p005b0.a.D(aVarD0);
                            kVarB.close();
                        } catch (Throwable th) {
                            O0.j.o(jVar2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        p005b0.a.D(aVarD0);
                        throw th2;
                    }
                } catch (Exception e4) {
                    this.f6185e.P().i(this.f6185e, "ResizeAndRotateProducer", e4, null);
                    if (AbstractC0306c.e(i3)) {
                        p().a(e4);
                    }
                    kVarB.close();
                }
            } catch (Throwable th3) {
                kVarB.close();
                throw th3;
            }
        }

        private void x(O0.j jVar, int i3, D0.c cVar) {
            p().d((cVar == D0.b.f135b || cVar == D0.b.f145l) ? B(jVar) : A(jVar), i3);
        }

        private O0.j y(O0.j jVar, int i3) {
            O0.j jVarI = O0.j.i(jVar);
            if (jVarI != null) {
                jVarI.F0(i3);
            }
            return jVarI;
        }

        private Map z(O0.j jVar, I0.g gVar, W0.b bVar, String str) {
            String str2;
            if (!this.f6185e.P().j(this.f6185e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = jVar.h() + "x" + jVar.d();
            if (gVar != null) {
                str2 = gVar.f421a + "x" + gVar.f422b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(jVar.D()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f6187g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return X.g.b(map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            if (this.f6186f) {
                return;
            }
            boolean zE = AbstractC0306c.e(i3);
            if (jVar == null) {
                if (zE) {
                    p().d(null, 1);
                    return;
                }
                return;
            }
            D0.c cVarD = jVar.D();
            p021f0.e eVarH = l0.h(this.f6185e.X(), jVar, (W0.c) X.k.g(this.f6184d.createImageTranscoder(cVarD, this.f6183c)));
            if (zE || eVarH != p021f0.e.UNSET) {
                if (eVarH != p021f0.e.YES) {
                    x(jVar, i3, cVarD);
                } else if (this.f6187g.k(jVar, i3)) {
                    if (zE || this.f6185e.c0()) {
                        this.f6187g.h();
                    }
                }
            }
        }
    }

    public l0(Executor executor, p001a0.i iVar, e0 e0Var, boolean z3, W0.d dVar) {
        this.f6178a = (Executor) X.k.g(executor);
        this.f6179b = (p001a0.i) X.k.g(iVar);
        this.f6180c = (e0) X.k.g(e0Var);
        this.f6182e = (W0.d) X.k.g(dVar);
        this.f6181d = z3;
    }

    private static boolean f(I0.h hVar, O0.j jVar) {
        return !hVar.f() && (W0.e.e(hVar, jVar) != 0 || g(hVar, jVar));
    }

    private static boolean g(I0.h hVar, O0.j jVar) {
        if (hVar.i() && !hVar.f()) {
            return W0.e.f2683b.contains(Integer.valueOf(jVar.s0()));
        }
        jVar.C0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p021f0.e h(U0.b bVar, O0.j jVar, W0.c cVar) {
        if (jVar == null || jVar.D() == D0.c.f151d) {
            return p021f0.e.UNSET;
        }
        if (cVar.b(jVar.D())) {
            return p021f0.e.c(f(bVar.t(), jVar) || cVar.d(jVar, bVar.t(), bVar.r()));
        }
        return p021f0.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        this.f6180c.b(new a(interfaceC0317n, f0Var, this.f6181d, this.f6182e), f0Var);
    }
}
