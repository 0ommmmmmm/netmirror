package p047l2;

import D2.h;
import P1.d;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9719i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WritableMap f9720h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i3, WritableMap writableMap) {
        super(i3);
        h.f(writableMap, "mData");
        this.f9720h = writableMap;
        writableMap.putString("navigationType", "other");
        writableMap.putBoolean("isTopFrame", true);
    }

    @Override // P1.d
    public boolean a() {
        return false;
    }

    @Override // P1.d
    public void c(RCTEventEmitter rCTEventEmitter) {
        h.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(o(), "topShouldStartLoadWithRequest", this.f9720h);
    }

    @Override // P1.d
    public short g() {
        return (short) 0;
    }

    @Override // P1.d
    public String k() {
        return "topShouldStartLoadWithRequest";
    }
}
