package p011c2;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C0445c;
import com.facebook.soloader.C0448f;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5700a;

    public j() {
        this(0);
    }

    private boolean b(E[] eArr, String str) {
        for (E e4 : eArr) {
            if (e4 instanceof C0445c) {
                C0445c c0445c = (C0445c) e4;
                try {
                    p.b("SoLoader", "Preparing BackupSoSource for the first time " + c0445c.c());
                    c0445c.e(0);
                    for (E e5 : eArr) {
                        if ((e5 instanceof C0448f) && !(e5 instanceof C0445c)) {
                            ((C0448f) e5).h();
                        }
                    }
                    return true;
                } catch (Exception e6) {
                    p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + c0445c.c() + " for library " + str + ": ", e6);
                    break;
                }
            }
        }
        return false;
    }

    private void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean d(E[] eArr, String str, int i3) {
        try {
            for (E e4 : eArr) {
                if ((e4 instanceof C0445c) && ((C0445c) e4).x(str, i3)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e5) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e5);
            return false;
        }
    }

    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        C c4 = (C) unsatisfiedLinkError;
        String strA = c4.a();
        String message = c4.getMessage();
        if (strA == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        }
        if (c4 instanceof B) {
            if ((this.f5700a & 1) == 0) {
                return false;
            }
            c(c4, strA);
            return d(eArr, strA, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        c(c4, strA);
        return b(eArr, strA);
    }

    public j(int i3) {
        this.f5700a = i3;
    }
}
