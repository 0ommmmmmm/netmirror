package p066q1;

import D2.h;
import p015d2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {
    public c(String str) {
        h.f(str, "sectionName");
        a.c(0L, str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        a.i(0L);
    }
}
