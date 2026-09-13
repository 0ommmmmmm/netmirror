package b3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0480b;
import p075s2.AbstractC0486h;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0480b implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5662e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l[] f5663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f5664d;

    public static final class a {
        private a() {
        }

        private final void a(long j3, i iVar, int i3, List list, int i4, int i5, List list2) {
            int i6;
            int i7;
            int i8;
            int i9 = i3;
            if (!(i4 < i5)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i10 = i4; i10 < i5; i10++) {
                if (!(((l) list.get(i10)).v() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            l lVar = (l) list.get(i4);
            l lVar2 = (l) list.get(i5 - 1);
            int i11 = -1;
            if (i9 == lVar.v()) {
                int iIntValue = ((Number) list2.get(i4)).intValue();
                int i12 = i4 + 1;
                l lVar3 = (l) list.get(i12);
                i6 = i12;
                i7 = iIntValue;
                lVar = lVar3;
            } else {
                i6 = i4;
                i7 = -1;
            }
            if (lVar.f(i9) == lVar2.f(i9)) {
                int iMin = Math.min(lVar.v(), lVar2.v());
                int i13 = 0;
                for (int i14 = i9; i14 < iMin && lVar.f(i14) == lVar2.f(i14); i14++) {
                    i13++;
                }
                long jC = j3 + c(iVar) + ((long) 2) + ((long) i13) + 1;
                iVar.E(-i13);
                iVar.E(i7);
                int i15 = i9 + i13;
                while (i9 < i15) {
                    iVar.E(lVar.f(i9) & 255);
                    i9++;
                }
                if (i6 + 1 == i5) {
                    if (!(i15 == ((l) list.get(i6)).v())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    iVar.E(((Number) list2.get(i6)).intValue());
                    return;
                } else {
                    i iVar2 = new i();
                    iVar.E(((int) (c(iVar2) + jC)) * (-1));
                    a(jC, iVar2, i15, list, i6, i5, list2);
                    iVar.T(iVar2);
                    return;
                }
            }
            int i16 = 1;
            for (int i17 = i6 + 1; i17 < i5; i17++) {
                if (((l) list.get(i17 - 1)).f(i9) != ((l) list.get(i17)).f(i9)) {
                    i16++;
                }
            }
            long jC2 = j3 + c(iVar) + ((long) 2) + ((long) (i16 * 2));
            iVar.E(i16);
            iVar.E(i7);
            for (int i18 = i6; i18 < i5; i18++) {
                byte bF = ((l) list.get(i18)).f(i9);
                if (i18 == i6 || bF != ((l) list.get(i18 - 1)).f(i9)) {
                    iVar.E(bF & 255);
                }
            }
            i iVar3 = new i();
            while (i6 < i5) {
                byte bF2 = ((l) list.get(i6)).f(i9);
                int i19 = i6 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 >= i5) {
                        i8 = i5;
                        break;
                    } else {
                        if (bF2 != ((l) list.get(i20)).f(i9)) {
                            i8 = i20;
                            break;
                        }
                        i20++;
                    }
                }
                if (i19 == i8 && i9 + 1 == ((l) list.get(i6)).v()) {
                    iVar.E(((Number) list2.get(i6)).intValue());
                } else {
                    iVar.E(((int) (jC2 + c(iVar3))) * i11);
                    a(jC2, iVar3, i9 + 1, list, i6, i8, list2);
                }
                iVar3 = iVar3;
                i6 = i8;
                i11 = -1;
            }
            iVar.T(iVar3);
        }

        static /* synthetic */ void b(a aVar, long j3, i iVar, int i3, List list, int i4, int i5, List list2, int i6, Object obj) {
            aVar.a((i6 & 1) != 0 ? 0L : j3, iVar, (i6 & 4) != 0 ? 0 : i3, list, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? list.size() : i5, list2);
        }

        private final long c(i iVar) {
            return iVar.F0() / ((long) 4);
        }

        public final w d(l... lVarArr) {
            D2.h.f(lVarArr, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i3 = 0;
            if (lVarArr.length == 0) {
                return new w(new l[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listC = AbstractC0486h.C(lVarArr);
            AbstractC0492n.r(listC);
            ArrayList arrayList = new ArrayList(lVarArr.length);
            for (l lVar : lVarArr) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            List listL = AbstractC0492n.l((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = lVarArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                listL.set(AbstractC0492n.f(listC, lVarArr[i4], 0, 0, 6, null), Integer.valueOf(i5));
                i4++;
                i5++;
            }
            if (!(((l) listC.get(0)).v() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i6 = 0;
            while (i6 < listC.size()) {
                l lVar2 = (l) listC.get(i6);
                int i7 = i6 + 1;
                int i8 = i7;
                while (i8 < listC.size()) {
                    l lVar3 = (l) listC.get(i8);
                    if (!lVar3.w(lVar2)) {
                        break;
                    }
                    if (!(lVar3.v() != lVar2.v())) {
                        throw new IllegalArgumentException(("duplicate option: " + lVar3).toString());
                    }
                    if (((Number) listL.get(i8)).intValue() > ((Number) listL.get(i6)).intValue()) {
                        listC.remove(i8);
                        listL.remove(i8);
                    } else {
                        i8++;
                    }
                }
                i6 = i7;
            }
            i iVar = new i();
            b(this, 0L, iVar, 0, listC, 0, 0, listL, 53, null);
            int[] iArr = new int[(int) c(iVar)];
            while (!iVar.J()) {
                iArr[i3] = iVar.B();
                i3++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(lVarArr, lVarArr.length);
            D2.h.e(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new w((l[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ w(l[] lVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVarArr, iArr);
    }

    @Override // p075s2.AbstractC0479a
    public int a() {
        return this.f5663c.length;
    }

    public /* bridge */ boolean b(l lVar) {
        return super.contains(lVar);
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l get(int i3) {
        return this.f5663c[i3];
    }

    @Override // p075s2.AbstractC0479a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return b((l) obj);
        }
        return false;
    }

    public final l[] e() {
        return this.f5663c;
    }

    public final int[] f() {
        return this.f5664d;
    }

    public /* bridge */ int h(l lVar) {
        return super.indexOf(lVar);
    }

    public /* bridge */ int i(l lVar) {
        return super.lastIndexOf(lVar);
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return h((l) obj);
        }
        return -1;
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return i((l) obj);
        }
        return -1;
    }

    private w(l[] lVarArr, int[] iArr) {
        this.f5663c = lVarArr;
        this.f5664d = iArr;
    }
}
