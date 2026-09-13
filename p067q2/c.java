package p067q2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f10414d = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f10415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10416c;

    public c(Context context) {
        super(context);
        this.f10415b = new f();
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f10431a, i3, 0);
        this.f10416c = typedArrayObtainStyledAttributes.getColor(h.f10432b, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new p() : new q(getContext());
    }

    public e b(boolean z3) {
        return this.f10415b.f(z3);
    }

    public e c(boolean z3) {
        return this.f10415b.d(z3);
    }

    public e d(float f3) {
        return this.f10415b.e(f3);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f10415b.c(canvas)) {
            super.draw(canvas);
        }
    }

    public e e(int i3) {
        this.f10416c = i3;
        return this.f10415b.g(i3);
    }

    public e f(ViewGroup viewGroup) {
        return g(viewGroup, getBlurAlgorithm());
    }

    public e g(ViewGroup viewGroup, a aVar) {
        this.f10415b.destroy();
        g gVar = new g(this, viewGroup, this.f10416c, aVar);
        this.f10415b = gVar;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f10415b.f(true);
        } else {
            Log.e(f10414d, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10415b.f(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f10415b.b();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10415b = new f();
        a(attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f10415b = new f();
        a(attributeSet, i3);
    }
}
