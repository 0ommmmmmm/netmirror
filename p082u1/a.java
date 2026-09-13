package p082u1;

import D2.h;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f10867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f10870e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, WritableMap writableMap) {
        this(str, writableMap, 0L, false, null, 28, null);
        h.f(str, "taskKey");
        h.f(writableMap, "data");
    }

    public final WritableMap a() {
        return this.f10867b;
    }

    public final g b() {
        return this.f10870e;
    }

    public final String c() {
        return this.f10866a;
    }

    public final long d() {
        return this.f10868c;
    }

    public final boolean e() {
        return this.f10869d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, WritableMap writableMap, long j3) {
        this(str, writableMap, j3, false, null, 24, null);
        h.f(str, "taskKey");
        h.f(writableMap, "data");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, WritableMap writableMap, long j3, boolean z3) {
        this(str, writableMap, j3, z3, null, 16, null);
        h.f(str, "taskKey");
        h.f(writableMap, "data");
    }

    public a(String str, WritableMap writableMap, long j3, boolean z3, g gVar) {
        h.f(str, "taskKey");
        h.f(writableMap, "data");
        this.f10866a = str;
        this.f10867b = writableMap;
        this.f10868c = j3;
        this.f10869d = z3;
        this.f10870e = gVar;
    }

    public /* synthetic */ a(String str, WritableMap writableMap, long j3, boolean z3, g gVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, writableMap, (i3 & 4) != 0 ? 0L : j3, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? h.f10887b : gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(a aVar) {
        h.f(aVar, "source");
        String str = aVar.f10866a;
        WritableMap writableMapCopy = aVar.f10867b.copy();
        long j3 = aVar.f10868c;
        boolean z3 = aVar.f10869d;
        g gVar = aVar.f10870e;
        this(str, writableMapCopy, j3, z3, gVar != null ? gVar.copy() : null);
    }
}
