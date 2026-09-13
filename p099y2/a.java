package p099y2;

import D2.h;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class a extends p095x2.a {

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    private static final class C0160a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0160a f11038a = new C0160a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f11039b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f11039b = num2;
        }

        private C0160a() {
        }
    }

    private final boolean b(int i3) {
        Integer num = C0160a.f11039b;
        return num == null || num.intValue() >= i3;
    }

    @Override // p095x2.a
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        h.f(th, "cause");
        h.f(th2, "exception");
        if (b(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
