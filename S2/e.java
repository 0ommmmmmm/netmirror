package S2;

import K2.o;
import M2.C0197h;
import M2.D;
import M2.m;
import M2.n;
import M2.t;
import M2.u;
import b3.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l f2321b;

    static {
        l.a aVar = l.f5640f;
        f2320a = aVar.e("\"\\");
        f2321b = aVar.e("\t ,=");
    }

    public static final List a(t tVar, String str) {
        D2.h.f(tVar, "$this$parseChallenges");
        D2.h.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (o.n(str, tVar.b(i3), true)) {
                try {
                    c(new b3.i().h0(tVar.h(i3)), arrayList);
                } catch (EOFException e4) {
                    W2.j.f2732c.g().k("Unable to parse challenge", 5, e4);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(D d4) {
        D2.h.f(d4, "$this$promisesBody");
        if (D2.h.b(d4.y0().h(), "HEAD")) {
            return false;
        }
        int iA = d4.A();
        return (((iA >= 100 && iA < 200) || iA == 204 || iA == 304) && N2.c.s(d4) == -1 && !o.n("chunked", D.c0(d4, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0085 A[EDGE_INSN: B:59:0x0085->B:28:0x0085 BREAK  A[LOOP:2: B:22:0x0072->B:48:0x00c5], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, void] */
    private static final void c(b3.i iVar, List list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(iVar);
                    strE2 = e(iVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(iVar);
                String strE3 = e(iVar);
                if (strE3 == null) {
                    if (iVar.J()) {
                        list.add(new C0197h(strE2, (Map<String, String>) DebugProbesKt.probeCoroutineSuspended(null)));
                        return;
                    }
                    return;
                }
                byte b4 = (byte) 61;
                int I3 = N2.c.I(iVar, b4);
                boolean zG2 = g(iVar);
                if (zG || !(zG2 || iVar.J())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int I4 = I3 + N2.c.I(iVar, b4);
                    while (true) {
                        if (strE3 != null) {
                            if (I4 == 0) {
                                break;
                                break;
                            }
                            if (I4 <= 1) {
                                return;
                            }
                            if (h(iVar, (byte) 34)) {
                                strE = d(iVar);
                            } else {
                                strE = e(iVar);
                            }
                            if (strE != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        strE3 = e(iVar);
                        if (g(iVar)) {
                            break;
                        }
                        I4 = N2.c.I(iVar, b4);
                        if (I4 == 0) {
                            break;
                        }
                        if (I4 <= 1 || g(iVar)) {
                            return;
                        }
                        if (h(iVar, (byte) 34)) {
                            strE = d(iVar);
                        } else {
                            strE = e(iVar);
                        }
                        if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                            return;
                        }
                        if (!g(iVar) && !iVar.J()) {
                            return;
                        } else {
                            strE3 = null;
                        }
                    }
                    list.add(new C0197h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strE3 + o.r("=", I3));
                    D2.h.e(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
                    list.add(new C0197h(strE2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String d(b3.i iVar) throws EOFException {
        byte b4 = (byte) 34;
        if (!(iVar.r0() == b4)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        b3.i iVar2 = new b3.i();
        while (true) {
            long jN0 = iVar.n0(f2320a);
            if (jN0 == -1) {
                return null;
            }
            if (iVar.a0(jN0) == b4) {
                iVar2.Q(iVar, jN0);
                iVar.r0();
                return iVar2.O();
            }
            if (iVar.F0() == jN0 + 1) {
                return null;
            }
            iVar2.Q(iVar, jN0);
            iVar.r0();
            iVar2.Q(iVar, 1L);
        }
    }

    private static final String e(b3.i iVar) {
        long jN0 = iVar.n0(f2321b);
        if (jN0 == -1) {
            jN0 = iVar.F0();
        }
        if (jN0 != 0) {
            return iVar.D0(jN0);
        }
        return null;
    }

    public static final void f(n nVar, u uVar, t tVar) {
        D2.h.f(nVar, "$this$receiveHeaders");
        D2.h.f(uVar, "url");
        D2.h.f(tVar, "headers");
        if (nVar == n.f1202a) {
            return;
        }
        List listE = m.f1183n.e(uVar, tVar);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(uVar, listE);
    }

    private static final boolean g(b3.i iVar) throws EOFException {
        boolean z3 = false;
        while (!iVar.J()) {
            byte bA0 = iVar.a0(0L);
            if (bA0 == 9 || bA0 == 32) {
                iVar.r0();
            } else {
                if (bA0 != 44) {
                    break;
                }
                iVar.r0();
                z3 = true;
            }
        }
        return z3;
    }

    private static final boolean h(b3.i iVar, byte b4) {
        return !iVar.J() && iVar.a0(0L) == b4;
    }
}
