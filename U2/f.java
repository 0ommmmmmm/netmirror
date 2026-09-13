package U2;

import D2.q;
import D2.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final m f2490D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final c f2491E = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final U2.j f2492A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final e f2493B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Set f2494C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f2496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f2497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f2498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.e f2502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q2.d f2503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Q2.d f2504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Q2.d f2505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final U2.l f2506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f2508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f2509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f2510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f2511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f2512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m f2513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f2514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f2515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f2516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f2517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f2518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Socket f2519z;

    public static final class a extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f2521f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f2522g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j3) {
            super(str2, false, 2, null);
            this.f2520e = str;
            this.f2521f = fVar;
            this.f2522g = j3;
        }

        @Override // Q2.a
        public long f() {
            boolean z3;
            synchronized (this.f2521f) {
                if (this.f2521f.f2508o < this.f2521f.f2507n) {
                    z3 = true;
                } else {
                    this.f2521f.f2507n++;
                    z3 = false;
                }
            }
            if (z3) {
                this.f2521f.w0(null);
                return -1L;
            }
            this.f2521f.a1(false, 1, 0);
            return this.f2522g;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f2523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b3.k f2525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b3.j f2526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f2527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private U2.l f2528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Q2.e f2531i;

        public b(boolean z3, Q2.e eVar) {
            D2.h.f(eVar, "taskRunner");
            this.f2530h = z3;
            this.f2531i = eVar;
            this.f2527e = d.f2532a;
            this.f2528f = U2.l.f2662a;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f2530h;
        }

        public final String c() {
            String str = this.f2524b;
            if (str == null) {
                D2.h.s("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f2527e;
        }

        public final int e() {
            return this.f2529g;
        }

        public final U2.l f() {
            return this.f2528f;
        }

        public final b3.j g() {
            b3.j jVar = this.f2526d;
            if (jVar == null) {
                D2.h.s("sink");
            }
            return jVar;
        }

        public final Socket h() {
            Socket socket = this.f2523a;
            if (socket == null) {
                D2.h.s("socket");
            }
            return socket;
        }

        public final b3.k i() {
            b3.k kVar = this.f2525c;
            if (kVar == null) {
                D2.h.s("source");
            }
            return kVar;
        }

        public final Q2.e j() {
            return this.f2531i;
        }

        public final b k(d dVar) {
            D2.h.f(dVar, "listener");
            this.f2527e = dVar;
            return this;
        }

        public final b l(int i3) {
            this.f2529g = i3;
            return this;
        }

        public final b m(Socket socket, String str, b3.k kVar, b3.j jVar) {
            String str2;
            D2.h.f(socket, "socket");
            D2.h.f(str, "peerName");
            D2.h.f(kVar, "source");
            D2.h.f(jVar, "sink");
            this.f2523a = socket;
            if (this.f2530h) {
                str2 = N2.c.f1410i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f2524b = str2;
            this.f2525c = kVar;
            this.f2526d = jVar;
            return this;
        }
    }

    public static final class c {
        private c() {
        }

        public final m a() {
            return f.f2490D;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f2533b = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2532a = new a();

        public static final class a extends d {
            a() {
            }

            @Override // U2.f.d
            public void b(U2.i iVar) {
                D2.h.f(iVar, "stream");
                iVar.d(U2.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void a(f fVar, m mVar) {
            D2.h.f(fVar, "connection");
            D2.h.f(mVar, "settings");
        }

        public abstract void b(U2.i iVar);
    }

    public final class e implements U2.h.c, C2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U2.h f2534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f2535c;

        public static final class a extends Q2.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2536e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f2537f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f2538g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ r f2539h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f2540i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m f2541j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ q f2542k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ r f2543l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z3, String str2, boolean z4, e eVar, r rVar, boolean z5, m mVar, q qVar, r rVar2) {
                super(str2, z4);
                this.f2536e = str;
                this.f2537f = z3;
                this.f2538g = eVar;
                this.f2539h = rVar;
                this.f2540i = z5;
                this.f2541j = mVar;
                this.f2542k = qVar;
                this.f2543l = rVar2;
            }

            @Override // Q2.a
            public long f() {
                this.f2538g.f2535c.A0().a(this.f2538g.f2535c, (m) this.f2539h.f189b);
                return -1L;
            }
        }

        public static final class b extends Q2.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2544e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f2545f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ U2.i f2546g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f2547h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ U2.i f2548i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f2549j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f2550k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f2551l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z3, String str2, boolean z4, U2.i iVar, e eVar, U2.i iVar2, int i3, List list, boolean z5) {
                super(str2, z4);
                this.f2544e = str;
                this.f2545f = z3;
                this.f2546g = iVar;
                this.f2547h = eVar;
                this.f2548i = iVar2;
                this.f2549j = i3;
                this.f2550k = list;
                this.f2551l = z5;
            }

            @Override // Q2.a
            public long f() {
                try {
                    this.f2547h.f2535c.A0().b(this.f2546g);
                    return -1L;
                } catch (IOException e4) {
                    W2.j.f2732c.g().k("Http2Connection.Listener failure for " + this.f2547h.f2535c.y0(), 4, e4);
                    try {
                        this.f2546g.d(U2.b.PROTOCOL_ERROR, e4);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends Q2.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2552e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f2553f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f2554g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f2555h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f2556i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z3, String str2, boolean z4, e eVar, int i3, int i4) {
                super(str2, z4);
                this.f2552e = str;
                this.f2553f = z3;
                this.f2554g = eVar;
                this.f2555h = i3;
                this.f2556i = i4;
            }

            @Override // Q2.a
            public long f() {
                this.f2554g.f2535c.a1(true, this.f2555h, this.f2556i);
                return -1L;
            }
        }

        public static final class d extends Q2.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2557e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f2558f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f2559g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f2560h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m f2561i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z3, String str2, boolean z4, e eVar, boolean z5, m mVar) {
                super(str2, z4);
                this.f2557e = str;
                this.f2558f = z3;
                this.f2559g = eVar;
                this.f2560h = z5;
                this.f2561i = mVar;
            }

            @Override // Q2.a
            public long f() {
                this.f2559g.l(this.f2560h, this.f2561i);
                return -1L;
            }
        }

        public e(f fVar, U2.h hVar) {
            D2.h.f(hVar, "reader");
            this.f2535c = fVar;
            this.f2534b = hVar;
        }

        @Override // C2.a
        public /* bridge */ /* synthetic */ Object a() throws Throwable {
            m();
            return p071r2.r.f10603a;
        }

        @Override // U2.h.c
        public void b(int i3, U2.b bVar) {
            D2.h.f(bVar, "errorCode");
            if (this.f2535c.P0(i3)) {
                this.f2535c.O0(i3, bVar);
                return;
            }
            U2.i iVarQ0 = this.f2535c.Q0(i3);
            if (iVarQ0 != null) {
                iVarQ0.y(bVar);
            }
        }

        @Override // U2.h.c
        public void c() {
        }

        @Override // U2.h.c
        public void d(boolean z3, int i3, int i4) {
            if (!z3) {
                Q2.d dVar = this.f2535c.f2503j;
                String str = this.f2535c.y0() + " ping";
                dVar.i(new c(str, true, str, true, this, i3, i4), 0L);
                return;
            }
            synchronized (this.f2535c) {
                try {
                    if (i3 == 1) {
                        this.f2535c.f2508o++;
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            this.f2535c.f2511r++;
                            f fVar = this.f2535c;
                            if (fVar == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            fVar.notifyAll();
                        }
                        p071r2.r rVar = p071r2.r.f10603a;
                    } else {
                        this.f2535c.f2510q++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // U2.h.c
        public void e(boolean z3, int i3, b3.k kVar, int i4) {
            D2.h.f(kVar, "source");
            if (this.f2535c.P0(i3)) {
                this.f2535c.L0(i3, kVar, i4, z3);
                return;
            }
            U2.i iVarE0 = this.f2535c.E0(i3);
            if (iVarE0 == null) {
                this.f2535c.c1(i3, U2.b.PROTOCOL_ERROR);
                long j3 = i4;
                this.f2535c.X0(j3);
                kVar.s(j3);
                return;
            }
            iVarE0.w(kVar, i4);
            if (z3) {
                iVarE0.x(N2.c.f1403b, true);
            }
        }

        @Override // U2.h.c
        public void f(int i3, int i4, int i5, boolean z3) {
        }

        @Override // U2.h.c
        public void g(boolean z3, m mVar) {
            D2.h.f(mVar, "settings");
            Q2.d dVar = this.f2535c.f2503j;
            String str = this.f2535c.y0() + " applyAndAckSettings";
            dVar.i(new d(str, true, str, true, this, z3, mVar), 0L);
        }

        @Override // U2.h.c
        public void h(boolean z3, int i3, int i4, List list) {
            D2.h.f(list, "headerBlock");
            if (this.f2535c.P0(i3)) {
                this.f2535c.M0(i3, list, z3);
                return;
            }
            synchronized (this.f2535c) {
                U2.i iVarE0 = this.f2535c.E0(i3);
                if (iVarE0 != null) {
                    p071r2.r rVar = p071r2.r.f10603a;
                    iVarE0.x(N2.c.M(list), z3);
                    return;
                }
                if (this.f2535c.f2501h) {
                    return;
                }
                if (i3 <= this.f2535c.z0()) {
                    return;
                }
                if (i3 % 2 == this.f2535c.B0() % 2) {
                    return;
                }
                U2.i iVar = new U2.i(i3, this.f2535c, false, z3, N2.c.M(list));
                this.f2535c.S0(i3);
                this.f2535c.F0().put(Integer.valueOf(i3), iVar);
                Q2.d dVarI = this.f2535c.f2502i.i();
                String str = this.f2535c.y0() + '[' + i3 + "] onStream";
                dVarI.i(new b(str, true, str, true, iVar, this, iVarE0, i3, list, z3), 0L);
            }
        }

        @Override // U2.h.c
        public void i(int i3, long j3) {
            if (i3 != 0) {
                U2.i iVarE0 = this.f2535c.E0(i3);
                if (iVarE0 != null) {
                    synchronized (iVarE0) {
                        iVarE0.a(j3);
                        p071r2.r rVar = p071r2.r.f10603a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f2535c) {
                f fVar = this.f2535c;
                fVar.f2518y = fVar.G0() + j3;
                f fVar2 = this.f2535c;
                if (fVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                fVar2.notifyAll();
                p071r2.r rVar2 = p071r2.r.f10603a;
            }
        }

        @Override // U2.h.c
        public void j(int i3, U2.b bVar, b3.l lVar) {
            int i4;
            U2.i[] iVarArr;
            D2.h.f(bVar, "errorCode");
            D2.h.f(lVar, "debugData");
            lVar.v();
            synchronized (this.f2535c) {
                Object[] array = this.f2535c.F0().values().toArray(new U2.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iVarArr = (U2.i[]) array;
                this.f2535c.f2501h = true;
                p071r2.r rVar = p071r2.r.f10603a;
            }
            for (U2.i iVar : iVarArr) {
                if (iVar.j() > i3 && iVar.t()) {
                    iVar.y(U2.b.REFUSED_STREAM);
                    this.f2535c.Q0(iVar.j());
                }
            }
        }

        @Override // U2.h.c
        public void k(int i3, int i4, List list) {
            D2.h.f(list, "requestHeaders");
            this.f2535c.N0(i4, list);
        }

        public final void l(boolean z3, m mVar) {
            f fVar;
            m mVar2;
            U2.i[] iVarArr;
            D2.h.f(mVar, "settings");
            q qVar = new q();
            r rVar = new r();
            r rVar2 = new r();
            synchronized (this.f2535c.H0()) {
                f fVar2 = this.f2535c;
                synchronized (fVar2) {
                    try {
                        m mVarD0 = this.f2535c.D0();
                        if (z3) {
                            mVar2 = mVar;
                        } else {
                            mVar2 = new m();
                            mVar2.g(mVarD0);
                            mVar2.g(mVar);
                            p071r2.r rVar3 = p071r2.r.f10603a;
                        }
                        rVar2.f189b = mVar2;
                        long jC = ((long) mVar2.c()) - ((long) mVarD0.c());
                        qVar.f188b = jC;
                        if (jC == 0 || this.f2535c.F0().isEmpty()) {
                            iVarArr = null;
                        } else {
                            Object[] array = this.f2535c.F0().values().toArray(new U2.i[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            iVarArr = (U2.i[]) array;
                        }
                        rVar.f189b = iVarArr;
                        this.f2535c.T0((m) rVar2.f189b);
                        Q2.d dVar = this.f2535c.f2505l;
                        String str = this.f2535c.y0() + " onSettings";
                        fVar = fVar2;
                        try {
                            dVar.i(new a(str, true, str, true, this, rVar2, z3, mVar, qVar, rVar), 0L);
                            p071r2.r rVar4 = p071r2.r.f10603a;
                            try {
                                this.f2535c.H0().a((m) rVar2.f189b);
                            } catch (IOException e4) {
                                this.f2535c.w0(e4);
                            }
                            p071r2.r rVar5 = p071r2.r.f10603a;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = fVar2;
                    }
                }
            }
            Object obj = rVar.f189b;
            if (((U2.i[]) obj) != null) {
                U2.i[] iVarArr2 = (U2.i[]) obj;
                D2.h.c(iVarArr2);
                for (U2.i iVar : iVarArr2) {
                    synchronized (iVar) {
                        iVar.a(qVar.f188b);
                        p071r2.r rVar6 = p071r2.r.f10603a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [U2.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [U2.h, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void m() throws Throwable {
            U2.b bVar;
            U2.b bVar2 = U2.b.INTERNAL_ERROR;
            IOException e4 = null;
            try {
                try {
                    this.f2534b.o(this);
                    while (this.f2534b.i(false, this)) {
                    }
                    U2.b bVar3 = U2.b.NO_ERROR;
                    try {
                        this.f2535c.v0(bVar3, U2.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e5) {
                        e4 = e5;
                        U2.b bVar4 = U2.b.PROTOCOL_ERROR;
                        f fVar = this.f2535c;
                        fVar.v0(bVar4, bVar4, e4);
                        bVar = fVar;
                    }
                } catch (IOException e6) {
                    e4 = e6;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    this.f2535c.v0(bVar, bVar2, e4);
                    N2.c.j(this.f2534b);
                    throw th;
                }
                bVar2 = this.f2534b;
                N2.c.j(bVar2);
            } catch (Throwable th2) {
                th = th2;
                this.f2535c.v0(bVar, bVar2, e4);
                N2.c.j(this.f2534b);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U2.f$f, reason: collision with other inner class name */
    public static final class C0035f extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2565h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b3.i f2566i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f2567j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f2568k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0035f(String str, boolean z3, String str2, boolean z4, f fVar, int i3, b3.i iVar, int i4, boolean z5) {
            super(str2, z4);
            this.f2562e = str;
            this.f2563f = z3;
            this.f2564g = fVar;
            this.f2565h = i3;
            this.f2566i = iVar;
            this.f2567j = i4;
            this.f2568k = z5;
        }

        @Override // Q2.a
        public long f() {
            try {
                boolean zC = this.f2564g.f2506m.c(this.f2565h, this.f2566i, this.f2567j, this.f2568k);
                if (zC) {
                    this.f2564g.H0().X(this.f2565h, U2.b.CANCEL);
                }
                if (!zC && !this.f2568k) {
                    return -1L;
                }
                synchronized (this.f2564g) {
                    this.f2564g.f2494C.remove(Integer.valueOf(this.f2565h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f2573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f2574j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z3, String str2, boolean z4, f fVar, int i3, List list, boolean z5) {
            super(str2, z4);
            this.f2569e = str;
            this.f2570f = z3;
            this.f2571g = fVar;
            this.f2572h = i3;
            this.f2573i = list;
            this.f2574j = z5;
        }

        @Override // Q2.a
        public long f() {
            boolean zB = this.f2571g.f2506m.b(this.f2572h, this.f2573i, this.f2574j);
            if (zB) {
                try {
                    this.f2571g.H0().X(this.f2572h, U2.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zB && !this.f2574j) {
                return -1L;
            }
            synchronized (this.f2571g) {
                this.f2571g.f2494C.remove(Integer.valueOf(this.f2572h));
            }
            return -1L;
        }
    }

    public static final class h extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2578h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f2579i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z3, String str2, boolean z4, f fVar, int i3, List list) {
            super(str2, z4);
            this.f2575e = str;
            this.f2576f = z3;
            this.f2577g = fVar;
            this.f2578h = i3;
            this.f2579i = list;
        }

        @Override // Q2.a
        public long f() {
            if (!this.f2577g.f2506m.a(this.f2578h, this.f2579i)) {
                return -1L;
            }
            try {
                this.f2577g.H0().X(this.f2578h, U2.b.CANCEL);
                synchronized (this.f2577g) {
                    this.f2577g.f2494C.remove(Integer.valueOf(this.f2578h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class i extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ U2.b f2584i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z3, String str2, boolean z4, f fVar, int i3, U2.b bVar) {
            super(str2, z4);
            this.f2580e = str;
            this.f2581f = z3;
            this.f2582g = fVar;
            this.f2583h = i3;
            this.f2584i = bVar;
        }

        @Override // Q2.a
        public long f() {
            this.f2582g.f2506m.d(this.f2583h, this.f2584i);
            synchronized (this.f2582g) {
                this.f2582g.f2494C.remove(Integer.valueOf(this.f2583h));
                p071r2.r rVar = p071r2.r.f10603a;
            }
            return -1L;
        }
    }

    public static final class j extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2587g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z3, String str2, boolean z4, f fVar) {
            super(str2, z4);
            this.f2585e = str;
            this.f2586f = z3;
            this.f2587g = fVar;
        }

        @Override // Q2.a
        public long f() {
            this.f2587g.a1(false, 2, 0);
            return -1L;
        }
    }

    public static final class k extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ U2.b f2592i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z3, String str2, boolean z4, f fVar, int i3, U2.b bVar) {
            super(str2, z4);
            this.f2588e = str;
            this.f2589f = z3;
            this.f2590g = fVar;
            this.f2591h = i3;
            this.f2592i = bVar;
        }

        @Override // Q2.a
        public long f() {
            try {
                this.f2590g.b1(this.f2591h, this.f2592i);
                return -1L;
            } catch (IOException e4) {
                this.f2590g.w0(e4);
                return -1L;
            }
        }
    }

    public static final class l extends Q2.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f2595g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2596h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f2597i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z3, String str2, boolean z4, f fVar, int i3, long j3) {
            super(str2, z4);
            this.f2593e = str;
            this.f2594f = z3;
            this.f2595g = fVar;
            this.f2596h = i3;
            this.f2597i = j3;
        }

        @Override // Q2.a
        public long f() {
            try {
                this.f2595g.H0().c0(this.f2596h, this.f2597i);
                return -1L;
            } catch (IOException e4) {
                this.f2595g.w0(e4);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f2490D = mVar;
    }

    public f(b bVar) {
        D2.h.f(bVar, "builder");
        boolean zB = bVar.b();
        this.f2495b = zB;
        this.f2496c = bVar.d();
        this.f2497d = new LinkedHashMap();
        String strC = bVar.c();
        this.f2498e = strC;
        this.f2500g = bVar.b() ? 3 : 2;
        Q2.e eVarJ = bVar.j();
        this.f2502i = eVarJ;
        Q2.d dVarI = eVarJ.i();
        this.f2503j = dVarI;
        this.f2504k = eVarJ.i();
        this.f2505l = eVarJ.i();
        this.f2506m = bVar.f();
        m mVar = new m();
        if (bVar.b()) {
            mVar.h(7, 16777216);
        }
        p071r2.r rVar = p071r2.r.f10603a;
        this.f2513t = mVar;
        m mVar2 = f2490D;
        this.f2514u = mVar2;
        this.f2518y = mVar2.c();
        this.f2519z = bVar.h();
        this.f2492A = new U2.j(bVar.g(), zB);
        this.f2493B = new e(this, new U2.h(bVar.i(), zB));
        this.f2494C = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = strC + " ping";
            dVarI.i(new a(str, str, this, nanos), nanos);
        }
    }

    private final U2.i J0(int i3, List list, boolean z3) {
        int i4;
        U2.i iVar;
        boolean z4 = true;
        boolean z5 = !z3;
        synchronized (this.f2492A) {
            try {
                synchronized (this) {
                    try {
                        if (this.f2500g > 1073741823) {
                            U0(U2.b.REFUSED_STREAM);
                        }
                        if (this.f2501h) {
                            throw new U2.a();
                        }
                        i4 = this.f2500g;
                        this.f2500g = i4 + 2;
                        iVar = new U2.i(i4, this, z5, false, null);
                        if (z3 && this.f2517x < this.f2518y && iVar.r() < iVar.q()) {
                            z4 = false;
                        }
                        if (iVar.u()) {
                            this.f2497d.put(Integer.valueOf(i4), iVar);
                        }
                        p071r2.r rVar = p071r2.r.f10603a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 == 0) {
                    this.f2492A.z(z5, i4, list);
                } else {
                    if (this.f2495b) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.f2492A.P(i3, i4, list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z4) {
            this.f2492A.flush();
        }
        return iVar;
    }

    public static /* synthetic */ void W0(f fVar, boolean z3, Q2.e eVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z3 = true;
        }
        if ((i3 & 2) != 0) {
            eVar = Q2.e.f1870h;
        }
        fVar.V0(z3, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(IOException iOException) {
        U2.b bVar = U2.b.PROTOCOL_ERROR;
        v0(bVar, bVar, iOException);
    }

    public final d A0() {
        return this.f2496c;
    }

    public final int B0() {
        return this.f2500g;
    }

    public final m C0() {
        return this.f2513t;
    }

    public final m D0() {
        return this.f2514u;
    }

    public final synchronized U2.i E0(int i3) {
        return (U2.i) this.f2497d.get(Integer.valueOf(i3));
    }

    public final Map F0() {
        return this.f2497d;
    }

    public final long G0() {
        return this.f2518y;
    }

    public final U2.j H0() {
        return this.f2492A;
    }

    public final synchronized boolean I0(long j3) {
        if (this.f2501h) {
            return false;
        }
        return this.f2510q >= this.f2509p || j3 < this.f2512s;
    }

    public final U2.i K0(List list, boolean z3) {
        D2.h.f(list, "requestHeaders");
        return J0(0, list, z3);
    }

    public final void L0(int i3, b3.k kVar, int i4, boolean z3) {
        D2.h.f(kVar, "source");
        b3.i iVar = new b3.i();
        long j3 = i4;
        kVar.g0(j3);
        kVar.x(iVar, j3);
        Q2.d dVar = this.f2504k;
        String str = this.f2498e + '[' + i3 + "] onData";
        dVar.i(new C0035f(str, true, str, true, this, i3, iVar, i4, z3), 0L);
    }

    public final void M0(int i3, List list, boolean z3) {
        D2.h.f(list, "requestHeaders");
        Q2.d dVar = this.f2504k;
        String str = this.f2498e + '[' + i3 + "] onHeaders";
        dVar.i(new g(str, true, str, true, this, i3, list, z3), 0L);
    }

    public final void N0(int i3, List list) {
        D2.h.f(list, "requestHeaders");
        synchronized (this) {
            if (this.f2494C.contains(Integer.valueOf(i3))) {
                c1(i3, U2.b.PROTOCOL_ERROR);
                return;
            }
            this.f2494C.add(Integer.valueOf(i3));
            Q2.d dVar = this.f2504k;
            String str = this.f2498e + '[' + i3 + "] onRequest";
            dVar.i(new h(str, true, str, true, this, i3, list), 0L);
        }
    }

    public final void O0(int i3, U2.b bVar) {
        D2.h.f(bVar, "errorCode");
        Q2.d dVar = this.f2504k;
        String str = this.f2498e + '[' + i3 + "] onReset";
        dVar.i(new i(str, true, str, true, this, i3, bVar), 0L);
    }

    public final boolean P0(int i3) {
        return i3 != 0 && (i3 & 1) == 0;
    }

    public final synchronized U2.i Q0(int i3) {
        U2.i iVar;
        iVar = (U2.i) this.f2497d.remove(Integer.valueOf(i3));
        notifyAll();
        return iVar;
    }

    public final void R0() {
        synchronized (this) {
            long j3 = this.f2510q;
            long j4 = this.f2509p;
            if (j3 < j4) {
                return;
            }
            this.f2509p = j4 + 1;
            this.f2512s = System.nanoTime() + ((long) 1000000000);
            p071r2.r rVar = p071r2.r.f10603a;
            Q2.d dVar = this.f2503j;
            String str = this.f2498e + " ping";
            dVar.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void S0(int i3) {
        this.f2499f = i3;
    }

    public final void T0(m mVar) {
        D2.h.f(mVar, "<set-?>");
        this.f2514u = mVar;
    }

    public final void U0(U2.b bVar) {
        D2.h.f(bVar, "statusCode");
        synchronized (this.f2492A) {
            synchronized (this) {
                if (this.f2501h) {
                    return;
                }
                this.f2501h = true;
                int i3 = this.f2499f;
                p071r2.r rVar = p071r2.r.f10603a;
                this.f2492A.y(i3, bVar, N2.c.f1402a);
            }
        }
    }

    public final void V0(boolean z3, Q2.e eVar) {
        D2.h.f(eVar, "taskRunner");
        if (z3) {
            this.f2492A.i();
            this.f2492A.a0(this.f2513t);
            int iC = this.f2513t.c();
            if (iC != 65535) {
                this.f2492A.c0(0, iC - 65535);
            }
        }
        Q2.d dVarI = eVar.i();
        String str = this.f2498e;
        dVarI.i(new Q2.c(this.f2493B, str, true, str, true), 0L);
    }

    public final synchronized void X0(long j3) {
        long j4 = this.f2515v + j3;
        this.f2515v = j4;
        long j5 = j4 - this.f2516w;
        if (j5 >= this.f2513t.c() / 2) {
            d1(0, j5);
            this.f2516w += j5;
        }
    }

    public final void Y0(int i3, boolean z3, b3.i iVar, long j3) {
        long j4;
        long j5;
        int iMin;
        long j6;
        if (j3 == 0) {
            this.f2492A.o(z3, i3, iVar, 0);
            return;
        }
        while (j3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j4 = this.f2517x;
                            j5 = this.f2518y;
                            if (j4 >= j5) {
                                if (!this.f2497d.containsKey(Integer.valueOf(i3))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j3, j5 - j4), this.f2492A.A());
                j6 = iMin;
                this.f2517x += j6;
                p071r2.r rVar = p071r2.r.f10603a;
            }
            j3 -= j6;
            this.f2492A.o(z3 && j3 == 0, i3, iVar, iMin);
        }
    }

    public final void Z0(int i3, boolean z3, List list) {
        D2.h.f(list, "alternating");
        this.f2492A.z(z3, i3, list);
    }

    public final void a1(boolean z3, int i3, int i4) {
        try {
            this.f2492A.D(z3, i3, i4);
        } catch (IOException e4) {
            w0(e4);
        }
    }

    public final void b1(int i3, U2.b bVar) {
        D2.h.f(bVar, "statusCode");
        this.f2492A.X(i3, bVar);
    }

    public final void c1(int i3, U2.b bVar) {
        D2.h.f(bVar, "errorCode");
        Q2.d dVar = this.f2503j;
        String str = this.f2498e + '[' + i3 + "] writeSynReset";
        dVar.i(new k(str, true, str, true, this, i3, bVar), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v0(U2.b.NO_ERROR, U2.b.CANCEL, null);
    }

    public final void d1(int i3, long j3) {
        Q2.d dVar = this.f2503j;
        String str = this.f2498e + '[' + i3 + "] windowUpdate";
        dVar.i(new l(str, true, str, true, this, i3, j3), 0L);
    }

    public final void flush() {
        this.f2492A.flush();
    }

    public final void v0(U2.b bVar, U2.b bVar2, IOException iOException) {
        int i3;
        U2.i[] iVarArr;
        D2.h.f(bVar, "connectionCode");
        D2.h.f(bVar2, "streamCode");
        if (N2.c.f1409h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            D2.h.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            U0(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f2497d.isEmpty()) {
                    iVarArr = null;
                } else {
                    Object[] array = this.f2497d.values().toArray(new U2.i[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    iVarArr = (U2.i[]) array;
                    this.f2497d.clear();
                }
                p071r2.r rVar = p071r2.r.f10603a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (U2.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2492A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f2519z.close();
        } catch (IOException unused4) {
        }
        this.f2503j.n();
        this.f2504k.n();
        this.f2505l.n();
    }

    public final boolean x0() {
        return this.f2495b;
    }

    public final String y0() {
        return this.f2498e;
    }

    public final int z0() {
        return this.f2499f;
    }
}
