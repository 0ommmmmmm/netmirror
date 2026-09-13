package p077t0;

import V0.b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class k extends n {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static boolean f10690K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Paint f10691E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Paint f10692F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Bitmap f10693G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private WeakReference f10694H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10695I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private RectF f10696J;

    public k(Resources resources, Bitmap bitmap, Paint paint, boolean z3) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f10691E = paint2;
        Paint paint3 = new Paint(1);
        this.f10692F = paint3;
        this.f10696J = null;
        this.f10693G = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f10695I = z3;
    }

    public static boolean k() {
        return f10690K;
    }

    private void l() {
        Shader shader;
        WeakReference weakReference = this.f10694H;
        if (weakReference == null || weakReference.get() != this.f10693G) {
            this.f10694H = new WeakReference(this.f10693G);
            if (this.f10693G != null) {
                Paint paint = this.f10691E;
                Bitmap bitmap = this.f10693G;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f10742g = true;
            }
        }
        if (this.f10742g && (shader = this.f10691E.getShader()) != null) {
            shader.setLocalMatrix(this.f10760y);
            this.f10742g = false;
        }
        this.f10691E.setFilterBitmap(b());
    }

    @Override // p077t0.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedBitmapDrawable#draw");
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
        l();
        int iSave = canvas.save();
        canvas.concat(this.f10757v);
        if (this.f10695I || this.f10696J == null) {
            canvas.drawPath(this.f10741f, this.f10691E);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f10696J);
            canvas.drawPath(this.f10741f, this.f10691E);
            canvas.restoreToCount(iSave2);
        }
        float f3 = this.f10740e;
        if (f3 > 0.0f) {
            this.f10692F.setStrokeWidth(f3);
            this.f10692F.setColor(C0498e.c(this.f10743h, this.f10691E.getAlpha()));
            canvas.drawPath(this.f10744i, this.f10692F);
        }
        canvas.restoreToCount(iSave);
        if (b.d()) {
            b.b();
        }
    }

    @Override // p077t0.n
    boolean e() {
        return super.e() && this.f10693G != null;
    }

    @Override // p077t0.n, p077t0.j
    public void f(boolean z3) {
        this.f10695I = z3;
    }

    @Override // p077t0.n
    protected void j() {
        super.j();
        if (this.f10695I) {
            return;
        }
        if (this.f10696J == null) {
            this.f10696J = new RectF();
        }
        this.f10760y.mapRect(this.f10696J, this.f10750o);
    }

    @Override // p077t0.n, android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        super.setAlpha(i3);
        if (i3 != this.f10691E.getAlpha()) {
            this.f10691E.setAlpha(i3);
            super.setAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // p077t0.n, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f10691E.setColorFilter(colorFilter);
    }

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        this(resources, bitmap, paint, f10690K);
    }

    public k(Resources resources, Bitmap bitmap) {
        this(resources, bitmap, null);
    }
}
