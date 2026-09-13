package p064q;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10351b;

    public d(Object obj, Object obj2) {
        this.f10350a = obj;
        this.f10351b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f10350a, this.f10350a) && c.a(dVar.f10351b, this.f10351b);
    }

    public int hashCode() {
        Object obj = this.f10350a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10351b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f10350a + " " + this.f10351b + "}";
    }
}
