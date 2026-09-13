package R1;

import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float[] f1998a = new Float[n.values().length];

    public final RectF a(int i3, Context context) {
        RectF rectF;
        D2.h.f(context, "context");
        if (i3 == 0) {
            Float f3 = this.f1998a[n.START.ordinal()];
            float fFloatValue = (f3 == null && (f3 = this.f1998a[n.LEFT.ordinal()]) == null && (f3 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f3 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f3.floatValue();
            Float f4 = this.f1998a[n.BLOCK_START.ordinal()];
            float fFloatValue2 = (f4 == null && (f4 = this.f1998a[n.TOP.ordinal()]) == null && (f4 = this.f1998a[n.BLOCK.ordinal()]) == null && (f4 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f4 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f4.floatValue();
            Float f5 = this.f1998a[n.END.ordinal()];
            float fFloatValue3 = (f5 == null && (f5 = this.f1998a[n.RIGHT.ordinal()]) == null && (f5 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f5 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f5.floatValue();
            Float f6 = this.f1998a[n.BLOCK_END.ordinal()];
            rectF = new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f6 == null && (f6 = this.f1998a[n.BOTTOM.ordinal()]) == null && (f6 = this.f1998a[n.BLOCK.ordinal()]) == null && (f6 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f6 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f6.floatValue());
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Expected resolved layout direction");
            }
            if (com.facebook.react.modules.i18nmanager.a.f6978a.a().d(context)) {
                Float f7 = this.f1998a[n.END.ordinal()];
                float fFloatValue4 = (f7 == null && (f7 = this.f1998a[n.RIGHT.ordinal()]) == null && (f7 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f7 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f7.floatValue();
                Float f8 = this.f1998a[n.BLOCK_START.ordinal()];
                float fFloatValue5 = (f8 == null && (f8 = this.f1998a[n.TOP.ordinal()]) == null && (f8 = this.f1998a[n.BLOCK.ordinal()]) == null && (f8 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f8 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f8.floatValue();
                Float f9 = this.f1998a[n.START.ordinal()];
                float fFloatValue6 = (f9 == null && (f9 = this.f1998a[n.LEFT.ordinal()]) == null && (f9 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f9 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f9.floatValue();
                Float f10 = this.f1998a[n.BLOCK_END.ordinal()];
                rectF = new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f10 == null && (f10 = this.f1998a[n.BOTTOM.ordinal()]) == null && (f10 = this.f1998a[n.BLOCK.ordinal()]) == null && (f10 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f10 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue());
            } else {
                Float f11 = this.f1998a[n.END.ordinal()];
                float fFloatValue7 = (f11 == null && (f11 = this.f1998a[n.LEFT.ordinal()]) == null && (f11 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f11 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
                Float f12 = this.f1998a[n.BLOCK_START.ordinal()];
                float fFloatValue8 = (f12 == null && (f12 = this.f1998a[n.TOP.ordinal()]) == null && (f12 = this.f1998a[n.BLOCK.ordinal()]) == null && (f12 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f12 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
                Float f13 = this.f1998a[n.START.ordinal()];
                float fFloatValue9 = (f13 == null && (f13 = this.f1998a[n.RIGHT.ordinal()]) == null && (f13 = this.f1998a[n.HORIZONTAL.ordinal()]) == null && (f13 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue();
                Float f14 = this.f1998a[n.BLOCK_END.ordinal()];
                rectF = new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f14 == null && (f14 = this.f1998a[n.BOTTOM.ordinal()]) == null && (f14 = this.f1998a[n.BLOCK.ordinal()]) == null && (f14 = this.f1998a[n.VERTICAL.ordinal()]) == null && (f14 = this.f1998a[n.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue());
            }
        }
        return rectF;
    }

    public final void b(n nVar, Float f3) {
        D2.h.f(nVar, "edge");
        this.f1998a[nVar.ordinal()] = f3;
    }
}
