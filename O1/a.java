package O1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C0392f0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R1.e f1485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R1.c f1486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f1488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private R1.j f1489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f1492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Path f1493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f1494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f1495l;

    public /* synthetic */ a(Context context, R1.e eVar, R1.c cVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : eVar, (i3 & 4) != 0 ? null : cVar);
    }

    private final RectF a() {
        float fB;
        float fB2;
        float fB3;
        R1.c cVar = this.f1486c;
        RectF rectFA = cVar != null ? cVar.a(getLayoutDirection(), this.f1484a) : null;
        float fB4 = 0.0f;
        if (rectFA != null) {
            fB = C0392f0.f7477a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        if (rectFA != null) {
            fB2 = C0392f0.f7477a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        if (rectFA != null) {
            fB3 = C0392f0.f7477a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        if (rectFA != null) {
            fB4 = C0392f0.f7477a.b(rectFA.bottom);
        }
        return new RectF(fB, fB2, fB3, fB4);
    }

    private final Shader c() {
        List<R1.a> list = this.f1494k;
        Shader composeShader = null;
        if (list != null) {
            for (R1.a aVar : list) {
                Rect bounds = getBounds();
                D2.h.e(bounds, "getBounds(...)");
                Shader shaderA = aVar.a(bounds);
                if (shaderA != null) {
                    composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
                }
            }
        }
        return composeShader;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    private final void h() {
        R1.j jVarD;
        boolean z3;
        Path path;
        R1.k kVarA;
        R1.k kVarA2;
        R1.k kVarB;
        R1.k kVarB2;
        R1.k kVarD;
        R1.k kVarD2;
        R1.k kVarC;
        R1.k kVarC2;
        R1.e eVar;
        R1.j jVar;
        if (this.f1490g) {
            this.f1490g = false;
            this.f1492i.set(getBounds());
            this.f1488e = a();
            R1.e eVar2 = this.f1485b;
            if (eVar2 != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.f1484a;
                C0392f0 c0392f0 = C0392f0.f7477a;
                jVarD = eVar2.d(layoutDirection, context, c0392f0.e(getBounds().width()), c0392f0.e(getBounds().height()));
            } else {
                jVarD = null;
            }
            this.f1489f = jVarD;
            RectF rectF = this.f1488e;
            float fB = 0.0f;
            if (D2.h.a(rectF != null ? Float.valueOf(rectF.left) : null, 0.0f)) {
                RectF rectF2 = this.f1488e;
                if (D2.h.a(rectF2 != null ? Float.valueOf(rectF2.top) : null, 0.0f)) {
                    RectF rectF3 = this.f1488e;
                    if (D2.h.a(rectF3 != null ? Float.valueOf(rectF3.right) : null, 0.0f)) {
                        RectF rectF4 = this.f1488e;
                        if (D2.h.a(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, 0.0f)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = true;
                }
            } else {
                z3 = true;
            }
            R1.j jVar2 = this.f1489f;
            if (jVar2 != null && jVar2.e() && (jVar = this.f1489f) != null && !jVar.f()) {
                Path path2 = this.f1493j;
                if (path2 == null) {
                    path2 = new Path();
                }
                this.f1493j = path2;
                path2.reset();
            }
            if (z3 && (eVar = this.f1485b) != null && eVar.c()) {
                RectF rectF5 = this.f1492i;
                float f3 = rectF5.left;
                float f4 = this.f1487d;
                rectF5.left = f3 + f4;
                rectF5.top += f4;
                rectF5.right -= f4;
                rectF5.bottom -= f4;
            }
            R1.e eVar3 = this.f1485b;
            if (eVar3 == null || !eVar3.c()) {
                return;
            }
            R1.j jVar3 = this.f1489f;
            if ((jVar3 == null || !jVar3.f()) && (path = this.f1493j) != null) {
                RectF rectF6 = this.f1492i;
                R1.j jVar4 = this.f1489f;
                float fB2 = (jVar4 == null || (kVarC2 = jVar4.c()) == null) ? 0.0f : C0392f0.f7477a.b(kVarC2.a());
                R1.j jVar5 = this.f1489f;
                float fB3 = (jVar5 == null || (kVarC = jVar5.c()) == null) ? 0.0f : C0392f0.f7477a.b(kVarC.b());
                R1.j jVar6 = this.f1489f;
                float fB4 = (jVar6 == null || (kVarD2 = jVar6.d()) == null) ? 0.0f : C0392f0.f7477a.b(kVarD2.a());
                R1.j jVar7 = this.f1489f;
                float fB5 = (jVar7 == null || (kVarD = jVar7.d()) == null) ? 0.0f : C0392f0.f7477a.b(kVarD.b());
                R1.j jVar8 = this.f1489f;
                float fB6 = (jVar8 == null || (kVarB2 = jVar8.b()) == null) ? 0.0f : C0392f0.f7477a.b(kVarB2.a());
                R1.j jVar9 = this.f1489f;
                float fB7 = (jVar9 == null || (kVarB = jVar9.b()) == null) ? 0.0f : C0392f0.f7477a.b(kVarB.b());
                R1.j jVar10 = this.f1489f;
                float fB8 = (jVar10 == null || (kVarA2 = jVar10.a()) == null) ? 0.0f : C0392f0.f7477a.b(kVarA2.a());
                R1.j jVar11 = this.f1489f;
                if (jVar11 != null && (kVarA = jVar11.a()) != null) {
                    fB = C0392f0.f7477a.b(kVarA.b());
                }
                path.addRoundRect(rectF6, new float[]{fB2, fB3, fB4, fB5, fB6, fB7, fB8, fB}, Path.Direction.CW);
            }
        }
    }

    public final int b() {
        return this.f1491h;
    }

    public final void d(int i3) {
        if (this.f1491h != i3) {
            this.f1491h = i3;
            this.f1495l.setColor(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        R1.e eVar;
        R1.k kVarC;
        R1.k kVarC2;
        R1.e eVar2;
        R1.k kVarC3;
        R1.k kVarC4;
        D2.h.f(canvas, "canvas");
        h();
        canvas.save();
        float fB = 0.0f;
        if (this.f1495l.getAlpha() != 0) {
            R1.j jVar = this.f1489f;
            if (jVar == null || !jVar.f() || (eVar2 = this.f1485b) == null || !eVar2.c()) {
                R1.e eVar3 = this.f1485b;
                if (eVar3 == null || !eVar3.c()) {
                    canvas.drawRect(this.f1492i, this.f1495l);
                } else {
                    Path path = this.f1493j;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.f1495l);
                }
            } else {
                RectF rectF = this.f1492i;
                R1.j jVar2 = this.f1489f;
                float fB2 = (jVar2 == null || (kVarC4 = jVar2.c()) == null) ? 0.0f : C0392f0.f7477a.b(kVarC4.a());
                R1.j jVar3 = this.f1489f;
                canvas.drawRoundRect(rectF, fB2, (jVar3 == null || (kVarC3 = jVar3.c()) == null) ? 0.0f : C0392f0.f7477a.b(kVarC3.b()), this.f1495l);
            }
        }
        List list = this.f1494k;
        if (list != null && list != null && (!list.isEmpty())) {
            this.f1495l.setShader(c());
            R1.j jVar4 = this.f1489f;
            if (jVar4 == null || !jVar4.f() || (eVar = this.f1485b) == null || !eVar.c()) {
                R1.e eVar4 = this.f1485b;
                if (eVar4 == null || !eVar4.c()) {
                    canvas.drawRect(this.f1492i, this.f1495l);
                } else {
                    Path path2 = this.f1493j;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path2, this.f1495l);
                }
            } else {
                RectF rectF2 = this.f1492i;
                R1.j jVar5 = this.f1489f;
                float fB3 = (jVar5 == null || (kVarC2 = jVar5.c()) == null) ? 0.0f : C0392f0.f7477a.b(kVarC2.a());
                R1.j jVar6 = this.f1489f;
                if (jVar6 != null && (kVarC = jVar6.c()) != null) {
                    fB = C0392f0.f7477a.b(kVarC.b());
                }
                canvas.drawRoundRect(rectF2, fB3, fB, this.f1495l);
            }
            this.f1495l.setShader(null);
        }
        canvas.restore();
    }

    public final void e(List list) {
        if (D2.h.b(this.f1494k, list)) {
            return;
        }
        this.f1494k = list;
        invalidateSelf();
    }

    public final void f(R1.c cVar) {
        this.f1486c = cVar;
    }

    public final void g(R1.e eVar) {
        this.f1485b = eVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f1495l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f1490g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        D2.h.f(rect, "bounds");
        super.onBoundsChange(rect);
        this.f1490g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f1495l.setAlpha(F2.a.c((i3 / 255.0f) * (Color.alpha(this.f1491h) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public a(Context context, R1.e eVar, R1.c cVar) {
        D2.h.f(context, "context");
        this.f1484a = context;
        this.f1485b = eVar;
        this.f1486c = cVar;
        this.f1487d = 0.8f;
        this.f1490g = true;
        this.f1492i = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f1491h);
        this.f1495l = paint;
    }
}
