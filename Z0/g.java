package Z0;

import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorSpace f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p071r2.i f2808b;

    public g(int i3, int i4, ColorSpace colorSpace) {
        this.f2807a = colorSpace;
        this.f2808b = (i3 == -1 || i4 == -1) ? null : new p071r2.i(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public final ColorSpace a() {
        return this.f2807a;
    }

    public final p071r2.i b() {
        return this.f2808b;
    }
}
