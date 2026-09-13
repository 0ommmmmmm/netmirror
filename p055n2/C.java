package p055n2;

import D2.h;
import android.view.VelocityTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9937f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C f9938g = new C(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f9939h = new C(1.0d, 0.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C f9940i = new C(0.0d, -1.0d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C f9941j = new C(0.0d, 1.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C f9942k = new C(1.0d, -1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C f9943l = new C(1.0d, 1.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C f9944m = new C(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C f9945n = new C(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C f9946o = new C(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f9947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f9948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f9949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f9950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f9951e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i3) {
            switch (i3) {
                case 1:
                    return C.f9939h;
                case 2:
                    return C.f9938g;
                case 3:
                case 7:
                default:
                    return C.f9946o;
                case 4:
                    return C.f9940i;
                case 5:
                    return C.f9942k;
                case 6:
                    return C.f9944m;
                case 8:
                    return C.f9941j;
                case 9:
                    return C.f9943l;
                case 10:
                    return C.f9945n;
            }
        }

        public final C b(VelocityTracker velocityTracker) {
            h.f(velocityTracker, "tracker");
            velocityTracker.computeCurrentVelocity(1000);
            return new C(velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
        }

        private a() {
        }
    }

    public C(double d4, double d5) {
        this.f9947a = d4;
        this.f9948b = d5;
        double dHypot = Math.hypot(d4, d5);
        this.f9951e = dHypot;
        boolean z3 = dHypot > 0.1d;
        this.f9949c = z3 ? d4 / dHypot : 0.0d;
        this.f9950d = z3 ? d5 / dHypot : 0.0d;
    }

    private final double j(C c4) {
        return (this.f9949c * c4.f9949c) + (this.f9950d * c4.f9950d);
    }

    public final double k() {
        return this.f9951e;
    }

    public final boolean l(C c4, double d4) {
        h.f(c4, "vector");
        return j(c4) > d4;
    }
}
