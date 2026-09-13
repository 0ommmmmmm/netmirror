package com.facebook.imagepipeline.memory;

import R0.v;
import R0.w;
import X.k;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativeMemoryChunk implements v, Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5917d;

    static {
        p003a2.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i3) {
        k.b(Boolean.valueOf(i3 > 0));
        this.f5916c = i3;
        this.f5915b = nativeAllocate(i3);
        this.f5917d = false;
    }

    private void a(int i3, v vVar, int i4, int i5) {
        if (!(vVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!b());
        k.i(!vVar.b());
        w.b(i3, vVar.i(), i4, i5, this.f5916c);
        nativeMemcpy(vVar.z() + ((long) i4), this.f5915b + ((long) i3), i5);
    }

    private static native long nativeAllocate(int i3);

    private static native void nativeCopyFromByteArray(long j3, byte[] bArr, int i3, int i4);

    private static native void nativeCopyToByteArray(long j3, byte[] bArr, int i3, int i4);

    private static native void nativeFree(long j3);

    private static native void nativeMemcpy(long j3, long j4, int i3);

    private static native byte nativeReadByte(long j3);

    @Override // R0.v
    public synchronized boolean b() {
        return this.f5917d;
    }

    @Override // R0.v
    public synchronized int c(int i3, byte[] bArr, int i4, int i5) {
        int iA;
        k.g(bArr);
        k.i(!b());
        iA = w.a(i3, i5, this.f5916c);
        w.b(i3, bArr.length, i4, iA, this.f5916c);
        nativeCopyToByteArray(this.f5915b + ((long) i3), bArr, i4, iA);
        return iA;
    }

    @Override // R0.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f5917d) {
            this.f5917d = true;
            nativeFree(this.f5915b);
        }
    }

    protected void finalize() throws Throwable {
        if (b()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // R0.v
    public synchronized byte g(int i3) {
        k.i(!b());
        k.b(Boolean.valueOf(i3 >= 0));
        k.b(Boolean.valueOf(i3 < this.f5916c));
        return nativeReadByte(this.f5915b + ((long) i3));
    }

    @Override // R0.v
    public int i() {
        return this.f5916c;
    }

    @Override // R0.v
    public long o() {
        return this.f5915b;
    }

    @Override // R0.v
    public ByteBuffer q() {
        return null;
    }

    @Override // R0.v
    public synchronized int v(int i3, byte[] bArr, int i4, int i5) {
        int iA;
        k.g(bArr);
        k.i(!b());
        iA = w.a(i3, i5, this.f5916c);
        w.b(i3, bArr.length, i4, iA, this.f5916c);
        nativeCopyFromByteArray(this.f5915b + ((long) i3), bArr, i4, iA);
        return iA;
    }

    @Override // R0.v
    public void y(int i3, v vVar, int i4, int i5) {
        k.g(vVar);
        if (vVar.o() == o()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vVar)) + " which share the same address " + Long.toHexString(this.f5915b));
            k.b(Boolean.FALSE);
        }
        if (vVar.o() < o()) {
            synchronized (vVar) {
                synchronized (this) {
                    a(i3, vVar, i4, i5);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vVar) {
                    a(i3, vVar, i4, i5);
                }
            }
        }
    }

    @Override // R0.v
    public long z() {
        return this.f5915b;
    }

    public NativeMemoryChunk() {
        this.f5916c = 0;
        this.f5915b = 0L;
        this.f5917d = true;
    }
}
