package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends C0448f implements InterfaceC0444b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f8193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f8194e;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f8197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f8198d;

        b(boolean z3, File file, n nVar) {
            this.f8196b = z3;
            this.f8197c = file;
            this.f8198d = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f8196b) {
                        SysUtil.f(G.this.f8230a);
                    }
                    G.u(this.f8197c, (byte) 1, this.f8196b);
                } finally {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f8230a + " (from syncer thread)");
                    this.f8198d.close();
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8201c;

        public c(String str, String str2) {
            this.f8200b = str;
            this.f8201c = str2;
        }
    }

    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f8202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream f8203c;

        public d(c cVar, InputStream inputStream) {
            this.f8202b = cVar;
            this.f8203c = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f8203c.close();
        }

        public int i() {
            return this.f8203c.available();
        }

        public c o() {
            return this.f8202b;
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void a(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.o().f8200b);
            File file2 = new File(file, dVar.o().f8200b);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int i3 = dVar.i();
                        if (i3 > 1) {
                            SysUtil.d(randomAccessFile.getFD(), i3);
                        }
                        SysUtil.a(randomAccessFile, dVar.f8203c, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e4) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e4);
                    SysUtil.c(file2);
                    throw e4;
                }
            } catch (Throwable th3) {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th3;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract c[] i();

        public abstract void o(File file);
    }

    protected G(Context context, String str, boolean z3) {
        super(p(context, str), z3 ? 1 : 0);
        this.f8193d = context;
    }

    private void j() throws IOException {
        File[] fileArrListFiles = this.f8230a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f8230a);
        }
        for (File file : fileArrListFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i3) {
        return (i3 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    private boolean r(n nVar, int i3) throws IOException {
        byte b4;
        File file = new File(this.f8230a, "dso_state");
        byte[] bArrN = n();
        if (m(i3) || k(bArrN)) {
            b4 = 0;
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b4 = randomAccessFile.readByte();
                        if (b4 == 1) {
                            p.f("fb-UnpackingSoSource", "dso store " + this.f8230a + " regeneration not needed: state file clean");
                        } else {
                            b4 = 0;
                        }
                    } catch (IOException e4) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f8230a + " regeneration interrupted: " + e4.getMessage());
                    }
                } else {
                    b4 = 0;
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (b4 == 1) {
            return false;
        }
        boolean z3 = (i3 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z3);
        j();
        e eVarQ = q();
        try {
            eVarQ.o(this.f8230a);
            eVarQ.close();
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(this.f8230a, "dso_deps"), "rw");
            try {
                randomAccessFile2.write(bArrN);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                randomAccessFile2.close();
                b bVar = new b(z3, file, nVar);
                if (s(i3)) {
                    new Thread(bVar, "SoSync:" + this.f8230a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } catch (Throwable th3) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    private static boolean s(int i3) {
        return (i3 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b4, boolean z3) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b4);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z3) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SyncFailedException e4) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e4);
        }
    }

    @Override // com.facebook.soloader.InterfaceC0444b
    public void b() throws Throwable {
        try {
            n nVarI = SysUtil.i(this.f8230a, new File(this.f8230a, "dso_lock"));
            if (nVarI != null) {
                nVarI.close();
            }
        } catch (Exception e4) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f8230a + "): ", e4);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i3) throws IOException {
        SysUtil.m(this.f8230a);
        if (!this.f8230a.canWrite() && !this.f8230a.setWritable(true)) {
            throw new IOException("error adding " + this.f8230a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n nVarI = SysUtil.i(this.f8230a, new File(this.f8230a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f8230a);
                    if (!this.f8230a.canWrite() && !this.f8230a.setWritable(true)) {
                        throw new IOException("error adding " + this.f8230a.getCanonicalPath() + " write permission");
                    }
                    if (!r(nVarI, i3)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f8230a);
                        nVar = nVarI;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f8230a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f8230a + " (syncer thread started)");
                    }
                    if (!this.f8230a.canWrite() || this.f8230a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f8230a.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    nVar = nVarI;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f8230a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f8230a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!this.f8230a.canWrite() || this.f8230a.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + this.f8230a.getCanonicalPath() + " write permission");
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f8230a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() == 0) {
                    randomAccessFile.close();
                    return true;
                }
                int length = (int) randomAccessFile.length();
                byte[] bArr2 = new byte[length];
                if (randomAccessFile.read(bArr2) != length) {
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                    randomAccessFile.close();
                    return true;
                }
                boolean zL = l(bArr2, bArr);
                randomAccessFile.close();
                return zL;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e4) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e4);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarQ = q();
        try {
            c[] cVarArrI = eVarQ.i();
            parcelObtain.writeInt(cVarArrI.length);
            for (c cVar : cVarArrI) {
                parcelObtain.writeString(cVar.f8200b);
                parcelObtain.writeString(cVar.f8201c);
            }
            eVarQ.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
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

    public c[] o() {
        e eVarQ = q();
        try {
            c[] cVarArrI = eVarQ.i();
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

    protected abstract e q();

    public void t(String[] strArr) {
        this.f8194e = strArr;
    }

    protected G(Context context, String str) {
        this(context, str, true);
    }

    protected G(Context context, File file, boolean z3) {
        super(file, z3 ? 1 : 0);
        this.f8193d = context;
    }

    protected G(Context context, File file) {
        this(context, file, true);
    }
}
