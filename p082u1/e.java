package p082u1;

import D2.h;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10878g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final WeakHashMap f10879h = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f10882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f10883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f10885f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(ReactContext reactContext) {
            h.f(reactContext, "context");
            WeakHashMap weakHashMap = e.f10879h;
            Object eVar = weakHashMap.get(reactContext);
            if (eVar == null) {
                eVar = new e(reactContext, null);
                weakHashMap.put(reactContext, eVar);
            }
            return (e) eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e eVar, int i3) {
        Iterator it = eVar.f10881b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(i3);
        }
    }

    private final void k(int i3) {
        Runnable runnable = (Runnable) this.f10885f.get(i3);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f10885f.remove(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(e eVar, p082u1.a aVar, int i3) {
        eVar.p(aVar, i3);
    }

    private final void n(final int i3, long j3) {
        Runnable runnable = new Runnable() { // from class: u1.d
            @Override // java.lang.Runnable
            public final void run() {
                e.o(this.f10876b, i3);
            }
        };
        this.f10885f.append(i3, runnable);
        UiThreadUtil.runOnUiThread(runnable, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(e eVar, int i3) {
        eVar.f(i3);
    }

    private final synchronized void p(p082u1.a aVar, int i3) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) p002a1.a.d(this.f10880a.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !aVar.e()) {
                throw new IllegalStateException(("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.").toString());
            }
            this.f10883d.add(Integer.valueOf(i3));
            this.f10884e.put(Integer.valueOf(i3), new p082u1.a(aVar));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i3, aVar.c(), aVar.a());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (aVar.d() > 0) {
                n(i3, aVar.d());
            }
            Iterator it = this.f10881b.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(i3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(f fVar) {
        h.f(fVar, "listener");
        this.f10881b.add(fVar);
        Iterator it = this.f10883d.iterator();
        while (it.hasNext()) {
            fVar.a(((Number) it.next()).intValue());
        }
    }

    public final synchronized void f(final int i3) {
        boolean zRemove = this.f10883d.remove(Integer.valueOf(i3));
        this.f10884e.remove(Integer.valueOf(i3));
        k(i3);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: u1.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.g(this.f10874b, i3);
                }
            });
        }
    }

    public final boolean h() {
        return !this.f10883d.isEmpty();
    }

    public final synchronized boolean i(int i3) {
        return this.f10883d.contains(Integer.valueOf(i3));
    }

    public final void j(f fVar) {
        h.f(fVar, "listener");
        this.f10881b.remove(fVar);
    }

    public final synchronized boolean l(final int i3) {
        p082u1.a aVar = (p082u1.a) this.f10884e.get(Integer.valueOf(i3));
        if (aVar == null) {
            throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + i3 + ".").toString());
        }
        g gVarB = aVar.b();
        if (gVarB != null && gVarB.a()) {
            k(i3);
            final p082u1.a aVar2 = new p082u1.a(aVar.c(), aVar.a(), aVar.d(), aVar.e(), gVarB.c());
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: u1.b
                @Override // java.lang.Runnable
                public final void run() {
                    e.m(this.f10871b, aVar2, i3);
                }
            }, gVarB.b());
            return true;
        }
        return false;
    }

    private e(ReactContext reactContext) {
        this.f10880a = new WeakReference(reactContext);
        this.f10881b = new CopyOnWriteArraySet();
        this.f10882c = new AtomicInteger(0);
        this.f10883d = new CopyOnWriteArraySet();
        this.f10884e = new ConcurrentHashMap();
        this.f10885f = new SparseArray();
    }
}
