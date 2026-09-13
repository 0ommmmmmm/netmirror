package p077t0;

import X.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class h extends C0500g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f10681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f10682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10684i;

    public h(Drawable drawable, Matrix matrix) {
        super((Drawable) k.g(drawable));
        this.f10683h = 0;
        this.f10684i = 0;
        this.f10681f = matrix;
    }

    private void x() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f10683h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f10684i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f10682g = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f10682g = this.f10681f;
        }
    }

    private void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f10683h == current.getIntrinsicWidth() && this.f10684i == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f10682g == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f10682g);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p077t0.C0500g, p077t0.E
    public void n(Matrix matrix) {
        super.n(matrix);
        Matrix matrix2 = this.f10682g;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        x();
    }

    @Override // p077t0.C0500g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }
}
