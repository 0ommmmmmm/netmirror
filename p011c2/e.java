package p011c2;

import com.facebook.soloader.E;

/* JADX INFO: loaded from: classes.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f5692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5693b = 0;

    public e(h... hVarArr) {
        this.f5692a = hVarArr;
    }

    @Override // p011c2.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i3;
        h[] hVarArr;
        do {
            i3 = this.f5693b;
            hVarArr = this.f5692a;
            if (i3 >= hVarArr.length) {
                return false;
            }
            this.f5693b = i3 + 1;
        } while (!hVarArr[i3].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
