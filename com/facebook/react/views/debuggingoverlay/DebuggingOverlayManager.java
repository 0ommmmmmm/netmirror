package com.facebook.react.views.debuggingoverlay;

import D2.h;
import U1.k;
import U1.l;
import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.Q0;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.r;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = DebuggingOverlayManager.REACT_CLASS)
public final class DebuggingOverlayManager extends SimpleViewManager<b> implements l {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final Q0 delegate = new k(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected Q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // U1.l
    public void clearElementsHighlights(b bVar) {
        h.f(bVar, "view");
        bVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(B0 b4) {
        h.f(b4, "context");
        return new b(b4);
    }

    @Override // U1.l
    public void highlightElements(b bVar, ReadableArray readableArray) throws Exception {
        ReadableArray array;
        h.f(bVar, "view");
        if (readableArray == null || (array = readableArray.getArray(0)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = array.size();
        boolean z3 = true;
        for (int i3 = 0; i3 < size; i3++) {
            ReadableMap map = array.getMap(i3);
            if (map != null) {
                try {
                    float f3 = (float) map.getDouble("x");
                    float f4 = (float) map.getDouble("y");
                    float f5 = (float) (((double) f3) + map.getDouble("width"));
                    float f6 = (float) (((double) f4) + map.getDouble("height"));
                    C0392f0 c0392f0 = C0392f0.f7477a;
                    arrayList.add(new RectF(c0392f0.b(f3), c0392f0.b(f4), c0392f0.b(f5), c0392f0.b(f6)));
                } catch (Exception e4) {
                    if (!(e4 instanceof NoSuchKeyException) && !(e4 instanceof UnexpectedNativeTypeException)) {
                        throw e4;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    r rVar = r.f10603a;
                    z3 = false;
                }
            }
        }
        if (z3) {
            bVar.setHighlightedElementsRectangles(arrayList);
        }
    }

    @Override // U1.l
    public void highlightTraceUpdates(b bVar, ReadableArray readableArray) throws Exception {
        h.f(bVar, "view");
        if (readableArray != null) {
            boolean z3 = false;
            ReadableArray array = readableArray.getArray(0);
            if (array == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = array.size();
            int i3 = 0;
            boolean z4 = true;
            while (true) {
                if (i3 >= size) {
                    z3 = z4;
                    break;
                }
                ReadableMap map = array.getMap(i3);
                if (map != null) {
                    ReadableMap map2 = map.getMap("rectangle");
                    if (map2 == null) {
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                        break;
                    }
                    int i4 = map.getInt("id");
                    int i5 = map.getInt("color");
                    try {
                        float f3 = (float) map2.getDouble("x");
                        float f4 = (float) map2.getDouble("y");
                        float f5 = (float) (((double) f3) + map2.getDouble("width"));
                        float f6 = (float) (((double) f4) + map2.getDouble("height"));
                        C0392f0 c0392f0 = C0392f0.f7477a;
                        arrayList.add(new c(i4, new RectF(c0392f0.b(f3), c0392f0.b(f4), c0392f0.b(f5), c0392f0.b(f6)), i5));
                    } catch (Exception e4) {
                        if (!(e4 instanceof NoSuchKeyException) && !(e4 instanceof UnexpectedNativeTypeException)) {
                            throw e4;
                        }
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                        r rVar = r.f10603a;
                        z4 = false;
                    }
                }
                i3++;
                z3 = false;
            }
            if (z3) {
                bVar.setTraceUpdates(arrayList);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, String str, ReadableArray readableArray) throws Exception {
        h.f(bVar, "view");
        h.f(str, "commandId");
        int iHashCode = str.hashCode();
        if (iHashCode != -1942063165) {
            if (iHashCode != 1326903961) {
                if (iHashCode == 1385348555 && str.equals("highlightElements")) {
                    highlightElements(bVar, readableArray);
                    return;
                }
            } else if (str.equals("highlightTraceUpdates")) {
                highlightTraceUpdates(bVar, readableArray);
                return;
            }
        } else if (str.equals("clearElementsHighlights")) {
            clearElementsHighlights(bVar);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}
