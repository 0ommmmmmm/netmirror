package p063p2;

import D2.h;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.ting.TingModule;
import java.util.HashMap;
import java.util.Map;
import p014d1.b0;
import p090w1.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map l() {
        HashMap map = new HashMap();
        map.put("Ting", new ReactModuleInfo("Ting", "Ting", false, false, true, false, true));
        return map;
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        h.f(str, "name");
        h.f(reactApplicationContext, "reactContext");
        if (h.b(str, "Ting")) {
            return new TingModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public a i() {
        return new a() { // from class: p2.l
            @Override // p090w1.a
            public final Map a() {
                return m.l();
            }
        };
    }
}
