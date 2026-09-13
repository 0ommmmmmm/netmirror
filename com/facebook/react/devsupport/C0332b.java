package com.facebook.react.devsupport;

import M2.InterfaceC0194e;
import M2.InterfaceC0195f;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.react.devsupport.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0332b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M2.z f6674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0194e f6675b;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$a */
    class a implements InterfaceC0195f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p042k1.b f6676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f6677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f6678c;

        a(p042k1.b bVar, File file, c cVar) {
            this.f6676a = bVar;
            this.f6677b = file;
            this.f6678c = cVar;
        }

        @Override // M2.InterfaceC0195f
        public void a(InterfaceC0194e interfaceC0194e, IOException iOException) {
            if (C0332b.this.f6675b == null || C0332b.this.f6675b.q()) {
                C0332b.this.f6675b = null;
                return;
            }
            C0332b.this.f6675b = null;
            String string = interfaceC0194e.i().l().toString();
            this.f6676a.c(p018e1.c.b(string, "Could not connect to development server.", "URL: " + string, iOException));
        }

        @Override // M2.InterfaceC0195f
        public void b(InterfaceC0194e interfaceC0194e, M2.D d4) {
            try {
                if (C0332b.this.f6675b != null && !C0332b.this.f6675b.q()) {
                    C0332b.this.f6675b = null;
                    String string = d4.y0().l().toString();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(d4.X("content-type"));
                    if (matcher.find()) {
                        C0332b.this.i(string, d4, matcher.group(1), this.f6677b, this.f6678c, this.f6676a);
                    } else {
                        M2.E eQ = d4.q();
                        try {
                            C0332b.this.h(string, d4.A(), d4.d0(), d4.q().z(), this.f6677b, this.f6678c, this.f6676a);
                            if (eQ != null) {
                                eQ.close();
                            }
                        } catch (Throwable th) {
                            if (eQ != null) {
                                try {
                                    eQ.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    d4.close();
                    return;
                }
                C0332b.this.f6675b = null;
                if (d4 != null) {
                    d4.close();
                }
            } catch (Throwable th3) {
                if (d4 != null) {
                    try {
                        d4.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$b, reason: collision with other inner class name */
    class C0101b implements V.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ M2.D f6680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f6682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f6683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p042k1.b f6684e;

        C0101b(M2.D d4, String str, File file, c cVar, p042k1.b bVar) {
            this.f6680a = d4;
            this.f6681b = str;
            this.f6682c = file;
            this.f6683d = cVar;
            this.f6684e = bVar;
        }

        @Override // com.facebook.react.devsupport.V.a
        public void a(Map map, long j3, long j4) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f6684e.b("Downloading", Integer.valueOf((int) (j3 / 1024)), Integer.valueOf((int) (j4 / 1024)));
            }
        }

        @Override // com.facebook.react.devsupport.V.a
        public void b(Map map, b3.i iVar, boolean z3) throws IOException {
            if (z3) {
                int iA = this.f6680a.A();
                if (map.containsKey("X-Http-Status")) {
                    iA = Integer.parseInt((String) map.get("X-Http-Status"));
                }
                C0332b.this.h(this.f6681b, iA, M2.t.f(map), iVar, this.f6682c, this.f6683d, this.f6684e);
                return;
            }
            if (map.containsKey("Content-Type") && ((String) map.get("Content-Type")).equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(iVar.O());
                    this.f6684e.b(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e4) {
                    Y.a.m("ReactNative", "Error parsing progress JSON. " + e4.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6687b;

        public String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f6686a);
                jSONObject.put("filesChangedCount", this.f6687b);
                return jSONObject.toString();
            } catch (JSONException e4) {
                Y.a.n("BundleDownloader", "Can't serialize bundle info: ", e4);
                return null;
            }
        }
    }

    public C0332b(M2.z zVar) {
        this.f6674a = zVar;
    }

    private static void g(String str, M2.t tVar, c cVar) {
        cVar.f6686a = str;
        String strA = tVar.a("X-Metro-Files-Changed-Count");
        if (strA != null) {
            try {
                cVar.f6687b = Integer.parseInt(strA);
            } catch (NumberFormatException unused) {
                cVar.f6687b = -2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, int i3, M2.t tVar, b3.k kVar, File file, c cVar, p042k1.b bVar) throws IOException {
        if (i3 != 200) {
            String strO = kVar.O();
            p018e1.c cVarD = p018e1.c.d(str, strO);
            if (cVarD != null) {
                bVar.c(cVarD);
                return;
            }
            bVar.c(new p018e1.c("The development server returned response error code: " + i3 + "\n\nURL: " + str + "\n\nBody:\n" + strO));
            return;
        }
        if (cVar != null) {
            g(str, tVar, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!j(kVar, file2) || file2.renameTo(file)) {
            bVar.a();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, M2.D d4, String str2, File file, c cVar, p042k1.b bVar) {
        if (new V(d4.q().z(), str2).d(new C0101b(d4, str, file, cVar, bVar))) {
            return;
        }
        bVar.c(new p018e1.c("Error while reading multipart response.\n\nResponse code: " + d4.A() + "\n\nURL: " + str.toString() + "\n\n"));
    }

    private static boolean j(b3.k kVar, File file) throws Throwable {
        b3.D dF;
        try {
            dF = b3.t.f(file);
            try {
                kVar.S(dF);
                if (dF == null) {
                    return true;
                }
                dF.close();
                return true;
            } catch (Throwable th) {
                th = th;
                if (dF != null) {
                    dF.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dF = null;
        }
    }

    public void e(p042k1.b bVar, File file, String str, c cVar) {
        f(bVar, file, str, cVar, new M2.B.a());
    }

    public void f(p042k1.b bVar, File file, String str, c cVar, M2.B.a aVar) {
        InterfaceC0194e interfaceC0194e = (InterfaceC0194e) p002a1.a.c(this.f6674a.b(aVar.m(str).a("Accept", "multipart/mixed").b()));
        this.f6675b = interfaceC0194e;
        interfaceC0194e.o(new a(bVar, file, cVar));
    }
}
