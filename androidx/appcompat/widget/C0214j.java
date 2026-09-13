package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0214j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f4237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f4238b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f4239c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4240d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4241e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4242f;

    C0214j(CompoundButton compoundButton) {
        this.f4237a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f4237a);
        if (drawableA != null) {
            if (this.f4240d || this.f4241e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawableA).mutate();
                if (this.f4240d) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f4238b);
                }
                if (this.f4241e) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f4239c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f4237a.getDrawableState());
                }
                this.f4237a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f4238b;
    }

    PorterDuff.Mode c() {
        return this.f4239c;
    }

    void d(AttributeSet attributeSet, int i3) {
        int iM;
        int iM2;
        h0 h0VarU = h0.u(this.f4237a.getContext(), attributeSet, p012d.j.f8930U0, i3, 0);
        CompoundButton compoundButton = this.f4237a;
        androidx.core.view.Z.V(compoundButton, compoundButton.getContext(), p012d.j.f8930U0, attributeSet, h0VarU.q(), i3, 0);
        try {
            if (h0VarU.r(p012d.j.f8938W0) && (iM2 = h0VarU.m(p012d.j.f8938W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f4237a;
                    compoundButton2.setButtonDrawable(p016e.a.b(compoundButton2.getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarU.r(p012d.j.f8934V0)) {
                        CompoundButton compoundButton3 = this.f4237a;
                        compoundButton3.setButtonDrawable(p016e.a.b(compoundButton3.getContext(), iM));
                    }
                }
            } else if (h0VarU.r(p012d.j.f8934V0) && (iM = h0VarU.m(p012d.j.f8934V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f4237a;
                compoundButton4.setButtonDrawable(p016e.a.b(compoundButton4.getContext(), iM));
            }
            if (h0VarU.r(p012d.j.f8942X0)) {
                androidx.core.widget.c.b(this.f4237a, h0VarU.c(p012d.j.f8942X0));
            }
            if (h0VarU.r(p012d.j.f8946Y0)) {
                androidx.core.widget.c.c(this.f4237a, O.d(h0VarU.j(p012d.j.f8946Y0, -1), null));
            }
        } finally {
            h0VarU.w();
        }
    }

    void e() {
        if (this.f4242f) {
            this.f4242f = false;
        } else {
            this.f4242f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f4238b = colorStateList;
        this.f4240d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f4239c = mode;
        this.f4241e = true;
        a();
    }
}
