package p083u2;

import D2.h;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10888a = new e();

    private e() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        h.f(comparable, "a");
        h.f(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return f.f10889a;
    }
}
