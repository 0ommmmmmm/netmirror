package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import p014d1.AbstractC0450a;

/* JADX INFO: renamed from: com.facebook.react.runtime.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0360e extends AbstractC0450a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p042k1.e f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B1.a f7176b;

    public C0360e(p042k1.e eVar, B1.a aVar) {
        this.f7175a = eVar;
        this.f7176b = aVar;
    }

    private p090w1.a l() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap map = new HashMap();
        for (int i3 = 0; i3 < 8; i3++) {
            Class cls = clsArr[i3];
            p086v1.a aVar = (p086v1.a) cls.getAnnotation(p086v1.a.class);
            if (aVar != null) {
                map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new p090w1.a() { // from class: com.facebook.react.runtime.d
            @Override // p090w1.a
            public final Map a() {
                return C0360e.m(map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map m(Map map) {
        return map;
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f7175a);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f7175a);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f7175a);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f7176b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f7175a);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        if (!p018e1.a.a()) {
            return l();
        }
        try {
            return (p090w1.a) ((Class) p002a1.a.c(p018e1.a.b(C0360e.class.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return l();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C0360e.class.getName() + "$$ReactModuleInfoProvider", e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C0360e.class.getName() + "$$ReactModuleInfoProvider", e5);
        }
    }
}
