package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.Z;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.M0;
import p014d1.AbstractC0466q;

/* JADX INFO: loaded from: classes.dex */
public class H extends com.facebook.react.views.text.c implements com.facebook.yoga.o {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f8069b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private EditText f8070c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private r f8071d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private String f8072e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private String f8073f0;

    public H(com.facebook.react.views.text.o oVar) {
        super(oVar);
        this.f8069b0 = -1;
        this.f8072e0 = null;
        this.f8073f0 = null;
        this.f7929J = 1;
        B1();
    }

    private void B1() {
        Y0(this);
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public void A0(M0 m3) {
        super.A0(m3);
        if (this.f8069b0 != -1) {
            m3.O(H(), new com.facebook.react.views.text.i(x1(this, A1(), false, null), this.f8069b0, this.f7945Z, l0(0), l0(1), l0(2), l0(3), this.f7928I, this.f7929J, this.f7931L));
        }
    }

    public String A1() {
        return this.f8072e0;
    }

    @Override // com.facebook.yoga.o
    public long K(com.facebook.yoga.r rVar, float f3, com.facebook.yoga.p pVar, float f4, com.facebook.yoga.p pVar2) {
        EditText editText = (EditText) p002a1.a.c(this.f8070c0);
        r rVar2 = this.f8071d0;
        if (rVar2 != null) {
            rVar2.a(editText);
        } else {
            editText.setTextSize(0, this.f7920A.c());
            int i3 = this.f7927H;
            if (i3 != -1) {
                editText.setLines(i3);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i4 = this.f7929J;
            if (breakStrategy != i4) {
                editText.setBreakStrategy(i4);
            }
        }
        editText.setHint(z1());
        editText.measure(com.facebook.react.views.view.e.a(f3, pVar), com.facebook.react.views.view.e.a(f4, pVar2));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public void S(int i3, float f3) {
        super.S(i3, f3);
        y0();
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public void c0(B0 b4) {
        super.c0(b4);
        EditText editTextY1 = y1();
        K0(4, Z.w(editTextY1));
        K0(1, editTextY1.getPaddingTop());
        K0(5, Z.v(editTextY1));
        K0(3, editTextY1.getPaddingBottom());
        this.f8070c0 = editTextY1;
        editTextY1.setPadding(0, 0, 0, 0);
        this.f8070c0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public void k(Object obj) {
        p002a1.a.a(obj instanceof r);
        this.f8071d0 = (r) obj;
        i();
    }

    @L1.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i3) {
        this.f8069b0 = i3;
    }

    @L1.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f8073f0 = str;
        y0();
    }

    @L1.a(name = "text")
    public void setText(String str) {
        this.f8072e0 = str;
        y0();
    }

    @Override // com.facebook.react.views.text.c
    public void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.f7929J = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.f7929J = 1;
            return;
        }
        if ("balanced".equals(str)) {
            this.f7929J = 2;
            return;
        }
        Y.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
        this.f7929J = 0;
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public boolean v0() {
        return true;
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public boolean w0() {
        return true;
    }

    protected EditText y1() {
        return new EditText(new androidx.appcompat.view.d(l(), AbstractC0466q.f9307g));
    }

    public String z1() {
        return this.f8073f0;
    }

    public H() {
        this(null);
    }
}
