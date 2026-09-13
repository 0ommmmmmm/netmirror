package p011c2;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C0445c;
import com.facebook.soloader.C0448f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5691a;

    public c(Context context) {
        this.f5691a = context;
    }

    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f5691a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (E e4 : eArr) {
            if (e4 instanceof C0445c) {
                C0445c c0445c = (C0445c) e4;
                try {
                    for (G.c cVar : c0445c.o()) {
                        if (!new File(file, cVar.f8200b).exists()) {
                            arrayList.add(cVar.f8200b);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                        c0445c.e(0);
                        break;
                    }
                    p.b("SoLoader", "No libraries missing from " + file);
                    return false;
                } catch (Exception e5) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e5);
                    return false;
                }
            }
        }
        for (E e6 : eArr) {
            if ((e6 instanceof C0448f) && !(e6 instanceof C0445c)) {
                ((C0448f) e6).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
