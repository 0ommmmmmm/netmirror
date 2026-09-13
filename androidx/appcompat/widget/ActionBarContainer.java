package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f3659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f3660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f3661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f3662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f3663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Drawable f3664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f3665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f3666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3667k;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3662f;
        if (drawable != null && drawable.isStateful()) {
            this.f3662f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3663g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3663g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3664h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3664h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f3659c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3662f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3663g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3664h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3660d = findViewById(p012d.f.f8785a);
        this.f3661e = findViewById(p012d.f.f8790f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3658b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Drawable drawable;
        super.onLayout(z3, i3, i4, i5, i6);
        View view = this.f3659c;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i7 = layoutParams.bottomMargin;
            view.layout(i3, measuredHeight2 - i7, i5, measuredHeight - i7);
        }
        if (this.f3665i) {
            Drawable drawable2 = this.f3664h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = z5;
            }
        } else {
            if (this.f3662f != null) {
                if (this.f3660d.getVisibility() == 0) {
                    this.f3662f.setBounds(this.f3660d.getLeft(), this.f3660d.getTop(), this.f3660d.getRight(), this.f3660d.getBottom());
                } else {
                    View view2 = this.f3661e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f3662f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f3662f.setBounds(this.f3661e.getLeft(), this.f3661e.getTop(), this.f3661e.getRight(), this.f3661e.getBottom());
                    }
                }
                z5 = true;
            }
            this.f3666j = z6;
            if (!z6 || (drawable = this.f3663g) == null) {
                z4 = z5;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        int iA;
        int i5;
        if (this.f3660d == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f3667k) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f3660d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        View view = this.f3659c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f3660d)) {
            iA = !b(this.f3661e) ? a(this.f3661e) : 0;
        } else {
            iA = a(this.f3660d);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f3659c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i4) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3662f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3662f);
        }
        this.f3662f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3660d;
            if (view != null) {
                this.f3662f.setBounds(view.getLeft(), this.f3660d.getTop(), this.f3660d.getRight(), this.f3660d.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3665i ? !(this.f3662f != null || this.f3663g != null) : this.f3664h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3664h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3664h);
        }
        this.f3664h = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3665i && (drawable2 = this.f3664h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f3665i ? !(this.f3662f != null || this.f3663g != null) : this.f3664h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3663g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3663g);
        }
        this.f3663g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3666j && (drawable2 = this.f3663g) != null) {
                drawable2.setBounds(this.f3659c.getLeft(), this.f3659c.getTop(), this.f3659c.getRight(), this.f3659c.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3665i ? !(this.f3662f != null || this.f3663g != null) : this.f3664h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f3659c;
        if (view != null) {
            removeView(view);
        }
        this.f3659c = a0Var;
        if (a0Var != null) {
            addView(a0Var);
            ViewGroup.LayoutParams layoutParams = a0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            a0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z3) {
        this.f3658b = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f3662f;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f3663g;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f3664h;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f3662f && !this.f3665i) || (drawable == this.f3663g && this.f3666j) || ((drawable == this.f3664h && this.f3665i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0206b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012d.j.f8953a);
        this.f3662f = typedArrayObtainStyledAttributes.getDrawable(p012d.j.f8958b);
        this.f3663g = typedArrayObtainStyledAttributes.getDrawable(p012d.j.f8968d);
        this.f3667k = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012d.j.f8994j, -1);
        boolean z3 = true;
        if (getId() == p012d.f.f8776H) {
            this.f3665i = true;
            this.f3664h = typedArrayObtainStyledAttributes.getDrawable(p012d.j.f8963c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3665i ? this.f3662f != null || this.f3663g != null : this.f3664h != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
