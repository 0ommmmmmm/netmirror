package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements W0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5952c;

    public NativeJpegTranscoderFactory(int i3, boolean z3, boolean z4) {
        this.f5950a = i3;
        this.f5951b = z3;
        this.f5952c = z4;
    }

    @Override // W0.d
    public W0.c createImageTranscoder(D0.c cVar, boolean z3) {
        if (cVar != D0.b.f135b) {
            return null;
        }
        return new NativeJpegTranscoder(z3, this.f5950a, this.f5951b, this.f5952c);
    }
}
