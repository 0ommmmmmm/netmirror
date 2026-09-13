package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055n2.C0478d;
import p055n2.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p055n2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8623d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f8624a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f8625b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f8626c = new SparseArray();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        D2.h.c(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = array.getInt(i3);
        }
        return iArr;
    }

    @Override // p055n2.e
    public boolean a(C0478d c0478d, C0478d c0478d2) {
        D2.h.f(c0478d, "handler");
        D2.h.f(c0478d2, "otherHandler");
        int[] iArr = (int[]) this.f8626c.get(c0478d.R());
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == c0478d2.R()) {
                return true;
            }
        }
        return false;
    }

    @Override // p055n2.e
    public boolean b(C0478d c0478d, C0478d c0478d2) {
        D2.h.f(c0478d, "handler");
        D2.h.f(c0478d2, "otherHandler");
        if (c0478d2 instanceof q) {
            return ((q) c0478d2).S0();
        }
        return c0478d2 instanceof j.b;
    }

    @Override // p055n2.e
    public boolean c(C0478d c0478d, C0478d c0478d2) {
        D2.h.f(c0478d, "handler");
        D2.h.f(c0478d2, "otherHandler");
        int[] iArr = (int[]) this.f8625b.get(c0478d.R());
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == c0478d2.R()) {
                return true;
            }
        }
        return false;
    }

    @Override // p055n2.e
    public boolean d(C0478d c0478d, C0478d c0478d2) {
        D2.h.f(c0478d, "handler");
        D2.h.f(c0478d2, "otherHandler");
        int[] iArr = (int[]) this.f8624a.get(c0478d.R());
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == c0478d2.R()) {
                return true;
            }
        }
        return false;
    }

    public final void e(C0478d c0478d, ReadableMap readableMap) {
        D2.h.f(c0478d, "handler");
        D2.h.f(readableMap, "config");
        c0478d.y0(this);
        if (readableMap.hasKey("waitFor")) {
            this.f8624a.put(c0478d.R(), f(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f8625b.put(c0478d.R(), f(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.f8626c.put(c0478d.R(), f(readableMap, "blocksHandlers"));
        }
    }

    public final void g(int i3) {
        this.f8624a.remove(i3);
        this.f8625b.remove(i3);
    }

    public final void h() {
        this.f8624a.clear();
        this.f8625b.clear();
    }
}
