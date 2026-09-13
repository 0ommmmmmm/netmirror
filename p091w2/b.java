package p091w2;

import D2.h;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import p075s2.AbstractC0480b;
import p075s2.AbstractC0486h;

/* JADX INFO: loaded from: classes.dex */
final class b extends AbstractC0480b implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum[] f10914c;

    public b(Enum<Object>[] enumArr) {
        h.f(enumArr, "entries");
        this.f10914c = enumArr;
    }

    @Override // p075s2.AbstractC0479a
    public int a() {
        return this.f10914c.length;
    }

    public boolean b(Enum r3) {
        h.f(r3, "element");
        return ((Enum) AbstractC0486h.s(this.f10914c, r3.ordinal())) == r3;
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Enum get(int i3) {
        AbstractC0480b.f10620b.a(i3, this.f10914c.length);
        return this.f10914c[i3];
    }

    @Override // p075s2.AbstractC0479a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    public int e(Enum r3) {
        h.f(r3, "element");
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0486h.s(this.f10914c, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    public int f(Enum r3) {
        h.f(r3, "element");
        return indexOf(r3);
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return -1;
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return f((Enum) obj);
        }
        return -1;
    }
}
