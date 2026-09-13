package p015d2;

import D2.h;
import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9333a = new a();

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    public enum EnumC0124a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f9338g = p091w2.a.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f9339b;

        EnumC0124a(char c4) {
            this.f9339b = c4;
        }
    }

    private a() {
    }

    public static final void a(long j3, String str, int i3) {
        h.f(str, "sectionName");
        J.a.a(str, i3);
    }

    public static final void b(long j3, String str, int i3, long j4) {
        h.f(str, "sectionName");
        a(j3, str, i3);
    }

    public static final void c(long j3, String str) {
        h.f(str, "sectionName");
        J.a.c(str);
    }

    public static final void d(long j3, String str, String[] strArr, int i3) {
        h.f(str, "sectionName");
        h.f(strArr, "args");
        J.a.c(str + "|" + f9333a.e(strArr, i3));
    }

    private final String e(String[] strArr, int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 1; i4 < i3; i4 += 2) {
            String str = strArr[i4 - 1];
            String str2 = strArr[i4];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i4 < i3 - 1) {
                sb.append(';');
            }
        }
        String string = sb.toString();
        h.e(string, "toString(...)");
        return string;
    }

    public static final void f(long j3, String str, int i3) {
        h.f(str, "sectionName");
        g(j3, str, i3);
    }

    public static final void g(long j3, String str, int i3) {
        h.f(str, "sectionName");
        J.a.d(str, i3);
    }

    public static final void h(long j3, String str, int i3, long j4) {
        h.f(str, "sectionName");
        g(j3, str, i3);
    }

    public static final void i(long j3) {
        J.a.f();
    }

    public static final boolean j(long j3) {
        return false;
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void l(long j3, String str, int i3) {
        h.f(str, "sectionName");
        a(j3, str, i3);
    }

    public static final void m(long j3, String str, int i3) {
        h.f(str, "counterName");
        J.a.j(str, i3);
    }

    public static final void n(long j3, String str, EnumC0124a enumC0124a) {
    }

    public static final void o(long j3, String str, Runnable runnable) {
        h.f(str, "sectionName");
        h.f(runnable, "block");
        c(j3, str);
        try {
            runnable.run();
        } finally {
            i(j3);
        }
    }

    public static final void p(TraceListener traceListener) {
    }
}
