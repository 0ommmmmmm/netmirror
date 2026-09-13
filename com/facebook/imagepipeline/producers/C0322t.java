package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322t implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f6253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6254b;

    public C0322t(e0 e0Var, ScheduledExecutorService scheduledExecutorService) {
        D2.h.f(e0Var, "inputProducer");
        this.f6253a = e0Var;
        this.f6254b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0322t c0322t, InterfaceC0317n interfaceC0317n, f0 f0Var) {
        D2.h.f(c0322t, "this$0");
        D2.h.f(interfaceC0317n, "$consumer");
        D2.h.f(f0Var, "$context");
        c0322t.f6253a.b(interfaceC0317n, f0Var);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(final InterfaceC0317n interfaceC0317n, final f0 f0Var) {
        D2.h.f(interfaceC0317n, "consumer");
        D2.h.f(f0Var, "context");
        U0.b bVarX = f0Var.X();
        ScheduledExecutorService scheduledExecutorService = this.f6254b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.s
                @Override // java.lang.Runnable
                public final void run() {
                    C0322t.d(this.f6242b, interfaceC0317n, f0Var);
                }
            }, bVarX.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f6253a.b(interfaceC0317n, f0Var);
        }
    }
}
