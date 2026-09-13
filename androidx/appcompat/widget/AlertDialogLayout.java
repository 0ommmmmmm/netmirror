package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC0268w;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends T {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private boolean A(int i3, int i4) {
        int iCombineMeasuredStates;
        int iZ;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == p012d.f.f8784P) {
                    view = childAt;
                } else if (id == p012d.f.f8795k) {
                    view2 = childAt;
                } else {
                    if ((id != p012d.f.f8797m && id != p012d.f.f8799o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i3, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            iZ = z(view2);
            measuredHeight = view2.getMeasuredHeight() - iZ;
            paddingTop += iZ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iZ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i6 = size - paddingTop;
        if (view2 != null) {
            int i7 = paddingTop - iZ;
            int iMin = Math.min(i6, measuredHeight);
            if (iMin > 0) {
                i6 -= iMin;
                iZ += iMin;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(iZ, 1073741824));
            paddingTop = i7 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i6 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i6, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i3, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i4, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        j(childCount, i4);
        return true;
    }

    private void j(int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i5 = 0; i5 < i3; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                T.a aVar = (T.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i6 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i4, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i6;
                }
            }
        }
    }

    private void y(View view, int i3, int i4, int i5, int i6) {
        view.layout(i3, i4, i5 + i3, i6 + i4);
    }

    private static int z(View view) {
        int iT = androidx.core.view.Z.t(view);
        if (iT > 0) {
            return iT;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return z(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i5 - i3;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - measuredHeight : getPaddingTop() + (((i6 - i4) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                T.a aVar = (T.a) childAt.getLayoutParams();
                int i14 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i14 < 0) {
                    i14 = i12;
                }
                int iA = AbstractC0268w.a(i14, getLayoutDirection()) & 7;
                if (iA != 1) {
                    if (iA != 5) {
                        i9 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i7 = paddingRight - measuredWidth;
                        i8 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    if (r(i13)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(childAt, i9, i15, measuredWidth, measuredHeight2);
                    paddingTop = i15 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i8 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i9 = i7 - i8;
                if (r(i13)) {
                    paddingTop += intrinsicHeight;
                }
                int i16 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                y(childAt, i9, i16, measuredWidth, measuredHeight2);
                paddingTop = i16 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i3, int i4) {
        if (A(i3, i4)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
