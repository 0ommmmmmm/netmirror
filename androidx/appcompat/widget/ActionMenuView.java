package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends T implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f3720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    e f3721B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f3722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Context f3723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C0207c f3726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f3727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f3728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f3729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f3730y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f3731z;

    public interface a {
        boolean b();

        boolean d();
    }

    private static class b implements androidx.appcompat.view.menu.j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends T.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3737f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f3732a = cVar.f3732a;
        }

        public c(int i3, int i4) {
            super(i3, i4);
            this.f3732a = false;
        }
    }

    private class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f3721B;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f3728w;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int J(View view, int i3, int i4, int i5, int i6) {
        int i7;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5) - i6, View.MeasureSpec.getMode(i5));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z3 = false;
        boolean z4 = actionMenuItemView != null && actionMenuItemView.t();
        if (i4 > 0) {
            i7 = 2;
            if (!z4 || i4 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i3, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i8 = measuredWidth / i3;
                if (measuredWidth % i3 != 0) {
                    i8++;
                }
                if (!z4 || i8 >= 2) {
                    i7 = i8;
                }
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
        }
        if (!cVar.f3732a && z4) {
            z3 = true;
        }
        cVar.f3735d = z3;
        cVar.f3733b = i7;
        view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i7, 1073741824), iMakeMeasureSpec);
        return i7;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void K(int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f3731z;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int iMax = 0;
        int i12 = 0;
        boolean z5 = false;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        long j3 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            int i15 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i16 = i13 + 1;
                if (z6) {
                    int i17 = this.f3720A;
                    r14 = 0;
                    childAt.setPadding(i17, 0, i17, 0);
                } else {
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f3737f = r14;
                cVar.f3734c = r14;
                cVar.f3733b = r14;
                cVar.f3735d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f3736e = z6 && ((ActionMenuItemView) childAt).t();
                int iJ = J(childAt, i11, cVar.f3732a ? 1 : i9, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iJ);
                if (cVar.f3735d) {
                    i14++;
                }
                if (cVar.f3732a) {
                    z5 = true;
                }
                i9 -= iJ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iJ == 1) {
                    j3 |= (long) (1 << i12);
                    iMax = iMax;
                }
                i13 = i16;
            }
            i12++;
            size2 = i15;
        }
        int i18 = size2;
        boolean z7 = z5 && i13 == 2;
        boolean z8 = false;
        while (true) {
            if (i14 <= 0 || i9 <= 0) {
                z3 = z8;
                i5 = iMax;
                break;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = 0;
            long j4 = 0;
            while (i21 < childCount) {
                boolean z9 = z8;
                c cVar2 = (c) getChildAt(i21).getLayoutParams();
                int i22 = iMax;
                if (cVar2.f3735d) {
                    int i23 = cVar2.f3733b;
                    if (i23 < i19) {
                        j4 = 1 << i21;
                        i19 = i23;
                        i20 = 1;
                    } else if (i23 == i19) {
                        i20++;
                        j4 |= 1 << i21;
                    }
                }
                i21++;
                iMax = i22;
                z8 = z9;
            }
            z3 = z8;
            i5 = iMax;
            j3 |= j4;
            if (i20 > i9) {
                break;
            }
            int i24 = i19 + 1;
            int i25 = 0;
            while (i25 < childCount) {
                View childAt2 = getChildAt(i25);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i26 = i7;
                int i27 = mode;
                long j5 = 1 << i25;
                if ((j4 & j5) == 0) {
                    if (cVar3.f3733b == i24) {
                        j3 |= j5;
                    }
                    z7 = z7;
                } else {
                    if (z7 && cVar3.f3736e && i9 == 1) {
                        int i28 = this.f3720A;
                        childAt2.setPadding(i28 + i11, 0, i28, 0);
                    }
                    cVar3.f3733b++;
                    cVar3.f3737f = true;
                    i9--;
                }
                i25++;
                mode = i27;
                i7 = i26;
                z7 = z7;
            }
            iMax = i5;
            z8 = true;
        }
        boolean z10 = !z5 && i13 == 1;
        if (i9 <= 0 || j3 == 0 || (i9 >= i13 - 1 && !z10 && iMax2 <= 1)) {
            i6 = 0;
            z4 = z3;
        } else {
            float fBitCount = Long.bitCount(j3);
            if (z10) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j3 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f3736e) {
                    fBitCount -= 0.5f;
                }
                int i29 = childCount - 1;
                if ((j3 & ((long) (1 << i29))) != 0 && !((c) getChildAt(i29).getLayoutParams()).f3736e) {
                    fBitCount -= 0.5f;
                }
            }
            int i30 = fBitCount > 0.0f ? (int) ((i9 * i11) / fBitCount) : i6;
            z4 = z3;
            for (int i31 = i6; i31 < childCount; i31++) {
                if ((j3 & ((long) (1 << i31))) != 0) {
                    View childAt3 = getChildAt(i31);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f3734c = i30;
                        cVar4.f3737f = true;
                        if (i31 == 0 && !cVar4.f3736e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i30) / 2;
                        }
                        z4 = true;
                    } else if (cVar4.f3732a) {
                        cVar4.f3734c = i30;
                        cVar4.f3737f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i30) / 2;
                        z4 = true;
                    } else {
                        if (i31 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i30 / 2;
                        }
                        if (i31 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i30 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            for (int i32 = i6; i32 < childCount; i32++) {
                View childAt4 = getChildAt(i32);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f3737f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f3733b * i11) + cVar5.f3734c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i7, mode != 1073741824 ? i5 : i18);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f3732a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean E(int i3) {
        boolean zB = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof a)) {
            zB = ((a) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof a)) ? zB : zB | ((a) childAt2).d();
    }

    public boolean F() {
        C0207c c0207c = this.f3726u;
        return c0207c != null && c0207c.B();
    }

    public boolean G() {
        C0207c c0207c = this.f3726u;
        return c0207c != null && c0207c.D();
    }

    public boolean H() {
        C0207c c0207c = this.f3726u;
        return c0207c != null && c0207c.E();
    }

    public boolean I() {
        return this.f3725t;
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f3722q;
    }

    public void M(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f3727v = aVar;
        this.f3728w = aVar2;
    }

    public boolean N() {
        C0207c c0207c = this.f3726u;
        return c0207c != null && c0207c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f3722q.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f3722q = eVar;
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f3722q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f3722q = eVar;
            eVar.S(new d());
            C0207c c0207c = new C0207c(context);
            this.f3726u = c0207c;
            c0207c.J(true);
            C0207c c0207c2 = this.f3726u;
            androidx.appcompat.view.menu.j.a bVar = this.f3727v;
            if (bVar == null) {
                bVar = new b();
            }
            c0207c2.k(bVar);
            this.f3722q.c(this.f3726u, this.f3723r);
            this.f3726u.H(this);
        }
        return this.f3722q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3726u.A();
    }

    public int getPopupTheme() {
        return this.f3724s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0207c c0207c = this.f3726u;
        if (c0207c != null) {
            c0207c.f(false);
            if (this.f3726u.E()) {
                this.f3726u.B();
                this.f3726u.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int paddingLeft;
        if (!this.f3729x) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i5 - i3;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zB = s0.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f3732a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f3732a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f3732a) {
                int i20 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i3, int i4) {
        androidx.appcompat.view.menu.e eVar;
        boolean z3 = this.f3729x;
        boolean z4 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f3729x = z4;
        if (z3 != z4) {
            this.f3730y = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f3729x && (eVar = this.f3722q) != null && size != this.f3730y) {
            this.f3730y = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f3729x && childCount > 0) {
            K(i3, i4);
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            c cVar = (c) getChildAt(i5).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i3, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f3726u.G(z3);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f3721B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f3726u.I(drawable);
    }

    public void setOverflowReserved(boolean z3) {
        this.f3725t = z3;
    }

    public void setPopupTheme(int i3) {
        if (this.f3724s != i3) {
            this.f3724s = i3;
            if (i3 == 0) {
                this.f3723r = getContext();
            } else {
                this.f3723r = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0207c c0207c) {
        this.f3726u = c0207c;
        c0207c.H(this);
    }

    public void z() {
        C0207c c0207c = this.f3726u;
        if (c0207c != null) {
            c0207c.y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f3731z = (int) (56.0f * f3);
        this.f3720A = (int) (f3 * 4.0f);
        this.f3723r = context;
        this.f3724s = 0;
    }
}
