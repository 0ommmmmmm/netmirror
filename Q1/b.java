package Q1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1810h = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1804b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final b a(String str) {
            D2.h.f(str, "name");
            switch (str.hashCode()) {
                case -1267206133:
                    if (str.equals("opacity")) {
                        return b.OPACITY;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        return b.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        return b.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (str.equals("scaleXY")) {
                        return b.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + str);
        }

        private a() {
        }
    }

    public static final b b(String str) {
        return f1804b.a(str);
    }
}
