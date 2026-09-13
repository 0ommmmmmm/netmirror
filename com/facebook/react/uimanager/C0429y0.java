package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.react.uimanager.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0429y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f7639a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f7640b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p018e1.i f7641c = new p018e1.i();

    public void a(InterfaceC0414q0 interfaceC0414q0) {
        this.f7641c.a();
        this.f7639a.put(interfaceC0414q0.H(), interfaceC0414q0);
    }

    public void b(InterfaceC0414q0 interfaceC0414q0) {
        this.f7641c.a();
        int iH = interfaceC0414q0.H();
        this.f7639a.put(iH, interfaceC0414q0);
        this.f7640b.put(iH, true);
    }

    public InterfaceC0414q0 c(int i3) {
        this.f7641c.a();
        return (InterfaceC0414q0) this.f7639a.get(i3);
    }

    public int d() {
        this.f7641c.a();
        return this.f7640b.size();
    }

    public int e(int i3) {
        this.f7641c.a();
        return this.f7640b.keyAt(i3);
    }

    public boolean f(int i3) {
        this.f7641c.a();
        return this.f7640b.get(i3);
    }

    public void g(int i3) {
        this.f7641c.a();
        if (!this.f7640b.get(i3)) {
            this.f7639a.remove(i3);
            return;
        }
        throw new P("Trying to remove root node " + i3 + " without using removeRootNode!");
    }

    public void h(int i3) {
        this.f7641c.a();
        if (i3 == -1) {
            return;
        }
        if (this.f7640b.get(i3)) {
            this.f7639a.remove(i3);
            this.f7640b.delete(i3);
        } else {
            throw new P("View with tag " + i3 + " is not registered as a root view");
        }
    }
}
