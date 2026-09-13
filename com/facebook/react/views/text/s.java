package com.facebook.react.views.text;

import com.facebook.react.uimanager.C0392f0;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8043a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8044b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8045c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8046d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8047e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8048f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u f8049g = u.UNSET;

    public s a(s sVar) {
        s sVar2 = new s();
        sVar2.f8043a = this.f8043a;
        sVar2.f8044b = !Float.isNaN(sVar.f8044b) ? sVar.f8044b : this.f8044b;
        sVar2.f8045c = !Float.isNaN(sVar.f8045c) ? sVar.f8045c : this.f8045c;
        sVar2.f8046d = !Float.isNaN(sVar.f8046d) ? sVar.f8046d : this.f8046d;
        sVar2.f8047e = !Float.isNaN(sVar.f8047e) ? sVar.f8047e : this.f8047e;
        sVar2.f8048f = !Float.isNaN(sVar.f8048f) ? sVar.f8048f : this.f8048f;
        u uVar = sVar.f8049g;
        if (uVar == u.UNSET) {
            uVar = this.f8049g;
        }
        sVar2.f8049g = uVar;
        return sVar2;
    }

    public boolean b() {
        return this.f8043a;
    }

    public int c() {
        float f3 = !Float.isNaN(this.f8044b) ? this.f8044b : 14.0f;
        return (int) (this.f8043a ? Math.ceil(C0392f0.k(f3, f())) : Math.ceil(C0392f0.h(f3)));
    }

    public float d() {
        if (Float.isNaN(this.f8046d)) {
            return Float.NaN;
        }
        return (this.f8043a ? C0392f0.k(this.f8046d, f()) : C0392f0.h(this.f8046d)) / c();
    }

    public float e() {
        if (Float.isNaN(this.f8045c)) {
            return Float.NaN;
        }
        float fK = this.f8043a ? C0392f0.k(this.f8045c, f()) : C0392f0.h(this.f8045c);
        if (Float.isNaN(this.f8048f)) {
            return fK;
        }
        float f3 = this.f8048f;
        return f3 > fK ? f3 : fK;
    }

    public float f() {
        if (Float.isNaN(this.f8047e)) {
            return 0.0f;
        }
        return this.f8047e;
    }

    public float g() {
        return this.f8044b;
    }

    public float h() {
        return this.f8048f;
    }

    public float i() {
        return this.f8046d;
    }

    public float j() {
        return this.f8045c;
    }

    public float k() {
        return this.f8047e;
    }

    public u l() {
        return this.f8049g;
    }

    public void m(boolean z3) {
        this.f8043a = z3;
    }

    public void n(float f3) {
        this.f8044b = f3;
    }

    public void o(float f3) {
        this.f8048f = f3;
    }

    public void p(float f3) {
        this.f8046d = f3;
    }

    public void q(float f3) {
        this.f8045c = f3;
    }

    public void r(float f3) {
        if (f3 == 0.0f || f3 >= 1.0f) {
            this.f8047e = f3;
        } else {
            Y.a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f8047e = Float.NaN;
        }
    }

    public void s(u uVar) {
        this.f8049g = uVar;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
