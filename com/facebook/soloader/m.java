package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class m extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f8245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f8246g;

    protected static final class a extends G.c implements Comparable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ZipEntry f8247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f8248e;

        a(String str, ZipEntry zipEntry, int i3) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f8247d = zipEntry;
            this.f8248e = i3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f8200b.compareTo(aVar.f8200b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8247d.equals(aVar.f8247d) && this.f8248e == aVar.f8248e;
        }

        public int hashCode() {
            return (this.f8248e * 31) + this.f8247d.hashCode();
        }
    }

    protected class b extends G.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected a[] f8249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ZipFile f8250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final G f8251d;

        b(G g3) {
            this.f8250c = new ZipFile(m.this.f8245f);
            this.f8251d = g3;
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f8250c.close();
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] i() {
            return v();
        }

        @Override // com.facebook.soloader.G.e
        public void o(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : v()) {
                InputStream inputStream = this.f8250c.getInputStream(aVar.f8247d);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th) {
                        try {
                            dVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th3;
                }
            }
        }

        a[] q() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f8246g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f8250c.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f8248e) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f8251d.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] v() {
            a[] aVarArr = this.f8249b;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrQ = q();
            this.f8249b = aVarArrQ;
            return aVarArrQ;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f8245f = file;
        this.f8246g = str2;
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f8245f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f8245f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z3 = bVar.q().length != 0;
            bVar.close();
            return z3;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public m(Context context, File file, File file2, String str) {
        super(context, file);
        this.f8245f = file2;
        this.f8246g = str;
    }
}
