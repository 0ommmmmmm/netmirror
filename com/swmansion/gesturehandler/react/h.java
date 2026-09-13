package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p055n2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f8629a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f8630b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f8631c = new SparseArray();

    private final synchronized void d(final C0478d c0478d) {
        try {
            Integer num = (Integer) this.f8630b.get(c0478d.R());
            if (num != null) {
                this.f8630b.remove(c0478d.R());
                ArrayList arrayList = (ArrayList) this.f8631c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(c0478d);
                    }
                    if (arrayList.size() == 0) {
                        this.f8631c.remove(num.intValue());
                    }
                }
            }
            if (c0478d.U() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.e(c0478d);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C0478d c0478d) {
        c0478d.o();
    }

    private final synchronized void k(int i3, C0478d c0478d) {
        try {
            if (this.f8630b.get(c0478d.R()) != null) {
                throw new IllegalStateException(("Handler " + c0478d + " already attached").toString());
            }
            this.f8630b.put(c0478d.R(), Integer.valueOf(i3));
            Object obj = this.f8631c.get(i3);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(c0478d);
                this.f8631c.put(i3, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(c0478d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p055n2.j
    public synchronized ArrayList a(View view) {
        D2.h.f(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i3, int i4, int i5) {
        boolean z3;
        C0478d c0478d = (C0478d) this.f8629a.get(i3);
        if (c0478d != null) {
            d(c0478d);
            c0478d.r0(i5);
            k(i4, c0478d);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public final synchronized void f() {
        this.f8629a.clear();
        this.f8630b.clear();
        this.f8631c.clear();
    }

    public final synchronized void g(int i3) {
        C0478d c0478d = (C0478d) this.f8629a.get(i3);
        if (c0478d != null) {
            d(c0478d);
            this.f8629a.remove(i3);
        }
    }

    public final synchronized C0478d h(int i3) {
        return (C0478d) this.f8629a.get(i3);
    }

    public final synchronized ArrayList i(int i3) {
        return (ArrayList) this.f8631c.get(i3);
    }

    public final synchronized void j(C0478d c0478d) {
        D2.h.f(c0478d, "handler");
        this.f8629a.put(c0478d.R(), c0478d);
    }
}
