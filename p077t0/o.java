package p077t0;

import D2.h;
import V0.b;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        h.f(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // p077t0.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.f(canvas, "canvas");
        if (b.d()) {
            b.a("RoundedNinePatchDrawable#draw");
        }
        if (!e()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        j();
        g();
        canvas.clipPath(this.f10741f);
        super.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }
}
