package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0386c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0 f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0429y0 f7468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f7469c = new SparseBooleanArray();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.c0$a */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0414q0 f7470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7471b;

        a(InterfaceC0414q0 interfaceC0414q0, int i3) {
            this.f7470a = interfaceC0414q0;
            this.f7471b = i3;
        }
    }

    public C0386c0(M0 m3, C0429y0 c0429y0) {
        this.f7467a = m3;
        this.f7468b = c0429y0;
    }

    private void a(InterfaceC0414q0 interfaceC0414q0, InterfaceC0414q0 interfaceC0414q1, int i3) {
        p002a1.a.a(interfaceC0414q1.m() != EnumC0382a0.PARENT);
        for (int i4 = 0; i4 < interfaceC0414q1.C(); i4++) {
            InterfaceC0414q0 interfaceC0414q0N = interfaceC0414q1.N(i4);
            p002a1.a.a(interfaceC0414q0N.V() == null);
            int iU = interfaceC0414q0.U();
            if (interfaceC0414q0N.m() == EnumC0382a0.NONE) {
                d(interfaceC0414q0, interfaceC0414q0N, i3);
            } else {
                b(interfaceC0414q0, interfaceC0414q0N, i3);
            }
            i3 += interfaceC0414q0.U() - iU;
        }
    }

    private void b(InterfaceC0414q0 interfaceC0414q0, InterfaceC0414q0 interfaceC0414q1, int i3) {
        interfaceC0414q0.Z(interfaceC0414q1, i3);
        this.f7467a.G(interfaceC0414q0.H(), null, new O0[]{new O0(interfaceC0414q1.H(), i3)}, null);
        if (interfaceC0414q1.m() != EnumC0382a0.PARENT) {
            a(interfaceC0414q0, interfaceC0414q1, i3 + 1);
        }
    }

    private void c(InterfaceC0414q0 interfaceC0414q0, InterfaceC0414q0 interfaceC0414q1, int i3) {
        int iT = interfaceC0414q0.T(interfaceC0414q0.N(i3));
        if (interfaceC0414q0.m() != EnumC0382a0.PARENT) {
            a aVarS = s(interfaceC0414q0, iT);
            if (aVarS == null) {
                return;
            }
            InterfaceC0414q0 interfaceC0414q2 = aVarS.f7470a;
            iT = aVarS.f7471b;
            interfaceC0414q0 = interfaceC0414q2;
        }
        if (interfaceC0414q1.m() != EnumC0382a0.NONE) {
            b(interfaceC0414q0, interfaceC0414q1, iT);
        } else {
            d(interfaceC0414q0, interfaceC0414q1, iT);
        }
    }

    private void d(InterfaceC0414q0 interfaceC0414q0, InterfaceC0414q0 interfaceC0414q1, int i3) {
        a(interfaceC0414q0, interfaceC0414q1, i3);
    }

    private void e(InterfaceC0414q0 interfaceC0414q0) {
        int iH = interfaceC0414q0.H();
        if (this.f7469c.get(iH)) {
            return;
        }
        this.f7469c.put(iH, true);
        int iD = interfaceC0414q0.D();
        int iJ = interfaceC0414q0.j();
        for (InterfaceC0414q0 parent = interfaceC0414q0.getParent(); parent != null && parent.m() != EnumC0382a0.PARENT; parent = parent.getParent()) {
            if (!parent.R()) {
                iD += Math.round(parent.J());
                iJ += Math.round(parent.A());
            }
        }
        f(interfaceC0414q0, iD, iJ);
    }

    private void f(InterfaceC0414q0 interfaceC0414q0, int i3, int i4) {
        if (interfaceC0414q0.m() != EnumC0382a0.NONE && interfaceC0414q0.V() != null) {
            this.f7467a.P(interfaceC0414q0.P().H(), interfaceC0414q0.H(), i3, i4, interfaceC0414q0.a(), interfaceC0414q0.b(), interfaceC0414q0.getLayoutDirection());
            return;
        }
        for (int i5 = 0; i5 < interfaceC0414q0.C(); i5++) {
            InterfaceC0414q0 interfaceC0414q0N = interfaceC0414q0.N(i5);
            int iH = interfaceC0414q0N.H();
            if (!this.f7469c.get(iH)) {
                this.f7469c.put(iH, true);
                f(interfaceC0414q0N, interfaceC0414q0N.D() + i3, interfaceC0414q0N.j() + i4);
            }
        }
    }

    public static void j(InterfaceC0414q0 interfaceC0414q0) {
        interfaceC0414q0.L();
    }

    private static boolean n(C0417s0 c0417s0) {
        if (c0417s0 == null) {
            return true;
        }
        if (c0417s0.c("collapsable") && !c0417s0.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = c0417s0.f7631a.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!Z0.a(c0417s0.f7631a, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(InterfaceC0414q0 interfaceC0414q0, boolean z3) {
        if (interfaceC0414q0.m() != EnumC0382a0.PARENT) {
            for (int iC = interfaceC0414q0.C() - 1; iC >= 0; iC--) {
                q(interfaceC0414q0.N(iC), z3);
            }
        }
        InterfaceC0414q0 interfaceC0414q0V = interfaceC0414q0.V();
        if (interfaceC0414q0V != null) {
            int iY = interfaceC0414q0V.Y(interfaceC0414q0);
            interfaceC0414q0V.I(iY);
            this.f7467a.G(interfaceC0414q0V.H(), new int[]{iY}, null, z3 ? new int[]{interfaceC0414q0.H()} : null);
        }
    }

    private void r(InterfaceC0414q0 interfaceC0414q0, C0417s0 c0417s0) {
        InterfaceC0414q0 parent = interfaceC0414q0.getParent();
        if (parent == null) {
            interfaceC0414q0.W(false);
            return;
        }
        int iT = parent.t(interfaceC0414q0);
        parent.e(iT);
        q(interfaceC0414q0, false);
        interfaceC0414q0.W(false);
        this.f7467a.C(interfaceC0414q0.l(), interfaceC0414q0.H(), interfaceC0414q0.v(), c0417s0);
        parent.o(interfaceC0414q0, iT);
        c(parent, interfaceC0414q0, iT);
        for (int i3 = 0; i3 < interfaceC0414q0.C(); i3++) {
            c(interfaceC0414q0, interfaceC0414q0.N(i3), i3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transitioning LayoutOnlyView - tag: ");
        sb.append(interfaceC0414q0.H());
        sb.append(" - rootTag: ");
        sb.append(interfaceC0414q0.n());
        sb.append(" - hasProps: ");
        sb.append(c0417s0 != null);
        sb.append(" - tagsWithLayout.size: ");
        sb.append(this.f7469c.size());
        Y.a.s("NativeViewHierarchyOptimizer", sb.toString());
        p002a1.a.a(this.f7469c.size() == 0);
        e(interfaceC0414q0);
        for (int i4 = 0; i4 < interfaceC0414q0.C(); i4++) {
            e(interfaceC0414q0.N(i4));
        }
        this.f7469c.clear();
    }

    private a s(InterfaceC0414q0 interfaceC0414q0, int i3) {
        while (interfaceC0414q0.m() != EnumC0382a0.PARENT) {
            InterfaceC0414q0 parent = interfaceC0414q0.getParent();
            if (parent == null) {
                return null;
            }
            i3 = i3 + (interfaceC0414q0.m() == EnumC0382a0.LEAF ? 1 : 0) + parent.T(interfaceC0414q0);
            interfaceC0414q0 = parent;
        }
        return new a(interfaceC0414q0, i3);
    }

    public void g(InterfaceC0414q0 interfaceC0414q0, B0 b4, C0417s0 c0417s0) {
        interfaceC0414q0.W(interfaceC0414q0.v().equals(ReactViewManager.REACT_CLASS) && n(c0417s0));
        if (interfaceC0414q0.m() != EnumC0382a0.NONE) {
            this.f7467a.C(b4, interfaceC0414q0.H(), interfaceC0414q0.v(), c0417s0);
        }
    }

    public void h(InterfaceC0414q0 interfaceC0414q0) {
        if (interfaceC0414q0.a0()) {
            r(interfaceC0414q0, null);
        }
    }

    public void i(InterfaceC0414q0 interfaceC0414q0, int[] iArr, int[] iArr2, O0[] o0Arr, int[] iArr3) {
        boolean z3;
        for (int i3 : iArr2) {
            int i4 = 0;
            while (true) {
                if (i4 >= iArr3.length) {
                    z3 = false;
                    break;
                } else {
                    if (iArr3[i4] == i3) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
            }
            q(this.f7468b.c(i3), z3);
        }
        for (O0 o3 : o0Arr) {
            c(interfaceC0414q0, this.f7468b.c(o3.f7353a), o3.f7354b);
        }
    }

    public void k(InterfaceC0414q0 interfaceC0414q0, ReadableArray readableArray) {
        for (int i3 = 0; i3 < readableArray.size(); i3++) {
            c(interfaceC0414q0, this.f7468b.c(readableArray.getInt(i3)), i3);
        }
    }

    public void l(InterfaceC0414q0 interfaceC0414q0) {
        e(interfaceC0414q0);
    }

    public void m(InterfaceC0414q0 interfaceC0414q0, String str, C0417s0 c0417s0) {
        if (interfaceC0414q0.a0() && !n(c0417s0)) {
            r(interfaceC0414q0, c0417s0);
        } else {
            if (interfaceC0414q0.a0()) {
                return;
            }
            this.f7467a.Q(interfaceC0414q0.H(), str, c0417s0);
        }
    }

    public void o() {
        this.f7469c.clear();
    }

    void p(InterfaceC0414q0 interfaceC0414q0) {
        this.f7469c.clear();
    }
}
