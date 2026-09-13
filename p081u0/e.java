package p081u0;

import X.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10852a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10853b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f10854c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10855d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f10856e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10857f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f10858g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10859h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10860i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10861j = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static e a(float f3) {
        return new e().p(f3);
    }

    private float[] e() {
        if (this.f10854c == null) {
            this.f10854c = new float[8];
        }
        return this.f10854c;
    }

    public int b() {
        return this.f10857f;
    }

    public float c() {
        return this.f10856e;
    }

    public float[] d() {
        return this.f10854c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f10853b == eVar.f10853b && this.f10855d == eVar.f10855d && Float.compare(eVar.f10856e, this.f10856e) == 0 && this.f10857f == eVar.f10857f && Float.compare(eVar.f10858g, this.f10858g) == 0 && this.f10852a == eVar.f10852a && this.f10859h == eVar.f10859h && this.f10860i == eVar.f10860i) {
            return Arrays.equals(this.f10854c, eVar.f10854c);
        }
        return false;
    }

    public int f() {
        return this.f10855d;
    }

    public float g() {
        return this.f10858g;
    }

    public boolean h() {
        return this.f10860i;
    }

    public int hashCode() {
        a aVar = this.f10852a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f10853b ? 1 : 0)) * 31;
        float[] fArr = this.f10854c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f10855d) * 31;
        float f3 = this.f10856e;
        int iFloatToIntBits = (((iHashCode2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + this.f10857f) * 31;
        float f4 = this.f10858g;
        return ((((iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31) + (this.f10859h ? 1 : 0)) * 31) + (this.f10860i ? 1 : 0);
    }

    public boolean i() {
        return this.f10861j;
    }

    public boolean j() {
        return this.f10853b;
    }

    public a k() {
        return this.f10852a;
    }

    public boolean l() {
        return this.f10859h;
    }

    public e m(int i3) {
        this.f10857f = i3;
        return this;
    }

    public e n(float f3) {
        k.c(f3 >= 0.0f, "the border width cannot be < 0");
        this.f10856e = f3;
        return this;
    }

    public e o(float f3, float f4, float f5, float f6) {
        float[] fArrE = e();
        fArrE[1] = f3;
        fArrE[0] = f3;
        fArrE[3] = f4;
        fArrE[2] = f4;
        fArrE[5] = f5;
        fArrE[4] = f5;
        fArrE[7] = f6;
        fArrE[6] = f6;
        return this;
    }

    public e p(float f3) {
        Arrays.fill(e(), f3);
        return this;
    }

    public e q(int i3) {
        this.f10855d = i3;
        this.f10852a = a.OVERLAY_COLOR;
        return this;
    }

    public e r(float f3) {
        k.c(f3 >= 0.0f, "the padding cannot be < 0");
        this.f10858g = f3;
        return this;
    }

    public e s(boolean z3) {
        this.f10860i = z3;
        return this;
    }

    public e t(boolean z3) {
        this.f10853b = z3;
        return this;
    }

    public e u(a aVar) {
        this.f10852a = aVar;
        return this;
    }
}
