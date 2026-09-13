package p083u2;

import D2.h;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10889a = new f();

    private f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        h.f(comparable, "a");
        h.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return e.f10888a;
    }
}
