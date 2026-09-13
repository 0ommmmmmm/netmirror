package p069r0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p073s0.b;
import p077t0.r;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f10515h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10518k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f10528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f10529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f10530w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f10516i = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10519l = 80;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f10520m = new Paint(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f10521n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f10522o = new Rect();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f10523p = new RectF();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10531x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10532y = 0;

    public a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i3) {
        String str3 = str + ": ";
        float fMeasureText = this.f10520m.measureText(str3);
        float fMeasureText2 = this.f10520m.measureText(str2);
        this.f10520m.setColor(1711276032);
        int i4 = this.f10527t;
        int i5 = this.f10528u;
        canvas.drawRect(i4 - 4, i5 + 8, i4 + fMeasureText + fMeasureText2 + 4.0f, i5 + this.f10526s + 8, this.f10520m);
        this.f10520m.setColor(-1);
        canvas.drawText(str3, this.f10527t, this.f10528u, this.f10520m);
        this.f10520m.setColor(i3);
        canvas.drawText(str2, this.f10527t + fMeasureText, this.f10528u, this.f10520m);
        this.f10528u += this.f10526s;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i3, int i4) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i4, rect.height() / i3)));
        this.f10520m.setTextSize(iMin);
        int i5 = iMin + 8;
        this.f10526s = i5;
        int i6 = this.f10519l;
        if (i6 == 80) {
            this.f10526s = i5 * (-1);
        }
        this.f10524q = rect.left + 10;
        this.f10525r = i6 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // p073s0.b
    public void a(long j3) {
        this.f10529v = j3;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f10516i.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f10520m.setStyle(Paint.Style.STROKE);
        this.f10520m.setStrokeWidth(2.0f);
        this.f10520m.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f10520m);
        Paint paint = this.f10520m;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f10520m.setColor(this.f10532y);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f10520m);
        this.f10520m.setStyle(style);
        this.f10520m.setStrokeWidth(0.0f);
        this.f10520m.setColor(-1);
        this.f10527t = this.f10524q;
        this.f10528u = this.f10525r;
        String str = this.f10510c;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f10509b, str));
        } else {
            d(canvas, "ID", this.f10509b);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f10511d), Integer.valueOf(this.f10512e)), f(this.f10511d, this.f10512e, this.f10515h));
        int i3 = this.f10512e;
        if (i3 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f10511d / i3));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f10513f / 1024)));
        String str2 = this.f10514g;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i4 = this.f10517j;
        if (i4 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i4), Integer.valueOf(this.f10518k)));
        }
        r rVar = this.f10515h;
        if (rVar != null) {
            c(canvas, "scale", rVar);
        }
        long j3 = this.f10529v;
        if (j3 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j3)));
        }
        String str3 = this.f10530w;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f10531x);
        }
        for (Map.Entry entry : this.f10516i.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i3, int i4, r rVar) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i3 > 0 && i4 > 0) {
            if (rVar != null) {
                Rect rect = this.f10522o;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f10521n.reset();
                rVar.a(this.f10521n, this.f10522o, i3, i4, 0.0f, 0.0f);
                RectF rectF = this.f10523p;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i3;
                rectF.bottom = i4;
                this.f10521n.mapRect(rectF);
                int iWidth2 = (int) this.f10523p.width();
                int iHeight2 = (int) this.f10523p.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            }
            float f3 = iWidth;
            float f4 = f3 * 0.1f;
            float f5 = f3 * 0.5f;
            float f6 = iHeight;
            float f7 = 0.1f * f6;
            float f8 = f6 * 0.5f;
            int iAbs = Math.abs(i3 - iWidth);
            int iAbs2 = Math.abs(i4 - iHeight);
            float f9 = iAbs;
            if (f9 < f4 && iAbs2 < f7) {
                return -16711936;
            }
            if (f9 < f5 && iAbs2 < f8) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f10511d = -1;
        this.f10512e = -1;
        this.f10513f = -1;
        this.f10516i = new HashMap();
        this.f10517j = -1;
        this.f10518k = -1;
        this.f10514g = null;
        j(null);
        this.f10529v = -1L;
        this.f10530w = null;
        this.f10531x = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f10509b = str;
        invalidateSelf();
    }

    public void k(int i3, int i4) {
        this.f10511d = i3;
        this.f10512e = i4;
        invalidateSelf();
    }

    public void l(int i3) {
        this.f10513f = i3;
    }

    public void m(r rVar) {
        this.f10515h = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
