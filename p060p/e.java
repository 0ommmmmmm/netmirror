package p060p;

import android.util.Base64;
import java.util.List;
import p064q.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f10249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10251f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f10246a = (String) g.g(str);
        this.f10247b = (String) g.g(str2);
        this.f10248c = (String) g.g(str3);
        this.f10249d = (List) g.g(list);
        this.f10250e = 0;
        this.f10251f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f10249d;
    }

    public int c() {
        return this.f10250e;
    }

    String d() {
        return this.f10251f;
    }

    public String e() {
        return this.f10246a;
    }

    public String f() {
        return this.f10247b;
    }

    public String g() {
        return this.f10248c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10246a + ", mProviderPackage: " + this.f10247b + ", mQuery: " + this.f10248c + ", mCertificates:");
        for (int i3 = 0; i3 < this.f10249d.size(); i3++) {
            sb.append(" [");
            List list = (List) this.f10249d.get(i3);
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f10250e);
        return sb.toString();
    }

    public e(String str, String str2, String str3, int i3) {
        this.f10246a = (String) g.g(str);
        this.f10247b = (String) g.g(str2);
        this.f10248c = (String) g.g(str3);
        this.f10249d = null;
        g.a(i3 != 0);
        this.f10250e = i3;
        this.f10251f = a(str, str2, str3);
    }
}
