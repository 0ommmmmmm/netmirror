package com.facebook.react.devsupport;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b3.k f6661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6663c;

    public interface a {
        void a(Map map, long j3, long j4);

        void b(Map map, b3.i iVar, boolean z3);
    }

    public V(b3.k kVar, String str) {
        this.f6661a = kVar;
        this.f6662b = str;
    }

    private void a(b3.i iVar, boolean z3, a aVar) throws EOFException {
        b3.l lVarE = b3.l.e("\r\n\r\n");
        long jD0 = iVar.d0(lVarE);
        if (jD0 == -1) {
            aVar.b(null, iVar, z3);
            return;
        }
        b3.i iVar2 = new b3.i();
        b3.i iVar3 = new b3.i();
        iVar.x(iVar2, jD0);
        iVar.s(lVarE.v());
        iVar.S(iVar3);
        aVar.b(c(iVar2), iVar3, z3);
    }

    private void b(Map map, long j3, boolean z3, a aVar) {
        if (map == null || aVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f6663c > 16 || z3) {
            this.f6663c = jCurrentTimeMillis;
            aVar.a(map, j3, map.get("Content-Length") != null ? Long.parseLong((String) map.get("Content-Length")) : 0L);
        }
    }

    private Map c(b3.i iVar) {
        HashMap map = new HashMap();
        for (String str : iVar.O().split("\r\n")) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean d(a aVar) throws EOFException {
        boolean z3;
        b3.l lVarE = b3.l.e("\r\n--" + this.f6662b + "\r\n");
        b3.l lVarE2 = b3.l.e("\r\n--" + this.f6662b + "--\r\n");
        b3.l lVarE3 = b3.l.e("\r\n\r\n");
        b3.i iVar = new b3.i();
        long j3 = 0L;
        long jV = 0L;
        long jF0 = 0L;
        Map mapC = null;
        while (true) {
            long jMax = Math.max(j3 - ((long) lVarE2.v()), jV);
            long jE0 = iVar.e0(lVarE, jMax);
            if (jE0 == -1) {
                jE0 = iVar.e0(lVarE2, jMax);
                z3 = true;
            } else {
                z3 = false;
            }
            if (jE0 == -1) {
                long jF1 = iVar.F0();
                if (mapC == null) {
                    long jE1 = iVar.e0(lVarE3, jMax);
                    if (jE1 >= 0) {
                        this.f6661a.x(iVar, jE1);
                        b3.i iVar2 = new b3.i();
                        iVar.D(iVar2, jMax, jE1 - jMax);
                        jF0 = iVar2.F0() + ((long) lVarE3.v());
                        mapC = c(iVar2);
                    }
                } else {
                    b(mapC, iVar.F0() - jF0, false, aVar);
                }
                if (this.f6661a.x(iVar, 4096) <= 0) {
                    return false;
                }
                j3 = jF1;
                jV = jV;
            } else {
                long j4 = jV;
                long j5 = jE0 - j4;
                if (j4 > 0) {
                    b3.i iVar3 = new b3.i();
                    iVar.s(j4);
                    iVar.x(iVar3, j5);
                    b(mapC, iVar3.F0() - jF0, true, aVar);
                    a(iVar3, z3, aVar);
                    jF0 = 0;
                    mapC = null;
                } else {
                    iVar.s(jE0);
                }
                if (z3) {
                    return true;
                }
                jV = lVarE.v();
                j3 = jV;
            }
        }
    }
}
