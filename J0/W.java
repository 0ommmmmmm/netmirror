package J0;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.C0304a;
import com.facebook.imagepipeline.producers.C0310g;
import com.facebook.imagepipeline.producers.C0311h;
import com.facebook.imagepipeline.producers.C0312i;
import com.facebook.imagepipeline.producers.C0314k;
import com.facebook.imagepipeline.producers.C0315l;
import com.facebook.imagepipeline.producers.C0318o;
import com.facebook.imagepipeline.producers.C0319p;
import com.facebook.imagepipeline.producers.C0320q;
import com.facebook.imagepipeline.producers.C0322t;
import com.facebook.imagepipeline.producers.C0325w;
import com.facebook.imagepipeline.producers.C0326x;
import com.facebook.imagepipeline.producers.C0328z;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.v0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f525K = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Lazy f526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Lazy f527B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Lazy f528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Lazy f529D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Lazy f530E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Lazy f531F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Lazy f532G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Lazy f533H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Lazy f534I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Lazy f535J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y f538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q0 f541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EnumC0180n f542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final W0.d f546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Lazy f559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Lazy f560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Lazy f561z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Uri uri) {
            String string = uri.toString();
            D2.h.e(string, "toString(...)");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            D2.h.e(strSubstring, "substring(...)");
            return strSubstring + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(U0.b bVar) {
            X.k.b(Boolean.valueOf(bVar.k().b() <= U0.b.c.ENCODED_MEMORY_CACHE.b()));
        }

        private a() {
        }
    }

    public W(ContentResolver contentResolver, C c4, Y y3, boolean z3, boolean z4, q0 q0Var, EnumC0180n enumC0180n, boolean z5, boolean z6, boolean z7, W0.d dVar, boolean z8, boolean z9, boolean z10, Set<? extends C0318o> set) {
        D2.h.f(contentResolver, "contentResolver");
        D2.h.f(c4, "producerFactory");
        D2.h.f(y3, "networkFetcher");
        D2.h.f(q0Var, "threadHandoffProducerQueue");
        D2.h.f(enumC0180n, "downsampleMode");
        D2.h.f(dVar, "imageTranscoderFactory");
        this.f536a = contentResolver;
        this.f537b = c4;
        this.f538c = y3;
        this.f539d = z3;
        this.f540e = z4;
        this.f541f = q0Var;
        this.f542g = enumC0180n;
        this.f543h = z5;
        this.f544i = z6;
        this.f545j = z7;
        this.f546k = dVar;
        this.f547l = z8;
        this.f548m = z9;
        this.f549n = z10;
        this.f550o = set;
        this.f551p = new LinkedHashMap();
        this.f552q = new LinkedHashMap();
        this.f553r = new LinkedHashMap();
        this.f554s = p071r2.d.a(new C2.a() { // from class: J0.D
            @Override // C2.a
            public final Object a() {
                return W.b0(this.f507b);
            }
        });
        this.f555t = p071r2.d.a(new C2.a() { // from class: J0.V
            @Override // C2.a
            public final Object a() {
                return W.V(this.f524b);
            }
        });
        this.f556u = p071r2.d.a(new C2.a() { // from class: J0.E
            @Override // C2.a
            public final Object a() {
                return W.T(this.f508b);
            }
        });
        this.f557v = p071r2.d.a(new C2.a() { // from class: J0.F
            @Override // C2.a
            public final Object a() {
                return W.c0(this.f509b);
            }
        });
        this.f558w = p071r2.d.a(new C2.a() { // from class: J0.G
            @Override // C2.a
            public final Object a() {
                return W.u(this.f510b);
            }
        });
        this.f559x = p071r2.d.a(new C2.a() { // from class: J0.H
            @Override // C2.a
            public final Object a() {
                return W.d0(this.f511b);
            }
        });
        this.f560y = p071r2.d.a(new C2.a() { // from class: J0.I
            @Override // C2.a
            public final Object a() {
                return W.v(this.f512b);
            }
        });
        this.f561z = p071r2.d.a(new C2.a() { // from class: J0.J
            @Override // C2.a
            public final Object a() {
                return W.W(this.f513b);
            }
        });
        this.f526A = p071r2.d.a(new C2.a() { // from class: J0.K
            @Override // C2.a
            public final Object a() {
                return W.t(this.f514b);
            }
        });
        this.f527B = p071r2.d.a(new C2.a() { // from class: J0.L
            @Override // C2.a
            public final Object a() {
                return W.s(this.f515b);
            }
        });
        this.f528C = p071r2.d.a(new C2.a() { // from class: J0.M
            @Override // C2.a
            public final Object a() {
                return W.X(this.f516b);
            }
        });
        this.f529D = p071r2.d.a(new C2.a() { // from class: J0.N
            @Override // C2.a
            public final Object a() {
                return W.a0(this.f517b);
            }
        });
        this.f530E = p071r2.d.a(new C2.a() { // from class: J0.O
            @Override // C2.a
            public final Object a() {
                return W.U(this.f518b);
            }
        });
        this.f531F = p071r2.d.a(new C2.a() { // from class: J0.P
            @Override // C2.a
            public final Object a() {
                return W.Z(this.f519b);
            }
        });
        this.f532G = p071r2.d.a(new C2.a() { // from class: J0.Q
            @Override // C2.a
            public final Object a() {
                return W.n0(this.f520b);
            }
        });
        this.f533H = p071r2.d.a(new C2.a() { // from class: J0.S
            @Override // C2.a
            public final Object a() {
                return W.Y(this.f521b);
            }
        });
        this.f534I = p071r2.d.a(new C2.a() { // from class: J0.T
            @Override // C2.a
            public final Object a() {
                return W.S(this.f522b);
            }
        });
        this.f535J = p071r2.d.a(new C2.a() { // from class: J0.U
            @Override // C2.a
            public final Object a() {
                return W.w(this.f523b);
            }
        });
    }

    private final e0 A(U0.b bVar) {
        e0 e0VarO;
        if (!V0.b.d()) {
            Uri uriV = bVar.v();
            D2.h.e(uriV, "getSourceUri(...)");
            if (uriV == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW = bVar.w();
            if (iW == 0) {
                return O();
            }
            switch (iW) {
                case 2:
                    return bVar.i() ? M() : N();
                case 3:
                    return bVar.i() ? M() : K();
                case 4:
                    if (bVar.i()) {
                        return M();
                    }
                    return Z.a.c(this.f536a.getType(uriV)) ? N() : I();
                case 5:
                    return H();
                case 6:
                    return L();
                case 7:
                    return D();
                case 8:
                    return R();
                default:
                    Set set = this.f550o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            e0 e0VarB = ((C0318o) it.next()).b(bVar, this, this.f537b, this.f541f, this.f547l, this.f548m);
                            if (e0VarB != null) {
                                return e0VarB;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f525K.c(uriV));
            }
        }
        V0.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriV2 = bVar.v();
            D2.h.e(uriV2, "getSourceUri(...)");
            if (uriV2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW2 = bVar.w();
            if (iW2 != 0) {
                switch (iW2) {
                    case 2:
                        if (bVar.i()) {
                            e0 e0VarM = M();
                            V0.b.b();
                            return e0VarM;
                        }
                        e0VarO = N();
                        break;
                    case 3:
                        if (bVar.i()) {
                            e0 e0VarM2 = M();
                            V0.b.b();
                            return e0VarM2;
                        }
                        e0VarO = K();
                        break;
                    case 4:
                        if (bVar.i()) {
                            e0 e0VarM3 = M();
                            V0.b.b();
                            return e0VarM3;
                        }
                        if (Z.a.c(this.f536a.getType(uriV2))) {
                            e0 e0VarN = N();
                            V0.b.b();
                            return e0VarN;
                        }
                        e0VarO = I();
                        break;
                    case 5:
                        e0VarO = H();
                        break;
                    case 6:
                        e0VarO = L();
                        break;
                    case 7:
                        e0VarO = D();
                        break;
                    case 8:
                        e0VarO = R();
                        break;
                    default:
                        Set set2 = this.f550o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                e0 e0VarB2 = ((C0318o) it2.next()).b(bVar, this, this.f537b, this.f541f, this.f547l, this.f548m);
                                if (e0VarB2 != null) {
                                    V0.b.b();
                                    return e0VarB2;
                                }
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f525K.c(uriV2));
                }
            } else {
                e0VarO = O();
            }
            V0.b.b();
            return e0VarO;
        } catch (Throwable th) {
            V0.b.b();
            throw th;
        }
    }

    private final synchronized e0 B(e0 e0Var) {
        e0 e0VarF;
        e0VarF = (e0) this.f553r.get(e0Var);
        if (e0VarF == null) {
            e0VarF = this.f537b.f(e0Var);
            this.f553r.put(e0Var, e0VarF);
        }
        return e0VarF;
    }

    private final synchronized e0 F(e0 e0Var) {
        C0322t c0322tK;
        c0322tK = this.f537b.k(e0Var);
        D2.h.e(c0322tK, "newDelayProducer(...)");
        return c0322tK;
    }

    private final synchronized e0 Q(e0 e0Var) {
        e0 e0VarA;
        e0VarA = (e0) this.f551p.get(e0Var);
        if (e0VarA == null) {
            c0 c0VarB = this.f537b.B(e0Var);
            D2.h.e(c0VarB, "newPostprocessorProducer(...)");
            e0VarA = this.f537b.A(c0VarB);
            this.f551p.put(e0Var, e0VarA);
        }
        return e0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 S(W w3) {
        D2.h.f(w3, "this$0");
        com.facebook.imagepipeline.producers.I iQ = w3.f537b.q();
        D2.h.e(iQ, "newLocalAssetFetchProducer(...)");
        return w3.g0(iQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 T(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return new k0(w3.x());
        }
        V0.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new k0(w3.x());
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 U(W w3) {
        D2.h.f(w3, "this$0");
        com.facebook.imagepipeline.producers.J jR = w3.f537b.r();
        D2.h.e(jR, "newLocalContentUriFetchProducer(...)");
        return w3.h0(jR, new v0[]{w3.f537b.s(), w3.f537b.t()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 V(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return new k0(w3.y());
        }
        V0.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new k0(w3.y());
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 W(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return w3.f537b.E(w3.y());
        }
        V0.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return w3.f537b.E(w3.y());
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 X(W w3) {
        D2.h.f(w3, "this$0");
        com.facebook.imagepipeline.producers.N nU = w3.f537b.u();
        D2.h.e(nU, "newLocalFileFetchProducer(...)");
        return w3.g0(nU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 Y(W w3) {
        D2.h.f(w3, "this$0");
        com.facebook.imagepipeline.producers.O oV = w3.f537b.v();
        D2.h.e(oV, "newLocalResourceFetchProducer(...)");
        return w3.g0(oV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 Z(W w3) throws Throwable {
        D2.h.f(w3, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.T tW = w3.f537b.w();
        D2.h.e(tW, "newLocalThumbnailBitmapSdk29Producer(...)");
        return w3.e0(tW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 a0(W w3) {
        D2.h.f(w3, "this$0");
        com.facebook.imagepipeline.producers.U uX = w3.f537b.x();
        D2.h.e(uX, "newLocalVideoThumbnailProducer(...)");
        return w3.e0(uX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 b0(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return new k0(w3.z());
        }
        V0.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new k0(w3.z());
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 c0(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return w3.f0(w3.C());
        }
        V0.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return w3.f0(w3.C());
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 d0(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return w3.f537b.E(w3.z());
        }
        V0.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return w3.f537b.E(w3.z());
        } finally {
            V0.b.b();
        }
    }

    private final e0 e0(e0 e0Var) {
        C0312i c0312iE = this.f537b.e(e0Var);
        D2.h.e(c0312iE, "newBitmapMemoryCacheProducer(...)");
        C0311h c0311hD = this.f537b.d(c0312iE);
        D2.h.e(c0311hD, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        e0 e0VarB = this.f537b.b(c0311hD, this.f541f);
        D2.h.e(e0VarB, "newBackgroundThreadHandoffProducer(...)");
        if (!this.f547l && !this.f548m) {
            C0310g c0310gC = this.f537b.c(e0VarB);
            D2.h.e(c0310gC, "newBitmapMemoryCacheGetProducer(...)");
            return c0310gC;
        }
        C0310g c0310gC2 = this.f537b.c(e0VarB);
        D2.h.e(c0310gC2, "newBitmapMemoryCacheGetProducer(...)");
        C0314k c0314kG = this.f537b.g(c0310gC2);
        D2.h.e(c0314kG, "newBitmapProbeProducer(...)");
        return c0314kG;
    }

    private final e0 g0(e0 e0Var) {
        return h0(e0Var, new v0[]{this.f537b.t()});
    }

    private final e0 h0(e0 e0Var, v0[] v0VarArr) {
        return f0(m0(k0(e0Var), v0VarArr));
    }

    private final e0 j0(e0 e0Var) {
        C0326x c0326xM;
        C0326x c0326xM2;
        if (!V0.b.d()) {
            if (this.f544i) {
                Z z3 = this.f537b.z(e0Var);
                D2.h.e(z3, "newPartialDiskCacheProducer(...)");
                c0326xM2 = this.f537b.m(z3);
            } else {
                c0326xM2 = this.f537b.m(e0Var);
            }
            D2.h.c(c0326xM2);
            C0325w c0325wL = this.f537b.l(c0326xM2);
            D2.h.e(c0325wL, "newDiskCacheReadProducer(...)");
            return c0325wL;
        }
        V0.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f544i) {
                Z z4 = this.f537b.z(e0Var);
                D2.h.e(z4, "newPartialDiskCacheProducer(...)");
                c0326xM = this.f537b.m(z4);
            } else {
                c0326xM = this.f537b.m(e0Var);
            }
            D2.h.c(c0326xM);
            C0325w c0325wL2 = this.f537b.l(c0326xM);
            D2.h.e(c0325wL2, "newDiskCacheReadProducer(...)");
            return c0325wL2;
        } finally {
            V0.b.b();
        }
    }

    private final e0 k0(e0 e0Var) {
        if (this.f545j) {
            e0Var = j0(e0Var);
        }
        e0 e0VarO = this.f537b.o(e0Var);
        D2.h.e(e0VarO, "newEncodedMemoryCacheProducer(...)");
        if (!this.f548m) {
            C0328z c0328zN = this.f537b.n(e0VarO);
            D2.h.e(c0328zN, "newEncodedCacheKeyMultiplexProducer(...)");
            return c0328zN;
        }
        com.facebook.imagepipeline.producers.B bP = this.f537b.p(e0VarO);
        D2.h.e(bP, "newEncodedProbeProducer(...)");
        C0328z c0328zN2 = this.f537b.n(bP);
        D2.h.e(c0328zN2, "newEncodedCacheKeyMultiplexProducer(...)");
        return c0328zN2;
    }

    private final e0 l0(v0[] v0VarArr) {
        u0 u0VarG = this.f537b.G(v0VarArr);
        D2.h.e(u0VarG, "newThumbnailBranchProducer(...)");
        l0 l0VarD = this.f537b.D(u0VarG, true, this.f546k);
        D2.h.e(l0VarD, "newResizeAndRotateProducer(...)");
        return l0VarD;
    }

    private final e0 m0(e0 e0Var, v0[] v0VarArr) {
        C0304a c0304aA = C.a(e0Var);
        D2.h.e(c0304aA, "newAddImageTransformMetaDataProducer(...)");
        s0 s0VarF = this.f537b.F(this.f537b.D(c0304aA, true, this.f546k));
        D2.h.e(s0VarF, "newThrottlingProducer(...)");
        C0315l c0315lH = C.h(l0(v0VarArr), s0VarF);
        D2.h.e(c0315lH, "newBranchOnSeparateImagesProducer(...)");
        return c0315lH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 n0(W w3) {
        D2.h.f(w3, "this$0");
        j0 j0VarC = w3.f537b.C();
        D2.h.e(j0VarC, "newQualifiedResourceFetchProducer(...)");
        return w3.g0(j0VarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 s(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            com.facebook.imagepipeline.producers.J jR = w3.f537b.r();
            D2.h.e(jR, "newLocalContentUriFetchProducer(...)");
            return w3.f537b.b(w3.k0(jR), w3.f541f);
        }
        V0.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.J jR2 = w3.f537b.r();
            D2.h.e(jR2, "newLocalContentUriFetchProducer(...)");
            return w3.f537b.b(w3.k0(jR2), w3.f541f);
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 t(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            com.facebook.imagepipeline.producers.N nU = w3.f537b.u();
            D2.h.e(nU, "newLocalFileFetchProducer(...)");
            return w3.f537b.b(w3.k0(nU), w3.f541f);
        }
        V0.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.N nU2 = w3.f537b.u();
            D2.h.e(nU2, "newLocalFileFetchProducer(...)");
            return w3.f537b.b(w3.k0(nU2), w3.f541f);
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 u(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return w3.f537b.b(w3.C(), w3.f541f);
        }
        V0.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return w3.f537b.b(w3.C(), w3.f541f);
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 v(W w3) {
        D2.h.f(w3, "this$0");
        if (!V0.b.d()) {
            return w3.i0(w3.f538c);
        }
        V0.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return w3.i0(w3.f538c);
        } finally {
            V0.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 w(W w3) {
        D2.h.f(w3, "this$0");
        C0319p c0319pI = w3.f537b.i();
        D2.h.e(c0319pI, "newDataFetchProducer(...)");
        return w3.f0(w3.f537b.D(C.a(c0319pI), true, w3.f546k));
    }

    public final e0 C() {
        return (e0) this.f560y.getValue();
    }

    public final e0 D() {
        return (e0) this.f535J.getValue();
    }

    public final e0 E(U0.b bVar) {
        D2.h.f(bVar, "imageRequest");
        if (!V0.b.d()) {
            e0 e0VarA = A(bVar);
            if (bVar.l() != null) {
                e0VarA = Q(e0VarA);
            }
            if (this.f543h) {
                e0VarA = B(e0VarA);
            }
            return (!this.f549n || bVar.e() <= 0) ? e0VarA : F(e0VarA);
        }
        V0.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            e0 e0VarA2 = A(bVar);
            if (bVar.l() != null) {
                e0VarA2 = Q(e0VarA2);
            }
            if (this.f543h) {
                e0VarA2 = B(e0VarA2);
            }
            if (this.f549n && bVar.e() > 0) {
                e0VarA2 = F(e0VarA2);
            }
            return e0VarA2;
        } finally {
            V0.b.b();
        }
    }

    public final e0 G(U0.b bVar) {
        D2.h.f(bVar, "imageRequest");
        a aVar = f525K;
        aVar.d(bVar);
        int iW = bVar.w();
        if (iW == 0) {
            return P();
        }
        if (iW == 2 || iW == 3) {
            return J();
        }
        Uri uriV = bVar.v();
        D2.h.e(uriV, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(uriV));
    }

    public final e0 H() {
        return (e0) this.f534I.getValue();
    }

    public final e0 I() {
        return (e0) this.f530E.getValue();
    }

    public final e0 J() {
        Object value = this.f561z.getValue();
        D2.h.e(value, "getValue(...)");
        return (e0) value;
    }

    public final e0 K() {
        return (e0) this.f528C.getValue();
    }

    public final e0 L() {
        return (e0) this.f533H.getValue();
    }

    public final e0 M() {
        return (e0) this.f531F.getValue();
    }

    public final e0 N() {
        return (e0) this.f529D.getValue();
    }

    public final e0 O() {
        return (e0) this.f557v.getValue();
    }

    public final e0 P() {
        Object value = this.f559x.getValue();
        D2.h.e(value, "getValue(...)");
        return (e0) value;
    }

    public final e0 R() {
        return (e0) this.f532G.getValue();
    }

    public final e0 f0(e0 e0Var) {
        D2.h.f(e0Var, "inputProducer");
        if (!V0.b.d()) {
            C0320q c0320qJ = this.f537b.j(e0Var);
            D2.h.e(c0320qJ, "newDecodeProducer(...)");
            return e0(c0320qJ);
        }
        V0.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C0320q c0320qJ2 = this.f537b.j(e0Var);
            D2.h.e(c0320qJ2, "newDecodeProducer(...)");
            return e0(c0320qJ2);
        } finally {
            V0.b.b();
        }
    }

    public final synchronized e0 i0(Y y3) {
        try {
            D2.h.f(y3, "networkFetcher");
            boolean z3 = false;
            if (!V0.b.d()) {
                e0 e0VarY = this.f537b.y(y3);
                D2.h.e(e0VarY, "newNetworkFetchProducer(...)");
                C0304a c0304aA = C.a(k0(e0VarY));
                D2.h.e(c0304aA, "newAddImageTransformMetaDataProducer(...)");
                C c4 = this.f537b;
                if (this.f539d && this.f542g != EnumC0180n.NEVER) {
                    z3 = true;
                }
                return c4.D(c0304aA, z3, this.f546k);
            }
            V0.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                e0 e0VarY2 = this.f537b.y(y3);
                D2.h.e(e0VarY2, "newNetworkFetchProducer(...)");
                C0304a c0304aA2 = C.a(k0(e0VarY2));
                D2.h.e(c0304aA2, "newAddImageTransformMetaDataProducer(...)");
                C c5 = this.f537b;
                if (this.f539d && this.f542g != EnumC0180n.NEVER) {
                    z3 = true;
                }
                l0 l0VarD = c5.D(c0304aA2, z3, this.f546k);
                V0.b.b();
                return l0VarD;
            } catch (Throwable th) {
                V0.b.b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final e0 x() {
        Object value = this.f527B.getValue();
        D2.h.e(value, "getValue(...)");
        return (e0) value;
    }

    public final e0 y() {
        Object value = this.f526A.getValue();
        D2.h.e(value, "getValue(...)");
        return (e0) value;
    }

    public final e0 z() {
        Object value = this.f558w.getValue();
        D2.h.e(value, "getValue(...)");
        return (e0) value;
    }
}
