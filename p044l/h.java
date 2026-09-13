package p044l;

/* JADX INFO: loaded from: classes.dex */
public class h implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9661f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f9663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f9664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9665e;

    public h() {
        this(10);
    }

    private void f() {
        int i3 = this.f9665e;
        int[] iArr = this.f9663c;
        Object[] objArr = this.f9664d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f9661f) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f9662b = false;
        this.f9665e = i4;
    }

    public void b(int i3, Object obj) {
        int i4 = this.f9665e;
        if (i4 != 0 && i3 <= this.f9663c[i4 - 1]) {
            m(i3, obj);
            return;
        }
        if (this.f9662b && i4 >= this.f9663c.length) {
            f();
        }
        int i5 = this.f9665e;
        if (i5 >= this.f9663c.length) {
            int iE = c.e(i5 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f9663c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f9664d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9663c = iArr;
            this.f9664d = objArr;
        }
        this.f9663c[i5] = i3;
        this.f9664d[i5] = obj;
        this.f9665e = i5 + 1;
    }

    public void c() {
        int i3 = this.f9665e;
        Object[] objArr = this.f9664d;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f9665e = 0;
        this.f9662b = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f9663c = (int[]) this.f9663c.clone();
            hVar.f9664d = (Object[]) this.f9664d.clone();
            return hVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean e(int i3) {
        return j(i3) >= 0;
    }

    public Object g(int i3) {
        return h(i3, null);
    }

    public Object h(int i3, Object obj) {
        Object obj2;
        int iA = c.a(this.f9663c, this.f9665e, i3);
        return (iA < 0 || (obj2 = this.f9664d[iA]) == f9661f) ? obj : obj2;
    }

    public int j(int i3) {
        if (this.f9662b) {
            f();
        }
        return c.a(this.f9663c, this.f9665e, i3);
    }

    public int k(Object obj) {
        if (this.f9662b) {
            f();
        }
        for (int i3 = 0; i3 < this.f9665e; i3++) {
            if (this.f9664d[i3] == obj) {
                return i3;
            }
        }
        return -1;
    }

    public int l(int i3) {
        if (this.f9662b) {
            f();
        }
        return this.f9663c[i3];
    }

    public void m(int i3, Object obj) {
        int iA = c.a(this.f9663c, this.f9665e, i3);
        if (iA >= 0) {
            this.f9664d[iA] = obj;
            return;
        }
        int i4 = ~iA;
        int i5 = this.f9665e;
        if (i4 < i5) {
            Object[] objArr = this.f9664d;
            if (objArr[i4] == f9661f) {
                this.f9663c[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f9662b && i5 >= this.f9663c.length) {
            f();
            i4 = ~c.a(this.f9663c, this.f9665e, i3);
        }
        int i6 = this.f9665e;
        if (i6 >= this.f9663c.length) {
            int iE = c.e(i6 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f9663c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f9664d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9663c = iArr;
            this.f9664d = objArr2;
        }
        int i7 = this.f9665e;
        if (i7 - i4 != 0) {
            int[] iArr3 = this.f9663c;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr4 = this.f9664d;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f9665e - i4);
        }
        this.f9663c[i4] = i3;
        this.f9664d[i4] = obj;
        this.f9665e++;
    }

    public int n() {
        if (this.f9662b) {
            f();
        }
        return this.f9665e;
    }

    public Object p(int i3) {
        if (this.f9662b) {
            f();
        }
        return this.f9664d[i3];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9665e * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f9665e; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(l(i3));
            sb.append('=');
            Object objP = p(i3);
            if (objP != this) {
                sb.append(objP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i3) {
        this.f9662b = false;
        if (i3 == 0) {
            this.f9663c = c.f9623a;
            this.f9664d = c.f9625c;
        } else {
            int iE = c.e(i3);
            this.f9663c = new int[iE];
            this.f9664d = new Object[iE];
        }
    }
}
