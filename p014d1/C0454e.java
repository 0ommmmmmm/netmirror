package p014d1;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: renamed from: d1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0454e extends AbstractC0450a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f9204a;

    /* JADX INFO: renamed from: d1.e$a */
    class a implements p090w1.a {
        a() {
        }

        @Override // p090w1.a
        public Map a() {
            return Collections.emptyMap();
        }
    }

    private Map k() {
        if (this.f9204a == null) {
            HashMap map = new HashMap();
            map.put(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: d1.d
                @Override // javax.inject.Provider
                public final Object get() {
                    return new DebuggingOverlayManager();
                }
            }));
            this.f9204a = map;
        }
        return this.f9204a;
    }

    @Override // p014d1.c0
    public ViewManager a(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = (ModuleSpec) k().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // p014d1.c0
    public Collection d(ReactApplicationContext reactApplicationContext) {
        return k().keySet();
    }

    @Override // p014d1.AbstractC0450a
    public NativeModule g(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // p014d1.AbstractC0450a
    public p090w1.a i() {
        return new a();
    }

    @Override // p014d1.AbstractC0450a
    public List j(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(k().values());
    }
}
