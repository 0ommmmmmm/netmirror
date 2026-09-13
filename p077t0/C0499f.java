package p077t0;

import X.k;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p101z0.m;

/* JADX INFO: renamed from: t0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0499f extends C0494a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Drawable[] f10661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f10662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f10664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f10665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f10666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long f10667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int[] f10668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int[] f10669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f10670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean[] f10671t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f10672u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private m f10673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10676y;

    public C0499f(Drawable[] drawableArr) {
        this(drawableArr, false, -1);
    }

    private void h(Canvas canvas, Drawable drawable, int i3) {
        if (drawable == null || i3 <= 0) {
            return;
        }
        this.f10672u++;
        if (this.f10676y) {
            drawable.mutate();
        }
        drawable.setAlpha(i3);
        this.f10672u--;
        drawable.draw(canvas);
    }

    private void q() {
        if (this.f10674w) {
            this.f10674w = false;
            m mVar = this.f10673v;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void r() {
        int i3;
        if (!this.f10674w && (i3 = this.f10664m) >= 0) {
            boolean[] zArr = this.f10671t;
            if (i3 < zArr.length && zArr[i3]) {
                this.f10674w = true;
                m mVar = this.f10673v;
                if (mVar != null) {
                    mVar.b();
                }
            }
        }
    }

    private void s() {
        if (this.f10675x && this.f10665n == 2 && this.f10671t[this.f10664m]) {
            m mVar = this.f10673v;
            if (mVar != null) {
                mVar.a();
            }
            this.f10675x = false;
        }
    }

    private void t() {
        this.f10665n = 2;
        Arrays.fill(this.f10668q, this.f10663l);
        this.f10668q[0] = 255;
        Arrays.fill(this.f10669r, this.f10663l);
        this.f10669r[0] = 255;
        Arrays.fill(this.f10671t, this.f10662k);
        this.f10671t[0] = true;
    }

    private boolean v(float f3) {
        boolean z3 = true;
        for (int i3 = 0; i3 < this.f10661j.length; i3++) {
            boolean z4 = this.f10671t[i3];
            int i4 = z4 ? 1 : -1;
            int[] iArr = this.f10669r;
            int i5 = (int) (this.f10668q[i3] + (i4 * 255 * f3));
            iArr[i3] = i5;
            if (i5 < 0) {
                iArr[i3] = 0;
            }
            if (iArr[i3] > 255) {
                iArr[i3] = 255;
            }
            if (z4 && iArr[i3] < 255) {
                z3 = false;
            }
            if (!z4 && iArr[i3] > 0) {
                z3 = false;
            }
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[EDGE_INSN: B:32:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // p077t0.C0494a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zV;
        Drawable[] drawableArr;
        int i3 = this.f10665n;
        int i4 = 0;
        boolean z3 = true;
        if (i3 != 0) {
            if (i3 == 1) {
                k.i(this.f10666o > 0);
                zV = v((p() - this.f10667p) / this.f10666o);
                this.f10665n = zV ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f10661j;
                if (i4 < drawableArr.length) {
                    break;
                }
                h(canvas, drawableArr[i4], (int) Math.ceil(((double) (this.f10669r[i4] * this.f10670s)) / 255.0d));
                i4++;
            }
            if (z3) {
                invalidateSelf();
            } else {
                q();
                s();
            }
        }
        System.arraycopy(this.f10669r, 0, this.f10668q, 0, this.f10661j.length);
        this.f10667p = p();
        zV = v(this.f10666o == 0 ? 1.0f : 0.0f);
        r();
        this.f10665n = zV ? 2 : 1;
        z3 = zV;
        while (true) {
            drawableArr = this.f10661j;
            if (i4 < drawableArr.length) {
                break;
                break;
            } else {
                h(canvas, drawableArr[i4], (int) Math.ceil(((double) (this.f10669r[i4] * this.f10670s)) / 255.0d));
                i4++;
            }
        }
        if (z3) {
            invalidateSelf();
        } else {
            q();
            s();
        }
    }

    public void f() {
        this.f10672u++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10670s;
    }

    public void i() {
        this.f10672u--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f10672u == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f10665n = 0;
        Arrays.fill(this.f10671t, true);
        invalidateSelf();
    }

    public void k(int i3) {
        this.f10665n = 0;
        this.f10671t[i3] = true;
        invalidateSelf();
    }

    public void l(int i3) {
        this.f10665n = 0;
        this.f10671t[i3] = false;
        invalidateSelf();
    }

    public void m() {
        this.f10665n = 2;
        for (int i3 = 0; i3 < this.f10661j.length; i3++) {
            this.f10669r[i3] = this.f10671t[i3] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long p() {
        return SystemClock.uptimeMillis();
    }

    @Override // p077t0.C0494a, android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (this.f10670s != i3) {
            this.f10670s = i3;
            invalidateSelf();
        }
    }

    public void u(int i3) {
        this.f10666o = i3;
        if (this.f10665n == 1) {
            this.f10665n = 0;
        }
    }

    public C0499f(Drawable[] drawableArr, boolean z3, int i3) {
        super(drawableArr);
        this.f10676y = true;
        k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f10661j = drawableArr;
        this.f10668q = new int[drawableArr.length];
        this.f10669r = new int[drawableArr.length];
        this.f10670s = 255;
        this.f10671t = new boolean[drawableArr.length];
        this.f10672u = 0;
        this.f10662k = z3;
        this.f10663l = z3 ? 255 : 0;
        this.f10664m = i3;
        t();
    }
}
