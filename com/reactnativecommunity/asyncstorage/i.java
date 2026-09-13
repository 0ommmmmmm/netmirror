package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p014d1.b0;

/* JADX INFO: loaded from: classes.dex */
public class i extends b0 {

    class a implements p090w1.a {
        a() {
        }

        @Override // p090w1.a
        public Map a() {
            HashMap map = new HashMap();
            Class cls = new Class[]{AsyncStorageModule.class}[0];
            p086v1.a aVar = (p086v1.a) cls.getAnnotation(p086v1.a.class);
            map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
            return map;
        }
    }

    @Override // p014d1.AbstractC0450a, p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals("RNCAsyncStorage")) {
            return new AsyncStorageModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        try {
            return (p090w1.a) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        }
    }
}
