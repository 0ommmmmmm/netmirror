package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public final class d extends P1.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f8618k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p064q.f f8619l = new p064q.f(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p059o2.b f8620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short f8621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8622j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d c(a aVar, C0478d c0478d, p059o2.b bVar, boolean z3, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                z3 = false;
            }
            return aVar.b(c0478d, bVar, z3);
        }

        public final WritableMap a(p059o2.b bVar) {
            D2.h.f(bVar, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            D2.h.c(writableMapCreateMap);
            bVar.a(writableMapCreateMap);
            D2.h.e(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final d b(C0478d c0478d, p059o2.b bVar, boolean z3) {
            D2.h.f(c0478d, "handler");
            D2.h.f(bVar, "dataBuilder");
            d dVar = (d) d.f8619l.b();
            if (dVar == null) {
                dVar = new d(null);
            }
            dVar.w(c0478d, bVar, z3);
            return dVar;
        }

        private a() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C0478d c0478d, p059o2.b bVar, boolean z3) {
        View viewU = c0478d.U();
        D2.h.c(viewU);
        super.q(H0.f(viewU), viewU.getId());
        this.f8620h = bVar;
        this.f8622j = z3;
        this.f8621i = c0478d.G();
    }

    @Override // P1.d
    public boolean a() {
        return true;
    }

    @Override // P1.d
    public short g() {
        return this.f8621i;
    }

    @Override // P1.d
    protected WritableMap j() {
        a aVar = f8618k;
        p059o2.b bVar = this.f8620h;
        D2.h.c(bVar);
        return aVar.a(bVar);
    }

    @Override // P1.d
    public String k() {
        return this.f8622j ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // P1.d
    public void t() {
        this.f8620h = null;
        f8619l.a(this);
    }

    private d() {
    }
}
