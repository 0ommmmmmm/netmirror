package P1;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f1709a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1710b = "target";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1711a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1711a = iArr;
        }
    }

    private t() {
    }

    private final WritableMap[] a(q qVar) {
        MotionEvent motionEventW = qVar.w();
        WritableMap[] writableMapArr = new WritableMap[motionEventW.getPointerCount()];
        float x3 = motionEventW.getX() - qVar.y();
        float y3 = motionEventW.getY() - qVar.z();
        int pointerCount = motionEventW.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            C0392f0 c0392f0 = C0392f0.f7477a;
            writableMapCreateMap.putDouble("pageX", c0392f0.d(motionEventW.getX(i3)));
            writableMapCreateMap.putDouble("pageY", c0392f0.d(motionEventW.getY(i3)));
            float x4 = motionEventW.getX(i3) - x3;
            float y4 = motionEventW.getY(i3) - y3;
            writableMapCreateMap.putDouble("locationX", c0392f0.d(x4));
            writableMapCreateMap.putDouble("locationY", c0392f0.d(y4));
            writableMapCreateMap.putInt("targetSurface", qVar.l());
            writableMapCreateMap.putInt(f1710b, qVar.o());
            writableMapCreateMap.putDouble("timestamp", qVar.m());
            writableMapCreateMap.putDouble("identifier", motionEventW.getPointerId(i3));
            writableMapArr[i3] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private final WritableArray b(boolean z3, WritableMap[] writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z3) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        D2.h.c(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x002f, B:11:0x0051, B:31:0x0095, B:32:0x0099, B:34:0x009f, B:36:0x00a7, B:38:0x00c2, B:14:0x0058, B:15:0x005d, B:16:0x005e, B:17:0x0061, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0074, B:26:0x0081, B:28:0x0089, B:30:0x008f), top: B:44:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x002f, B:11:0x0051, B:31:0x0095, B:32:0x0099, B:34:0x009f, B:36:0x00a7, B:38:0x00c2, B:14:0x0058, B:15:0x005d, B:16:0x005e, B:17:0x0061, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0074, B:26:0x0081, B:28:0x0089, B:30:0x008f), top: B:44:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    public static final void c(RCTModernEventEmitter rCTModernEventEmitter, q qVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        Iterator itA;
        WritableMap writableMap;
        WritableMap writableMap2;
        D2.h.f(rCTModernEventEmitter, "eventEmitter");
        D2.h.f(qVar, "event");
        p015d2.a.c(0L, "TouchesHelper.sentTouchEventModern(" + qVar.k() + ")");
        try {
            s sVarX = qVar.x();
            MotionEvent motionEventW = qVar.w();
            WritableMap[] writableMapArrA = f1709a.a(qVar);
            int i3 = a.f1711a[sVarX.ordinal()];
            if (i3 == 1) {
                WritableMap writableMap3 = writableMapArrA[motionEventW.getActionIndex()];
                writableMapArr = new WritableMap[]{writableMap3 != null ? writableMap3.copy() : null};
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        writableMapArr = new WritableMap[writableMapArrA.length];
                        for (int i4 = 0; i4 < writableMapArrA.length; i4++) {
                            WritableMap writableMap4 = writableMapArrA[i4];
                            writableMapArr[i4] = writableMap4 != null ? writableMap4.copy() : null;
                        }
                    } else {
                        if (i3 != 4) {
                            throw new p071r2.h();
                        }
                        writableMapArr2 = new WritableMap[0];
                        writableMapArr = writableMapArrA;
                    }
                    itA = D2.b.a(writableMapArr);
                    while (itA.hasNext()) {
                        writableMap = (WritableMap) itA.next();
                        if (writableMap != null) {
                            WritableMap writableMapCopy = writableMap.copy();
                            t tVar = f1709a;
                            WritableArray writableArrayB = tVar.b(true, writableMapArr);
                            WritableArray writableArrayB2 = tVar.b(true, writableMapArr2);
                            writableMapCopy.putArray("changedTouches", writableArrayB);
                            writableMapCopy.putArray("touches", writableArrayB2);
                            writableMap2 = writableMapCopy;
                        } else {
                            writableMap2 = null;
                        }
                        rCTModernEventEmitter.receiveEvent(qVar.l(), qVar.o(), qVar.k(), qVar.a(), 0, writableMap2, qVar.i());
                    }
                    p015d2.a.i(0L);
                }
                int actionIndex = motionEventW.getActionIndex();
                WritableMap writableMap5 = writableMapArrA[actionIndex];
                writableMapArrA[actionIndex] = null;
                writableMapArr = new WritableMap[]{writableMap5};
            }
            writableMapArr2 = writableMapArrA;
            itA = D2.b.a(writableMapArr);
            while (itA.hasNext()) {
                writableMap = (WritableMap) itA.next();
                if (writableMap != null) {
                    WritableMap writableMapCopy2 = writableMap.copy();
                    t tVar2 = f1709a;
                    WritableArray writableArrayB3 = tVar2.b(true, writableMapArr);
                    WritableArray writableArrayB4 = tVar2.b(true, writableMapArr2);
                    writableMapCopy2.putArray("changedTouches", writableArrayB3);
                    writableMapCopy2.putArray("touches", writableArrayB4);
                    writableMap2 = writableMapCopy2;
                } else {
                    writableMap2 = null;
                }
                rCTModernEventEmitter.receiveEvent(qVar.l(), qVar.o(), qVar.k(), qVar.a(), 0, writableMap2, qVar.i());
            }
            p015d2.a.i(0L);
        } catch (Throwable th) {
            p015d2.a.i(0L);
            throw th;
        }
    }

    public static final void d(RCTEventEmitter rCTEventEmitter, q qVar) {
        D2.h.f(rCTEventEmitter, "rctEventEmitter");
        D2.h.f(qVar, "touchEvent");
        s sVarX = qVar.x();
        t tVar = f1709a;
        WritableArray writableArrayB = tVar.b(false, tVar.a(qVar));
        MotionEvent motionEventW = qVar.w();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (sVarX == s.MOVE || sVarX == s.CANCEL) {
            int pointerCount = motionEventW.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                writableArrayCreateArray.pushInt(i3);
            }
        } else {
            if (sVarX != s.START && sVarX != s.END) {
                throw new RuntimeException("Unknown touch type: " + sVarX);
            }
            writableArrayCreateArray.pushInt(motionEventW.getActionIndex());
        }
        String strA = s.f1701c.a(sVarX);
        D2.h.c(writableArrayCreateArray);
        rCTEventEmitter.receiveTouches(strA, writableArrayB, writableArrayCreateArray);
    }
}
