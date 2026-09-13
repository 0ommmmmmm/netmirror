package p101z0;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11082b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11081m = p091w2.a.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11071c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e[] f11072d = values();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11083a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INTERMEDIATE_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11083a = iArr;
        }
    }

    e(int i3) {
        this.f11082b = i3;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i3 = b.f11083a[ordinal()];
        if (i3 == 1) {
            return "requested";
        }
        if (i3 == 2) {
            return "success";
        }
        if (i3 == 3) {
            return "intermediate_available";
        }
        if (i3 != 4) {
            return i3 != 5 ? "unknown" : "released";
        }
        return "error";
    }
}
