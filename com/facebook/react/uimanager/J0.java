package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class J0 {
    static Map a() {
        return p018e1.d.a().b("topChange", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(P1.s.b(P1.s.START), p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(P1.s.b(P1.s.MOVE), p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(P1.s.b(P1.s.END), p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(P1.s.b(P1.s.CANCEL), p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map b() {
        HashMap mapB = p018e1.d.b();
        mapB.put("UIView", p018e1.d.d("ContentMode", p018e1.d.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        mapB.put("StyleConstants", p018e1.d.d("PointerEventsValues", p018e1.d.g("none", Integer.valueOf(EnumC0394g0.NONE.ordinal()), "boxNone", Integer.valueOf(EnumC0394g0.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(EnumC0394g0.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(EnumC0394g0.AUTO.ordinal()))));
        mapB.put("AccessibilityEventTypes", p018e1.d.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return mapB;
    }

    static Map c() {
        return p018e1.d.a().b("topContentSizeChange", p018e1.d.d("registrationName", "onContentSizeChange")).b("topLayout", p018e1.d.d("registrationName", "onLayout")).b("topLoadingError", p018e1.d.d("registrationName", "onLoadingError")).b("topLoadingFinish", p018e1.d.d("registrationName", "onLoadingFinish")).b("topLoadingStart", p018e1.d.d("registrationName", "onLoadingStart")).b("topSelectionChange", p018e1.d.d("registrationName", "onSelectionChange")).b("topMessage", p018e1.d.d("registrationName", "onMessage")).b("topScrollBeginDrag", p018e1.d.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", p018e1.d.d("registrationName", "onScrollEndDrag")).b("topScroll", p018e1.d.d("registrationName", "onScroll")).b("topMomentumScrollBegin", p018e1.d.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", p018e1.d.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
