package p018e1;

import D2.h;
import p002a1.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread f9371a;

    public final void a() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f9371a == null) {
            this.f9371a = threadCurrentThread;
        }
        a.a(h.b(this.f9371a, threadCurrentThread));
    }
}
