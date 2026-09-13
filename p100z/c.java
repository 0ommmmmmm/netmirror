package p100z;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f11041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f11044e = d.a();

    protected int a(int i3) {
        return i3 + this.f11041b.getInt(i3);
    }

    protected int b(int i3) {
        if (i3 < this.f11043d) {
            return this.f11041b.getShort(this.f11042c + i3);
        }
        return 0;
    }

    protected void c(int i3, ByteBuffer byteBuffer) {
        this.f11041b = byteBuffer;
        if (byteBuffer == null) {
            this.f11040a = 0;
            this.f11042c = 0;
            this.f11043d = 0;
        } else {
            this.f11040a = i3;
            int i4 = i3 - byteBuffer.getInt(i3);
            this.f11042c = i4;
            this.f11043d = this.f11041b.getShort(i4);
        }
    }

    protected int d(int i3) {
        int i4 = i3 + this.f11040a;
        return i4 + this.f11041b.getInt(i4) + 4;
    }

    protected int e(int i3) {
        int i4 = i3 + this.f11040a;
        return this.f11041b.getInt(i4 + this.f11041b.getInt(i4));
    }
}
