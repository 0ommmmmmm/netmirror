package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f4244b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C0215k f4245c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f4246a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a implements X.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f4247a = {p012d.e.f8741R, p012d.e.f8739P, p012d.e.f8743a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f4248b = {p012d.e.f8757o, p012d.e.f8725B, p012d.e.f8762t, p012d.e.f8758p, p012d.e.f8759q, p012d.e.f8761s, p012d.e.f8760r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f4249c = {p012d.e.f8738O, p012d.e.f8740Q, p012d.e.f8753k, p012d.e.f8734K, p012d.e.f8735L, p012d.e.f8736M, p012d.e.f8737N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f4250d = {p012d.e.f8765w, p012d.e.f8751i, p012d.e.f8764v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f4251e = {p012d.e.f8733J, p012d.e.f8742S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f4252f = {p012d.e.f8745c, p012d.e.f8749g, p012d.e.f8746d, p012d.e.f8750h};

        a() {
        }

        private boolean f(int[] iArr, int i3) {
            for (int i4 : iArr) {
                if (i4 == i3) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i3) {
            int iC = d0.c(context, p012d.a.f8697x);
            return new ColorStateList(new int[][]{d0.f4192b, d0.f4195e, d0.f4193c, d0.f4199i}, new int[]{d0.b(context, p012d.a.f8695v), androidx.core.graphics.a.d(iC, i3), androidx.core.graphics.a.d(iC, i3), i3});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, p012d.a.f8694u));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, p012d.a.f8695v));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = d0.e(context, p012d.a.f8699z);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = d0.f4192b;
                iArr2[0] = d0.b(context, p012d.a.f8699z);
                iArr[1] = d0.f4196f;
                iArr2[1] = d0.c(context, p012d.a.f8696w);
                iArr[2] = d0.f4199i;
                iArr2[2] = d0.c(context, p012d.a.f8699z);
            } else {
                int[] iArr3 = d0.f4192b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = d0.f4196f;
                iArr2[1] = d0.c(context, p012d.a.f8696w);
                iArr[2] = d0.f4199i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x3, Context context, int i3) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
            Drawable drawableI = x3.i(context, p012d.e.f8729F);
            Drawable drawableI2 = x3.i(context, p012d.e.f8730G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i3, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C0215k.f4244b;
            }
            drawableMutate.setColorFilter(C0215k.e(i3, mode));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0062  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.X.c
        public boolean a(Context context, int i3, Drawable drawable) {
            int i4;
            boolean z3;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C0215k.f4244b;
            if (!f(this.f4247a, i3)) {
                if (f(this.f4249c, i3)) {
                    i4 = p012d.a.f8696w;
                } else {
                    if (f(this.f4250d, i3)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i3 == p012d.e.f8763u) {
                        z3 = true;
                        iRound = Math.round(40.8f);
                        i4 = 16842800;
                        mode = mode;
                    } else if (i3 != p012d.e.f8754l) {
                        i4 = 0;
                        z3 = false;
                        iRound = -1;
                    }
                    mode = mode;
                    iRound = -1;
                    i4 = 16842801;
                    z3 = true;
                }
                if (z3) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C0215k.e(d0.c(context, i4), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i4 = p012d.a.f8698y;
            z3 = true;
            iRound = -1;
            if (z3) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C0215k.e(d0.c(context, i4), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode b(int i3) {
            if (i3 == p012d.e.f8731H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable c(X x3, Context context, int i3) {
            if (i3 == p012d.e.f8752j) {
                return new LayerDrawable(new Drawable[]{x3.i(context, p012d.e.f8751i), x3.i(context, p012d.e.f8753k)});
            }
            if (i3 == p012d.e.f8767y) {
                return l(x3, context, p012d.d.f8717i);
            }
            if (i3 == p012d.e.f8766x) {
                return l(x3, context, p012d.d.f8718j);
            }
            if (i3 == p012d.e.f8768z) {
                return l(x3, context, p012d.d.f8719k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList d(Context context, int i3) {
            if (i3 == p012d.e.f8755m) {
                return p016e.a.a(context, p012d.c.f8705e);
            }
            if (i3 == p012d.e.f8732I) {
                return p016e.a.a(context, p012d.c.f8708h);
            }
            if (i3 == p012d.e.f8731H) {
                return k(context);
            }
            if (i3 == p012d.e.f8748f) {
                return j(context);
            }
            if (i3 == p012d.e.f8744b) {
                return g(context);
            }
            if (i3 == p012d.e.f8747e) {
                return i(context);
            }
            if (i3 == p012d.e.f8727D || i3 == p012d.e.f8728E) {
                return p016e.a.a(context, p012d.c.f8707g);
            }
            if (f(this.f4248b, i3)) {
                return d0.e(context, p012d.a.f8698y);
            }
            if (f(this.f4251e, i3)) {
                return p016e.a.a(context, p012d.c.f8704d);
            }
            if (f(this.f4252f, i3)) {
                return p016e.a.a(context, p012d.c.f8703c);
            }
            if (i3 == p012d.e.f8724A) {
                return p016e.a.a(context, p012d.c.f8706f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i3, Drawable drawable) {
            if (i3 == p012d.e.f8726C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, p012d.a.f8698y), C0215k.f4244b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, p012d.a.f8698y), C0215k.f4244b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, p012d.a.f8696w), C0215k.f4244b);
                return true;
            }
            if (i3 != p012d.e.f8767y && i3 != p012d.e.f8766x && i3 != p012d.e.f8768z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), d0.b(context, p012d.a.f8698y), C0215k.f4244b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, p012d.a.f8696w), C0215k.f4244b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), d0.c(context, p012d.a.f8696w), C0215k.f4244b);
            return true;
        }
    }

    public static synchronized C0215k b() {
        try {
            if (f4245c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4245c;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        return X.k(i3, mode);
    }

    public static synchronized void h() {
        if (f4245c == null) {
            C0215k c0215k = new C0215k();
            f4245c = c0215k;
            c0215k.f4246a = X.g();
            f4245c.f4246a.t(new a());
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i3) {
        return this.f4246a.i(context, i3);
    }

    synchronized Drawable d(Context context, int i3, boolean z3) {
        return this.f4246a.j(context, i3, z3);
    }

    synchronized ColorStateList f(Context context, int i3) {
        return this.f4246a.l(context, i3);
    }

    public synchronized void g(Context context) {
        this.f4246a.r(context);
    }
}
