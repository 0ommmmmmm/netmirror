package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0292g;
import androidx.lifecycle.InterfaceC0295j;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.C0485g;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f3001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0485g f3002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2.a f3003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f3004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f3005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3006f;

    private final class LifecycleOnBackPressedCancellable implements InterfaceC0295j, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0292g f3007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f3008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.a f3009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f3010d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0292g abstractC0292g, m mVar) {
            D2.h.f(abstractC0292g, "lifecycle");
            D2.h.f(mVar, "onBackPressedCallback");
            this.f3010d = onBackPressedDispatcher;
            this.f3007a = abstractC0292g;
            this.f3008b = mVar;
            abstractC0292g.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f3007a.c(this);
            this.f3008b.e(this);
            androidx.activity.a aVar = this.f3009c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f3009c = null;
        }

        @Override // androidx.lifecycle.InterfaceC0295j
        public void d(androidx.lifecycle.l lVar, AbstractC0292g.a aVar) {
            D2.h.f(lVar, "source");
            D2.h.f(aVar, "event");
            if (aVar == AbstractC0292g.a.ON_START) {
                this.f3009c = this.f3010d.c(this.f3008b);
                return;
            }
            if (aVar != AbstractC0292g.a.ON_STOP) {
                if (aVar == AbstractC0292g.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f3009c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    static final class a extends D2.i implements C2.a {
        a() {
            super(0);
        }

        @Override // C2.a
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return p071r2.r.f10603a;
        }

        public final void e() {
            OnBackPressedDispatcher.this.g();
        }
    }

    static final class b extends D2.i implements C2.a {
        b() {
            super(0);
        }

        @Override // C2.a
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return p071r2.r.f10603a;
        }

        public final void e() {
            OnBackPressedDispatcher.this.e();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3013a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C2.a aVar) {
            D2.h.f(aVar, "$onBackInvoked");
            aVar.a();
        }

        public final OnBackInvokedCallback b(final C2.a aVar) {
            D2.h.f(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.n
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(aVar);
                }
            };
        }

        public final void d(Object obj, int i3, Object obj2) {
            D2.h.f(obj, "dispatcher");
            D2.h.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            D2.h.f(obj, "dispatcher");
            D2.h.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private final class d implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f3014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f3015b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, m mVar) {
            D2.h.f(mVar, "onBackPressedCallback");
            this.f3015b = onBackPressedDispatcher;
            this.f3014a = mVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f3015b.f3002b.remove(this.f3014a);
            this.f3014a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f3014a.g(null);
                this.f3015b.g();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void b(androidx.lifecycle.l lVar, m mVar) {
        D2.h.f(lVar, "owner");
        D2.h.f(mVar, "onBackPressedCallback");
        AbstractC0292g abstractC0292gT = lVar.t();
        if (abstractC0292gT.b() == AbstractC0292g.b.DESTROYED) {
            return;
        }
        mVar.a(new LifecycleOnBackPressedCancellable(this, abstractC0292gT, mVar));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar.g(this.f3003c);
        }
    }

    public final androidx.activity.a c(m mVar) {
        D2.h.f(mVar, "onBackPressedCallback");
        this.f3002b.add(mVar);
        d dVar = new d(this, mVar);
        mVar.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar.g(this.f3003c);
        }
        return dVar;
    }

    public final boolean d() {
        C0485g c0485g = this.f3002b;
        if (c0485g != null && c0485g.isEmpty()) {
            return false;
        }
        Iterator<E> it = c0485g.iterator();
        while (it.hasNext()) {
            if (((m) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        Object objPrevious;
        C0485g c0485g = this.f3002b;
        ListIterator<E> listIterator = c0485g.listIterator(c0485g.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((m) objPrevious).c());
        m mVar = (m) objPrevious;
        if (mVar != null) {
            mVar.b();
            return;
        }
        Runnable runnable = this.f3001a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        D2.h.f(onBackInvokedDispatcher, "invoker");
        this.f3005e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean zD = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3005e;
        OnBackInvokedCallback onBackInvokedCallback = this.f3004d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (zD && !this.f3006f) {
            c.f3013a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3006f = true;
        } else {
            if (zD || !this.f3006f) {
                return;
            }
            c.f3013a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3006f = false;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f3001a = runnable;
        this.f3002b = new C0485g();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f3003c = new a();
            this.f3004d = c.f3013a.b(new b());
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : runnable);
    }
}
