package p077t0;

import V0.b;
import X.k;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Drawable implements j, D {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private E f10736D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f10737b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float[] f10747l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    RectF f10752q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Matrix f10758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Matrix f10759x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f10738c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f10739d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected float f10740e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Path f10741f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f10742g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f10743h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Path f10744i = new Path();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f10745j = new float[8];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final float[] f10746k = new float[8];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f10748m = new RectF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RectF f10749n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final RectF f10750o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final RectF f10751p = new RectF();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Matrix f10753r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Matrix f10754s = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Matrix f10755t = new Matrix();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Matrix f10756u = new Matrix();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Matrix f10757v = new Matrix();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final Matrix f10760y = new Matrix();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f10761z = 0.0f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f10733A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f10734B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f10735C = true;

    n(Drawable drawable) {
        this.f10737b = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean d(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    public boolean b() {
        return this.f10734B;
    }

    @Override // p077t0.j
    public void c(int i3, float f3) {
        if (this.f10743h == i3 && this.f10740e == f3) {
            return;
        }
        this.f10743h = i3;
        this.f10740e = f3;
        this.f10735C = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f10737b.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedDrawable#draw");
        }
        this.f10737b.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }

    boolean e() {
        return this.f10738c || this.f10739d || this.f10740e > 0.0f;
    }

    public void f(boolean z3) {
    }

    protected void g() {
        float[] fArr;
        if (this.f10735C) {
            this.f10744i.reset();
            RectF rectF = this.f10748m;
            float f3 = this.f10740e;
            rectF.inset(f3 / 2.0f, f3 / 2.0f);
            if (this.f10738c) {
                this.f10744i.addCircle(this.f10748m.centerX(), this.f10748m.centerY(), Math.min(this.f10748m.width(), this.f10748m.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i3 = 0;
                while (true) {
                    fArr = this.f10746k;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    fArr[i3] = (this.f10745j[i3] + this.f10761z) - (this.f10740e / 2.0f);
                    i3++;
                }
                this.f10744i.addRoundRect(this.f10748m, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f10748m;
            float f4 = this.f10740e;
            rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
            this.f10741f.reset();
            float f5 = this.f10761z + (this.f10733A ? this.f10740e : 0.0f);
            this.f10748m.inset(f5, f5);
            if (this.f10738c) {
                this.f10741f.addCircle(this.f10748m.centerX(), this.f10748m.centerY(), Math.min(this.f10748m.width(), this.f10748m.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f10733A) {
                if (this.f10747l == null) {
                    this.f10747l = new float[8];
                }
                for (int i4 = 0; i4 < this.f10746k.length; i4++) {
                    this.f10747l[i4] = this.f10745j[i4] - this.f10740e;
                }
                this.f10741f.addRoundRect(this.f10748m, this.f10747l, Path.Direction.CW);
            } else {
                this.f10741f.addRoundRect(this.f10748m, this.f10745j, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f10748m.inset(f6, f6);
            this.f10741f.setFillType(Path.FillType.WINDING);
            this.f10735C = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10737b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f10737b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10737b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10737b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f10737b.getOpacity();
    }

    @Override // p077t0.j
    public void h(boolean z3) {
        this.f10738c = z3;
        this.f10735C = true;
        invalidateSelf();
    }

    @Override // p077t0.j
    public void i(float f3) {
        if (this.f10761z != f3) {
            this.f10761z = f3;
            this.f10735C = true;
            invalidateSelf();
        }
    }

    protected void j() {
        Matrix matrix;
        Matrix matrix2;
        E e4 = this.f10736D;
        if (e4 != null) {
            e4.n(this.f10755t);
            this.f10736D.g(this.f10748m);
        } else {
            this.f10755t.reset();
            this.f10748m.set(getBounds());
        }
        this.f10750o.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f10751p.set(this.f10737b.getBounds());
        Matrix matrix3 = this.f10753r;
        RectF rectF = this.f10750o;
        RectF rectF2 = this.f10751p;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f10733A) {
            RectF rectF3 = this.f10752q;
            if (rectF3 == null) {
                this.f10752q = new RectF(this.f10748m);
            } else {
                rectF3.set(this.f10748m);
            }
            RectF rectF4 = this.f10752q;
            float f3 = this.f10740e;
            rectF4.inset(f3, f3);
            if (this.f10758w == null) {
                this.f10758w = new Matrix();
            }
            this.f10758w.setRectToRect(this.f10748m, this.f10752q, scaleToFit);
        } else {
            Matrix matrix4 = this.f10758w;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f10755t.equals(this.f10756u) || !this.f10753r.equals(this.f10754s) || ((matrix2 = this.f10758w) != null && !d(matrix2, this.f10759x))) {
            this.f10742g = true;
            this.f10755t.invert(this.f10757v);
            this.f10760y.set(this.f10755t);
            if (this.f10733A && (matrix = this.f10758w) != null) {
                this.f10760y.postConcat(matrix);
            }
            this.f10760y.preConcat(this.f10753r);
            this.f10756u.set(this.f10755t);
            this.f10754s.set(this.f10753r);
            if (this.f10733A) {
                Matrix matrix5 = this.f10759x;
                if (matrix5 == null) {
                    this.f10759x = a(this.f10758w);
                } else {
                    matrix5.set(this.f10758w);
                }
            } else {
                Matrix matrix6 = this.f10759x;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f10748m.equals(this.f10749n)) {
            return;
        }
        this.f10735C = true;
        this.f10749n.set(this.f10748m);
    }

    @Override // p077t0.j
    public void m(float f3) {
        k.i(f3 >= 0.0f);
        Arrays.fill(this.f10745j, f3);
        this.f10739d = f3 != 0.0f;
        this.f10735C = true;
        invalidateSelf();
    }

    @Override // p077t0.D
    public void o(E e4) {
        this.f10736D = e4;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f10737b.setBounds(rect);
    }

    @Override // p077t0.j
    public void p(boolean z3) {
        if (this.f10734B != z3) {
            this.f10734B = z3;
            invalidateSelf();
        }
    }

    @Override // p077t0.j
    public void s(boolean z3) {
        if (this.f10733A != z3) {
            this.f10733A = z3;
            this.f10735C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f10737b.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i3, PorterDuff.Mode mode) {
        this.f10737b.setColorFilter(i3, mode);
    }

    @Override // p077t0.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f10745j, 0.0f);
            this.f10739d = false;
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f10745j, 0, 8);
            this.f10739d = false;
            for (int i3 = 0; i3 < 8; i3++) {
                this.f10739d |= fArr[i3] > 0.0f;
            }
        }
        this.f10735C = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10737b.setColorFilter(colorFilter);
    }
}
