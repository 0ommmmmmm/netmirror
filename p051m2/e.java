package p051m2;

import C2.a;
import D2.h;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import p014d1.AbstractC0450a;
import p014d1.c0;
import p071r2.d;
import p071r2.n;
import p075s2.AbstractC0492n;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0450a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f9840a = d.a(new a() { // from class: m2.a
        @Override // C2.a
        public final Object a() {
            return e.r();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map o() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(p086v1.a.class);
        h.c(annotation);
        p086v1.a aVar = (p086v1.a) annotation;
        String strName = aVar.name();
        String name = RNGestureHandlerModule.class.getName();
        h.e(name, "getName(...)");
        return D.i(n.a("RNGestureHandlerModule", new ReactModuleInfo(strName, name, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), true)));
    }

    private final Map q() {
        return (Map) this.f9840a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map r() {
        return D.h(n.a(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: m2.c
            @Override // javax.inject.Provider
            public final Object get() {
                return e.s();
            }
        })), n.a(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: m2.d
            @Override // javax.inject.Provider
            public final Object get() {
                return e.t();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule s() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule t() {
        return new RNGestureHandlerButtonViewManager();
    }

    @Override // p014d1.c0
    public ViewManager a(ReactApplicationContext reactApplicationContext, String str) {
        Provider provider;
        h.f(reactApplicationContext, "reactContext");
        h.f(str, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) q().get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a, p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        return AbstractC0492n.j(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        h.f(str, "name");
        h.f(reactApplicationContext, "reactContext");
        if (h.b(str, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            h.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (p090w1.a) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new p090w1.a() { // from class: m2.b
                @Override // p090w1.a
                public final Map a() {
                    return e.o();
                }
            };
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e5);
        }
    }

    @Override // p014d1.AbstractC0450a
    protected List j(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        return AbstractC0492n.g0(q().values());
    }

    @Override // p014d1.c0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List d(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        return AbstractC0492n.e0(q().keySet());
    }
}
