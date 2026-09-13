package O0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
class h extends b {
    protected h(p005b0.a aVar, o oVar, int i3, int i4) {
        super(aVar, oVar, i3, i4);
    }

    protected void finalize() throws Throwable {
        if (b()) {
            return;
        }
        Y.a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected h(Bitmap bitmap, p005b0.h hVar, o oVar, int i3, int i4) {
        super(bitmap, hVar, oVar, i3, i4);
    }
}
