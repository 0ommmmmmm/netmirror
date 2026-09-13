package p001a0;

import X.k;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2864b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f2864b.get(this.f2863a);
        long j3 = 0;
        while (true) {
            try {
                int i3 = inputStream.read(bArr, 0, this.f2863a);
                if (i3 == -1) {
                    this.f2864b.a(bArr);
                    return j3;
                }
                outputStream.write(bArr, 0, i3);
                j3 += (long) i3;
            } catch (Throwable th) {
                this.f2864b.a(bArr);
                throw th;
            }
        }
    }

    public l(a aVar, int i3) {
        k.b(Boolean.valueOf(i3 > 0));
        this.f2863a = i3;
        this.f2864b = aVar;
    }
}
