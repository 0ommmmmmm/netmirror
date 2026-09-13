package p071r2;

import C2.a;
import D2.h;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class m implements Lazy, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f10599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10600d;

    public m(a aVar, Object obj) {
        h.f(aVar, "initializer");
        this.f10598b = aVar;
        this.f10599c = o.f10601a;
        this.f10600d = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f10599c != o.f10601a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objA;
        Object obj = this.f10599c;
        o oVar = o.f10601a;
        if (obj != oVar) {
            return obj;
        }
        synchronized (this.f10600d) {
            objA = this.f10599c;
            if (objA == oVar) {
                a aVar = this.f10598b;
                h.c(aVar);
                objA = aVar.a();
                this.f10599c = objA;
                this.f10598b = null;
            }
        }
        return objA;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ m(a aVar, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i3 & 2) != 0 ? null : obj);
    }
}
