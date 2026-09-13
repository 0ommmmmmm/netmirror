package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements p042k1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultJSExceptionHandler f6764a = new DefaultJSExceptionHandler();

    @Override // p042k1.e
    public void A(boolean z3) {
    }

    @Override // p042k1.e
    public p042k1.f B() {
        return null;
    }

    @Override // p042k1.e
    public ReactContext C() {
        return null;
    }

    @Override // p042k1.e
    public void D() {
    }

    @Override // p042k1.e
    public String E() {
        return null;
    }

    @Override // p042k1.e
    public View a(String str) {
        return null;
    }

    @Override // p042k1.e
    public void b(View view) {
    }

    @Override // p042k1.e
    public void c(boolean z3) {
    }

    @Override // p042k1.e
    public void d(String str, k1.e.a aVar) {
        D2.h.f(str, "message");
        D2.h.f(aVar, "listener");
    }

    @Override // p042k1.e
    public void e() {
    }

    @Override // p042k1.e
    public void f(boolean z3) {
    }

    @Override // p042k1.e
    public p018e1.j g(String str) {
        return null;
    }

    @Override // p042k1.e
    public void h() {
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        D2.h.f(exc, "e");
        this.f6764a.handleException(exc);
    }

    @Override // p042k1.e
    public Activity i() {
        return null;
    }

    @Override // p042k1.e
    public String j() {
        return null;
    }

    @Override // p042k1.e
    public void k(p042k1.g gVar) {
        D2.h.f(gVar, "callback");
        gVar.a(false);
    }

    @Override // p042k1.e
    public String l() {
        return null;
    }

    @Override // p042k1.e
    public void m() {
    }

    @Override // p042k1.e
    public boolean n() {
        return false;
    }

    @Override // p042k1.e
    public C1.a o() {
        return null;
    }

    @Override // p042k1.e
    public void p(String str, p042k1.d dVar) {
    }

    @Override // p042k1.e
    public void q() {
    }

    @Override // p042k1.e
    public void r(ReactContext reactContext) {
        D2.h.f(reactContext, "reactContext");
    }

    @Override // p042k1.e
    public void s() {
    }

    @Override // p042k1.e
    public p042k1.i t() {
        return null;
    }

    @Override // p042k1.e
    public void u() {
    }

    @Override // p042k1.e
    public boolean v() {
        return false;
    }

    @Override // p042k1.e
    public p042k1.j[] w() {
        return null;
    }

    @Override // p042k1.e
    public void x() {
    }

    @Override // p042k1.e
    public Pair y(Pair pair) {
        return pair;
    }

    @Override // p042k1.e
    public void z(ReactContext reactContext) {
        D2.h.f(reactContext, "reactContext");
    }
}
