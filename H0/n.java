package H0;

/* JADX INFO: loaded from: classes.dex */
public interface n extends x, p001a0.c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p005b0.a f303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f304c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f305d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f306e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f307f;

        private a(Object obj, p005b0.a aVar, b bVar, int i3) {
            this.f302a = X.k.g(obj);
            this.f303b = (p005b0.a) X.k.g(p005b0.a.A(aVar));
            this.f307f = i3;
        }

        public static a a(Object obj, p005b0.a aVar, int i3, b bVar) {
            return new a(obj, aVar, bVar, i3);
        }

        public static a b(Object obj, p005b0.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
    }
}
