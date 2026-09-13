package P1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum s {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1708b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1707i = p091w2.a.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1701c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(s sVar) {
            D2.h.f(sVar, "type");
            return sVar.c();
        }

        private a() {
        }
    }

    s(String str) {
        this.f1708b = str;
    }

    public static final String b(s sVar) {
        return f1701c.a(sVar);
    }

    public final String c() {
        return this.f1708b;
    }
}
