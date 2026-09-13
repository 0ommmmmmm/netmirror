package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C0216l;
import androidx.core.view.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0396h0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0441j extends C0216l {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final boolean f8104P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final KeyListener f8105Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private com.facebook.react.views.text.s f8106A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f8107B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f8108C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f8109D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f8110E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f8111F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f8112G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8113H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f8114I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private String f8115J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private R1.p f8116K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private A0 f8117L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected boolean f8118M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected boolean f8119N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EventDispatcher f8120O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InputMethodManager f8121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f8123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f8124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f8125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f8126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CopyOnWriteArrayList f8127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f8128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f8130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f8131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f8133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private K f8134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0432a f8135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private J f8136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f8137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8139z;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$a */
    class a extends C0396h0 {
        a(View view, boolean z3, int i3) {
            super(view, z3, i3);
        }

        @Override // com.facebook.react.uimanager.C0396h0, androidx.core.view.C0230a
        public boolean j(View view, int i3, Bundle bundle) {
            if (i3 != 16) {
                return super.j(view, i3, bundle);
            }
            int length = C0441j.this.getText().length();
            if (length > 0) {
                C0441j.this.setSelection(length);
            }
            return p070r1.b.o() ? C0441j.this.U() : C0441j.this.T();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$b */
    class b implements ActionMode.Callback {
        b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (C0441j.this.f8112G) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$c */
    private static class c implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8142a = 0;

        public void a(int i3) {
            this.f8142a = i3;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i3) {
            C0441j.f8105Q.clearMetaKeyState(view, editable, i3);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f8142a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
            return C0441j.f8105Q.onKeyDown(view, editable, i3, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C0441j.f8105Q.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
            return C0441j.f8105Q.onKeyUp(view, editable, i3, keyEvent);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$d */
    private class d implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0441j c0441j = C0441j.this;
            if (c0441j.f8123j || c0441j.f8127n == null) {
                return;
            }
            Iterator it = C0441j.this.f8127n.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            C0441j c0441j = C0441j.this;
            if (c0441j.f8123j || c0441j.f8127n == null) {
                return;
            }
            Iterator it = C0441j.this.f8127n.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i3, i4, i5);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            if (C0441j.f8104P) {
                Y.a.m(C0441j.this.f8122i, "onTextChanged[" + C0441j.this.getId() + "]: " + ((Object) charSequence) + " " + i3 + " " + i4 + " " + i5);
            }
            C0441j c0441j = C0441j.this;
            if (!c0441j.f8123j && c0441j.f8127n != null) {
                Iterator it = C0441j.this.f8127n.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i3, i4, i5);
                }
            }
            C0441j.this.d0();
            C0441j.this.R();
        }

        private d() {
        }
    }

    static {
        p026g1.a aVar = p026g1.a.f9423a;
        f8104P = false;
        f8105Q = QwertyKeyListener.getInstanceForFullKeyboard();
    }

    public C0441j(Context context) {
        super(context);
        this.f8122i = C0441j.class.getSimpleName();
        this.f8131r = null;
        this.f8138y = false;
        this.f8139z = false;
        this.f8107B = false;
        this.f8108C = null;
        this.f8109D = -1;
        this.f8110E = -1;
        this.f8111F = false;
        this.f8112G = false;
        this.f8113H = false;
        this.f8114I = false;
        this.f8115J = null;
        this.f8116K = R1.p.VISIBLE;
        this.f8117L = null;
        this.f8118M = false;
        this.f8119N = false;
        if (!p070r1.b.o()) {
            setFocusableInTouchMode(false);
        }
        this.f8121h = (InputMethodManager) p002a1.a.c(context.getSystemService("input_method"));
        this.f8124k = getGravity() & 8388615;
        this.f8125l = getGravity() & 112;
        this.f8126m = 0;
        this.f8123j = false;
        this.f8132s = false;
        this.f8127n = null;
        this.f8128o = null;
        this.f8129p = getInputType();
        if (this.f8137x == null) {
            this.f8137x = new c();
        }
        this.f8136w = null;
        this.f8106A = new com.facebook.react.views.text.s();
        u();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 <= 27) {
            setLayerType(1, null);
        }
        Z.X(this, new a(this, isFocusable(), getImportantForAccessibility()));
        b bVar = new b();
        setCustomSelectionActionModeCallback(bVar);
        setCustomInsertionActionModeCallback(bVar);
    }

    private boolean C() {
        return (getInputType() & 144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(Z1.d dVar) {
        return dVar.getSize() == this.f8106A.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E(Z1.e eVar) {
        return Integer.valueOf(eVar.getBackgroundColor()).equals(C0381a.i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F(Z1.g gVar) {
        return gVar.getForegroundColor() == getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean G(Z1.j jVar) {
        return (getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H(Z1.m mVar) {
        return (getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(Z1.a aVar) {
        return aVar.b() == this.f8106A.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean J(Z1.c cVar) {
        return cVar.c() == this.f8110E && Objects.equals(cVar.a(), this.f8108C) && cVar.d() == this.f8109D && Objects.equals(cVar.b(), getFontFeatureSettings());
    }

    private void K(SpannableStringBuilder spannableStringBuilder) {
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z3 = (spanFlags & 33) == 33;
            if (obj instanceof Z1.i) {
                getText().removeSpan(obj);
            }
            if (z3) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (V(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private void L(int i3, int i4) {
        if (i3 == -1 || i4 == -1) {
            return;
        }
        setSelection(w(i3), w(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        InterfaceC0432a interfaceC0432a = this.f8135v;
        if (interfaceC0432a != null) {
            interfaceC0432a.a();
        }
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            a0();
        }
        return zRequestFocus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        boolean zRequestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            a0();
        }
        return zRequestFocus;
    }

    private static boolean V(Editable editable, SpannableStringBuilder spannableStringBuilder, int i3, int i4) {
        if (i3 > spannableStringBuilder.length() || i4 > spannableStringBuilder.length()) {
            return false;
        }
        while (i3 < i4) {
            if (editable.charAt(i3) != spannableStringBuilder.charAt(i3)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private void X() {
        ReactContext reactContextD = H0.d(this);
        if (this.f8117L != null || reactContextD.isBridgeless()) {
            return;
        }
        r rVar = new r(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), rVar);
        }
    }

    private void b0(SpannableStringBuilder spannableStringBuilder, Class cls, p064q.h hVar) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (hVar.a(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void c0(SpannableStringBuilder spannableStringBuilder) {
        b0(spannableStringBuilder, Z1.d.class, new p064q.h() { // from class: com.facebook.react.views.textinput.c
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8097a.D((Z1.d) obj);
            }
        });
        b0(spannableStringBuilder, Z1.e.class, new p064q.h() { // from class: com.facebook.react.views.textinput.d
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8098a.E((Z1.e) obj);
            }
        });
        b0(spannableStringBuilder, Z1.g.class, new p064q.h() { // from class: com.facebook.react.views.textinput.e
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8099a.F((Z1.g) obj);
            }
        });
        b0(spannableStringBuilder, Z1.j.class, new p064q.h() { // from class: com.facebook.react.views.textinput.f
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8100a.G((Z1.j) obj);
            }
        });
        b0(spannableStringBuilder, Z1.m.class, new p064q.h() { // from class: com.facebook.react.views.textinput.g
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8101a.H((Z1.m) obj);
            }
        });
        b0(spannableStringBuilder, Z1.a.class, new p064q.h() { // from class: com.facebook.react.views.textinput.h
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8102a.I((Z1.a) obj);
            }
        });
        b0(spannableStringBuilder, Z1.c.class, new p064q.h() { // from class: com.facebook.react.views.textinput.i
            @Override // p064q.h
            public final boolean a(Object obj) {
                return this.f8103a.J((Z1.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        if (this.f8117L == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z3 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e4) {
                ReactSoftExceptionLogger.logSoftException(this.f8122i, e4);
            }
        }
        if (!z3) {
            if (getHint() != null && getHint().length() > 0) {
                spannableStringBuilder.append(getHint());
            } else if (M1.a.c(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        t(spannableStringBuilder);
        spannableStringBuilder.setSpan(new Z1.l(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        com.facebook.react.views.text.t.o(getId(), spannableStringBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void e0() {
        int i3 = 5;
        String str = this.f8133t;
        if (str != null) {
            str.hashCode();
            byte b4 = -1;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        b4 = 0;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b4 = 1;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        b4 = 2;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        b4 = 3;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        b4 = 4;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        b4 = 5;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        b4 = 6;
                    }
                    break;
            }
            switch (b4) {
                case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                    i3 = 7;
                    break;
                case 1:
                    i3 = 3;
                    break;
                case 2:
                    i3 = 2;
                    break;
                case 3:
                default:
                    i3 = 6;
                    break;
                case 4:
                    break;
                case 5:
                    i3 = 1;
                    break;
                case 6:
                    i3 = 4;
                    break;
            }
        } else {
            i3 = 6;
        }
        if (this.f8132s) {
            setImeOptions(i3 | 33554432);
        } else {
            setImeOptions(i3);
        }
    }

    private d getTextWatcherDelegator() {
        if (this.f8128o == null) {
            this.f8128o = new d();
        }
        return this.f8128o;
    }

    private void t(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new Z1.d(this.f8106A.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new Z1.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer numI = C0381a.i(this);
        if (numI != null && numI.intValue() != 0) {
            spannableStringBuilder.setSpan(new Z1.e(numI.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new Z1.j(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new Z1.m(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f8106A.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new Z1.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f8110E != -1 || this.f8109D != -1 || this.f8108C != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new Z1.c(this.f8110E, this.f8109D, getFontFeatureSettings(), this.f8108C, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f8106A.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new Z1.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private int w(int i3) {
        return Math.max(0, Math.min(i3, getText() == null ? 0 : getText().length()));
    }

    public int A() {
        int i3 = this.f8126m + 1;
        this.f8126m = i3;
        return i3;
    }

    boolean B() {
        return (getInputType() & 131072) != 0;
    }

    public void M(int i3, int i4, int i5) {
        if (v(i3)) {
            L(i4, i5);
        }
    }

    public void N(com.facebook.react.views.text.i iVar) {
        if (!(C() && TextUtils.equals(getText(), iVar.i())) && v(iVar.c())) {
            if (f8104P) {
                Y.a.m(this.f8122i, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) iVar.i()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.i());
            K(spannableStringBuilder);
            c0(spannableStringBuilder);
            this.f8130q = iVar.b();
            this.f8118M = true;
            if (iVar.i().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f8118M = false;
            if (getBreakStrategy() != iVar.k()) {
                setBreakStrategy(iVar.k());
            }
            d0();
        }
    }

    public void O(com.facebook.react.views.text.i iVar) {
        this.f8123j = true;
        N(iVar);
        this.f8123j = false;
    }

    public void P(com.facebook.react.views.text.i iVar) {
        this.f8119N = true;
        N(iVar);
        this.f8119N = false;
    }

    public void Q() {
        if (this.f8107B) {
            this.f8107B = false;
            setTypeface(com.facebook.react.views.text.p.a(getTypeface(), this.f8110E, this.f8109D, this.f8108C, getContext().getAssets()));
            if (this.f8110E == -1 && this.f8109D == -1 && this.f8108C == null && getFontFeatureSettings() == null) {
                setPaintFlags(getPaintFlags() & (-129));
            } else {
                setPaintFlags(getPaintFlags() | 128);
            }
        }
    }

    public void S() {
        if (p070r1.b.o()) {
            U();
        } else {
            T();
        }
    }

    public void W(float f3, int i3) {
        C0381a.q(this, R1.d.values()[i3], Float.isNaN(f3) ? null : new W(C0392f0.f(f3), X.POINT));
    }

    public boolean Y() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            return !B();
        }
        return submitBehavior.equals("blurAndSubmit");
    }

    public boolean Z() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (B()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    protected boolean a0() {
        return this.f8121h.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f8127n == null) {
            this.f8127n = new CopyOnWriteArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f8127n.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        if (!p070r1.b.o()) {
            setFocusableInTouchMode(false);
        }
        super.clearFocus();
        z();
    }

    protected void finalize() {
        if (f8104P) {
            Y.a.m(this.f8122i, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.t.f(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.f8132s;
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f8133t;
    }

    int getStagedInputType() {
        return this.f8129p;
    }

    public A0 getStateWrapper() {
        return this.f8117L;
    }

    public String getSubmitBehavior() {
        return this.f8131r;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                if (pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        L(selectionStart, selectionEnd);
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                pVar.c();
            }
        }
        if (this.f8111F && !this.f8113H) {
            if (p070r1.b.o()) {
                U();
            } else {
                T();
            }
        }
        this.f8113H = true;
    }

    @Override // androidx.appcompat.widget.C0216l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContextD = H0.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.f8139z) {
            inputConnectionOnCreateInputConnection = new l(inputConnectionOnCreateInputConnection, reactContextD, this, this.f8120O);
        }
        if (B() && (Y() || Z())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.C0216l, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                pVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f8116K != R1.p.VISIBLE) {
            C0381a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                pVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z3, int i3, Rect rect) {
        K k3;
        super.onFocusChanged(z3, i3, rect);
        if (!z3 || (k3 = this.f8134u) == null) {
            return;
        }
        k3.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 != 66 || B()) {
            return super.onKeyUp(i3, keyEvent);
        }
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        R();
        if (this.f8114I && isFocused()) {
            selectAll();
            this.f8114I = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
        J j3 = this.f8136w;
        if (j3 != null) {
            j3.a(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i3, int i4) {
        if (f8104P) {
            Y.a.m(this.f8122i, "onSelectionChanged[" + getId() + "]: " + i3 + " " + i4);
        }
        super.onSelectionChanged(i3, i4);
        if (this.f8134u == null || !hasFocus()) {
            return;
        }
        this.f8134u.a(i3, i4);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                pVar.f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C0216l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            i3 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8138y = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f8138y) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f8138y = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8127n;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(textWatcher);
            if (this.f8127n.isEmpty()) {
                this.f8127n = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i3, Rect rect) {
        return p070r1.b.o() ? super.requestFocus(i3, rect) : isFocused();
    }

    public void setAllowFontScaling(boolean z3) {
        if (this.f8106A.b() != z3) {
            this.f8106A.m(z3);
            u();
        }
    }

    public void setAutoFocus(boolean z3) {
        this.f8111F = z3;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        C0381a.n(this, Integer.valueOf(i3));
    }

    public void setBorderRadius(float f3) {
        W(f3, R1.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        C0381a.r(this, str == null ? null : R1.f.b(str));
    }

    public void setContentSizeWatcher(InterfaceC0432a interfaceC0432a) {
        this.f8135v = interfaceC0432a;
    }

    public void setContextMenuHidden(boolean z3) {
        this.f8112G = z3;
    }

    public void setDisableFullscreenUI(boolean z3) {
        this.f8132s = z3;
        e0();
    }

    void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f8120O = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.f8108C = str;
        this.f8107B = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f8107B = true;
    }

    public void setFontSize(float f3) {
        this.f8106A.n(f3);
        u();
    }

    public void setFontStyle(String str) {
        int iB = com.facebook.react.views.text.p.b(str);
        if (iB != this.f8110E) {
            this.f8110E = iB;
            this.f8107B = true;
        }
    }

    public void setFontWeight(String str) {
        int iD = com.facebook.react.views.text.p.d(str);
        if (iD != this.f8109D) {
            this.f8109D = iD;
            this.f8107B = true;
        }
    }

    void setGravityHorizontal(int i3) {
        if (i3 == 0) {
            i3 = this.f8124k;
        }
        setGravity(i3 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i3) {
        if (i3 == 0) {
            i3 = this.f8125l;
        }
        setGravity(i3 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i3) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i3);
        this.f8129p = i3;
        super.setTypeface(typeface);
        if (B()) {
            setSingleLine(false);
        }
        if (this.f8137x == null) {
            this.f8137x = new c();
        }
        this.f8137x.a(i3);
        setKeyListener(this.f8137x);
    }

    public void setLetterSpacingPt(float f3) {
        this.f8106A.p(f3);
        u();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        this.f8106A.q(i3);
    }

    public void setMaxFontSizeMultiplier(float f3) {
        if (f3 != this.f8106A.k()) {
            this.f8106A.r(f3);
            u();
        }
    }

    public void setOnKeyPress(boolean z3) {
        this.f8139z = z3;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f8116K = R1.p.VISIBLE;
        } else {
            R1.p pVarB = R1.p.b(str);
            if (pVarB == null) {
                pVarB = R1.p.VISIBLE;
            }
            this.f8116K = pVarB;
        }
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f8115J)) {
            return;
        }
        this.f8115J = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.f8133t = str;
        e0();
    }

    public void setScrollWatcher(J j3) {
        this.f8136w = j3;
    }

    public void setSelectTextOnFocus(boolean z3) {
        super.setSelectAllOnFocus(z3);
        this.f8114I = z3;
    }

    @Override // android.widget.EditText
    public void setSelection(int i3, int i4) {
        if (f8104P) {
            Y.a.m(this.f8122i, "setSelection[" + getId() + "]: " + i3 + " " + i4);
        }
        super.setSelection(i3, i4);
    }

    public void setSelectionWatcher(K k3) {
        this.f8134u = k3;
    }

    void setStagedInputType(int i3) {
        this.f8129p = i3;
    }

    public void setStateWrapper(A0 a4) {
        this.f8117L = a4;
    }

    public void setSubmitBehavior(String str) {
        this.f8131r = str;
    }

    protected void u() {
        setTextSize(0, this.f8106A.c());
        float fD = this.f8106A.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public boolean v(int i3) {
        return i3 >= this.f8126m;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f8130q) {
            Editable text = getText();
            for (Z1.p pVar : (Z1.p[]) text.getSpans(0, text.length(), Z1.p.class)) {
                if (pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    void x() {
        clearFocus();
    }

    void y() {
        if (getInputType() != this.f8129p) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f8129p);
            L(selectionStart, selectionEnd);
        }
    }

    protected void z() {
        this.f8121h.hideSoftInputFromWindow(getWindowToken(), 0);
    }
}
