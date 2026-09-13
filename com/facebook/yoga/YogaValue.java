package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final YogaValue f8289c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final YogaValue f8290d = new YogaValue(0.0f, w.POINT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final YogaValue f8291e = new YogaValue(Float.NaN, w.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f8293b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8294a;

        static {
            int[] iArr = new int[w.values().length];
            f8294a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8294a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8294a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8294a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f3, w wVar) {
        this.f8292a = f3;
        this.f8293b = wVar;
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f8289c;
        }
        if ("auto".equals(str)) {
            return f8291e;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        w wVar = this.f8293b;
        if (wVar == yogaValue.f8293b) {
            return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f8292a, yogaValue.f8292a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f8292a) + this.f8293b.c();
    }

    public String toString() {
        int i3 = a.f8294a[this.f8293b.ordinal()];
        if (i3 == 1) {
            return "undefined";
        }
        if (i3 == 2) {
            return Float.toString(this.f8292a);
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f8292a + "%";
    }

    YogaValue(float f3, int i3) {
        this(f3, w.b(i3));
    }
}
