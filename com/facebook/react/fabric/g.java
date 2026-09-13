package com.facebook.react.fabric;

import java.util.PriorityQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f6831a = new PriorityQueue(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f6832b = new PriorityQueue(11, p083u2.a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f6833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6835e;

    public final void a(long j3) {
        if (j3 != 0) {
            if (this.f6831a.size() == this.f6832b.size()) {
                this.f6832b.offer(Long.valueOf(j3));
                this.f6831a.offer(this.f6832b.poll());
            } else {
                this.f6831a.offer(Long.valueOf(j3));
                this.f6832b.offer(this.f6831a.poll());
            }
        }
        int i3 = this.f6834d;
        int i4 = i3 + 1;
        this.f6834d = i4;
        if (i4 == 1) {
            this.f6833c = j3;
        } else {
            this.f6833c = (this.f6833c / ((double) (i4 / i3))) + (j3 / ((long) i4));
        }
        long j4 = this.f6835e;
        if (j3 <= j4) {
            j3 = j4;
        }
        this.f6835e = j3;
    }

    public final double b() {
        return this.f6833c;
    }

    public final long c() {
        return this.f6835e;
    }

    public final double d() {
        long jLongValue;
        Long lValueOf;
        if (this.f6831a.size() == 0 && this.f6832b.size() == 0) {
            return 0.0d;
        }
        if (this.f6831a.size() > this.f6832b.size()) {
            lValueOf = (Long) this.f6831a.peek();
        } else {
            Long l3 = (Long) this.f6831a.peek();
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                Object objPeek = this.f6832b.peek();
                D2.h.c(objPeek);
                jLongValue = ((Number) objPeek).longValue();
            }
            lValueOf = Long.valueOf(jLongValue / ((long) 2));
        }
        return lValueOf.longValue();
    }
}
