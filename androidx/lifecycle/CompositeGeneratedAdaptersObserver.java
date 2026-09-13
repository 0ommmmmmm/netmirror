package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC0295j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0290e[] f5260a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0290e[] interfaceC0290eArr) {
        D2.h.f(interfaceC0290eArr, "generatedAdapters");
        this.f5260a = interfaceC0290eArr;
    }

    @Override // androidx.lifecycle.InterfaceC0295j
    public void d(l lVar, AbstractC0292g.a aVar) {
        D2.h.f(lVar, "source");
        D2.h.f(aVar, "event");
        new o();
        InterfaceC0290e[] interfaceC0290eArr = this.f5260a;
        if (interfaceC0290eArr.length > 0) {
            InterfaceC0290e interfaceC0290e = interfaceC0290eArr[0];
            throw null;
        }
        if (interfaceC0290eArr.length <= 0) {
            return;
        }
        InterfaceC0290e interfaceC0290e2 = interfaceC0290eArr[0];
        throw null;
    }
}
