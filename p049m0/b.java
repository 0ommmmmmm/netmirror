package p049m0;

import X.f;
import X.n;
import X.o;
import java.util.List;
import p101z0.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f9800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f9801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f9802c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f9803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f9804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f9805c;

        static /* bridge */ /* synthetic */ g c(a aVar) {
            aVar.getClass();
            return null;
        }

        public b e() {
            return new b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public f a() {
        return this.f9800a;
    }

    public n b() {
        return this.f9802c;
    }

    public g c() {
        return null;
    }

    public h d() {
        return this.f9801b;
    }

    private b(a aVar) {
        this.f9800a = aVar.f9803a != null ? f.b(aVar.f9803a) : null;
        this.f9802c = aVar.f9804b != null ? aVar.f9804b : o.a(Boolean.FALSE);
        this.f9801b = aVar.f9805c;
        a.c(aVar);
    }
}
