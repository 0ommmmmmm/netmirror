package Z0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f2811a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f2812b = j.class;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2815c;

        public final int a() {
            return this.f2814b;
        }

        public final int b() {
            return this.f2815c;
        }

        public final boolean c() {
            return this.f2813a;
        }

        public final void d(int i3) {
            this.f2814b = i3;
        }

        public final void e(int i3) {
            this.f2815c = i3;
        }

        public final void f(boolean z3) {
            this.f2813a = z3;
        }
    }

    private j() {
    }

    public static final int a(int i3) {
        if (i3 == 0 || i3 == 1) {
            return 0;
        }
        if (i3 == 3) {
            return 180;
        }
        if (i3 != 6) {
            return i3 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int b(InputStream inputStream, int i3, boolean z3) {
        if (i3 >= 10 && i.a(inputStream, 2, z3) == 3 && i.a(inputStream, 4, z3) == 1) {
            return i.a(inputStream, 2, z3);
        }
        return 0;
    }

    private final int c(InputStream inputStream, int i3, boolean z3, int i4) throws IOException {
        if (i3 < 14) {
            return 0;
        }
        int iA = i.a(inputStream, 2, z3);
        int i5 = i3 - 2;
        while (true) {
            int i6 = iA - 1;
            if (iA <= 0 || i5 < 12) {
                break;
            }
            int i7 = i5 - 2;
            if (i.a(inputStream, 2, z3) == i4) {
                return i7;
            }
            inputStream.skip(10L);
            i5 -= 12;
            iA = i6;
        }
        return 0;
    }

    public static final int d(InputStream inputStream, int i3) throws IOException {
        D2.h.f(inputStream, "stream");
        a aVar = new a();
        j jVar = f2811a;
        int iE = jVar.e(inputStream, i3, aVar);
        int iB = aVar.b() - 8;
        if (iE == 0 || iB > iE) {
            return 0;
        }
        inputStream.skip(iB);
        return jVar.b(inputStream, jVar.c(inputStream, iE - iB, aVar.c(), 274), aVar.c());
    }

    private final int e(InputStream inputStream, int i3, a aVar) {
        if (i3 <= 8) {
            return 0;
        }
        aVar.d(i.a(inputStream, 4, false));
        if (aVar.a() != 1229531648 && aVar.a() != 1296891946) {
            Y.a.i(f2812b, "Invalid TIFF header");
            return 0;
        }
        aVar.f(aVar.a() == 1229531648);
        aVar.e(i.a(inputStream, 4, aVar.c()));
        int i4 = i3 - 8;
        if (aVar.b() >= 8 && aVar.b() - 8 <= i4) {
            return i4;
        }
        Y.a.i(f2812b, "Invalid offset");
        return 0;
    }
}
