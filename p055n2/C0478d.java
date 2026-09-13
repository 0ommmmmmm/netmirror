package p055n2;

import D2.h;
import D2.s;
import K2.o;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p051m2.f;
import p075s2.AbstractC0486h;

/* JADX INFO: renamed from: n2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0478d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f9965J = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f9966K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f9967L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static short f9968M;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private i f9969A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f9970B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private e f9971C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f9972D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f9973E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f9974F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f9975G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f9976H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f9977I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f9978a = new int[12];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f9980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f9982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f9984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f9985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WritableArray f9989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WritableArray f9990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c[] f9993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f9995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short f9996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f9997t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f9998u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f9999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f10000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f10001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10002y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10003z;

    /* JADX INFO: renamed from: n2.d$a */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0478d c0478d, MotionEvent motionEvent, IllegalArgumentException illegalArgumentException) {
            super(o.f("\n    handler: " + s.a(c0478d.getClass()).a() + "\n    state: " + c0478d.Q() + "\n    view: " + c0478d.U() + "\n    orchestrator: " + c0478d.N() + "\n    isEnabled: " + c0478d.b0() + "\n    isActive: " + c0478d.X() + "\n    isAwaiting: " + c0478d.Y() + "\n    trackedPointersCount: " + c0478d.f9979b + "\n    trackedPointers: " + AbstractC0486h.w(c0478d.f9978a, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + motionEvent + "\n    "), illegalArgumentException);
            h.f(c0478d, "handler");
            h.f(motionEvent, "event");
            h.f(illegalArgumentException, "e");
        }
    }

    /* JADX INFO: renamed from: n2.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float f3) {
            return !Float.isNaN(f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int i3) {
            if (C0478d.f9966K == null) {
                C0478d.f9966K = new MotionEvent.PointerProperties[12];
                C0478d.f9967L = new MotionEvent.PointerCoords[12];
            }
            while (i3 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = C0478d.f9966K;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    h.s("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i4 = i3 - 1;
                if (pointerPropertiesArr[i4] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = C0478d.f9966K;
                if (pointerPropertiesArr2 == null) {
                    h.s("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i4] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = C0478d.f9967L;
                if (pointerCoordsArr2 == null) {
                    h.s("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
                i3--;
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: n2.d$c */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f10006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f10007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f10008e;

        public c(int i3, float f3, float f4, float f5, float f6) {
            this.f10004a = i3;
            this.f10005b = f3;
            this.f10006c = f4;
            this.f10007d = f5;
            this.f10008e = f6;
        }

        public final float a() {
            return this.f10007d;
        }

        public final float b() {
            return this.f10008e;
        }

        public final int c() {
            return this.f10004a;
        }

        public final float d() {
            return this.f10005b;
        }

        public final float e() {
            return this.f10006c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10004a == cVar.f10004a && Float.compare(this.f10005b, cVar.f10005b) == 0 && Float.compare(this.f10006c, cVar.f10006c) == 0 && Float.compare(this.f10007d, cVar.f10007d) == 0 && Float.compare(this.f10008e, cVar.f10008e) == 0;
        }

        public final void f(float f3) {
            this.f10007d = f3;
        }

        public final void g(float f3) {
            this.f10008e = f3;
        }

        public final void h(float f3) {
            this.f10005b = f3;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f10004a) * 31) + Float.hashCode(this.f10005b)) * 31) + Float.hashCode(this.f10006c)) * 31) + Float.hashCode(this.f10007d)) * 31) + Float.hashCode(this.f10008e);
        }

        public final void i(float f3) {
            this.f10006c = f3;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f10004a + ", x=" + this.f10005b + ", y=" + this.f10006c + ", absoluteX=" + this.f10007d + ", absoluteY=" + this.f10008e + ")";
        }
    }

    public C0478d() {
        int[] iArr = new int[2];
        for (int i3 = 0; i3 < 2; i3++) {
            iArr[i3] = 0;
        }
        this.f9980c = iArr;
        this.f9987j = true;
        c[] cVarArr = new c[12];
        for (int i4 = 0; i4 < 12; i4++) {
            cVarArr[i4] = null;
        }
        this.f9993p = cVarArr;
        this.f9972D = 3;
    }

    private final void A() {
        this.f9990m = null;
        for (c cVar : this.f9993p) {
            if (cVar != null) {
                m(cVar);
            }
        }
    }

    private final int C() {
        int[] iArr;
        int i3 = 0;
        while (i3 < this.f9979b) {
            int i4 = 0;
            while (true) {
                iArr = this.f9978a;
                if (i4 >= iArr.length || iArr[i4] == i3) {
                    break;
                }
                i4++;
            }
            if (i4 == iArr.length) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    private final void D0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i3 = 1;
        if (toolType == 1) {
            i3 = 0;
        } else if (toolType != 2) {
            i3 = 3;
            if (toolType == 3) {
                i3 = 2;
            }
        }
        this.f9972D = i3;
    }

    private final Activity F(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return F(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private final boolean Z(int i3) {
        int i4 = this.f9973E;
        if (i4 == 0) {
            return i3 == 1;
        }
        return (i3 & i4) != 0;
    }

    private final void e0(int i3) {
        UiThreadUtil.assertOnUiThread();
        if (this.f9983f == i3) {
            return;
        }
        if (this.f9992o > 0 && (i3 == 5 || i3 == 3 || i3 == 1)) {
            p();
        }
        int i4 = this.f9983f;
        this.f9983f = i3;
        if (i3 == 4) {
            short s3 = f9968M;
            f9968M = (short) (s3 + 1);
            this.f9996s = s3;
        }
        i iVar = this.f9969A;
        h.c(iVar);
        iVar.A(this, i3, i4);
        l0(i3, i4);
    }

    private final boolean f0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f9979b) {
            return true;
        }
        int length = this.f9978a.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = this.f9978a[i3];
            if (i4 != -1 && i4 != i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private final MotionEvent k(MotionEvent motionEvent) {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        if (!f0(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 2;
        int i4 = 0;
        if (actionMasked == 0) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f9978a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f9979b == 1) {
                    i3 = 0;
                } else {
                    i3 = 5;
                }
            }
        } else if (actionMasked == 1) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f9978a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f9979b == 1) {
                    i3 = 1;
                } else {
                    i3 = 6;
                }
            }
        } else if (actionMasked == 5) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f9978a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f9979b == 1) {
                    i3 = 0;
                } else {
                    i3 = 5;
                }
            }
        } else if (actionMasked != 6) {
            i3 = actionMasked;
            actionIndex = -1;
        } else {
            actionIndex = motionEvent.getActionIndex();
            if (this.f9978a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f9979b == 1) {
                    i3 = 1;
                } else {
                    i3 = 6;
                }
            }
        }
        f9965J.d(this.f9979b);
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        int pointerCount = motionEvent.getPointerCount();
        int i5 = i3;
        int i6 = 0;
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i4 >= pointerCount) {
                break;
            }
            int pointerId = motionEvent.getPointerId(i4);
            if (this.f9978a[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr3 = f9966K;
                if (pointerPropertiesArr3 == null) {
                    h.s("pointerProps");
                    pointerPropertiesArr3 = null;
                }
                motionEvent.getPointerProperties(i4, pointerPropertiesArr3[i6]);
                MotionEvent.PointerProperties[] pointerPropertiesArr4 = f9966K;
                if (pointerPropertiesArr4 == null) {
                    h.s("pointerProps");
                    pointerPropertiesArr4 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i6];
                h.c(pointerProperties);
                pointerProperties.id = this.f9978a[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = f9967L;
                if (pointerCoordsArr3 == null) {
                    h.s("pointerCoords");
                } else {
                    pointerCoordsArr2 = pointerCoordsArr3;
                }
                motionEvent.getPointerCoords(i4, pointerCoordsArr2[i6]);
                if (i4 == actionIndex) {
                    i5 |= i6 << 8;
                }
                i6++;
            }
            i4++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr5 = f9966K;
        if (pointerPropertiesArr5 == null) {
            h.s("pointerProps");
            pointerPropertiesArr5 = null;
        }
        if (pointerPropertiesArr5.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = f9967L;
            if (pointerCoordsArr4 == null) {
                h.s("pointerCoords");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = motionEvent.getDownTime();
                    long eventTime = motionEvent.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr6 = f9966K;
                    if (pointerPropertiesArr6 == null) {
                        h.s("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr6;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = f9967L;
                    if (pointerCoordsArr5 == null) {
                        h.s("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i5, i6, pointerPropertiesArr2, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                    float f3 = -rawX;
                    float f4 = -rawY;
                    motionEvent.offsetLocation(f3, f4);
                    motionEventObtain.offsetLocation(f3, f4);
                    return motionEventObtain;
                } catch (IllegalArgumentException e4) {
                    throw new a(this, motionEvent, e4);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = f9967L;
        if (pointerCoordsArr6 == null) {
            h.s("pointerCoords");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = f9966K;
        if (pointerPropertiesArr7 == null) {
            h.s("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr7;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerPropertiesArr.length);
    }

    private final void l(c cVar) {
        if (this.f9989l == null) {
            this.f9989l = Arguments.createArray();
        }
        WritableArray writableArray = this.f9989l;
        h.c(writableArray);
        writableArray.pushMap(s(cVar));
    }

    private final void m(c cVar) {
        if (this.f9990m == null) {
            this.f9990m = Arguments.createArray();
        }
        WritableArray writableArray = this.f9990m;
        h.c(writableArray);
        writableArray.pushMap(s(cVar));
    }

    private final void p() {
        this.f9991n = 4;
        this.f9989l = null;
        A();
        for (c cVar : this.f9993p) {
            if (cVar != null) {
                l(cVar);
            }
        }
        this.f9992o = 0;
        AbstractC0486h.k(this.f9993p, null, 0, 0, 6, null);
        w();
    }

    private final WritableMap s(c cVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", cVar.c());
        writableMapCreateMap.putDouble("x", C0392f0.f(cVar.d()));
        writableMapCreateMap.putDouble("y", C0392f0.f(cVar.e()));
        writableMapCreateMap.putDouble("absoluteX", C0392f0.f(cVar.a()));
        writableMapCreateMap.putDouble("absoluteY", C0392f0.f(cVar.b()));
        return writableMapCreateMap;
    }

    private final void v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f9989l = null;
        this.f9991n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f9993p[pointerId] = new c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f9980c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f9980c[1]);
        this.f9992o++;
        c cVar = this.f9993p[pointerId];
        h.c(cVar);
        l(cVar);
        A();
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(C0478d c0478d) {
        c0478d.o();
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f9989l = null;
        this.f9991n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i3 = 0;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            c cVar = this.f9993p[motionEvent.getPointerId(i4)];
            if (cVar != null && (cVar.d() != motionEvent.getX(i4) || cVar.e() != motionEvent.getY(i4))) {
                cVar.h(motionEvent.getX(i4));
                cVar.i(motionEvent.getY(i4));
                cVar.f((motionEvent2.getX(i4) + rawX) - this.f9980c[0]);
                cVar.g((motionEvent2.getY(i4) + rawY) - this.f9980c[1]);
                l(cVar);
                i3++;
            }
        }
        if (i3 > 0) {
            A();
            w();
        }
    }

    private final void y(MotionEvent motionEvent, MotionEvent motionEvent2) {
        A();
        this.f9989l = null;
        this.f9991n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f9993p[pointerId] = new c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f9980c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f9980c[1]);
        c cVar = this.f9993p[pointerId];
        h.c(cVar);
        l(cVar);
        this.f9993p[pointerId] = null;
        this.f9992o--;
        w();
    }

    public final C0478d A0(int i3) {
        this.f9973E = i3;
        return this;
    }

    public final void B() {
        int i3 = this.f9983f;
        if (i3 == 4 || i3 == 0 || i3 == 2) {
            e0(1);
        }
    }

    public final void B0(boolean z3) {
        this.f9994q = z3;
    }

    public final C0478d C0(r rVar) {
        this.f9970B = rVar;
        return this;
    }

    public final int D() {
        return this.f9988k;
    }

    public final int E() {
        return this.f9974F;
    }

    public final C0478d E0(boolean z3) {
        C0478d c0478dQ0 = q0();
        c0478dQ0.f10002y = z3;
        return c0478dQ0;
    }

    public final void F0(boolean z3) {
        this.f9977I = z3;
    }

    public final short G() {
        return this.f9996s;
    }

    public final void G0(int i3) {
        this.f9981d = i3;
    }

    public final float H() {
        return (this.f9997t + this.f10000w) - this.f9980c[0];
    }

    protected final boolean H0(MotionEvent motionEvent) {
        h.f(motionEvent, "sourceEvent");
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 5 || !(motionEvent.getAction() == 2 || Z(motionEvent.getActionButton()))) {
                return false;
            }
            if (motionEvent.getAction() == 2 && !Z(motionEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float I() {
        return (this.f9998u + this.f10001x) - this.f9980c[1];
    }

    public boolean I0(C0478d c0478d) {
        e eVar;
        h.f(c0478d, "handler");
        if (c0478d == this || (eVar = this.f9971C) == null) {
            return false;
        }
        return eVar.b(this, c0478d);
    }

    public final float J() {
        return this.f9997t;
    }

    public boolean J0(C0478d c0478d) {
        h.f(c0478d, "handler");
        if (c0478d == this) {
            return true;
        }
        e eVar = this.f9971C;
        if (eVar != null) {
            return eVar.c(this, c0478d);
        }
        return false;
    }

    public final float K() {
        return this.f9998u;
    }

    public boolean K0(C0478d c0478d) {
        e eVar;
        h.f(c0478d, "handler");
        if (c0478d == this || (eVar = this.f9971C) == null) {
            return false;
        }
        return eVar.a(this, c0478d);
    }

    public final boolean L() {
        return this.f9994q;
    }

    public final boolean L0(C0478d c0478d) {
        e eVar;
        h.f(c0478d, "handler");
        if (c0478d == this || (eVar = this.f9971C) == null) {
            return false;
        }
        return eVar.d(this, c0478d);
    }

    public final int M() {
        return this.f10003z;
    }

    public final void M0(int i3) {
        int[] iArr = this.f9978a;
        if (iArr[i3] == -1) {
            iArr[i3] = C();
            this.f9979b++;
        }
    }

    protected final i N() {
        return this.f9969A;
    }

    public final void N0(int i3) {
        int[] iArr = this.f9978a;
        if (iArr[i3] != -1) {
            iArr[i3] = -1;
            this.f9979b--;
        }
    }

    public final int O() {
        return this.f9972D;
    }

    protected final PointF O0(PointF pointF) {
        PointF pointFK;
        h.f(pointF, "point");
        i iVar = this.f9969A;
        if (iVar != null && (pointFK = iVar.K(this.f9982e, pointF)) != null) {
            return pointFK;
        }
        pointF.x = Float.NaN;
        pointF.y = Float.NaN;
        return pointF;
    }

    public final boolean P() {
        return this.f9977I;
    }

    public final void P0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            v(motionEvent, motionEvent2);
            x(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            x(motionEvent, motionEvent2);
            y(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 2) {
            x(motionEvent, motionEvent2);
        }
    }

    public final int Q() {
        return this.f9983f;
    }

    public final boolean Q0() {
        int i3;
        return (!this.f9987j || (i3 = this.f9983f) == 1 || i3 == 3 || i3 == 5 || this.f9979b <= 0) ? false : true;
    }

    public final int R() {
        return this.f9981d;
    }

    public final void R0(C2.a aVar) {
        h.f(aVar, "closure");
        this.f9986i = true;
        aVar.a();
        this.f9986i = false;
    }

    public final int S() {
        return this.f9991n;
    }

    public final int T() {
        return this.f9992o;
    }

    public final View U() {
        return this.f9982e;
    }

    public final void V(MotionEvent motionEvent, MotionEvent motionEvent2) {
        int i3;
        h.f(motionEvent, "transformedEvent");
        h.f(motionEvent2, "sourceEvent");
        if (!this.f9987j || (i3 = this.f9983f) == 3 || i3 == 1 || i3 == 5 || this.f9979b < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {k(motionEvent), k(motionEvent2)};
            MotionEvent motionEvent3 = motionEventArr[0];
            MotionEvent motionEvent4 = motionEventArr[1];
            this.f9984g = motionEvent3.getX();
            this.f9985h = motionEvent3.getY();
            this.f10003z = motionEvent3.getPointerCount();
            boolean zD0 = d0(this.f9982e, this.f9984g, this.f9985h);
            this.f9986i = zD0;
            if (this.f10002y && !zD0) {
                int i4 = this.f9983f;
                if (i4 == 4) {
                    o();
                    return;
                } else {
                    if (i4 == 2) {
                        B();
                        return;
                    }
                    return;
                }
            }
            k kVar = k.f10029a;
            this.f9997t = kVar.b(motionEvent3, true);
            this.f9998u = kVar.c(motionEvent3, true);
            this.f10000w = motionEvent3.getRawX() - motionEvent3.getX();
            this.f10001x = motionEvent3.getRawY() - motionEvent3.getY();
            if (motionEvent2.getAction() == 0 || motionEvent2.getAction() == 9 || motionEvent2.getAction() == 7) {
                D0(motionEvent2);
            }
            if (motionEvent2.getAction() == 9 || motionEvent2.getAction() == 7 || motionEvent2.getAction() == 10) {
                i0(motionEvent3, motionEvent4);
            } else {
                h0(motionEvent3, motionEvent4);
            }
            if (!h.b(motionEvent3, motionEvent)) {
                motionEvent3.recycle();
            }
            if (h.b(motionEvent4, motionEvent2)) {
                return;
            }
            motionEvent4.recycle();
        } catch (a unused) {
            B();
        }
    }

    public final boolean W(C0478d c0478d) {
        h.f(c0478d, "other");
        int length = this.f9978a.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f9978a[i3] != -1 && c0478d.f9978a[i3] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean X() {
        return this.f9975G;
    }

    public final boolean Y() {
        return this.f9976H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a0(p055n2.C0478d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            D2.h.f(r4, r0)
            android.view.View r0 = r3.f9982e
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L2f
            android.view.View r2 = r4.f9982e
            boolean r2 = D2.h.b(r0, r2)
            if (r2 == 0) goto L24
            r4 = 1
            return r4
        L24:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L2f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p055n2.C0478d.a0(n2.d):boolean");
    }

    public final boolean b0() {
        return this.f9987j;
    }

    public final boolean c0() {
        return this.f9986i;
    }

    public final boolean d0(View view, float f3, float f4) {
        float f5;
        f.a aVar = f.f9841a;
        h.c(view);
        if (aVar.b(view)) {
            return aVar.a(view, f3, f4);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f9995r;
        float f6 = 0.0f;
        if (fArr != null) {
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            b bVar = f9965J;
            float f11 = bVar.c(f7) ? 0.0f - f7 : 0.0f;
            f6 = bVar.c(f8) ? 0.0f - f8 : 0.0f;
            if (bVar.c(f9)) {
                width += f9;
            }
            if (bVar.c(f10)) {
                height += f10;
            }
            float f12 = fArr[4];
            float f13 = fArr[5];
            if (bVar.c(f12)) {
                if (!bVar.c(f7)) {
                    f11 = width - f12;
                } else if (!bVar.c(f9)) {
                    width = f12 + f11;
                }
            }
            if (bVar.c(f13)) {
                if (!bVar.c(f8)) {
                    f6 = height - f13;
                } else if (!bVar.c(f10)) {
                    height = f13 + f6;
                }
            }
            f5 = f6;
            f6 = f11;
        } else {
            f5 = 0.0f;
        }
        return f6 <= f3 && f3 <= width && f5 <= f4 && f4 <= height;
    }

    protected void g0() {
    }

    protected void h0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
        e0(1);
    }

    public final void i() {
        j(false);
    }

    protected void i0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        h.f(motionEvent, "event");
        h.f(motionEvent2, "sourceEvent");
    }

    public void j(boolean z3) {
        if (!this.f9999v || z3) {
            int i3 = this.f9983f;
            if (i3 == 0 || i3 == 2) {
                e0(4);
            }
        }
    }

    protected void j0() {
    }

    protected void k0() {
    }

    protected void l0(int i3, int i4) {
    }

    public final void m0(View view, i iVar) {
        if (this.f9982e != null || this.f9969A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f9978a, -1);
        this.f9979b = 0;
        this.f9983f = 0;
        this.f9982e = view;
        this.f9969A = iVar;
        Activity activityF = F(view != null ? view.getContext() : null);
        View viewFindViewById = activityF != null ? activityF.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.f9980c);
        } else {
            int[] iArr = this.f9980c;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        j0();
    }

    public final void n() {
        if (this.f9983f == 0) {
            e0(2);
        }
    }

    public final void n0() {
        this.f9982e = null;
        this.f9969A = null;
        Arrays.fill(this.f9978a, -1);
        this.f9979b = 0;
        this.f9992o = 0;
        AbstractC0486h.k(this.f9993p, null, 0, 0, 6, null);
        this.f9991n = 0;
        k0();
    }

    public final void o() {
        int i3 = this.f9983f;
        if (i3 == 4 || i3 == 0 || i3 == 2 || this.f9976H) {
            g0();
            e0(3);
        }
    }

    public void o0() {
        this.f9994q = false;
        this.f9999v = false;
        this.f10002y = false;
        this.f9987j = true;
        this.f9995r = null;
    }

    public void p0() {
    }

    public final WritableArray q() {
        WritableArray writableArray = this.f9990m;
        this.f9990m = null;
        return writableArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C0478d q0() {
        h.d(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    public final WritableArray r() {
        WritableArray writableArray = this.f9989l;
        this.f9989l = null;
        return writableArray;
    }

    public final void r0(int i3) {
        this.f9988k = i3;
    }

    public final void s0(int i3) {
        this.f9974F = i3;
    }

    public void t(MotionEvent motionEvent) {
        h.f(motionEvent, "event");
        r rVar = this.f9970B;
        if (rVar != null) {
            rVar.c(q0(), motionEvent);
        }
    }

    public final void t0(boolean z3) {
        this.f9975G = z3;
    }

    public String toString() {
        String simpleName;
        View view = this.f9982e;
        if (view == null) {
            simpleName = null;
        } else {
            h.c(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f9981d + "]:" + simpleName;
    }

    public void u(int i3, int i4) {
        r rVar = this.f9970B;
        if (rVar != null) {
            rVar.a(q0(), i3, i4);
        }
    }

    public final void u0(boolean z3) {
        this.f9976H = z3;
    }

    public final C0478d v0(boolean z3) {
        final C0478d c0478dQ0 = q0();
        if (c0478dQ0.f9982e != null && c0478dQ0.f9987j != z3) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: n2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0478d.w0(this.f9964b);
                }
            });
        }
        c0478dQ0.f9987j = z3;
        return c0478dQ0;
    }

    public void w() {
        r rVar;
        if (this.f9989l == null || (rVar = this.f9970B) == null) {
            return;
        }
        rVar.b(q0());
    }

    public final C0478d x0(float f3, float f4, float f5, float f6, float f7, float f8) {
        C0478d c0478dQ0 = q0();
        if (c0478dQ0.f9995r == null) {
            c0478dQ0.f9995r = new float[6];
        }
        float[] fArr = c0478dQ0.f9995r;
        h.c(fArr);
        fArr[0] = f3;
        float[] fArr2 = c0478dQ0.f9995r;
        h.c(fArr2);
        fArr2[1] = f4;
        float[] fArr3 = c0478dQ0.f9995r;
        h.c(fArr3);
        fArr3[2] = f5;
        float[] fArr4 = c0478dQ0.f9995r;
        h.c(fArr4);
        fArr4[3] = f6;
        float[] fArr5 = c0478dQ0.f9995r;
        h.c(fArr5);
        fArr5[4] = f7;
        float[] fArr6 = c0478dQ0.f9995r;
        h.c(fArr6);
        fArr6[5] = f8;
        b bVar = f9965J;
        if (bVar.c(f7) && bVar.c(f3) && bVar.c(f5)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f7) && !bVar.c(f3) && !bVar.c(f5)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f8) && bVar.c(f6) && bVar.c(f4)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!bVar.c(f8) || bVar.c(f6) || bVar.c(f4)) {
            return c0478dQ0;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    public final C0478d y0(e eVar) {
        C0478d c0478dQ0 = q0();
        c0478dQ0.f9971C = eVar;
        return c0478dQ0;
    }

    public final void z() {
        int i3 = this.f9983f;
        if (i3 == 2 || i3 == 4) {
            e0(5);
        }
    }

    public final C0478d z0(boolean z3) {
        C0478d c0478dQ0 = q0();
        c0478dQ0.f9999v = z3;
        return c0478dQ0;
    }
}
