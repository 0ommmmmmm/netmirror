package p061p0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class b extends p061p0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10285b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f10289f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f10287d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f10288e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10286c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f10285b) {
                ArrayList arrayList = b.this.f10288e;
                b bVar = b.this;
                bVar.f10288e = bVar.f10287d;
                b.this.f10287d = arrayList;
            }
            int size = b.this.f10288e.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((p061p0.a.InterfaceC0140a) b.this.f10288e.get(i3)).release();
            }
            b.this.f10288e.clear();
        }
    }

    @Override // p061p0.a
    public void a(p061p0.a.InterfaceC0140a interfaceC0140a) {
        synchronized (this.f10285b) {
            this.f10287d.remove(interfaceC0140a);
        }
    }

    @Override // p061p0.a
    public void d(p061p0.a.InterfaceC0140a interfaceC0140a) {
        if (!p061p0.a.c()) {
            interfaceC0140a.release();
            return;
        }
        synchronized (this.f10285b) {
            try {
                if (this.f10287d.contains(interfaceC0140a)) {
                    return;
                }
                this.f10287d.add(interfaceC0140a);
                boolean z3 = true;
                if (this.f10287d.size() != 1) {
                    z3 = false;
                }
                if (z3) {
                    this.f10286c.post(this.f10289f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
