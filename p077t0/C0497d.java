package p077t0;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f10654f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f10657c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10655a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10658d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10659e = -1;

    /* JADX INFO: renamed from: t0.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i3 = this.f10655a;
        if (i3 != -1) {
            drawable.setAlpha(i3);
        }
        if (this.f10656b) {
            drawable.setColorFilter(this.f10657c);
        }
        int i4 = this.f10658d;
        if (i4 != -1) {
            drawable.setDither(i4 != 0);
        }
        int i5 = this.f10659e;
        if (i5 != -1) {
            drawable.setFilterBitmap(i5 != 0);
        }
    }

    public final void b(int i3) {
        this.f10655a = i3;
    }

    public final void c(ColorFilter colorFilter) {
        this.f10657c = colorFilter;
        this.f10656b = colorFilter != null;
    }

    public final void d(boolean z3) {
        this.f10658d = z3 ? 1 : 0;
    }

    public final void e(boolean z3) {
        this.f10659e = z3 ? 1 : 0;
    }
}
