package com.facebook.react.views.text;

import android.text.Spannable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f7977k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f7978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f7981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f7987j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(Spannable spannable, int i3, int i4, int i5, int i6) {
            D2.h.f(spannable, "text");
            return new i(spannable, i3, false, i4, i5, i6);
        }

        private a() {
        }
    }

    public i(Spannable spannable, int i3, boolean z3, float f3, float f4, float f5, float f6, int i4, int i5, int i6) {
        D2.h.f(spannable, "text");
        this.f7978a = spannable;
        this.f7979b = i3;
        this.f7980c = z3;
        this.f7981d = f3;
        this.f7982e = f4;
        this.f7983f = f5;
        this.f7984g = f6;
        this.f7985h = i4;
        this.f7986i = i5;
        this.f7987j = i6;
    }

    public static final i a(Spannable spannable, int i3, int i4, int i5, int i6) {
        return f7977k.a(spannable, i3, i4, i5, i6);
    }

    public final boolean b() {
        return this.f7980c;
    }

    public final int c() {
        return this.f7979b;
    }

    public final int d() {
        return this.f7987j;
    }

    public final float e() {
        return this.f7984g;
    }

    public final float f() {
        return this.f7981d;
    }

    public final float g() {
        return this.f7983f;
    }

    public final float h() {
        return this.f7982e;
    }

    public final Spannable i() {
        return this.f7978a;
    }

    public final int j() {
        return this.f7985h;
    }

    public final int k() {
        return this.f7986i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Spannable spannable, int i3, boolean z3, float f3, float f4, float f5, float f6, int i4) {
        this(spannable, i3, z3, f3, f4, f5, f6, i4, 1, 0);
        D2.h.f(spannable, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Spannable spannable, int i3, boolean z3, int i4, int i5, int i6) {
        this(spannable, i3, z3, -1.0f, -1.0f, -1.0f, -1.0f, i4, i5, i6);
        D2.h.f(spannable, "text");
    }
}
