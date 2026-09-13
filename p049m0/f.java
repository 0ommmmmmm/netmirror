package p049m0;

import H0.k;
import I0.h;
import J0.C0185t;
import Q0.e;
import android.content.Context;
import android.net.Uri;
import java.util.Set;
import p029h0.c;
import p065q0.b;
import p065q0.d;
import p101z0.g;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0185t f9823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f9824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private X.f f9825v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9826a;

        static {
            int[] iArr = new int[b.c.values().length];
            f9826a = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9826a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9826a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, C0185t c0185t, Set<d> set, Set<p101z0.b> set2) {
        super(context, set, set2);
        this.f9823t = c0185t;
        this.f9824u = hVar;
    }

    public static U0.b.c I(b.c cVar) {
        int i3 = a.f9826a[cVar.ordinal()];
        if (i3 == 1) {
            return U0.b.c.FULL_FETCH;
        }
        if (i3 == 2) {
            return U0.b.c.DISK_CACHE;
        }
        if (i3 == 3) {
            return U0.b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private R.d J() {
        U0.b bVar = (U0.b) o();
        k kVarP = this.f9823t.p();
        if (kVarP == null || bVar == null) {
            return null;
        }
        return bVar.l() != null ? kVarP.a(bVar, g()) : kVarP.b(bVar, g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public c j(p089w0.a aVar, String str, U0.b bVar, Object obj, b.c cVar) {
        return this.f9823t.l(bVar, obj, I(cVar), L(aVar), str);
    }

    protected e L(p089w0.a aVar) {
        if (aVar instanceof e) {
            return ((e) aVar).p0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p065q0.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public e y() {
        if (V0.b.d()) {
            V0.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            p089w0.a aVarQ = q();
            String strF = b.f();
            e eVarC = aVarQ instanceof e ? (e) aVarQ : this.f9824u.c();
            eVarC.r0(z(eVarC, strF), strF, J(), g(), this.f9825v);
            eVarC.s0(null, this);
            return eVarC;
        } finally {
            if (V0.b.d()) {
                V0.b.b();
            }
        }
    }

    public f N(g gVar) {
        return (f) s();
    }

    @Override // p089w0.d
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public f c(Uri uri) {
        return uri == null ? (f) super.E(null) : (f) super.E(U0.c.x(uri).P(h.e()).a());
    }
}
