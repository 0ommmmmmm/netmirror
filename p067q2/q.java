package p067q2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes.dex */
public class q implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderScript f10440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f10441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f10442d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f10439a = new Paint(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10443e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10444f = -1;

    public q(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f10440b = renderScriptCreate;
        this.f10441c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    private boolean f(Bitmap bitmap) {
        return bitmap.getHeight() == this.f10444f && bitmap.getWidth() == this.f10443e;
    }

    @Override // p067q2.a
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // p067q2.a
    public boolean b() {
        return true;
    }

    @Override // p067q2.a
    public float c() {
        return 6.0f;
    }

    @Override // p067q2.a
    public void d(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f10439a);
    }

    @Override // p067q2.a
    public final void destroy() {
        this.f10441c.destroy();
        this.f10440b.destroy();
        Allocation allocation = this.f10442d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // p067q2.a
    public Bitmap e(Bitmap bitmap, float f3) {
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f10440b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f10442d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f10442d = Allocation.createTyped(this.f10440b, allocationCreateFromBitmap.getType());
            this.f10443e = bitmap.getWidth();
            this.f10444f = bitmap.getHeight();
        }
        this.f10441c.setRadius(f3);
        this.f10441c.setInput(allocationCreateFromBitmap);
        this.f10441c.forEach(this.f10442d);
        this.f10442d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }
}
