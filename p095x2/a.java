package p095x2;

import D2.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p075s2.AbstractC0486h;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: x2.a$a, reason: collision with other inner class name */
    private static final class C0156a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0156a f10974a = new C0156a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f10975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f10976c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            h.c(methods);
            int length = methods.length;
            int i3 = 0;
            while (true) {
                method = null;
                if (i3 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i3];
                if (h.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    h.e(parameterTypes, "getParameterTypes(...)");
                    if (h.b(AbstractC0486h.A(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i3++;
            }
            f10975b = method2;
            for (Method method3 : methods) {
                if (h.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f10976c = method;
        }

        private C0156a() {
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        h.f(th, "cause");
        h.f(th2, "exception");
        Method method = C0156a.f10975b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
