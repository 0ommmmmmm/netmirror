package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class T implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f6049b;

    class a extends n0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f6050g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f6051h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ U0.b f6052i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f6053j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0317n interfaceC0317n, h0 h0Var, f0 f0Var, String str, h0 h0Var2, f0 f0Var2, U0.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC0317n, h0Var, f0Var, str);
            this.f6050g = h0Var2;
            this.f6051h = f0Var2;
            this.f6052i = bVar;
            this.f6053j = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.n0, V.e
        protected void d() {
            super.d();
            this.f6053j.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.n0, V.e
        protected void e(Exception exc) {
            super.e(exc);
            this.f6050g.e(this.f6051h, "LocalThumbnailBitmapSdk29Producer", false);
            this.f6051h.n0("local", "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(p005b0.a aVar) {
            p005b0.a.D(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.n0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(p005b0.a aVar) {
            return X.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V.e
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public p005b0.a c() throws IOException {
            String strE;
            Bitmap bitmapLoadThumbnail;
            Size size = new Size(this.f6052i.n(), this.f6052i.m());
            try {
                strE = T.this.e(this.f6052i);
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                bitmapLoadThumbnail = Z.a.c(Z.a.b(strE)) ? ThumbnailUtils.createVideoThumbnail(new File(strE), size, this.f6053j) : ThumbnailUtils.createImageThumbnail(new File(strE), size, this.f6053j);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = T.this.f6049b.loadThumbnail(this.f6052i.v(), size, this.f6053j);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            O0.e eVarK0 = O0.e.k0(bitmapLoadThumbnail, G0.d.b(), O0.n.f1480d, 0);
            this.f6051h.A("image_format", "thumbnail");
            eVarK0.q(this.f6051h.a());
            return p005b0.a.d0(eVarK0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.n0, V.e
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(p005b0.a aVar) {
            super.f(aVar);
            this.f6050g.e(this.f6051h, "LocalThumbnailBitmapSdk29Producer", aVar != null);
            this.f6051h.n0("local", "thumbnail_bitmap");
        }
    }

    class b extends C0309f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f6055a;

        b(n0 n0Var) {
            this.f6055a = n0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
        public void a() {
            this.f6055a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f6048a = executor;
        this.f6049b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(U0.b bVar) {
        return p021f0.f.e(this.f6049b, bVar.v());
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        h0 h0VarP = f0Var.P();
        U0.b bVarX = f0Var.X();
        f0Var.n0("local", "thumbnail_bitmap");
        a aVar = new a(interfaceC0317n, h0VarP, f0Var, "LocalThumbnailBitmapSdk29Producer", h0VarP, f0Var, bVarX, new CancellationSignal());
        f0Var.a0(new b(aVar));
        this.f6048a.execute(aVar);
    }
}
