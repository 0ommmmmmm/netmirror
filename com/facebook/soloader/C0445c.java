package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0445c extends G implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f8221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f8222g;

    /* JADX INFO: renamed from: com.facebook.soloader.c$a */
    protected class a extends G.e {
        protected a() {
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] i() {
            ArrayList arrayList = new ArrayList();
            Iterator it = C0445c.this.f8221f.iterator();
            while (it.hasNext()) {
                G.e eVarQ = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(eVarQ.i()));
                    eVarQ.close();
                } catch (Throwable th) {
                    if (eVarQ != null) {
                        try {
                            eVarQ.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public void o(File file) throws IOException {
            Iterator it = C0445c.this.f8221f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.o(file);
                    bVar.close();
                } catch (Throwable th) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public C0445c(Context context, String str, boolean z3) {
        super(context, str, z3);
        ArrayList arrayList = new ArrayList();
        this.f8221f = arrayList;
        this.f8222g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f8221f.add(mVar);
                }
            }
        } catch (IOException e4) {
            p.h("BackupSoSource", "failed to read split apks", e4);
        }
    }

    @Override // com.facebook.soloader.w
    public E a(Context context) {
        C0445c c0445c = new C0445c(context, this.f8230a.getName());
        try {
            c0445c.e(0);
            return c0445c;
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public int d(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f8222g) {
            return super.d(str, i3, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.G, com.facebook.soloader.E
    public void e(int i3) throws IOException {
        if ((i3 & 8) != 0) {
            return;
        }
        super.e(i3);
        this.f8222g = true;
    }

    @Override // com.facebook.soloader.G
    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.g(this.f8193d));
            parcelObtain.writeInt(this.f8221f.size());
            Iterator it = this.f8221f.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(((m) it.next()).n());
            }
            String str = this.f8193d.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.G
    public G.c[] o() {
        G.e eVarQ = ((m) this.f8221f.get(0)).q();
        try {
            G.c[] cVarArrI = eVarQ.i();
            eVarQ.close();
            return cVarArrI;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.C0448f, com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f8230a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f8230a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f8231b + " apks = " + this.f8221f.toString() + "]";
    }

    public boolean x(String str, int i3) throws IOException {
        boolean z3;
        G.e eVarQ = q();
        try {
            G.c[] cVarArrI = eVarQ.i();
            int length = cVarArrI.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z3 = false;
                    break;
                }
                if (cVarArrI[i4].f8200b.equals(str)) {
                    p.b("SoLoader", "Found " + str + " in " + c());
                    z3 = true;
                    break;
                }
                i4++;
            }
            eVarQ.close();
            if (!z3) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i3);
            return true;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C0445c(Context context, String str) {
        this(context, str, true);
    }
}
