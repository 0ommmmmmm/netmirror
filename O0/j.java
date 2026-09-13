package O0;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class j implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f1461o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p005b0.a f1462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X.n f1463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D0.c f1464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private I0.b f1471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorSpace f1472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f1473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1474n;

    public j(p005b0.a aVar) {
        this.f1464d = D0.c.f151d;
        this.f1465e = -1;
        this.f1466f = 0;
        this.f1467g = -1;
        this.f1468h = -1;
        this.f1469i = 1;
        this.f1470j = -1;
        X.k.b(Boolean.valueOf(p005b0.a.c0(aVar)));
        this.f1462b = aVar.clone();
        this.f1463c = null;
    }

    private p071r2.i A0() {
        InputStream inputStreamP = P();
        if (inputStreamP == null) {
            return null;
        }
        p071r2.i iVarF = Z0.k.f(inputStreamP);
        if (iVarF != null) {
            this.f1467g = ((Integer) iVarF.a()).intValue();
            this.f1468h = ((Integer) iVarF.b()).intValue();
        }
        return iVarF;
    }

    public static j i(j jVar) {
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }

    private void n0() {
        D0.c cVarD = D0.e.d(P());
        this.f1464d = cVarD;
        p071r2.i iVarA0 = D0.b.b(cVarD) ? A0() : z0().b();
        if (cVarD == D0.b.f135b && this.f1465e == -1) {
            if (iVarA0 != null) {
                int iB = Z0.h.b(P());
                this.f1466f = iB;
                this.f1465e = Z0.h.a(iB);
                return;
            }
            return;
        }
        if (cVarD == D0.b.f145l && this.f1465e == -1) {
            int iA = Z0.f.a(P());
            this.f1466f = iA;
            this.f1465e = Z0.h.a(iA);
        } else if (this.f1465e == -1) {
            this.f1465e = 0;
        }
    }

    public static void o(j jVar) {
        if (jVar != null) {
            jVar.close();
        }
    }

    public static boolean u0(j jVar) {
        return jVar.f1465e >= 0 && jVar.f1467g >= 0 && jVar.f1468h >= 0;
    }

    public static boolean w0(j jVar) {
        return jVar != null && jVar.v0();
    }

    private void y0() {
        if (this.f1467g < 0 || this.f1468h < 0) {
            x0();
        }
    }

    private Z0.g z0() throws Throwable {
        InputStream inputStreamP;
        try {
            inputStreamP = P();
            try {
                Z0.g gVarE = Z0.e.e(inputStreamP);
                this.f1472l = gVarE.a();
                p071r2.i iVarB = gVarE.b();
                if (iVarB != null) {
                    this.f1467g = ((Integer) iVarB.a()).intValue();
                    this.f1468h = ((Integer) iVarB.b()).intValue();
                }
                if (inputStreamP != null) {
                    try {
                        inputStreamP.close();
                    } catch (IOException unused) {
                    }
                }
                return gVarE;
            } catch (Throwable th) {
                th = th;
                if (inputStreamP != null) {
                    try {
                        inputStreamP.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamP = null;
        }
    }

    public String A(int i3) {
        p005b0.a aVarV = v();
        if (aVarV == null) {
            return "";
        }
        int iMin = Math.min(c0(), i3);
        byte[] bArr = new byte[iMin];
        try {
            p001a0.h hVar = (p001a0.h) aVarV.P();
            if (hVar == null) {
                aVarV.close();
                return "";
            }
            hVar.c(0, bArr, 0, iMin);
            aVarV.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i4 = 0; i4 < iMin; i4++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i4])));
            }
            return sb.toString();
        } catch (Throwable th) {
            aVarV.close();
            throw th;
        }
    }

    public void B0(I0.b bVar) {
        this.f1471k = bVar;
    }

    public void C0(int i3) {
        this.f1466f = i3;
    }

    public D0.c D() {
        y0();
        return this.f1464d;
    }

    public void D0(int i3) {
        this.f1468h = i3;
    }

    public void E0(D0.c cVar) {
        this.f1464d = cVar;
    }

    public void F0(int i3) {
        this.f1465e = i3;
    }

    public void G0(int i3) {
        this.f1469i = i3;
    }

    public void H0(String str) {
        this.f1473m = str;
    }

    public void I0(int i3) {
        this.f1467g = i3;
    }

    public int N() {
        y0();
        return this.f1465e;
    }

    public InputStream P() {
        X.n nVar = this.f1463c;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        p005b0.a aVarA = p005b0.a.A(this.f1462b);
        if (aVarA == null) {
            return null;
        }
        try {
            return new p001a0.j((p001a0.h) aVarA.P());
        } finally {
            p005b0.a.D(aVarA);
        }
    }

    public InputStream X() {
        return (InputStream) X.k.g(P());
    }

    public j a() {
        j jVar;
        X.n nVar = this.f1463c;
        if (nVar != null) {
            jVar = new j(nVar, this.f1470j);
        } else {
            p005b0.a aVarA = p005b0.a.A(this.f1462b);
            if (aVarA == null) {
                jVar = null;
            } else {
                try {
                    jVar = new j(aVarA);
                } catch (Throwable th) {
                    p005b0.a.D(aVarA);
                    throw th;
                }
            }
            p005b0.a.D(aVarA);
        }
        if (jVar != null) {
            jVar.q(this);
        }
        return jVar;
    }

    public int a0() {
        return this.f1469i;
    }

    public int c0() {
        p005b0.a aVar = this.f1462b;
        return (aVar == null || aVar.P() == null) ? this.f1470j : ((p001a0.h) this.f1462b.P()).size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p005b0.a.D(this.f1462b);
    }

    public int d() {
        y0();
        return this.f1468h;
    }

    public String d0() {
        return this.f1473m;
    }

    protected boolean e0() {
        return this.f1474n;
    }

    public int h() {
        y0();
        return this.f1467g;
    }

    public void q(j jVar) {
        this.f1464d = jVar.D();
        this.f1467g = jVar.h();
        this.f1468h = jVar.d();
        this.f1465e = jVar.N();
        this.f1466f = jVar.s0();
        this.f1469i = jVar.a0();
        this.f1470j = jVar.c0();
        this.f1471k = jVar.y();
        this.f1472l = jVar.z();
        this.f1474n = jVar.e0();
    }

    public int s0() {
        y0();
        return this.f1466f;
    }

    public boolean t0(int i3) {
        D0.c cVar = this.f1464d;
        if ((cVar != D0.b.f135b && cVar != D0.b.f146m) || this.f1463c != null) {
            return true;
        }
        X.k.g(this.f1462b);
        p001a0.h hVar = (p001a0.h) this.f1462b.P();
        if (i3 < 2) {
            return false;
        }
        return hVar.g(i3 + (-2)) == -1 && hVar.g(i3 - 1) == -39;
    }

    public p005b0.a v() {
        return p005b0.a.A(this.f1462b);
    }

    public synchronized boolean v0() {
        return p005b0.a.c0(this.f1462b) || this.f1463c != null;
    }

    public void x0() {
        if (!f1461o) {
            n0();
        } else {
            if (this.f1474n) {
                return;
            }
            n0();
            this.f1474n = true;
        }
    }

    public I0.b y() {
        return this.f1471k;
    }

    public ColorSpace z() {
        y0();
        return this.f1472l;
    }

    public j(X.n nVar) {
        this.f1464d = D0.c.f151d;
        this.f1465e = -1;
        this.f1466f = 0;
        this.f1467g = -1;
        this.f1468h = -1;
        this.f1469i = 1;
        this.f1470j = -1;
        X.k.g(nVar);
        this.f1462b = null;
        this.f1463c = nVar;
    }

    public j(X.n nVar, int i3) {
        this(nVar);
        this.f1470j = i3;
    }
}
