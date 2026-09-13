package p047l2;

import D2.h;
import P1.d;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0136a f9701i = new C0136a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WritableMap f9702h;

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name */
    public static final class C0136a {
        public /* synthetic */ C0136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0136a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i3, WritableMap writableMap) {
        super(i3);
        h.f(writableMap, "mEventData");
        this.f9702h = writableMap;
    }

    @Override // P1.d
    public boolean a() {
        return false;
    }

    @Override // P1.d
    public void c(RCTEventEmitter rCTEventEmitter) {
        h.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(o(), k(), this.f9702h);
    }

    @Override // P1.d
    public short g() {
        return (short) 0;
    }

    @Override // P1.d
    public String k() {
        return "topCustomMenuSelection";
    }
}
