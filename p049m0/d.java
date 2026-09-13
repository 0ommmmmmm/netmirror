package p049m0;

import J0.C0185t;
import J0.C0186u;
import J0.y;
import J0.z;
import V0.b;
import Y.a;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import p003a2.c;
import p093x0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f9806a = d.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f9807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f9808c;

    public static C0185t a() {
        return b().j();
    }

    public static y b() {
        return y.l();
    }

    public static void c(Context context, C0186u c0186u, b bVar) {
        d(context, c0186u, bVar, true);
    }

    public static void d(Context context, C0186u c0186u, b bVar, boolean z3) {
        if (b.d()) {
            b.a("Fresco#initialize");
        }
        if (f9808c) {
            a.E(f9806a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f9808c = true;
        }
        z.b(z3);
        if (!p003a2.a.c()) {
            if (b.d()) {
                b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
            } catch (ClassNotFoundException unused) {
                p003a2.a.b(new c());
            } catch (NoSuchMethodException unused2) {
                p003a2.a.b(new c());
            } catch (IllegalAccessException unused3) {
                p003a2.a.b(new c());
            } catch (InvocationTargetException unused4) {
                p003a2.a.b(new c());
            } finally {
                if (b.d()) {
                    b.b();
                }
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c0186u == null) {
            y.t(applicationContext);
        } else {
            y.s(c0186u);
        }
        e(applicationContext, bVar);
        if (b.d()) {
            b.b();
        }
    }

    private static void e(Context context, b bVar) {
        if (b.d()) {
            b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, bVar);
        f9807b = gVar;
        e.i(gVar);
        if (b.d()) {
            b.b();
        }
    }

    public static f f() {
        return f9807b.get();
    }
}
