package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    private static String[] b(h hVar) {
        long jD;
        long jG;
        String str;
        long j3;
        long jG2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG3 = g(hVar, byteBufferAllocate, 0L);
        if (jG3 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(jG3) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z3 = h(hVar, byteBufferAllocate, 4L) == 1;
        if (h(hVar, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG4 = z3 ? g(hVar, byteBufferAllocate, 28L) : d(hVar, byteBufferAllocate, 32L);
        long jF = z3 ? f(hVar, byteBufferAllocate, 44L) : f(hVar, byteBufferAllocate, 56L);
        int iF = f(hVar, byteBufferAllocate, z3 ? 42L : 54L);
        if (jF == 65535) {
            long jG5 = z3 ? g(hVar, byteBufferAllocate, 32L) : d(hVar, byteBufferAllocate, 40L);
            jF = z3 ? g(hVar, byteBufferAllocate, jG5 + 28) : g(hVar, byteBufferAllocate, jG5 + 44);
        }
        long j4 = jG4;
        long j5 = 0;
        while (true) {
            if (j5 >= jF) {
                jD = 0;
                break;
            }
            if ((z3 ? g(hVar, byteBufferAllocate, j4) : g(hVar, byteBufferAllocate, j4)) == 2) {
                if (!z3) {
                    jD = d(hVar, byteBufferAllocate, j4 + 8);
                    break;
                }
                jD = g(hVar, byteBufferAllocate, j4 + 4);
                break;
            }
            j4 += (long) iF;
            j5++;
        }
        if (jD == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j6 = jD;
        int i3 = 0;
        long jG6 = 0;
        do {
            jG = z3 ? g(hVar, byteBufferAllocate, j6) : d(hVar, byteBufferAllocate, j6);
            str = "malformed DT_NEEDED section";
            if (jG == 1) {
                if (i3 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i3++;
            } else if (jG == 5) {
                jG6 = z3 ? g(hVar, byteBufferAllocate, j6 + 4) : d(hVar, byteBufferAllocate, j6 + 8);
            }
            j6 += z3 ? 8L : 16L;
        } while (jG != 0);
        if (jG6 == 0) {
            throw new a("Dynamic section string-table not found");
        }
        long j7 = jG4;
        int i4 = 0;
        while (true) {
            if (i4 >= jF) {
                jD = jD;
                j3 = 0;
                jG2 = 0;
                break;
            }
            if ((z3 ? g(hVar, byteBufferAllocate, j7) : g(hVar, byteBufferAllocate, j7)) == 1) {
                long jG7 = z3 ? g(hVar, byteBufferAllocate, j7 + 8) : d(hVar, byteBufferAllocate, j7 + 16);
                long jG8 = z3 ? g(hVar, byteBufferAllocate, j7 + 20) : d(hVar, byteBufferAllocate, j7 + 40);
                if (jG7 <= jG6 && jG6 < jG8 + jG7) {
                    jG2 = (z3 ? g(hVar, byteBufferAllocate, j7 + 4) : d(hVar, byteBufferAllocate, j7 + 8)) + (jG6 - jG7);
                    j3 = 0;
                    break;
                }
            } else {
                jF = jF;
                jD = jD;
            }
            j7 += (long) iF;
            i4++;
            jF = jF;
            jD = jD;
        }
        if (jG2 == j3) {
            throw new a("did not find file offset of DT_STRTAB table");
        }
        String[] strArr = new String[i3];
        long j8 = jD;
        int i5 = 0;
        while (true) {
            long jG9 = z3 ? g(hVar, byteBufferAllocate, j8) : d(hVar, byteBufferAllocate, j8);
            if (jG9 == 1) {
                strArr[i5] = e(hVar, byteBufferAllocate, (z3 ? g(hVar, byteBufferAllocate, j8 + 4) : d(hVar, byteBufferAllocate, j8 + 8)) + jG2);
                if (i5 == Integer.MAX_VALUE) {
                    throw new a(str);
                }
                i5++;
            }
            j8 += z3 ? 8L : 16L;
            if (jG9 == 0) {
                if (i5 == i3) {
                    return strArr;
                }
                throw new a(str);
            }
            str = str;
        }
    }

    private static String[] c(i iVar) throws ClosedByInterruptException {
        int i3 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e4) {
                i3++;
                if (i3 > 4) {
                    throw e4;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e4);
                iVar.a();
            }
        }
    }

    private static long d(h hVar, ByteBuffer byteBuffer, long j3) {
        i(hVar, byteBuffer, 8, j3);
        return byteBuffer.getLong();
    }

    private static String e(h hVar, ByteBuffer byteBuffer, long j3) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j4 = 1 + j3;
            short sH = h(hVar, byteBuffer, j3);
            if (sH == 0) {
                return sb.toString();
            }
            sb.append((char) sH);
            j3 = j4;
        }
    }

    private static int f(h hVar, ByteBuffer byteBuffer, long j3) {
        i(hVar, byteBuffer, 2, j3);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(h hVar, ByteBuffer byteBuffer, long j3) {
        i(hVar, byteBuffer, 4, j3);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short h(h hVar, ByteBuffer byteBuffer, long j3) {
        i(hVar, byteBuffer, 1, j3);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(h hVar, ByteBuffer byteBuffer, int i3, long j3) {
        int iZ;
        byteBuffer.position(0);
        byteBuffer.limit(i3);
        while (byteBuffer.remaining() > 0 && (iZ = hVar.Z(byteBuffer, j3)) != -1) {
            j3 += (long) iZ;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
