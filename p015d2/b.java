package p015d2;

import D2.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9340a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f9341b;

    public static abstract class a {
        public abstract a a(String str, int i3);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: d2.b$b, reason: collision with other inner class name */
    private static final class C0125b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9342a;

        public C0125b(long j3) {
            this.f9342a = j3;
        }

        @Override // d2.b.a
        public a a(String str, int i3) {
            h.f(str, "key");
            return this;
        }

        @Override // d2.b.a
        public a b(String str, Object obj) {
            h.f(str, "key");
            h.f(obj, "value");
            return this;
        }

        @Override // d2.b.a
        public void c() {
            p015d2.a.i(this.f9342a);
        }
    }

    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f9345c;

        public c(long j3, String str) {
            h.f(str, "sectionName");
            this.f9343a = j3;
            this.f9344b = str;
            this.f9345c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f9345c.add(str + ": " + str2);
        }

        @Override // d2.b.a
        public a a(String str, int i3) {
            h.f(str, "key");
            d(str, String.valueOf(i3));
            return this;
        }

        @Override // d2.b.a
        public a b(String str, Object obj) {
            h.f(str, "key");
            h.f(obj, "value");
            d(str, obj.toString());
            return this;
        }

        @Override // d2.b.a
        public void c() {
            String str;
            long j3 = this.f9343a;
            String str2 = this.f9344b;
            if (!b.f9341b || this.f9345c.isEmpty()) {
                str = "";
            } else {
                str = " (" + p015d2.c.a(", ", this.f9345c) + ")";
            }
            p015d2.a.c(j3, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j3, String str) {
        h.f(str, "sectionName");
        return new c(j3, str);
    }

    public static final a b(long j3) {
        return new C0125b(j3);
    }
}
