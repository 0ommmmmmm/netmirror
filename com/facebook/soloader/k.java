package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends G {

    private final class a extends G.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f8242b;

        /* JADX WARN: Bottom block not found for handler: all -> 0x0107 */
        /* JADX WARN: Code duplicated, block: B:6:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        a(com.facebook.soloader.G r20) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.k.a.<init>(com.facebook.soloader.k, com.facebook.soloader.G):void");
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] i() {
            return this.f8242b;
        }

        @Override // com.facebook.soloader.G.e
        public void o(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f8242b) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f8244d);
                try {
                    G.d dVar = new G.d(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th) {
                        try {
                            dVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th3;
                }
            }
        }
    }

    private static final class b extends G.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final File f8244d;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f8244d = file;
        }
    }

    public k(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a(this);
    }
}
