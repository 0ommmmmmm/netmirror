package com.facebook.react.views.image;

import J0.EnumC0180n;
import O0.l;
import R1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p077t0.RunnableC0495b;
import p077t0.r;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p093x0.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f7682C = new a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Matrix f7683D = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f7684A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private com.facebook.react.views.image.c f7685B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p065q0.b f7686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f7687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f7688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private X1.a f7689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private X1.a f7690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f7691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f7692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r f7694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Shader.TileMode f7695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f7697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private T0.a f7698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g f7699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p065q0.d f7700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7702y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ReadableMap f7703z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p081u0.a b(Context context) {
            p081u0.b bVar = new p081u0.b(context.getResources());
            p081u0.e eVarA = p081u0.e.a(0.0f);
            eVarA.s(true);
            p081u0.a aVarA = bVar.J(eVarA).a();
            D2.h.e(aVarA, "build(...)");
            return aVarA;
        }

        private a() {
        }
    }

    private final class b extends U0.a {
        public b() {
        }

        @Override // U0.a, U0.d
        public p005b0.a a(Bitmap bitmap, G0.b bVar) {
            D2.h.f(bitmap, "source");
            D2.h.f(bVar, "bitmapFactory");
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f7694q.a(h.f7683D, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, h.this.f7695r, h.this.f7695r);
            bitmapShader.setLocalMatrix(h.f7683D);
            paint.setShader(bitmapShader);
            p005b0.a aVarA = bVar.a(h.this.getWidth(), h.this.getHeight());
            D2.h.e(aVarA, "createBitmap(...)");
            try {
                new Canvas((Bitmap) aVarA.P()).drawRect(rect, paint);
                p005b0.a aVarClone = aVarA.clone();
                D2.h.e(aVarClone, "clone(...)");
                return aVarClone;
            } finally {
                p005b0.a.D(aVarA);
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7706b;

        static {
            int[] iArr = new int[E1.a.values().length];
            try {
                iArr[E1.a.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7705a = iArr;
            int[] iArr2 = new int[com.facebook.react.views.image.c.values().length];
            try {
                iArr2[com.facebook.react.views.image.c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.facebook.react.views.image.c.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f7706b = iArr2;
        }
    }

    public static final class d extends g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f7707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f7708h;

        d(EventDispatcher eventDispatcher, h hVar) {
            this.f7707g = eventDispatcher;
            this.f7708h = hVar;
        }

        @Override // com.facebook.react.views.image.g, p065q0.d
        public void j(String str, Object obj) {
            D2.h.f(str, "id");
            EventDispatcher eventDispatcher = this.f7707g;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.b(com.facebook.react.views.image.b.f7664o.d(H0.f(this.f7708h), this.f7708h.getId()));
        }

        @Override // com.facebook.react.views.image.g, p065q0.d
        public void r(String str, Throwable th) {
            D2.h.f(str, "id");
            D2.h.f(th, "throwable");
            EventDispatcher eventDispatcher = this.f7707g;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.b(com.facebook.react.views.image.b.f7664o.a(H0.f(this.f7708h), this.f7708h.getId(), th));
        }

        @Override // com.facebook.react.views.image.g
        public void x(int i3, int i4) {
            if (this.f7707g == null || this.f7708h.getImageSource$ReactAndroid_release() == null) {
                return;
            }
            EventDispatcher eventDispatcher = this.f7707g;
            com.facebook.react.views.image.b.a aVar = com.facebook.react.views.image.b.f7664o;
            int iF = H0.f(this.f7708h);
            int id = this.f7708h.getId();
            X1.a imageSource$ReactAndroid_release = this.f7708h.getImageSource$ReactAndroid_release();
            eventDispatcher.b(aVar.e(iF, id, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.e() : null, i3, i4));
        }

        @Override // com.facebook.react.views.image.g, p065q0.d
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void k(String str, l lVar, Animatable animatable) {
            EventDispatcher eventDispatcher;
            D2.h.f(str, "id");
            if (lVar == null || this.f7708h.getImageSource$ReactAndroid_release() == null || (eventDispatcher = this.f7707g) == null) {
                return;
            }
            com.facebook.react.views.image.b.a aVar = com.facebook.react.views.image.b.f7664o;
            int iF = H0.f(this.f7708h);
            int id = this.f7708h.getId();
            X1.a imageSource$ReactAndroid_release = this.f7708h.getImageSource$ReactAndroid_release();
            eventDispatcher.b(aVar.c(iF, id, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.e() : null, lVar.h(), lVar.d()));
            this.f7707g.b(aVar.b(H0.f(this.f7708h), this.f7708h.getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, p065q0.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, f7682C.b(context));
        D2.h.f(context, "context");
        D2.h.f(bVar, "draweeControllerBuilder");
        this.f7686i = bVar;
        this.f7687j = obj;
        this.f7688k = new ArrayList();
        this.f7694q = com.facebook.react.views.image.d.b();
        this.f7695r = com.facebook.react.views.image.d.a();
        this.f7701x = -1;
        this.f7684A = 1.0f;
        this.f7685B = com.facebook.react.views.image.c.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final I0.g getResizeOptions() {
        int iRound = Math.round(getWidth() * this.f7684A);
        int iRound2 = Math.round(getHeight() * this.f7684A);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new I0.g(iRound, iRound2, 0.0f, 0.0f, 12, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("default") == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final E1.a k(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L39
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L2b;
                case -934641255: goto L1f;
                case 706834161: goto L13;
                case 1544803905: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L33
        L13:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            E1.a r2 = E1.a.ONLY_IF_CACHED
            goto L3b
        L1f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L33
        L28:
            E1.a r2 = E1.a.RELOAD
            goto L3b
        L2b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
        L33:
            E1.a r2 = E1.a.DEFAULT
            goto L3b
        L36:
            E1.a r2 = E1.a.FORCE_CACHE
            goto L3b
        L39:
            E1.a r2 = E1.a.DEFAULT
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.h.k(java.lang.String):E1.a");
    }

    private final U0.b.c l(E1.a aVar) {
        return c.f7705a[aVar.ordinal()] == 1 ? U0.b.c.DISK_CACHE : U0.b.c.FULL_FETCH;
    }

    private final boolean m() {
        return this.f7688k.size() > 1;
    }

    private final boolean n() {
        return this.f7695r != Shader.TileMode.CLAMP;
    }

    private final void p(boolean z3) {
        X1.a aVar = this.f7689l;
        if (aVar == null) {
            return;
        }
        Uri uriF = aVar.f();
        E1.a aVarC = aVar.c();
        U0.b.c cVarL = l(aVarC);
        ArrayList arrayList = new ArrayList();
        T0.a aVar2 = this.f7698u;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        b bVar = this.f7697t;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        U0.d dVarA = e.f7679b.a(arrayList);
        I0.g resizeOptions = z3 ? getResizeOptions() : null;
        if (aVarC == E1.a.RELOAD) {
            p049m0.d.a().g(uriF);
        }
        U0.c cVarI = U0.c.x(uriF).J(dVarA).N(resizeOptions).y(true).K(this.f7702y).I(cVarL);
        com.facebook.react.views.image.c cVar = this.f7685B;
        com.facebook.react.views.image.c cVar2 = com.facebook.react.views.image.c.NONE;
        if (cVar == cVar2) {
            cVarI.E(EnumC0180n.NEVER);
        }
        E1.b.a aVar3 = E1.b.f202D;
        D2.h.c(cVarI);
        E1.b bVarB = aVar3.b(cVarI, this.f7703z, aVarC);
        p065q0.b bVar2 = this.f7686i;
        D2.h.d(bVar2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        bVar2.A();
        bVar2.E(bVarB).B(true).b(getController());
        Object obj = this.f7687j;
        if (obj != null) {
            D2.h.e(bVar2.C(obj), "setCallerContext(...)");
        }
        X1.a aVar4 = this.f7690m;
        if (aVar4 != null) {
            U0.c cVarK = U0.c.x(aVar4.f()).J(dVarA).N(resizeOptions).y(true).K(this.f7702y);
            if (this.f7685B == cVar2) {
                cVarK.E(EnumC0180n.NEVER);
            }
            D2.h.e(bVar2.F(cVarK.a()), "setLowResImageRequest(...)");
        }
        g gVar = this.f7699v;
        if (gVar == null || this.f7700w == null) {
            p065q0.d dVar = this.f7700w;
            if (dVar != null) {
                bVar2.D(dVar);
            } else if (gVar != null) {
                bVar2.D(gVar);
            }
        } else {
            p065q0.f fVar = new p065q0.f();
            fVar.c(this.f7699v);
            fVar.c(this.f7700w);
            bVar2.D(fVar);
        }
        if (this.f7699v != null) {
            ((p081u0.a) getHierarchy()).A(this.f7699v);
        }
        setController(bVar2.a());
        bVar2.A();
    }

    private final void q() {
        this.f7689l = null;
        if (this.f7688k.isEmpty()) {
            List list = this.f7688k;
            X1.a.C0045a c0045a = X1.a.f2747f;
            Context context = getContext();
            D2.h.e(context, "getContext(...)");
            list.add(c0045a.a(context));
        } else if (m()) {
            X1.b.a aVarA = X1.b.a(getWidth(), getHeight(), this.f7688k);
            this.f7689l = aVarA.f2754a;
            this.f7690m = aVarA.f2755b;
            return;
        }
        this.f7689l = (X1.a) this.f7688k.get(0);
    }

    private final boolean r(X1.a aVar) {
        int i3 = c.f7706b[this.f7685B.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
        } else if (!p021f0.f.l(aVar.f()) && !p021f0.f.m(aVar.f())) {
            return false;
        }
        return true;
    }

    private final void s(String str) {
        if (!p026g1.a.f9424b || p070r1.b.c()) {
            return;
        }
        Context context = getContext();
        D2.h.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        T1.c.d((ReactContext) context, "ReactImageView: Image source \"" + str + "\" doesn't exist");
    }

    public final X1.a getImageSource$ReactAndroid_release() {
        return this.f7689l;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void o() {
        if (this.f7696s) {
            if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                q();
                X1.a aVar = this.f7689l;
                if (aVar == null) {
                    return;
                }
                boolean zR = r(aVar);
                if (!zR || (getWidth() > 0 && getHeight() > 0)) {
                    if (!n() || (getWidth() > 0 && getHeight() > 0)) {
                        p081u0.a aVar2 = (p081u0.a) getHierarchy();
                        aVar2.v(this.f7694q);
                        Drawable drawable = this.f7691n;
                        if (drawable != null) {
                            aVar2.y(drawable, this.f7694q);
                        }
                        Drawable drawable2 = this.f7692o;
                        if (drawable2 != null) {
                            aVar2.y(drawable2, r.f10775g);
                        }
                        p081u0.e eVarQ = aVar2.q();
                        if (eVarQ != null) {
                            int i3 = this.f7693p;
                            if (i3 != 0) {
                                eVarQ.q(i3);
                            } else {
                                eVarQ.u(u0.e.a.BITMAP_ONLY);
                            }
                            aVar2.B(eVarQ);
                        }
                        int i4 = this.f7701x;
                        if (i4 < 0) {
                            i4 = aVar.g() ? 0 : 300;
                        }
                        aVar2.x(i4);
                        p(zR);
                        this.f7696s = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        D2.h.f(canvas, "canvas");
        C0381a.a(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e4) {
            if (this.f7699v != null) {
                Context context = getContext();
                D2.h.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = H0.c((ReactContext) context, getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.b(com.facebook.react.views.image.b.f7664o.a(H0.f(this), getId(), e4));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        this.f7696s = this.f7696s || m() || n();
        o();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        C0381a.n(this, Integer.valueOf(i3));
    }

    public final void setBlurRadius(float f3) {
        int iB = ((int) C0392f0.f7477a.b(f3)) / 2;
        this.f7698u = iB == 0 ? null : new T0.a(2, iB);
        this.f7696s = true;
    }

    public final void setBorderColor(int i3) {
        C0381a.p(this, n.ALL, Integer.valueOf(i3));
    }

    public final void setBorderRadius(float f3) {
        C0381a.q(this, R1.d.BORDER_RADIUS, Float.isNaN(f3) ? null : new W(C0392f0.f7477a.d(f3), X.POINT));
    }

    public final void setBorderWidth(float f3) {
        C0381a.s(this, n.ALL, Float.valueOf(f3));
    }

    public final void setControllerListener(p065q0.d dVar) {
        this.f7700w = dVar;
        this.f7696s = true;
        o();
    }

    public final void setDefaultSource(String str) {
        X1.c cVarA = X1.c.f2756b.a();
        Context context = getContext();
        D2.h.e(context, "getContext(...)");
        Drawable drawableE = cVarA.e(context, str);
        if (D2.h.b(this.f7691n, drawableE)) {
            return;
        }
        this.f7691n = drawableE;
        this.f7696s = true;
    }

    public final void setFadeDuration(int i3) {
        this.f7701x = i3;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f7703z = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(X1.a aVar) {
        this.f7689l = aVar;
    }

    public final void setLoadingIndicatorSource(String str) {
        X1.c cVarA = X1.c.f2756b.a();
        Context context = getContext();
        D2.h.e(context, "getContext(...)");
        Drawable drawableE = cVarA.e(context, str);
        RunnableC0495b runnableC0495b = drawableE != null ? new RunnableC0495b(drawableE, 1000) : null;
        if (D2.h.b(this.f7692o, runnableC0495b)) {
            return;
        }
        this.f7692o = runnableC0495b;
        this.f7696s = true;
    }

    public final void setOverlayColor(int i3) {
        if (this.f7693p != i3) {
            this.f7693p = i3;
            this.f7696s = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z3) {
        this.f7702y = z3;
    }

    public final void setResizeMethod(com.facebook.react.views.image.c cVar) {
        D2.h.f(cVar, "resizeMethod");
        if (this.f7685B != cVar) {
            this.f7685B = cVar;
            this.f7696s = true;
        }
    }

    public final void setResizeMultiplier(float f3) {
        if (Math.abs(this.f7684A - f3) > 9.999999747378752E-5d) {
            this.f7684A = f3;
            this.f7696s = true;
        }
    }

    public final void setScaleType(r rVar) {
        D2.h.f(rVar, "scaleType");
        if (this.f7694q != rVar) {
            this.f7694q = rVar;
            this.f7696s = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z3) {
        if (z3 == (this.f7699v != null)) {
            return;
        }
        if (z3) {
            Context context = getContext();
            D2.h.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f7699v = new d(H0.c((ReactContext) context, getId()), this);
        } else {
            this.f7699v = null;
        }
        this.f7696s = true;
    }

    public final void setSource(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null || readableArray.size() == 0) {
            X1.a.C0045a c0045a = X1.a.f2747f;
            Context context = getContext();
            D2.h.e(context, "getContext(...)");
            arrayList.add(c0045a.a(context));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                E1.a aVarK = k(map.getString("cache"));
                Context context2 = getContext();
                D2.h.e(context2, "getContext(...)");
                X1.a aVar = new X1.a(context2, map.getString("uri"), 0.0d, 0.0d, aVarK, 12, null);
                if (D2.h.b(Uri.EMPTY, aVar.f())) {
                    s(map.getString("uri"));
                    X1.a.C0045a c0045a2 = X1.a.f2747f;
                    Context context3 = getContext();
                    D2.h.e(context3, "getContext(...)");
                    aVar = c0045a2.a(context3);
                }
                arrayList.add(aVar);
            } else {
                int size = readableArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ReadableMap map2 = readableArray.getMap(i3);
                    if (map2 != null) {
                        E1.a aVarK2 = k(map2.getString("cache"));
                        Context context4 = getContext();
                        D2.h.e(context4, "getContext(...)");
                        X1.a aVar2 = new X1.a(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), aVarK2);
                        if (D2.h.b(Uri.EMPTY, aVar2.f())) {
                            s(map2.getString("uri"));
                            X1.a.C0045a c0045a3 = X1.a.f2747f;
                            Context context5 = getContext();
                            D2.h.e(context5, "getContext(...)");
                            aVar2 = c0045a3.a(context5);
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (D2.h.b(this.f7688k, arrayList)) {
            return;
        }
        this.f7688k.clear();
        this.f7688k.addAll(arrayList);
        this.f7696s = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        D2.h.f(tileMode, "tileMode");
        if (this.f7695r != tileMode) {
            this.f7695r = tileMode;
            this.f7697t = n() ? new b() : null;
            this.f7696s = true;
        }
    }
}
