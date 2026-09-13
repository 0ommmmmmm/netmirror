package b3;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0486h;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5590h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f5596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A f5597g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public A() {
        this.f5591a = new byte[8192];
        this.f5595e = true;
        this.f5594d = false;
    }

    public final void a() {
        A a4 = this.f5597g;
        int i3 = 0;
        if (!(a4 != this)) {
            throw new IllegalStateException("cannot compact");
        }
        D2.h.c(a4);
        if (a4.f5595e) {
            int i4 = this.f5593c - this.f5592b;
            A a5 = this.f5597g;
            D2.h.c(a5);
            int i5 = 8192 - a5.f5593c;
            A a6 = this.f5597g;
            D2.h.c(a6);
            if (!a6.f5594d) {
                A a7 = this.f5597g;
                D2.h.c(a7);
                i3 = a7.f5592b;
            }
            if (i4 > i5 + i3) {
                return;
            }
            A a8 = this.f5597g;
            D2.h.c(a8);
            g(a8, i4);
            b();
            B.b(this);
        }
    }

    public final A b() {
        A a4 = this.f5596f;
        if (a4 == this) {
            a4 = null;
        }
        A a5 = this.f5597g;
        D2.h.c(a5);
        a5.f5596f = this.f5596f;
        A a6 = this.f5596f;
        D2.h.c(a6);
        a6.f5597g = this.f5597g;
        this.f5596f = null;
        this.f5597g = null;
        return a4;
    }

    public final A c(A a4) {
        D2.h.f(a4, "segment");
        a4.f5597g = this;
        a4.f5596f = this.f5596f;
        A a5 = this.f5596f;
        D2.h.c(a5);
        a5.f5597g = a4;
        this.f5596f = a4;
        return a4;
    }

    public final A d() {
        this.f5594d = true;
        return new A(this.f5591a, this.f5592b, this.f5593c, true, false);
    }

    public final A e(int i3) {
        A aC;
        if (!(i3 > 0 && i3 <= this.f5593c - this.f5592b)) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i3 >= 1024) {
            aC = d();
        } else {
            aC = B.c();
            byte[] bArr = this.f5591a;
            byte[] bArr2 = aC.f5591a;
            int i4 = this.f5592b;
            AbstractC0486h.g(bArr, bArr2, 0, i4, i4 + i3, 2, null);
        }
        aC.f5593c = aC.f5592b + i3;
        this.f5592b += i3;
        A a4 = this.f5597g;
        D2.h.c(a4);
        a4.c(aC);
        return aC;
    }

    public final A f() {
        byte[] bArr = this.f5591a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        D2.h.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new A(bArrCopyOf, this.f5592b, this.f5593c, false, true);
    }

    public final void g(A a4, int i3) {
        D2.h.f(a4, "sink");
        if (!a4.f5595e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = a4.f5593c;
        if (i4 + i3 > 8192) {
            if (a4.f5594d) {
                throw new IllegalArgumentException();
            }
            int i5 = a4.f5592b;
            if ((i4 + i3) - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = a4.f5591a;
            AbstractC0486h.g(bArr, bArr, 0, i5, i4, 2, null);
            a4.f5593c -= a4.f5592b;
            a4.f5592b = 0;
        }
        byte[] bArr2 = this.f5591a;
        byte[] bArr3 = a4.f5591a;
        int i6 = a4.f5593c;
        int i7 = this.f5592b;
        AbstractC0486h.e(bArr2, bArr3, i6, i7, i7 + i3);
        a4.f5593c += i3;
        this.f5592b += i3;
    }

    public A(byte[] bArr, int i3, int i4, boolean z3, boolean z4) {
        D2.h.f(bArr, "data");
        this.f5591a = bArr;
        this.f5592b = i3;
        this.f5593c = i4;
        this.f5594d = z3;
        this.f5595e = z4;
    }
}
