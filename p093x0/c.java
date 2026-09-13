package p093x0;

import V0.b;
import X.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p089w0.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends ImageView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f10965h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.C0155a f10966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f10968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f10971g;

    public c(Context context) {
        super(context);
        this.f10966b = new a.C0155a();
        this.f10967c = 0.0f;
        this.f10969e = false;
        this.f10970f = false;
        this.f10971g = null;
        c(context);
    }

    private void c(Context context) {
        boolean zD;
        try {
            if (b.d()) {
                b.a("DraweeView#init");
            }
            if (this.f10969e) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z3 = true;
            this.f10969e = true;
            this.f10968d = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f10965h || context.getApplicationInfo().targetSdkVersion < 24) {
                z3 = false;
            }
            this.f10970f = z3;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f10970f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z3) {
        f10965h = z3;
    }

    protected void a() {
        this.f10968d.j();
    }

    protected void b() {
        this.f10968d.k();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f10967c;
    }

    public a getController() {
        return this.f10968d.e();
    }

    public Object getExtraData() {
        return this.f10971g;
    }

    public p089w0.b getHierarchy() {
        return this.f10968d.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f10968d.g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i3, int i4) {
        a.C0155a c0155a = this.f10966b;
        c0155a.f10957a = i3;
        c0155a.f10958b = i4;
        a.b(c0155a, this.f10967c, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0155a c0155a2 = this.f10966b;
        super.onMeasure(c0155a2.f10957a, c0155a2.f10958b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10968d.l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        d();
    }

    public void setAspectRatio(float f3) {
        if (f3 == this.f10967c) {
            return;
        }
        this.f10967c = f3;
        requestLayout();
    }

    public void setController(a aVar) {
        this.f10968d.o(aVar);
        super.setImageDrawable(this.f10968d.g());
    }

    public void setExtraData(Object obj) {
        this.f10971g = obj;
    }

    public void setHierarchy(p089w0.b bVar) {
        this.f10968d.p(bVar);
        super.setImageDrawable(this.f10968d.g());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f10968d.n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f10968d.n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i3) {
        c(getContext());
        this.f10968d.n();
        super.setImageResource(i3);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f10968d.n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z3) {
        this.f10970f = z3;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b bVar = this.f10968d;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10966b = new a.C0155a();
        this.f10967c = 0.0f;
        this.f10969e = false;
        this.f10970f = false;
        this.f10971g = null;
        c(context);
    }

    public c(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f10966b = new a.C0155a();
        this.f10967c = 0.0f;
        this.f10969e = false;
        this.f10970f = false;
        this.f10971g = null;
        c(context);
    }

    public c(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f10966b = new a.C0155a();
        this.f10967c = 0.0f;
        this.f10969e = false;
        this.f10970f = false;
        this.f10971g = null;
        c(context);
    }
}
