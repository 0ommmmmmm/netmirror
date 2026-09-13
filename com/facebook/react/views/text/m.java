package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.e0;
import androidx.core.view.C0230a;
import androidx.core.view.Z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.InterfaceC0402k0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m extends D implements InterfaceC0402k0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f7988v = new ViewGroup.LayoutParams(0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextUtils.TruncateAt f7991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f7993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f7994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f7995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private R1.p f8000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Spannable f8001u;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public m(Context context) {
        super(context);
        this.f8000t = R1.p.VISIBLE;
        u();
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof e0 ? (ReactContext) ((e0) context).getBaseContext() : (ReactContext) context;
    }

    private void t() {
        if (!Float.isNaN(this.f7993m)) {
            setTextSize(0, this.f7993m);
        }
        if (Float.isNaN(this.f7995o)) {
            return;
        }
        super.setLetterSpacing(this.f7995o);
    }

    private void u() {
        this.f7990j = Integer.MAX_VALUE;
        this.f7992l = false;
        this.f7996p = 0;
        this.f7997q = false;
        this.f7998r = false;
        this.f7999s = false;
        this.f7991k = TextUtils.TruncateAt.END;
        this.f7993m = Float.NaN;
        this.f7994n = Float.NaN;
        this.f7995o = 0.0f;
        this.f8000t = R1.p.VISIBLE;
        this.f8001u = null;
    }

    private static WritableMap v(int i3, int i4, int i5, int i6, int i7, int i8) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i3 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i4);
        } else if (i3 == 0) {
            writableMapCreateMap.putString("visibility", "visible");
            writableMapCreateMap.putInt("index", i4);
            writableMapCreateMap.putDouble("left", C0392f0.f(i5));
            writableMapCreateMap.putDouble("top", C0392f0.f(i6));
            writableMapCreateMap.putDouble("right", C0392f0.f(i7));
            writableMapCreateMap.putDouble("bottom", C0392f0.f(i8));
        } else {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i4);
        }
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0402k0
    public int c(float f3, float f4) {
        int i3;
        CharSequence text = getText();
        int id = getId();
        int i4 = (int) f3;
        int i5 = (int) f4;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i5);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i4 >= lineLeft && i4 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i4);
                Z1.k[] kVarArr = (Z1.k[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, Z1.k.class);
                if (kVarArr != null) {
                    int length = text.length();
                    for (int i6 = 0; i6 < kVarArr.length; i6++) {
                        int spanStart = spanned.getSpanStart(kVarArr[i6]);
                        int spanEnd = spanned.getSpanEnd(kVarArr[i6]);
                        if (spanEnd >= offsetForHorizontal && (i3 = spanEnd - spanStart) <= length) {
                            id = kVarArr[i6].a();
                            length = i3;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e4) {
                Y.a.m("ReactNative", "Crash in HorizontalMeasurementProvider: " + e4.getMessage());
            }
        }
        return id;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (Z.C(this)) {
            C0230a c0230aI = Z.i(this);
            if (c0230aI instanceof p092x.a) {
                return ((p092x.a) c0230aI).v(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0230a c0230aI = Z.i(this);
        return (c0230aI != null && (c0230aI instanceof n) && ((n) c0230aI).w(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f8001u;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                if (pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f7998r);
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                pVar.c();
            }
        }
    }

    @Override // androidx.appcompat.widget.D, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                pVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        p066q1.c cVar = new p066q1.c("ReactTextView.onDraw");
        try {
            if (this.f7992l && getSpanned() != null && this.f7999s) {
                this.f7999s = false;
                Spannable spanned = getSpanned();
                float width = getWidth();
                com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
                t.a(spanned, width, pVar, getHeight(), pVar, this.f7994n, this.f7990j, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(getSpanned());
            }
            if (this.f8000t != R1.p.VISIBLE) {
                C0381a.a(this, canvas);
            }
            super.onDraw(canvas);
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                pVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        C0230a c0230aI = Z.i(this);
        if (c0230aI == null || !(c0230aI instanceof n)) {
            return;
        }
        ((n) c0230aI).G(z3, i3, rect);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Z1.q[] qVarArr;
        int i7;
        int i8;
        Spanned spanned;
        int lineRight;
        float lineWidth;
        int id = getId();
        if (!(getText() instanceof Spanned) || M1.a.a(id) == 2) {
            return;
        }
        UIManagerModule uIManagerModule = (UIManagerModule) p002a1.a.c((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
        Spanned spanned2 = (Spanned) getText();
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        Z1.q[] qVarArr2 = (Z1.q[]) spanned2.getSpans(0, spanned2.length(), Z1.q.class);
        ArrayList arrayList = this.f7997q ? new ArrayList(qVarArr2.length) : null;
        int i9 = i5 - i3;
        int i10 = i6 - i4;
        int length = qVarArr2.length;
        int i11 = 0;
        while (i11 < length) {
            Z1.q qVar = qVarArr2[i11];
            View viewResolveView = uIManagerModule.resolveView(qVar.b());
            int spanStart = spanned2.getSpanStart(qVar);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.f7990j && spanStart < layout.getLineEnd(lineForOffset)) {
                int iC = qVar.c();
                int iA = qVar.a();
                qVarArr = qVarArr2;
                boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                i7 = length;
                i8 = id;
                boolean z4 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart == spanned2.length() - 1) {
                    if (spanned2.length() > 0) {
                        spanned = spanned2;
                        if (spanned2.charAt(layout.getLineEnd(lineForOffset) - 1) == '\n') {
                            lineWidth = layout.getLineMax(lineForOffset);
                        }
                        if (z4) {
                            lineRight = i9 - ((int) lineWidth);
                        } else {
                            lineRight = (int) layout.getLineRight(lineForOffset);
                            lineRight -= iC;
                        }
                    } else {
                        spanned = spanned2;
                    }
                    lineWidth = layout.getLineWidth(lineForOffset);
                    if (z4) {
                        lineRight = i9 - ((int) lineWidth);
                    } else {
                        lineRight = (int) layout.getLineRight(lineForOffset);
                        lineRight -= iC;
                    }
                } else {
                    spanned = spanned2;
                    int primaryHorizontal = (int) (z4 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                    lineRight = z4 ? i9 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal) : primaryHorizontal;
                    if (zIsRtlCharAt) {
                        lineRight -= iC;
                    }
                }
                int totalPaddingRight = lineRight + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                int i12 = i3 + totalPaddingRight;
                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - iA;
                int i13 = i4 + totalPaddingTop;
                int i14 = (i9 <= totalPaddingRight || i10 <= totalPaddingTop) ? 8 : 0;
                int i15 = i12 + iC;
                int i16 = i13 + iA;
                viewResolveView.setVisibility(i14);
                viewResolveView.layout(i12, i13, i15, i16);
                if (this.f7997q) {
                    arrayList.add(v(i14, spanStart, i12, i13, i15, i16));
                }
            } else {
                i8 = id;
                spanned = spanned2;
                qVarArr = qVarArr2;
                i7 = length;
                viewResolveView.setVisibility(8);
                if (this.f7997q) {
                    arrayList.add(v(8, spanStart, -1, -1, -1, -1));
                }
            }
            i11++;
            length = i7;
            qVarArr2 = qVarArr;
            id = i8;
            spanned2 = spanned;
        }
        int i17 = id;
        if (this.f7997q) {
            Collections.sort(arrayList, new a());
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap((WritableMap) it.next());
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("inlineViews", writableArrayCreateArray);
            if (uIManagerModule != null) {
                uIManagerModule.receiveEvent(i17, "topInlineViewLayout", writableMapCreateMap);
            }
        }
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i3, int i4) {
        p066q1.c cVar = new p066q1.c("ReactTextView.onMeasure");
        try {
            super.onMeasure(i3, i4);
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                pVar.f();
            }
        }
    }

    public void setAdjustFontSizeToFit(boolean z3) {
        this.f7992l = z3;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        C0381a.n(this, Integer.valueOf(i3));
    }

    public void setBorderRadius(float f3) {
        x(f3, R1.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        C0381a.r(this, str == null ? null : R1.f.b(str));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i3) {
        super.setBreakStrategy(i3);
        this.f7999s = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f7991k = truncateAt;
    }

    public void setFontSize(float f3) {
        this.f7993m = (float) (this.f7992l ? Math.ceil(C0392f0.j(f3)) : Math.ceil(C0392f0.h(f3)));
        t();
    }

    void setGravityHorizontal(int i3) {
        if (i3 == 0) {
            i3 = 8388611;
        }
        setGravity(i3 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i3) {
        if (i3 == 0) {
            i3 = 48;
        }
        setGravity(i3 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i3) {
        super.setHyphenationFrequency(i3);
        this.f7999s = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z3) {
        super.setIncludeFontPadding(z3);
        this.f7999s = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        this.f7995o = C0392f0.h(f3) / this.f7993m;
        t();
    }

    public void setLinkifyMask(int i3) {
        this.f7996p = i3;
    }

    public void setMinimumFontSize(float f3) {
        this.f7994n = f3;
        this.f7999s = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z3) {
        this.f7997q = z3;
    }

    public void setNumberOfLines(int i3) {
        if (i3 == 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f7990j = i3;
        setMaxLines(i3);
        this.f7999s = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f8000t = R1.p.VISIBLE;
        } else {
            R1.p pVarB = R1.p.b(str);
            if (pVarB == null) {
                pVarB = R1.p.VISIBLE;
            }
            this.f8000t = pVarB;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.f8001u = spannable;
        this.f7999s = true;
    }

    public void setText(i iVar) {
        p066q1.c cVar = new p066q1.c("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.f7989i = iVar.b();
            if (getLayoutParams() == null) {
                setLayoutParams(f7988v);
            }
            Spannable spannableI = iVar.i();
            int i3 = this.f7996p;
            if (i3 > 0) {
                Linkify.addLinks(spannableI, i3);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(spannableI);
            float f3 = iVar.f();
            float fH = iVar.h();
            float fG = iVar.g();
            float fE = iVar.e();
            if (f3 != -1.0f && fH != -1.0f && fG != -1.0f && fE != -1.0f) {
                setPadding((int) Math.floor(f3), (int) Math.floor(fH), (int) Math.floor(fG), (int) Math.floor(fE));
            }
            int iJ = iVar.j();
            if (iJ != getGravityHorizontal()) {
                setGravityHorizontal(iJ);
            }
            if (getBreakStrategy() != iVar.k()) {
                setBreakStrategy(iVar.k());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.d()) {
                setJustificationMode(iVar.d());
            }
            requestLayout();
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z3) {
        this.f7998r = z3;
        super.setTextIsSelectable(z3);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f7989i && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (Z1.p pVar : (Z1.p[]) spanned.getSpans(0, spanned.length(), Z1.p.class)) {
                if (pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    void w() {
        u();
        C0381a.m(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f7988v);
        super.setText((CharSequence) null);
        t();
        setGravity(8388659);
        setNumberOfLines(this.f7990j);
        setAdjustFontSizeToFit(this.f7992l);
        setLinkifyMask(this.f7996p);
        setTextIsSelectable(this.f7998r);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f7991k);
        setEnabled(true);
        if (i3 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        y();
    }

    public void x(float f3, int i3) {
        C0381a.q(this, R1.d.values()[i3], Float.isNaN(f3) ? null : new W(C0392f0.f(f3), X.POINT));
    }

    public void y() {
        setEllipsize((this.f7990j == Integer.MAX_VALUE || this.f7992l) ? null : this.f7991k);
    }
}
