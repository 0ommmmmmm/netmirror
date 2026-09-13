package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f3745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f3746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f3747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f3748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f3749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f3750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f3751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f3752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f3753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3754j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3755k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f3756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3757m;

    class a extends androidx.core.content.res.f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f3760c;

        a(int i3, int i4, WeakReference weakReference) {
            this.f3758a = i3;
            this.f3759b = i4;
            this.f3760c = weakReference;
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: h */
        public void f(int i3) {
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i3;
            if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f3758a) != -1) {
                typeface = e.a(typeface, i3, (this.f3759b & 2) != 0);
            }
            C.this.n(this.f3760c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f3762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f3763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3764d;

        b(TextView textView, Typeface typeface, int i3) {
            this.f3762b = textView;
            this.f3763c = typeface;
            this.f3764d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3762b.setTypeface(this.f3763c, this.f3764d);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i3, int i4, int i5, int i6) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
        }

        static void c(TextView textView, int[] iArr, int i3) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i3, boolean z3) {
            return Typeface.create(typeface, i3, z3);
        }
    }

    C(TextView textView) {
        this.f3745a = textView;
        this.f3753i = new E(textView);
    }

    private void B(int i3, float f3) {
        this.f3753i.t(i3, f3);
    }

    private void C(Context context, h0 h0Var) {
        String strN;
        this.f3754j = h0Var.j(p012d.j.f8936V2, this.f3754j);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int iJ = h0Var.j(p012d.j.f8948Y2, -1);
            this.f3755k = iJ;
            if (iJ != -1) {
                this.f3754j &= 2;
            }
        }
        if (!h0Var.r(p012d.j.f8944X2) && !h0Var.r(p012d.j.f8952Z2)) {
            if (h0Var.r(p012d.j.f8932U2)) {
                this.f3757m = false;
                int iJ2 = h0Var.j(p012d.j.f8932U2, 1);
                if (iJ2 == 1) {
                    this.f3756l = Typeface.SANS_SERIF;
                    return;
                } else if (iJ2 == 2) {
                    this.f3756l = Typeface.SERIF;
                    return;
                } else {
                    if (iJ2 != 3) {
                        return;
                    }
                    this.f3756l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3756l = null;
        int i4 = h0Var.r(p012d.j.f8952Z2) ? p012d.j.f8952Z2 : p012d.j.f8944X2;
        int i5 = this.f3755k;
        int i6 = this.f3754j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = h0Var.i(i4, this.f3754j, new a(i5, i6, new WeakReference(this.f3745a)));
                if (typefaceI != null) {
                    if (i3 < 28 || this.f3755k == -1) {
                        this.f3756l = typefaceI;
                    } else {
                        this.f3756l = e.a(Typeface.create(typefaceI, 0), this.f3755k, (this.f3754j & 2) != 0);
                    }
                }
                this.f3757m = this.f3756l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3756l != null || (strN = h0Var.n(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3755k == -1) {
            this.f3756l = Typeface.create(strN, this.f3754j);
        } else {
            this.f3756l = e.a(Typeface.create(strN, 0), this.f3755k, (this.f3754j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C0215k.i(drawable, f0Var, this.f3745a.getDrawableState());
    }

    private static f0 d(Context context, C0215k c0215k, int i3) {
        ColorStateList colorStateListF = c0215k.f(context, i3);
        if (colorStateListF == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f4217d = true;
        f0Var.f4214a = colorStateListF;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f3745a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f3745a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f3745a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f3745a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f3745a.getCompoundDrawables();
        TextView textView2 = this.f3745a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f3752h;
        this.f3746b = f0Var;
        this.f3747c = f0Var;
        this.f3748d = f0Var;
        this.f3749e = f0Var;
        this.f3750f = f0Var;
        this.f3751g = f0Var;
    }

    void A(int i3, float f3) {
        if (s0.f4327c || l()) {
            return;
        }
        B(i3, f3);
    }

    void b() {
        if (this.f3746b != null || this.f3747c != null || this.f3748d != null || this.f3749e != null) {
            Drawable[] compoundDrawables = this.f3745a.getCompoundDrawables();
            a(compoundDrawables[0], this.f3746b);
            a(compoundDrawables[1], this.f3747c);
            a(compoundDrawables[2], this.f3748d);
            a(compoundDrawables[3], this.f3749e);
        }
        if (this.f3750f == null && this.f3751g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f3745a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3750f);
        a(compoundDrawablesRelative[2], this.f3751g);
    }

    void c() {
        this.f3753i.a();
    }

    int e() {
        return this.f3753i.f();
    }

    int f() {
        return this.f3753i.g();
    }

    int g() {
        return this.f3753i.h();
    }

    int[] h() {
        return this.f3753i.i();
    }

    int i() {
        return this.f3753i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f3752h;
        if (f0Var != null) {
            return f0Var.f4214a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f3752h;
        if (f0Var != null) {
            return f0Var.f4215b;
        }
        return null;
    }

    boolean l() {
        return this.f3753i.n();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x029b  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    void m(AttributeSet attributeSet, int i3) {
        boolean zA;
        boolean z3;
        String strN;
        String strN2;
        boolean z4;
        float fE;
        int iA;
        Context context = this.f3745a.getContext();
        C0215k c0215kB = C0215k.b();
        h0 h0VarU = h0.u(context, attributeSet, p012d.j.f8945Y, i3, 0);
        TextView textView = this.f3745a;
        androidx.core.view.Z.V(textView, textView.getContext(), p012d.j.f8945Y, attributeSet, h0VarU.q(), i3, 0);
        int iM = h0VarU.m(p012d.j.f8949Z, -1);
        if (h0VarU.r(p012d.j.f8964c0)) {
            this.f3746b = d(context, c0215kB, h0VarU.m(p012d.j.f8964c0, 0));
        }
        if (h0VarU.r(p012d.j.f8954a0)) {
            this.f3747c = d(context, c0215kB, h0VarU.m(p012d.j.f8954a0, 0));
        }
        if (h0VarU.r(p012d.j.f8969d0)) {
            this.f3748d = d(context, c0215kB, h0VarU.m(p012d.j.f8969d0, 0));
        }
        if (h0VarU.r(p012d.j.f8959b0)) {
            this.f3749e = d(context, c0215kB, h0VarU.m(p012d.j.f8959b0, 0));
        }
        if (h0VarU.r(p012d.j.f8974e0)) {
            this.f3750f = d(context, c0215kB, h0VarU.m(p012d.j.f8974e0, 0));
        }
        if (h0VarU.r(p012d.j.f8979f0)) {
            this.f3751g = d(context, c0215kB, h0VarU.m(p012d.j.f8979f0, 0));
        }
        h0VarU.w();
        boolean z5 = this.f3745a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM != -1) {
            h0 h0VarS = h0.s(context, iM, p012d.j.f8924S2);
            if (z5 || !h0VarS.r(p012d.j.f8962b3)) {
                zA = false;
                z3 = false;
            } else {
                zA = h0VarS.a(p012d.j.f8962b3, false);
                z3 = true;
            }
            C(context, h0VarS);
            int i4 = Build.VERSION.SDK_INT;
            strN2 = h0VarS.r(p012d.j.f8967c3) ? h0VarS.n(p012d.j.f8967c3) : null;
            strN = (i4 < 26 || !h0VarS.r(p012d.j.f8957a3)) ? null : h0VarS.n(p012d.j.f8957a3);
            h0VarS.w();
        } else {
            zA = false;
            z3 = false;
            strN = null;
            strN2 = null;
        }
        h0 h0VarU2 = h0.u(context, attributeSet, p012d.j.f8924S2, i3, 0);
        if (z5 || !h0VarU2.r(p012d.j.f8962b3)) {
            z4 = z3;
        } else {
            zA = h0VarU2.a(p012d.j.f8962b3, false);
            z4 = true;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (h0VarU2.r(p012d.j.f8967c3)) {
            strN2 = h0VarU2.n(p012d.j.f8967c3);
        }
        if (i5 >= 26 && h0VarU2.r(p012d.j.f8957a3)) {
            strN = h0VarU2.n(p012d.j.f8957a3);
        }
        if (i5 >= 28 && h0VarU2.r(p012d.j.f8928T2) && h0VarU2.e(p012d.j.f8928T2, -1) == 0) {
            this.f3745a.setTextSize(0, 0.0f);
        }
        C(context, h0VarU2);
        h0VarU2.w();
        if (!z5 && z4) {
            s(zA);
        }
        Typeface typeface = this.f3756l;
        if (typeface != null) {
            if (this.f3755k == -1) {
                this.f3745a.setTypeface(typeface, this.f3754j);
            } else {
                this.f3745a.setTypeface(typeface);
            }
        }
        if (strN != null) {
            d.d(this.f3745a, strN);
        }
        if (strN2 != null) {
            c.b(this.f3745a, c.a(strN2));
        }
        this.f3753i.o(attributeSet, i3);
        if (s0.f4327c && this.f3753i.j() != 0) {
            int[] iArrI = this.f3753i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f3745a) != -1.0f) {
                    d.b(this.f3745a, this.f3753i.g(), this.f3753i.f(), this.f3753i.h(), 0);
                } else {
                    d.c(this.f3745a, iArrI, 0);
                }
            }
        }
        h0 h0VarT = h0.t(context, attributeSet, p012d.j.f8983g0);
        int iM2 = h0VarT.m(p012d.j.f9015o0, -1);
        Drawable drawableC = iM2 != -1 ? c0215kB.c(context, iM2) : null;
        int iM3 = h0VarT.m(p012d.j.f9035t0, -1);
        Drawable drawableC2 = iM3 != -1 ? c0215kB.c(context, iM3) : null;
        int iM4 = h0VarT.m(p012d.j.f9019p0, -1);
        Drawable drawableC3 = iM4 != -1 ? c0215kB.c(context, iM4) : null;
        int iM5 = h0VarT.m(p012d.j.f9007m0, -1);
        Drawable drawableC4 = iM5 != -1 ? c0215kB.c(context, iM5) : null;
        int iM6 = h0VarT.m(p012d.j.f9023q0, -1);
        Drawable drawableC5 = iM6 != -1 ? c0215kB.c(context, iM6) : null;
        int iM7 = h0VarT.m(p012d.j.f9011n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iM7 != -1 ? c0215kB.c(context, iM7) : null);
        if (h0VarT.r(p012d.j.f9027r0)) {
            androidx.core.widget.i.f(this.f3745a, h0VarT.c(p012d.j.f9027r0));
        }
        if (h0VarT.r(p012d.j.f9031s0)) {
            androidx.core.widget.i.g(this.f3745a, O.d(h0VarT.j(p012d.j.f9031s0, -1), null));
        }
        int iE = h0VarT.e(p012d.j.f9043v0, -1);
        int iE2 = h0VarT.e(p012d.j.f9047w0, -1);
        if (h0VarT.r(p012d.j.f9051x0)) {
            TypedValue typedValueV = h0VarT.v(p012d.j.f9051x0);
            if (typedValueV == null || typedValueV.type != 5) {
                fE = h0VarT.e(p012d.j.f9051x0, -1);
            } else {
                iA = p064q.j.a(typedValueV.data);
                fE = TypedValue.complexToFloat(typedValueV.data);
            }
            h0VarT.w();
            if (iE != -1) {
                androidx.core.widget.i.h(this.f3745a, iE);
            }
            if (iE2 != -1) {
                androidx.core.widget.i.i(this.f3745a, iE2);
            }
            if (fE != -1.0f) {
                if (iA == -1) {
                    androidx.core.widget.i.j(this.f3745a, (int) fE);
                } else {
                    androidx.core.widget.i.k(this.f3745a, iA, fE);
                }
            }
        }
        fE = -1.0f;
        iA = -1;
        h0VarT.w();
        if (iE != -1) {
            androidx.core.widget.i.h(this.f3745a, iE);
        }
        if (iE2 != -1) {
            androidx.core.widget.i.i(this.f3745a, iE2);
        }
        if (fE != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.j(this.f3745a, (int) fE);
            } else {
                androidx.core.widget.i.k(this.f3745a, iA, fE);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f3757m) {
            this.f3756l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f3754j));
                } else {
                    textView.setTypeface(typeface, this.f3754j);
                }
            }
        }
    }

    void o(boolean z3, int i3, int i4, int i5, int i6) {
        if (s0.f4327c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i3) {
        String strN;
        h0 h0VarS = h0.s(context, i3, p012d.j.f8924S2);
        if (h0VarS.r(p012d.j.f8962b3)) {
            s(h0VarS.a(p012d.j.f8962b3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (h0VarS.r(p012d.j.f8928T2) && h0VarS.e(p012d.j.f8928T2, -1) == 0) {
            this.f3745a.setTextSize(0, 0.0f);
        }
        C(context, h0VarS);
        if (i4 >= 26 && h0VarS.r(p012d.j.f8957a3) && (strN = h0VarS.n(p012d.j.f8957a3)) != null) {
            d.d(this.f3745a, strN);
        }
        h0VarS.w();
        Typeface typeface = this.f3756l;
        if (typeface != null) {
            this.f3745a.setTypeface(typeface, this.f3754j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        p080u.c.f(editorInfo, textView.getText());
    }

    void s(boolean z3) {
        this.f3745a.setAllCaps(z3);
    }

    void t(int i3, int i4, int i5, int i6) {
        this.f3753i.p(i3, i4, i5, i6);
    }

    void u(int[] iArr, int i3) {
        this.f3753i.q(iArr, i3);
    }

    void v(int i3) {
        this.f3753i.r(i3);
    }

    void w(ColorStateList colorStateList) {
        if (this.f3752h == null) {
            this.f3752h = new f0();
        }
        f0 f0Var = this.f3752h;
        f0Var.f4214a = colorStateList;
        f0Var.f4217d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f3752h == null) {
            this.f3752h = new f0();
        }
        f0 f0Var = this.f3752h;
        f0Var.f4215b = mode;
        f0Var.f4216c = mode != null;
        z();
    }
}
