package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p055n2.C0478d;

/* JADX INFO: loaded from: classes.dex */
public final class m extends P1.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f8649j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p064q.f f8650k = new p064q.f(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WritableMap f8651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short f8652i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(C0478d c0478d) {
            D2.h.f(c0478d, "handler");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", c0478d.R());
            writableMapCreateMap.putInt("state", c0478d.Q());
            writableMapCreateMap.putInt("numberOfTouches", c0478d.T());
            writableMapCreateMap.putInt("eventType", c0478d.S());
            writableMapCreateMap.putInt("pointerType", c0478d.O());
            WritableArray writableArrayR = c0478d.r();
            if (writableArrayR != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayR);
            }
            WritableArray writableArrayQ = c0478d.q();
            if (writableArrayQ != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayQ);
            }
            if (c0478d.Y() && c0478d.Q() == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            D2.h.e(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final m b(C0478d c0478d) {
            D2.h.f(c0478d, "handler");
            m mVar = (m) m.f8650k.b();
            if (mVar == null) {
                mVar = new m(null);
            }
            mVar.w(c0478d);
            return mVar;
        }

        private a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(C0478d c0478d) {
        View viewU = c0478d.U();
        D2.h.c(viewU);
        super.q(H0.f(viewU), viewU.getId());
        this.f8651h = f8649j.a(c0478d);
        this.f8652i = c0478d.G();
    }

    @Override // P1.d
    public boolean a() {
        return true;
    }

    @Override // P1.d
    public short g() {
        return this.f8652i;
    }

    @Override // P1.d
    protected WritableMap j() {
        return this.f8651h;
    }

    @Override // P1.d
    public String k() {
        return "onGestureHandlerEvent";
    }

    @Override // P1.d
    public void t() {
        this.f8651h = null;
        f8650k.a(this);
    }

    private m() {
    }
}
