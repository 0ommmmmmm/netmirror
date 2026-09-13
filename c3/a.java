package c3;

import D2.h;
import b3.A;
import b3.AbstractC0300e;
import b3.i;
import b3.w;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5701a = AbstractC0300e.a("0123456789abcdef");

    public static final byte[] a() {
        return f5701a;
    }

    public static final boolean b(A a4, int i3, byte[] bArr, int i4, int i5) {
        h.f(a4, "segment");
        h.f(bArr, "bytes");
        int i6 = a4.f5593c;
        byte[] bArr2 = a4.f5591a;
        while (i4 < i5) {
            if (i3 == i6) {
                a4 = a4.f5596f;
                h.c(a4);
                byte[] bArr3 = a4.f5591a;
                bArr2 = bArr3;
                i3 = a4.f5592b;
                i6 = a4.f5593c;
            }
            if (bArr2[i3] != bArr[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    public static final String c(i iVar, long j3) throws EOFException {
        h.f(iVar, "$this$readUtf8Line");
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (iVar.a0(j4) == ((byte) 13)) {
                String strD0 = iVar.D0(j4);
                iVar.s(2L);
                return strD0;
            }
        }
        String strD1 = iVar.D0(j3);
        iVar.s(1L);
        return strD1;
    }

    public static final int d(i iVar, w wVar, boolean z3) {
        int i3;
        int i4;
        A a4;
        int i5;
        int i6;
        h.f(iVar, "$this$selectPrefix");
        h.f(wVar, "options");
        A a5 = iVar.f5628b;
        if (a5 == null) {
            return z3 ? -2 : -1;
        }
        byte[] bArr = a5.f5591a;
        int i7 = a5.f5592b;
        int i8 = a5.f5593c;
        int[] iArrF = wVar.f();
        A a6 = a5;
        int i9 = -1;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10 + 1;
            int i12 = iArrF[i10];
            int i13 = i10 + 2;
            int i14 = iArrF[i11];
            if (i14 != -1) {
                i9 = i14;
            }
            if (a6 == null) {
                break;
            }
            if (i12 >= 0) {
                i3 = i7 + 1;
                int i15 = bArr[i7] & 255;
                int i16 = i13 + i12;
                while (i13 != i16) {
                    if (i15 == iArrF[i13]) {
                        i4 = iArrF[i13 + i12];
                        if (i3 == i8) {
                            a6 = a6.f5596f;
                            h.c(a6);
                            i3 = a6.f5592b;
                            bArr = a6.f5591a;
                            i8 = a6.f5593c;
                            if (a6 == a5) {
                                a6 = null;
                            }
                        }
                    } else {
                        i13++;
                    }
                }
                return i9;
            }
            int i17 = i13 + (i12 * (-1));
            while (true) {
                int i18 = i7 + 1;
                int i19 = i13 + 1;
                if ((bArr[i7] & 255) != iArrF[i13]) {
                    return i9;
                }
                boolean z4 = i19 == i17;
                if (i18 == i8) {
                    h.c(a6);
                    A a7 = a6.f5596f;
                    h.c(a7);
                    i6 = a7.f5592b;
                    byte[] bArr2 = a7.f5591a;
                    i5 = a7.f5593c;
                    if (a7 != a5) {
                        a4 = a7;
                        bArr = bArr2;
                    } else {
                        if (!z4) {
                            break loop0;
                        }
                        bArr = bArr2;
                        a4 = null;
                    }
                } else {
                    a4 = a6;
                    i5 = i8;
                    i6 = i18;
                }
                if (z4) {
                    i4 = iArrF[i19];
                    i3 = i6;
                    i8 = i5;
                    a6 = a4;
                    break;
                }
                i7 = i6;
                i8 = i5;
                a6 = a4;
                i13 = i19;
            }
            if (i4 >= 0) {
                return i4;
            }
            i10 = -i4;
            i7 = i3;
        }
        if (z3) {
            return -2;
        }
        return i9;
    }

    public static /* synthetic */ int e(i iVar, w wVar, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return d(iVar, wVar, z3);
    }
}
