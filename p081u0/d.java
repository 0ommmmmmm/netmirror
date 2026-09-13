package p081u0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p077t0.C0500g;
import p077t0.F;
import p077t0.G;

/* JADX INFO: loaded from: classes.dex */
public class d extends C0500g implements F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f10850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private G f10851g;

    public d(Drawable drawable) {
        super(drawable);
        this.f10850f = null;
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            G g3 = this.f10851g;
            if (g3 != null) {
                g3.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f10850f;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f10850f.draw(canvas);
            }
        }
    }

    @Override // p077t0.F
    public void e(G g3) {
        this.f10851g = g3;
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        G g3 = this.f10851g;
        if (g3 != null) {
            g3.i(z3);
        }
        return super.setVisible(z3, z4);
    }

    public void x(Drawable drawable) {
        this.f10850f = drawable;
        invalidateSelf();
    }
}
