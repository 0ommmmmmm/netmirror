package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0384b0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.M;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = NativeAnimatedModuleSpec.NAME)
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final M mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.o> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final A mOperations;
    private final A mPreOperations;
    private final com.facebook.react.modules.core.b mReactChoreographer;
    private int mUIManagerType;

    private class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f6279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private B f6280b;

        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0037 A[LOOP:0: B:6:0x000d->B:19:0x0037, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x0036 A[EDGE_INSN: B:22:0x0036->B:18:0x0036 BREAK  A[LOOP:0: B:6:0x000d->B:19:0x0037], SYNTHETIC] */
        private List b(long j3) {
            B b4;
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                B b5 = this.f6280b;
                if (b5 != null) {
                    if (b5.b() <= j3) {
                        arrayList.add(this.f6280b);
                        this.f6280b = null;
                        b4 = (B) this.f6279a.poll();
                        if (b4 != null) {
                            break;
                            break;
                        }
                        if (b4.b() > j3) {
                            this.f6280b = b4;
                            break;
                        }
                        arrayList.add(b4);
                    } else {
                        break;
                    }
                } else {
                    b4 = (B) this.f6279a.poll();
                    if (b4 != null) {
                        break;
                    }
                    if (b4.b() > j3) {
                        this.f6280b = b4;
                        break;
                    }
                    arrayList.add(b4);
                }
            }
            return arrayList;
        }

        void a(B b4) {
            this.f6279a.add(b4);
        }

        void c(long j3, com.facebook.react.animated.o oVar) {
            List listB = b(j3);
            if (listB != null) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    ((B) it.next()).a(oVar);
                }
            }
        }

        boolean d() {
            return this.f6279a.isEmpty() && this.f6280b == null;
        }

        private A() {
            this.f6279a = new ConcurrentLinkedQueue();
            this.f6280b = null;
        }
    }

    private abstract class B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f6282a;

        abstract void a(com.facebook.react.animated.o oVar);

        public long b() {
            return this.f6282a;
        }

        public void c(long j3) {
            this.f6282a = j3;
        }

        private B() {
            this.f6282a = -1L;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$a, reason: case insensitive filesystem */
    class C0329a extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f6285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0329a(int i3, double d4) {
            super();
            this.f6284c = i3;
            this.f6285d = d4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.w(this.f6284c, this.f6285d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$b, reason: case insensitive filesystem */
    class C0330b extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f6288d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0330b(int i3, double d4) {
            super();
            this.f6287c = i3;
            this.f6288d = d4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.v(this.f6287c, this.f6288d);
        }
    }

    class c extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i3) {
            super();
            this.f6290c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.k(this.f6290c);
        }
    }

    class d extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i3) {
            super();
            this.f6292c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.j(this.f6292c);
        }
    }

    class e extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f6296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callback f6297f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i3, int i4, ReadableMap readableMap, Callback callback) {
            super();
            this.f6294c = i3;
            this.f6295d = i4;
            this.f6296e = readableMap;
            this.f6297f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.x(this.f6294c, this.f6295d, this.f6296e, this.f6297f);
        }
    }

    class f extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i3) {
            super();
            this.f6299c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.z(this.f6299c);
        }
    }

    class g extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6302d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i3, int i4) {
            super();
            this.f6301c = i3;
            this.f6302d = i4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.e(this.f6301c, this.f6302d);
        }
    }

    class h extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6305d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i3, int i4) {
            super();
            this.f6304c = i3;
            this.f6305d = i4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.h(this.f6304c, this.f6305d);
        }
    }

    class i extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6308d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i3, int i4) {
            super();
            this.f6307c = i3;
            this.f6308d = i4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.d(this.f6307c, this.f6308d);
        }
    }

    class j extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i3, int i4) {
            super();
            this.f6310c = i3;
            this.f6311d = i4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.g(this.f6310c, this.f6311d);
        }
    }

    class k extends M {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.M
        protected void a(long j3) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                com.facebook.react.animated.o nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.p()) {
                    nodesManager.u(j3);
                }
                if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!p070r1.b.m() || nodesManager.p()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    class l extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6314c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i3) {
            super();
            this.f6314c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.t(this.f6314c);
        }
    }

    class m extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f6318e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i3, String str, ReadableMap readableMap) {
            super();
            this.f6316c = i3;
            this.f6317d = str;
            this.f6318e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.c(this.f6316c, this.f6317d, this.f6318e);
        }
    }

    class n extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i3, String str, int i4) {
            super();
            this.f6320c = i3;
            this.f6321d = str;
            this.f6322e = i4;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.s(this.f6320c, this.f6321d, this.f6322e);
        }
    }

    class o extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f6325d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i3, Callback callback) {
            super();
            this.f6324c = i3;
            this.f6325d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.n(this.f6324c, this.f6325d);
        }
    }

    class p extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableArray f6328d;

        class a implements com.facebook.react.animated.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f6330a;

            a(int i3) {
                this.f6330a = i3;
            }

            @Override // com.facebook.react.animated.c
            public void a(double d4) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("tag", this.f6330a);
                writableMapCreateMap.putDouble("value", d4);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i3, ReadableArray readableArray) {
            super();
            this.f6327c = i3;
            this.f6328d = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i3 = 0;
            while (i3 < this.f6327c) {
                int i4 = i3 + 1;
                switch (q.f6332a[z.b(this.f6328d.getInt(i3)).ordinal()]) {
                    case 1:
                        i3 += 2;
                        oVar.n(this.f6328d.getInt(i4), null);
                        break;
                    case 2:
                        i3 += 2;
                        int i5 = this.f6328d.getInt(i4);
                        oVar.y(i5, new a(i5));
                        break;
                    case 3:
                        i3 += 2;
                        oVar.B(this.f6328d.getInt(i4));
                        break;
                    case 4:
                        i3 += 2;
                        oVar.z(this.f6328d.getInt(i4));
                        break;
                    case 5:
                        i3 += 2;
                        oVar.k(this.f6328d.getInt(i4));
                        break;
                    case 6:
                        i3 += 2;
                        oVar.j(this.f6328d.getInt(i4));
                        break;
                    case 7:
                        i3 += 2;
                        oVar.t(this.f6328d.getInt(i4));
                        break;
                    case 8:
                        i3 += 2;
                        oVar.i(this.f6328d.getInt(i4));
                        break;
                    case 9:
                    case 10:
                        i3 += 2;
                        break;
                    case 11:
                        int i6 = i3 + 2;
                        i3 += 3;
                        oVar.f(this.f6328d.getInt(i4), this.f6328d.getMap(i6));
                        break;
                    case 12:
                        int i7 = i3 + 2;
                        i3 += 3;
                        oVar.C(this.f6328d.getInt(i4), this.f6328d.getMap(i7));
                        break;
                    case 13:
                        int i8 = i3 + 2;
                        i3 += 3;
                        oVar.e(this.f6328d.getInt(i4), this.f6328d.getInt(i8));
                        break;
                    case 14:
                        int i9 = i3 + 2;
                        i3 += 3;
                        oVar.h(this.f6328d.getInt(i4), this.f6328d.getInt(i9));
                        break;
                    case 15:
                        int i10 = i3 + 2;
                        i3 += 3;
                        oVar.w(this.f6328d.getInt(i4), this.f6328d.getDouble(i10));
                        break;
                    case 16:
                        int i11 = i3 + 2;
                        i3 += 3;
                        oVar.w(this.f6328d.getInt(i4), this.f6328d.getDouble(i11));
                        break;
                    case 17:
                        int i12 = i3 + 2;
                        int i13 = this.f6328d.getInt(i4);
                        i3 += 3;
                        int i14 = this.f6328d.getInt(i12);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i14);
                        oVar.g(i13, i14);
                        break;
                    case 18:
                        if (p070r1.b.m()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i15 = this.f6328d.getInt(i4);
                        int i16 = i3 + 3;
                        int i17 = this.f6328d.getInt(i3 + 2);
                        i3 += 4;
                        oVar.x(i15, i17, this.f6328d.getMap(i16), null);
                        break;
                    case 19:
                        int i18 = this.f6328d.getInt(i4);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i18);
                        int i19 = i3 + 3;
                        String string = this.f6328d.getString(i3 + 2);
                        i3 += 4;
                        oVar.s(i18, string, this.f6328d.getInt(i19));
                        break;
                    case 20:
                        int i20 = i3 + 2;
                        i3 += 3;
                        oVar.d(this.f6328d.getInt(i4), this.f6328d.getInt(i20));
                        break;
                    case 21:
                        int i21 = this.f6328d.getInt(i4);
                        int i22 = i3 + 3;
                        String string2 = this.f6328d.getString(i3 + 2);
                        i3 += 4;
                        oVar.c(i21, string2, this.f6328d.getMap(i22));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    static /* synthetic */ class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6332a;

        static {
            int[] iArr = new int[z.values().length];
            f6332a = iArr;
            try {
                iArr[z.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6332a[z.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6332a[z.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6332a[z.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6332a[z.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6332a[z.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6332a[z.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6332a[z.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6332a[z.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6332a[z.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6332a[z.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6332a[z.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6332a[z.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6332a[z.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6332a[z.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6332a[z.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6332a[z.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6332a[z.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f6332a[z.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6332a[z.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6332a[z.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    class r implements F0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6333a;

        r(long j3) {
            this.f6333a = j3;
        }

        @Override // com.facebook.react.uimanager.F0
        public void a(C0384b0 c0384b0) {
            NativeAnimatedModule.this.mPreOperations.c(this.f6333a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class s implements F0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6335a;

        s(long j3) {
            this.f6335a = j3;
        }

        @Override // com.facebook.react.uimanager.F0
        public void a(C0384b0 c0384b0) {
            NativeAnimatedModule.this.mOperations.c(this.f6335a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class t extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f6338d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i3, ReadableMap readableMap) {
            super();
            this.f6337c = i3;
            this.f6338d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.f(this.f6337c, this.f6338d);
        }
    }

    class u extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f6341d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i3, ReadableMap readableMap) {
            super();
            this.f6340c = i3;
            this.f6341d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.C(this.f6340c, this.f6341d);
        }
    }

    class v implements com.facebook.react.animated.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6343a;

        v(int i3) {
            this.f6343a = i3;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d4) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", this.f6343a);
            writableMapCreateMap.putDouble("value", d4);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }
    }

    class w extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f6346d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i3, com.facebook.react.animated.c cVar) {
            super();
            this.f6345c = i3;
            this.f6346d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.y(this.f6345c, this.f6346d);
        }
    }

    class x extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i3) {
            super();
            this.f6348c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.B(this.f6348c);
        }
    }

    class y extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(int i3) {
            super();
            this.f6350c = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.o oVar) {
            oVar.i(this.f6350c);
        }
    }

    private enum z {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);


        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static z[] f6373x = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6375b;

        z(int i3) {
            this.f6375b = i3;
        }

        public static z b(int i3) {
            if (f6373x == null) {
                f6373x = values();
            }
            return f6373x[i3 - 1];
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new A();
        this.mPreOperations = new A();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.b.h();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(B b4) {
        b4.c(this.mCurrentBatchNumber);
        this.mOperations.a(b4);
    }

    private void addPreOperation(B b4) {
        b4.c(this.mCurrentBatchNumber);
        this.mPreOperations.a(b4);
    }

    private void addUnbatchedOperation(B b4) {
        b4.c(-1L);
        this.mOperations.a(b4);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.b) p002a1.a.c(this.mReactChoreographer)).n(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i3) {
        if (M1.a.a(i3) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i4 = this.mNumNonFabricAnimations;
        if (i4 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i4 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((com.facebook.react.modules.core.b) p002a1.a.c(this.mReactChoreographer)).k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i3) {
        UIManager uIManagerG;
        int iA = M1.a.a(i3);
        this.mUIManagerType = iA;
        if (iA == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.o nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.q(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManagerG = H0.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        uIManagerG.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d4, String str, ReadableMap readableMap) {
        int i3 = (int) d4;
        initializeLifecycleEventListenersForViewTag(i3);
        addOperation(new m(i3, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d4, double d5) {
        int i3 = (int) d5;
        initializeLifecycleEventListenersForViewTag(i3);
        addOperation(new i((int) d4, i3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d4, double d5) {
        addOperation(new g((int) d4, (int) d5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d4, ReadableMap readableMap) {
        addOperation(new t((int) d4, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j3 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j3 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.c(j3, getNodesManager());
        this.mOperations.c(j3, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d4, double d5) {
        int i3 = (int) d5;
        decrementInFlightAnimationsForViewTag(i3);
        addOperation(new j((int) d4, i3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d4, double d5) {
        addOperation(new h((int) d4, (int) d5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d4) {
        addOperation(new y((int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d4) {
        addOperation(new d((int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d4) {
        addOperation(new c((int) d4));
    }

    public com.facebook.react.animated.o getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            com.facebook.jni.a.a(this.mNodesManager, null, new com.facebook.react.animated.o(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d4, Callback callback) {
        addOperation(new o((int) d4, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            switch (q.f6332a[z.b(readableArray.getInt(i3)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i3 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i3 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i5 = i3 + 2;
                    i3 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i5));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i4));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i3 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, readableArray));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d4, String str, double d5) {
        int i3 = (int) d4;
        decrementInFlightAnimationsForViewTag(i3);
        addOperation(new n(i3, str, (int) d5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d4) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d4) {
        addPreOperation(new l((int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d4, double d5) {
        addOperation(new C0330b((int) d4, d5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d4, double d5) {
        addOperation(new C0329a((int) d4, d5));
    }

    public void setNodesManager(com.facebook.react.animated.o oVar) {
        this.mNodesManager.set(oVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d4, double d5, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new e((int) d4, (int) d5, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d4) {
        int i3 = (int) d4;
        addOperation(new w(i3, new v(i3)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d4) {
        addOperation(new f((int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d4) {
        addOperation(new x((int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d4, ReadableMap readableMap) {
        addOperation(new u((int) d4, readableMap));
    }

    public void userDrivenScrollEnded(int i3) {
        com.facebook.react.animated.o oVar = this.mNodesManager.get();
        if (oVar == null) {
            return;
        }
        Set setM = oVar.m(i3, "topScrollEnded");
        if (setM.isEmpty()) {
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = setM.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushInt(((Integer) it.next()).intValue());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.d() && this.mPreOperations.d()) || this.mUIManagerType == 2) {
            return;
        }
        long j3 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j3;
        r rVar = new r(j3);
        s sVar = new s(j3);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(rVar);
        uIManagerModule.addUIBlock(sVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
