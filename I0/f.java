package I0;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    LOW,
    MEDIUM,
    HIGH;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f419g = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f414b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f fVar, f fVar2) {
            D2.h.f(fVar, "priority1");
            D2.h.f(fVar2, "priority2");
            return fVar.ordinal() > fVar2.ordinal() ? fVar : fVar2;
        }

        private a() {
        }
    }

    public static final f b(f fVar, f fVar2) {
        return f414b.a(fVar, fVar2);
    }
}
