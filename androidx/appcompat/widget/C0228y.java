package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0228y extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0229z f4338b;

    public C0228y(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f4338b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f4338b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4338b.g(canvas);
    }

    public C0228y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p012d.a.f8668L);
    }

    public C0228y(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        d0.a(this, getContext());
        C0229z c0229z = new C0229z(this);
        this.f4338b = c0229z;
        c0229z.c(attributeSet, i3);
    }
}
