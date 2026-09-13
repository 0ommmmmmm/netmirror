package p101z0;

import D2.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11068g;

    public c(int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        h.f(str, "scaleType");
        this.f11062a = i3;
        this.f11063b = i4;
        this.f11064c = i5;
        this.f11065d = i6;
        this.f11066e = i7;
        this.f11067f = i8;
        this.f11068g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.b(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.d(obj, "null cannot be cast to non-null type com.facebook.fresco.ui.common.DimensionsInfo");
        c cVar = (c) obj;
        return this.f11062a == cVar.f11062a && this.f11063b == cVar.f11063b && this.f11064c == cVar.f11064c && this.f11065d == cVar.f11065d && this.f11066e == cVar.f11066e && this.f11067f == cVar.f11067f && h.b(this.f11068g, cVar.f11068g);
    }

    public int hashCode() {
        return (((((((((((this.f11062a * 31) + this.f11063b) * 31) + this.f11064c) * 31) + this.f11065d) * 31) + this.f11066e) * 31) + this.f11067f) * 31) + this.f11068g.hashCode();
    }

    public String toString() {
        return "DimensionsInfo(viewportWidth=" + this.f11062a + ", viewportHeight=" + this.f11063b + ", encodedImageWidth=" + this.f11064c + ", encodedImageHeight=" + this.f11065d + ", decodedImageWidth=" + this.f11066e + ", decodedImageHeight=" + this.f11067f + ", scaleType=" + this.f11068g + ")";
    }
}
