package com.facebook.react.uimanager;

import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f7465a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f7466b = p071r2.d.b(p071r2.g.SYNCHRONIZED, new C2.a() { // from class: com.facebook.react.uimanager.a1
        @Override // C2.a
        public final Object a() {
            return b1.d();
        }
    });

    private b1() {
    }

    public static final p018e1.b b() {
        return f7465a.c();
    }

    private final p018e1.b c() {
        return (p018e1.b) f7466b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p018e1.b d() {
        return new p018e1.b(1024);
    }
}
