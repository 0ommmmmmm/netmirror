package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.a0;
import p055n2.B;
import p055n2.C0476b;
import p055n2.C0478d;
import p055n2.o;
import p055n2.p;
import p055n2.q;
import p055n2.r;
import p055n2.t;
import p055n2.u;
import p055n2.x;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "RNGestureHandlerModule")
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec {
    public static final a Companion = new a(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String NAME = "RNGestureHandlerModule";
    private final l eventListener;
    private final c[] handlerFactories;
    private final com.swmansion.gesturehandler.react.e interactionManager;
    private final p051m2.h reanimatedEventDispatcher;
    private final com.swmansion.gesturehandler.react.h registry;
    private final List<com.swmansion.gesturehandler.react.j> roots;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(C0478d c0478d, ReadableMap readableMap) {
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float fG = C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                c0478d.x0(fG, fG, fG, fG, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            D2.h.c(map);
            float fG2 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL) ? C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
            float fG3 = fG2;
            float fG4 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL) ? C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
            float fG5 = fG4;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT)) {
                fG2 = C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT));
            }
            float f3 = fG2;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_TOP)) {
                fG4 = C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_TOP));
            }
            float f4 = fG4;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT)) {
                fG3 = C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT));
            }
            float f5 = fG3;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM)) {
                fG5 = C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM));
            }
            c0478d.x0(f3, f4, f5, fG5, map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_WIDTH) ? C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_WIDTH)) : Float.NaN, map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HEIGHT) ? C0392f0.g(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
        }

        private a() {
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8599a = C0476b.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8600b = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8600b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8599a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(C0476b c0476b, ReadableMap readableMap) {
            D2.h.f(c0476b, "handler");
            D2.h.f(readableMap, "config");
            super.a(c0476b, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                c0476b.X0(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                c0476b.W0(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0476b b(Context context) {
            return new C0476b();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public p059o2.a c(C0476b c0476b) {
            D2.h.f(c0476b, "handler");
            return new p059o2.a(c0476b);
        }
    }

    private static abstract class c {
        public void a(C0478d c0478d, ReadableMap readableMap) {
            D2.h.f(c0478d, "handler");
            D2.h.f(readableMap, "config");
            c0478d.o0();
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                c0478d.E0(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                c0478d.v0(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.b(c0478d, readableMap);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                c0478d.B0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                c0478d.z0(readableMap.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
            if (readableMap.hasKey("mouseButton")) {
                c0478d.A0(readableMap.getInt("mouseButton"));
            }
        }

        public abstract C0478d b(Context context);

        public abstract p059o2.b c(C0478d c0478d);

        public abstract String d();

        public abstract Class e();
    }

    private static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8601a = p055n2.m.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8602b = "HoverGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8602b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8601a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public p055n2.m b(Context context) {
            return new p055n2.m();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p059o2.c c(p055n2.m mVar) {
            D2.h.f(mVar, "handler");
            return new p059o2.c(mVar);
        }
    }

    private static final class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8603a = o.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8604b = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8604b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8603a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, ReadableMap readableMap) {
            D2.h.f(oVar, "handler");
            D2.h.f(readableMap, "config");
            super.a(oVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                oVar.Y0(readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                oVar.X0(C0392f0.g(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                oVar.Z0(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o b(Context context) {
            D2.h.c(context);
            return new o(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public p059o2.d c(o oVar) {
            D2.h.f(oVar, "handler");
            return new p059o2.d(oVar);
        }
    }

    private static final class f extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8605a = p.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8606b = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8606b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8605a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public p b(Context context) {
            return new p();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p059o2.e c(p pVar) {
            D2.h.f(pVar, "handler");
            return new p059o2.e(pVar);
        }
    }

    private static final class g extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8607a = q.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8608b = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8608b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8607a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, ReadableMap readableMap) {
            D2.h.f(qVar, "handler");
            D2.h.f(readableMap, "config");
            super.a(qVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                qVar.U0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                qVar.T0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public q b(Context context) {
            return new q();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public p059o2.f c(q qVar) {
            D2.h.f(qVar, "handler");
            return new p059o2.f(qVar);
        }
    }

    private static final class h extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8609a = t.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8610b = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8610b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8609a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, ReadableMap readableMap) {
            boolean z3;
            D2.h.f(tVar, "handler");
            D2.h.f(readableMap, "config");
            super.a(tVar, readableMap);
            boolean z4 = true;
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                tVar.b1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z3 = true;
            } else {
                z3 = false;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                tVar.a1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                tVar.g1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                tVar.f1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                tVar.d1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                tVar.c1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                tVar.i1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                tVar.h1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                tVar.m1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                tVar.n1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z3 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                tVar.o1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z4 = z3;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                tVar.k1(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z4) {
                tVar.k1(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                tVar.l1(readableMap.getInt("minPointers"));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                tVar.j1(readableMap.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                tVar.e1(readableMap.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                tVar.Z0(readableMap.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t b(Context context) {
            return new t(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public p059o2.g c(t tVar) {
            D2.h.f(tVar, "handler");
            return new p059o2.g(tVar);
        }
    }

    private static final class i extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8611a = u.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8612b = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8612b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8611a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public u b(Context context) {
            return new u();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p059o2.h c(u uVar) {
            D2.h.f(uVar, "handler");
            return new p059o2.h(uVar);
        }
    }

    private static final class j extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8613a = x.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8614b = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8614b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8613a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public x b(Context context) {
            return new x();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p059o2.i c(x xVar) {
            D2.h.f(xVar, "handler");
            return new p059o2.i(xVar);
        }
    }

    private static final class k extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8615a = B.class;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8616b = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f8616b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f8615a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(B b4, ReadableMap readableMap) {
            D2.h.f(b4, "handler");
            D2.h.f(readableMap, "config");
            super.a(b4, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                b4.b1(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                b4.X0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                b4.V0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                b4.Y0(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                b4.Z0(C0392f0.g(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                b4.W0(C0392f0.g(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                b4.a1(readableMap.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public B b(Context context) {
            return new B();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public p059o2.j c(B b4) {
            D2.h.f(b4, "handler");
            return new p059o2.j(b4);
        }
    }

    public static final class l implements r {
        l() {
        }

        @Override // p055n2.r
        public void a(C0478d c0478d, int i3, int i4) {
            D2.h.f(c0478d, "handler");
            RNGestureHandlerModule.this.onStateChange(c0478d, i3, i4);
        }

        @Override // p055n2.r
        public void b(C0478d c0478d) {
            D2.h.f(c0478d, "handler");
            RNGestureHandlerModule.this.onTouchEvent(c0478d);
        }

        @Override // p055n2.r
        public void c(C0478d c0478d, MotionEvent motionEvent) {
            D2.h.f(c0478d, "handler");
            D2.h.f(motionEvent, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(c0478d);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new l();
        this.handlerFactories = new c[]{new g(), new k(), new e(), new h(), new i(), new j(), new b(), new f(), new d()};
        this.registry = new com.swmansion.gesturehandler.react.h();
        this.interactionManager = new com.swmansion.gesturehandler.react.e();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new p051m2.h();
    }

    private final <T extends C0478d> void createGestureHandlerHelper(String str, int i3, ReadableMap readableMap) {
        if (this.registry.h(i3) != null) {
            throw new IllegalStateException("Handler with tag " + i3 + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        for (c cVar : this.handlerFactories) {
            if (D2.h.b(cVar.d(), str)) {
                C0478d c0478dB = cVar.b(getReactApplicationContext());
                c0478dB.G0(i3);
                c0478dB.C0(this.eventListener);
                this.registry.j(c0478dB);
                this.interactionManager.e(c0478dB, readableMap);
                cVar.a(c0478dB, readableMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
    }

    private final native void decorateRuntime(long j3);

    private final <T extends C0478d> c findFactoryForHandler(C0478d c0478d) {
        for (c cVar : this.handlerFactories) {
            if (D2.h.b(cVar.e(), c0478d.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    private final com.swmansion.gesturehandler.react.j findRootHelperForViewAncestor(int i3) {
        com.swmansion.gesturehandler.react.j jVar;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        D2.h.e(reactApplicationContext, "getReactApplicationContext(...)");
        int iResolveRootTagFromReactTag = com.swmansion.gesturehandler.react.a.b(reactApplicationContext).resolveRootTagFromReactTag(i3);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                for (Object obj2 : this.roots) {
                    com.swmansion.gesturehandler.react.j jVar2 = (com.swmansion.gesturehandler.react.j) obj2;
                    if ((jVar2.f() instanceof a0) && ((a0) jVar2.f()).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = obj2;
                        break;
                    }
                }
                jVar = (com.swmansion.gesturehandler.react.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$2(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.t("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            D2.h.c(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C0478d> void onHandlerUpdate(T t3) {
        c cVarFindFactoryForHandler;
        if (t3.R() >= 0 && t3.Q() == 4 && (cVarFindFactoryForHandler = findFactoryForHandler(t3)) != null) {
            if (t3.D() == 1) {
                sendEventForReanimated(com.swmansion.gesturehandler.react.d.a.c(com.swmansion.gesturehandler.react.d.f8618k, t3, cVarFindFactoryForHandler.c(t3), false, 4, null));
                return;
            }
            if (t3.D() == 2) {
                sendEventForNativeAnimatedEvent(com.swmansion.gesturehandler.react.d.f8618k.b(t3, cVarFindFactoryForHandler.c(t3), true));
            } else if (t3.D() == 3) {
                sendEventForDeviceEvent("onGestureHandlerEvent", com.swmansion.gesturehandler.react.d.f8618k.a(cVarFindFactoryForHandler.c(t3)));
            } else if (t3.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", com.swmansion.gesturehandler.react.d.f8618k.a(cVarFindFactoryForHandler.c(t3)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C0478d> void onStateChange(T t3, int i3, int i4) {
        c cVarFindFactoryForHandler;
        if (t3.R() >= 0 && (cVarFindFactoryForHandler = findFactoryForHandler(t3)) != null) {
            if (t3.D() == 1) {
                sendEventForReanimated(com.swmansion.gesturehandler.react.l.f8644k.b(t3, i3, i4, cVarFindFactoryForHandler.c(t3)));
                return;
            }
            if (t3.D() == 2 || t3.D() == 3) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", com.swmansion.gesturehandler.react.l.f8644k.a(cVarFindFactoryForHandler.c(t3), i3, i4));
            } else if (t3.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", com.swmansion.gesturehandler.react.l.f8644k.a(cVarFindFactoryForHandler.c(t3), i3, i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C0478d> void onTouchEvent(T t3) {
        if (t3.R() < 0) {
            return;
        }
        if (t3.Q() == 2 || t3.Q() == 4 || t3.Q() == 0 || t3.U() != null) {
            if (t3.D() == 1) {
                sendEventForReanimated(m.f8649j.b(t3));
            } else if (t3.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", m.f8649j.a(t3));
            }
        }
    }

    private final void sendEventForDeviceEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        D2.h.e(reactApplicationContext, "getReactApplicationContext(...)");
        com.swmansion.gesturehandler.react.a.a(reactApplicationContext).emit(str, writableMap);
    }

    private final <T extends P1.d> void sendEventForDirectEvent(T t3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        D2.h.e(reactApplicationContext, "getReactApplicationContext(...)");
        p051m2.g.a(reactApplicationContext, t3);
    }

    private final void sendEventForNativeAnimatedEvent(com.swmansion.gesturehandler.react.d dVar) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        D2.h.e(reactApplicationContext, "getReactApplicationContext(...)");
        p051m2.g.a(reactApplicationContext, dVar);
    }

    private final <T extends P1.d> void sendEventForReanimated(T t3) {
        p051m2.h hVar = this.reanimatedEventDispatcher;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        D2.h.e(reactApplicationContext, "getReactApplicationContext(...)");
        hVar.a(t3, reactApplicationContext);
    }

    private final <T extends C0478d> void updateGestureHandlerHelper(int i3, ReadableMap readableMap) {
        c cVarFindFactoryForHandler;
        C0478d c0478dH = this.registry.h(i3);
        if (c0478dH == null || (cVarFindFactoryForHandler = findFactoryForHandler(c0478dH)) == null) {
            return;
        }
        this.interactionManager.g(i3);
        this.interactionManager.e(c0478dH, readableMap);
        cVarFindFactoryForHandler.a(c0478dH, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double d4, double d5, double d6) {
        int i3 = (int) d4;
        if (this.registry.c(i3, (int) d5, (int) d6)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i3 + " does not exists");
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String str, double d4, ReadableMap readableMap) {
        D2.h.f(str, "handlerName");
        D2.h.f(readableMap, "config");
        createGestureHandlerHelper(str, (int) d4, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double d4) {
        int i3 = (int) d4;
        this.interactionManager.g(i3);
        this.registry.g(i3);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return D.h(p071r2.n.a("State", D.h(p071r2.n.a("UNDETERMINED", 0), p071r2.n.a("BEGAN", 2), p071r2.n.a("ACTIVE", 4), p071r2.n.a("CANCELLED", 3), p071r2.n.a("FAILED", 1), p071r2.n.a("END", 5))), p071r2.n.a("Direction", D.h(p071r2.n.a("RIGHT", 1), p071r2.n.a("LEFT", 2), p071r2.n.a("UP", 4), p071r2.n.a("DOWN", 8))));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final com.swmansion.gesturehandler.react.h getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double d4, boolean z3) {
        int i3 = (int) d4;
        com.swmansion.gesturehandler.react.j jVarFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i3);
        if (jVarFindRootHelperForViewAncestor != null) {
            jVarFindRootHelperForViewAncestor.g(i3, z3);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.f
            @Override // java.lang.Runnable
            public final void run() {
                RNGestureHandlerModule.install$lambda$2(this.f8627b);
            }
        });
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.f();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    int size = this.roots.size();
                    this.roots.get(0).j();
                    if (this.roots.size() >= size) {
                        throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p071r2.r rVar = p071r2.r.f10603a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(com.swmansion.gesturehandler.react.j jVar) {
        D2.h.f(jVar, "root");
        synchronized (this.roots) {
            if (this.roots.contains(jVar)) {
                throw new IllegalStateException("Root helper" + jVar + " already registered");
            }
            this.roots.add(jVar);
        }
    }

    public void setGestureHandlerState(int i3, int i4) {
        C0478d c0478dH = this.registry.h(i3);
        if (c0478dH != null) {
            if (i4 == 1) {
                c0478dH.B();
                return;
            }
            if (i4 == 2) {
                c0478dH.n();
                return;
            }
            if (i4 == 3) {
                c0478dH.o();
            } else if (i4 == 4) {
                c0478dH.j(true);
            } else {
                if (i4 != 5) {
                    return;
                }
                c0478dH.z();
            }
        }
    }

    public final void unregisterRootHelper(com.swmansion.gesturehandler.react.j jVar) {
        D2.h.f(jVar, "root");
        synchronized (this.roots) {
            this.roots.remove(jVar);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double d4, ReadableMap readableMap) {
        D2.h.f(readableMap, "config");
        updateGestureHandlerHelper((int) d4, readableMap);
    }
}
