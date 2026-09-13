package p014d1;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends TurboModuleManagerDelegate {
    private final List<b> mModuleProviders;
    private final Map<b, Map<String, ReactModuleInfo>> mPackageModuleInfos;
    private List<O> mPackages;
    private ReactApplicationContext mReactContext;
    private final boolean mShouldEnableLegacyModuleInterop;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f9161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f9162b;

        public V a() {
            p002a1.a.d(this.f9162b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            p002a1.a.d(this.f9161a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f9162b, this.f9161a);
        }

        protected abstract V b(ReactApplicationContext reactApplicationContext, List list);

        public a c(List list) {
            this.f9161a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f9162b = reactApplicationContext;
            return this;
        }
    }

    interface b {
        NativeModule getModule(String str);
    }

    protected V(ReactApplicationContext reactApplicationContext, List list, HybridData hybridData) {
        super(hybridData);
        this.mModuleProviders = new ArrayList();
        this.mPackageModuleInfos = new HashMap();
        this.mShouldEnableLegacyModuleInterop = p070r1.b.c() && p070r1.b.s();
        c(reactApplicationContext, list);
    }

    private void c(final ReactApplicationContext reactApplicationContext, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O o3 = (O) it.next();
            if (o3 instanceof AbstractC0450a) {
                final AbstractC0450a abstractC0450a = (AbstractC0450a) o3;
                b bVar = new b() { // from class: d1.S
                    @Override // d1.V.b
                    public final NativeModule getModule(String str) {
                        return V.d(abstractC0450a, reactApplicationContext, str);
                    }
                };
                this.mModuleProviders.add(bVar);
                this.mPackageModuleInfos.put(bVar, abstractC0450a.i().a());
            } else if (f() && (o3 instanceof AbstractC0457h)) {
                AbstractC0457h abstractC0457h = (AbstractC0457h) o3;
                List<ModuleSpec> listC = abstractC0457h.c(reactApplicationContext);
                final HashMap map = new HashMap();
                for (ModuleSpec moduleSpec : listC) {
                    map.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                b bVar2 = new b() { // from class: d1.T
                    @Override // d1.V.b
                    public final NativeModule getModule(String str) {
                        return V.e(map, str);
                    }
                };
                this.mModuleProviders.add(bVar2);
                this.mPackageModuleInfos.put(bVar2, abstractC0457h.d().a());
            } else if (f()) {
                List<NativeModule> listE = o3.e(reactApplicationContext);
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                for (NativeModule nativeModule : listE) {
                    Class<?> cls = nativeModule.getClass();
                    p086v1.a aVar = (p086v1.a) cls.getAnnotation(p086v1.a.class);
                    String strName = aVar != null ? aVar.name() : nativeModule.getName();
                    map3.put(strName, aVar != null ? new ReactModuleInfo(strName, cls.getName(), aVar.canOverrideExistingModule(), true, aVar.isCxxModule(), ReactModuleInfo.b(cls)) : new ReactModuleInfo(strName, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.b(cls)));
                    map2.put(strName, nativeModule);
                }
                b bVar3 = new b() { // from class: d1.U
                    @Override // d1.V.b
                    public final NativeModule getModule(String str) {
                        return (NativeModule) map2.get(str);
                    }
                };
                this.mModuleProviders.add(bVar3);
                this.mPackageModuleInfos.put(bVar3, map3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule d(AbstractC0450a abstractC0450a, ReactApplicationContext reactApplicationContext, String str) {
        return abstractC0450a.g(str, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule e(Map map, String str) {
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return (NativeModule) provider.get();
        }
        return null;
    }

    private boolean f() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(it.next()).values()) {
                if (reactModuleInfo.e() && reactModuleInfo.g()) {
                    arrayList.add(reactModuleInfo.f());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String str) {
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        NativeModule nativeModule = null;
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String str) {
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.mShouldEnableLegacyModuleInterop;
    }
}
