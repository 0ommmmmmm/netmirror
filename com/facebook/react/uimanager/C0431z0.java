package com.facebook.react.uimanager;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.uimanager.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7642e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f7643f = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f7645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7647d;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.z0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private a() {
        }
    }

    public C0431z0(float f3, float[] fArr) {
        D2.h.f(fArr, "spacing");
        this.f7644a = f3;
        this.f7645b = fArr;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    public final float a(int i3) {
        float f3;
        if (i3 != 4 && i3 != 5) {
            switch (i3) {
                case 9:
                case 10:
                case 11:
                    f3 = Float.NaN;
                    break;
                default:
                    f3 = this.f7644a;
                    break;
            }
        } else {
            f3 = Float.NaN;
        }
        int i4 = this.f7646c;
        if (i4 == 0) {
            return f3;
        }
        int[] iArr = f7643f;
        if ((iArr[i3] & i4) != 0) {
            return this.f7645b[i3];
        }
        if (this.f7647d) {
            char c4 = (i3 == 1 || i3 == 3) ? (char) 7 : (char) 6;
            if ((iArr[c4] & i4) != 0) {
                return this.f7645b[c4];
            }
            if ((i4 & iArr[8]) != 0) {
                return this.f7645b[8];
            }
        }
        return f3;
    }

    public final float b(int i3) {
        return this.f7645b[i3];
    }

    public final boolean c(int i3, float f3) {
        int i4;
        if (L.a(this.f7645b[i3], f3)) {
            return false;
        }
        this.f7645b[i3] = f3;
        if (com.facebook.yoga.g.a(f3)) {
            i4 = (~f7643f[i3]) & this.f7646c;
        } else {
            i4 = f7643f[i3] | this.f7646c;
        }
        this.f7646c = i4;
        int[] iArr = f7643f;
        this.f7647d = ((iArr[8] & i4) == 0 && (iArr[7] & i4) == 0 && (iArr[6] & i4) == 0 && (i4 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public C0431z0() {
        this(0.0f, f7642e.b());
    }

    public C0431z0(float f3) {
        this(f3, f7642e.b());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0431z0(C0431z0 c0431z0) {
        D2.h.f(c0431z0, "original");
        float f3 = c0431z0.f7644a;
        float[] fArr = c0431z0.f7645b;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        D2.h.e(fArrCopyOf, "copyOf(...)");
        this(f3, fArrCopyOf);
        this.f7646c = c0431z0.f7646c;
        this.f7647d = c0431z0.f7647d;
    }
}
