package com.reactnativecommunity.webview;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p014d1.b0;

/* JADX INFO: loaded from: classes.dex */
public class q extends b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l() {
        HashMap map = new HashMap();
        map.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // p014d1.AbstractC0450a, p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNCWebViewManager());
        return arrayList;
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNCWebViewModuleSpec.NAME)) {
            return new RNCWebViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        return new p090w1.a() { // from class: com.reactnativecommunity.webview.p
            @Override // p090w1.a
            public final Map a() {
                return q.l();
            }
        };
    }
}
