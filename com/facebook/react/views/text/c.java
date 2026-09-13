package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0386c0;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0396h0;
import com.facebook.react.uimanager.C0415r0;
import com.facebook.react.uimanager.InterfaceC0414q0;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.U;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends U {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected s f7920A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f7921B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int f7922C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f7923D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected int f7924E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected C0396h0.d f7925F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected C0396h0.e f7926G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected int f7927H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected int f7928I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f7929J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected int f7930K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected int f7931L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected float f7932M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected float f7933N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected float f7934O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected int f7935P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected boolean f7936Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected boolean f7937R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected boolean f7938S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f7939T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected float f7940U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected int f7941V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f7942W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected String f7943X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected String f7944Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected boolean f7945Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected Map f7946a0;

    public c() {
        this(null);
    }

    private static void w1(c cVar, SpannableStringBuilder spannableStringBuilder, List list, s sVar, boolean z3, Map map, int i3) {
        float fE0;
        float fU;
        s sVarA = sVar != null ? sVar.a(cVar.f7920A) : cVar.f7920A;
        int iC = cVar.C();
        for (int i4 = 0; i4 < iC; i4++) {
            C0415r0 c0415r0N = cVar.N(i4);
            if (c0415r0N instanceof e) {
                spannableStringBuilder.append((CharSequence) u.b(((e) c0415r0N).v1(), sVarA.l()));
            } else if (c0415r0N instanceof c) {
                w1((c) c0415r0N, spannableStringBuilder, list, sVarA, z3, map, spannableStringBuilder.length());
            } else {
                if (c0415r0N instanceof Y1.a) {
                    spannableStringBuilder.append("0");
                    list.add(new Z1.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((Y1.a) c0415r0N).w1()));
                } else {
                    if (!z3) {
                        throw new P("Unexpected view type nested under a <Text> or <TextInput> node: " + c0415r0N.getClass());
                    }
                    int iH = c0415r0N.H();
                    YogaValue yogaValueC = c0415r0N.c();
                    YogaValue yogaValueZ = c0415r0N.z();
                    w wVar = yogaValueC.f8293b;
                    w wVar2 = w.POINT;
                    if (wVar == wVar2 && yogaValueZ.f8293b == wVar2) {
                        fE0 = yogaValueC.f8292a;
                        fU = yogaValueZ.f8292a;
                    } else {
                        c0415r0N.M();
                        fE0 = c0415r0N.e0();
                        fU = c0415r0N.u();
                    }
                    spannableStringBuilder.append("0");
                    list.add(new Z1.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new Z1.q(iH, (int) fE0, (int) fU)));
                    map.put(Integer.valueOf(iH), c0415r0N);
                }
                c0415r0N.d();
            }
            c0415r0N.d();
        }
        int length = spannableStringBuilder.length();
        if (length >= i3) {
            if (cVar.f7921B) {
                list.add(new Z1.n(i3, length, new Z1.g(cVar.f7922C)));
            }
            if (cVar.f7923D) {
                list.add(new Z1.n(i3, length, new Z1.e(cVar.f7924E)));
            }
            C0396h0.e eVar = cVar.f7926G;
            if (eVar == null ? cVar.f7925F == C0396h0.d.LINK : eVar == C0396h0.e.LINK) {
                list.add(new Z1.n(i3, length, new Z1.f(cVar.H())));
            }
            float fD = sVarA.d();
            if (!Float.isNaN(fD) && (sVar == null || sVar.d() != fD)) {
                list.add(new Z1.n(i3, length, new Z1.a(fD)));
            }
            int iC2 = sVarA.c();
            if (sVar == null || sVar.c() != iC2) {
                list.add(new Z1.n(i3, length, new Z1.d(iC2)));
            }
            if (cVar.f7941V != -1 || cVar.f7942W != -1 || cVar.f7943X != null) {
                list.add(new Z1.n(i3, length, new Z1.c(cVar.f7941V, cVar.f7942W, cVar.f7944Y, cVar.f7943X, cVar.l().getAssets())));
            }
            if (cVar.f7936Q) {
                list.add(new Z1.n(i3, length, new Z1.m()));
            }
            if (cVar.f7937R) {
                list.add(new Z1.n(i3, length, new Z1.j()));
            }
            if ((cVar.f7932M != 0.0f || cVar.f7933N != 0.0f || cVar.f7934O != 0.0f) && Color.alpha(cVar.f7935P) != 0) {
                list.add(new Z1.n(i3, length, new Z1.o(cVar.f7932M, cVar.f7933N, cVar.f7934O, cVar.f7935P)));
            }
            float fE = sVarA.e();
            if (!Float.isNaN(fE) && (sVar == null || sVar.e() != fE)) {
                list.add(new Z1.n(i3, length, new Z1.b(fE)));
            }
            list.add(new Z1.n(i3, length, new Z1.k(cVar.H())));
        }
    }

    @L1.a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (R()) {
            this.f7925F = C0396h0.d.c(str);
            y0();
        }
    }

    @L1.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z3) {
        if (z3 != this.f7939T) {
            this.f7939T = z3;
            y0();
        }
    }

    @L1.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z3) {
        if (z3 != this.f7920A.b()) {
            this.f7920A.m(z3);
            y0();
        }
    }

    @L1.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (R()) {
            boolean z3 = num != null;
            this.f7923D = z3;
            if (z3) {
                this.f7924E = num.intValue();
            }
            y0();
        }
    }

    @L1.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z3 = num != null;
        this.f7921B = z3;
        if (z3) {
            this.f7922C = num.intValue();
        }
        y0();
    }

    @L1.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f7943X = str;
        y0();
    }

    @L1.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f3) {
        this.f7920A.n(f3);
        y0();
    }

    @L1.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = p.b(str);
        if (iB != this.f7941V) {
            this.f7941V = iB;
            y0();
        }
    }

    @L1.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = p.c(readableArray);
        if (TextUtils.equals(strC, this.f7944Y)) {
            return;
        }
        this.f7944Y = strC;
        y0();
    }

    @L1.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = p.d(str);
        if (iD != this.f7942W) {
            this.f7942W = iD;
            y0();
        }
    }

    @L1.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z3) {
        this.f7938S = z3;
    }

    @L1.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f3) {
        this.f7920A.p(f3);
        y0();
    }

    @L1.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f3) {
        this.f7920A.q(f3);
        y0();
    }

    @L1.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f3) {
        if (f3 != this.f7920A.k()) {
            this.f7920A.r(f3);
            y0();
        }
    }

    @L1.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f3) {
        if (f3 != this.f7940U) {
            this.f7940U = f3;
            y0();
        }
    }

    @L1.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i3) {
        if (i3 == 0) {
            i3 = -1;
        }
        this.f7927H = i3;
        y0();
    }

    @L1.a(name = "role")
    public void setRole(String str) {
        if (R()) {
            this.f7926G = C0396h0.e.b(str);
            y0();
        }
    }

    @L1.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7931L = 1;
            }
            this.f7928I = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7931L = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f7928I = 0;
            } else if ("left".equals(str)) {
                this.f7928I = 3;
            } else if ("right".equals(str)) {
                this.f7928I = 5;
            } else if ("center".equals(str)) {
                this.f7928I = 1;
            } else {
                Y.a.I("ReactNative", "Invalid textAlign: " + str);
                this.f7928I = 0;
            }
        }
        y0();
    }

    @L1.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f7929J = 1;
        } else if ("simple".equals(str)) {
            this.f7929J = 0;
        } else if ("balanced".equals(str)) {
            this.f7929J = 2;
        } else {
            Y.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f7929J = 1;
        }
        y0();
    }

    @L1.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f7936Q = false;
        this.f7937R = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f7936Q = true;
                } else if ("line-through".equals(str2)) {
                    this.f7937R = true;
                }
            }
        }
        y0();
    }

    @L1.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i3) {
        if (i3 != this.f7935P) {
            this.f7935P = i3;
            y0();
        }
    }

    @L1.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f7932M = 0.0f;
        this.f7933N = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f7932M = C0392f0.g(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f7933N = C0392f0.g(readableMap.getDouble("height"));
            }
        }
        y0();
    }

    @L1.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f3) {
        if (f3 != this.f7934O) {
            this.f7934O = f3;
            y0();
        }
    }

    @L1.a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.f7920A.s(u.UNSET);
        } else if ("none".equals(str)) {
            this.f7920A.s(u.NONE);
        } else if ("uppercase".equals(str)) {
            this.f7920A.s(u.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.f7920A.s(u.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.f7920A.s(u.CAPITALIZE);
        } else {
            Y.a.I("ReactNative", "Invalid textTransform: " + str);
            this.f7920A.s(u.UNSET);
        }
        y0();
    }

    protected Spannable x1(c cVar, String str, boolean z3, C0386c0 c0386c0) {
        int iB;
        p002a1.a.b((z3 && c0386c0 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z3 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) u.b(str, cVar.f7920A.l()));
        }
        w1(cVar, spannableStringBuilder, arrayList, null, z3, map, 0);
        cVar.f7945Z = false;
        cVar.f7946a0 = map;
        float f3 = Float.NaN;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Z1.n nVar = (Z1.n) arrayList.get((arrayList.size() - i3) - 1);
            Z1.i iVar = nVar.f2834c;
            boolean z4 = iVar instanceof Z1.p;
            if (z4 || (iVar instanceof Z1.q)) {
                if (z4) {
                    iB = ((Z1.p) iVar).b();
                    cVar.f7945Z = true;
                } else {
                    Z1.q qVar = (Z1.q) iVar;
                    int iA = qVar.a();
                    InterfaceC0414q0 interfaceC0414q0 = (InterfaceC0414q0) map.get(Integer.valueOf(qVar.b()));
                    c0386c0.h(interfaceC0414q0);
                    interfaceC0414q0.w(cVar);
                    iB = iA;
                }
                if (Float.isNaN(f3) || iB > f3) {
                    f3 = iB;
                }
            }
            nVar.a(spannableStringBuilder, i3);
        }
        cVar.f7920A.o(f3);
        return spannableStringBuilder;
    }

    public c(o oVar) {
        this.f7921B = false;
        this.f7923D = false;
        this.f7925F = null;
        this.f7926G = null;
        this.f7927H = -1;
        this.f7928I = 0;
        this.f7929J = 1;
        this.f7930K = 0;
        this.f7931L = 0;
        this.f7932M = 0.0f;
        this.f7933N = 0.0f;
        this.f7934O = 0.0f;
        this.f7935P = 1426063360;
        this.f7936Q = false;
        this.f7937R = false;
        this.f7938S = true;
        this.f7939T = false;
        this.f7940U = 0.0f;
        this.f7941V = -1;
        this.f7942W = -1;
        this.f7943X = null;
        this.f7944Y = null;
        this.f7945Z = false;
        this.f7920A = new s();
    }
}
