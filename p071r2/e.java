package p071r2;

import D2.h;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10583a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10583a = iArr;
        }
    }

    public static Lazy a(C2.a aVar) {
        h.f(aVar, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new m(aVar, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static Lazy b(g gVar, C2.a aVar) {
        h.f(gVar, "mode");
        h.f(aVar, "initializer");
        int i3 = a.f10583a[gVar.ordinal()];
        int i4 = 2;
        if (i3 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new m(aVar, defaultConstructorMarker, i4, defaultConstructorMarker);
        }
        if (i3 == 2) {
            return new l(aVar);
        }
        if (i3 == 3) {
            return new s(aVar);
        }
        throw new h();
    }
}
