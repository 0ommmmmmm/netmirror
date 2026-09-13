package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0220p extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0209e f4289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0221q f4290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4291d;

    public C0220p(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            c0209e.b();
        }
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            c0221q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            return c0209e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            return c0209e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            return c0221q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            return c0221q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f4290c.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            c0209e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            c0209e.g(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            c0221q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0221q c0221q = this.f4290c;
        if (c0221q != null && drawable != null && !this.f4291d) {
            c0221q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0221q c0221q2 = this.f4290c;
        if (c0221q2 != null) {
            c0221q2.c();
            if (this.f4291d) {
                return;
            }
            this.f4290c.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f4291d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        this.f4290c.i(i3);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            c0221q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            c0209e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0209e c0209e = this.f4289b;
        if (c0209e != null) {
            c0209e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            c0221q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0221q c0221q = this.f4290c;
        if (c0221q != null) {
            c0221q.k(mode);
        }
    }

    public C0220p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p012d.a.f8660D);
    }

    public C0220p(Context context, AttributeSet attributeSet, int i3) {
        super(e0.b(context), attributeSet, i3);
        this.f4291d = false;
        d0.a(this, getContext());
        C0209e c0209e = new C0209e(this);
        this.f4289b = c0209e;
        c0209e.e(attributeSet, i3);
        C0221q c0221q = new C0221q(this);
        this.f4290c = c0221q;
        c0221q.g(attributeSet, i3);
    }
}
