package R1;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum o {
    SOLID,
    DASHED,
    DOTTED;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f2094g = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2089b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(String str) {
            D2.h.f(str, "outlineStyle");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            D2.h.e(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1338941519) {
                if (iHashCode != -1325970902) {
                    if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                        return o.SOLID;
                    }
                } else if (lowerCase.equals("dotted")) {
                    return o.DOTTED;
                }
            } else if (lowerCase.equals("dashed")) {
                return o.DASHED;
            }
            return null;
        }

        private a() {
        }
    }

    public static final o b(String str) {
        return f2089b.a(str);
    }
}
