package p014d1;

import D2.h;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;

/* JADX INFO: renamed from: d1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f9218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f9219b;

    public C0459j(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactApplicationContext");
        this.f9218a = reactApplicationContext;
        this.f9219b = new HashMap();
    }

    public final NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f9218a, this.f9219b);
    }

    public final void b(O o3) {
        h.f(o3, "reactPackage");
        Iterable<ModuleHolder> iterableB = o3 instanceof AbstractC0457h ? ((AbstractC0457h) o3).b(this.f9218a) : o3 instanceof AbstractC0450a ? ((AbstractC0450a) o3).h(this.f9218a) : P.f9153a.a(o3, this.f9218a);
        for (ModuleHolder moduleHolder : iterableB) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = (ModuleHolder) this.f9219b.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                throw new IllegalStateException(("\nNative module " + name + " tried to override " + moduleHolder2.getClassName() + ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice. \nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the \npackage is present only once in getPackages() but is also automatically added later during build time \nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
            this.f9219b.put(name, moduleHolder);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0459j(ReactApplicationContext reactApplicationContext, J j3) {
        this(reactApplicationContext);
        h.f(reactApplicationContext, "reactApplicationContext");
        h.f(j3, "reactInstanceManager");
    }
}
