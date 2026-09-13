package com.facebook.imagepipeline.producers;

import J0.C0167a;
import J0.EnumC0180n;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320q implements e0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f6209m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p001a0.a f6210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f6211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.c f6212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M0.e f6213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC0180n f6214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f6217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0167a f6219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f6220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final X.n f6221l;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(O0.j jVar, I0.d dVar) {
            return (((long) jVar.h()) * ((long) jVar.d())) * ((long) Z0.e.h(dVar.f397h)) > 104857600;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$b */
    private final class b extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C0320q f6222k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0320q c0320q, InterfaceC0317n interfaceC0317n, f0 f0Var, boolean z3, int i3) {
            super(c0320q, interfaceC0317n, f0Var, z3, i3);
            D2.h.f(interfaceC0317n, "consumer");
            D2.h.f(f0Var, "producerContext");
            this.f6222k = c0320q;
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected synchronized boolean J(O0.j jVar, int i3) {
            return AbstractC0306c.f(i3) ? false : super.J(jVar, i3);
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected int x(O0.j jVar) {
            D2.h.f(jVar, "encodedImage");
            return jVar.c0();
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected O0.o z() {
            O0.o oVarD = O0.n.d(0, false, false);
            D2.h.e(oVarD, "of(...)");
            return oVarD;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$c */
    private final class c extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final M0.f f6223k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final M0.e f6224l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0320q f6225m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0320q c0320q, InterfaceC0317n interfaceC0317n, f0 f0Var, M0.f fVar, M0.e eVar, boolean z3, int i3) {
            super(c0320q, interfaceC0317n, f0Var, z3, i3);
            D2.h.f(interfaceC0317n, "consumer");
            D2.h.f(f0Var, "producerContext");
            D2.h.f(fVar, "progressiveJpegParser");
            D2.h.f(eVar, "progressiveJpegConfig");
            this.f6225m = c0320q;
            this.f6223k = fVar;
            this.f6224l = eVar;
            I(0);
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected synchronized boolean J(O0.j jVar, int i3) {
            if (jVar == null) {
                return false;
            }
            try {
                boolean zJ = super.J(jVar, i3);
                if (AbstractC0306c.f(i3) || AbstractC0306c.n(i3, 8)) {
                    if (!AbstractC0306c.n(i3, 4) && O0.j.w0(jVar) && jVar.D() == D0.b.f135b) {
                        if (!this.f6223k.g(jVar)) {
                            return false;
                        }
                        int iD = this.f6223k.d();
                        if (iD <= y()) {
                            return false;
                        }
                        if (iD < this.f6224l.a(y()) && !this.f6223k.e()) {
                            return false;
                        }
                        I(iD);
                    }
                }
                return zJ;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected int x(O0.j jVar) {
            D2.h.f(jVar, "encodedImage");
            return this.f6223k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C0320q.d
        protected O0.o z() {
            O0.o oVarB = this.f6224l.b(this.f6223k.d());
            D2.h.e(oVarB, "getQualityInfo(...)");
            return oVarB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$d */
    abstract class d extends AbstractC0323u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f6226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f6227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0 f6228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final I0.d f6229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f6230g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final H f6231h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6232i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C0320q f6233j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$d$a */
        public static final class a extends C0309f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f6235b;

            a(boolean z3) {
                this.f6235b = z3;
            }

            @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
            public void a() {
                if (this.f6235b) {
                    d.this.A();
                }
            }

            @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
            public void b() {
                if (d.this.f6226c.c0()) {
                    d.this.f6231h.h();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C0320q c0320q, InterfaceC0317n interfaceC0317n, f0 f0Var, boolean z3, final int i3) {
            super(interfaceC0317n);
            D2.h.f(interfaceC0317n, "consumer");
            D2.h.f(f0Var, "producerContext");
            this.f6233j = c0320q;
            this.f6226c = f0Var;
            this.f6227d = "ProgressiveDecoder";
            this.f6228e = f0Var.P();
            I0.d dVarH = f0Var.X().h();
            D2.h.e(dVarH, "getImageDecodeOptions(...)");
            this.f6229f = dVarH;
            this.f6231h = new H(c0320q.f(), new H.d() { // from class: com.facebook.imagepipeline.producers.r
                @Override // com.facebook.imagepipeline.producers.H.d
                public final void a(O0.j jVar, int i4) {
                    C0320q.d.r(this.f6236a, c0320q, i3, jVar, i4);
                }
            }, dVarH.f390a);
            f0Var.a0(new a(z3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A() {
            E(true);
            p().b();
        }

        private final void B(Throwable th) {
            E(true);
            p().a(th);
        }

        private final void C(O0.d dVar, int i3) {
            p005b0.a aVarB = this.f6233j.c().b(dVar);
            try {
                E(AbstractC0306c.e(i3));
                p().d(aVarB, i3);
            } finally {
                p005b0.a.D(aVarB);
            }
        }

        private final O0.d D(O0.j jVar, int i3, O0.o oVar) {
            boolean z3 = this.f6233j.h() != null && ((Boolean) this.f6233j.i().get()).booleanValue();
            try {
                return this.f6233j.g().a(jVar, i3, oVar, this.f6229f);
            } catch (OutOfMemoryError e4) {
                if (!z3) {
                    throw e4;
                }
                Runnable runnableH = this.f6233j.h();
                if (runnableH != null) {
                    runnableH.run();
                }
                System.gc();
                return this.f6233j.g().a(jVar, i3, oVar, this.f6229f);
            }
        }

        private final void E(boolean z3) {
            synchronized (this) {
                if (z3) {
                    if (!this.f6230g) {
                        p().c(1.0f);
                        this.f6230g = true;
                        p071r2.r rVar = p071r2.r.f10603a;
                        this.f6231h.c();
                    }
                }
            }
        }

        private final void F(O0.j jVar) {
            if (jVar.D() != D0.b.f135b) {
                return;
            }
            jVar.G0(W0.a.c(jVar, Z0.e.h(this.f6229f.f397h), 104857600));
        }

        private final void H(O0.j jVar, O0.d dVar, int i3) {
            this.f6226c.A("encoded_width", Integer.valueOf(jVar.h()));
            this.f6226c.A("encoded_height", Integer.valueOf(jVar.d()));
            this.f6226c.A("encoded_size", Integer.valueOf(jVar.c0()));
            this.f6226c.A("image_color_space", jVar.z());
            if (dVar instanceof O0.c) {
                this.f6226c.A("bitmap_config", String.valueOf(((O0.c) dVar).C().getConfig()));
            }
            if (dVar != null) {
                dVar.q(this.f6226c.a());
            }
            this.f6226c.A("last_scan_num", Integer.valueOf(i3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(d dVar, C0320q c0320q, int i3, O0.j jVar, int i4) {
            D2.h.f(dVar, "this$0");
            D2.h.f(c0320q, "this$1");
            if (jVar != null) {
                U0.b bVarX = dVar.f6226c.X();
                dVar.f6226c.A("image_format", jVar.D().a());
                Uri uriV = bVarX.v();
                jVar.H0(uriV != null ? uriV.toString() : null);
                EnumC0180n enumC0180nG = bVarX.g();
                if (enumC0180nG == null) {
                    enumC0180nG = c0320q.e();
                }
                boolean zN = AbstractC0306c.n(i4, 16);
                if ((enumC0180nG == EnumC0180n.ALWAYS || (enumC0180nG == EnumC0180n.AUTO && !zN)) && (c0320q.d() || !p021f0.f.o(bVarX.v()))) {
                    I0.h hVarT = bVarX.t();
                    D2.h.e(hVarT, "getRotationOptions(...)");
                    jVar.G0(W0.a.b(hVarT, bVarX.r(), jVar, i3));
                }
                if (dVar.f6226c.e0().G().i()) {
                    dVar.F(jVar);
                }
                dVar.v(jVar, i4, dVar.f6232i);
            }
        }

        private final void v(O0.j jVar, int i3, int i4) {
            String str;
            O0.d dVar;
            int i5 = i3;
            if ((jVar.D() != D0.b.f135b && AbstractC0306c.f(i3)) || this.f6230g || !O0.j.w0(jVar)) {
                return;
            }
            if (D2.h.b(jVar.D(), D0.b.f137d) && C0320q.f6209m.b(jVar, this.f6229f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + jVar.h() + ", h = " + jVar.d() + ", pixel config = " + this.f6229f.f397h + ", max bitmap size = 104857600");
                this.f6228e.i(this.f6226c, "DecodeProducer", illegalStateException, null);
                B(illegalStateException);
                return;
            }
            D0.c cVarD = jVar.D();
            D2.h.e(cVarD, "getImageFormat(...)");
            String strA = cVarD.a();
            String str2 = strA == null ? "unknown" : strA;
            String str3 = jVar.h() + "x" + jVar.d();
            String strValueOf = String.valueOf(jVar.a0());
            boolean zE = AbstractC0306c.e(i3);
            boolean z3 = zE && !AbstractC0306c.n(i5, 8);
            boolean zN = AbstractC0306c.n(i5, 4);
            I0.g gVarR = this.f6226c.X().r();
            if (gVarR != null) {
                str = gVarR.f421a + "x" + gVarR.f422b;
            } else {
                str = "unknown";
            }
            try {
                long jF = this.f6231h.f();
                String string = this.f6226c.X().v().toString();
                D2.h.e(string, "toString(...)");
                int iC0 = (z3 || zN) ? jVar.c0() : x(jVar);
                O0.o oVarZ = (z3 || zN) ? O0.n.f1480d : z();
                this.f6228e.g(this.f6226c, "DecodeProducer");
                try {
                    try {
                        D2.h.c(oVarZ);
                        O0.d dVarD = D(jVar, iC0, oVarZ);
                        try {
                            if (jVar.a0() != 1) {
                                i5 |= 16;
                            }
                            this.f6228e.d(this.f6226c, "DecodeProducer", w(dVarD, jF, oVarZ, zE, str2, str3, str, strValueOf));
                            H(jVar, dVarD, i4);
                            C(dVarD, i5);
                            O0.j.o(jVar);
                        } catch (Exception e4) {
                            e = e4;
                            dVar = dVarD;
                            D2.h.c(oVarZ);
                            this.f6228e.i(this.f6226c, "DecodeProducer", e, w(dVar, jF, oVarZ, zE, str2, str3, str, strValueOf));
                            B(e);
                            O0.j.o(jVar);
                        }
                    } catch (M0.a e5) {
                        O0.j jVarA = e5.a();
                        Y.a.K(this.f6227d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e5.getMessage(), string, jVarA.A(10), Integer.valueOf(jVarA.c0()));
                        throw e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    dVar = null;
                }
            } catch (Throwable th) {
                O0.j.o(jVar);
                throw th;
            }
        }

        private final Map w(O0.d dVar, long j3, O0.o oVar, boolean z3, String str, String str2, String str3, String str4) {
            Map mapA;
            Object obj;
            String string = null;
            if (!this.f6228e.j(this.f6226c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j3);
            String strValueOf2 = String.valueOf(oVar.b());
            String strValueOf3 = String.valueOf(z3);
            if (dVar != null && (mapA = dVar.a()) != null && (obj = mapA.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            String str5 = string;
            if (!(dVar instanceof O0.e)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return X.g.b(map);
            }
            Bitmap bitmapC = ((O0.e) dVar).C();
            D2.h.e(bitmapC, "getUnderlyingBitmap(...)");
            String str6 = bitmapC.getWidth() + "x" + bitmapC.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str6);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapC.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str5 != null) {
                map2.put("non_fatal_decode_error", str5);
            }
            return X.g.b(map2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0306c
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void i(O0.j jVar, int i3) {
            if (!V0.b.d()) {
                boolean zE = AbstractC0306c.e(i3);
                if (zE) {
                    if (jVar == null) {
                        boolean zB = D2.h.b(this.f6226c.y("cached_value_found"), Boolean.TRUE);
                        if (!this.f6226c.e0().G().h() || this.f6226c.d0() == U0.b.c.FULL_FETCH || zB) {
                            B(new p021f0.a("Encoded image is null."));
                            return;
                        }
                    } else if (!jVar.v0()) {
                        B(new p021f0.a("Encoded image is not valid."));
                        return;
                    }
                }
                if (J(jVar, i3)) {
                    boolean zN = AbstractC0306c.n(i3, 4);
                    if (zE || zN || this.f6226c.c0()) {
                        this.f6231h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            V0.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean zE2 = AbstractC0306c.e(i3);
                if (zE2) {
                    if (jVar == null) {
                        boolean zB2 = D2.h.b(this.f6226c.y("cached_value_found"), Boolean.TRUE);
                        if (this.f6226c.e0().G().h()) {
                            if (this.f6226c.d0() != U0.b.c.FULL_FETCH) {
                                if (zB2) {
                                }
                            }
                        }
                        B(new p021f0.a("Encoded image is null."));
                        return;
                    }
                    if (!jVar.v0()) {
                        B(new p021f0.a("Encoded image is not valid."));
                        return;
                    }
                }
                if (J(jVar, i3)) {
                    boolean zN2 = AbstractC0306c.n(i3, 4);
                    if (zE2 || zN2 || this.f6226c.c0()) {
                        this.f6231h.h();
                    }
                    p071r2.r rVar = p071r2.r.f10603a;
                }
            } finally {
                V0.b.b();
            }
        }

        protected final void I(int i3) {
            this.f6232i = i3;
        }

        protected boolean J(O0.j jVar, int i3) {
            return this.f6231h.k(jVar, i3);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        public void g() {
            A();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        public void h(Throwable th) {
            D2.h.f(th, "t");
            B(th);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0323u, com.facebook.imagepipeline.producers.AbstractC0306c
        protected void j(float f3) {
            super.j(f3 * 0.99f);
        }

        protected abstract int x(O0.j jVar);

        protected final int y() {
            return this.f6232i;
        }

        protected abstract O0.o z();
    }

    public C0320q(p001a0.a aVar, Executor executor, M0.c cVar, M0.e eVar, EnumC0180n enumC0180n, boolean z3, boolean z4, e0 e0Var, int i3, C0167a c0167a, Runnable runnable, X.n nVar) {
        D2.h.f(aVar, "byteArrayPool");
        D2.h.f(executor, "executor");
        D2.h.f(cVar, "imageDecoder");
        D2.h.f(eVar, "progressiveJpegConfig");
        D2.h.f(enumC0180n, "downsampleMode");
        D2.h.f(e0Var, "inputProducer");
        D2.h.f(c0167a, "closeableReferenceFactory");
        D2.h.f(nVar, "recoverFromDecoderOOM");
        this.f6210a = aVar;
        this.f6211b = executor;
        this.f6212c = cVar;
        this.f6213d = eVar;
        this.f6214e = enumC0180n;
        this.f6215f = z3;
        this.f6216g = z4;
        this.f6217h = e0Var;
        this.f6218i = i3;
        this.f6219j = c0167a;
        this.f6220k = runnable;
        this.f6221l = nVar;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        D2.h.f(interfaceC0317n, "consumer");
        D2.h.f(f0Var, "context");
        if (!V0.b.d()) {
            U0.b bVarX = f0Var.X();
            this.f6217h.b((p021f0.f.o(bVarX.v()) || U0.c.s(bVarX.v())) ? new c(this, interfaceC0317n, f0Var, new M0.f(this.f6210a), this.f6213d, this.f6216g, this.f6218i) : new b(this, interfaceC0317n, f0Var, this.f6216g, this.f6218i), f0Var);
            return;
        }
        V0.b.a("DecodeProducer#produceResults");
        try {
            U0.b bVarX2 = f0Var.X();
            this.f6217h.b((p021f0.f.o(bVarX2.v()) || U0.c.s(bVarX2.v())) ? new c(this, interfaceC0317n, f0Var, new M0.f(this.f6210a), this.f6213d, this.f6216g, this.f6218i) : new b(this, interfaceC0317n, f0Var, this.f6216g, this.f6218i), f0Var);
            p071r2.r rVar = p071r2.r.f10603a;
        } finally {
            V0.b.b();
        }
    }

    public final C0167a c() {
        return this.f6219j;
    }

    public final boolean d() {
        return this.f6215f;
    }

    public final EnumC0180n e() {
        return this.f6214e;
    }

    public final Executor f() {
        return this.f6211b;
    }

    public final M0.c g() {
        return this.f6212c;
    }

    public final Runnable h() {
        return this.f6220k;
    }

    public final X.n i() {
        return this.f6221l;
    }
}
