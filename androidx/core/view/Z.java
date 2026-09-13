package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f4575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f4576d = {p048m.b.f9744b, p048m.b.f9745c, p048m.b.f9756n, p048m.b.f9767y, p048m.b.f9725B, p048m.b.f9726C, p048m.b.f9727D, p048m.b.f9728E, p048m.b.f9729F, p048m.b.f9730G, p048m.b.f9746d, p048m.b.f9747e, p048m.b.f9748f, p048m.b.f9749g, p048m.b.f9750h, p048m.b.f9751i, p048m.b.f9752j, p048m.b.f9753k, p048m.b.f9754l, p048m.b.f9755m, p048m.b.f9757o, p048m.b.f9758p, p048m.b.f9759q, p048m.b.f9760r, p048m.b.f9761s, p048m.b.f9762t, p048m.b.f9763u, p048m.b.f9764v, p048m.b.f9765w, p048m.b.f9766x, p048m.b.f9768z, p048m.b.f9724A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K f4577e = new K() { // from class: androidx.core.view.Y
        @Override // androidx.core.view.K
        public final C0236d a(C0236d c0236d) {
            return Z.I(c0236d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f4578f = new e();

    class a extends f {
        a(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(j.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            j.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return j.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            j.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(j.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            j.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakHashMap f4579b = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z3 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z3) {
                Z.J(view, z3 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z3));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f4579b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f4579b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f4579b.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f4581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f4583d;

        f(int i3, Class cls, int i4) {
            this(i3, cls, 0, i4);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f4582c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f4580a);
            if (this.f4581b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                Z.h(view);
                view.setTag(this.f4580a, obj);
                Z.J(view, this.f4583d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i3, Class cls, int i4, int i5) {
            this.f4580a = i3;
            this.f4581b = cls;
            this.f4583d = i4;
            this.f4582c = i5;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            C0257n0 f4584a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f4585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f4586c;

            a(View view, I i3) {
                this.f4585b = view;
                this.f4586c = i3;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0257n0 c0257n0W = C0257n0.w(windowInsets, view);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    h.a(windowInsets, this.f4585b);
                    if (c0257n0W.equals(this.f4584a)) {
                        return this.f4586c.a(view, c0257n0W).u();
                    }
                }
                this.f4584a = c0257n0W;
                C0257n0 c0257n0A = this.f4586c.a(view, c0257n0W);
                if (i3 >= 30) {
                    return c0257n0A.u();
                }
                Z.U(view);
                return c0257n0A.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(p048m.b.f9742S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0257n0 b(View view, C0257n0 c0257n0, Rect rect) {
            WindowInsets windowInsetsU = c0257n0.u();
            if (windowInsetsU != null) {
                return C0257n0.w(view.computeSystemWindowInsets(windowInsetsU, rect), view);
            }
            rect.setEmpty();
            return c0257n0;
        }

        static boolean c(View view, float f3, float f4, boolean z3) {
            return view.dispatchNestedFling(f3, f4, z3);
        }

        static boolean d(View view, float f3, float f4) {
            return view.dispatchNestedPreFling(f3, f4);
        }

        static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
        }

        static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
            return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static C0257n0 j(View view) {
            return C0257n0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f3) {
            view.setElevation(f3);
        }

        static void t(View view, boolean z3) {
            view.setNestedScrollingEnabled(z3);
        }

        static void u(View view, I i3) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(p048m.b.f9735L, i3);
            }
            if (i3 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(p048m.b.f9742S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i3));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f3) {
            view.setTranslationZ(f3);
        }

        static void x(View view, float f3) {
            view.setZ(f3);
        }

        static boolean y(View view, int i3) {
            return view.startNestedScroll(i3);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static C0257n0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0257n0 c0257n0V = C0257n0.v(rootWindowInsets);
            c0257n0V.s(c0257n0V);
            c0257n0V.d(view.getRootView());
            return c0257n0V;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i3) {
            view.setScrollIndicators(i3);
        }

        static void d(View view, int i3, int i4) {
            view.setScrollIndicators(i3, i4);
        }
    }

    static class j {
        static void a(View view, final o oVar) {
            p044l.g gVar = (p044l.g) view.getTag(p048m.b.f9741R);
            if (gVar == null) {
                gVar = new p044l.g();
                view.setTag(p048m.b.f9741R, gVar);
            }
            Objects.requireNonNull(oVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(oVar) { // from class: androidx.core.view.a0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            gVar.put(oVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, o oVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p044l.g gVar = (p044l.g) view.getTag(p048m.b.f9741R);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(oVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i3) {
            return (T) view.requireViewById(i3);
        }

        static void g(View view, boolean z3) {
            view.setAccessibilityHeading(z3);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, p072s.a aVar) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z3) {
            view.setScreenReaderFocusable(z3);
        }
    }

    private static class k {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i4);
        }

        static void e(View view, p076t.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class l {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i3) {
            view.setImportantForContentCapture(i3);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class m {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0236d b(View view, C0236d c0236d) {
            ContentInfo contentInfoH = c0236d.h();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoH ? c0236d : C0236d.i(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, J j3) {
            if (j3 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new n(j3));
            }
        }
    }

    private static final class n implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J f4587a;

        n(J j3) {
            this.f4587a = j3;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0236d c0236dI = C0236d.i(contentInfo);
            C0236d c0236dA = this.f4587a.a(view, c0236dI);
            if (c0236dA == null) {
                return null;
            }
            return c0236dA == c0236dI ? contentInfo : c0236dA.h();
        }
    }

    public interface o {
    }

    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f4588d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f4589a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f4590b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f4591c = null;

        p() {
        }

        static p a(View view) {
            p pVar = (p) view.getTag(p048m.b.f9740Q);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(p048m.b.f9740Q, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f4589a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f4590b == null) {
                this.f4590b = new SparseArray();
            }
            return this.f4590b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(p048m.b.f9741R);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            androidx.activity.result.d.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f4589a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f4588d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f4589a == null) {
                        this.f4589a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f4588d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f4589a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4589a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f4591c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f4591c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static String A(View view) {
        return h.k(view);
    }

    public static int B(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean C(View view) {
        return j(view) != null;
    }

    public static boolean D(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean E(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean F(View view) {
        return view.isLaidOut();
    }

    public static boolean G(View view) {
        return h.p(view);
    }

    public static boolean H(View view) {
        Boolean bool = (Boolean) W().e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0236d I(C0236d c0236d) {
        return c0236d;
    }

    static void J(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z3) {
                    accessibilityEventObtain.getText().add(l(view));
                    g0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i3 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i3);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static void K(View view, int i3) {
        view.offsetLeftAndRight(i3);
    }

    public static void L(View view, int i3) {
        view.offsetTopAndBottom(i3);
    }

    public static C0257n0 M(View view, C0257n0 c0257n0) {
        WindowInsets windowInsetsU = c0257n0.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsU);
            if (!windowInsetsB.equals(windowInsetsU)) {
                return C0257n0.w(windowInsetsB, view);
            }
        }
        return c0257n0;
    }

    public static void N(View view, p068r.v vVar) {
        view.onInitializeAccessibilityNodeInfo(vVar.P0());
    }

    private static f O() {
        return new b(p048m.b.f9734K, CharSequence.class, 8, 28);
    }

    public static boolean P(View view, int i3, Bundle bundle) {
        return view.performAccessibilityAction(i3, bundle);
    }

    public static C0236d Q(View view, C0236d c0236d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0236d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return m.b(view, c0236d);
        }
        J j3 = (J) view.getTag(p048m.b.f9736M);
        if (j3 == null) {
            return p(view).a(c0236d);
        }
        C0236d c0236dA = j3.a(view, c0236d);
        if (c0236dA == null) {
            return null;
        }
        return p(view).a(c0236dA);
    }

    public static void R(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void S(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void T(View view, Runnable runnable, long j3) {
        view.postOnAnimationDelayed(runnable, j3);
    }

    public static void U(View view) {
        g.c(view);
    }

    public static void V(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            k.d(view, context, iArr, attributeSet, typedArray, i3, i4);
        }
    }

    private static f W() {
        return new a(p048m.b.f9738O, Boolean.class, 28);
    }

    public static void X(View view, C0230a c0230a) {
        if (c0230a == null && (j(view) instanceof C0230a.C0066a)) {
            c0230a = new C0230a();
        }
        g0(view);
        view.setAccessibilityDelegate(c0230a == null ? null : c0230a.d());
    }

    public static void Y(View view, boolean z3) {
        b().f(view, Boolean.valueOf(z3));
    }

    public static void Z(View view, int i3) {
        view.setAccessibilityLiveRegion(i3);
    }

    public static void a0(View view, CharSequence charSequence) {
        O().f(view, charSequence);
        if (charSequence != null) {
            f4578f.a(view);
        } else {
            f4578f.d(view);
        }
    }

    private static f b() {
        return new d(p048m.b.f9733J, Boolean.class, 28);
    }

    public static void b0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static C0247i0 c(View view) {
        if (f4573a == null) {
            f4573a = new WeakHashMap();
        }
        C0247i0 c0247i0 = (C0247i0) f4573a.get(view);
        if (c0247i0 != null) {
            return c0247i0;
        }
        C0247i0 c0247i1 = new C0247i0(view);
        f4573a.put(view, c0247i1);
        return c0247i1;
    }

    public static void c0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static C0257n0 d(View view, C0257n0 c0257n0, Rect rect) {
        return h.b(view, c0257n0, rect);
    }

    public static void d0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static C0257n0 e(View view, C0257n0 c0257n0) {
        WindowInsets windowInsetsU = c0257n0.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsU);
            if (!windowInsetsA.equals(windowInsetsU)) {
                return C0257n0.w(windowInsetsA, view);
            }
        }
        return c0257n0;
    }

    public static void e0(View view, float f3) {
        h.s(view, f3);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void f0(View view, int i3) {
        view.setImportantForAccessibility(i3);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    private static void g0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    static void h(View view) {
        C0230a c0230aI = i(view);
        if (c0230aI == null) {
            c0230aI = new C0230a();
        }
        X(view, c0230aI);
    }

    public static void h0(View view, boolean z3) {
        h.t(view, z3);
    }

    public static C0230a i(View view) {
        View.AccessibilityDelegate accessibilityDelegateJ = j(view);
        if (accessibilityDelegateJ == null) {
            return null;
        }
        return accessibilityDelegateJ instanceof C0230a.C0066a ? ((C0230a.C0066a) accessibilityDelegateJ).f4595a : new C0230a(accessibilityDelegateJ);
    }

    public static void i0(View view, I i3) {
        h.u(view, i3);
    }

    private static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? k.a(view) : k(view);
    }

    public static void j0(View view, boolean z3) {
        W().f(view, Boolean.valueOf(z3));
    }

    private static View.AccessibilityDelegate k(View view) {
        if (f4575c) {
            return null;
        }
        if (f4574b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4574b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4575c = true;
                return null;
            }
        }
        try {
            Object obj = f4574b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4575c = true;
            return null;
        }
    }

    public static void k0(View view, int i3, int i4) {
        i.d(view, i3, i4);
    }

    public static CharSequence l(View view) {
        return (CharSequence) O().e(view);
    }

    public static void l0(View view, CharSequence charSequence) {
        n0().f(view, charSequence);
    }

    public static ColorStateList m(View view) {
        return h.g(view);
    }

    public static void m0(View view, String str) {
        h.v(view, str);
    }

    public static PorterDuff.Mode n(View view) {
        return h.h(view);
    }

    private static f n0() {
        return new c(p048m.b.f9739P, CharSequence.class, 64, 30);
    }

    public static float o(View view) {
        return h.i(view);
    }

    public static void o0(View view) {
        h.z(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K p(View view) {
        return view instanceof K ? (K) view : f4577e;
    }

    public static boolean q(View view) {
        return view.getFitsSystemWindows();
    }

    public static int r(View view) {
        return view.getImportantForAccessibility();
    }

    public static int s(View view) {
        return view.getLayoutDirection();
    }

    public static int t(View view) {
        return view.getMinimumHeight();
    }

    public static String[] u(View view) {
        return Build.VERSION.SDK_INT >= 31 ? m.a(view) : (String[]) view.getTag(p048m.b.f9737N);
    }

    public static int v(View view) {
        return view.getPaddingEnd();
    }

    public static int w(View view) {
        return view.getPaddingStart();
    }

    public static ViewParent x(View view) {
        return view.getParentForAccessibility();
    }

    public static C0257n0 y(View view) {
        return i.a(view);
    }

    public static CharSequence z(View view) {
        return (CharSequence) n0().e(view);
    }
}
