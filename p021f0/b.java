package p021f0;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static int a(int i3, int i4) {
        return ((i3 + 31) * 31) + i4;
    }

    public static int b(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
