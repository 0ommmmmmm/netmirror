package com.facebook.react.defaults;

import p071r2.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6562a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p018e1.f f6563b = p018e1.f.STABLE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f6565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f6567f;

    /* JADX INFO: renamed from: com.facebook.react.defaults.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0099a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6568a;

        static {
            int[] iArr = new int[p018e1.f.values().length];
            try {
                iArr[p018e1.f.EXPERIMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p018e1.f.CANARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p018e1.f.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6568a = iArr;
        }
    }

    private a() {
    }

    public static final void b(boolean z3, boolean z4, boolean z5) {
        p071r2.i iVarA = f6562a.a(z3, z4, z5);
        boolean zBooleanValue = ((Boolean) iVarA.a()).booleanValue();
        String str = (String) iVarA.b();
        if (!zBooleanValue) {
            throw new IllegalStateException(str.toString());
        }
        int i3 = C0099a.f6568a[f6563b.ordinal()];
        if (i3 == 1) {
            p070r1.b.n(new p070r1.g());
        } else if (i3 == 2) {
            p070r1.b.n(new p070r1.f());
        } else {
            if (i3 != 3) {
                throw new p071r2.h();
            }
            p070r1.b.n(new p070r1.h(z4, z5, z3));
        }
        f6564c = z4;
        f6565d = z3;
        f6566e = z4;
        f6567f = z5;
        h.f6574a.a();
    }

    public static /* synthetic */ void c(boolean z3, boolean z4, boolean z5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z3 = true;
        }
        if ((i3 & 2) != 0) {
            z4 = true;
        }
        if ((i3 & 4) != 0) {
            z5 = true;
        }
        b(z3, z4, z5);
    }

    public final p071r2.i a(boolean z3, boolean z4, boolean z5) {
        if (!z4 || z3) {
            return (!z5 || (z3 && z4)) ? n.a(Boolean.TRUE, "") : n.a(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
        }
        return n.a(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }
}
