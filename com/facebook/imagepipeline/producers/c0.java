package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G0.b f6114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f6115c;

    private class a extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h0 f6116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f0 f6117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final U0.d f6118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p005b0.a f6120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6121h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f6122i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f6123j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c0$a$a, reason: collision with other inner class name */
        class C0095a extends C0309f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f6125a;

            C0095a(c0 c0Var) {
                this.f6125a = c0Var;
            }

            @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
            public void a() {
                a.this.C();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p005b0.a aVar;
                int i3;
                synchronized (a.this) {
                    aVar = a.this.f6120g;
                    i3 = a.this.f6121h;
                    a.this.f6120g = null;
                    a.this.f6122i = false;
                }
                if (p005b0.a.c0(aVar)) {
                    try {
                        a.this.z(aVar, i3);
                        p005b0.a.D(aVar);
                    } catch (Throwable th) {
                        p005b0.a.D(aVar);
                        throw th;
                    }
                }
                a.this.x();
            }
        }

        public a(InterfaceC0317n interfaceC0317n, h0 h0Var, U0.d dVar, f0 f0Var) {
            super(interfaceC0317n);
            this.f6120g = null;
            this.f6121h = 0;
            this.f6122i = false;
            this.f6123j = false;
            this.f6116c = h0Var;
            this.f6118e = dVar;
            this.f6117d = f0Var;
            f0Var.a0(new C0095a(c0.this));
        }

        private Map A(h0 h0Var, f0 f0Var, U0.d dVar) {
            if (h0Var.j(f0Var, "PostprocessorProducer")) {
                return X.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f6119f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().a(th);
            }
        }

        private void E(p005b0.a aVar, int i3) {
            boolean zE = AbstractC0306c.e(i3);
            if ((zE || B()) && !(zE && y())) {
                return;
            }
            p().d(aVar, i3);
        }

        private p005b0.a G(O0.d dVar) {
            O0.e eVar = (O0.e) dVar;
            p005b0.a aVarA = this.f6118e.a(eVar.C(), c0.this.f6114b);
            try {
                O0.e eVarI = O0.e.I(aVarA, dVar.l(), eVar.N(), eVar.s0());
                eVarI.q(eVar.a());
                return p005b0.a.d0(eVarI);
            } finally {
                p005b0.a.D(aVarA);
            }
        }

        private synchronized boolean H() {
            if (this.f6119f || !this.f6122i || this.f6123j || !p005b0.a.c0(this.f6120g)) {
                return false;
            }
            this.f6123j = true;
            return true;
        }

        private boolean I(O0.d dVar) {
            return dVar instanceof O0.e;
        }

        private void J() {
            c0.this.f6115c.execute(new b());
        }

        private void K(p005b0.a aVar, int i3) {
            synchronized (this) {
                try {
                    if (this.f6119f) {
                        return;
                    }
                    p005b0.a aVar2 = this.f6120g;
                    this.f6120g = p005b0.a.A(aVar);
                    this.f6121h = i3;
                    this.f6122i = true;
                    boolean zH = H();
                    p005b0.a.D(aVar2);
                    if (zH) {
                        J();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean zH;
            synchronized (this) {
                this.f6123j = false;
                zH = H();
            }
            if (zH) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                try {
                    if (this.f6119f) {
                        return false;
                    }
                    p005b0.a aVar = this.f6120g;
                    this.f6120g = null;
                    this.f6119f = true;
                    p005b0.a.D(aVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(p005b0.a aVar, int i3) {
            X.k.b(Boolean.valueOf(p005b0.a.c0(aVar)));
            if (!I((O0.d) aVar.P())) {
                E(aVar, i3);
                return;
            }
            this.f6116c.g(this.f6117d, "PostprocessorProducer");
            try {
                try {
                    p005b0.a aVarG = G((O0.d) aVar.P());
                    h0 h0Var = this.f6116c;
                    f0 f0Var = this.f6117d;
                    h0Var.d(f0Var, "PostprocessorProducer", A(h0Var, f0Var, this.f6118e));
                    E(aVarG, i3);
                    p005b0.a.D(aVarG);
                } catch (Exception e4) {
                    h0 h0Var2 = this.f6116c;
                    f0 f0Var2 = this.f6117d;
                    h0Var2.i(f0Var2, "PostprocessorProducer", e4, A(h0Var2, f0Var2, this.f6118e));
                    D(e4);
                    p005b0.a.D(null);
                }
            } catch (Throwable th) {
                p005b0.a.D(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            if (p005b0.a.c0(aVar)) {
                K(aVar, i3);
            } else if (AbstractC0306c.e(i3)) {
                E(null, i3);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void g() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void h(Throwable th) {
            D(th);
        }
    }

    class b extends AbstractC0323u {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(p005b0.a aVar, int i3) {
            if (AbstractC0306c.f(i3)) {
                return;
            }
            p().d(aVar, i3);
        }

        private b(a aVar) {
            super(aVar);
        }
    }

    public c0(e0 e0Var, G0.b bVar, Executor executor) {
        this.f6113a = (e0) X.k.g(e0Var);
        this.f6114b = bVar;
        this.f6115c = (Executor) X.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        h0 h0VarP = f0Var.P();
        U0.d dVarL = f0Var.X().l();
        X.k.g(dVarL);
        this.f6113a.b(new b(new a(interfaceC0317n, h0VarP, dVarL, f0Var)), f0Var);
    }
}
