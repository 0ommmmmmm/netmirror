package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p077t0.C0500g;

/* JADX INFO: loaded from: classes.dex */
public class g extends C0500g implements p065q0.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7681f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            D2.h.f(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i3) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // p065q0.d
    public void a(String str, Object obj) {
        D2.h.f(str, "id");
    }

    @Override // p065q0.d
    public void b(String str) {
        D2.h.f(str, "id");
    }

    @Override // p065q0.d
    public void j(String str, Object obj) {
        D2.h.f(str, "id");
    }

    @Override // p065q0.d
    public void k(String str, Object obj, Animatable animatable) {
        D2.h.f(str, "id");
    }

    @Override // p065q0.d
    public void l(String str, Throwable th) {
        D2.h.f(str, "id");
        D2.h.f(th, "throwable");
    }

    @Override // p077t0.C0500g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        x(i3, 10000);
        return super.onLevelChange(i3);
    }

    @Override // p065q0.d
    public void r(String str, Throwable th) {
        D2.h.f(str, "id");
        D2.h.f(th, "throwable");
    }

    public void x(int i3, int i4) {
    }
}
