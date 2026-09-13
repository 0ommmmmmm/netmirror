package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class M implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p001a0.i f6038b;

    class a extends n0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ U0.b f6039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f6040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f0 f6041i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0317n interfaceC0317n, h0 h0Var, f0 f0Var, String str, U0.b bVar, h0 h0Var2, f0 f0Var2) {
            super(interfaceC0317n, h0Var, f0Var, str);
            this.f6039g = bVar;
            this.f6040h = h0Var2;
            this.f6041i = f0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(O0.j jVar) {
            O0.j.o(jVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public O0.j c() {
            O0.j jVarD = M.this.d(this.f6039g);
            if (jVarD == null) {
                this.f6040h.e(this.f6041i, M.this.f(), false);
                this.f6041i.n0("local", "fetch");
                return null;
            }
            jVarD.x0();
            this.f6040h.e(this.f6041i, M.this.f(), true);
            this.f6041i.n0("local", "fetch");
            this.f6041i.A("image_color_space", jVarD.z());
            return jVarD;
        }
    }

    class b extends C0309f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f6043a;

        b(n0 n0Var) {
            this.f6043a = n0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
        public void a() {
            this.f6043a.a();
        }
    }

    protected M(Executor executor, p001a0.i iVar) {
        this.f6037a = executor;
        this.f6038b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        h0 h0VarP = f0Var.P();
        U0.b bVarX = f0Var.X();
        f0Var.n0("local", "fetch");
        a aVar = new a(interfaceC0317n, h0VarP, f0Var, f(), bVarX, h0VarP, f0Var);
        f0Var.a0(new b(aVar));
        this.f6037a.execute(aVar);
    }

    protected O0.j c(InputStream inputStream, int i3) {
        p005b0.a aVarD0 = null;
        try {
            aVarD0 = i3 <= 0 ? p005b0.a.d0(this.f6038b.d(inputStream)) : p005b0.a.d0(this.f6038b.a(inputStream, i3));
            O0.j jVar = new O0.j(aVarD0);
            X.b.b(inputStream);
            p005b0.a.D(aVarD0);
            return jVar;
        } catch (Throwable th) {
            X.b.b(inputStream);
            p005b0.a.D(aVarD0);
            throw th;
        }
    }

    protected abstract O0.j d(U0.b bVar);

    protected O0.j e(InputStream inputStream, int i3) {
        return c(inputStream, i3);
    }

    protected abstract String f();
}
