package com.facebook.imagepipeline.platform;

import X.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p001a0.h;
import p005b0.a;

/* JADX INFO: loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f5957c;

    public KitKatPurgeableDecoder(d dVar) {
        this.f5957c = dVar;
    }

    private static void h(byte[] bArr, int i3) {
        bArr[i3] = -1;
        bArr[i3 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.P();
        int size = hVar.size();
        a aVarA = this.f5957c.a(size);
        try {
            byte[] bArr = (byte[]) aVarA.P();
            hVar.c(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.D(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i3, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i3) ? null : DalvikPurgeableDecoder.f5945b;
        h hVar = (h) aVar.P();
        k.b(Boolean.valueOf(i3 <= hVar.size()));
        int i4 = i3 + 2;
        a aVarA = this.f5957c.a(i4);
        try {
            byte[] bArr2 = (byte[]) aVarA.P();
            hVar.c(0, bArr2, 0, i3);
            if (bArr != null) {
                h(bArr2, i3);
                i3 = i4;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i3, options), "BitmapFactory returned null");
        } finally {
            a.D(aVarA);
        }
    }
}
