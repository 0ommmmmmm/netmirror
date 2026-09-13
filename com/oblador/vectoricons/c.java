package com.oblador.vectoricons;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;
import p014d1.b0;

/* JADX INFO: loaded from: classes.dex */
public class c extends b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l() {
        HashMap map = new HashMap();
        map.put(NativeRNVectorIconsSpec.NAME, new ReactModuleInfo(NativeRNVectorIconsSpec.NAME, NativeRNVectorIconsSpec.NAME, false, false, false, false, true));
        return map;
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNVectorIconsSpec.NAME)) {
            return new VectorIconsModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        return new p090w1.a() { // from class: com.oblador.vectoricons.b
            @Override // p090w1.a
            public final Map a() {
                return c.l();
            }
        };
    }
}
