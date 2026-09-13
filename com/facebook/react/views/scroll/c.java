package com.facebook.react.views.scroll;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f7762f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7766d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7763a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7764b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7767e = -11;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final float a() {
        return this.f7765c;
    }

    public final float b() {
        return this.f7766d;
    }

    public final boolean c(int i3, int i4) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f7767e;
        boolean z3 = (jUptimeMillis - j3 <= 10 && this.f7763a == i3 && this.f7764b == i4) ? false : true;
        if (jUptimeMillis - j3 != 0) {
            this.f7765c = (i3 - this.f7763a) / (jUptimeMillis - j3);
            this.f7766d = (i4 - this.f7764b) / (jUptimeMillis - j3);
        }
        this.f7767e = jUptimeMillis;
        this.f7763a = i3;
        this.f7764b = i4;
        return z3;
    }
}
