package com.facebook.react.uimanager;

import kotlin.Lazy;

/* JADX INFO: renamed from: com.facebook.react.uimanager.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0421u0 f7632a = new C0421u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f7633b = p071r2.d.b(p071r2.g.NONE, new C2.a() { // from class: com.facebook.react.uimanager.t0
        @Override // C2.a
        public final Object a() {
            return C0421u0.c();
        }
    });

    private C0421u0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.yoga.c c() {
        com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
        cVarA.b(0.0f);
        cVarA.a(com.facebook.yoga.k.ALL);
        return cVarA;
    }

    public final com.facebook.yoga.c b() {
        Object value = f7633b.getValue();
        D2.h.e(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
