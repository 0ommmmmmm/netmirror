package p077t0;

import D2.h;
import X.i;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C0500g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f10762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PointF f10764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Matrix f10767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Matrix f10768l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Drawable drawable, r rVar) {
        super(drawable);
        h.f(rVar, "scaleType");
        this.f10768l = new Matrix();
        this.f10762f = rVar;
    }

    private final void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f10765i == current.getIntrinsicWidth() && this.f10766j == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public final r A() {
        return this.f10762f;
    }

    public final void B(PointF pointF) {
        if (i.a(this.f10764h, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f10764h = null;
        } else {
            if (this.f10764h == null) {
                this.f10764h = new PointF();
            }
            PointF pointF2 = this.f10764h;
            h.c(pointF2);
            pointF2.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public final void C(r rVar) {
        h.f(rVar, "scaleType");
        if (i.a(this.f10762f, rVar)) {
            return;
        }
        this.f10762f = rVar;
        this.f10763g = null;
        x();
        invalidateSelf();
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.f(canvas, "canvas");
        y();
        if (this.f10767k == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f10767k);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p077t0.C0500g, p077t0.E
    public void n(Matrix matrix) {
        h.f(matrix, "transform");
        u(matrix);
        y();
        Matrix matrix2 = this.f10767k;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        h.f(rect, "bounds");
        x();
    }

    @Override // p077t0.C0500g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }

    public final void x() {
        float f3;
        float f4;
        Drawable current = getCurrent();
        if (current == null) {
            this.f10766j = 0;
            this.f10765i = 0;
            this.f10767k = null;
            return;
        }
        Rect bounds = getBounds();
        h.e(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f10765i = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f10766j = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f10767k = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f10767k = null;
            return;
        }
        if (this.f10762f == r.f10769a) {
            current.setBounds(bounds);
            this.f10767k = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f10768l.reset();
        r rVar = this.f10762f;
        Matrix matrix = this.f10768l;
        PointF pointF = this.f10764h;
        if (pointF != null) {
            h.c(pointF);
            f3 = pointF.x;
        } else {
            f3 = 0.5f;
        }
        PointF pointF2 = this.f10764h;
        if (pointF2 != null) {
            h.c(pointF2);
            f4 = pointF2.y;
        } else {
            f4 = 0.5f;
        }
        rVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f3, f4);
        this.f10767k = this.f10768l;
    }

    public final PointF z() {
        return this.f10764h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Drawable drawable, r rVar, PointF pointF) {
        super(drawable);
        h.f(rVar, "scaleType");
        this.f10768l = new Matrix();
        this.f10762f = rVar;
        this.f10764h = pointF;
    }
}
