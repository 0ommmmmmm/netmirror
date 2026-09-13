package p083u2;

import D2.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public static int d(int i3, int... iArr) {
        h.f(iArr, "other");
        for (int i4 : iArr) {
            i3 = Math.max(i3, i4);
        }
        return i3;
    }

    public static int e(int i3, int... iArr) {
        h.f(iArr, "other");
        for (int i4 : iArr) {
            i3 = Math.min(i3, i4);
        }
        return i3;
    }
}
