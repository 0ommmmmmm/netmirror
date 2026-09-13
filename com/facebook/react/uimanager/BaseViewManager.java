package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import p014d1.AbstractC0462m;
import p014d1.AbstractC0465p;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends U> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final Y.a sMatrixDecompositionContext = new Y.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    private static class a {
        public static void a(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (K.t(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(K.v(readableArray));
            } else {
                if (i3 >= 31) {
                    view.setRenderEffect(K.w(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        Y.a.K("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f3) {
        if (f3 >= -3.4028235E38f && f3 <= Float.MAX_VALUE) {
            return f3;
        }
        if (f3 < -3.4028235E38f || f3 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f3 > Float.MAX_VALUE || f3 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f3);
    }

    private static void setPointerEventsFlag(View view, P1.o.a aVar, boolean z3) {
        Integer num = (Integer) view.getTag(AbstractC0462m.f9247s);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << aVar.ordinal();
        view.setTag(AbstractC0462m.f9247s, Integer.valueOf(z3 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(T t3) {
        Dynamic dynamic;
        String str = (String) t3.getTag(AbstractC0462m.f9233e);
        ReadableMap readableMap = (ReadableMap) t3.getTag(AbstractC0462m.f9236h);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t3.getTag(AbstractC0462m.f9238j);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t3.getContext().getString(AbstractC0465p.f9269G));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t3.getContext().getString(AbstractC0465p.f9268F));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t3.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        e1.d.a aVarB = p018e1.d.a().b("topPointerCancel", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(aVarB.b("topPointerEnter", p018e1.d.d("phasedRegistrationNames", p018e1.d.f("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", p018e1.d.d("phasedRegistrationNames", p018e1.d.f("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onClick", "captured", "onClickCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(p018e1.d.a().b("topAccessibilityAction", p018e1.d.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t3) {
        super.onAfterUpdateTransaction(t3);
        updateViewAccessibility(t3);
        Boolean bool = (Boolean) t3.getTag(AbstractC0462m.f9244p);
        if (bool != null && bool.booleanValue()) {
            t3.addOnLayoutChangeListener(this);
            setTransformProperty(t3, (ReadableArray) t3.getTag(AbstractC0462m.f9224A), (ReadableArray) t3.getTag(AbstractC0462m.f9225B));
            t3.setTag(AbstractC0462m.f9244p, Boolean.FALSE);
        }
        a.a(t3, (ReadableArray) t3.getTag(AbstractC0462m.f9242n), (Boolean) t3.getTag(AbstractC0462m.f9226C));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i9 - i7;
        int i12 = i5 - i3;
        if (i6 - i4 == i10 - i8 && i12 == i11) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC0462m.f9225B);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(AbstractC0462m.f9224A);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(B0 b4, T t3) {
        t3.setTag(null);
        t3.setTag(AbstractC0462m.f9247s, null);
        t3.setTag(AbstractC0462m.f9248t, null);
        t3.setTag(AbstractC0462m.f9228E, null);
        t3.setTag(AbstractC0462m.f9245q, null);
        t3.setTag(AbstractC0462m.f9233e, null);
        t3.setTag(AbstractC0462m.f9232d, null);
        t3.setTag(AbstractC0462m.f9235g, null);
        t3.setTag(AbstractC0462m.f9236h, null);
        t3.setTag(AbstractC0462m.f9229a, null);
        t3.setTag(AbstractC0462m.f9238j, null);
        t3.setTag(AbstractC0462m.f9237i, null);
        t3.setTag(AbstractC0462m.f9227D, null);
        setTransformProperty(t3, null, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            return null;
        }
        t3.resetPivot();
        t3.setTop(0);
        t3.setBottom(0);
        t3.setLeft(0);
        t3.setRight(0);
        t3.setElevation(0.0f);
        if (i3 >= 29) {
            t3.setAnimationMatrix(null);
        }
        t3.setTag(AbstractC0462m.f9224A, null);
        t3.setTag(AbstractC0462m.f9225B, null);
        t3.setTag(AbstractC0462m.f9244p, null);
        t3.removeOnLayoutChangeListener(this);
        t3.setTag(AbstractC0462m.f9226C, null);
        t3.setTag(AbstractC0462m.f9242n, null);
        t3.setTag(AbstractC0462m.f9246r, null);
        a.a(t3, null, null);
        if (i3 >= 28) {
            t3.setOutlineAmbientShadowColor(-16777216);
            t3.setOutlineSpotShadowColor(-16777216);
        }
        t3.setNextFocusDownId(-1);
        t3.setNextFocusForwardId(-1);
        t3.setNextFocusRightId(-1);
        t3.setNextFocusUpId(-1);
        t3.setFocusable(false);
        t3.setFocusableInTouchMode(false);
        t3.setElevation(0.0f);
        t3.setAlpha(1.0f);
        setPadding(t3, 0, 0, 0, 0);
        t3.setForeground(null);
        return t3;
    }

    @L1.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t3, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t3.setTag(AbstractC0462m.f9229a, readableArray);
    }

    @L1.a(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t3, ReadableMap readableMap) {
        t3.setTag(AbstractC0462m.f9230b, readableMap);
    }

    @L1.a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t3, ReadableMap readableMap) {
        t3.setTag(AbstractC0462m.f9231c, readableMap);
    }

    @L1.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t3, String str) {
        t3.setTag(AbstractC0462m.f9232d, str);
        updateViewContentDescription(t3);
    }

    @L1.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t3, String str) {
        t3.setTag(AbstractC0462m.f9233e, str);
        updateViewContentDescription(t3);
    }

    @L1.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t3, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t3.setTag(AbstractC0462m.f9245q, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t3.setTag(AbstractC0462m.f9245q, dynamic.asArray().getString(0));
        }
    }

    @L1.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t3, String str) {
        if (str == null || str.equals("none")) {
            androidx.core.view.Z.Z(t3, 0);
        } else if (str.equals("polite")) {
            androidx.core.view.Z.Z(t3, 1);
        } else if (str.equals("assertive")) {
            androidx.core.view.Z.Z(t3, 2);
        }
    }

    @L1.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t3, String str) {
        if (str == null) {
            t3.setTag(AbstractC0462m.f9235g, null);
        } else {
            t3.setTag(AbstractC0462m.f9235g, C0396h0.d.c(str));
        }
    }

    @L1.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t3, ReadableMap readableMap) {
        if (readableMap == null) {
            t3.setTag(AbstractC0462m.f9238j, null);
            t3.setContentDescription(null);
        } else {
            t3.setTag(AbstractC0462m.f9238j, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t3);
            }
        }
    }

    @L1.a(customType = "Color", defaultInt = WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY, name = "backgroundColor")
    public void setBackgroundColor(T t3, int i3) {
        C0381a.n(t3, Integer.valueOf(i3));
    }

    public void setBorderBottomLeftRadius(T t3, float f3) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t3, float f3) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t3, float f3) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t3, float f3) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t3, float f3) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @L1.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t3, ReadableArray readableArray) {
        C0381a.t(t3, readableArray);
    }

    @L1.a(name = "onClick")
    public void setClick(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.CLICK, z3);
    }

    @L1.a(name = "onClickCapture")
    public void setClickCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.CLICK_CAPTURE, z3);
    }

    @L1.a(name = "elevation")
    public void setElevation(T t3, float f3) {
        androidx.core.view.Z.e0(t3, C0392f0.h(f3));
    }

    @L1.a(customType = "Filter", name = "filter")
    public void setFilter(T t3, ReadableArray readableArray) {
        if (M1.a.c(t3) == 2) {
            t3.setTag(AbstractC0462m.f9242n, readableArray);
        }
    }

    @L1.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t3, String str) {
        if (str == null || str.equals("auto")) {
            androidx.core.view.Z.f0(t3, 0);
            return;
        }
        if (str.equals("yes")) {
            androidx.core.view.Z.f0(t3, 1);
        } else if (str.equals("no")) {
            androidx.core.view.Z.f0(t3, 2);
        } else if (str.equals("no-hide-descendants")) {
            androidx.core.view.Z.f0(t3, 4);
        }
    }

    @L1.a(name = "mixBlendMode")
    public void setMixBlendMode(T t3, String str) {
        if (M1.a.c(t3) == 2) {
            t3.setTag(AbstractC0462m.f9246r, C0424w.b(str));
            if (t3.getParent() instanceof View) {
                ((View) t3.getParent()).invalidate();
            }
        }
    }

    @L1.a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t3, boolean z3) {
    }

    @L1.a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t3, boolean z3) {
    }

    @L1.a(name = "nativeID")
    public void setNativeId(T t3, String str) {
        t3.setTag(AbstractC0462m.f9228E, str);
        S1.a.c(t3);
    }

    @L1.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t3, float f3) {
        t3.setAlpha(f3);
    }

    @L1.a(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t3, Integer num) {
        C0381a.w(t3, num);
    }

    @L1.a(name = "outlineOffset")
    public void setOutlineOffset(T t3, float f3) {
        C0381a.x(t3, f3);
    }

    @L1.a(name = "outlineStyle")
    public void setOutlineStyle(T t3, String str) {
        C0381a.y(t3, str == null ? null : R1.o.b(str));
    }

    @L1.a(name = "outlineWidth")
    public void setOutlineWidth(T t3, float f3) {
        C0381a.z(t3, f3);
    }

    @L1.a(name = "onPointerEnter")
    public void setPointerEnter(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.ENTER, z3);
    }

    @L1.a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.ENTER_CAPTURE, z3);
    }

    @L1.a(name = "onPointerLeave")
    public void setPointerLeave(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.LEAVE, z3);
    }

    @L1.a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.LEAVE_CAPTURE, z3);
    }

    @L1.a(name = "onPointerMove")
    public void setPointerMove(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.MOVE, z3);
    }

    @L1.a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.MOVE_CAPTURE, z3);
    }

    @L1.a(name = "onPointerOut")
    public void setPointerOut(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.OUT, z3);
    }

    @L1.a(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.OUT_CAPTURE, z3);
    }

    @L1.a(name = "onPointerOver")
    public void setPointerOver(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.OVER, z3);
    }

    @L1.a(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t3, boolean z3) {
        setPointerEventsFlag(t3, P1.o.a.OVER_CAPTURE, z3);
    }

    @L1.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t3, boolean z3) {
        t3.setTag(AbstractC0462m.f9226C, Boolean.valueOf(z3));
    }

    @L1.a(name = "onResponderEnd")
    public void setResponderEnd(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderGrant")
    public void setResponderGrant(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderMove")
    public void setResponderMove(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderReject")
    public void setResponderReject(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderRelease")
    public void setResponderRelease(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderStart")
    public void setResponderStart(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderTerminate")
    public void setResponderTerminate(T t3, boolean z3) {
    }

    @L1.a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t3, boolean z3) {
    }

    @L1.a(name = "role")
    public void setRole(T t3, String str) {
        if (str == null) {
            t3.setTag(AbstractC0462m.f9254z, null);
        } else {
            t3.setTag(AbstractC0462m.f9254z, C0396h0.e.b(str));
        }
    }

    @L1.a(name = "rotation")
    @Deprecated
    public void setRotation(T t3, float f3) {
        t3.setRotation(f3);
    }

    @L1.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t3, float f3) {
        t3.setScaleX(f3);
    }

    @L1.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t3, float f3) {
        t3.setScaleY(f3);
    }

    @L1.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t3, int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            t3.setOutlineAmbientShadowColor(i3);
            t3.setOutlineSpotShadowColor(i3);
        }
    }

    @L1.a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t3, boolean z3) {
    }

    @L1.a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t3, boolean z3) {
    }

    @L1.a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t3, boolean z3) {
    }

    @L1.a(name = "testID")
    public void setTestId(T t3, String str) {
        t3.setTag(AbstractC0462m.f9248t, str);
        t3.setTag(str);
    }

    @L1.a(name = "onTouchCancel")
    public void setTouchCancel(T t3, boolean z3) {
    }

    @L1.a(name = "onTouchEnd")
    public void setTouchEnd(T t3, boolean z3) {
    }

    @L1.a(name = "onTouchMove")
    public void setTouchMove(T t3, boolean z3) {
    }

    @L1.a(name = "onTouchStart")
    public void setTouchStart(T t3, boolean z3) {
    }

    @L1.a(name = "transform")
    public void setTransform(T t3, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t3.getTag(AbstractC0462m.f9224A), readableArray)) {
            return;
        }
        t3.setTag(AbstractC0462m.f9224A, readableArray);
        t3.setTag(AbstractC0462m.f9244p, Boolean.TRUE);
    }

    @L1.a(name = "transformOrigin")
    public void setTransformOrigin(T t3, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t3.getTag(AbstractC0462m.f9225B), readableArray)) {
            return;
        }
        t3.setTag(AbstractC0462m.f9225B, readableArray);
        t3.setTag(AbstractC0462m.f9244p, Boolean.TRUE);
    }

    protected void setTransformProperty(T t3, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t3.setTranslationX(C0392f0.h(0.0f));
            t3.setTranslationY(C0392f0.h(0.0f));
            t3.setRotation(0.0f);
            t3.setRotationX(0.0f);
            t3.setRotationY(0.0f);
            t3.setScaleX(1.0f);
            t3.setScaleY(1.0f);
            t3.setCameraDistance(0.0f);
            return;
        }
        boolean z3 = M1.a.c(t3) == 2;
        Y.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        E0.d(readableArray, dArr, C0392f0.f(t3.getWidth()), C0392f0.f(t3.getHeight()), readableArray2, z3);
        Y.k(dArr, aVar);
        t3.setTranslationX(C0392f0.h(sanitizeFloatPropertyValue((float) aVar.f7434d[0])));
        t3.setTranslationY(C0392f0.h(sanitizeFloatPropertyValue((float) aVar.f7434d[1])));
        t3.setRotation(sanitizeFloatPropertyValue((float) aVar.f7435e[2]));
        t3.setRotationX(sanitizeFloatPropertyValue((float) aVar.f7435e[0]));
        t3.setRotationY(sanitizeFloatPropertyValue((float) aVar.f7435e[1]));
        t3.setScaleX(sanitizeFloatPropertyValue((float) aVar.f7432b[0]));
        t3.setScaleY(sanitizeFloatPropertyValue((float) aVar.f7432b[1]));
        double[] dArr2 = aVar.f7431a;
        if (dArr2.length > 2) {
            float f3 = (float) dArr2[2];
            if (f3 == 0.0f) {
                f3 = 7.8125E-4f;
            }
            float f4 = (-1.0f) / f3;
            float f5 = C0426x.c().density;
            t3.setCameraDistance(sanitizeFloatPropertyValue(f5 * f5 * f4 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @L1.a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t3, float f3) {
        t3.setTranslationX(C0392f0.h(f3));
    }

    @L1.a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t3, float f3) {
        t3.setTranslationY(C0392f0.h(f3));
    }

    @L1.a(name = "accessibilityState")
    public void setViewState(T t3, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t3.setTag(AbstractC0462m.f9237i, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t3.isSelected();
            boolean z3 = readableMap.getBoolean("selected");
            t3.setSelected(z3);
            if (t3.isAccessibilityFocused() && zIsSelected && !z3) {
                t3.announceForAccessibility(t3.getContext().getString(AbstractC0465p.f9270H));
            }
        } else {
            t3.setSelected(false);
        }
        t3.setTag(AbstractC0462m.f9236h, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t3.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t3);
                return;
            } else if (t3.isAccessibilityFocused()) {
                t3.sendAccessibilityEvent(1);
            }
        }
    }

    @L1.a(name = "zIndex")
    public void setZIndex(T t3, float f3) {
        ViewGroupManager.setViewZIndex(t3, Math.round(f3));
        ViewParent parent = t3.getParent();
        if (parent instanceof InterfaceC0423v0) {
            ((InterfaceC0423v0) parent).f();
        }
    }

    protected void updateViewAccessibility(T t3) {
        C0396h0.g0(t3, t3.isFocusable(), t3.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
