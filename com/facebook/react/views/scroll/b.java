package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.H0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class b implements UIManagerListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f7753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0115b f7755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f7756e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f7757f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7758g = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.b$b, reason: collision with other inner class name */
    public static class C0115b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f7761b;

        C0115b(int i3, Integer num) {
            this.f7760a = i3;
            this.f7761b = num;
        }

        static C0115b a(ReadableMap readableMap) {
            return new C0115b(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null);
        }
    }

    public b(ViewGroup viewGroup, boolean z3) {
        this.f7753b = viewGroup;
        this.f7754c = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.facebook.react.views.view.g gVarC;
        float y3;
        int height;
        if (this.f7755d == null || (gVarC = c()) == null) {
            return;
        }
        int scrollX = this.f7754c ? this.f7753b.getScrollX() : this.f7753b.getScrollY();
        for (int i3 = this.f7755d.f7760a; i3 < gVarC.getChildCount(); i3++) {
            View childAt = gVarC.getChildAt(i3);
            if (this.f7754c) {
                y3 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y3 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y3 + height > scrollX || i3 == gVarC.getChildCount() - 1) {
                this.f7756e = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f7757f = rect;
                return;
            }
        }
    }

    private com.facebook.react.views.view.g c() {
        return (com.facebook.react.views.view.g) this.f7753b.getChildAt(0);
    }

    private UIManager d() {
        return (UIManager) p002a1.a.c(H0.g((ReactContext) this.f7753b.getContext(), M1.a.a(this.f7753b.getId())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        WeakReference weakReference;
        View view;
        if (this.f7755d == null || (weakReference = this.f7756e) == null || this.f7757f == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (this.f7754c) {
            int i3 = rect.left - this.f7757f.left;
            if (i3 != 0) {
                int scrollX = this.f7753b.getScrollX();
                ViewGroup viewGroup = this.f7753b;
                ((j.d) viewGroup).b(i3 + scrollX, viewGroup.getScrollY());
                this.f7757f = rect;
                Integer num = this.f7755d.f7761b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                ViewGroup viewGroup2 = this.f7753b;
                ((j.d) viewGroup2).f(0, viewGroup2.getScrollY());
                return;
            }
            return;
        }
        int i4 = rect.top - this.f7757f.top;
        if (i4 != 0) {
            int scrollY = this.f7753b.getScrollY();
            ViewGroup viewGroup3 = this.f7753b;
            ((j.d) viewGroup3).b(viewGroup3.getScrollX(), i4 + scrollY);
            this.f7757f = rect;
            Integer num2 = this.f7755d.f7761b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            ViewGroup viewGroup4 = this.f7753b;
            ((j.d) viewGroup4).f(viewGroup4.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void e(C0115b c0115b) {
        this.f7755d = c0115b;
    }

    public void f() {
        if (this.f7758g) {
            return;
        }
        this.f7758g = true;
        d().addUIManagerEventListener(this);
    }

    public void g() {
        if (this.f7758g) {
            this.f7758g = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public void h() {
        if (M1.a.a(this.f7753b.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        b();
    }
}
