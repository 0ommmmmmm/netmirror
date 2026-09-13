package com.facebook.imagepipeline.memory;

import R0.v;
import R0.x;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f5940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p005b0.a f5941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5942d;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        this(fVar, 0, 2, null);
        D2.h.f(fVar, "pool");
    }

    private final void i() {
        if (!p005b0.a.c0(this.f5941c)) {
            throw new a();
        }
    }

    @Override // p001a0.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        p005b0.a.D(this.f5941c);
        this.f5941c = null;
        this.f5942d = -1;
        super.close();
    }

    public final void o(int i3) throws Throwable {
        i();
        p005b0.a aVar = this.f5941c;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        D2.h.c(aVar);
        if (i3 <= ((v) aVar.P()).i()) {
            return;
        }
        Object obj = this.f5940b.get(i3);
        D2.h.e(obj, "get(...)");
        v vVar = (v) obj;
        p005b0.a aVar2 = this.f5941c;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        D2.h.c(aVar2);
        ((v) aVar2.P()).y(0, vVar, 0, this.f5942d);
        p005b0.a aVar3 = this.f5941c;
        D2.h.c(aVar3);
        aVar3.close();
        this.f5941c = p005b0.a.n0(vVar, this.f5940b);
    }

    @Override // p001a0.k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public x a() {
        i();
        p005b0.a aVar = this.f5941c;
        if (aVar != null) {
            return new x(aVar, this.f5942d);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p001a0.k
    public int size() {
        return this.f5942d;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        write(new byte[]{(byte) i3});
    }

    public /* synthetic */ g(f fVar, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i4 & 2) != 0 ? fVar.B() : i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i4) throws Throwable {
        D2.h.f(bArr, "buffer");
        if (i3 >= 0 && i4 >= 0 && i3 + i4 <= bArr.length) {
            i();
            o(this.f5942d + i4);
            p005b0.a aVar = this.f5941c;
            if (aVar != null) {
                ((v) aVar.P()).v(this.f5942d, bArr, i3, i4);
                this.f5942d += i4;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i3 + "; regionLength=" + i4);
    }

    public g(f fVar, int i3) {
        D2.h.f(fVar, "pool");
        if (i3 > 0) {
            this.f5940b = fVar;
            this.f5942d = 0;
            this.f5941c = p005b0.a.n0(fVar.get(i3), fVar);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
