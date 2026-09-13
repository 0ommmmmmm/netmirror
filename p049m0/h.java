package p049m0;

import H0.x;
import X.f;
import X.n;
import android.content.res.Resources;
import java.util.concurrent.Executor;
import p061p0.a;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f9832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f9833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N0.a f9834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N0.a f9835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f9836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f9837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f9838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f9839h;

    public void a(Resources resources, a aVar, N0.a aVar2, N0.a aVar3, Executor executor, x xVar, f fVar, n nVar) {
        this.f9832a = resources;
        this.f9833b = aVar;
        this.f9834c = aVar2;
        this.f9835d = aVar3;
        this.f9836e = executor;
        this.f9837f = xVar;
        this.f9838g = fVar;
        this.f9839h = nVar;
    }

    protected e b(Resources resources, a aVar, N0.a aVar2, N0.a aVar3, Executor executor, x xVar, f fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e eVarB = b(this.f9832a, this.f9833b, this.f9834c, this.f9835d, this.f9836e, this.f9837f, this.f9838g);
        n nVar = this.f9839h;
        if (nVar != null) {
            eVarB.A0(((Boolean) nVar.get()).booleanValue());
        }
        return eVarB;
    }
}
