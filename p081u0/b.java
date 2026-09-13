package p081u0;

import X.k;
import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p077t0.r;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f10829t = r.f10776h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f10830u = r.f10777i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f10831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f10834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f10835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f10836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f10837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f10838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r f10839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f10840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f10841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f10842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f10843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f10844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f10845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f10846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f10847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f10848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f10849s;

    public b(Resources resources) {
        this.f10831a = resources;
        t();
    }

    private void K() {
        List list = this.f10847q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    private void t() {
        this.f10832b = 300;
        this.f10833c = 0.0f;
        this.f10834d = null;
        r rVar = f10829t;
        this.f10835e = rVar;
        this.f10836f = null;
        this.f10837g = rVar;
        this.f10838h = null;
        this.f10839i = rVar;
        this.f10840j = null;
        this.f10841k = rVar;
        this.f10842l = f10830u;
        this.f10843m = null;
        this.f10844n = null;
        this.f10845o = null;
        this.f10846p = null;
        this.f10847q = null;
        this.f10848r = null;
        this.f10849s = null;
    }

    public static b u(Resources resources) {
        return new b(resources);
    }

    public b A(r rVar) {
        this.f10839i = rVar;
        return this;
    }

    public b B(Drawable drawable) {
        if (drawable == null) {
            this.f10847q = null;
        } else {
            this.f10847q = Arrays.asList(drawable);
        }
        return this;
    }

    public b C(Drawable drawable) {
        this.f10834d = drawable;
        return this;
    }

    public b D(r rVar) {
        this.f10835e = rVar;
        return this;
    }

    public b E(Drawable drawable) {
        if (drawable == null) {
            this.f10848r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
            this.f10848r = stateListDrawable;
        }
        return this;
    }

    public b F(Drawable drawable) {
        this.f10840j = drawable;
        return this;
    }

    public b G(r rVar) {
        this.f10841k = rVar;
        return this;
    }

    public b H(Drawable drawable) {
        this.f10836f = drawable;
        return this;
    }

    public b I(r rVar) {
        this.f10837g = rVar;
        return this;
    }

    public b J(e eVar) {
        this.f10849s = eVar;
        return this;
    }

    public a a() {
        K();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f10845o;
    }

    public PointF c() {
        return this.f10844n;
    }

    public r d() {
        return this.f10842l;
    }

    public Drawable e() {
        return this.f10846p;
    }

    public float f() {
        return this.f10833c;
    }

    public int g() {
        return this.f10832b;
    }

    public Drawable h() {
        return this.f10838h;
    }

    public r i() {
        return this.f10839i;
    }

    public List j() {
        return this.f10847q;
    }

    public Drawable k() {
        return this.f10834d;
    }

    public r l() {
        return this.f10835e;
    }

    public Drawable m() {
        return this.f10848r;
    }

    public Drawable n() {
        return this.f10840j;
    }

    public r o() {
        return this.f10841k;
    }

    public Resources p() {
        return this.f10831a;
    }

    public Drawable q() {
        return this.f10836f;
    }

    public r r() {
        return this.f10837g;
    }

    public e s() {
        return this.f10849s;
    }

    public b v(r rVar) {
        this.f10842l = rVar;
        this.f10843m = null;
        return this;
    }

    public b w(Drawable drawable) {
        this.f10846p = drawable;
        return this;
    }

    public b x(float f3) {
        this.f10833c = f3;
        return this;
    }

    public b y(int i3) {
        this.f10832b = i3;
        return this;
    }

    public b z(Drawable drawable) {
        this.f10838h = drawable;
        return this;
    }
}
