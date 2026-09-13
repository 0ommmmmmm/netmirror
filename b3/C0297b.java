package b3;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0297b f5613a = new C0297b();

    private C0297b() {
    }

    public final j a(D d4) {
        D2.h.f(d4, "sink");
        return t.c(d4);
    }

    public final D b(OutputStream outputStream) {
        D2.h.f(outputStream, "outputStream");
        return t.h(outputStream);
    }

    public final F c(InputStream inputStream) {
        D2.h.f(inputStream, "inputStream");
        return t.l(inputStream);
    }
}
