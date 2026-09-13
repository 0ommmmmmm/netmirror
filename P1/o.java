package P1;

import android.view.View;
import kotlin.enums.EnumEntries;
import p014d1.AbstractC0462m;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1669a = new o();

    public enum a {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE;


        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1689u = p091w2.a.a(a());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1690a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f1690a = iArr;
        }
    }

    private o() {
    }

    public static final int a(String str, int i3, int i4) {
        D2.h.f(str, "pointerType");
        if (D2.h.b("touch", str)) {
            return 0;
        }
        int i5 = i4 ^ i3;
        if (i5 == 0) {
            return -1;
        }
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 2;
        }
        if (i5 == 4) {
            return 1;
        }
        if (i5 != 8) {
            return i5 != 16 ? -1 : 4;
        }
        return 3;
    }

    public static final int b(String str, String str2, int i3) {
        D2.h.f(str2, "pointerType");
        if (f1669a.g(str)) {
            return 0;
        }
        if (D2.h.b("touch", str2)) {
            return 1;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[ORIG_RETURN, RETURN] */
    public static final int c(String str) {
        if (str == null) {
            return 2;
        }
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
                return 4;
            case "topPointerDown":
                return 3;
            case "topPointerMove":
            case "topPointerOver":
                return 4;
            case "topPointerUp":
            case "topPointerCancel":
                return 3;
            case "topPointerOut":
                return 4;
            default:
                return 2;
        }
    }

    public static final double d(int i3, String str) {
        return (f1669a.g(str) || i3 == 0) ? 0.0d : 0.5d;
    }

    public static final String e(int i3) {
        if (i3 == 1) {
            return "touch";
        }
        if (i3 != 2) {
            return i3 != 3 ? "" : "mouse";
        }
        return "pen";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0040 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean f(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1304584214:
                    if (str.equals("topPointerDown")) {
                        return true;
                    }
                    break;
                case -1304316135:
                    if (str.equals("topPointerMove")) {
                        return true;
                    }
                    break;
                case -1304250340:
                    if (str.equals("topPointerOver")) {
                        return true;
                    }
                    break;
                case -1065042973:
                    if (str.equals("topPointerUp")) {
                        return true;
                    }
                    break;
                case 383186882:
                    if (str.equals("topPointerCancel")) {
                        return true;
                    }
                    break;
                case 1343400710:
                    if (str.equals("topPointerOut")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static final boolean h(View view, a aVar) {
        D2.h.f(aVar, "event");
        if (view == null) {
            return true;
        }
        switch (b.f1690a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Object tag = view.getTag(AbstractC0462m.f9247s);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                return (num == null || (num.intValue() & (1 << aVar.ordinal())) == 0) ? false : true;
        }
    }

    public final boolean g(String str) {
        int iHashCode;
        return str != null && ((iHashCode = str.hashCode()) == -1780335505 ? str.equals("topPointerLeave") : !(iHashCode == -1065042973 ? !str.equals("topPointerUp") : !(iHashCode == 1343400710 && str.equals("topPointerOut"))));
    }
}
