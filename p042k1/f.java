package p042k1;

import kotlin.enums.EnumEntries;
import p091w2.a;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    JS("JS"),
    NATIVE("Native");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f9592f = a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9593b;

    f(String str) {
        this.f9593b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9593b;
    }
}
