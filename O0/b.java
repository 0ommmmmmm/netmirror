package O0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f1453j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p005b0.a f1454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Bitmap f1455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f1456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1458i;

    protected b(Bitmap bitmap, p005b0.h hVar, o oVar, int i3, int i4) {
        this.f1455f = (Bitmap) X.k.g(bitmap);
        this.f1454e = p005b0.a.n0(this.f1455f, (p005b0.h) X.k.g(hVar));
        this.f1456g = oVar;
        this.f1457h = i3;
        this.f1458i = i4;
    }

    private synchronized p005b0.a t0() {
        p005b0.a aVar;
        aVar = this.f1454e;
        this.f1454e = null;
        this.f1455f = null;
        return aVar;
    }

    private static int u0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int v0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean w0() {
        return f1453j;
    }

    @Override // O0.c
    public Bitmap C() {
        return this.f1455f;
    }

    @Override // O0.e
    public int N() {
        return this.f1457h;
    }

    @Override // O0.d
    public synchronized boolean b() {
        return this.f1454e == null;
    }

    @Override // O0.d
    public int b0() {
        return Z0.e.j(this.f1455f);
    }

    @Override // O0.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p005b0.a aVarT0 = t0();
        if (aVarT0 != null) {
            aVarT0.close();
        }
    }

    @Override // O0.d, O0.l
    public int d() {
        int i3;
        return (this.f1457h % 180 != 0 || (i3 = this.f1458i) == 5 || i3 == 7) ? v0(this.f1455f) : u0(this.f1455f);
    }

    @Override // O0.d, O0.l
    public int h() {
        int i3;
        return (this.f1457h % 180 != 0 || (i3 = this.f1458i) == 5 || i3 == 7) ? u0(this.f1455f) : v0(this.f1455f);
    }

    @Override // O0.a, O0.d
    public o l() {
        return this.f1456g;
    }

    @Override // O0.e
    public int s0() {
        return this.f1458i;
    }

    protected b(p005b0.a aVar, o oVar, int i3, int i4) {
        p005b0.a aVar2 = (p005b0.a) X.k.g(aVar.z());
        this.f1454e = aVar2;
        this.f1455f = (Bitmap) aVar2.P();
        this.f1456g = oVar;
        this.f1457h = i3;
        this.f1458i = i4;
    }
}
