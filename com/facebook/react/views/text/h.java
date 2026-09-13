package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0386c0;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.InterfaceC0414q0;
import com.facebook.react.uimanager.M0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h extends c {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final TextPaint f7970f0 = new TextPaint(1);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Spannable f7971b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f7972c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final com.facebook.yoga.o f7973d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final com.facebook.yoga.b f7974e0;

    class a implements com.facebook.yoga.o {
        a() {
        }

        /* JADX WARN: Code duplicated, block: B:58:0x016a  */
        @Override // com.facebook.yoga.o
        public long K(com.facebook.yoga.r rVar, float f3, com.facebook.yoga.p pVar, float f4, com.facebook.yoga.p pVar2) {
            float lineBottom;
            float fCeil = f3;
            Spannable spannable = (Spannable) p002a1.a.d(h.this.f7971b0, "Spannable element has not been prepared in onBeforeLayout");
            Layout layoutE1 = h.this.E1(spannable, fCeil, pVar);
            h hVar = h.this;
            int i3 = -1;
            int i4 = 0;
            int i5 = 1;
            if (hVar.f7939T) {
                int iC = hVar.f7920A.c();
                int iC2 = h.this.f7920A.c();
                float f5 = iC;
                int iMax = (int) Math.max(h.this.f7940U * f5, C0392f0.h(4.0f));
                while (iC2 > iMax && ((h.this.f7927H != i3 && layoutE1.getLineCount() > h.this.f7927H) || (pVar2 != com.facebook.yoga.p.UNDEFINED && layoutE1.getHeight() > f4))) {
                    iC2 -= Math.max(i5, (int) C0392f0.h(1.0f));
                    float f6 = iC2 / f5;
                    Z1.d[] dVarArr = (Z1.d[]) spannable.getSpans(i4, spannable.length(), Z1.d.class);
                    int length = dVarArr.length;
                    int i6 = i4;
                    while (i6 < length) {
                        Z1.d dVar = dVarArr[i6];
                        spannable.setSpan(new Z1.d((int) Math.max(dVar.getSize() * f6, iMax)), spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar), spannable.getSpanFlags(dVar));
                        spannable.removeSpan(dVar);
                        i6++;
                        f6 = f6;
                    }
                    layoutE1 = h.this.E1(spannable, fCeil, pVar);
                    i3 = -1;
                    i4 = 0;
                    i5 = 1;
                }
            }
            if (h.this.f7972c0) {
                B0 b0L = h.this.l();
                WritableArray writableArrayA = com.facebook.react.views.text.b.a(spannable, layoutE1, h.f7970f0, b0L);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("lines", writableArrayA);
                if (b0L.hasActiveReactInstance()) {
                    ((RCTEventEmitter) b0L.getJSModule(RCTEventEmitter.class)).receiveEvent(h.this.H(), "topTextLayout", writableMapCreateMap);
                } else {
                    ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                }
            }
            int i7 = h.this.f7927H;
            int lineCount = i7 == -1 ? layoutE1.getLineCount() : Math.min(i7, layoutE1.getLineCount());
            if (pVar != com.facebook.yoga.p.EXACTLY) {
                float f7 = 0.0f;
                for (int i8 = 0; i8 < lineCount; i8++) {
                    float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutE1.getLineEnd(i8) - 1) != '\n') ? layoutE1.getLineWidth(i8) : layoutE1.getLineMax(i8);
                    if (lineWidth > f7) {
                        f7 = lineWidth;
                    }
                }
                if (pVar != com.facebook.yoga.p.AT_MOST || f7 <= fCeil) {
                    fCeil = f7;
                }
            }
            if (Build.VERSION.SDK_INT > 29) {
                fCeil = (float) Math.ceil(fCeil);
            }
            if (pVar2 != com.facebook.yoga.p.EXACTLY) {
                lineBottom = layoutE1.getLineBottom(lineCount - 1);
                if (pVar2 == com.facebook.yoga.p.AT_MOST && lineBottom > f4) {
                    lineBottom = f4;
                }
            } else {
                lineBottom = f4;
            }
            return com.facebook.yoga.q.a(fCeil, lineBottom);
        }
    }

    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(com.facebook.yoga.r rVar, float f3, float f4) {
            Layout layoutE1 = h.this.E1((Spannable) p002a1.a.d(h.this.f7971b0, "Spannable element has not been prepared in onBeforeLayout"), f3, com.facebook.yoga.p.EXACTLY);
            return layoutE1.getLineBaseline(layoutE1.getLineCount() - 1);
        }
    }

    public h() {
        this(null);
    }

    private int C1() {
        int i3 = this.f7928I;
        if (getLayoutDirection() != com.facebook.yoga.h.RTL) {
            return i3;
        }
        if (i3 == 5) {
            return 3;
        }
        if (i3 == 3) {
            return 5;
        }
        return i3;
    }

    private void D1() {
        if (R()) {
            return;
        }
        Y0(this.f7973d0);
        G0(this.f7974e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout E1(Spannable spannable, float f3, com.facebook.yoga.p pVar) {
        TextPaint textPaint = f7970f0;
        textPaint.setTextSize(this.f7920A.c());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z3 = pVar == com.facebook.yoga.p.UNDEFINED || f3 < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int iC1 = C1();
        if (iC1 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (iC1 != 3 && iC1 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (metricsIsBoring == null && (z3 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f3))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f7938S).setBreakStrategy(this.f7929J).setHyphenationFrequency(this.f7930K);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                hyphenationFrequency.setJustificationMode(this.f7931L);
            }
            if (i3 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (metricsIsBoring != null && (z3 || metricsIsBoring.width <= f3)) {
            return BoringLayout.make(spannable, textPaint, Math.max(metricsIsBoring.width, 0), alignment2, 1.0f, 0.0f, metricsIsBoring, this.f7938S);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 29) {
            f3 = (float) Math.ceil(f3);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f3).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f7938S).setBreakStrategy(this.f7929J).setHyphenationFrequency(this.f7930K);
        if (i4 >= 26) {
            hyphenationFrequency2.setJustificationMode(this.f7931L);
        }
        if (i4 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public void A0(M0 m3) {
        super.A0(m3);
        if (this.f7971b0 != null) {
            m3.O(H(), new i(this.f7971b0, -1, this.f7945Z, l0(4), l0(1), l0(5), l0(3), C1(), this.f7929J, this.f7931L));
        }
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public Iterable E() {
        Map map = this.f7946a0;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) p002a1.a.d(this.f7971b0, "Spannable element has not been prepared in onBeforeLayout");
        Z1.q[] qVarArr = (Z1.q[]) spanned.getSpans(0, spanned.length(), Z1.q.class);
        ArrayList arrayList = new ArrayList(qVarArr.length);
        for (Z1.q qVar : qVarArr) {
            InterfaceC0414q0 interfaceC0414q0 = (InterfaceC0414q0) this.f7946a0.get(Integer.valueOf(qVar.b()));
            interfaceC0414q0.M();
            arrayList.add(interfaceC0414q0);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public void O(C0386c0 c0386c0) {
        this.f7971b0 = x1(this, null, true, c0386c0);
        y0();
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public boolean p0() {
        return true;
    }

    @L1.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z3) {
        this.f7972c0 = z3;
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public boolean v0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.C0415r0
    public void y0() {
        super.y0();
        super.i();
    }

    public h(o oVar) {
        super(oVar);
        this.f7973d0 = new a();
        this.f7974e0 = new b();
        D1();
    }
}
