package p018e1;

import D2.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9347a = new a();

    private a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String str) {
        h.f(str, "className");
        if (a()) {
            return Class.forName(str);
        }
        return null;
    }
}
