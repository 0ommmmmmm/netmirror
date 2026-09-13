package p011c2;

import com.facebook.soloader.C;
import com.facebook.soloader.C0445c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {
    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/data missing libraries.");
        boolean z3 = false;
        for (E e4 : eArr) {
            if ((e4 instanceof G) && !(e4 instanceof C0445c)) {
                G g3 = (G) e4;
                try {
                    for (G.c cVar : g3.o()) {
                        if (g3.f(cVar.f8200b) == null) {
                            p.b("SoLoader", "Missing " + cVar.f8200b + " from " + g3.c() + ", will force prepare.");
                            g3.e(2);
                            z3 = true;
                            break;
                        }
                    }
                } catch (Exception e5) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/data failure ", e5);
                    return false;
                }
            }
        }
        if (z3) {
            p.b("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        p.b("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
