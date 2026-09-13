package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.react.uimanager.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0415r0 implements InterfaceC0414q0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final com.facebook.yoga.c f7607x = C0421u0.f7632a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private B0 f7611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7612e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f7614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0415r0 f7615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0415r0 f7616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7617j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C0415r0 f7619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f7620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7624q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float[] f7626s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.facebook.yoga.r f7628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f7629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f7630w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7613f = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7618k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean[] f7627t = new boolean[9];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0431z0 f7625r = new C0431z0(0.0f);

    public C0415r0() {
        float[] fArr = new float[9];
        this.f7626s = fArr;
        if (R()) {
            this.f7628u = null;
            return;
        }
        com.facebook.yoga.r rVarA = (com.facebook.yoga.r) b1.b().b();
        rVarA = rVarA == null ? com.facebook.yoga.s.a(f7607x) : rVarA;
        this.f7628u = rVarA;
        rVarA.B(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private int n0() {
        EnumC0382a0 enumC0382a0M = m();
        if (enumC0382a0M == EnumC0382a0.NONE) {
            return this.f7618k;
        }
        if (enumC0382a0M == EnumC0382a0.LEAF) {
            return this.f7618k + 1;
        }
        return 1;
    }

    private void t1(int i3) {
        if (m() != EnumC0382a0.PARENT) {
            for (C0415r0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f7618k += i3;
                if (parent.m() == EnumC0382a0.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void u1() {
        for (int i3 = 0; i3 <= 8; i3++) {
            if (i3 == 0 || i3 == 2 || i3 == 4 || i3 == 5) {
                if (com.facebook.yoga.g.a(this.f7626s[i3]) && com.facebook.yoga.g.a(this.f7626s[6]) && com.facebook.yoga.g.a(this.f7626s[8])) {
                    this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7625r.b(i3));
                } else if (this.f7627t[i3]) {
                    this.f7628u.f0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
                } else {
                    this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
                }
            } else if (i3 == 1 || i3 == 3) {
                if (com.facebook.yoga.g.a(this.f7626s[i3]) && com.facebook.yoga.g.a(this.f7626s[7]) && com.facebook.yoga.g.a(this.f7626s[8])) {
                    this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7625r.b(i3));
                } else if (this.f7627t[i3]) {
                    this.f7628u.f0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
                } else {
                    this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
                }
            } else if (com.facebook.yoga.g.a(this.f7626s[i3])) {
                this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7625r.b(i3));
            } else if (this.f7627t[i3]) {
                this.f7628u.f0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
            } else {
                this.f7628u.e0(com.facebook.yoga.j.b(i3), this.f7626s[i3]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final float A() {
        return this.f7628u.l();
    }

    public void A0(M0 m3) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void B(float f3, float f4) {
        this.f7628u.c(f3, f4);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C0415r0 e(int i3) {
        ArrayList arrayList = this.f7614g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i3 + " out of bounds: node has no children");
        }
        C0415r0 c0415r0 = (C0415r0) arrayList.remove(i3);
        c0415r0.f7615h = null;
        if (this.f7628u != null && !w0()) {
            this.f7628u.t(i3);
        }
        y0();
        int iN0 = c0415r0.n0();
        this.f7618k -= iN0;
        t1(-iN0);
        return c0415r0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final int C() {
        ArrayList arrayList = this.f7614g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final C0415r0 I(int i3) {
        p002a1.a.c(this.f7620m);
        C0415r0 c0415r0 = (C0415r0) this.f7620m.remove(i3);
        c0415r0.f7619l = null;
        return c0415r0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public int D() {
        return this.f7621n;
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f7628u.v(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public Iterable E() {
        if (v0()) {
            return null;
        }
        return this.f7614g;
    }

    public void E0(com.facebook.yoga.a aVar) {
        this.f7628u.w(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void F(float f3, float f4, M0 m3, C0386c0 c0386c0) {
        if (this.f7613f) {
            A0(m3);
        }
        if (o0()) {
            float fJ = J();
            float fA = A();
            float f5 = f3 + fJ;
            int iRound = Math.round(f5);
            float f6 = f4 + fA;
            int iRound2 = Math.round(f6);
            int iRound3 = Math.round(f5 + e0());
            int iRound4 = Math.round(f6 + u());
            int iRound5 = Math.round(fJ);
            int iRound6 = Math.round(fA);
            int i3 = iRound3 - iRound;
            int i4 = iRound4 - iRound2;
            boolean z3 = (iRound5 == this.f7621n && iRound6 == this.f7622o && i3 == this.f7623p && i4 == this.f7624q) ? false : true;
            this.f7621n = iRound5;
            this.f7622o = iRound6;
            this.f7623p = i3;
            this.f7624q = i4;
            if (z3) {
                if (c0386c0 != null) {
                    c0386c0.l(this);
                } else {
                    m3.P(getParent().H(), H(), D(), j(), a(), b(), getLayoutDirection());
                }
            }
        }
    }

    public void F0(com.facebook.yoga.a aVar) {
        this.f7628u.x(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void G() {
        if (C() == 0) {
            return;
        }
        int iN0 = 0;
        for (int iC = C() - 1; iC >= 0; iC--) {
            if (this.f7628u != null && !w0()) {
                this.f7628u.t(iC);
            }
            C0415r0 c0415r0N = N(iC);
            c0415r0N.f7615h = null;
            iN0 += c0415r0N.n0();
            c0415r0N.f();
        }
        ((ArrayList) p002a1.a.c(this.f7614g)).clear();
        y0();
        this.f7618k -= iN0;
        t1(-iN0);
    }

    public void G0(com.facebook.yoga.b bVar) {
        this.f7628u.z(bVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final int H() {
        return this.f7608a;
    }

    public void H0(int i3, float f3) {
        this.f7628u.A(com.facebook.yoga.j.b(i3), f3);
    }

    public void I0(float f3) {
        this.f7628u.L(com.facebook.yoga.m.COLUMN, f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final float J() {
        return this.f7628u.k();
    }

    public void J0(float f3) {
        this.f7628u.M(com.facebook.yoga.m.COLUMN, f3);
    }

    public void K0(int i3, float f3) {
        this.f7625r.c(i3, f3);
        u1();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void L() {
        ArrayList arrayList = this.f7620m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0415r0) this.f7620m.get(size)).f7619l = null;
            }
            this.f7620m.clear();
        }
    }

    public void L0(com.facebook.yoga.i iVar) {
        this.f7628u.D(iVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void M() {
        B(Float.NaN, Float.NaN);
    }

    public void M0(float f3) {
        this.f7628u.F(f3);
    }

    public void N0() {
        this.f7628u.G();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void O(C0386c0 c0386c0) {
    }

    public void O0(float f3) {
        this.f7628u.H(f3);
    }

    public void P0(com.facebook.yoga.l lVar) {
        this.f7628u.I(lVar);
    }

    public void Q0(com.facebook.yoga.x xVar) {
        this.f7628u.m0(xVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public boolean R() {
        return false;
    }

    public void R0(float f3) {
        this.f7628u.L(com.facebook.yoga.m.ALL, f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void S(int i3, float f3) {
        this.f7626s[i3] = f3;
        this.f7627t[i3] = false;
        u1();
    }

    public void S0(float f3) {
        this.f7628u.L(com.facebook.yoga.m.ALL, f3);
    }

    public void T0(com.facebook.yoga.n nVar) {
        this.f7628u.Q(nVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final int U() {
        ArrayList arrayList = this.f7620m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final void w(C0415r0 c0415r0) {
        this.f7616i = c0415r0;
    }

    public void V0(int i3, float f3) {
        this.f7628u.R(com.facebook.yoga.j.b(i3), f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void W(boolean z3) {
        p002a1.a.b(getParent() == null, "Must remove from no opt parent first");
        p002a1.a.b(this.f7619l == null, "Must remove from native parent first");
        p002a1.a.b(U() == 0, "Must remove all native children first");
        this.f7617j = z3;
    }

    public void W0(int i3) {
        this.f7628u.S(com.facebook.yoga.j.b(i3));
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void X(C0417s0 c0417s0) {
        R0.g(this, c0417s0);
        z0();
    }

    public void X0(int i3, float f3) {
        this.f7628u.T(com.facebook.yoga.j.b(i3), f3);
    }

    public void Y0(com.facebook.yoga.o oVar) {
        this.f7628u.Y(oVar);
    }

    public void Z0(com.facebook.yoga.u uVar) {
        this.f7628u.d0(uVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public int a() {
        return this.f7623p;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final boolean a0() {
        return this.f7617j;
    }

    public void a1(int i3, float f3) {
        this.f7626s[i3] = f3;
        this.f7627t[i3] = !com.facebook.yoga.g.a(f3);
        u1();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public int b() {
        return this.f7624q;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void b0(int i3) {
        this.f7610c = i3;
    }

    public void b1(int i3, float f3) {
        this.f7628u.g0(com.facebook.yoga.j.b(i3), f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final YogaValue c() {
        return this.f7628u.m();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void c0(B0 b4) {
        this.f7611d = b4;
    }

    public void c1(int i3, float f3) {
        this.f7628u.h0(com.facebook.yoga.j.b(i3), f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void d() {
        this.f7613f = false;
        if (o0()) {
            x0();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void d0(float f3) {
        this.f7628u.j0(f3);
    }

    public void d1(com.facebook.yoga.v vVar) {
        this.f7628u.i0(vVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final float e0() {
        return this.f7628u.j();
    }

    public void e1(float f3) {
        this.f7628u.L(com.facebook.yoga.m.ROW, f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void f() {
        com.facebook.yoga.r rVar = this.f7628u;
        if (rVar != null) {
            rVar.u();
            b1.b().a(this.f7628u);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void o(C0415r0 c0415r0, int i3) {
        if (this.f7614g == null) {
            this.f7614g = new ArrayList(4);
        }
        this.f7614g.add(i3, c0415r0);
        c0415r0.f7615h = this;
        if (this.f7628u != null && !w0()) {
            com.facebook.yoga.r rVar = c0415r0.f7628u;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + c0415r0.toString() + "' to a '" + toString() + "')");
            }
            this.f7628u.b(rVar, i3);
        }
        y0();
        int iN0 = c0415r0.n0();
        this.f7618k += iN0;
        t1(iN0);
    }

    public void f1(float f3) {
        this.f7628u.M(com.facebook.yoga.m.ROW, f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void g(float f3) {
        this.f7628u.N(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Z(C0415r0 c0415r0, int i3) {
        p002a1.a.a(m() == EnumC0382a0.PARENT);
        p002a1.a.a(c0415r0.m() != EnumC0382a0.NONE);
        if (this.f7620m == null) {
            this.f7620m = new ArrayList(4);
        }
        this.f7620m.add(i3, c0415r0);
        c0415r0.f7619l = this;
    }

    public void g1(float f3) {
        this.f7628u.y(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public Integer getHeightMeasureSpec() {
        return this.f7630w;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.f7628u.f();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public Integer getWidthMeasureSpec() {
        return this.f7629v;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void h(int i3, int i4) {
        this.f7629v = Integer.valueOf(i3);
        this.f7630w = Integer.valueOf(i4);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final C0415r0 N(int i3) {
        ArrayList arrayList = this.f7614g;
        if (arrayList != null) {
            return (C0415r0) arrayList.get(i3);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i3 + " out of bounds: node has no children");
    }

    public void h1() {
        this.f7628u.O();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void i() {
        if (!R()) {
            this.f7628u.d();
        } else if (getParent() != null) {
            getParent().i();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final C0415r0 P() {
        C0415r0 c0415r0 = this.f7616i;
        return c0415r0 != null ? c0415r0 : V();
    }

    public void i1(float f3) {
        this.f7628u.P(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public int j() {
        return this.f7622o;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final int T(C0415r0 c0415r0) {
        int iN0 = 0;
        for (int i3 = 0; i3 < C(); i3++) {
            C0415r0 c0415r0N = N(i3);
            if (c0415r0 == c0415r0N) {
                return iN0;
            }
            iN0 += c0415r0N.n0();
        }
        throw new RuntimeException("Child " + c0415r0.H() + " was not a child of " + this.f7608a);
    }

    public void j1(float f3) {
        this.f7628u.U(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void k(Object obj) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C0415r0 V() {
        return this.f7619l;
    }

    public void k1(float f3) {
        this.f7628u.V(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final B0 l() {
        return (B0) p002a1.a.c(this.f7611d);
    }

    public final float l0(int i3) {
        return this.f7628u.h(com.facebook.yoga.j.b(i3));
    }

    public void l1(float f3) {
        this.f7628u.W(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public EnumC0382a0 m() {
        if (R() || a0()) {
            return EnumC0382a0.NONE;
        }
        return p0() ? EnumC0382a0.LEAF : EnumC0382a0.PARENT;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final C0415r0 getParent() {
        return this.f7615h;
    }

    public void m1(float f3) {
        this.f7628u.X(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final int n() {
        p002a1.a.a(this.f7610c != 0);
        return this.f7610c;
    }

    public void n1(float f3) {
        this.f7628u.Z(f3);
    }

    public final boolean o0() {
        com.facebook.yoga.r rVar = this.f7628u;
        return rVar != null && rVar.n();
    }

    public void o1(float f3) {
        this.f7628u.a0(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final void p(String str) {
        this.f7609b = str;
    }

    public boolean p0() {
        return false;
    }

    public void p1(float f3) {
        this.f7628u.b0(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public boolean q(float f3, float f4) {
        if (!o0()) {
            return false;
        }
        float fJ = J();
        float fA = A();
        float f5 = f3 + fJ;
        int iRound = Math.round(f5);
        float f6 = f4 + fA;
        int iRound2 = Math.round(f6);
        return (Math.round(fJ) == this.f7621n && Math.round(fA) == this.f7622o && Math.round(f5 + e0()) - iRound == this.f7623p && Math.round(f6 + u()) - iRound2 == this.f7624q) ? false : true;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final int t(C0415r0 c0415r0) {
        ArrayList arrayList = this.f7614g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(c0415r0);
    }

    public void q1(float f3) {
        this.f7628u.c0(f3);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final boolean r() {
        return this.f7612e;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final int Y(C0415r0 c0415r0) {
        p002a1.a.c(this.f7620m);
        return this.f7620m.indexOf(c0415r0);
    }

    public void r1() {
        this.f7628u.k0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void s(com.facebook.yoga.h hVar) {
        this.f7628u.C(hVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public boolean Q(C0415r0 c0415r0) {
        for (C0415r0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == c0415r0) {
                return true;
            }
        }
        return false;
    }

    public void s1(float f3) {
        this.f7628u.l0(f3);
    }

    public void setFlex(float f3) {
        this.f7628u.E(f3);
    }

    public void setFlexGrow(float f3) {
        this.f7628u.J(f3);
    }

    public void setFlexShrink(float f3) {
        this.f7628u.K(f3);
    }

    public void setShouldNotifyOnLayout(boolean z3) {
        this.f7612e = z3;
    }

    public final boolean t0() {
        com.facebook.yoga.r rVar = this.f7628u;
        return rVar != null && rVar.p();
    }

    public String toString() {
        return "[" + this.f7609b + " " + H() + "]";
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final float u() {
        return this.f7628u.g();
    }

    public boolean u0() {
        return this.f7628u.r();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final String v() {
        return (String) p002a1.a.c(this.f7609b);
    }

    public boolean v0() {
        return false;
    }

    public boolean w0() {
        return u0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final boolean x() {
        return this.f7613f || o0() || t0();
    }

    public final void x0() {
        com.facebook.yoga.r rVar = this.f7628u;
        if (rVar != null) {
            rVar.s();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public void y(int i3) {
        this.f7608a = i3;
    }

    public void y0() {
        if (this.f7613f) {
            return;
        }
        this.f7613f = true;
        C0415r0 parent = getParent();
        if (parent != null) {
            parent.y0();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0414q0
    public final YogaValue z() {
        return this.f7628u.e();
    }

    public void z0() {
    }
}
