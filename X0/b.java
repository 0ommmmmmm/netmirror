package X0;

import D2.h;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2746a = new b();

    private b() {
    }

    public static final boolean a(a aVar, p005b0.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object objP = aVar2.P();
        h.e(objP, "get(...)");
        Bitmap bitmap = (Bitmap) objP;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
