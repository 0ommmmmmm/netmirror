package com.facebook.react.views.text;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum u {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8061i = p091w2.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8054b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, u uVar) {
            if (str != null) {
                return v.a(str, uVar);
            }
            return null;
        }

        private a() {
        }
    }

    public static final String b(String str, u uVar) {
        return f8054b.a(str, uVar);
    }
}
