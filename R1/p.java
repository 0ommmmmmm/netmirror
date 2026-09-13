package R1;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum p {
    VISIBLE,
    HIDDEN,
    SCROLL;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f2100g = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2095b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(String str) {
            D2.h.f(str, "overflow");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            D2.h.e(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1217487446) {
                if (iHashCode != -907680051) {
                    if (iHashCode == 466743410 && lowerCase.equals("visible")) {
                        return p.VISIBLE;
                    }
                } else if (lowerCase.equals("scroll")) {
                    return p.SCROLL;
                }
            } else if (lowerCase.equals("hidden")) {
                return p.HIDDEN;
            }
            return null;
        }

        private a() {
        }
    }

    public static final p b(String str) {
        return f2095b.a(str);
    }
}
