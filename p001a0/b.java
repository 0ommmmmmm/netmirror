package p001a0;

import java.nio.ByteBuffer;
import p064q.e;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2850a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f2851b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f2852c = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f2851b);
        }
    }

    public static int e() {
        return f2851b;
    }

    @Override // p064q.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b() {
        return (ByteBuffer) f2852c.get();
    }

    @Override // p064q.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
