package com.facebook.react.views.debuggingoverlay;

import D2.h;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f7656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7657c;

    public c(int i3, RectF rectF, int i4) {
        h.f(rectF, "rectangle");
        this.f7655a = i3;
        this.f7656b = rectF;
        this.f7657c = i4;
    }

    public final int a() {
        return this.f7657c;
    }

    public final int b() {
        return this.f7655a;
    }

    public final RectF c() {
        return this.f7656b;
    }
}
