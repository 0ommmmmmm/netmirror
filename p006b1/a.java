package p006b1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5588a = new a();

    private a() {
    }

    public static final int a(int i3, Object obj) {
        return (i3 * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
