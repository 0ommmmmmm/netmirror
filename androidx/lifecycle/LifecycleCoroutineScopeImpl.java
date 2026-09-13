package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0293h implements InterfaceC0295j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0292g f5285a;

    public LifecycleCoroutineScopeImpl(AbstractC0292g abstractC0292g, p087v2.a aVar) {
        D2.h.f(abstractC0292g, "lifecycle");
        D2.h.f(aVar, "coroutineContext");
        this.f5285a = abstractC0292g;
        if (i().b() == AbstractC0292g.b.DESTROYED) {
            h();
            L2.c.b(null, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0295j
    public void d(l lVar, AbstractC0292g.a aVar) {
        D2.h.f(lVar, "source");
        D2.h.f(aVar, "event");
        if (i().b().compareTo(AbstractC0292g.b.DESTROYED) <= 0) {
            i().c(this);
            h();
            L2.c.b(null, null, 1, null);
        }
    }

    public p087v2.a h() {
        return null;
    }

    public AbstractC0292g i() {
        return this.f5285a;
    }
}
