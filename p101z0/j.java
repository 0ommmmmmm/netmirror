package p101z0;

import D2.h;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f11142A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f11143B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f11144C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11145D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f11146E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f11147F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Throwable f11148G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f11149H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n f11150I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f11151J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f11152K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private c f11153L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private b.a f11154M;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f11155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f11156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f11157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f11158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f11159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f11160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f11161y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f11162z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(kVar);
        h.f(kVar, "infra");
        this.f11160x = -1L;
        this.f11161y = -1L;
        this.f11162z = -1L;
        this.f11142A = -1L;
        this.f11143B = -1L;
        this.f11144C = -1L;
        this.f11146E = -1;
        this.f11147F = -1;
        this.f11149H = e.UNKNOWN;
        this.f11150I = n.UNKNOWN;
        this.f11151J = -1L;
        this.f11152K = -1L;
    }

    public final void A(long j3) {
        this.f11162z = j3;
    }

    public final void B(String str) {
        this.f11155s = str;
    }

    public final void C(long j3) {
        this.f11161y = j3;
    }

    public final void D(long j3) {
        this.f11160x = j3;
    }

    public final void E(Throwable th) {
        this.f11148G = th;
    }

    public final void F(b.a aVar) {
        this.f11154M = aVar;
    }

    public final void G(Object obj) {
        this.f11159w = obj;
    }

    public final void H(e eVar) {
        h.f(eVar, "<set-?>");
        this.f11149H = eVar;
    }

    public final void I(Object obj) {
        this.f11157u = obj;
    }

    public final void J(long j3) {
        this.f11144C = j3;
    }

    public final void K(long j3) {
        this.f11143B = j3;
    }

    public final void L(long j3) {
        this.f11152K = j3;
    }

    public final void M(int i3) {
        this.f11147F = i3;
    }

    public final void N(int i3) {
        this.f11146E = i3;
    }

    public final void O(boolean z3) {
        this.f11145D = z3;
    }

    public final void P(String str) {
        this.f11156t = str;
    }

    public final void Q(long j3) {
        this.f11151J = j3;
    }

    public final void R(boolean z3) {
        this.f11150I = z3 ? n.VISIBLE : n.INVISIBLE;
    }

    public final f S() {
        return new f(j(), this.f11155s, this.f11156t, this.f11157u, this.f11158v, this.f11159w, this.f11160x, this.f11161y, this.f11162z, this.f11142A, this.f11143B, this.f11144C, f(), n(), this.f11145D, this.f11146E, this.f11147F, this.f11148G, this.f11150I, this.f11151J, this.f11152K, this.f11153L, this.f11154M, a(), o(), c(), d(), b(), r(), q(), l(), p(), AbstractC0492n.e0(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f11156t = null;
        this.f11157u = null;
        this.f11158v = null;
        this.f11159w = null;
        this.f11145D = false;
        this.f11146E = -1;
        this.f11147F = -1;
        this.f11148G = null;
        this.f11149H = e.UNKNOWN;
        this.f11150I = n.UNKNOWN;
        this.f11153L = null;
        this.f11154M = null;
        x();
        s();
    }

    public final void x() {
        this.f11143B = -1L;
        this.f11144C = -1L;
        this.f11160x = -1L;
        this.f11162z = -1L;
        this.f11142A = -1L;
        this.f11151J = -1L;
        this.f11152K = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f11158v = obj;
    }

    public final void z(long j3) {
        this.f11142A = j3;
    }
}
