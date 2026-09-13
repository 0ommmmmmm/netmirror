package p101z0;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum n {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11177b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11176i = p091w2.a.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11170c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n[] f11171d = values();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    n(int i3) {
        this.f11177b = i3;
    }
}
