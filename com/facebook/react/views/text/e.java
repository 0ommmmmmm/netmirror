package com.facebook.react.views.text;

import com.facebook.react.uimanager.C0415r0;

/* JADX INFO: loaded from: classes.dex */
public class e extends C0415r0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f7950y = null;

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public boolean R() {
        return true;
    }

    @L1.a(name = "text")
    public void setText(String str) {
        this.f7950y = str;
        y0();
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public String toString() {
        return v() + " [text: " + this.f7950y + "]";
    }

    public String v1() {
        return this.f7950y;
    }
}
