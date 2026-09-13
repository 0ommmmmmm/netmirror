package p044l;

/* JADX INFO: loaded from: classes.dex */
public class d implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9626f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f9628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f9629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9630e;

    public d() {
        this(10);
    }

    private void d() {
        int i3 = this.f9630e;
        long[] jArr = this.f9628c;
        Object[] objArr = this.f9629d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f9626f) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f9627b = false;
        this.f9630e = i4;
    }

    public void b() {
        int i3 = this.f9630e;
        Object[] objArr = this.f9629d;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f9630e = 0;
        this.f9627b = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f9628c = (long[]) this.f9628c.clone();
            dVar.f9629d = (Object[]) this.f9629d.clone();
            return dVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public Object e(long j3) {
        return f(j3, null);
    }

    public Object f(long j3, Object obj) {
        Object obj2;
        int iB = c.b(this.f9628c, this.f9630e, j3);
        return (iB < 0 || (obj2 = this.f9629d[iB]) == f9626f) ? obj : obj2;
    }

    public long g(int i3) {
        if (this.f9627b) {
            d();
        }
        return this.f9628c[i3];
    }

    public void h(long j3, Object obj) {
        int iB = c.b(this.f9628c, this.f9630e, j3);
        if (iB >= 0) {
            this.f9629d[iB] = obj;
            return;
        }
        int i3 = ~iB;
        int i4 = this.f9630e;
        if (i3 < i4) {
            Object[] objArr = this.f9629d;
            if (objArr[i3] == f9626f) {
                this.f9628c[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f9627b && i4 >= this.f9628c.length) {
            d();
            i3 = ~c.b(this.f9628c, this.f9630e, j3);
        }
        int i5 = this.f9630e;
        if (i5 >= this.f9628c.length) {
            int iF = c.f(i5 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f9628c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9629d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9628c = jArr;
            this.f9629d = objArr2;
        }
        int i6 = this.f9630e;
        if (i6 - i3 != 0) {
            long[] jArr3 = this.f9628c;
            int i7 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i7, i6 - i3);
            Object[] objArr4 = this.f9629d;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f9630e - i3);
        }
        this.f9628c[i3] = j3;
        this.f9629d[i3] = obj;
        this.f9630e++;
    }

    public void j(long j3) {
        int iB = c.b(this.f9628c, this.f9630e, j3);
        if (iB >= 0) {
            Object[] objArr = this.f9629d;
            Object obj = objArr[iB];
            Object obj2 = f9626f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f9627b = true;
            }
        }
    }

    public int k() {
        if (this.f9627b) {
            d();
        }
        return this.f9630e;
    }

    public Object l(int i3) {
        if (this.f9627b) {
            d();
        }
        return this.f9629d[i3];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9630e * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f9630e; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(g(i3));
            sb.append('=');
            Object objL = l(i3);
            if (objL != this) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i3) {
        this.f9627b = false;
        if (i3 == 0) {
            this.f9628c = c.f9624b;
            this.f9629d = c.f9625c;
        } else {
            int iF = c.f(i3);
            this.f9628c = new long[iF];
            this.f9629d = new Object[iF];
        }
    }
}
