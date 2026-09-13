package p044l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f9612f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f9613g = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object[] f9614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Object[] f9616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f9617k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f9618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f9619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f9620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f9621e;

    class a extends f {
        a() {
        }

        @Override // p044l.f
        protected void a() {
            b.this.clear();
        }

        @Override // p044l.f
        protected Object b(int i3, int i4) {
            return b.this.f9619c[i3];
        }

        @Override // p044l.f
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p044l.f
        protected int d() {
            return b.this.f9620d;
        }

        @Override // p044l.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p044l.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p044l.f
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // p044l.f
        protected void h(int i3) {
            b.this.j(i3);
        }

        @Override // p044l.f
        protected Object i(int i3, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void b(int i3) {
        if (i3 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f9616j;
                    if (objArr != null) {
                        this.f9619c = objArr;
                        f9616j = (Object[]) objArr[0];
                        this.f9618b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f9617k--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f9614h;
                    if (objArr2 != null) {
                        this.f9619c = objArr2;
                        f9614h = (Object[]) objArr2[0];
                        this.f9618b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9615i--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f9618b = new int[i3];
        this.f9619c = new Object[i3];
    }

    private static void e(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f9617k < 10) {
                        objArr[0] = f9616j;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f9616j = objArr;
                        f9617k++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f9615i < 10) {
                        objArr[0] = f9614h;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9614h = objArr;
                        f9615i++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private f f() {
        if (this.f9621e == null) {
            this.f9621e = new a();
        }
        return this.f9621e;
    }

    private int h(Object obj, int i3) {
        int i4 = this.f9620d;
        if (i4 == 0) {
            return -1;
        }
        int iA = c.a(this.f9618b, i4, i3);
        if (iA < 0 || obj.equals(this.f9619c[iA])) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f9618b[i5] == i3) {
            if (obj.equals(this.f9619c[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f9618b[i6] == i3; i6--) {
            if (obj.equals(this.f9619c[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    private int i() {
        int i3 = this.f9620d;
        if (i3 == 0) {
            return -1;
        }
        int iA = c.a(this.f9618b, i3, 0);
        if (iA < 0 || this.f9619c[iA] == null) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f9618b[i4] == 0) {
            if (this.f9619c[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f9618b[i5] == 0; i5--) {
            if (this.f9619c[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public void a(b bVar) {
        int i3 = bVar.f9620d;
        c(this.f9620d + i3);
        if (this.f9620d != 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                add(bVar.k(i4));
            }
        } else if (i3 > 0) {
            System.arraycopy(bVar.f9618b, 0, this.f9618b, 0, i3);
            System.arraycopy(bVar.f9619c, 0, this.f9619c, 0, i3);
            this.f9620d = i3;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i3;
        int iH;
        if (obj == null) {
            iH = i();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iH = h(obj, iHashCode);
        }
        if (iH >= 0) {
            return false;
        }
        int i4 = ~iH;
        int i5 = this.f9620d;
        int[] iArr = this.f9618b;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f9619c;
            b(i6);
            int[] iArr2 = this.f9618b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9619c, 0, objArr.length);
            }
            e(iArr, objArr, this.f9620d);
        }
        int i7 = this.f9620d;
        if (i4 < i7) {
            int[] iArr3 = this.f9618b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f9619c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f9620d - i4);
        }
        this.f9618b[i4] = i3;
        this.f9619c[i4] = obj;
        this.f9620d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        c(this.f9620d + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void c(int i3) {
        int[] iArr = this.f9618b;
        if (iArr.length < i3) {
            Object[] objArr = this.f9619c;
            b(i3);
            int i4 = this.f9620d;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f9618b, 0, i4);
                System.arraycopy(objArr, 0, this.f9619c, 0, this.f9620d);
            }
            e(iArr, objArr, this.f9620d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i3 = this.f9620d;
        if (i3 != 0) {
            e(this.f9618b, this.f9619c, i3);
            this.f9618b = f9612f;
            this.f9619c = f9613g;
            this.f9620d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f9620d; i3++) {
                try {
                    if (!set.contains(k(i3))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f9618b;
        int i3 = this.f9620d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public int indexOf(Object obj) {
        return obj == null ? i() : h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9620d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return f().m().iterator();
    }

    public Object j(int i3) {
        Object[] objArr = this.f9619c;
        Object obj = objArr[i3];
        int i4 = this.f9620d;
        if (i4 <= 1) {
            e(this.f9618b, objArr, i4);
            this.f9618b = f9612f;
            this.f9619c = f9613g;
            this.f9620d = 0;
        } else {
            int[] iArr = this.f9618b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                int i5 = i4 - 1;
                this.f9620d = i5;
                if (i3 < i5) {
                    int i6 = i3 + 1;
                    System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                    Object[] objArr2 = this.f9619c;
                    System.arraycopy(objArr2, i6, objArr2, i3, this.f9620d - i3);
                }
                this.f9619c[this.f9620d] = null;
            } else {
                b(i4 > 8 ? i4 + (i4 >> 1) : 8);
                this.f9620d--;
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f9618b, 0, i3);
                    System.arraycopy(objArr, 0, this.f9619c, 0, i3);
                }
                int i7 = this.f9620d;
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    System.arraycopy(iArr, i8, this.f9618b, i3, i7 - i3);
                    System.arraycopy(objArr, i8, this.f9619c, i3, this.f9620d - i3);
                }
            }
        }
        return obj;
    }

    public Object k(int i3) {
        return this.f9619c[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f9620d - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f9619c[i3])) {
                j(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f9620d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i3 = this.f9620d;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f9619c, 0, objArr, 0, i3);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9620d * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f9620d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objK = k(i3);
            if (objK != this) {
                sb.append(objK);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i3) {
        if (i3 == 0) {
            this.f9618b = f9612f;
            this.f9619c = f9613g;
        } else {
            b(i3);
        }
        this.f9620d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f9620d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f9620d);
        }
        System.arraycopy(this.f9619c, 0, objArr, 0, this.f9620d);
        int length = objArr.length;
        int i3 = this.f9620d;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public b(b bVar) {
        this();
        if (bVar != null) {
            a(bVar);
        }
    }

    public b(Collection<Object> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }
}
