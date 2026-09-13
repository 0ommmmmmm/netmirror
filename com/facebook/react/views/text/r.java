package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0396h0;
import com.facebook.react.uimanager.C0417s0;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f8011F = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f8021e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f8023g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f8017a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f8018b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f8019c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f8020d = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f8022f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f8024h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f8025i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f8026j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f8027k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f8028l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f8029m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f8030n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f8031o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected u f8032p = u.NONE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f8033q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f8034r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f8035s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f8036t = 1426063360;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f8037u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f8038v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f8039w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected C0396h0.d f8040x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected C0396h0.e f8041y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f8042z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected int f8012A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected String f8013B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected String f8014C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f8015D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected float f8016E = Float.NaN;

    private r() {
    }

    private void A(float f3) {
        this.f8024h = f3;
    }

    private void B(C0396h0.e eVar) {
        this.f8041y = eVar;
    }

    private void C(String str) {
        this.f8037u = false;
        this.f8038v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f8037u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f8038v = true;
                }
            }
        }
    }

    private void D(int i3) {
        if (i3 != this.f8036t) {
            this.f8036t = i3;
        }
    }

    private void E(float f3) {
        this.f8033q = C0392f0.h(f3);
    }

    private void F(float f3) {
        this.f8034r = C0392f0.h(f3);
    }

    private void G(float f3) {
        if (f3 != this.f8035s) {
            this.f8035s = f3;
        }
    }

    private void H(String str) {
        if (str == null || "none".equals(str)) {
            this.f8032p = u.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.f8032p = u.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.f8032p = u.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.f8032p = u.CAPITALIZE;
            return;
        }
        Y.a.I("ReactNative", "Invalid textTransform: " + str);
        this.f8032p = u.NONE;
    }

    public static r a(com.facebook.react.common.mapbuffer.a aVar) {
        r rVar = new r();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            com.facebook.react.common.mapbuffer.a.c cVar = (com.facebook.react.common.mapbuffer.a.c) it.next();
            switch (cVar.getKey()) {
                case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                    rVar.q(Integer.valueOf(cVar.c()));
                    break;
                case 1:
                    rVar.p(Integer.valueOf(cVar.c()));
                    break;
                case 2:
                    rVar.A((float) cVar.e());
                    break;
                case 3:
                    rVar.r(cVar.b());
                    break;
                case 4:
                    rVar.s((float) cVar.e());
                    break;
                case 6:
                    rVar.v(cVar.b());
                    break;
                case 7:
                    rVar.t(cVar.b());
                    break;
                case 8:
                    rVar.u(cVar.d());
                    break;
                case 9:
                    rVar.o(cVar.f());
                    break;
                case 10:
                    rVar.x((float) cVar.e());
                    break;
                case 11:
                    rVar.y((float) cVar.e());
                    break;
                case 15:
                    rVar.C(cVar.b());
                    break;
                case 18:
                    rVar.G((float) cVar.e());
                    break;
                case 19:
                    rVar.D(cVar.c());
                    break;
                case 20:
                    rVar.E((float) cVar.e());
                    break;
                case 21:
                    rVar.F((float) cVar.e());
                    break;
                case 23:
                    rVar.w(cVar.b());
                    break;
                case 24:
                    rVar.n(cVar.b());
                    break;
                case 26:
                    rVar.B(C0396h0.e.values()[cVar.c()]);
                    break;
                case 27:
                    rVar.H(cVar.b());
                    break;
                case 29:
                    rVar.z((float) cVar.e());
                    break;
            }
        }
        return rVar;
    }

    public static int g(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int h(C0417s0 c0417s0, int i3) {
        if (!c0417s0.c("textAlign")) {
            return i3;
        }
        if (!"justify".equals(c0417s0.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f8011F;
        }
        return 1;
    }

    public static int i(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        Y.a.I("ReactNative", "Invalid layoutDirection: " + str);
        return -1;
    }

    public static int l(C0417s0 c0417s0, boolean z3, int i3) {
        if (!c0417s0.c("textAlign")) {
            return i3;
        }
        String strB = c0417s0.b("textAlign");
        if ("justify".equals(strB)) {
            return 3;
        }
        if (strB != null && !"auto".equals(strB)) {
            if ("left".equals(strB)) {
                return z3 ? 5 : 3;
            }
            if ("right".equals(strB)) {
                return z3 ? 3 : 5;
            }
            if ("center".equals(strB)) {
                return 1;
            }
            Y.a.I("ReactNative", "Invalid textAlign: " + strB);
        }
        return 0;
    }

    public static int m(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    private void n(String str) {
        if (str == null) {
            this.f8040x = null;
        } else {
            this.f8040x = C0396h0.d.c(str);
        }
    }

    private void o(boolean z3) {
        if (z3 != this.f8019c) {
            this.f8019c = z3;
            s(this.f8027k);
            y(this.f8028l);
        }
    }

    private void p(Integer num) {
        boolean z3 = num != null;
        this.f8022f = z3;
        if (z3) {
            this.f8023g = num.intValue();
        }
    }

    private void q(Integer num) {
        boolean z3 = num != null;
        this.f8018b = z3;
        if (z3) {
            this.f8021e = num.intValue();
        }
    }

    private void r(String str) {
        this.f8013B = str;
    }

    private void s(float f3) {
        this.f8027k = f3;
        if (f3 != -1.0f) {
            f3 = (float) (this.f8019c ? Math.ceil(C0392f0.k(f3, this.f8020d)) : Math.ceil(C0392f0.h(f3)));
        }
        this.f8026j = (int) f3;
    }

    private void t(String str) {
        this.f8042z = p.b(str);
    }

    private void u(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f8014C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String strB = ((com.facebook.react.common.mapbuffer.a.c) it.next()).b();
            if (strB != null) {
                switch (strB) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.f8014C = TextUtils.join(", ", arrayList);
    }

    private void v(String str) {
        this.f8012A = p.d(str);
    }

    private void w(String str) {
        this.f8031o = i(str);
    }

    private void x(float f3) {
        this.f8029m = f3;
    }

    private void y(float f3) {
        this.f8028l = f3;
        if (f3 == -1.0f) {
            this.f8017a = Float.NaN;
        } else {
            this.f8017a = this.f8019c ? C0392f0.j(f3) : C0392f0.h(f3);
        }
    }

    private void z(float f3) {
        if (f3 != this.f8020d) {
            this.f8020d = f3;
            s(this.f8027k);
            y(this.f8028l);
        }
    }

    public int b() {
        return this.f8026j;
    }

    public float c() {
        if (!Float.isNaN(this.f8017a) && !Float.isNaN(this.f8016E)) {
            float f3 = this.f8016E;
            if (f3 > this.f8017a) {
                return f3;
            }
        }
        return this.f8017a;
    }

    public String d() {
        return this.f8013B;
    }

    public int e() {
        return this.f8042z;
    }

    public int f() {
        return this.f8012A;
    }

    public float j() {
        float fJ = this.f8019c ? C0392f0.j(this.f8029m) : C0392f0.h(this.f8029m);
        int i3 = this.f8026j;
        if (i3 > 0) {
            return fJ / i3;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f8026j);
    }

    public float k() {
        return this.f8024h;
    }
}
