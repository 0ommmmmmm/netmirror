package com.facebook.hermes.intl;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0089a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f5762c;

        static {
            int[] iArr = new int[b.values().length];
            f5762c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5762c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5762c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f5761b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5761b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f5760a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5760a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5760a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5760a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5760a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = C0089a.f5762c[ordinal()];
            if (i3 == 1) {
                return "upper";
            }
            if (i3 == 2) {
                return "lower";
            }
            if (i3 == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = C0089a.f5760a[ordinal()];
            if (i3 == 1) {
                return "base";
            }
            if (i3 == 2) {
                return "accent";
            }
            if (i3 == 3) {
                return "case";
            }
            if (i3 == 4) {
                return "variant";
            }
            if (i3 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = C0089a.f5761b[ordinal()];
            if (i3 == 1) {
                return "sort";
            }
            if (i3 == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    a a(b bVar);

    a b(B0.b bVar);

    a c(boolean z3);

    int d(String str, String str2);

    a e(c cVar);

    c f();

    a g(boolean z3);
}
