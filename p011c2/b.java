package p011c2;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5690b;

    public b(Context context, a aVar) {
        this.f5689a = context;
        this.f5690b = aVar;
    }

    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f5689a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb = new StringBuilder("Base apk does not exist: ");
        sb.append(str);
        sb.append(". ");
        this.f5690b.b(sb);
        throw new v(sb.toString(), unsatisfiedLinkError);
    }
}
