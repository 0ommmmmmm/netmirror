package O1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0431z0;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.W;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Context f1525B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0431z0 f1527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0431z0 f1528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0431z0 f1529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private R1.f f1530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f1531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f1532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f1533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f1534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f1535i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f1537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f1538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f1539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f1540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RectF f1541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PointF f1542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PointF f1543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PointF f1544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PointF f1545s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f1536j = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1546t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f1547u = new Paint(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1548v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f1549w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1550x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f1551y = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private R1.e f1552z = new R1.e();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private R1.j f1524A = new R1.j();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f1526C = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1553a;

        static {
            int[] iArr = new int[R1.f.values().length];
            f1553a = iArr;
            try {
                iArr[R1.f.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1553a[R1.f.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1553a[R1.f.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context) {
        this.f1525B = context;
    }

    private void D() {
        if (this.f1546t) {
            this.f1546t = false;
            if (this.f1531e == null) {
                this.f1531e = new Path();
            }
            if (this.f1532f == null) {
                this.f1532f = new Path();
            }
            if (this.f1533g == null) {
                this.f1533g = new Path();
            }
            if (this.f1534h == null) {
                this.f1534h = new Path();
            }
            if (this.f1537k == null) {
                this.f1537k = new Path();
            }
            if (this.f1538l == null) {
                this.f1538l = new RectF();
            }
            if (this.f1539m == null) {
                this.f1539m = new RectF();
            }
            if (this.f1540n == null) {
                this.f1540n = new RectF();
            }
            if (this.f1541o == null) {
                this.f1541o = new RectF();
            }
            this.f1531e.reset();
            this.f1532f.reset();
            this.f1533g.reset();
            this.f1534h.reset();
            this.f1537k.reset();
            this.f1538l.set(getBounds());
            this.f1539m.set(getBounds());
            this.f1540n.set(getBounds());
            this.f1541o.set(getBounds());
            RectF rectFL = l();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(8);
            int iG6 = g(9);
            int iG7 = g(11);
            int iG8 = g(10);
            if (t(9)) {
                iG2 = iG6;
                iG4 = iG2;
            }
            if (!t(10)) {
                iG8 = iG4;
            }
            if (!t(11)) {
                iG7 = iG2;
            }
            if (Color.alpha(iG) != 0 || Color.alpha(iG7) != 0 || Color.alpha(iG3) != 0 || Color.alpha(iG8) != 0 || Color.alpha(iG5) != 0) {
                RectF rectF = this.f1538l;
                rectF.top += rectFL.top;
                rectF.bottom -= rectFL.bottom;
                rectF.left += rectFL.left;
                rectF.right -= rectFL.right;
            }
            RectF rectF2 = this.f1541o;
            rectF2.top += rectFL.top * 0.5f;
            rectF2.bottom -= rectFL.bottom * 0.5f;
            rectF2.left += rectFL.left * 0.5f;
            rectF2.right -= rectFL.right * 0.5f;
            R1.j jVarD = this.f1552z.d(getLayoutDirection(), this.f1525B, C0392f0.f(this.f1539m.width()), C0392f0.f(this.f1539m.height()));
            this.f1524A = jVarD;
            R1.k kVarC = jVarD.c().c();
            R1.k kVarC2 = this.f1524A.d().c();
            R1.k kVarC3 = this.f1524A.a().c();
            R1.k kVarC4 = this.f1524A.b().c();
            float fO = o(kVarC.a(), rectFL.left);
            float fO2 = o(kVarC.b(), rectFL.top);
            float fO3 = o(kVarC2.a(), rectFL.right);
            float fO4 = o(kVarC2.b(), rectFL.top);
            float fO5 = o(kVarC4.a(), rectFL.right);
            float fO6 = o(kVarC4.b(), rectFL.bottom);
            float fO7 = o(kVarC3.a(), rectFL.left);
            float fO8 = o(kVarC3.b(), rectFL.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.f1531e.addRoundRect(this.f1538l, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f1532f.addRoundRect(rectFL.left > 0.0f ? this.f1538l.left - 0.8f : this.f1538l.left, rectFL.top > 0.0f ? this.f1538l.top - 0.8f : this.f1538l.top, rectFL.right > 0.0f ? this.f1538l.right + 0.8f : this.f1538l.right, rectFL.bottom > 0.0f ? this.f1538l.bottom + 0.8f : this.f1538l.bottom, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f1533g.addRoundRect(this.f1539m, new float[]{kVarC.a(), kVarC.b(), kVarC2.a(), kVarC2.b(), kVarC4.a(), kVarC4.b(), kVarC3.a(), kVarC3.b()}, direction);
            C0431z0 c0431z0 = this.f1527a;
            float fA = c0431z0 != null ? c0431z0.a(8) / 2.0f : 0.0f;
            this.f1534h.addRoundRect(this.f1540n, new float[]{kVarC.a() + fA, kVarC.b() + fA, kVarC2.a() + fA, kVarC2.b() + fA, kVarC4.a() + fA, kVarC4.b() + fA, kVarC3.a() + fA, kVarC3.b() + fA}, direction);
            this.f1537k.addRoundRect(this.f1541o, new float[]{kVarC.a() - (rectFL.left * 0.5f), kVarC.b() - (rectFL.top * 0.5f), kVarC2.a() - (rectFL.right * 0.5f), kVarC2.b() - (rectFL.top * 0.5f), kVarC4.a() - (rectFL.right * 0.5f), kVarC4.b() - (rectFL.bottom * 0.5f), kVarC3.a() - (rectFL.left * 0.5f), kVarC3.b() - (rectFL.bottom * 0.5f)}, direction);
            if (this.f1542p == null) {
                this.f1542p = new PointF();
            }
            PointF pointF = this.f1542p;
            RectF rectF3 = this.f1538l;
            float f3 = rectF3.left;
            pointF.x = f3;
            float f4 = rectF3.top;
            pointF.y = f4;
            RectF rectF4 = this.f1539m;
            m(f3, f4, (fO * 2.0f) + f3, (fO2 * 2.0f) + f4, rectF4.left, rectF4.top, f3, f4, pointF);
            if (this.f1545s == null) {
                this.f1545s = new PointF();
            }
            PointF pointF2 = this.f1545s;
            RectF rectF5 = this.f1538l;
            float f5 = rectF5.left;
            pointF2.x = f5;
            float f6 = rectF5.bottom;
            pointF2.y = f6;
            RectF rectF6 = this.f1539m;
            m(f5, f6 - (fO8 * 2.0f), (fO7 * 2.0f) + f5, f6, rectF6.left, rectF6.bottom, f5, f6, pointF2);
            if (this.f1543q == null) {
                this.f1543q = new PointF();
            }
            PointF pointF3 = this.f1543q;
            RectF rectF7 = this.f1538l;
            float f7 = rectF7.right;
            pointF3.x = f7;
            float f8 = rectF7.top;
            pointF3.y = f8;
            RectF rectF8 = this.f1539m;
            m(f7 - (fO3 * 2.0f), f8, f7, (fO4 * 2.0f) + f8, rectF8.right, rectF8.top, f7, f8, pointF3);
            if (this.f1544r == null) {
                this.f1544r = new PointF();
            }
            PointF pointF4 = this.f1544r;
            RectF rectF9 = this.f1538l;
            float f9 = rectF9.right;
            pointF4.x = f9;
            float f10 = rectF9.bottom;
            pointF4.y = f10;
            RectF rectF10 = this.f1539m;
            m(f9 - (fO5 * 2.0f), f10 - (fO6 * 2.0f), f9, f10, rectF10.right, rectF10.bottom, f9, f10, pointF4);
        }
    }

    private void E() {
        R1.f fVar = this.f1530d;
        this.f1547u.setPathEffect(fVar != null ? r(fVar, n()) : null);
    }

    private void F(int i3) {
        R1.f fVar = this.f1530d;
        this.f1547u.setPathEffect(fVar != null ? r(fVar, i3) : null);
    }

    private static int a(float f3, float f4) {
        return ((((int) f3) << 24) & (-16777216)) | (((int) f4) & 16777215);
    }

    private void b(Canvas canvas, int i3, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        if (i3 == 0) {
            return;
        }
        if (this.f1535i == null) {
            this.f1535i = new Path();
        }
        this.f1547u.setColor(i3);
        this.f1535i.reset();
        this.f1535i.moveTo(f3, f4);
        this.f1535i.lineTo(f5, f6);
        this.f1535i.lineTo(f7, f8);
        this.f1535i.lineTo(f9, f10);
        this.f1535i.lineTo(f3, f4);
        canvas.drawPath(this.f1535i, this.f1547u);
    }

    private void c(Canvas canvas) {
        int i3;
        int i4;
        this.f1547u.setStyle(Paint.Style.FILL);
        int iU = u(this.f1548v, this.f1550x);
        if (Color.alpha(iU) != 0) {
            this.f1547u.setColor(iU);
            canvas.drawRect(getBounds(), this.f1547u);
        }
        List list = this.f1549w;
        if (list != null && !list.isEmpty()) {
            this.f1547u.setShader(f());
            canvas.drawRect(getBounds(), this.f1547u);
            this.f1547u.setShader(null);
        }
        RectF rectFL = l();
        int iRound = Math.round(rectFL.left);
        int iRound2 = Math.round(rectFL.top);
        int iRound3 = Math.round(rectFL.right);
        int iRound4 = Math.round(rectFL.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(9);
            int iG6 = g(11);
            int iG7 = g(10);
            if (t(9)) {
                iG2 = iG5;
                iG4 = iG2;
            }
            if (!t(10)) {
                iG7 = iG4;
            }
            if (!t(11)) {
                iG6 = iG2;
            }
            boolean z3 = getLayoutDirection() == 1;
            int iG8 = g(4);
            int iG9 = g(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f1525B)) {
                if (t(4)) {
                    iG = iG8;
                }
                if (t(5)) {
                    iG3 = iG9;
                }
                int i5 = z3 ? iG3 : iG;
                if (!z3) {
                    iG = iG3;
                }
                i4 = iG;
                i3 = i5;
            } else {
                int i6 = z3 ? iG9 : iG8;
                if (!z3) {
                    iG8 = iG9;
                }
                boolean zT = t(4);
                boolean zT2 = t(5);
                boolean z4 = z3 ? zT2 : zT;
                if (!z3) {
                    zT = zT2;
                }
                if (z4) {
                    iG = i6;
                }
                i3 = iG;
                i4 = zT ? iG8 : iG3;
            }
            int i7 = bounds.left;
            int i8 = bounds.top;
            int i9 = i3;
            int iE = e(iRound, iRound2, iRound3, iRound4, i3, iG6, i4, iG7);
            if (iE == 0) {
                this.f1547u.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iRound > 0) {
                    float f3 = i7;
                    float f4 = i8;
                    float f5 = i7 + iRound;
                    float f6 = i8 + iRound2;
                    int i10 = i8 + iHeight;
                    b(canvas, i9, f3, f4, f5, f6, f5, i10 - iRound4, f3, i10);
                }
                if (iRound2 > 0) {
                    float f7 = i7;
                    float f8 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0236: MOVE (r10v8 'f8' float) = (r10v5 int) A[DECLARE_VAR] in method: O1.e.c(android.graphics.Canvas):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v5 int
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 655
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: O1.e.c(android.graphics.Canvas):void");
                }

                private void d(Canvas canvas) {
                    int i3;
                    int i4;
                    PointF pointF;
                    D();
                    canvas.save();
                    int i5 = this.f1548v;
                    int iG = androidx.core.graphics.a.g(i5, (Color.alpha(i5) * this.f1550x) >> 8);
                    if (Color.alpha(iG) != 0) {
                        this.f1547u.setColor(iG);
                        this.f1547u.setStyle(Paint.Style.FILL);
                        canvas.drawPath((Path) p064q.g.g(this.f1532f), this.f1547u);
                    }
                    List list = this.f1549w;
                    if (list != null && !list.isEmpty()) {
                        this.f1547u.setShader(f());
                        this.f1547u.setStyle(Paint.Style.FILL);
                        canvas.drawPath((Path) p064q.g.g(this.f1532f), this.f1547u);
                        this.f1547u.setShader(null);
                    }
                    RectF rectFL = l();
                    int iG2 = g(0);
                    int iG3 = g(1);
                    int iG4 = g(2);
                    int iG5 = g(3);
                    int iG6 = g(9);
                    int iG7 = g(11);
                    int iG8 = g(10);
                    if (t(9)) {
                        iG3 = iG6;
                        iG5 = iG3;
                    }
                    if (!t(10)) {
                        iG8 = iG5;
                    }
                    int i6 = t(11) ? iG7 : iG3;
                    if (rectFL.top > 0.0f || rectFL.bottom > 0.0f || rectFL.left > 0.0f || rectFL.right > 0.0f) {
                        canvas.clipPath((Path) p064q.g.g(this.f1533g), Region.Op.INTERSECT);
                        float fN = n();
                        int iG9 = g(8);
                        if (rectFL.top != fN || rectFL.bottom != fN || rectFL.left != fN || rectFL.right != fN || iG2 != iG9 || i6 != iG9 || iG4 != iG9 || iG8 != iG9) {
                            this.f1547u.setStyle(Paint.Style.FILL);
                            canvas.clipPath((Path) p064q.g.g(this.f1531e), Region.Op.DIFFERENCE);
                            boolean z3 = getLayoutDirection() == 1;
                            int iG10 = g(4);
                            int iG11 = g(5);
                            if (com.facebook.react.modules.i18nmanager.a.f().d(this.f1525B)) {
                                if (t(4)) {
                                    iG2 = iG10;
                                }
                                if (t(5)) {
                                    iG4 = iG11;
                                }
                                i3 = z3 ? iG4 : iG2;
                                if (!z3) {
                                    iG2 = iG4;
                                }
                                i4 = iG2;
                            } else {
                                int i7 = z3 ? iG11 : iG10;
                                if (!z3) {
                                    iG10 = iG11;
                                }
                                boolean zT = t(4);
                                boolean zT2 = t(5);
                                boolean z4 = z3 ? zT2 : zT;
                                if (!z3) {
                                    zT = zT2;
                                }
                                if (z4) {
                                    iG2 = i7;
                                }
                                if (zT) {
                                    i3 = iG2;
                                    i4 = iG10;
                                } else {
                                    i3 = iG2;
                                    i4 = iG4;
                                }
                            }
                            RectF rectF = (RectF) p064q.g.g(this.f1539m);
                            float f3 = rectF.left;
                            float f4 = rectF.right;
                            float f5 = rectF.top;
                            float f6 = rectF.bottom;
                            PointF pointF2 = (PointF) p064q.g.g(this.f1542p);
                            PointF pointF3 = (PointF) p064q.g.g(this.f1543q);
                            PointF pointF4 = (PointF) p064q.g.g(this.f1545s);
                            PointF pointF5 = (PointF) p064q.g.g(this.f1544r);
                            if (rectFL.left > 0.0f) {
                                pointF = pointF4;
                                b(canvas, i3, f3, f5 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF4.x, pointF4.y + 0.8f, f3, f6 + 0.8f);
                            } else {
                                pointF = pointF4;
                            }
                            if (rectFL.top > 0.0f) {
                                b(canvas, i6, f3 - 0.8f, f5, pointF2.x - 0.8f, pointF2.y, pointF3.x + 0.8f, pointF3.y, f4 + 0.8f, f5);
                            }
                            if (rectFL.right > 0.0f) {
                                b(canvas, i4, f4, f5 - 0.8f, pointF3.x, pointF3.y - 0.8f, pointF5.x, pointF5.y + 0.8f, f4, f6 + 0.8f);
                            }
                            if (rectFL.bottom > 0.0f) {
                                PointF pointF6 = pointF;
                                b(canvas, iG8, f3 - 0.8f, f6, pointF6.x - 0.8f, pointF6.y, pointF5.x + 0.8f, pointF5.y, f4 + 0.8f, f6);
                            }
                        } else if (fN > 0.0f) {
                            this.f1547u.setColor(u(iG9, this.f1550x));
                            this.f1547u.setStyle(Paint.Style.STROKE);
                            this.f1547u.setStrokeWidth(fN);
                            canvas.drawPath((Path) p064q.g.g(this.f1537k), this.f1547u);
                        }
                    }
                    canvas.restore();
                }

                private static int e(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    int i11 = (i6 > 0 ? i10 : -1) & (i3 > 0 ? i7 : -1) & (i4 > 0 ? i8 : -1) & (i5 > 0 ? i9 : -1);
                    if (i3 <= 0) {
                        i7 = 0;
                    }
                    if (i4 <= 0) {
                        i8 = 0;
                    }
                    int i12 = i7 | i8;
                    if (i5 <= 0) {
                        i9 = 0;
                    }
                    int i13 = i12 | i9;
                    if (i6 <= 0) {
                        i10 = 0;
                    }
                    if (i11 == (i13 | i10)) {
                        return i11;
                    }
                    return 0;
                }

                private Shader f() {
                    List list = this.f1549w;
                    Shader composeShader = null;
                    if (list == null) {
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Shader shaderA = ((R1.a) it.next()).a(getBounds());
                        if (shaderA != null) {
                            composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
                        }
                    }
                    return composeShader;
                }

                private static void m(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, PointF pointF) {
                    double d12 = (d4 + d6) / 2.0d;
                    double d13 = (d5 + d7) / 2.0d;
                    double d14 = d8 - d12;
                    double d15 = d9 - d13;
                    double dAbs = Math.abs(d6 - d4) / 2.0d;
                    double dAbs2 = Math.abs(d7 - d5) / 2.0d;
                    double d16 = ((d11 - d13) - d15) / ((d10 - d12) - d14);
                    double d17 = d15 - (d14 * d16);
                    double d18 = dAbs2 * dAbs2;
                    double d19 = dAbs * dAbs;
                    double d20 = d18 + (d19 * d16 * d16);
                    double d21 = dAbs * 2.0d * dAbs * d17 * d16;
                    double d22 = (-(d19 * ((d17 * d17) - d18))) / d20;
                    double d23 = d20 * 2.0d;
                    double dSqrt = ((-d21) / d23) - Math.sqrt(d22 + Math.pow(d21 / d23, 2.0d));
                    double d24 = (d16 * dSqrt) + d17;
                    double d25 = dSqrt + d12;
                    double d26 = d24 + d13;
                    if (Double.isNaN(d25) || Double.isNaN(d26)) {
                        return;
                    }
                    pointF.x = (float) d25;
                    pointF.y = (float) d26;
                }

                private static PathEffect r(R1.f fVar, float f3) {
                    int i3 = a.f1553a[fVar.ordinal()];
                    if (i3 == 2) {
                        float f4 = f3 * 3.0f;
                        return new DashPathEffect(new float[]{f4, f4, f4, f4}, 0.0f);
                    }
                    if (i3 != 3) {
                        return null;
                    }
                    return new DashPathEffect(new float[]{f3, f3, f3, f3}, 0.0f);
                }

                private boolean t(int i3) {
                    C0431z0 c0431z0 = this.f1528b;
                    float fA = c0431z0 != null ? c0431z0.a(i3) : Float.NaN;
                    C0431z0 c0431z1 = this.f1529c;
                    return (Float.isNaN(fA) || Float.isNaN(c0431z1 != null ? c0431z1.a(i3) : Float.NaN)) ? false : true;
                }

                private static int u(int i3, int i4) {
                    if (i4 == 255) {
                        return i3;
                    }
                    if (i4 == 0) {
                        return i3 & 16777215;
                    }
                    return (i3 & 16777215) | ((((i3 >>> 24) * (i4 + (i4 >> 7))) >> 8) << 24);
                }

                private void w(int i3, float f3) {
                    if (this.f1529c == null) {
                        this.f1529c = new C0431z0(255.0f);
                    }
                    if (L.a(this.f1529c.b(i3), f3)) {
                        return;
                    }
                    this.f1529c.c(i3, f3);
                    invalidateSelf();
                }

                private void y(int i3, float f3) {
                    if (this.f1528b == null) {
                        this.f1528b = new C0431z0(0.0f);
                    }
                    if (L.a(this.f1528b.b(i3), f3)) {
                        return;
                    }
                    this.f1528b.c(i3, f3);
                    invalidateSelf();
                }

                public void A(R1.f fVar) {
                    if (this.f1530d != fVar) {
                        this.f1530d = fVar;
                        this.f1546t = true;
                        invalidateSelf();
                    }
                }

                public void B(int i3, float f3) {
                    if (this.f1527a == null) {
                        this.f1527a = new C0431z0();
                    }
                    if (L.a(this.f1527a.b(i3), f3)) {
                        return;
                    }
                    this.f1527a.c(i3, f3);
                    if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8) {
                        this.f1546t = true;
                    }
                    invalidateSelf();
                }

                public void C(int i3) {
                    this.f1548v = i3;
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public void draw(Canvas canvas) {
                    E();
                    if (s()) {
                        d(canvas);
                    } else {
                        c(canvas);
                    }
                }

                public int g(int i3) {
                    C0431z0 c0431z0 = this.f1528b;
                    float fA = c0431z0 != null ? c0431z0.a(i3) : 0.0f;
                    C0431z0 c0431z1 = this.f1529c;
                    return a(c0431z1 != null ? c0431z1.a(i3) : 255.0f, fA);
                }

                @Override // android.graphics.drawable.Drawable
                public int getAlpha() {
                    return this.f1550x;
                }

                @Override // android.graphics.drawable.Drawable
                public int getLayoutDirection() {
                    int i3 = this.f1526C;
                    return i3 == -1 ? super.getLayoutDirection() : i3;
                }

                @Override // android.graphics.drawable.Drawable
                public int getOpacity() {
                    int iAlpha = (Color.alpha(this.f1548v) * this.f1550x) >> 8;
                    if (iAlpha != 0) {
                        return iAlpha != 255 ? -3 : -1;
                    }
                    return -2;
                }

                @Override // android.graphics.drawable.Drawable
                public void getOutline(Outline outline) {
                    if (!s()) {
                        outline.setRect(getBounds());
                    } else {
                        D();
                        outline.setConvexPath((Path) p064q.g.g(this.f1534h));
                    }
                }

                public R1.e h() {
                    return this.f1552z;
                }

                public Float i(int i3) {
                    C0431z0 c0431z0 = this.f1527a;
                    if (c0431z0 == null) {
                        return null;
                    }
                    float fB = c0431z0.b(i3);
                    if (Float.isNaN(fB)) {
                        return null;
                    }
                    return Float.valueOf(fB);
                }

                public float j(float f3, int i3) {
                    Float fI = i(i3);
                    return fI == null ? f3 : fI.floatValue();
                }

                public int k() {
                    return this.f1548v;
                }

                public RectF l() {
                    float fJ = j(0.0f, 8);
                    float fJ2 = j(fJ, 1);
                    float fJ3 = j(fJ, 3);
                    float fJ4 = j(fJ, 0);
                    float fJ5 = j(fJ, 2);
                    if (this.f1527a != null) {
                        boolean z3 = getLayoutDirection() == 1;
                        float fB = this.f1527a.b(4);
                        float fB2 = this.f1527a.b(5);
                        if (com.facebook.react.modules.i18nmanager.a.f().d(this.f1525B)) {
                            if (!Float.isNaN(fB)) {
                                fJ4 = fB;
                            }
                            if (!Float.isNaN(fB2)) {
                                fJ5 = fB2;
                            }
                            float f3 = z3 ? fJ5 : fJ4;
                            if (z3) {
                                fJ5 = fJ4;
                            }
                            fJ4 = f3;
                        } else {
                            float f4 = z3 ? fB2 : fB;
                            if (!z3) {
                                fB = fB2;
                            }
                            if (!Float.isNaN(f4)) {
                                fJ4 = f4;
                            }
                            if (!Float.isNaN(fB)) {
                                fJ5 = fB;
                            }
                        }
                    }
                    return new RectF(fJ4, fJ2, fJ5, fJ3);
                }

                public float n() {
                    C0431z0 c0431z0 = this.f1527a;
                    if (c0431z0 == null || Float.isNaN(c0431z0.b(8))) {
                        return 0.0f;
                    }
                    return this.f1527a.b(8);
                }

                public float o(float f3, float f4) {
                    return Math.max(f3 - f4, 0.0f);
                }

                @Override // android.graphics.drawable.Drawable
                protected void onBoundsChange(Rect rect) {
                    super.onBoundsChange(rect);
                    this.f1546t = true;
                }

                public Path p() {
                    if (!s()) {
                        return null;
                    }
                    D();
                    return new Path((Path) p064q.g.g(this.f1531e));
                }

                public RectF q() {
                    RectF rectFL = l();
                    return rectFL == null ? new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()) : new RectF(rectFL.left, rectFL.top, getBounds().width() - rectFL.right, getBounds().height() - rectFL.bottom);
                }

                public boolean s() {
                    return this.f1552z.c();
                }

                @Override // android.graphics.drawable.Drawable
                public void setAlpha(int i3) {
                    if (i3 != this.f1550x) {
                        this.f1550x = i3;
                        invalidateSelf();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public void setColorFilter(ColorFilter colorFilter) {
                }

                public void v(List list) {
                    this.f1549w = list;
                    invalidateSelf();
                }

                public void x(int i3, Integer num) {
                    float fIntValue = num == null ? Float.NaN : num.intValue() & 16777215;
                    float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
                    y(i3, fIntValue);
                    w(i3, fIntValue2);
                    this.f1546t = true;
                }

                public void z(R1.d dVar, W w3) {
                    if (Objects.equals(w3, this.f1552z.b(dVar))) {
                        return;
                    }
                    this.f1552z.e(dVar, w3);
                    this.f1546t = true;
                    invalidateSelf();
                }
            }
