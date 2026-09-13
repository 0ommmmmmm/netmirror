package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.uimanager.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0394g0 {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7485h = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7479b = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.uimanager.g0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(EnumC0394g0 enumC0394g0) {
            D2.h.f(enumC0394g0, "pointerEvents");
            return enumC0394g0 == EnumC0394g0.AUTO || enumC0394g0 == EnumC0394g0.BOX_ONLY;
        }

        public final boolean b(EnumC0394g0 enumC0394g0) {
            D2.h.f(enumC0394g0, "pointerEvents");
            return enumC0394g0 == EnumC0394g0.AUTO || enumC0394g0 == EnumC0394g0.BOX_NONE;
        }

        public final EnumC0394g0 c(String str) {
            if (str == null) {
                return EnumC0394g0.AUTO;
            }
            Locale locale = Locale.US;
            D2.h.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            D2.h.e(upperCase, "toUpperCase(...)");
            return EnumC0394g0.valueOf(K2.o.v(upperCase, "-", "_", false, 4, null));
        }

        private a() {
        }
    }

    public static final boolean b(EnumC0394g0 enumC0394g0) {
        return f7479b.a(enumC0394g0);
    }

    public static final boolean c(EnumC0394g0 enumC0394g0) {
        return f7479b.b(enumC0394g0);
    }

    public static final EnumC0394g0 d(String str) {
        return f7479b.c(str);
    }
}
