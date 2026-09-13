package p060p;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f10236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f10237b;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    class RunnableC0138a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.c f10238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f10239c;

        RunnableC0138a(g.c cVar, Typeface typeface) {
            this.f10238b = cVar;
            this.f10239c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10238b.b(this.f10239c);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.c f10241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10242c;

        b(g.c cVar, int i3) {
            this.f10241b = cVar;
            this.f10242c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10241b.a(this.f10242c);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f10236a = cVar;
        this.f10237b = handler;
    }

    private void a(int i3) {
        this.f10237b.post(new b(this.f10236a, i3));
    }

    private void c(Typeface typeface) {
        this.f10237b.post(new RunnableC0138a(this.f10236a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f10266a);
        } else {
            a(eVar.f10267b);
        }
    }
}
