package p049m0;

import J0.C0185t;
import J0.y;
import V.f;
import X.n;
import android.content.Context;
import java.util.Set;
import p061p0.a;
import p065q0.d;
import p101z0.b;

/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0185t f9828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f9829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9831e;

    public g(Context context) {
        this(context, null);
    }

    @Override // X.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f get() {
        return new f(this.f9827a, this.f9829c, this.f9828b, this.f9830d, this.f9831e).N(null);
    }

    public g(Context context, b bVar) {
        this(context, y.l(), bVar);
    }

    public g(Context context, y yVar, b bVar) {
        this(context, yVar, null, null, bVar);
    }

    public g(Context context, y yVar, Set<d> set, Set<b> set2, b bVar) {
        this.f9827a = context;
        C0185t c0185tJ = yVar.j();
        this.f9828b = c0185tJ;
        if (bVar != null && bVar.d() != null) {
            this.f9829c = bVar.d();
        } else {
            this.f9829c = new h();
        }
        this.f9829c.a(context.getResources(), a.b(), yVar.b(context), yVar.q(), f.h(), c0185tJ.o(), bVar != null ? bVar.a() : null, bVar != null ? bVar.b() : null);
        this.f9830d = set;
        this.f9831e = set2;
        if (bVar != null) {
            bVar.c();
        }
    }
}
