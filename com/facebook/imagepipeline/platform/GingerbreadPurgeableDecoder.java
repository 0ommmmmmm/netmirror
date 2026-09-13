package com.facebook.imagepipeline.platform;

import X.k;
import X.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p001a0.h;
import p001a0.j;
import p005b0.a;
import p025g0.b;

/* JADX INFO: loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f5956c;

    public GingerbreadPurgeableDecoder() {
        b.i();
    }

    private static MemoryFile h(a aVar, int i3, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        p013d0.a aVar2;
        j jVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i3);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j((h) aVar.P());
            try {
                aVar2 = new p013d0.a(jVar2, i3);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    X.a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i3, bArr.length);
                    }
                    a.D(aVar);
                    X.b.b(jVar2);
                    X.b.b(aVar2);
                    X.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    jVar = jVar2;
                    a.D(aVar);
                    X.b.b(jVar);
                    X.b.b(aVar2);
                    X.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap i(a aVar, int i3, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFileH = null;
        try {
            try {
                memoryFileH = h(aVar, i3, bArr);
                k(memoryFileH);
                throw new IllegalStateException("WebpBitmapFactory is null");
            } catch (IOException e4) {
                throw p.a(e4);
            }
        } catch (Throwable th) {
            if (memoryFileH != null) {
                memoryFileH.close();
            }
            throw th;
        }
    }

    private synchronized Method j() {
        if (f5956c == null) {
            try {
                f5956c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e4) {
                throw p.a(e4);
            }
        }
        return f5956c;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, new Object[0]));
        } catch (Exception e4) {
            throw p.a(e4);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.P()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i3, BitmapFactory.Options options) {
        return i(aVar, i3, DalvikPurgeableDecoder.e(aVar, i3) ? null : DalvikPurgeableDecoder.f5945b, options);
    }
}
