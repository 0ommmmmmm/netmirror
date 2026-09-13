package J0;

import H0.C0166d;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C0304a;
import com.facebook.imagepipeline.producers.C0310g;
import com.facebook.imagepipeline.producers.C0311h;
import com.facebook.imagepipeline.producers.C0312i;
import com.facebook.imagepipeline.producers.C0313j;
import com.facebook.imagepipeline.producers.C0314k;
import com.facebook.imagepipeline.producers.C0315l;
import com.facebook.imagepipeline.producers.C0319p;
import com.facebook.imagepipeline.producers.C0320q;
import com.facebook.imagepipeline.producers.C0322t;
import com.facebook.imagepipeline.producers.C0325w;
import com.facebook.imagepipeline.producers.C0326x;
import com.facebook.imagepipeline.producers.C0328z;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.v0;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentResolver f483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Resources f484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AssetManager f485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p001a0.a f486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final M0.c f487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final M0.e f488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final EnumC0180n f489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final InterfaceC0182p f492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final p001a0.i f493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final X.n f494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final H0.x f495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final H0.x f496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final H0.k f497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final C0166d f498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final C0166d f499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final G0.b f500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final int f501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final C0167a f504v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final int f505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final boolean f506x;

    public C(Context context, p001a0.a aVar, M0.c cVar, M0.e eVar, EnumC0180n enumC0180n, boolean z3, boolean z4, InterfaceC0182p interfaceC0182p, p001a0.i iVar, H0.x xVar, H0.x xVar2, X.n nVar, H0.k kVar, G0.b bVar, int i3, int i4, boolean z5, int i5, C0167a c0167a, boolean z6, int i6) {
        this.f483a = context.getApplicationContext().getContentResolver();
        this.f484b = context.getApplicationContext().getResources();
        this.f485c = context.getApplicationContext().getAssets();
        this.f486d = aVar;
        this.f487e = cVar;
        this.f488f = eVar;
        this.f489g = enumC0180n;
        this.f490h = z3;
        this.f491i = z4;
        this.f492j = interfaceC0182p;
        this.f493k = iVar;
        this.f496n = xVar;
        this.f495m = xVar2;
        this.f494l = nVar;
        this.f497o = kVar;
        this.f500r = bVar;
        this.f498p = new C0166d(i6);
        this.f499q = new C0166d(i6);
        this.f501s = i3;
        this.f502t = i4;
        this.f503u = z5;
        this.f505w = i5;
        this.f504v = c0167a;
        this.f506x = z6;
    }

    public static C0304a a(e0 e0Var) {
        return new C0304a(e0Var);
    }

    public static C0315l h(e0 e0Var, e0 e0Var2) {
        return new C0315l(e0Var, e0Var2);
    }

    public b0 A(e0 e0Var) {
        return new b0(this.f496n, this.f497o, e0Var);
    }

    public c0 B(e0 e0Var) {
        return new c0(e0Var, this.f500r, this.f492j.e());
    }

    public j0 C() {
        return new j0(this.f492j.c(), this.f493k, this.f483a);
    }

    public l0 D(e0 e0Var, boolean z3, W0.d dVar) {
        return new l0(this.f492j.e(), this.f493k, e0Var, z3, dVar);
    }

    public o0 E(e0 e0Var) {
        return new o0(e0Var);
    }

    public s0 F(e0 e0Var) {
        return new s0(5, this.f492j.b(), e0Var);
    }

    public u0 G(v0[] v0VarArr) {
        return new u0(v0VarArr);
    }

    public e0 b(e0 e0Var, q0 q0Var) {
        return new p0(e0Var, q0Var);
    }

    public C0310g c(e0 e0Var) {
        return new C0310g(this.f496n, this.f497o, e0Var);
    }

    public C0311h d(e0 e0Var) {
        return new C0311h(this.f497o, e0Var);
    }

    public C0312i e(e0 e0Var) {
        return new C0312i(this.f496n, this.f497o, e0Var);
    }

    public C0313j f(e0 e0Var) {
        return new C0313j(e0Var, this.f501s, this.f502t, this.f503u);
    }

    public C0314k g(e0 e0Var) {
        return new C0314k(this.f495m, this.f494l, this.f497o, this.f498p, this.f499q, e0Var);
    }

    public C0319p i() {
        return new C0319p(this.f493k);
    }

    public C0320q j(e0 e0Var) {
        return new C0320q(this.f486d, this.f492j.a(), this.f487e, this.f488f, this.f489g, this.f490h, this.f491i, e0Var, this.f505w, this.f504v, null, X.o.f2743b);
    }

    public C0322t k(e0 e0Var) {
        return new C0322t(e0Var, this.f492j.g());
    }

    public C0325w l(e0 e0Var) {
        return new C0325w(this.f494l, this.f497o, e0Var);
    }

    public C0326x m(e0 e0Var) {
        return new C0326x(this.f494l, this.f497o, e0Var);
    }

    public C0328z n(e0 e0Var) {
        return new C0328z(this.f497o, this.f506x, e0Var);
    }

    public e0 o(e0 e0Var) {
        return new com.facebook.imagepipeline.producers.A(this.f495m, this.f497o, e0Var);
    }

    public com.facebook.imagepipeline.producers.B p(e0 e0Var) {
        return new com.facebook.imagepipeline.producers.B(this.f494l, this.f497o, this.f498p, this.f499q, e0Var);
    }

    public com.facebook.imagepipeline.producers.I q() {
        return new com.facebook.imagepipeline.producers.I(this.f492j.c(), this.f493k, this.f485c);
    }

    public com.facebook.imagepipeline.producers.J r() {
        return new com.facebook.imagepipeline.producers.J(this.f492j.c(), this.f493k, this.f483a);
    }

    public com.facebook.imagepipeline.producers.K s() {
        return new com.facebook.imagepipeline.producers.K(this.f492j.c(), this.f493k, this.f483a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f492j.d(), this.f493k, this.f483a);
    }

    public com.facebook.imagepipeline.producers.N u() {
        return new com.facebook.imagepipeline.producers.N(this.f492j.c(), this.f493k);
    }

    public com.facebook.imagepipeline.producers.O v() {
        return new com.facebook.imagepipeline.producers.O(this.f492j.c(), this.f493k, this.f484b);
    }

    public com.facebook.imagepipeline.producers.T w() {
        return new com.facebook.imagepipeline.producers.T(this.f492j.e(), this.f483a);
    }

    public com.facebook.imagepipeline.producers.U x() {
        return new com.facebook.imagepipeline.producers.U(this.f492j.c(), this.f483a);
    }

    public e0 y(Y y3) {
        return new X(this.f493k, this.f486d, y3);
    }

    public Z z(e0 e0Var) {
        return new Z(this.f494l, this.f497o, this.f493k, this.f486d, e0Var);
    }

    @Deprecated
    public C(Context context, p001a0.a aVar, M0.c cVar, M0.e eVar, boolean z3, boolean z4, boolean z5, InterfaceC0182p interfaceC0182p, p001a0.i iVar, H0.x xVar, H0.x xVar2, X.n nVar, H0.k kVar, G0.b bVar, int i3, int i4, boolean z6, int i5, C0167a c0167a, boolean z7, int i6) {
        this(context, aVar, cVar, eVar, z3 ? EnumC0180n.ALWAYS : EnumC0180n.AUTO, z4, z5, interfaceC0182p, iVar, xVar, xVar2, nVar, kVar, bVar, i3, i4, z6, i5, c0167a, z7, i6);
    }
}
