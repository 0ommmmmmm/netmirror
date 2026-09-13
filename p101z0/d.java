package p101z0;

import D2.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.r;

/* JADX INFO: loaded from: classes.dex */
public class d extends p101z0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11069e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11070d = new ArrayList(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final synchronized void A(b bVar) {
        h.f(bVar, "listener");
        this.f11070d.add(bVar);
    }

    public final synchronized void D(b bVar) {
        h.f(bVar, "listener");
        this.f11070d.remove(bVar);
    }

    @Override // p101z0.a, p101z0.b
    public void a(String str, Object obj) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).a(str, obj);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p101z0.a, p101z0.b
    public void o(String str, Object obj, b.a aVar) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).o(str, obj, aVar);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p101z0.a, p101z0.b
    public void q(String str) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).q(str);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p101z0.a, p101z0.b
    public void v(String str, b.a aVar) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).v(str, aVar);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p101z0.a, p101z0.b
    public void y(String str, Throwable th, b.a aVar) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).y(str, th, aVar);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p101z0.a, p101z0.b
    public void z(String str, Object obj, b.a aVar) {
        h.f(str, "id");
        int size = this.f11070d.size();
        for (int i3 = 0; i3 < size; i3++) {
            try {
                try {
                    ((b) this.f11070d.get(i3)).z(str, obj, aVar);
                    r rVar = r.f10603a;
                } catch (Exception e4) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e4);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
