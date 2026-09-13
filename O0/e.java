package O0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface e extends c {
    static e I(p005b0.a aVar, o oVar, int i3, int i4) {
        return b.w0() ? new b(aVar, oVar, i3, i4) : new h(aVar, oVar, i3, i4);
    }

    static e k0(Bitmap bitmap, p005b0.h hVar, o oVar, int i3) {
        return m0(bitmap, hVar, oVar, i3, 0);
    }

    static e m0(Bitmap bitmap, p005b0.h hVar, o oVar, int i3, int i4) {
        return b.w0() ? new b(bitmap, hVar, oVar, i3, i4) : new h(bitmap, hVar, oVar, i3, i4);
    }

    int N();

    int s0();
}
