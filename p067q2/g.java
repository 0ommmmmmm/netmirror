package p067q2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p067q2.a f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f10419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f10420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f10421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f10423g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f10429m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10417a = 16.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f10424h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f10425i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f10426j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10427k = true;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g.this.k();
            return true;
        }
    }

    public g(View view, ViewGroup viewGroup, int i3, p067q2.a aVar) {
        this.f10423g = viewGroup;
        this.f10421e = view;
        this.f10422f = i3;
        this.f10418b = aVar;
        if (aVar instanceof p) {
            ((p) aVar).f(view.getContext());
        }
        i(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private void h() {
        this.f10420d = this.f10418b.e(this.f10420d, this.f10417a);
        if (this.f10418b.b()) {
            return;
        }
        this.f10419c.setBitmap(this.f10420d);
    }

    private void j() {
        this.f10423g.getLocationOnScreen(this.f10424h);
        this.f10421e.getLocationOnScreen(this.f10425i);
        int[] iArr = this.f10425i;
        int i3 = iArr[0];
        int[] iArr2 = this.f10424h;
        int i4 = i3 - iArr2[0];
        int i5 = iArr[1] - iArr2[1];
        float height = this.f10421e.getHeight() / this.f10420d.getHeight();
        float width = this.f10421e.getWidth() / this.f10420d.getWidth();
        this.f10419c.translate((-i4) / width, (-i5) / height);
        this.f10419c.scale(1.0f / width, 1.0f / height);
    }

    @Override // p067q2.e
    public e a(Drawable drawable) {
        this.f10429m = drawable;
        return this;
    }

    @Override // p067q2.b
    public void b() {
        i(this.f10421e.getMeasuredWidth(), this.f10421e.getMeasuredHeight());
    }

    @Override // p067q2.b
    public boolean c(Canvas canvas) {
        if (this.f10427k && this.f10428l) {
            if (canvas instanceof d) {
                return false;
            }
            float height = this.f10421e.getHeight() / this.f10420d.getHeight();
            float width = this.f10421e.getWidth() / this.f10420d.getWidth();
            canvas.save();
            canvas.scale(width, height);
            this.f10418b.d(canvas, this.f10420d);
            canvas.restore();
            int i3 = this.f10422f;
            if (i3 != 0) {
                canvas.drawColor(i3);
            }
        }
        return true;
    }

    @Override // p067q2.e
    public e d(boolean z3) {
        this.f10427k = z3;
        f(z3);
        this.f10421e.invalidate();
        return this;
    }

    @Override // p067q2.b
    public void destroy() {
        f(false);
        this.f10418b.destroy();
        this.f10428l = false;
    }

    @Override // p067q2.e
    public e e(float f3) {
        this.f10417a = f3;
        return this;
    }

    @Override // p067q2.e
    public e f(boolean z3) {
        this.f10423g.getViewTreeObserver().removeOnPreDrawListener(this.f10426j);
        if (z3) {
            this.f10423g.getViewTreeObserver().addOnPreDrawListener(this.f10426j);
        }
        return this;
    }

    @Override // p067q2.e
    public e g(int i3) {
        if (this.f10422f != i3) {
            this.f10422f = i3;
            this.f10421e.invalidate();
        }
        return this;
    }

    void i(int i3, int i4) {
        f(true);
        r rVar = new r(this.f10418b.c());
        if (rVar.b(i3, i4)) {
            this.f10421e.setWillNotDraw(true);
            return;
        }
        this.f10421e.setWillNotDraw(false);
        r.a aVarD = rVar.d(i3, i4);
        this.f10420d = Bitmap.createBitmap(aVarD.f10446a, aVarD.f10447b, this.f10418b.a());
        this.f10419c = new d(this.f10420d);
        this.f10428l = true;
        k();
    }

    void k() {
        if (this.f10427k && this.f10428l) {
            Drawable drawable = this.f10429m;
            if (drawable == null) {
                this.f10420d.eraseColor(0);
            } else {
                drawable.draw(this.f10419c);
            }
            this.f10419c.save();
            j();
            this.f10423g.draw(this.f10419c);
            this.f10419c.restore();
            h();
        }
    }
}
