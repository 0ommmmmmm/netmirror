package p011c2;

import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5688b;

    public a(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f5687a = new String[i3];
        this.f5688b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f5687a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        b(sb);
        p.g("SoLoader", sb.toString());
        String[] strArr = this.f5687a;
        int i3 = this.f5688b;
        strArr[i3 % strArr.length] = str;
        this.f5688b = i3 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f5688b);
            sb.append(" base apk paths.");
            if (this.f5688b > 0) {
                sb.append(" Most recent ones:");
            }
            int i3 = 0;
            while (true) {
                String[] strArr = this.f5687a;
                if (i3 < strArr.length) {
                    int i4 = (this.f5688b - i3) - 1;
                    if (i4 >= 0) {
                        String str = strArr[i4 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i3++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f5688b;
    }
}
