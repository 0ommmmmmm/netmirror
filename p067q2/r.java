package p067q2;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10445a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f10447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f10448c;

        a(int i3, int i4, float f3) {
            this.f10446a = i3;
            this.f10447b = i4;
            this.f10448c = f3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10446a == aVar.f10446a && this.f10447b == aVar.f10447b && Float.compare(aVar.f10448c, this.f10448c) == 0;
        }

        public int hashCode() {
            int i3 = ((this.f10446a * 31) + this.f10447b) * 31;
            float f3 = this.f10448c;
            return i3 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f10446a + ", height=" + this.f10447b + ", scaleFactor=" + this.f10448c + '}';
        }
    }

    public r(float f3) {
        this.f10445a = f3;
    }

    private int a(float f3) {
        return (int) Math.ceil(f3 / this.f10445a);
    }

    private int c(int i3) {
        int i4 = i3 % 64;
        return i4 == 0 ? i3 : (i3 - i4) + 64;
    }

    boolean b(int i3, int i4) {
        return a((float) i4) == 0 || a((float) i3) == 0;
    }

    a d(int i3, int i4) {
        float f3 = i3;
        int iC = c(a(f3));
        float f4 = f3 / iC;
        return new a(iC, (int) Math.ceil(i4 / f4), f4);
    }
}
