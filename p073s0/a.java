package p073s0;

import D2.h;
import android.graphics.drawable.Animatable;
import p065q0.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f10607d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10608e = -1;

    public a(b bVar) {
        this.f10606c = bVar;
    }

    @Override // p065q0.c, p065q0.d
    public void j(String str, Object obj) {
        h.f(str, "id");
        this.f10607d = System.currentTimeMillis();
    }

    @Override // p065q0.c, p065q0.d
    public void k(String str, Object obj, Animatable animatable) {
        h.f(str, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f10608e = jCurrentTimeMillis;
        b bVar = this.f10606c;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f10607d);
        }
    }
}
