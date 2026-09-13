package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public final class l extends P1.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f8644k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p064q.f f8645l = new p064q.f(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p059o2.b f8646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8648j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(p059o2.b bVar, int i3, int i4) {
            D2.h.f(bVar, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            D2.h.c(writableMapCreateMap);
            bVar.a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", i3);
            writableMapCreateMap.putInt("oldState", i4);
            D2.h.e(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final l b(C0478d c0478d, int i3, int i4, p059o2.b bVar) {
            D2.h.f(c0478d, "handler");
            D2.h.f(bVar, "dataBuilder");
            l lVar = (l) l.f8645l.b();
            if (lVar == null) {
                lVar = new l(null);
            }
            lVar.w(c0478d, i3, i4, bVar);
            return lVar;
        }

        private a() {
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C0478d c0478d, int i3, int i4, p059o2.b bVar) {
        View viewU = c0478d.U();
        D2.h.c(viewU);
        super.q(H0.f(viewU), viewU.getId());
        this.f8646h = bVar;
        this.f8647i = i3;
        this.f8648j = i4;
    }

    @Override // P1.d
    public boolean a() {
        return false;
    }

    @Override // P1.d
    public short g() {
        return (short) 0;
    }

    @Override // P1.d
    protected WritableMap j() {
        a aVar = f8644k;
        p059o2.b bVar = this.f8646h;
        D2.h.c(bVar);
        return aVar.a(bVar, this.f8647i, this.f8648j);
    }

    @Override // P1.d
    public String k() {
        return "onGestureHandlerStateChange";
    }

    @Override // P1.d
    public void t() {
        this.f8646h = null;
        this.f8647i = 0;
        this.f8648j = 0;
        f8645l.a(this);
    }

    private l() {
    }
}
