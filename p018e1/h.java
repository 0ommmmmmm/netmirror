package p018e1;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f9369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f9370b;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f9369a = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f9370b = timeUnit.convert(3L, TimeUnit.SECONDS);
    }
}
