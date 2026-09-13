package J0;

import android.util.Log;
import java.io.Closeable;

/* JADX INFO: renamed from: J0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0167a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0.a.c f562a;

    /* JADX INFO: renamed from: J0.a$a, reason: collision with other inner class name */
    class C0008a implements b0.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L0.a f563a;

        C0008a(L0.a aVar) {
            this.f563a = aVar;
        }

        @Override // b0.a.c
        public boolean a() {
            return this.f563a.b();
        }

        @Override // b0.a.c
        public void b(p005b0.i iVar, Throwable th) {
            this.f563a.a(iVar, th);
            Object objF = iVar.f();
            Y.a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF != null ? objF.getClass().getName() : "<value is null>", C0167a.d(th));
        }
    }

    public C0167a(L0.a aVar) {
        this.f562a = new C0008a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    public p005b0.a b(Closeable closeable) {
        return p005b0.a.e0(closeable, this.f562a);
    }

    public p005b0.a c(Object obj, p005b0.h hVar) {
        return p005b0.a.t0(obj, hVar, this.f562a);
    }
}
