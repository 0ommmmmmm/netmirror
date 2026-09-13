package p029h0;

import X.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f9468a;

        a(Throwable th) {
            this.f9468a = th;
        }

        @Override // X.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f9468a);
        }
    }

    public static n a(Throwable th) {
        return new a(th);
    }

    public static c b(Throwable th) {
        i iVarY = i.y();
        iVarY.q(th);
        return iVarY;
    }
}
