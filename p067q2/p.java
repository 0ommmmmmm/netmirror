package p067q2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public class p implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10435c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f10437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f10438f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderNode f10433a = o.a("BlurViewNode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10436d = 1.0f;

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
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f10433a);
            return;
        }
        if (this.f10437e == null) {
            this.f10437e = new q(this.f10438f);
        }
        this.f10437e.e(bitmap, this.f10436d);
        this.f10437e.d(canvas, bitmap);
    }

    @Override // p067q2.a
    public void destroy() {
        this.f10433a.discardDisplayList();
        a aVar = this.f10437e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // p067q2.a
    public Bitmap e(Bitmap bitmap, float f3) {
        this.f10436d = f3;
        if (bitmap.getHeight() != this.f10434b || bitmap.getWidth() != this.f10435c) {
            this.f10434b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f10435c = width;
            this.f10433a.setPosition(0, 0, width, this.f10434b);
        }
        this.f10433a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f10433a.endRecording();
        this.f10433a.setRenderEffect(RenderEffect.createBlurEffect(f3, f3, Shader.TileMode.MIRROR));
        return bitmap;
    }

    void f(Context context) {
        this.f10438f = context;
    }
}
