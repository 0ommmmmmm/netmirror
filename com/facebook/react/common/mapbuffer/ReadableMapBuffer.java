package com.facebook.react.common.mapbuffer;

import C2.l;
import D2.h;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071r2.p;
import p075s2.x;

/* JADX INFO: loaded from: classes.dex */
public final class ReadableMapBuffer extends HybridClassBase implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6525e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f6526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6528d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements com.facebook.react.common.mapbuffer.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6529a;

        public b(int i3) {
            this.f6529a = i3;
        }

        private final void g(com.facebook.react.common.mapbuffer.a.b bVar) {
            com.facebook.react.common.mapbuffer.a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            g(com.facebook.react.common.mapbuffer.a.b.LONG);
            return ReadableMapBuffer.this.C(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String b() {
            g(com.facebook.react.common.mapbuffer.a.b.STRING);
            return ReadableMapBuffer.this.E(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int c() {
            g(com.facebook.react.common.mapbuffer.a.b.INT);
            return ReadableMapBuffer.this.B(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a d() {
            g(com.facebook.react.common.mapbuffer.a.b.MAP);
            return ReadableMapBuffer.this.D(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double e() {
            g(com.facebook.react.common.mapbuffer.a.b.DOUBLE);
            return ReadableMapBuffer.this.z(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            g(com.facebook.react.common.mapbuffer.a.b.BOOL);
            return ReadableMapBuffer.this.x(this.f6529a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.F(this.f6529a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a.b getType() {
            return com.facebook.react.common.mapbuffer.a.b.values()[ReadableMapBuffer.this.F(this.f6529a + 2) & 65535];
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6531a;

        static {
            int[] iArr = new int[com.facebook.react.common.mapbuffer.a.b.values().length];
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.facebook.react.common.mapbuffer.a.b.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6531a = iArr;
        }
    }

    public static final class d implements Iterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6533c;

        d() {
            this.f6533c = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.react.common.mapbuffer.a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i3 = this.f6532b;
            this.f6532b = i3 + 1;
            return readableMapBuffer.new b(readableMapBuffer.t(i3));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6532b <= this.f6533c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i3) {
        this.f6526b = byteBuffer;
        this.f6527c = i3;
        A();
    }

    private final void A() {
        if (this.f6526b.getShort() != 254) {
            this.f6526b.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f6528d = F(this.f6526b.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B(int i3) {
        return this.f6526b.getInt(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C(int i3) {
        return this.f6526b.getLong(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer D(int i3) {
        return r(v() + this.f6526b.getInt(i3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(int i3) {
        int iV = v() + this.f6526b.getInt(i3);
        int i4 = this.f6526b.getInt(iV);
        byte[] bArr = new byte[i4];
        this.f6526b.position(iV + 4);
        this.f6526b.get(bArr, 0, i4);
        return new String(bArr, K2.d.f816b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final short F(int i3) {
        return p.a(this.f6526b.getShort(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence G(com.facebook.react.common.mapbuffer.a.c cVar) {
        h.f(cVar, "entry");
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.getKey());
        sb.append('=');
        switch (c.f6531a[cVar.getType().ordinal()]) {
            case 1:
                sb.append(cVar.f());
                return sb;
            case 2:
                sb.append(cVar.c());
                return sb;
            case 3:
                sb.append(cVar.a());
                return sb;
            case 4:
                sb.append(cVar.e());
                return sb;
            case 5:
                sb.append('\"');
                sb.append(cVar.b());
                sb.append('\"');
                return sb;
            case 6:
                sb.append(cVar.d().toString());
                return sb;
            default:
                throw new p071r2.h();
        }
    }

    private final ReadableMapBuffer r(int i3) {
        ByteBuffer byteBufferDuplicate = this.f6526b.duplicate();
        byteBufferDuplicate.position(i3);
        h.e(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, i3);
    }

    private final int s(int i3) {
        H2.c cVarA = com.facebook.react.common.mapbuffer.a.f6542a.a();
        int iA = cVarA.a();
        if (i3 <= cVarA.b() && iA <= i3) {
            short sA = p.a((short) i3);
            int count = getCount() - 1;
            int i4 = 0;
            while (i4 <= count) {
                int i5 = (i4 + count) >>> 1;
                int iF = F(t(i5)) & 65535;
                int i6 = 65535 & sA;
                if (h.g(iF, i6) < 0) {
                    i4 = i5 + 1;
                } else {
                    if (h.g(iF, i6) <= 0) {
                        return i5;
                    }
                    count = i5 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t(int i3) {
        return this.f6527c + 8 + (i3 * 12);
    }

    private final int v() {
        return t(getCount());
    }

    private final int w(int i3, com.facebook.react.common.mapbuffer.a.b bVar) {
        int iS = s(i3);
        if (iS == -1) {
            throw new IllegalArgumentException(("Key not found: " + i3).toString());
        }
        com.facebook.react.common.mapbuffer.a.b bVarY = y(iS);
        if (bVarY == bVar) {
            return t(iS) + 4;
        }
        throw new IllegalStateException(("Expected " + bVar + " for key: " + i3 + ", found " + bVarY + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(int i3) {
        return B(i3) == 1;
    }

    private final com.facebook.react.common.mapbuffer.a.b y(int i3) {
        return com.facebook.react.common.mapbuffer.a.b.values()[F(t(i3) + 2) & 65535];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double z(int i3) {
        return this.f6526b.getDouble(i3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.f6526b;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).f6526b;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return h.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean g(int i3) {
        return s(i3) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i3) {
        return x(w(i3, com.facebook.react.common.mapbuffer.a.b.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.f6528d;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i3) {
        return z(w(i3, com.facebook.react.common.mapbuffer.a.b.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i3) {
        return B(w(i3, com.facebook.react.common.mapbuffer.a.b.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i3) {
        return E(w(i3, com.facebook.react.common.mapbuffer.a.b.STRING));
    }

    public int hashCode() {
        this.f6526b.rewind();
        return this.f6526b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d();
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder("{");
        x.P(this, sb, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new l() { // from class: h1.a
            @Override // C2.l
            public final Object d(Object obj) {
                return ReadableMapBuffer.G((com.facebook.react.common.mapbuffer.a.c) obj);
            }
        });
        sb.append('}');
        String string = sb.toString();
        h.e(string, "toString(...)");
        return string;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ReadableMapBuffer d(int i3) {
        return D(w(i3, com.facebook.react.common.mapbuffer.a.b.MAP));
    }
}
