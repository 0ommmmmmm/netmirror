package com.facebook.react.common.mapbuffer;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Iterable, E2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0098a f6542a = C0098a.f6543a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0098a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0098a f6543a = new C0098a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final H2.c f6544b = new H2.c(0, 65535);

        private C0098a() {
        }

        public final H2.c a() {
            return f6544b;
        }
    }

    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP,
        LONG;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f6552i = p091w2.a.a(a());
    }

    public interface c {
        long a();

        String b();

        int c();

        a d();

        double e();

        boolean f();

        int getKey();

        b getType();
    }

    a d(int i3);

    boolean g(int i3);

    boolean getBoolean(int i3);

    int getCount();

    double getDouble(int i3);

    int getInt(int i3);

    String getString(int i3);
}
