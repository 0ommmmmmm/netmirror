package Q1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum g {
    CREATE,
    UPDATE,
    DELETE;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1838g = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1833b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: Q1.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0027a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1839a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1839a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(g gVar) {
            D2.h.f(gVar, "type");
            int i3 = C0027a.f1839a[gVar.ordinal()];
            if (i3 == 1) {
                return "create";
            }
            if (i3 == 2) {
                return "update";
            }
            if (i3 == 3) {
                return "delete";
            }
            throw new p071r2.h();
        }

        private a() {
        }
    }

    public static final String b(g gVar) {
        return f1833b.a(gVar);
    }
}
