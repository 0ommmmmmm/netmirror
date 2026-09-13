package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f7243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final EventDispatcher f7244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ReactApplicationContext f7245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C0429y0 f7246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U0 f7247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final M0 f7248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0386c0 f7249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f7250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f7251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f7252j;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0414q0 f7253b;

        a(InterfaceC0414q0 interfaceC0414q0) {
            this.f7253b = interfaceC0414q0;
        }

        @Override // java.lang.Runnable
        public void run() {
            G0.this.f7246d.b(this.f7253b);
        }
    }

    G0(ReactApplicationContext reactApplicationContext, U0 u3, EventDispatcher eventDispatcher, int i3) {
        this(reactApplicationContext, u3, new M0(reactApplicationContext, new C0384b0(u3), i3), eventDispatcher);
    }

    private void A(InterfaceC0414q0 interfaceC0414q0) {
        if (interfaceC0414q0.x()) {
            for (int i3 = 0; i3 < interfaceC0414q0.C(); i3++) {
                A(interfaceC0414q0.N(i3));
            }
            interfaceC0414q0.O(this.f7249g);
        }
    }

    private void L(InterfaceC0414q0 interfaceC0414q0) {
        C0386c0.j(interfaceC0414q0);
        this.f7246d.g(interfaceC0414q0.H());
        for (int iC = interfaceC0414q0.C() - 1; iC >= 0; iC--) {
            L(interfaceC0414q0.N(iC));
        }
        interfaceC0414q0.G();
    }

    private void c(InterfaceC0414q0 interfaceC0414q0) {
        NativeModule nativeModule = (ViewManager) p002a1.a.c(this.f7247e.c(interfaceC0414q0.v()));
        if (!(nativeModule instanceof O)) {
            throw new P("Trying to use view " + interfaceC0414q0.v() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        O o3 = (O) nativeModule;
        if (o3 == null || !o3.needsCustomLayoutForChildren()) {
            return;
        }
        throw new P("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + interfaceC0414q0.v() + "). Use measure instead.");
    }

    private boolean e(int i3, String str) {
        if (this.f7246d.c(i3) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i3 + ", since the view does not exist";
        if (p026g1.a.f9424b) {
            throw new P(str2);
        }
        Y.a.I("ReactNative", str2);
        return false;
    }

    private void n() {
        if (this.f7248f.U()) {
            m(-1);
        }
    }

    private void y(int i3, int i4, int[] iArr) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        InterfaceC0414q0 interfaceC0414q0C2 = this.f7246d.c(i4);
        if (interfaceC0414q0C == null || interfaceC0414q0C2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (interfaceC0414q0C != null) {
                i3 = i4;
            }
            sb.append(i3);
            sb.append(" does not exist");
            throw new P(sb.toString());
        }
        if (interfaceC0414q0C != interfaceC0414q0C2) {
            for (InterfaceC0414q0 parent = interfaceC0414q0C.getParent(); parent != interfaceC0414q0C2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new P("Tag " + i4 + " is not an ancestor of tag " + i3);
                }
            }
        }
        z(interfaceC0414q0C, interfaceC0414q0C2, iArr);
    }

    private void z(InterfaceC0414q0 interfaceC0414q0, InterfaceC0414q0 interfaceC0414q1, int[] iArr) {
        int iRound;
        int iRound2;
        if (interfaceC0414q0 == interfaceC0414q1 || interfaceC0414q0.R()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(interfaceC0414q0.J());
            iRound2 = Math.round(interfaceC0414q0.A());
            for (InterfaceC0414q0 parent = interfaceC0414q0.getParent(); parent != interfaceC0414q1; parent = parent.getParent()) {
                p002a1.a.c(parent);
                c(parent);
                iRound += Math.round(parent.J());
                iRound2 += Math.round(parent.A());
            }
            c(interfaceC0414q1);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = interfaceC0414q0.a();
        iArr[3] = interfaceC0414q0.b();
    }

    public void B() {
        this.f7252j = false;
        this.f7247e.f();
    }

    public void C() {
    }

    public void D() {
        this.f7248f.V();
    }

    public void E() {
        this.f7248f.Y();
    }

    public void F(F0 f3) {
        this.f7248f.W(f3);
    }

    public void G() {
        this.f7248f.X();
    }

    public void H(View view, int i3, B0 b4) {
        synchronized (this.f7243a) {
            InterfaceC0414q0 interfaceC0414q0H = h();
            interfaceC0414q0H.y(i3);
            interfaceC0414q0H.c0(b4);
            b4.runOnNativeModulesQueueThread(new a(interfaceC0414q0H));
            this.f7248f.y(i3, view);
        }
    }

    public void I(int i3) {
        synchronized (this.f7243a) {
            this.f7246d.h(i3);
        }
    }

    public void J(int i3) {
        I(i3);
        this.f7248f.J(i3);
    }

    protected final void K(InterfaceC0414q0 interfaceC0414q0) {
        L(interfaceC0414q0);
        interfaceC0414q0.f();
    }

    public int M(int i3) {
        if (this.f7246d.f(i3)) {
            return i3;
        }
        InterfaceC0414q0 interfaceC0414q0N = N(i3);
        if (interfaceC0414q0N != null) {
            return interfaceC0414q0N.n();
        }
        Y.a.I("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i3);
        return 0;
    }

    public final InterfaceC0414q0 N(int i3) {
        return this.f7246d.c(i3);
    }

    protected final ViewManager O(String str) {
        return this.f7247e.e(str);
    }

    public void P(int i3, int i4) {
        this.f7248f.K(i3, i4);
    }

    public void Q(int i3, ReadableArray readableArray) {
        if (this.f7252j) {
            synchronized (this.f7243a) {
                try {
                    InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
                    for (int i4 = 0; i4 < readableArray.size(); i4++) {
                        InterfaceC0414q0 interfaceC0414q0C2 = this.f7246d.c(readableArray.getInt(i4));
                        if (interfaceC0414q0C2 == null) {
                            throw new P("Trying to add unknown view tag: " + readableArray.getInt(i4));
                        }
                        interfaceC0414q0C.o(interfaceC0414q0C2, i4);
                    }
                    this.f7249g.k(interfaceC0414q0C, readableArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void R(int i3, boolean z3) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        if (interfaceC0414q0C == null) {
            return;
        }
        while (interfaceC0414q0C.m() == EnumC0382a0.NONE) {
            interfaceC0414q0C = interfaceC0414q0C.getParent();
        }
        this.f7248f.L(interfaceC0414q0C.H(), i3, z3);
    }

    public void S(boolean z3) {
        this.f7248f.M(z3);
    }

    public void T(N1.a aVar) {
        this.f7248f.Z(aVar);
    }

    public void U(int i3, Object obj) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        if (interfaceC0414q0C != null) {
            interfaceC0414q0C.k(obj);
            n();
        } else {
            Y.a.I("ReactNative", "Attempt to set local data for view with unknown tag: " + i3);
        }
    }

    public void V(int i3, C0417s0 c0417s0) {
        UiThreadUtil.assertOnUiThread();
        this.f7248f.S().C(i3, c0417s0);
    }

    public void W(int i3, int i4, int i5, int i6, int i7) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        if (interfaceC0414q0C == null) {
            Y.a.I("ReactNative", "Tried to update size of non-existent tag: " + i3);
            return;
        }
        interfaceC0414q0C.S(4, i5);
        interfaceC0414q0C.S(1, i4);
        interfaceC0414q0C.S(5, i7);
        interfaceC0414q0C.S(3, i6);
        n();
    }

    public void X(int i3, int i4, int i5) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        if (interfaceC0414q0C != null) {
            interfaceC0414q0C.d0(i4);
            interfaceC0414q0C.g(i5);
            n();
        } else {
            Y.a.I("ReactNative", "Tried to update size of non-existent tag: " + i3);
        }
    }

    public void Y(int i3, int i4, int i5) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        if (interfaceC0414q0C != null) {
            Z(interfaceC0414q0C, i4, i5);
            return;
        }
        Y.a.I("ReactNative", "Tried to update non-existent root tag: " + i3);
    }

    public void Z(InterfaceC0414q0 interfaceC0414q0, int i3, int i4) {
        interfaceC0414q0.h(i3, i4);
    }

    public void a(F0 f3) {
        this.f7248f.N(f3);
    }

    public void a0(int i3, String str, ReadableMap readableMap) {
        if (this.f7252j) {
            if (this.f7247e.c(str) == null) {
                throw new P("Got unknown view type: " + str);
            }
            InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
            if (interfaceC0414q0C == null) {
                throw new P("Trying to update non-existent view with tag " + i3);
            }
            if (readableMap != null) {
                C0417s0 c0417s0 = new C0417s0(readableMap);
                interfaceC0414q0C.X(c0417s0);
                t(interfaceC0414q0C, str, c0417s0);
            }
        }
    }

    protected void b(InterfaceC0414q0 interfaceC0414q0, float f3, float f4, List list) {
        if (interfaceC0414q0.x()) {
            if (interfaceC0414q0.q(f3, f4) && interfaceC0414q0.r() && !this.f7246d.f(interfaceC0414q0.H())) {
                list.add(interfaceC0414q0);
            }
            Iterable iterableE = interfaceC0414q0.E();
            if (iterableE != null) {
                Iterator it = iterableE.iterator();
                while (it.hasNext()) {
                    b((InterfaceC0414q0) it.next(), interfaceC0414q0.J() + f3, interfaceC0414q0.A() + f4, list);
                }
            }
            interfaceC0414q0.F(f3, f4, this.f7248f, this.f7249g);
            interfaceC0414q0.d();
            this.f7249g.p(interfaceC0414q0);
        }
    }

    protected void b0() {
        p015d2.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i3 = 0; i3 < this.f7246d.d(); i3++) {
            try {
                InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(this.f7246d.e(i3));
                if (interfaceC0414q0C.getWidthMeasureSpec() != null && interfaceC0414q0C.getHeightMeasureSpec() != null) {
                    p015d2.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", interfaceC0414q0C.H()).c();
                    try {
                        A(interfaceC0414q0C);
                        p015d2.a.i(0L);
                        d(interfaceC0414q0C);
                        p015d2.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", interfaceC0414q0C.H()).c();
                        try {
                            ArrayList<InterfaceC0414q0> arrayList = new ArrayList();
                            b(interfaceC0414q0C, 0.0f, 0.0f, arrayList);
                            for (InterfaceC0414q0 interfaceC0414q0 : arrayList) {
                                this.f7244b.b(C0390e0.v(-1, interfaceC0414q0.H(), interfaceC0414q0.D(), interfaceC0414q0.j(), interfaceC0414q0.a(), interfaceC0414q0.b()));
                            }
                            p015d2.a.i(0L);
                        } catch (Throwable th) {
                            p015d2.a.i(0L);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        p015d2.a.i(0L);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                p015d2.a.i(0L);
                throw th3;
            }
        }
        p015d2.a.i(0L);
    }

    public void c0(int i3, int i4, Callback callback) {
        InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
        InterfaceC0414q0 interfaceC0414q0C2 = this.f7246d.c(i4);
        if (interfaceC0414q0C == null || interfaceC0414q0C2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(interfaceC0414q0C.Q(interfaceC0414q0C2)));
        }
    }

    protected void d(InterfaceC0414q0 interfaceC0414q0) {
        p015d2.b.a(0L, "cssRoot.calculateLayout").a("rootTag", interfaceC0414q0.H()).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = interfaceC0414q0.getWidthMeasureSpec().intValue();
            int iIntValue2 = interfaceC0414q0.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            interfaceC0414q0.B(size2, size);
        } finally {
            p015d2.a.i(0L);
            this.f7251i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void f() {
        this.f7248f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f7248f.B(readableMap, callback);
    }

    protected InterfaceC0414q0 h() {
        C0415r0 c0415r0 = new C0415r0();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f7245c)) {
            c0415r0.s(com.facebook.yoga.h.RTL);
        }
        c0415r0.p("Root");
        return c0415r0;
    }

    protected InterfaceC0414q0 i(String str) {
        return this.f7247e.c(str).createShadowNodeInstance(this.f7245c);
    }

    public void j(int i3, String str, int i4, ReadableMap readableMap) {
        C0417s0 c0417s0;
        if (this.f7252j) {
            synchronized (this.f7243a) {
                try {
                    InterfaceC0414q0 interfaceC0414q0I = i(str);
                    InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i4);
                    p002a1.a.d(interfaceC0414q0C, "Root node with tag " + i4 + " doesn't exist");
                    interfaceC0414q0I.y(i3);
                    interfaceC0414q0I.p(str);
                    interfaceC0414q0I.b0(interfaceC0414q0C.H());
                    interfaceC0414q0I.c0(interfaceC0414q0C.l());
                    this.f7246d.a(interfaceC0414q0I);
                    if (readableMap != null) {
                        c0417s0 = new C0417s0(readableMap);
                        interfaceC0414q0I.X(c0417s0);
                    } else {
                        c0417s0 = null;
                    }
                    s(interfaceC0414q0I, i4, c0417s0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(int i3, int i4, ReadableArray readableArray) {
        if (e(i3, "dispatchViewManagerCommand: " + i4)) {
            this.f7248f.D(i3, i4, readableArray);
        }
    }

    public void l(int i3, String str, ReadableArray readableArray) {
        if (e(i3, "dispatchViewManagerCommand: " + str)) {
            this.f7248f.E(i3, str, readableArray);
        }
    }

    public void m(int i3) {
        p015d2.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i3).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            b0();
            this.f7249g.o();
            this.f7248f.z(i3, jUptimeMillis, this.f7251i);
        } finally {
            p015d2.a.i(0L);
        }
    }

    public void o(int i3, float f3, float f4, Callback callback) {
        this.f7248f.F(i3, f3, f4, callback);
    }

    public Map p() {
        return this.f7248f.T();
    }

    public int q() {
        return this.f7248f.S().p();
    }

    M0 r() {
        return this.f7248f;
    }

    protected void s(InterfaceC0414q0 interfaceC0414q0, int i3, C0417s0 c0417s0) {
        if (interfaceC0414q0.R()) {
            return;
        }
        this.f7249g.g(interfaceC0414q0, interfaceC0414q0.l(), c0417s0);
    }

    protected void t(InterfaceC0414q0 interfaceC0414q0, String str, C0417s0 c0417s0) {
        if (interfaceC0414q0.R()) {
            return;
        }
        this.f7249g.m(interfaceC0414q0, str, c0417s0);
    }

    public void u(int i3, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (!this.f7252j) {
            return;
        }
        synchronized (this.f7243a) {
            try {
                InterfaceC0414q0 interfaceC0414q0C = this.f7246d.c(i3);
                int size = readableArray6 == null ? 0 : readableArray.size();
                int size2 = readableArray3 == null ? 0 : readableArray3.size();
                int size3 = readableArray5 == null ? 0 : readableArray5.size();
                if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                    throw new P("Size of moveFrom != size of moveTo!");
                }
                if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                    throw new P("Size of addChildTags != size of addAtIndices!");
                }
                int i4 = size + size2;
                O0[] o0Arr = new O0[i4];
                int i5 = size + size3;
                int[] iArr = new int[i5];
                try {
                    int[] iArr2 = new int[i5];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        p002a1.a.c(readableArray);
                        p002a1.a.c(readableArray2);
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = i5;
                            int i8 = readableArray6.getInt(i6);
                            int iH = interfaceC0414q0C.N(i8).H();
                            o0Arr[i6] = new O0(iH, readableArray2.getInt(i6));
                            iArr[i6] = i8;
                            iArr2[i6] = iH;
                            i6++;
                            readableArray6 = readableArray;
                            i5 = i7;
                            iArr3 = iArr3;
                            interfaceC0414q0C = interfaceC0414q0C;
                        }
                    }
                    InterfaceC0414q0 interfaceC0414q0 = interfaceC0414q0C;
                    int[] iArr4 = iArr3;
                    int i9 = i5;
                    if (size2 > 0) {
                        p002a1.a.c(readableArray3);
                        p002a1.a.c(readableArray4);
                        for (int i10 = 0; i10 < size2; i10++) {
                            o0Arr[size + i10] = new O0(readableArray3.getInt(i10), readableArray4.getInt(i10));
                        }
                    }
                    if (size3 > 0) {
                        p002a1.a.c(readableArray5);
                        int i11 = 0;
                        while (i11 < size3) {
                            int i12 = readableArray5.getInt(i11);
                            InterfaceC0414q0 interfaceC0414q1 = interfaceC0414q0;
                            int iH2 = interfaceC0414q1.N(i12).H();
                            int i13 = size + i11;
                            iArr[i13] = i12;
                            iArr2[i13] = iH2;
                            iArr4[i11] = iH2;
                            i11++;
                            interfaceC0414q0 = interfaceC0414q1;
                        }
                    }
                    InterfaceC0414q0 interfaceC0414q2 = interfaceC0414q0;
                    Arrays.sort(o0Arr, O0.f7352c);
                    Arrays.sort(iArr);
                    int i14 = -1;
                    for (int i15 = i9 - 1; i15 >= 0; i15--) {
                        int i16 = iArr[i15];
                        if (i16 == i14) {
                            throw new P("Repeated indices in Removal list for view tag: " + i3);
                        }
                        interfaceC0414q2.e(i16);
                        i14 = iArr[i15];
                    }
                    int i17 = 0;
                    while (i17 < i4) {
                        O0 o3 = o0Arr[i17];
                        int[] iArr5 = iArr2;
                        InterfaceC0414q0 interfaceC0414q0C2 = this.f7246d.c(o3.f7353a);
                        if (interfaceC0414q0C2 == null) {
                            throw new P("Trying to add unknown view tag: " + o3.f7353a);
                        }
                        interfaceC0414q2.o(interfaceC0414q0C2, o3.f7354b);
                        i17++;
                        iArr2 = iArr5;
                    }
                    this.f7249g.i(interfaceC0414q2, iArr, iArr2, o0Arr, iArr4);
                    for (int i18 = 0; i18 < size3; i18++) {
                        K(this.f7246d.c(iArr4[i18]));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void v(int i3, Callback callback) {
        if (this.f7252j) {
            this.f7248f.H(i3, callback);
        }
    }

    public void w(int i3, Callback callback) {
        if (this.f7252j) {
            this.f7248f.I(i3, callback);
        }
    }

    public void x(int i3, int i4, Callback callback, Callback callback2) {
        if (this.f7252j) {
            try {
                y(i3, i4, this.f7250h);
                callback2.invoke(Float.valueOf(C0392f0.f(this.f7250h[0])), Float.valueOf(C0392f0.f(this.f7250h[1])), Float.valueOf(C0392f0.f(this.f7250h[2])), Float.valueOf(C0392f0.f(this.f7250h[3])));
            } catch (P e4) {
                callback.invoke(e4.getMessage());
            }
        }
    }

    protected G0(ReactApplicationContext reactApplicationContext, U0 u3, M0 m3, EventDispatcher eventDispatcher) {
        this.f7243a = new Object();
        C0429y0 c0429y0 = new C0429y0();
        this.f7246d = c0429y0;
        this.f7250h = new int[4];
        this.f7251i = 0L;
        this.f7252j = true;
        this.f7245c = reactApplicationContext;
        this.f7247e = u3;
        this.f7248f = m3;
        this.f7249g = new C0386c0(m3, c0429y0);
        this.f7244b = eventDispatcher;
    }
}
