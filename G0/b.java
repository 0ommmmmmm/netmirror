package G0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public p005b0.a a(int i3, int i4) {
        return b(i3, i4, Bitmap.Config.ARGB_8888);
    }

    public p005b0.a b(int i3, int i4, Bitmap.Config config) {
        return c(i3, i4, config, null);
    }

    public p005b0.a c(int i3, int i4, Bitmap.Config config, Object obj) {
        return d(i3, i4, config);
    }

    public abstract p005b0.a d(int i3, int i4, Bitmap.Config config);
}
