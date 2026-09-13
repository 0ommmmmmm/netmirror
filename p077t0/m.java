package p077t0;

import X.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class m extends C0500g implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f10712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f10713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f10714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Matrix f10715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f10716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final float[] f10717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Paint f10718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f10720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f10723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f10726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Path f10727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f10728v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10729a;

        static {
            int[] iArr = new int[b.values().length];
            f10729a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10729a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) k.g(drawable));
        this.f10712f = b.OVERLAY_COLOR;
        this.f10713g = new RectF();
        this.f10716j = new float[8];
        this.f10717k = new float[8];
        this.f10718l = new Paint(1);
        this.f10719m = false;
        this.f10720n = 0.0f;
        this.f10721o = 0;
        this.f10722p = 0;
        this.f10723q = 0.0f;
        this.f10724r = false;
        this.f10725s = false;
        this.f10726t = new Path();
        this.f10727u = new Path();
        this.f10728v = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f10726t.reset();
        this.f10727u.reset();
        this.f10728v.set(getBounds());
        RectF rectF = this.f10728v;
        float f3 = this.f10723q;
        rectF.inset(f3, f3);
        if (this.f10712f == b.OVERLAY_COLOR) {
            this.f10726t.addRect(this.f10728v, Path.Direction.CW);
        }
        if (this.f10719m) {
            this.f10726t.addCircle(this.f10728v.centerX(), this.f10728v.centerY(), Math.min(this.f10728v.width(), this.f10728v.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f10726t.addRoundRect(this.f10728v, this.f10716j, Path.Direction.CW);
        }
        RectF rectF2 = this.f10728v;
        float f4 = this.f10723q;
        rectF2.inset(-f4, -f4);
        RectF rectF3 = this.f10728v;
        float f5 = this.f10720n;
        rectF3.inset(f5 / 2.0f, f5 / 2.0f);
        if (this.f10719m) {
            this.f10727u.addCircle(this.f10728v.centerX(), this.f10728v.centerY(), Math.min(this.f10728v.width(), this.f10728v.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i3 = 0;
            while (true) {
                fArr = this.f10717k;
                if (i3 >= fArr.length) {
                    break;
                }
                fArr[i3] = (this.f10716j[i3] + this.f10723q) - (this.f10720n / 2.0f);
                i3++;
            }
            this.f10727u.addRoundRect(this.f10728v, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f10728v;
        float f6 = this.f10720n;
        rectF4.inset((-f6) / 2.0f, (-f6) / 2.0f);
    }

    @Override // p077t0.j
    public void c(int i3, float f3) {
        this.f10721o = i3;
        this.f10720n = f3;
        z();
        invalidateSelf();
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f10713g.set(getBounds());
        int i3 = a.f10729a[this.f10712f.ordinal()];
        if (i3 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f10726t);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i3 == 2) {
            if (this.f10724r) {
                RectF rectF = this.f10714h;
                if (rectF == null) {
                    this.f10714h = new RectF(this.f10713g);
                    this.f10715i = new Matrix();
                } else {
                    rectF.set(this.f10713g);
                }
                RectF rectF2 = this.f10714h;
                float f3 = this.f10720n;
                rectF2.inset(f3, f3);
                Matrix matrix = this.f10715i;
                if (matrix != null) {
                    matrix.setRectToRect(this.f10713g, this.f10714h, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f10713g);
                canvas.concat(this.f10715i);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f10718l.setStyle(Paint.Style.FILL);
            this.f10718l.setColor(this.f10722p);
            this.f10718l.setStrokeWidth(0.0f);
            this.f10718l.setFilterBitmap(x());
            this.f10726t.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f10726t, this.f10718l);
            if (this.f10719m) {
                float fWidth = ((this.f10713g.width() - this.f10713g.height()) + this.f10720n) / 2.0f;
                float fHeight = ((this.f10713g.height() - this.f10713g.width()) + this.f10720n) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f10713g;
                    float f4 = rectF3.left;
                    canvas.drawRect(f4, rectF3.top, f4 + fWidth, rectF3.bottom, this.f10718l);
                    RectF rectF4 = this.f10713g;
                    float f5 = rectF4.right;
                    canvas.drawRect(f5 - fWidth, rectF4.top, f5, rectF4.bottom, this.f10718l);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f10713g;
                    float f6 = rectF5.left;
                    float f7 = rectF5.top;
                    canvas.drawRect(f6, f7, rectF5.right, f7 + fHeight, this.f10718l);
                    RectF rectF6 = this.f10713g;
                    float f8 = rectF6.left;
                    float f9 = rectF6.bottom;
                    canvas.drawRect(f8, f9 - fHeight, rectF6.right, f9, this.f10718l);
                }
            }
        }
        if (this.f10721o != 0) {
            this.f10718l.setStyle(Paint.Style.STROKE);
            this.f10718l.setColor(this.f10721o);
            this.f10718l.setStrokeWidth(this.f10720n);
            this.f10726t.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f10727u, this.f10718l);
        }
    }

    @Override // p077t0.j
    public void f(boolean z3) {
    }

    @Override // p077t0.j
    public void h(boolean z3) {
        this.f10719m = z3;
        z();
        invalidateSelf();
    }

    @Override // p077t0.j
    public void i(float f3) {
        this.f10723q = f3;
        z();
        invalidateSelf();
    }

    @Override // p077t0.j
    public void m(float f3) {
        Arrays.fill(this.f10716j, f3);
        z();
        invalidateSelf();
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // p077t0.j
    public void p(boolean z3) {
        if (this.f10725s != z3) {
            this.f10725s = z3;
            invalidateSelf();
        }
    }

    @Override // p077t0.j
    public void s(boolean z3) {
        this.f10724r = z3;
        z();
        invalidateSelf();
    }

    @Override // p077t0.j
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f10716j, 0.0f);
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f10716j, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f10725s;
    }

    public void y(int i3) {
        this.f10722p = i3;
        invalidateSelf();
    }
}
