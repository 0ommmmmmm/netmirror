package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0226w extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0224u f4337b;

    public C0226w(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        Bitmap bitmapB = this.f4337b.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }

    public C0226w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p012d.a.f8666J);
    }

    public C0226w(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        d0.a(this, getContext());
        C0224u c0224u = new C0224u(this);
        this.f4337b = c0224u;
        c0224u.c(attributeSet, i3);
    }
}
