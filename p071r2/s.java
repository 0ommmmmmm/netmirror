package p071r2;

import C2.a;
import D2.h;
import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Lazy, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f10605c;

    public s(a aVar) {
        h.f(aVar, "initializer");
        this.f10604b = aVar;
        this.f10605c = o.f10601a;
    }

    public boolean a() {
        return this.f10605c != o.f10601a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f10605c == o.f10601a) {
            a aVar = this.f10604b;
            h.c(aVar);
            this.f10605c = aVar.a();
            this.f10604b = null;
        }
        return this.f10605c;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
