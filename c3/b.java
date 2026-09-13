package c3;

import D2.h;
import b3.C;
import b3.i;
import b3.l;
import p071r2.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f5702a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i3) {
        byte b4;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                int i8 = i7 + 1;
                if (i7 == i3) {
                    return i6;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && 31 >= b5) || (127 <= b5 && 159 >= b5))) || b5 == 65533) {
                    return -1;
                }
                i6 += b5 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 >= length || (b4 = bArr[i5]) < 0) {
                        break;
                    }
                    i5++;
                    i8 = i7 + 1;
                    if (i7 == i3) {
                        return i6;
                    }
                    if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && 31 >= b4) || (127 <= b4 && 159 >= b4))) || b4 == 65533) {
                        return -1;
                    }
                    i6 += b4 < 65536 ? 1 : 2;
                }
            } else {
                if ((b5 >> 5) == -2) {
                    int i9 = i5 + 1;
                    if (length <= i9) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i9];
                    if ((b6 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    int i10 = (b6 ^ 3968) ^ (b5 << 6);
                    if (i10 < 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    i4 = i7 + 1;
                    if (i7 == i3) {
                        return i6;
                    }
                    if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && 31 >= i10) || (127 <= i10 && 159 >= i10))) || i10 == 65533) {
                        return -1;
                    }
                    i6 += i10 < 65536 ? 1 : 2;
                    r rVar = r.f10603a;
                    i5 += 2;
                } else if ((b5 >> 4) == -2) {
                    int i11 = i5 + 2;
                    if (length <= i11) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i5 + 1];
                    if ((b7 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i11];
                    if ((b8 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    int i12 = ((b7 << 6) ^ ((-123008) ^ b8)) ^ (b5 << 12);
                    if (i12 < 2048) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    if (55296 <= i12 && 57343 >= i12) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    i4 = i7 + 1;
                    if (i7 == i3) {
                        return i6;
                    }
                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && 31 >= i12) || (127 <= i12 && 159 >= i12))) || i12 == 65533) {
                        return -1;
                    }
                    i6 += i12 < 65536 ? 1 : 2;
                    r rVar2 = r.f10603a;
                    i5 += 3;
                } else {
                    if ((b5 >> 3) != -2) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    int i13 = i5 + 3;
                    if (length <= i13) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i5 + 1];
                    if ((b9 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i5 + 2];
                    if ((b10 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i13];
                    if ((b11 & 192) != 128) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    int i14 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                    if (i14 > 1114111) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    if (55296 <= i14 && 57343 >= i14) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    if (i14 < 65536) {
                        if (i7 == i3) {
                            return i6;
                        }
                        return -1;
                    }
                    i4 = i7 + 1;
                    if (i7 == i3) {
                        return i6;
                    }
                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && 31 >= i14) || (127 <= i14 && 159 >= i14))) || i14 == 65533) {
                        return -1;
                    }
                    i6 += i14 < 65536 ? 1 : 2;
                    r rVar3 = r.f10603a;
                    i5 += 4;
                }
                i7 = i4;
            }
        }
        return i6;
    }

    public static final l d(l lVar, String str) {
        h.f(lVar, "$this$commonDigest");
        h.f(str, "algorithm");
        c cVarA = d.a(str);
        cVarA.b(lVar.g(), 0, lVar.v());
        return new l(cVarA.a());
    }

    public static final l e(C c4, String str) {
        h.f(c4, "$this$commonSegmentDigest");
        h.f(str, "algorithm");
        c cVarA = d.a(str);
        int length = c4.C().length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = c4.B()[length + i3];
            int i6 = c4.B()[i3];
            cVarA.b(c4.C()[i3], i5, i6 - i4);
            i3++;
            i4 = i6;
        }
        return new l(cVarA.a());
    }

    public static final void f(l lVar, i iVar, int i3, int i4) {
        h.f(lVar, "$this$commonWrite");
        h.f(iVar, "buffer");
        iVar.k(lVar.g(), i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(char c4) {
        if ('0' <= c4 && '9' >= c4) {
            return c4 - '0';
        }
        if ('a' <= c4 && 'f' >= c4) {
            return c4 - 'W';
        }
        if ('A' <= c4 && 'F' >= c4) {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final char[] h() {
        return f5702a;
    }
}
