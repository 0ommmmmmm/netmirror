package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC0268w;

/* JADX INFO: loaded from: classes.dex */
public class T extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f3921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f3923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f3924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f3925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3929p;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i3, int i4) {
            super(i3, i4);
        }

        public a(int i3, int i4, float f3) {
            super(i3, i4, f3);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public T(Context context) {
        this(context, null);
    }

    private void i(int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i5 = 0; i5 < i3; i5++) {
            View viewQ = q(i5);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i6 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    measureChildWithMargins(viewQ, i4, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i6;
                }
            }
        }
    }

    private void j(int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i5 = 0; i5 < i3; i5++) {
            View viewQ = q(i5);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i6 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i4, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i6;
                }
            }
        }
    }

    private void y(View view, int i3, int i4, int i5, int i6) {
        view.layout(i3, i4, i5 + i3, i6 + i4);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = s0.b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View viewQ = q(i4);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i4)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f3926m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i3 = this.f3926m;
                    right = left - i3;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f3926m;
                right = left - i3;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewQ = q(i3);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i3)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f3927n);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f3927n : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i3) {
        this.f3925l.setBounds(getPaddingLeft() + this.f3929p, i3, (getWidth() - getPaddingRight()) - this.f3929p, this.f3927n + i3);
        this.f3925l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f3916c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f3916c;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3916c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f3917d;
        if (this.f3918e == 1 && (i3 = this.f3919f & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3920g) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3920g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3916c;
    }

    public Drawable getDividerDrawable() {
        return this.f3925l;
    }

    public int getDividerPadding() {
        return this.f3929p;
    }

    public int getDividerWidth() {
        return this.f3926m;
    }

    public int getGravity() {
        return this.f3919f;
    }

    public int getOrientation() {
        return this.f3918e;
    }

    public int getShowDividers() {
        return this.f3928o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3921h;
    }

    void h(Canvas canvas, int i3) {
        this.f3925l.setBounds(i3, getPaddingTop() + this.f3929p, this.f3926m + i3, (getHeight() - getPaddingBottom()) - this.f3929p);
        this.f3925l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i3 = this.f3918e;
        if (i3 == 0) {
            return new a(-2, -2);
        }
        if (i3 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    int n(View view, int i3) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f3925l == null) {
            return;
        }
        if (this.f3918e == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        if (this.f3918e == 1) {
            t(i3, i4, i5, i6);
        } else {
            s(i3, i4, i5, i6);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        if (this.f3918e == 1) {
            x(i3, i4);
        } else {
            v(i3, i4);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i3) {
        return getChildAt(i3);
    }

    protected boolean r(int i3) {
        if (i3 == 0) {
            return (this.f3928o & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f3928o & 4) != 0;
        }
        if ((this.f3928o & 2) == 0) {
            return false;
        }
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (getChildAt(i4).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    void s(int i3, int i4, int i5, int i6) {
        int paddingLeft;
        int i7;
        int i8;
        boolean z3;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        boolean zB = s0.b(this);
        int paddingTop = getPaddingTop();
        int i11 = i6 - i4;
        int paddingBottom = i11 - getPaddingBottom();
        int paddingBottom2 = (i11 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i12 = this.f3919f;
        int i13 = i12 & 112;
        boolean z4 = this.f3915b;
        int[] iArr = this.f3923j;
        int[] iArr2 = this.f3924k;
        int iA = AbstractC0268w.a(8388615 & i12, getLayoutDirection());
        boolean z5 = true;
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.f3920g;
        } else {
            paddingLeft = getPaddingLeft() + (((i5 - i3) - this.f3920g) / 2);
        }
        if (zB) {
            i7 = virtualChildCount - 1;
            i8 = -1;
        } else {
            i7 = 0;
            i8 = 1;
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            int i14 = i7 + (i8 * iN);
            View viewQ = q(i14);
            if (viewQ == null) {
                paddingLeft += w(i14);
                z3 = z5;
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i15 = iN;
                    if (z4) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i9 < 0) {
                            i9 = i13;
                        }
                        i10 = i9 & 112;
                        i13 = i13;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z3 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i10 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewQ.getMeasuredHeight() - baseline);
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        if (r(i14)) {
                            paddingLeft += this.f3926m;
                        }
                        int i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        y(viewQ, i16 + o(viewQ), measuredHeight, measuredWidth, measuredHeight2);
                        int iP = i16 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(viewQ);
                        iN = i15 + n(viewQ, i14);
                        paddingLeft = iP;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i9 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i9 < 0) {
                        i9 = i13;
                    }
                    i10 = i9 & 112;
                    i13 = i13;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z3 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewQ.getMeasuredHeight() - baseline);
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    if (r(i14)) {
                        paddingLeft += this.f3926m;
                    }
                    int i17 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    y(viewQ, i17 + o(viewQ), measuredHeight, measuredWidth, measuredHeight2);
                    int iP2 = i17 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(viewQ);
                    iN = i15 + n(viewQ, i14);
                    paddingLeft = iP2;
                } else {
                    z3 = true;
                }
                iN++;
                virtualChildCount = virtualChildCount;
                i13 = i13;
                z5 = z3;
                paddingTop = paddingTop;
            }
            iN++;
            virtualChildCount = virtualChildCount;
            i13 = i13;
            z5 = z3;
            paddingTop = paddingTop;
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f3915b = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f3916c = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3925l) {
            return;
        }
        this.f3925l = drawable;
        if (drawable != null) {
            this.f3926m = drawable.getIntrinsicWidth();
            this.f3927n = drawable.getIntrinsicHeight();
        } else {
            this.f3926m = 0;
            this.f3927n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f3929p = i3;
    }

    public void setGravity(int i3) {
        if (this.f3919f != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3919f = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3919f;
        if ((8388615 & i5) != i4) {
            this.f3919f = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f3922i = z3;
    }

    public void setOrientation(int i3) {
        if (this.f3918e != i3) {
            this.f3918e = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f3928o) {
            requestLayout();
        }
        this.f3928o = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3919f;
        if ((i5 & 112) != i4) {
            this.f3919f = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f3921h = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    void t(int i3, int i4, int i5, int i6) {
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i5 - i3;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i12 = this.f3919f;
        int i13 = i12 & 112;
        int i14 = i12 & 8388615;
        if (i13 != 16) {
            paddingTop = i13 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f3920g;
        } else {
            paddingTop = getPaddingTop() + (((i6 - i4) - this.f3920g) / 2);
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i15 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i15 < 0) {
                        i15 = i14;
                    }
                    int iA = AbstractC0268w.a(i15, getLayoutDirection()) & 7;
                    if (iA != 1) {
                        if (iA != 5) {
                            i9 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i7 = paddingRight - measuredWidth;
                            i8 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i16 = i9;
                        if (r(iN)) {
                            paddingTop += this.f3927n;
                        }
                        int i17 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        y(viewQ, i16, i17 + o(viewQ), measuredWidth, measuredHeight);
                        int iP = i17 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                        iN += n(viewQ, iN);
                        paddingTop = iP;
                        i10 = 1;
                    } else {
                        i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i8 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i9 = i7 - i8;
                    int i18 = i9;
                    if (r(iN)) {
                        paddingTop += this.f3927n;
                    }
                    int i19 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i18, i19 + o(viewQ), measuredWidth, measuredHeight);
                    int iP2 = i19 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                    paddingTop = iP2;
                    i10 = 1;
                }
                iN += i10;
            }
            i10 = 1;
            iN += i10;
        }
    }

    void u(View view, int i3, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x045b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    void v(int i3, int i4) {
        int[] iArr;
        int iCombineMeasuredStates;
        int i5;
        int iMax;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        byte b4;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        View view;
        int i12;
        boolean z5;
        int i13;
        int measuredHeight;
        int iN;
        int baseline2;
        int i14;
        this.f3920g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        if (this.f3923j == null || this.f3924k == null) {
            this.f3923j = new int[4];
            this.f3924k = new int[4];
        }
        int[] iArr2 = this.f3923j;
        int[] iArr3 = this.f3924k;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z6 = this.f3915b;
        boolean z7 = this.f3922i;
        int i15 = 1073741824;
        boolean z8 = mode == 1073741824;
        int iN2 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        boolean z9 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z10 = false;
        boolean z11 = true;
        float f3 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iN2 >= virtualChildCount) {
                break;
            }
            View viewQ = q(iN2);
            if (viewQ == null) {
                this.f3920g += w(iN2);
            } else {
                if (viewQ.getVisibility() == 8) {
                    iN2 += n(viewQ, iN2);
                } else {
                    if (r(iN2)) {
                        this.f3920g += this.f3926m;
                    }
                    a aVar = (a) viewQ.getLayoutParams();
                    float f4 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f5 = f3 + f4;
                    if (mode == i15 && ((LinearLayout.LayoutParams) aVar).width == 0 && f4 > 0.0f) {
                        if (z8) {
                            this.f3920g += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i16 = this.f3920g;
                            this.f3920g = Math.max(i16, ((LinearLayout.LayoutParams) aVar).leftMargin + i16 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z6) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i11 = iN2;
                            z3 = z7;
                            z4 = z6;
                            view = viewQ;
                        } else {
                            i11 = iN2;
                            z3 = z7;
                            z4 = z6;
                            view = viewQ;
                            z9 = true;
                            i12 = 1073741824;
                        }
                        if (mode2 == i12 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z5 = true;
                            z10 = true;
                        } else {
                            z5 = false;
                        }
                        i13 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i13;
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z4 && (baseline2 = view.getBaseline()) != -1) {
                            i14 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i14 < 0) {
                                i14 = this.f3919f;
                            }
                            int i17 = (((i14 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i17] = Math.max(iArr2[i17], baseline2);
                            iArr[i17] = Math.max(iArr[i17], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(iMax3, measuredHeight);
                        if (z11 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (!z5) {
                                i13 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i13);
                        } else {
                            int i18 = iMax5;
                            if (!z5) {
                                i13 = measuredHeight;
                            }
                            iMax4 = Math.max(iMax4, i13);
                            iMax5 = i18;
                        }
                        int i19 = i11;
                        iN = n(view, i19) + i19;
                        f3 = f5;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f4 <= 0.0f) {
                            b4 = -2;
                            i10 = Integer.MIN_VALUE;
                        } else {
                            b4 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i10 = 0;
                        }
                        i11 = iN2;
                        int i20 = i10;
                        z3 = z7;
                        z4 = z6;
                        u(viewQ, i11, i3, f5 == 0.0f ? this.f3920g : 0, i4, 0);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i20;
                        }
                        int measuredWidth = viewQ.getMeasuredWidth();
                        if (z8) {
                            view = viewQ;
                            this.f3920g += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                        } else {
                            view = viewQ;
                            int i21 = this.f3920g;
                            this.f3920g = Math.max(i21, i21 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                        }
                        if (z3) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    i12 = 1073741824;
                    if (mode2 == i12) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    i13 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i13;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z4) {
                        i14 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i14 < 0) {
                            i14 = this.f3919f;
                        }
                        int i110 = (((i14 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax3 = Math.max(iMax3, measuredHeight);
                    if (z11) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z5) {
                            i13 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i13);
                    } else {
                        int i111 = iMax5;
                        if (!z5) {
                            i13 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i13);
                        iMax5 = i111;
                    }
                    int i112 = i11;
                    iN = n(view, i112) + i112;
                    f3 = f5;
                }
                int i22 = iN + 1;
                iArr3 = iArr;
                z7 = z3;
                z6 = z4;
                i15 = i12;
                iN2 = i22;
            }
            z3 = z7;
            z4 = z6;
            int i23 = i15;
            iN = iN2;
            i12 = i23;
            int i24 = iN + 1;
            iArr3 = iArr;
            z7 = z3;
            z6 = z4;
            i15 = i12;
            iN2 = i24;
        }
        boolean z12 = z7;
        boolean z13 = z6;
        int i25 = iMax3;
        int i26 = iMax4;
        int i27 = iMax5;
        int i28 = iCombineMeasuredStates2;
        if (this.f3920g > 0 && r(virtualChildCount)) {
            this.f3920g += this.f3926m;
        }
        int i29 = iArr2[1];
        int iMax6 = (i29 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i25 : Math.max(i25, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i29, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z12 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f3920g = 0;
            int iN3 = 0;
            while (iN3 < virtualChildCount) {
                View viewQ2 = q(iN3);
                if (viewQ2 == null) {
                    this.f3920g += w(iN3);
                } else if (viewQ2.getVisibility() == 8) {
                    iN3 += n(viewQ2, iN3);
                } else {
                    a aVar2 = (a) viewQ2.getLayoutParams();
                    if (z8) {
                        this.f3920g += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                    } else {
                        int i30 = this.f3920g;
                        this.f3920g = Math.max(i30, i30 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                    }
                    iN3++;
                    iMax6 = iMax6;
                }
                iN3++;
                iMax6 = iMax6;
            }
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f3920g + getPaddingLeft() + getPaddingRight();
        this.f3920g = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i3, 0);
        int i31 = (16777215 & iResolveSizeAndState) - this.f3920g;
        if (z9 || (i31 != 0 && f3 > 0.0f)) {
            float f6 = this.f3921h;
            if (f6 > 0.0f) {
                f3 = f6;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f3920g = 0;
            int i32 = i26;
            int iMax8 = -1;
            iCombineMeasuredStates = i28;
            int i33 = 0;
            while (i33 < virtualChildCount) {
                View viewQ3 = q(i33);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    i6 = i31;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f7 > 0.0f) {
                        int i34 = (int) ((i31 * f7) / f3);
                        float f8 = f3 - f7;
                        int i35 = i31 - i34;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i9 = 1073741824;
                            if (mode == 1073741824) {
                                if (i34 <= 0) {
                                    i34 = 0;
                                }
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(i34, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ3.getMeasuredState() & (-16777216));
                            f3 = f8;
                            i6 = i35;
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth2 = viewQ3.getMeasuredWidth() + i34;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i9), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ3.getMeasuredState() & (-16777216));
                        f3 = f8;
                        i6 = i35;
                    } else {
                        i6 = i31;
                    }
                    if (z8) {
                        this.f3920g += viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        int i36 = this.f3920g;
                        this.f3920g = Math.max(i36, viewQ3.getMeasuredWidth() + i36 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z14 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i37 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i37;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z14) {
                        i37 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i32, i37);
                    if (z11) {
                        i7 = -1;
                        boolean z15 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z13 && (baseline = viewQ3.getBaseline()) != i7) {
                            i8 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i8 < 0) {
                                i8 = this.f3919f;
                            }
                            int i38 = (((i8 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i38] = Math.max(iArr2[i38], baseline);
                            iArr[i38] = Math.max(iArr[i38], measuredHeight2 - baseline);
                        }
                        z11 = z15;
                        i32 = iMax9;
                        f3 = f3;
                    } else {
                        i7 = -1;
                    }
                    if (z13) {
                        i8 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i8 < 0) {
                            i8 = this.f3919f;
                        }
                        int i39 = (((i8 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i39] = Math.max(iArr2[i39], baseline);
                        iArr[i39] = Math.max(iArr[i39], measuredHeight2 - baseline);
                    }
                    z11 = z15;
                    i32 = iMax9;
                    f3 = f3;
                }
                i33++;
                i31 = i6;
                virtualChildCount = virtualChildCount;
            }
            i5 = virtualChildCount;
            this.f3920g += getPaddingLeft() + getPaddingRight();
            int i40 = iArr2[1];
            iMax7 = (i40 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i40, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax = i32;
        } else {
            iMax = Math.max(i26, i27);
            if (z12 && mode != 1073741824) {
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View viewQ4 = q(i41);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = virtualChildCount;
            iCombineMeasuredStates = i28;
        }
        if (z11 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
        if (z10) {
            i(i5, i3);
        }
    }

    int w(int i3) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x032f  */
    void x(int i3, int i4) {
        int i5;
        int iCombineMeasuredStates;
        int iMax;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax2;
        int i16;
        View view;
        int iMax3;
        boolean z4;
        this.f3920g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int i17 = this.f3916c;
        boolean z5 = this.f3922i;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax4 = 0;
        int i21 = 0;
        int iN = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = true;
        float f3 = 0.0f;
        while (true) {
            int i22 = 8;
            int i23 = iMax4;
            if (iN >= virtualChildCount) {
                int i24 = i18;
                int i25 = i20;
                int i26 = i21;
                int i27 = mode2;
                int iMax5 = i19;
                int i28 = virtualChildCount;
                if (this.f3920g > 0) {
                    i5 = i28;
                    if (r(i5)) {
                        this.f3920g += this.f3927n;
                    }
                } else {
                    i5 = i28;
                }
                if (z5 && (i27 == Integer.MIN_VALUE || i27 == 0)) {
                    this.f3920g = 0;
                    int iN2 = 0;
                    while (iN2 < i5) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            this.f3920g += w(iN2);
                        } else if (viewQ.getVisibility() == i22) {
                            iN2 += n(viewQ, iN2);
                        } else {
                            a aVar = (a) viewQ.getLayoutParams();
                            int i29 = this.f3920g;
                            this.f3920g = Math.max(i29, i29 + i25 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                        }
                        iN2++;
                        i22 = 8;
                    }
                }
                int paddingTop = this.f3920g + getPaddingTop() + getPaddingBottom();
                this.f3920g = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i4, 0);
                int i30 = (16777215 & iResolveSizeAndState) - this.f3920g;
                if (z6 || (i30 != 0 && f3 > 0.0f)) {
                    float f4 = this.f3921h;
                    if (f4 > 0.0f) {
                        f3 = f4;
                    }
                    this.f3920g = 0;
                    int i31 = i30;
                    int i32 = i26;
                    iCombineMeasuredStates = i24;
                    int i33 = 0;
                    while (i33 < i5) {
                        View viewQ2 = q(i33);
                        if (viewQ2.getVisibility() == 8) {
                            i6 = i31;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f5 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f5 > 0.0f) {
                                int i34 = (int) ((i31 * f5) / f3);
                                float f6 = f3 - f5;
                                i6 = i31 - i34;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i9 = 1073741824;
                                    if (i27 == 1073741824) {
                                        if (i34 <= 0) {
                                            i34 = 0;
                                        }
                                        viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i34, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                    f3 = f6;
                                } else {
                                    i9 = 1073741824;
                                }
                                int measuredHeight = viewQ2.getMeasuredHeight() + i34;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i9));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                f3 = f6;
                            } else {
                                i6 = i31;
                            }
                            int i35 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i35;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f7 = f3;
                            if (mode != 1073741824) {
                                i7 = iCombineMeasuredStates;
                                i8 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width != -1) {
                                }
                                int iMax6 = Math.max(i32, i35);
                                if (z8 || ((LinearLayout.LayoutParams) aVar2).width != i8) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                int i36 = this.f3920g;
                                this.f3920g = Math.max(i36, viewQ2.getMeasuredHeight() + i36 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                                z8 = z3;
                                iCombineMeasuredStates = i7;
                                i32 = iMax6;
                                f3 = f7;
                            } else {
                                i7 = iCombineMeasuredStates;
                                i8 = -1;
                            }
                            i35 = measuredWidth;
                            int iMax7 = Math.max(i32, i35);
                            if (z8) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            int i37 = this.f3920g;
                            this.f3920g = Math.max(i37, viewQ2.getMeasuredHeight() + i37 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            z8 = z3;
                            iCombineMeasuredStates = i7;
                            i32 = iMax7;
                            f3 = f7;
                        }
                        i33++;
                        i31 = i6;
                    }
                    this.f3920g += getPaddingTop() + getPaddingBottom();
                    iMax = i32;
                } else {
                    iMax = Math.max(i26, i23);
                    if (z5 && i27 != 1073741824) {
                        for (int i38 = 0; i38 < i5; i38++) {
                            View viewQ3 = q(i38);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i24;
                }
                if (z8 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, iCombineMeasuredStates), iResolveSizeAndState);
                if (z7) {
                    j(i5, i4);
                    return;
                }
                return;
            }
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f3920g += w(iN);
                i13 = mode2;
                iMax4 = i23;
                i15 = virtualChildCount;
            } else {
                int i39 = i18;
                if (viewQ4.getVisibility() == 8) {
                    iN += n(viewQ4, iN);
                    iMax4 = i23;
                    i18 = i39;
                    i15 = virtualChildCount;
                    i13 = mode2;
                } else {
                    if (r(iN)) {
                        this.f3920g += this.f3927n;
                    }
                    a aVar3 = (a) viewQ4.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f9 = f3 + f8;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f8 > 0.0f) {
                        int i40 = this.f3920g;
                        this.f3920g = Math.max(i40, ((LinearLayout.LayoutParams) aVar3).topMargin + i40 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax3 = i20;
                        view = viewQ4;
                        iMax2 = i21;
                        z6 = true;
                        i11 = i39;
                        i12 = i19;
                        i13 = mode2;
                        i14 = i23;
                        i15 = virtualChildCount;
                        i16 = iN;
                    } else {
                        int i41 = i19;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f8 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i10 = 0;
                        }
                        i11 = i39;
                        int i42 = i10;
                        i12 = i41;
                        int i43 = i20;
                        i13 = mode2;
                        i14 = i23;
                        i15 = virtualChildCount;
                        iMax2 = i21;
                        i16 = iN;
                        u(viewQ4, iN, i3, 0, i4, f9 == 0.0f ? this.f3920g : 0);
                        if (i42 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i42;
                        }
                        int measuredHeight2 = viewQ4.getMeasuredHeight();
                        int i44 = this.f3920g;
                        view = viewQ4;
                        this.f3920g = Math.max(i44, i44 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                        iMax3 = z5 ? Math.max(measuredHeight2, i43) : i43;
                    }
                    if (i17 >= 0 && i17 == i16 + 1) {
                        this.f3917d = this.f3920g;
                    }
                    if (i16 < i17 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z4 = false;
                    } else {
                        z4 = true;
                        z7 = true;
                    }
                    int i45 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i45;
                    int iMax8 = Math.max(i12, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i11, view.getMeasuredState());
                    z8 = z8 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z4) {
                            i45 = measuredWidth2;
                        }
                        iMax4 = Math.max(i14, i45);
                    } else {
                        if (!z4) {
                            i45 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i45);
                        iMax4 = i14;
                    }
                    int iN3 = n(view, i16) + i16;
                    i20 = iMax3;
                    i19 = iMax8;
                    f3 = f9;
                    i21 = iMax2;
                    iN = iN3;
                    i18 = iCombineMeasuredStates2;
                }
            }
            iN++;
            virtualChildCount = i15;
            mode2 = i13;
        }
    }

    public T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public T(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3915b = true;
        this.f3916c = -1;
        this.f3917d = 0;
        this.f3919f = 8388659;
        h0 h0VarU = h0.u(context, attributeSet, p012d.j.f8955a1, i3, 0);
        androidx.core.view.Z.V(this, context, p012d.j.f8955a1, attributeSet, h0VarU.q(), i3, 0);
        int iJ = h0VarU.j(p012d.j.f8965c1, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = h0VarU.j(p012d.j.f8960b1, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = h0VarU.a(p012d.j.f8970d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f3921h = h0VarU.h(p012d.j.f8980f1, -1.0f);
        this.f3916c = h0VarU.j(p012d.j.f8975e1, -1);
        this.f3922i = h0VarU.a(p012d.j.f8992i1, false);
        setDividerDrawable(h0VarU.f(p012d.j.f8984g1));
        this.f3928o = h0VarU.j(p012d.j.f8996j1, 0);
        this.f3929p = h0VarU.e(p012d.j.f8988h1, 0);
        h0VarU.w();
    }
}
