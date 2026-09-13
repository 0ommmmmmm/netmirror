package p071r2;

import D2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10590c;

    public i(Object obj, Object obj2) {
        this.f10589b = obj;
        this.f10590c = obj2;
    }

    public final Object a() {
        return this.f10589b;
    }

    public final Object b() {
        return this.f10590c;
    }

    public final Object c() {
        return this.f10589b;
    }

    public final Object d() {
        return this.f10590c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.b(this.f10589b, iVar.f10589b) && h.b(this.f10590c, iVar.f10590c);
    }

    public int hashCode() {
        Object obj = this.f10589b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10590c;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f10589b + ", " + this.f10590c + ')';
    }
}
