package K2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p075s2.AbstractC0492n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class q extends p {

    static final class a extends D2.i implements C2.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f856c = new a();

        a() {
            super(1);
        }

        @Override // C2.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final String d(String str) {
            D2.h.f(str, "line");
            return str;
        }
    }

    static final class b extends D2.i implements C2.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f857c = str;
        }

        @Override // C2.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final String d(String str) {
            D2.h.f(str, "line");
            return this.f857c + str;
        }
    }

    private static final C2.l b(String str) {
        return str.length() == 0 ? a.f856c : new b(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int c(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            if (!K2.b.c(str.charAt(i3))) {
                if (i3 == -1) {
                    return str.length();
                }
                return i3;
            }
            i3++;
        }
        i3 = -1;
        if (i3 == -1) {
            return str.length();
        }
        return i3;
    }

    public static final String d(String str, String str2) {
        String str3;
        D2.h.f(str, "<this>");
        D2.h.f(str2, "newIndent");
        List listX = y.X(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX) {
            if (!o.Q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0492n.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) AbstractC0492n.V(arrayList2);
        int i3 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listX.size());
        C2.l lVarB = b(str2);
        int i4 = AbstractC0492n.i(listX);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listX) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                AbstractC0492n.p();
            }
            String str4 = (String) obj2;
            if ((i3 == 0 || i3 == i4) && o.Q(str4)) {
                str4 = null;
            } else {
                String strX0 = A.x0(str4, iIntValue);
                if (strX0 != null && (str3 = (String) lVarB.d(strX0)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i3 = i5;
        }
        String string = ((StringBuilder) p075s2.x.P(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        D2.h.e(string, "toString(...)");
        return string;
    }

    public static final String e(String str, String str2, String str3) {
        int i3;
        String str4;
        D2.h.f(str, "<this>");
        D2.h.f(str2, "newIndent");
        D2.h.f(str3, "marginPrefix");
        if (o.Q(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listX = y.X(str);
        int length = str.length() + (str2.length() * listX.size());
        C2.l lVarB = b(str2);
        int i4 = AbstractC0492n.i(listX);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : listX) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC0492n.p();
            }
            String str5 = (String) obj;
            String strSubstring = null;
            if ((i5 == 0 || i5 == i4) && o.Q(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!K2.b.c(str5.charAt(i7))) {
                        i3 = i7;
                        break;
                    }
                    i7++;
                }
                if (i3 != -1) {
                    int i8 = i3;
                    if (o.y(str5, str3, i3, false, 4, null)) {
                        int length3 = i8 + str3.length();
                        D2.h.d(str5, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str5.substring(length3);
                        D2.h.e(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str4 = (String) lVarB.d(strSubstring)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i5 = i6;
        }
        String string = ((StringBuilder) p075s2.x.P(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        D2.h.e(string, "toString(...)");
        return string;
    }

    public static String f(String str) {
        D2.h.f(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        D2.h.f(str, "<this>");
        D2.h.f(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
