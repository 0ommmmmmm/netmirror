package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.EnumC0394g0;
import com.facebook.react.uimanager.InterfaceC0408n0;
import p055n2.D;
import p055n2.v;

/* JADX INFO: loaded from: classes.dex */
public final class n implements D {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8653a;

        static {
            int[] iArr = new int[EnumC0394g0.values().length];
            try {
                iArr[EnumC0394g0.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0394g0.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0394g0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0394g0.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8653a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055n2.D
    public v a(View view) {
        D2.h.f(view, "view");
        EnumC0394g0 pointerEvents = view instanceof InterfaceC0408n0 ? ((InterfaceC0408n0) view).getPointerEvents() : EnumC0394g0.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == EnumC0394g0.AUTO) {
                return v.BOX_NONE;
            }
            if (pointerEvents == EnumC0394g0.BOX_ONLY) {
                return v.NONE;
            }
        }
        int i3 = a.f8653a[pointerEvents.ordinal()];
        if (i3 == 1) {
            return v.BOX_ONLY;
        }
        if (i3 == 2) {
            return v.BOX_NONE;
        }
        if (i3 == 3) {
            return v.NONE;
        }
        if (i3 == 4) {
            return v.AUTO;
        }
        throw new p071r2.h();
    }

    @Override // p055n2.D
    public View b(ViewGroup viewGroup, int i3) {
        D2.h.f(viewGroup, "parent");
        if (viewGroup instanceof com.facebook.react.views.view.g) {
            View childAt = viewGroup.getChildAt(((com.facebook.react.views.view.g) viewGroup).a(i3));
            D2.h.c(childAt);
            return childAt;
        }
        View childAt2 = viewGroup.getChildAt(i3);
        D2.h.e(childAt2, "getChildAt(...)");
        return childAt2;
    }

    @Override // p055n2.D
    public boolean c(ViewGroup viewGroup) {
        D2.h.f(viewGroup, "view");
        if (viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof com.facebook.react.views.scroll.g) {
            if (!D2.h.b(((com.facebook.react.views.scroll.g) viewGroup).getOverflow(), "visible")) {
                return true;
            }
        } else if (viewGroup instanceof com.facebook.react.views.scroll.f) {
            if (!D2.h.b(((com.facebook.react.views.scroll.f) viewGroup).getOverflow(), "visible")) {
                return true;
            }
        } else if (viewGroup instanceof com.facebook.react.views.view.g) {
            return D2.h.b(((com.facebook.react.views.view.g) viewGroup).getOverflow(), "hidden");
        }
        return false;
    }
}
