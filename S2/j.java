package S2;

import M2.B;
import M2.C;
import M2.D;
import M2.E;
import M2.F;
import M2.u;
import M2.v;
import M2.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2336b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f2337a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(z zVar) {
        D2.h.f(zVar, "client");
        this.f2337a = zVar;
    }

    private final B b(D d4, String str) {
        String strC0;
        u uVarO;
        if (!this.f2337a.v() || (strC0 = D.c0(d4, "Location", null, 2, null)) == null || (uVarO = d4.y0().l().o(strC0)) == null) {
            return null;
        }
        if (!D2.h.b(uVarO.p(), d4.y0().l().p()) && !this.f2337a.w()) {
            return null;
        }
        B.a aVarI = d4.y0().i();
        if (f.b(str)) {
            int iA = d4.A();
            f fVar = f.f2322a;
            boolean z3 = fVar.d(str) || iA == 308 || iA == 307;
            if (!fVar.c(str) || iA == 308 || iA == 307) {
                aVarI.g(str, z3 ? d4.y0().a() : null);
            } else {
                aVarI.g("GET", null);
            }
            if (!z3) {
                aVarI.i("Transfer-Encoding");
                aVarI.i("Content-Length");
                aVarI.i("Content-Type");
            }
        }
        if (!N2.c.g(d4.y0().l(), uVarO)) {
            aVarI.i("Authorization");
        }
        return aVarI.l(uVarO).b();
    }

    private final B c(D d4, R2.c cVar) throws ProtocolException {
        R2.f fVarH;
        F fA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iA = d4.A();
        String strH = d4.y0().h();
        if (iA != 307 && iA != 308) {
            if (iA == 401) {
                return this.f2337a.g().a(fA, d4);
            }
            if (iA == 421) {
                C cA = d4.y0().a();
                if ((cA != null && cA.g()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().y();
                return d4.y0();
            }
            if (iA == 503) {
                D dV0 = d4.v0();
                if ((dV0 == null || dV0.A() != 503) && g(d4, Integer.MAX_VALUE) == 0) {
                    return d4.y0();
                }
                return null;
            }
            if (iA == 407) {
                D2.h.c(fA);
                if (fA.b().type() == Proxy.Type.HTTP) {
                    return this.f2337a.H().a(fA, d4);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iA == 408) {
                if (!this.f2337a.K()) {
                    return null;
                }
                C cA2 = d4.y0().a();
                if (cA2 != null && cA2.g()) {
                    return null;
                }
                D dV1 = d4.v0();
                if ((dV1 == null || dV1.A() != 408) && g(d4, 0) <= 0) {
                    return d4.y0();
                }
                return null;
            }
            switch (iA) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(d4, strH);
    }

    private final boolean d(IOException iOException, boolean z3) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z3;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, R2.e eVar, B b4, boolean z3) {
        if (this.f2337a.K()) {
            return !(z3 && f(iOException, b4)) && d(iOException, z3) && eVar.z();
        }
        return false;
    }

    private final boolean f(IOException iOException, B b4) {
        C cA = b4.a();
        return (cA != null && cA.g()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(D d4, int i3) {
        String strC0 = D.c0(d4, "Retry-After", null, 2, null);
        if (strC0 == null) {
            return i3;
        }
        if (!new K2.k("\\d+").b(strC0)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strC0);
        D2.h.e(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // M2.v
    public D a(v.a aVar) {
        D dA;
        D2.h.f(aVar, "chain");
        g gVar = (g) aVar;
        B bH = gVar.h();
        R2.e eVarD = gVar.d();
        List listG = AbstractC0492n.g();
        int i3 = 0;
        D d4 = null;
        while (true) {
            boolean z3 = true;
            while (true) {
                eVarD.j(bH, z3);
                try {
                    if (eVarD.q()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        dA = gVar.a(bH);
                    } catch (R2.j e4) {
                        if (!e(e4.c(), eVarD, bH, false)) {
                            throw N2.c.X(e4.b(), listG);
                        }
                        listG = AbstractC0492n.X(listG, e4.b());
                        eVarD.k(true);
                        z3 = false;
                    } catch (IOException e5) {
                        if (!e(e5, eVarD, bH, !(e5 instanceof U2.a))) {
                            throw N2.c.X(e5, listG);
                        }
                        listG = AbstractC0492n.X(listG, e5);
                        eVarD.k(true);
                        z3 = false;
                    }
                    eVarD.k(true);
                    z3 = false;
                } catch (Throwable th) {
                    eVarD.k(true);
                    throw th;
                }
            }
            if (d4 != null) {
                dA = dA.u0().o(d4.u0().b(null).c()).c();
            }
            d4 = dA;
            R2.c cVarR = eVarD.r();
            B bC = c(d4, cVarR);
            if (bC == null) {
                if (cVarR != null && cVarR.l()) {
                    eVarD.B();
                }
                eVarD.k(false);
                return d4;
            }
            C cA = bC.a();
            if (cA != null && cA.g()) {
                eVarD.k(false);
                return d4;
            }
            E eQ = d4.q();
            if (eQ != null) {
                N2.c.j(eQ);
            }
            i3++;
            if (i3 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i3);
            }
            eVarD.k(true);
            bH = bC;
        }
    }
}
