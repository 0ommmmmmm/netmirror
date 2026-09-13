package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6200c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f6202b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(f0 f0Var) {
            if (!P0.a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + f0Var.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(f0 f0Var) {
            return f0Var.e0().G().k() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        private a() {
        }
    }

    public static final class b extends C0309f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f6203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f6204b;

        b(n0 n0Var, p0 p0Var) {
            this.f6203a = n0Var;
            this.f6204b = p0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
        public void a() {
            this.f6203a.a();
            this.f6204b.d().b(this.f6203a);
        }
    }

    public static final class c extends n0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC0317n f6205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f6206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f0 f6207i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p0 f6208j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC0317n interfaceC0317n, h0 h0Var, f0 f0Var, p0 p0Var) {
            super(interfaceC0317n, h0Var, f0Var, "BackgroundThreadHandoffProducer");
            this.f6205g = interfaceC0317n;
            this.f6206h = h0Var;
            this.f6207i = f0Var;
            this.f6208j = p0Var;
        }

        @Override // V.e
        protected void b(Object obj) {
        }

        @Override // V.e
        protected Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.n0, V.e
        protected void f(Object obj) {
            this.f6206h.d(this.f6207i, "BackgroundThreadHandoffProducer", null);
            this.f6208j.c().b(this.f6205g, this.f6207i);
        }
    }

    public p0(e0 e0Var, q0 q0Var) {
        D2.h.f(e0Var, "inputProducer");
        D2.h.f(q0Var, "threadHandoffProducerQueue");
        this.f6201a = e0Var;
        this.f6202b = q0Var;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        D2.h.f(interfaceC0317n, "consumer");
        D2.h.f(f0Var, "context");
        if (!V0.b.d()) {
            h0 h0VarP = f0Var.P();
            a aVar = f6200c;
            if (aVar.d(f0Var)) {
                h0VarP.g(f0Var, "BackgroundThreadHandoffProducer");
                h0VarP.d(f0Var, "BackgroundThreadHandoffProducer", null);
                this.f6201a.b(interfaceC0317n, f0Var);
                return;
            } else {
                c cVar = new c(interfaceC0317n, h0VarP, f0Var, this);
                f0Var.a0(new b(cVar, this));
                this.f6202b.a(P0.a.a(cVar, aVar.c(f0Var)));
                return;
            }
        }
        V0.b.a("ThreadHandoffProducer#produceResults");
        try {
            h0 h0VarP2 = f0Var.P();
            a aVar2 = f6200c;
            if (aVar2.d(f0Var)) {
                h0VarP2.g(f0Var, "BackgroundThreadHandoffProducer");
                h0VarP2.d(f0Var, "BackgroundThreadHandoffProducer", null);
                this.f6201a.b(interfaceC0317n, f0Var);
            } else {
                c cVar2 = new c(interfaceC0317n, h0VarP2, f0Var, this);
                f0Var.a0(new b(cVar2, this));
                this.f6202b.a(P0.a.a(cVar2, aVar2.c(f0Var)));
                p071r2.r rVar = p071r2.r.f10603a;
            }
        } finally {
            V0.b.b();
        }
    }

    public final e0 c() {
        return this.f6201a;
    }

    public final q0 d() {
        return this.f6202b;
    }
}
