package p011c2;

import com.facebook.soloader.E;
import com.facebook.soloader.F;
import com.facebook.soloader.InterfaceC0444b;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (F f3 : eArr) {
            if (f3 instanceof InterfaceC0444b) {
                p.b("SoLoader", "Waiting on SoSource " + f3.c());
                ((InterfaceC0444b) f3).b();
            }
        }
        return true;
    }
}
