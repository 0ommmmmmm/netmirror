package p079t2;

import D2.h;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0480b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map, Serializable, E2.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f10790o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c f10791p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f10792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f10793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f10794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f10795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p079t2.e f10801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p079t2.f f10802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p079t2.d f10803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10804n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i3) {
            return Integer.highestOneBit(H2.d.c(i3, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i3) {
            return Integer.numberOfLeadingZeros(i3) + 1;
        }

        private a() {
        }
    }

    public static final class b extends d implements Iterator, E2.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(cVar);
            h.f(cVar, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0147c next() {
            a();
            if (b() >= e().f10797g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            h(iB + 1);
            i(iB);
            C0147c c0147c = new C0147c(e(), c());
            f();
            return c0147c;
        }

        public final void k(StringBuilder sb) {
            h.f(sb, "sb");
            if (b() >= e().f10797g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            h(iB + 1);
            i(iB);
            Object obj = e().f10792b[c()];
            if (obj == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = e().f10793c;
            h.c(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int l() {
            if (b() >= e().f10797g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            h(iB + 1);
            i(iB);
            Object obj = e().f10792b[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = e().f10793c;
            h.c(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: t2.c$c, reason: collision with other inner class name */
    public static final class C0147c implements Map.Entry, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f10805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10806c;

        public C0147c(c cVar, int i3) {
            h.f(cVar, "map");
            this.f10805b = cVar;
            this.f10806c = i3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (h.b(entry.getKey(), getKey()) && h.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10805b.f10792b[this.f10806c];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f10805b.f10793c;
            h.c(objArr);
            return objArr[this.f10806c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f10805b.m();
            Object[] objArrK = this.f10805b.k();
            int i3 = this.f10806c;
            Object obj2 = objArrK[i3];
            objArrK[i3] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f10807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10810e;

        public d(c cVar) {
            h.f(cVar, "map");
            this.f10807b = cVar;
            this.f10809d = -1;
            this.f10810e = cVar.f10799i;
            f();
        }

        public final void a() {
            if (this.f10807b.f10799i != this.f10810e) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f10808c;
        }

        public final int c() {
            return this.f10809d;
        }

        public final c e() {
            return this.f10807b;
        }

        public final void f() {
            while (this.f10808c < this.f10807b.f10797g) {
                int[] iArr = this.f10807b.f10794d;
                int i3 = this.f10808c;
                if (iArr[i3] >= 0) {
                    return;
                } else {
                    this.f10808c = i3 + 1;
                }
            }
        }

        public final void h(int i3) {
            this.f10808c = i3;
        }

        public final boolean hasNext() {
            return this.f10808c < this.f10807b.f10797g;
        }

        public final void i(int i3) {
            this.f10809d = i3;
        }

        public final void remove() {
            a();
            if (this.f10809d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f10807b.m();
            this.f10807b.K(this.f10809d);
            this.f10809d = -1;
            this.f10810e = this.f10807b.f10799i;
        }
    }

    public static final class e extends d implements Iterator, E2.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(cVar);
            h.f(cVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= e().f10797g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            h(iB + 1);
            i(iB);
            Object obj = e().f10792b[c()];
            f();
            return obj;
        }
    }

    public static final class f extends d implements Iterator, E2.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c cVar) {
            super(cVar);
            h.f(cVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= e().f10797g) {
                throw new NoSuchElementException();
            }
            int iB = b();
            h(iB + 1);
            i(iB);
            Object[] objArr = e().f10793c;
            h.c(objArr);
            Object obj = objArr[c()];
            f();
            return obj;
        }
    }

    static {
        c cVar = new c(0);
        cVar.f10804n = true;
        f10791p = cVar;
    }

    private c(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i3, int i4) {
        this.f10792b = objArr;
        this.f10793c = objArr2;
        this.f10794d = iArr;
        this.f10795e = iArr2;
        this.f10796f = i3;
        this.f10797g = i4;
        this.f10798h = f10790o.d(y());
    }

    private final int C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f10798h;
    }

    private final boolean E(Collection collection) {
        boolean z3 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (F((Map.Entry) it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    private final boolean F(Map.Entry entry) {
        int iJ = j(entry.getKey());
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = entry.getValue();
            return true;
        }
        int i3 = (-iJ) - 1;
        if (h.b(entry.getValue(), objArrK[i3])) {
            return false;
        }
        objArrK[i3] = entry.getValue();
        return true;
    }

    private final boolean G(int i3) {
        int iC = C(this.f10792b[i3]);
        int i4 = this.f10796f;
        while (true) {
            int[] iArr = this.f10795e;
            if (iArr[iC] == 0) {
                iArr[iC] = i3 + 1;
                this.f10794d[i3] = iC;
                return true;
            }
            i4--;
            if (i4 < 0) {
                return false;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final void H() {
        this.f10799i++;
    }

    private final void I(int i3) {
        H();
        int i4 = 0;
        if (this.f10797g > size()) {
            n(false);
        }
        this.f10795e = new int[i3];
        this.f10798h = f10790o.d(i3);
        while (i4 < this.f10797g) {
            int i5 = i4 + 1;
            if (!G(i4)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i4 = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i3) {
        p079t2.b.c(this.f10792b, i3);
        Object[] objArr = this.f10793c;
        if (objArr != null) {
            p079t2.b.c(objArr, i3);
        }
        L(this.f10794d[i3]);
        this.f10794d[i3] = -1;
        this.f10800j = size() - 1;
        H();
    }

    private final void L(int i3) {
        int iE = H2.d.e(this.f10796f * 2, y() / 2);
        int i4 = 0;
        int i5 = i3;
        do {
            i3 = i3 == 0 ? y() - 1 : i3 - 1;
            i4++;
            if (i4 > this.f10796f) {
                this.f10795e[i5] = 0;
                return;
            }
            int[] iArr = this.f10795e;
            int i6 = iArr[i3];
            if (i6 == 0) {
                iArr[i5] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                if (((C(this.f10792b[i7]) - i3) & (y() - 1)) >= i4) {
                    this.f10795e[i5] = i6;
                    this.f10794d[i7] = i5;
                }
                iE--;
            }
            i5 = i3;
            i4 = 0;
            iE--;
        } while (iE >= 0);
        this.f10795e[i5] = -1;
    }

    private final boolean O(int i3) {
        int iW = w();
        int i4 = this.f10797g;
        int i5 = iW - i4;
        int size = i4 - size();
        return i5 < i3 && i5 + size >= i3 && size >= w() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f10793c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrA = p079t2.b.a(w());
        this.f10793c = objArrA;
        return objArrA;
    }

    private final void n(boolean z3) {
        int i3;
        Object[] objArr = this.f10793c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = this.f10797g;
            if (i4 >= i3) {
                break;
            }
            int[] iArr = this.f10794d;
            int i6 = iArr[i4];
            if (i6 >= 0) {
                Object[] objArr2 = this.f10792b;
                objArr2[i5] = objArr2[i4];
                if (objArr != null) {
                    objArr[i5] = objArr[i4];
                }
                if (z3) {
                    iArr[i5] = i6;
                    this.f10795e[i6] = i5 + 1;
                }
                i5++;
            }
            i4++;
        }
        p079t2.b.d(this.f10792b, i5, i3);
        if (objArr != null) {
            p079t2.b.d(objArr, i5, this.f10797g);
        }
        this.f10797g = i5;
    }

    private final boolean q(Map map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void r(int i3) {
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        if (i3 > w()) {
            int iD = AbstractC0480b.f10620b.d(w(), i3);
            this.f10792b = p079t2.b.b(this.f10792b, iD);
            Object[] objArr = this.f10793c;
            this.f10793c = objArr != null ? p079t2.b.b(objArr, iD) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f10794d, iD);
            h.e(iArrCopyOf, "copyOf(...)");
            this.f10794d = iArrCopyOf;
            int iC = f10790o.c(iD);
            if (iC > y()) {
                I(iC);
            }
        }
    }

    private final void s(int i3) {
        if (O(i3)) {
            n(true);
        } else {
            r(this.f10797g + i3);
        }
    }

    private final int u(Object obj) {
        int iC = C(obj);
        int i3 = this.f10796f;
        while (true) {
            int i4 = this.f10795e[iC];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (h.b(this.f10792b[i5], obj)) {
                    return i5;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final int v(Object obj) {
        int i3 = this.f10797g;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f10794d[i3] >= 0) {
                Object[] objArr = this.f10793c;
                h.c(objArr);
                if (h.b(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    private final int y() {
        return this.f10795e.length;
    }

    public int A() {
        return this.f10800j;
    }

    public Collection B() {
        p079t2.f fVar = this.f10802l;
        if (fVar != null) {
            return fVar;
        }
        p079t2.f fVar2 = new p079t2.f(this);
        this.f10802l = fVar2;
        return fVar2;
    }

    public final e D() {
        return new e(this);
    }

    public final boolean J(Map.Entry entry) {
        h.f(entry, "entry");
        m();
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f10793c;
        h.c(objArr);
        if (!h.b(objArr[iU], entry.getValue())) {
            return false;
        }
        K(iU);
        return true;
    }

    public final boolean M(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return false;
        }
        K(iU);
        return true;
    }

    public final boolean N(Object obj) {
        m();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        K(iV);
        return true;
    }

    public final f P() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i3 = this.f10797g - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f10794d;
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    this.f10795e[i5] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        p079t2.b.d(this.f10792b, 0, this.f10797g);
        Object[] objArr = this.f10793c;
        if (objArr != null) {
            p079t2.b.d(objArr, 0, this.f10797g);
        }
        this.f10800j = 0;
        this.f10797g = 0;
        H();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && q((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f10793c;
        h.c(objArr);
        return objArr[iU];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarT = t();
        int iL = 0;
        while (bVarT.hasNext()) {
            iL += bVarT.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        m();
        while (true) {
            int iC = C(obj);
            int iE = H2.d.e(this.f10796f * 2, y() / 2);
            int i3 = 0;
            while (true) {
                int i4 = this.f10795e[iC];
                if (i4 <= 0) {
                    if (this.f10797g >= w()) {
                        s(1);
                        break;
                    }
                    int i5 = this.f10797g;
                    int i6 = i5 + 1;
                    this.f10797g = i6;
                    this.f10792b[i5] = obj;
                    this.f10794d[i5] = iC;
                    this.f10795e[iC] = i6;
                    this.f10800j = size() + 1;
                    H();
                    if (i3 > this.f10796f) {
                        this.f10796f = i3;
                    }
                    return i5;
                }
                if (h.b(this.f10792b[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > iE) {
                    I(y() * 2);
                    break;
                }
                iC = iC == 0 ? y() - 1 : iC - 1;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return z();
    }

    public final Map l() {
        m();
        this.f10804n = true;
        if (size() > 0) {
            return this;
        }
        c cVar = f10791p;
        h.d(cVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return cVar;
    }

    public final void m() {
        if (this.f10804n) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection collection) {
        h.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry entry) {
        h.f(entry, "entry");
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f10793c;
        h.c(objArr);
        return h.b(objArr[iU], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m();
        int iJ = j(obj);
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = obj2;
            return null;
        }
        int i3 = (-iJ) - 1;
        Object obj3 = objArrK[i3];
        objArrK[i3] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        h.f(map, "from");
        m();
        E(map.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f10793c;
        h.c(objArr);
        Object obj2 = objArr[iU];
        K(iU);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarT = t();
        int i3 = 0;
        while (bVarT.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            bVarT.k(sb);
            i3++;
        }
        sb.append("}");
        String string = sb.toString();
        h.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return B();
    }

    public final int w() {
        return this.f10792b.length;
    }

    public Set x() {
        p079t2.d dVar = this.f10803m;
        if (dVar != null) {
            return dVar;
        }
        p079t2.d dVar2 = new p079t2.d(this);
        this.f10803m = dVar2;
        return dVar2;
    }

    public Set z() {
        p079t2.e eVar = this.f10801k;
        if (eVar != null) {
            return eVar;
        }
        p079t2.e eVar2 = new p079t2.e(this);
        this.f10801k = eVar2;
        return eVar2;
    }

    public c() {
        this(8);
    }

    public c(int i3) {
        this(p079t2.b.a(i3), null, new int[i3], new int[f10790o.c(i3)], 2, 0);
    }
}
