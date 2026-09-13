package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f7413a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f7414b = new HashMap();

    class a extends ThreadLocal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7415a;

        a(int i3) {
            this.f7415a = i3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] initialValue() {
            return new Object[this.f7415a];
        }
    }

    private static class b extends m {
        public b(L1.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    private static class c extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f7416i;

        public c(L1.a aVar, Method method, boolean z3) {
            super(aVar, "boolean", method);
            this.f7416i = z3;
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f7416i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    private static class d extends m {
        public d(L1.a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    private static class e extends m {
        public e(L1.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }

        public e(L1.b bVar, Method method, int i3) {
            super(bVar, "mixed", method, i3);
        }
    }

    private static class f extends m {
        public f(L1.a aVar, Method method) {
            super(aVar, "number", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public f(L1.b bVar, Method method, int i3) {
            super(bVar, "number", method, i3);
        }
    }

    private static class g extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7417i;

        public g(L1.a aVar, Method method) {
            this(aVar, method, 0);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f7417i) : ColorPropConverter.getColor(obj, context);
        }

        public g(L1.a aVar, Method method, int i3) {
            super(aVar, "mixed", method);
            this.f7417i = i3;
        }

        public g(L1.b bVar, Method method, int i3, int i4) {
            super(bVar, "mixed", method, i3);
            this.f7417i = i4;
        }
    }

    private static class i extends m {
        public i(L1.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(L1.b bVar, Method method, int i3) {
            super(bVar, "mixed", method, i3);
        }
    }

    private static class l extends m {
        public l(L1.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    private static class n extends m {
        public n(L1.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f7413a.clear();
        f7414b.clear();
    }

    private static m c(L1.a aVar, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(aVar.customType()) ? new g(aVar, method, aVar.defaultInt()) : new k(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new h(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new n(aVar, method);
        }
        if (cls == Boolean.class) {
            return new d(aVar, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(aVar.customType()) ? new e(aVar, method) : new f(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new l(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void d(L1.b bVar, Method method, Class cls, Map map) {
        String[] strArrNames = bVar.names();
        int i3 = 0;
        if (cls == Dynamic.class) {
            while (i3 < strArrNames.length) {
                map.put(strArrNames[i3], new i(bVar, method, i3));
                i3++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i3 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i3], new g(bVar, method, i3, bVar.defaultInt()));
                } else {
                    map.put(strArrNames[i3], new k(bVar, method, i3, bVar.defaultInt()));
                }
                i3++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i3 < strArrNames.length) {
                map.put(strArrNames[i3], new j(bVar, method, i3, bVar.defaultFloat()));
                i3++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i3 < strArrNames.length) {
                map.put(strArrNames[i3], new h(bVar, method, i3, bVar.defaultDouble()));
                i3++;
            }
            return;
        }
        if (cls == Integer.class) {
            while (i3 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i3], new e(bVar, method, i3));
                } else {
                    map.put(strArrNames[i3], new f(bVar, method, i3));
                }
                i3++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal e(int i3) {
        if (i3 <= 0) {
            return null;
        }
        return new a(i3);
    }

    private static void f(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            L1.a aVar = (L1.a) method.getAnnotation(L1.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
            }
            L1.b bVar = (L1.b) method.getAnnotation(L1.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[1], map);
            }
        }
    }

    private static void g(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            L1.a aVar = (L1.a) method.getAnnotation(L1.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
            }
            L1.b bVar = (L1.b) method.getAnnotation(L1.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[2], map);
            }
        }
    }

    static Map h(Class cls) {
        if (cls == null) {
            return f7414b;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == InterfaceC0414q0.class) {
                return f7414b;
            }
        }
        Map map = f7413a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(h(cls.getSuperclass()));
        f(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map i(Class cls) {
        if (cls == ViewManager.class) {
            return f7414b;
        }
        Map map = f7413a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(i(cls.getSuperclass()));
        g(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    private static class h extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final double f7418i;

        public h(L1.a aVar, Method method, double d4) {
            super(aVar, "number", method);
            this.f7418i = d4;
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f7418i : ((Double) obj).doubleValue());
        }

        public h(L1.b bVar, Method method, int i3, double d4) {
            super(bVar, "number", method, i3);
            this.f7418i = d4;
        }
    }

    private static class j extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f7419i;

        public j(L1.a aVar, Method method, float f3) {
            super(aVar, "number", method);
            this.f7419i = f3;
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f7419i : ((Double) obj).floatValue());
        }

        public j(L1.b bVar, Method method, int i3, float f3) {
            super(bVar, "number", method, i3);
            this.f7419i = f3;
        }
    }

    private static class k extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7420i;

        public k(L1.a aVar, Method method, int i3) {
            super(aVar, "number", method);
            this.f7420i = i3;
        }

        @Override // com.facebook.react.uimanager.X0.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f7420i : ((Double) obj).intValue());
        }

        public k(L1.b bVar, Method method, int i3, int i4) {
            super(bVar, "number", method, i3);
            this.f7420i = i4;
        }
    }

    static abstract class m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ThreadLocal f7421e = X0.e(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadLocal f7422f = X0.e(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ThreadLocal f7423g = X0.e(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ThreadLocal f7424h = X0.e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f7425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f7426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Method f7427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Integer f7428d;

        public String a() {
            return this.f7425a;
        }

        public String b() {
            return this.f7426b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(InterfaceC0414q0 interfaceC0414q0, Object obj) {
            Object[] objArr;
            try {
                if (this.f7428d == null) {
                    objArr = (Object[]) f7423g.get();
                    objArr[0] = c(obj, interfaceC0414q0.l());
                } else {
                    objArr = (Object[]) f7424h.get();
                    objArr[0] = this.f7428d;
                    objArr[1] = c(obj, interfaceC0414q0.l());
                }
                this.f7427c.invoke(interfaceC0414q0, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                Y.a.j(ViewManager.class, "Error while updating prop " + this.f7425a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f7425a + "' in shadow node of type: " + interfaceC0414q0.v(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f7428d == null) {
                    objArr = (Object[]) f7421e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = (Object[]) f7422f.get();
                    objArr[0] = view;
                    objArr[1] = this.f7428d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f7427c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                Y.a.j(ViewManager.class, "Error while updating prop " + this.f7425a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f7425a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        private m(L1.a aVar, String str, Method method) {
            this.f7425a = aVar.name();
            this.f7426b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f7427c = method;
            this.f7428d = null;
        }

        private m(L1.b bVar, String str, Method method, int i3) {
            this.f7425a = bVar.names()[i3];
            this.f7426b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f7427c = method;
            this.f7428d = Integer.valueOf(i3);
        }
    }
}
