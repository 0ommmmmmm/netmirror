package R1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public enum n {
    ALL { // from class: R1.n.a
        @Override // R1.n
        public int b() {
            return 8;
        }
    },
    LEFT { // from class: R1.n.i
        @Override // R1.n
        public int b() {
            return 0;
        }
    },
    RIGHT { // from class: R1.n.j
        @Override // R1.n
        public int b() {
            return 2;
        }
    },
    TOP { // from class: R1.n.l
        @Override // R1.n
        public int b() {
            return 1;
        }
    },
    BOTTOM { // from class: R1.n.e
        @Override // R1.n
        public int b() {
            return 3;
        }
    },
    START { // from class: R1.n.k
        @Override // R1.n
        public int b() {
            return 4;
        }
    },
    END { // from class: R1.n.g
        @Override // R1.n
        public int b() {
            return 5;
        }
    },
    HORIZONTAL { // from class: R1.n.h
        @Override // R1.n
        public int b() {
            return 6;
        }
    },
    VERTICAL { // from class: R1.n.m
        @Override // R1.n
        public int b() {
            return 7;
        }
    },
    BLOCK_START { // from class: R1.n.d
        @Override // R1.n
        public int b() {
            return 11;
        }
    },
    BLOCK_END { // from class: R1.n.c
        @Override // R1.n
        public int b() {
            return 10;
        }
    },
    BLOCK { // from class: R1.n.b
        @Override // R1.n
        public int b() {
            return 9;
        }
    };


    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f2088p = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f2074b = new f(null);

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(int i3) {
            switch (i3) {
                case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                    return n.LEFT;
                case 1:
                    return n.TOP;
                case 2:
                    return n.RIGHT;
                case 3:
                    return n.BOTTOM;
                case 4:
                    return n.START;
                case 5:
                    return n.END;
                case 6:
                    return n.HORIZONTAL;
                case 7:
                    return n.VERTICAL;
                case 8:
                    return n.ALL;
                case 9:
                    return n.BLOCK;
                case 10:
                    return n.BLOCK_END;
                case 11:
                    return n.BLOCK_START;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i3);
            }
        }

        private f() {
        }
    }

    /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int b();
}
