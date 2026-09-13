package p081u0;

import V0.b;
import Y.a;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import p077t0.C0500g;
import p077t0.InterfaceC0496c;
import p077t0.j;
import p077t0.k;
import p077t0.l;
import p077t0.m;
import p077t0.o;
import p077t0.p;
import p077t0.r;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f10865a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), eVar.i());
            b(kVar, eVar);
            return kVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            b(oVar, eVar);
            return oVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        l lVarA = l.a((ColorDrawable) drawable);
        b(lVarA, eVar);
        return lVarA;
    }

    static void b(j jVar, e eVar) {
        jVar.h(eVar.j());
        jVar.t(eVar.d());
        jVar.c(eVar.b(), eVar.c());
        jVar.i(eVar.g());
        jVar.s(eVar.l());
        jVar.p(eVar.h());
        jVar.f(eVar.i());
    }

    static InterfaceC0496c c(InterfaceC0496c interfaceC0496c) {
        while (true) {
            Object objQ = interfaceC0496c.q();
            if (objQ == interfaceC0496c || !(objQ instanceof InterfaceC0496c)) {
                break;
            }
            interfaceC0496c = (InterfaceC0496c) objQ;
        }
        return interfaceC0496c;
    }

    static Drawable d(Drawable drawable, e eVar, Resources resources) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.BITMAP_ONLY) {
                if (!(drawable instanceof C0500g)) {
                    return a(drawable, eVar, resources);
                }
                InterfaceC0496c interfaceC0496cC = c((C0500g) drawable);
                interfaceC0496cC.d(a(interfaceC0496cC.d(f10865a), eVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, e eVar) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.OVERLAY_COLOR) {
                m mVar = new m(drawable);
                b(mVar, eVar);
                mVar.y(eVar.f());
                return mVar;
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, r rVar) {
        return g(drawable, rVar, null);
    }

    static Drawable g(Drawable drawable, r rVar, PointF pointF) {
        if (b.d()) {
            b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || rVar == null) {
            if (b.d()) {
                b.b();
            }
            return drawable;
        }
        p pVar = new p(drawable, rVar);
        if (pointF != null) {
            pVar.B(pointF);
        }
        if (b.d()) {
            b.b();
        }
        return pVar;
    }

    static void h(j jVar) {
        jVar.h(false);
        jVar.m(0.0f);
        jVar.c(0, 0.0f);
        jVar.i(0.0f);
        jVar.s(false);
        jVar.p(false);
        jVar.f(k.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC0496c interfaceC0496c, e eVar, Resources resources) {
        InterfaceC0496c interfaceC0496cC = c(interfaceC0496c);
        Drawable drawableQ = interfaceC0496cC.q();
        if (eVar == null || eVar.k() != e.a.BITMAP_ONLY) {
            if (drawableQ instanceof j) {
                h((j) drawableQ);
            }
        } else if (drawableQ instanceof j) {
            b((j) drawableQ, eVar);
        } else if (drawableQ != 0) {
            interfaceC0496cC.d(f10865a);
            interfaceC0496cC.d(a(drawableQ, eVar, resources));
        }
    }

    static void j(InterfaceC0496c interfaceC0496c, e eVar) {
        Drawable drawableQ = interfaceC0496c.q();
        if (eVar == null || eVar.k() != e.a.OVERLAY_COLOR) {
            if (drawableQ instanceof m) {
                Drawable drawable = f10865a;
                interfaceC0496c.d(((m) drawableQ).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableQ instanceof m)) {
            interfaceC0496c.d(e(interfaceC0496c.d(f10865a), eVar));
            return;
        }
        m mVar = (m) drawableQ;
        b(mVar, eVar);
        mVar.y(eVar.f());
    }

    static p k(InterfaceC0496c interfaceC0496c, r rVar) {
        Drawable drawableF = f(interfaceC0496c.d(f10865a), rVar);
        interfaceC0496c.d(drawableF);
        X.k.h(drawableF, "Parent has no child drawable!");
        return (p) drawableF;
    }
}
