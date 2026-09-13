package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class E extends AbstractC0307d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f5983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f5984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p017e0.b f5985e;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f5986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y.a f5987c;

        a(c cVar, Y.a aVar) {
            this.f5986b = cVar;
            this.f5987c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            E.this.j(this.f5986b, this.f5987c);
        }
    }

    class b extends C0309f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f5989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y.a f5990b;

        b(Future future, Y.a aVar) {
            this.f5989a = future;
            this.f5990b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.C0309f, com.facebook.imagepipeline.producers.g0
        public void a() {
            if (this.f5989a.cancel(false)) {
                this.f5990b.b();
            }
        }
    }

    public static class c extends D {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5994h;

        public c(InterfaceC0317n interfaceC0317n, f0 f0Var) {
            super(interfaceC0317n, f0Var);
        }
    }

    public E() {
        this((String) null, (Map) null, RealtimeSinceBootClock.get());
    }

    private HttpURLConnection g(Uri uri, int i3) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        String str = this.f5982b;
        if (str != null) {
            httpURLConnectionO.setRequestProperty("User-Agent", str);
        }
        Map map = this.f5983c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionO.setConnectTimeout(this.f5981a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i3 <= 0 || uri2 == null || X.i.a(uri2.getScheme(), scheme)) {
            throw new IOException(i3 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(uri2, i3 - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i3) {
        if (i3 == 307 || i3 == 308) {
            return true;
        }
        switch (i3) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i3) {
        return i3 >= 200 && i3 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) p021f0.f.q(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.Y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c c(InterfaceC0317n interfaceC0317n, f0 f0Var) {
        return new c(interfaceC0317n, f0Var);
    }

    @Override // com.facebook.imagepipeline.producers.Y
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(c cVar, Y.a aVar) {
        cVar.f5992f = this.f5985e.now();
        cVar.b().a0(new b(this.f5984d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    void j(c cVar, Y.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionG;
        InputStream inputStream = null;
        try {
            httpURLConnectionG = g(cVar.g(), 5);
            try {
                try {
                    cVar.f5993g = this.f5985e.now();
                    if (httpURLConnectionG != null) {
                        inputStream = httpURLConnectionG.getInputStream();
                        aVar.c(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionG != null) {
                        throw th;
                    }
                    httpURLConnectionG.disconnect();
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                aVar.a(e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionG == null) {
                    return;
                }
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnectionG = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionG = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionG != null) {
                throw th;
            }
            httpURLConnectionG.disconnect();
            throw th;
        }
        httpURLConnectionG.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0307d, com.facebook.imagepipeline.producers.Y
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map e(c cVar, int i3) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f5993g - cVar.f5992f));
        map.put("fetch_time", Long.toString(cVar.f5994h - cVar.f5993g));
        map.put("total_time", Long.toString(cVar.f5994h - cVar.f5992f));
        map.put("image_size", Integer.toString(i3));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0307d, com.facebook.imagepipeline.producers.Y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, int i3) {
        cVar.f5994h = this.f5985e.now();
    }

    public E(int i3) {
        this((String) null, (Map) null, RealtimeSinceBootClock.get());
        this.f5981a = i3;
    }

    public E(String str, int i3) {
        this(str, (Map) null, RealtimeSinceBootClock.get());
        this.f5981a = i3;
    }

    public E(String str, Map<String, String> map, int i3) {
        this(str, map, RealtimeSinceBootClock.get());
        this.f5981a = i3;
    }

    E(String str, Map map, p017e0.b bVar) {
        this.f5984d = Executors.newFixedThreadPool(3);
        this.f5985e = bVar;
        this.f5983c = map;
        this.f5982b = str;
    }
}
