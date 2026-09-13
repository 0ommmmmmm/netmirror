package p065q0;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10411b = new ArrayList(2);

    private synchronized void e(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // p065q0.d
    public void a(String str, Object obj) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.a(str, obj);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onIntermediateImageSet", e4);
            }
        }
    }

    @Override // p065q0.d
    public synchronized void b(String str) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.b(str);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onRelease", e4);
            }
        }
    }

    public synchronized void c(d dVar) {
        this.f10411b.add(dVar);
    }

    public synchronized void d() {
        this.f10411b.clear();
    }

    @Override // p065q0.d
    public synchronized void j(String str, Object obj) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.j(str, obj);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onSubmit", e4);
            }
        }
    }

    @Override // p065q0.d
    public synchronized void k(String str, Object obj, Animatable animatable) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.k(str, obj, animatable);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onFinalImageSet", e4);
            }
        }
    }

    @Override // p065q0.d
    public void l(String str, Throwable th) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.l(str, th);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onIntermediateImageFailed", e4);
            }
        }
    }

    @Override // p065q0.d
    public synchronized void r(String str, Throwable th) {
        int size = this.f10411b.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                d dVar = (d) this.f10411b.get(i3);
                if (dVar != null) {
                    dVar.r(str, th);
                }
            } catch (Exception e4) {
                e("InternalListener exception in onFailure", e4);
            }
        }
    }
}
