package p077t0;

import X.k;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l extends Drawable implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f10697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float[] f10698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float[] f10699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Paint f10700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f10702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f10703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Path f10707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Path f10708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f10710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10711p;

    public l(int i3) {
        this.f10697b = new float[8];
        this.f10698c = new float[8];
        this.f10700e = new Paint(1);
        this.f10701f = false;
        this.f10702g = 0.0f;
        this.f10703h = 0.0f;
        this.f10704i = 0;
        this.f10705j = false;
        this.f10706k = false;
        this.f10707l = new Path();
        this.f10708m = new Path();
        this.f10709n = 0;
        this.f10710o = new RectF();
        this.f10711p = 255;
        d(i3);
    }

    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    private void e() {
        float[] fArr;
        float[] fArr2;
        this.f10707l.reset();
        this.f10708m.reset();
        this.f10710o.set(getBounds());
        RectF rectF = this.f10710o;
        float f3 = this.f10702g;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        int i3 = 0;
        if (this.f10701f) {
            this.f10708m.addCircle(this.f10710o.centerX(), this.f10710o.centerY(), Math.min(this.f10710o.width(), this.f10710o.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i4 = 0;
            while (true) {
                fArr = this.f10698c;
                if (i4 >= fArr.length) {
                    break;
                }
                fArr[i4] = (this.f10697b[i4] + this.f10703h) - (this.f10702g / 2.0f);
                i4++;
            }
            this.f10708m.addRoundRect(this.f10710o, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f10710o;
        float f4 = this.f10702g;
        rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
        float f5 = this.f10703h + (this.f10705j ? this.f10702g : 0.0f);
        this.f10710o.inset(f5, f5);
        if (this.f10701f) {
            this.f10707l.addCircle(this.f10710o.centerX(), this.f10710o.centerY(), Math.min(this.f10710o.width(), this.f10710o.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f10705j) {
            if (this.f10699d == null) {
                this.f10699d = new float[8];
            }
            while (true) {
                fArr2 = this.f10699d;
                if (i3 >= fArr2.length) {
                    break;
                }
                fArr2[i3] = this.f10697b[i3] - this.f10702g;
                i3++;
            }
            this.f10707l.addRoundRect(this.f10710o, fArr2, Path.Direction.CW);
        } else {
            this.f10707l.addRoundRect(this.f10710o, this.f10697b, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f10710o.inset(f6, f6);
    }

    public boolean b() {
        return this.f10706k;
    }

    @Override // p077t0.j
    public void c(int i3, float f3) {
        if (this.f10704i != i3) {
            this.f10704i = i3;
            invalidateSelf();
        }
        if (this.f10702g != f3) {
            this.f10702g = f3;
            e();
            invalidateSelf();
        }
    }

    public void d(int i3) {
        if (this.f10709n != i3) {
            this.f10709n = i3;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f10700e.setColor(C0498e.c(this.f10709n, this.f10711p));
        this.f10700e.setStyle(Paint.Style.FILL);
        this.f10700e.setFilterBitmap(b());
        canvas.drawPath(this.f10707l, this.f10700e);
        if (this.f10702g != 0.0f) {
            this.f10700e.setColor(C0498e.c(this.f10704i, this.f10711p));
            this.f10700e.setStyle(Paint.Style.STROKE);
            this.f10700e.setStrokeWidth(this.f10702g);
            canvas.drawPath(this.f10708m, this.f10700e);
        }
    }

    @Override // p077t0.j
    public void f(boolean z3) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10711p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C0498e.b(C0498e.c(this.f10709n, this.f10711p));
    }

    @Override // p077t0.j
    public void h(boolean z3) {
        this.f10701f = z3;
        e();
        invalidateSelf();
    }

    @Override // p077t0.j
    public void i(float f3) {
        if (this.f10703h != f3) {
            this.f10703h = f3;
            e();
            invalidateSelf();
        }
    }

    @Override // p077t0.j
    public void m(float f3) {
        k.c(f3 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f10697b, f3);
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e();
    }

    @Override // p077t0.j
    public void p(boolean z3) {
        if (this.f10706k != z3) {
            this.f10706k = z3;
            invalidateSelf();
        }
    }

    @Override // p077t0.j
    public void s(boolean z3) {
        if (this.f10705j != z3) {
            this.f10705j = z3;
            e();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (i3 != this.f10711p) {
            this.f10711p = i3;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // p077t0.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f10697b, 0.0f);
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f10697b, 0, 8);
        }
        e();
        invalidateSelf();
    }

    public l(float[] fArr, int i3) {
        this(i3);
        t(fArr);
    }

    public l(float f3, int i3) {
        this(i3);
        m(f3);
    }
}
