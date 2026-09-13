package p017e0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    long nowNanos();
}
