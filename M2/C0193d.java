package M2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: M2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f1015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f1016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f1017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f1018m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f1005p = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0193d f1003n = new a().d().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0193d f1004o = new a().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: M2.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1021c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1022d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1023e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f1026h;

        private final int b(long j3) {
            if (j3 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j3;
        }

        public final C0193d a() {
            return new C0193d(this.f1019a, this.f1020b, this.f1021c, -1, false, false, false, this.f1022d, this.f1023e, this.f1024f, this.f1025g, this.f1026h, null, null);
        }

        public final a c(int i3, TimeUnit timeUnit) {
            D2.h.f(timeUnit, "timeUnit");
            if (i3 >= 0) {
                this.f1022d = b(timeUnit.toSeconds(i3));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i3).toString());
        }

        public final a d() {
            this.f1019a = true;
            return this;
        }

        public final a e() {
            this.f1020b = true;
            return this;
        }

        public final a f() {
            this.f1024f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: M2.d$b */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i3) {
            int length = str.length();
            while (i3 < length) {
                if (K2.o.D(str2, str.charAt(i3), false, 2, null)) {
                    return i3;
                }
                i3++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x006e  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00de  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:48:0x0106  */
        /* JADX WARN: Code duplicated, block: B:49:0x010e  */
        /* JADX WARN: Code duplicated, block: B:51:0x0116  */
        /* JADX WARN: Code duplicated, block: B:52:0x0118  */
        /* JADX WARN: Code duplicated, block: B:54:0x0120  */
        /* JADX WARN: Code duplicated, block: B:55:0x0122  */
        /* JADX WARN: Code duplicated, block: B:57:0x012a  */
        /* JADX WARN: Code duplicated, block: B:58:0x012d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0135  */
        /* JADX WARN: Code duplicated, block: B:61:0x013f  */
        /* JADX WARN: Code duplicated, block: B:63:0x0147  */
        /* JADX WARN: Code duplicated, block: B:64:0x014f  */
        /* JADX WARN: Code duplicated, block: B:66:0x0158  */
        /* JADX WARN: Code duplicated, block: B:67:0x015b  */
        /* JADX WARN: Code duplicated, block: B:69:0x0163  */
        /* JADX WARN: Code duplicated, block: B:70:0x0166  */
        /* JADX WARN: Code duplicated, block: B:72:0x016e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0179 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x0170 A[SYNTHETIC] */
        public final C0193d b(t tVar) {
            int i3;
            int i4;
            int iA;
            String strSubstring;
            String string;
            boolean z3;
            int iA2;
            String string2;
            t tVar2 = tVar;
            D2.h.f(tVar2, "headers");
            int size = tVar.size();
            boolean z4 = true;
            boolean z5 = true;
            int i5 = 0;
            String str = null;
            boolean z6 = false;
            boolean z7 = false;
            int iU = -1;
            int iU2 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int iU3 = -1;
            int iU4 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (i5 < size) {
                String strB = tVar2.b(i5);
                String strH = tVar2.h(i5);
                if (K2.o.n(strB, "Cache-Control", z4)) {
                    if (str == null) {
                        str = strH;
                    }
                    i4 = 0;
                    while (i4 < strH.length()) {
                        iA = a(strH, "=,;", i4);
                        strSubstring = strH.substring(i4, iA);
                        D2.h.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (strSubstring != null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        string = K2.o.w0(strSubstring).toString();
                        int i6 = size;
                        if (iA != strH.length()) {
                            z3 = z5;
                            if (strH.charAt(iA) == ',' && strH.charAt(iA) != ';') {
                                int iA3 = N2.c.A(strH, iA + 1);
                                if (iA3 >= strH.length() || strH.charAt(iA3) != '\"') {
                                    iA2 = a(strH, ",;", iA3);
                                    String strSubstring2 = strH.substring(iA3, iA2);
                                    D2.h.e(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    if (strSubstring2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    string2 = K2.o.w0(strSubstring2).toString();
                                } else {
                                    int i7 = iA3 + 1;
                                    int iN = K2.o.N(strH, '\"', i7, false, 4, null);
                                    string2 = strH.substring(i7, iN);
                                    D2.h.e(string2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iA2 = iN + 1;
                                }
                            }
                            z4 = true;
                            if (K2.o.n("no-cache", string, true)) {
                                z6 = true;
                            } else if (K2.o.n("no-store", string, true)) {
                                z7 = true;
                            } else {
                                if (K2.o.n("max-age", string, true)) {
                                    iU = N2.c.U(string2, -1);
                                } else if (K2.o.n("s-maxage", string, true)) {
                                    iU2 = N2.c.U(string2, -1);
                                } else if (K2.o.n("private", string, true)) {
                                    z8 = true;
                                } else if (K2.o.n("public", string, true)) {
                                    z9 = true;
                                } else if (K2.o.n("must-revalidate", string, true)) {
                                    z10 = true;
                                } else if (K2.o.n("max-stale", string, true)) {
                                    iU3 = N2.c.U(string2, Integer.MAX_VALUE);
                                } else if (K2.o.n("min-fresh", string, true)) {
                                    iU4 = N2.c.U(string2, -1);
                                } else if (K2.o.n("only-if-cached", string, true)) {
                                    z11 = true;
                                } else if (K2.o.n("no-transform", string, true)) {
                                    z12 = true;
                                } else if (K2.o.n("immutable", string, true)) {
                                    z13 = true;
                                }
                                i4 = iA2;
                                size = i6;
                                z5 = z3;
                            }
                            i4 = iA2;
                            size = i6;
                            z5 = z3;
                        } else {
                            z3 = z5;
                        }
                        iA2 = iA + 1;
                        string2 = null;
                        z4 = true;
                        if (K2.o.n("no-cache", string, true)) {
                            z6 = true;
                        } else if (K2.o.n("no-store", string, true)) {
                            z7 = true;
                        } else {
                            if (K2.o.n("max-age", string, true)) {
                                iU = N2.c.U(string2, -1);
                            } else if (K2.o.n("s-maxage", string, true)) {
                                iU2 = N2.c.U(string2, -1);
                            } else if (K2.o.n("private", string, true)) {
                                z8 = true;
                            } else if (K2.o.n("public", string, true)) {
                                z9 = true;
                            } else if (K2.o.n("must-revalidate", string, true)) {
                                z10 = true;
                            } else if (K2.o.n("max-stale", string, true)) {
                                iU3 = N2.c.U(string2, Integer.MAX_VALUE);
                            } else if (K2.o.n("min-fresh", string, true)) {
                                iU4 = N2.c.U(string2, -1);
                            } else if (K2.o.n("only-if-cached", string, true)) {
                                z11 = true;
                            } else if (K2.o.n("no-transform", string, true)) {
                                z12 = true;
                            } else if (K2.o.n("immutable", string, true)) {
                                z13 = true;
                            }
                            i4 = iA2;
                            size = i6;
                            z5 = z3;
                        }
                        i4 = iA2;
                        size = i6;
                        z5 = z3;
                    }
                    i3 = size;
                    i5++;
                    tVar2 = tVar;
                    size = i3;
                } else {
                    if (!K2.o.n(strB, "Pragma", z4)) {
                        i3 = size;
                    }
                    i5++;
                    tVar2 = tVar;
                    size = i3;
                }
                z5 = false;
                i4 = 0;
                while (i4 < strH.length()) {
                    iA = a(strH, "=,;", i4);
                    strSubstring = strH.substring(i4, iA);
                    D2.h.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (strSubstring != null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    string = K2.o.w0(strSubstring).toString();
                    int i8 = size;
                    if (iA != strH.length()) {
                        z3 = z5;
                        if (strH.charAt(iA) == ',') {
                        }
                        z4 = true;
                        if (K2.o.n("no-cache", string, true)) {
                            z6 = true;
                        } else if (K2.o.n("no-store", string, true)) {
                            z7 = true;
                        } else {
                            if (K2.o.n("max-age", string, true)) {
                                iU = N2.c.U(string2, -1);
                            } else if (K2.o.n("s-maxage", string, true)) {
                                iU2 = N2.c.U(string2, -1);
                            } else if (K2.o.n("private", string, true)) {
                                z8 = true;
                            } else if (K2.o.n("public", string, true)) {
                                z9 = true;
                            } else if (K2.o.n("must-revalidate", string, true)) {
                                z10 = true;
                            } else if (K2.o.n("max-stale", string, true)) {
                                iU3 = N2.c.U(string2, Integer.MAX_VALUE);
                            } else if (K2.o.n("min-fresh", string, true)) {
                                iU4 = N2.c.U(string2, -1);
                            } else if (K2.o.n("only-if-cached", string, true)) {
                                z11 = true;
                            } else if (K2.o.n("no-transform", string, true)) {
                                z12 = true;
                            } else if (K2.o.n("immutable", string, true)) {
                                z13 = true;
                            }
                            i4 = iA2;
                            size = i8;
                            z5 = z3;
                        }
                        i4 = iA2;
                        size = i8;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    iA2 = iA + 1;
                    string2 = null;
                    z4 = true;
                    if (K2.o.n("no-cache", string, true)) {
                        z6 = true;
                    } else if (K2.o.n("no-store", string, true)) {
                        z7 = true;
                    } else {
                        if (K2.o.n("max-age", string, true)) {
                            iU = N2.c.U(string2, -1);
                        } else if (K2.o.n("s-maxage", string, true)) {
                            iU2 = N2.c.U(string2, -1);
                        } else if (K2.o.n("private", string, true)) {
                            z8 = true;
                        } else if (K2.o.n("public", string, true)) {
                            z9 = true;
                        } else if (K2.o.n("must-revalidate", string, true)) {
                            z10 = true;
                        } else if (K2.o.n("max-stale", string, true)) {
                            iU3 = N2.c.U(string2, Integer.MAX_VALUE);
                        } else if (K2.o.n("min-fresh", string, true)) {
                            iU4 = N2.c.U(string2, -1);
                        } else if (K2.o.n("only-if-cached", string, true)) {
                            z11 = true;
                        } else if (K2.o.n("no-transform", string, true)) {
                            z12 = true;
                        } else if (K2.o.n("immutable", string, true)) {
                            z13 = true;
                        }
                        i4 = iA2;
                        size = i8;
                        z5 = z3;
                    }
                    i4 = iA2;
                    size = i8;
                    z5 = z3;
                }
                i3 = size;
                i5++;
                tVar2 = tVar;
                size = i3;
            }
            return new C0193d(z6, z7, iU, iU2, z8, z9, z10, iU3, iU4, z11, z12, z13, !z5 ? null : str, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C0193d(boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str) {
        this.f1006a = z3;
        this.f1007b = z4;
        this.f1008c = i3;
        this.f1009d = i4;
        this.f1010e = z5;
        this.f1011f = z6;
        this.f1012g = z7;
        this.f1013h = i5;
        this.f1014i = i6;
        this.f1015j = z8;
        this.f1016k = z9;
        this.f1017l = z10;
        this.f1018m = str;
    }

    public final boolean a() {
        return this.f1010e;
    }

    public final boolean b() {
        return this.f1011f;
    }

    public final int c() {
        return this.f1008c;
    }

    public final int d() {
        return this.f1013h;
    }

    public final int e() {
        return this.f1014i;
    }

    public final boolean f() {
        return this.f1012g;
    }

    public final boolean g() {
        return this.f1006a;
    }

    public final boolean h() {
        return this.f1007b;
    }

    public final boolean i() {
        return this.f1015j;
    }

    public String toString() {
        String str = this.f1018m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1006a) {
            sb.append("no-cache, ");
        }
        if (this.f1007b) {
            sb.append("no-store, ");
        }
        if (this.f1008c != -1) {
            sb.append("max-age=");
            sb.append(this.f1008c);
            sb.append(", ");
        }
        if (this.f1009d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f1009d);
            sb.append(", ");
        }
        if (this.f1010e) {
            sb.append("private, ");
        }
        if (this.f1011f) {
            sb.append("public, ");
        }
        if (this.f1012g) {
            sb.append("must-revalidate, ");
        }
        if (this.f1013h != -1) {
            sb.append("max-stale=");
            sb.append(this.f1013h);
            sb.append(", ");
        }
        if (this.f1014i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f1014i);
            sb.append(", ");
        }
        if (this.f1015j) {
            sb.append("only-if-cached, ");
        }
        if (this.f1016k) {
            sb.append("no-transform, ");
        }
        if (this.f1017l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        D2.h.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f1018m = string;
        return string;
    }

    public /* synthetic */ C0193d(boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z4, i3, i4, z5, z6, z7, i5, i6, z8, z9, z10, str);
    }
}
