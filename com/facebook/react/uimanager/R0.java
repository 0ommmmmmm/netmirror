package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R0 f7370a = new R0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f7371b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f7372c = new HashMap();

    private static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f7373a;

        public a(Class cls) {
            D2.h.f(cls, "shadowNodeClass");
            Map mapH = X0.h(cls);
            D2.h.e(mapH, "getNativePropSettersForShadowNodeClass(...)");
            this.f7373a = mapH;
        }

        @Override // com.facebook.react.uimanager.R0.d
        public void b(Map map) {
            D2.h.f(map, "props");
            for (X0.m mVar : this.f7373a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.R0.e
        public void c(InterfaceC0414q0 interfaceC0414q0, String str, Object obj) {
            D2.h.f(interfaceC0414q0, "node");
            D2.h.f(str, "name");
            X0.m mVar = (X0.m) this.f7373a.get(str);
            if (mVar != null) {
                mVar.d(interfaceC0414q0, obj);
            }
        }
    }

    private static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f7374a;

        public b(Class<? extends ViewManager<View, ?>> cls) {
            D2.h.f(cls, "viewManagerClass");
            Map mapI = X0.i(cls);
            D2.h.e(mapI, "getNativePropSettersForViewManagerClass(...)");
            this.f7374a = mapI;
        }

        @Override // com.facebook.react.uimanager.R0.f
        public void a(ViewManager viewManager, View view, String str, Object obj) {
            D2.h.f(viewManager, "manager");
            D2.h.f(view, "view");
            D2.h.f(str, "name");
            X0.m mVar = (X0.m) this.f7374a.get(str);
            if (mVar != null) {
                mVar.e(viewManager, view, obj);
            }
        }

        @Override // com.facebook.react.uimanager.R0.d
        public void b(Map map) {
            D2.h.f(map, "props");
            for (X0.m mVar : this.f7374a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }
    }

    public static final class c implements Q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewManager f7375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f7376b;

        public c(ViewManager<View, ?> viewManager) {
            D2.h.f(viewManager, "manager");
            this.f7375a = viewManager;
            this.f7376b = R0.f7370a.d(viewManager.getClass());
        }

        @Override // com.facebook.react.uimanager.Q0
        public void a(View view, String str, ReadableArray readableArray) {
            D2.h.f(view, "view");
            D2.h.f(str, "commandName");
        }

        @Override // com.facebook.react.uimanager.Q0
        public void b(View view, String str, Object obj) {
            D2.h.f(view, "view");
            D2.h.f(str, "propName");
            this.f7376b.a(this.f7375a, view, str, obj);
        }
    }

    public interface d {
        void b(Map map);
    }

    public interface e extends d {
        void c(InterfaceC0414q0 interfaceC0414q0, String str, Object obj);
    }

    public interface f extends d {
        void a(ViewManager viewManager, View view, String str, Object obj);
    }

    private R0() {
    }

    public static final void b() {
        X0.b();
        f7371b.clear();
        f7372c.clear();
    }

    private final Object c(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            Y.a.I("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f d(Class cls) {
        Map map = f7371b;
        f bVar = (f) map.get(cls);
        if (bVar == null) {
            bVar = (f) c(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            map.put(cls, bVar);
        }
        return bVar;
    }

    private final e e(Class cls) {
        Map map = f7372c;
        e aVar = (e) map.get(cls);
        if (aVar == null) {
            aVar = (e) c(cls);
            if (aVar == null) {
                D2.h.d(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Nothing>");
                aVar = new a(cls);
            }
            map.put(cls, aVar);
        }
        return aVar;
    }

    public static final Map f(Class cls, Class cls2) {
        D2.h.f(cls, "viewManagerTopClass");
        D2.h.f(cls2, "shadowNodeTopClass");
        HashMap map = new HashMap();
        R0 r3 = f7370a;
        r3.d(cls).b(map);
        r3.e(cls2).b(map);
        return map;
    }

    public static final void g(InterfaceC0414q0 interfaceC0414q0, C0417s0 c0417s0) {
        D2.h.f(interfaceC0414q0, "node");
        D2.h.f(c0417s0, "props");
        e eVarE = f7370a.e(interfaceC0414q0.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c0417s0.f7631a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarE.c(interfaceC0414q0, next.getKey(), next.getValue());
        }
    }
}
