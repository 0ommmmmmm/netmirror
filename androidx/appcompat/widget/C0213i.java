package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0213i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f4231b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f4232c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4233d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4234e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4235f;

    C0213i(CheckedTextView checkedTextView) {
        this.f4230a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f4230a);
        if (drawableA != null) {
            if (this.f4233d || this.f4234e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawableA).mutate();
                if (this.f4233d) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f4231b);
                }
                if (this.f4234e) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f4232c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f4230a.getDrawableState());
                }
                this.f4230a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f4231b;
    }

    PorterDuff.Mode c() {
        return this.f4232c;
    }

    void d(AttributeSet attributeSet, int i3) {
        int iM;
        int iM2;
        h0 h0VarU = h0.u(this.f4230a.getContext(), attributeSet, p012d.j.f8910P0, i3, 0);
        CheckedTextView checkedTextView = this.f4230a;
        androidx.core.view.Z.V(checkedTextView, checkedTextView.getContext(), p012d.j.f8910P0, attributeSet, h0VarU.q(), i3, 0);
        try {
            if (h0VarU.r(p012d.j.f8918R0) && (iM2 = h0VarU.m(p012d.j.f8918R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f4230a;
                    checkedTextView2.setCheckMarkDrawable(p016e.a.b(checkedTextView2.getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarU.r(p012d.j.f8914Q0)) {
                        CheckedTextView checkedTextView3 = this.f4230a;
                        checkedTextView3.setCheckMarkDrawable(p016e.a.b(checkedTextView3.getContext(), iM));
                    }
                }
            } else if (h0VarU.r(p012d.j.f8914Q0) && (iM = h0VarU.m(p012d.j.f8914Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f4230a;
                checkedTextView4.setCheckMarkDrawable(p016e.a.b(checkedTextView4.getContext(), iM));
            }
            if (h0VarU.r(p012d.j.f8922S0)) {
                androidx.core.widget.b.b(this.f4230a, h0VarU.c(p012d.j.f8922S0));
            }
            if (h0VarU.r(p012d.j.f8926T0)) {
                androidx.core.widget.b.c(this.f4230a, O.d(h0VarU.j(p012d.j.f8926T0, -1), null));
            }
        } finally {
            h0VarU.w();
        }
    }

    void e() {
        if (this.f4235f) {
            this.f4235f = false;
        } else {
            this.f4235f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f4231b = colorStateList;
        this.f4233d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f4232c = mode;
        this.f4234e = true;
        a();
    }
}
