package p014d1;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.V0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: d1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0452c extends AbstractC0450a implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B1.a f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9202d;

    /* JADX INFO: renamed from: d1.c$a */
    class a implements V0 {
        a() {
        }

        @Override // com.facebook.react.uimanager.V0
        public ViewManager a(String str) {
            return C0452c.this.f9199a.z(str);
        }

        @Override // com.facebook.react.uimanager.V0
        public Collection b() {
            return C0452c.this.f9199a.H();
        }
    }

    public C0452c(J j3, B1.a aVar, boolean z3, int i3) {
        this.f9199a = j3;
        this.f9200b = aVar;
        this.f9201c = z3;
        this.f9202d = i3;
    }

    private UIManagerModule m(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        p015d2.a.c(0L, "createUIManagerModule");
        try {
            return this.f9201c ? new UIManagerModule(reactApplicationContext, new a(), this.f9202d) : new UIManagerModule(reactApplicationContext, (List<ViewManager>) this.f9199a.G(reactApplicationContext), this.f9202d);
        } finally {
            p015d2.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private p090w1.a n() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        final HashMap map = new HashMap();
        for (int i3 = 0; i3 < 11; i3++) {
            Class cls = clsArr[i3];
            p086v1.a aVar = (p086v1.a) cls.getAnnotation(p086v1.a.class);
            map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        }
        return new p090w1.a() { // from class: d1.b
            @Override // p090w1.a
            public final Map a() {
                return C0452c.o(map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map o(Map map) {
        return map;
    }

    @Override // p014d1.Q
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // p014d1.Q
    public void c() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f9199a.D());
            case "Timing":
                return new TimingModule(reactApplicationContext, this.f9199a.D());
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f9199a.D());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f9199a.D());
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f9200b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f9199a.D());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return m(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        if (!p018e1.a.a()) {
            return n();
        }
        try {
            return (p090w1.a) p018e1.a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return n();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e5);
        }
    }
}
