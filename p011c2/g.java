package p011c2;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5699c;

    public g(Context context, a aVar) {
        this.f5697a = context;
        this.f5698b = aVar;
        this.f5699c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f5698b.a(strC);
    }

    private String c() {
        return this.f5697a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i3 = 0; i3 < eArr.length; i3++) {
            Object[] objArr = eArr[i3];
            if (objArr instanceof w) {
                eArr[i3] = ((w) objArr).a(this.f5697a);
            }
        }
    }

    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f5699c == this.f5698b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
