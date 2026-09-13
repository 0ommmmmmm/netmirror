package com.facebook.react.views.scroll;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum l {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7895i = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7888b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0116a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7896a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.BEGIN_DRAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.END_DRAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.MOMENTUM_BEGIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.MOMENTUM_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f7896a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(l lVar) {
            D2.h.f(lVar, "type");
            int i3 = C0116a.f7896a[lVar.ordinal()];
            if (i3 == 1) {
                return "topScrollBeginDrag";
            }
            if (i3 == 2) {
                return "topScrollEndDrag";
            }
            if (i3 == 3) {
                return "topScroll";
            }
            if (i3 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i3 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new p071r2.h();
        }

        private a() {
        }
    }

    public static final String b(l lVar) {
        return f7888b.a(lVar);
    }
}
