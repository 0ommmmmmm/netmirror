package p061p0;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10321c;

    public d() {
        a();
    }

    public void a() {
        this.f10319a = false;
        this.f10320b = 4;
        c();
    }

    public void b() {
        this.f10321c++;
    }

    public void c() {
        this.f10321c = 0;
    }

    public void d(boolean z3) {
        this.f10319a = z3;
    }

    public boolean e() {
        return this.f10319a && this.f10321c < this.f10320b;
    }
}
