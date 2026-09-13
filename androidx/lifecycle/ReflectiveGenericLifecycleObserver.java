package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0295j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0287b.a f5306b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f5305a = obj;
        this.f5306b = C0287b.f5312c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0295j
    public void d(l lVar, AbstractC0292g.a aVar) {
        this.f5306b.a(lVar, aVar, this.f5305a);
    }
}
