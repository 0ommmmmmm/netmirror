package p081u0;

import V0.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import p045l0.a;
import p077t0.RunnableC0495b;
import p077t0.r;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static Drawable a(Context context, TypedArray typedArray, int i3) {
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    private static e b(b bVar) {
        if (bVar.s() == null) {
            bVar.J(new e());
        }
        return bVar.s();
    }

    public static r c(TypedArray typedArray, int i3) {
        switch (typedArray.getInt(i3, -2)) {
            case -1:
                return null;
            case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                return r.f10769a;
            case 1:
                return r.f10772d;
            case 2:
                return r.f10773e;
            case 3:
                return r.f10774f;
            case 4:
                return r.f10775g;
            case 5:
                return r.f10776h;
            case 6:
                return r.f10777i;
            case 7:
                return r.f10778j;
            case 8:
                return r.f10779k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static b d(Context context, AttributeSet attributeSet) throws Throwable {
        if (b.d()) {
            b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        b bVarE = e(new b(context.getResources()), context, attributeSet);
        if (b.d()) {
            b.b();
        }
        return bVarE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static b e(b bVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        boolean z7;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.f9673a);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i5 = 0;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                boolean z14 = true;
                boolean z15 = true;
                int dimensionPixelSize = 0;
                while (i5 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i5);
                        if (index == a.f9674b) {
                            bVar.v(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9680h) {
                            bVar.C(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9682j) {
                            bVar.E(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9684l) {
                            bVar.F(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9676d) {
                            bVar.y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == a.f9669D) {
                            bVar.x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == a.f9681i) {
                            bVar.D(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9686n) {
                            bVar.H(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9687o) {
                            bVar.I(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9677e) {
                            bVar.z(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9678f) {
                            bVar.A(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9685m) {
                            bVar.G(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9683k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == a.f9675c) {
                            bVar.w(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9679g) {
                            bVar.B(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == a.f9688p) {
                            b(bVar).t(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == a.f9698z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i6 = dimensionPixelSize;
                            if (index == a.f9694v) {
                                z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                            } else if (index == a.f9695w) {
                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == a.f9690r) {
                                z14 = typedArrayObtainStyledAttributes.getBoolean(index, z14);
                            } else if (index == a.f9691s) {
                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == a.f9696x) {
                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == a.f9693u) {
                                z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                            } else if (index == a.f9692t) {
                                z15 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                            } else {
                                if (index == a.f9689q) {
                                    z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                                } else if (index == a.f9697y) {
                                    dimensionPixelSize = i6;
                                    b(bVar).q(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    dimensionPixelSize = i6;
                                    if (index == a.f9668C) {
                                        b(bVar).n(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    } else if (index == a.f9666A) {
                                        b(bVar).m(typedArrayObtainStyledAttributes.getColor(index, 0));
                                    } else if (index == a.f9667B) {
                                        b(bVar).r(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                }
                                i5++;
                                context2 = context;
                            }
                            dimensionPixelSize = i6;
                        }
                        i5++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z16 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z7 = z8 && z11;
                    z3 = z10 && z9;
                    z4 = z12 && z15;
                    if (z14 && z13) {
                        z16 = true;
                    }
                } else {
                    z7 = z8 && z9;
                    z3 = z10 && z11;
                    z4 = z12 && z13;
                    if (z14 && z15) {
                        z16 = true;
                    }
                }
                z6 = z16;
                i3 = integer;
                z5 = z7;
                i4 = dimensionPixelSize;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z3 = true;
            i3 = 0;
            z4 = true;
            z5 = true;
            z6 = true;
            i4 = 0;
        }
        if (bVar.n() != null && i3 > 0) {
            bVar.F(new RunnableC0495b(bVar.n(), i3));
        }
        if (i4 > 0) {
            b(bVar).o(z5 ? i4 : 0.0f, z3 ? i4 : 0.0f, z4 ? i4 : 0.0f, z6 ? i4 : 0.0f);
        }
        return bVar;
    }
}
