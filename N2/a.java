package N2;

import D2.h;
import K2.o;
import b3.i;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (h.g(cCharAt, 31) <= 0 || h.g(cCharAt, 127) >= 0 || o.N(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i3, int i4, byte[] bArr, int i5) {
        int i6 = i5;
        while (i3 < i4) {
            if (i6 == bArr.length) {
                return false;
            }
            if (i6 != i5) {
                if (str.charAt(i3) != '.') {
                    return false;
                }
                i3++;
            }
            int i7 = i3;
            int i8 = 0;
            while (i7 < i4) {
                char cCharAt = str.charAt(i7);
                if (h.g(cCharAt, 48) < 0 || h.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i8 == 0 && i3 != i7) || (i8 = ((i8 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i7++;
            }
            if (i7 - i3 == 0) {
                return false;
            }
            bArr[i6] = (byte) i8;
            i6++;
            i3 = i7;
        }
        return i6 == i5 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[LOOP:1: B:30:0x0069->B:34:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x007c A[EDGE_INSN: B:55:0x007c->B:35:0x007c BREAK  A[LOOP:1: B:30:0x0069->B:34:0x0076], SYNTHETIC] */
    private static final InetAddress c(String str, int i3, int i4) {
        int i5;
        int i6;
        int iF;
        byte[] bArr = new byte[16];
        int i7 = i3;
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        while (i7 < i4) {
            if (i10 == 16) {
                return null;
            }
            int i11 = i7 + 2;
            if (i11 <= i4 && o.y(str, "::", i7, false, 4, null)) {
                if (i8 != -1) {
                    return null;
                }
                i10 += 2;
                if (i11 == i4) {
                    i8 = i10;
                    break;
                }
                i9 = i11;
                i8 = i10;
                i7 = i9;
                i5 = 0;
                while (i7 < i4) {
                    iF = c.F(str.charAt(i7));
                    if (iF == -1) {
                        break;
                        break;
                    }
                    i5 = (i5 << 4) + iF;
                    i7++;
                }
                i6 = i7 - i9;
                if (i6 != 0) {
                }
                return null;
            }
            if (i10 != 0) {
                if (!o.y(str, ":", i7, false, 4, null)) {
                    if (!o.y(str, ".", i7, false, 4, null) || !b(str, i9, i4, bArr, i10 - 2)) {
                        return null;
                    }
                    i10 += 2;
                    break;
                }
                i7++;
            }
            i9 = i7;
            i7 = i9;
            i5 = 0;
            while (i7 < i4) {
                iF = c.F(str.charAt(i7));
                if (iF == -1) {
                    break;
                }
                i5 = (i5 << 4) + iF;
                i7++;
            }
            i6 = i7 - i9;
            if (i6 != 0 || i6 > 4) {
                return null;
            }
            int i12 = i10 + 1;
            bArr[i10] = (byte) ((i5 >>> 8) & 255);
            i10 += 2;
            bArr[i12] = (byte) (i5 & 255);
        }
        if (i10 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i13 = i10 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i13, i13);
            Arrays.fill(bArr, i8, (16 - i10) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String d(byte[] bArr) {
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length) {
            int i7 = i5;
            while (i7 < 16 && bArr[i7] == 0 && bArr[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        i iVar = new i();
        while (i4 < bArr.length) {
            if (i4 == i3) {
                iVar.L(58);
                i4 += i6;
                if (i4 == 16) {
                    iVar.L(58);
                }
            } else {
                if (i4 > 0) {
                    iVar.L(58);
                }
                iVar.n((c.b(bArr[i4], 255) << 8) | c.b(bArr[i4 + 1], 255));
                i4 += 2;
            }
        }
        return iVar.O();
    }

    public static final String e(String str) {
        h.f(str, "$this$toCanonicalHost");
        if (!o.E(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                h.e(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                h.e(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                h.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() != 0 && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (o.z(str, "[", false, 2, null) && o.m(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            h.e(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
