package p077t0;

import X.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: t0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0495b extends C0500g implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f10652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10653i;

    public RunnableC0495b(Drawable drawable, int i3) {
        this(drawable, i3, true);
    }

    private int x() {
        return (int) ((20.0f / this.f10650f) * 360.0f);
    }

    private void y() {
        if (this.f10653i) {
            return;
        }
        this.f10653i = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i3 = bounds.right;
        int i4 = bounds.left;
        int i5 = i3 - i4;
        int i6 = bounds.bottom;
        int i7 = bounds.top;
        int i8 = i6 - i7;
        float f3 = this.f10652h;
        if (!this.f10651g) {
            f3 = 360.0f - f3;
        }
        canvas.rotate(f3, i4 + (i5 / 2), i7 + (i8 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10653i = false;
        this.f10652h += x();
        invalidateSelf();
    }

    public RunnableC0495b(Drawable drawable, int i3, boolean z3) {
        super((Drawable) k.g(drawable));
        this.f10652h = 0.0f;
        this.f10653i = false;
        this.f10650f = i3;
        this.f10651g = z3;
    }
}
