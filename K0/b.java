package K0;

import Q0.d;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.m0;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private b(e0 e0Var, m0 m0Var, d dVar) {
        super(e0Var, m0Var, dVar);
    }

    public static p029h0.c I(e0 e0Var, m0 m0Var, d dVar) {
        if (V0.b.d()) {
            V0.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        b bVar = new b(e0Var, m0Var, dVar);
        if (V0.b.d()) {
            V0.b.b();
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029h0.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void i(p005b0.a aVar) {
        p005b0.a.D(aVar);
    }

    @Override // p029h0.a, p029h0.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public p005b0.a b() {
        return p005b0.a.A((p005b0.a) super.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K0.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void G(p005b0.a aVar, int i3, f0 f0Var) {
        super.G(p005b0.a.A(aVar), i3, f0Var);
    }
}
