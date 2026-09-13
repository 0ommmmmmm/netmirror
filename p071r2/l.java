package p071r2;

import D2.h;
import androidx.concurrent.futures.b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class l implements Lazy, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10593e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10594f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "c");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C2.a f10595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f10596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10597d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(C2.a aVar) {
        h.f(aVar, "initializer");
        this.f10595b = aVar;
        o oVar = o.f10601a;
        this.f10596c = oVar;
        this.f10597d = oVar;
    }

    public boolean a() {
        return this.f10596c != o.f10601a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f10596c;
        o oVar = o.f10601a;
        if (obj != oVar) {
            return obj;
        }
        C2.a aVar = this.f10595b;
        if (aVar != null) {
            Object objA = aVar.a();
            if (b.a(f10594f, this, oVar, objA)) {
                this.f10595b = null;
                return objA;
            }
        }
        return this.f10596c;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
