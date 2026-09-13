package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p012d.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3358a;

    private a(Context context) {
        this.f3358a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f3358a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f3358a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f3358a.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600) {
            return 5;
        }
        if (i3 > 960 && i4 > 720) {
            return 5;
        }
        if (i3 > 720 && i4 > 960) {
            return 5;
        }
        if (i3 >= 500) {
            return 4;
        }
        if (i3 > 640 && i4 > 480) {
            return 4;
        }
        if (i3 <= 480 || i4 <= 640) {
            return i3 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f3358a.getResources().getDimensionPixelSize(p012d.d.f8710b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f3358a.obtainStyledAttributes(null, j.f8953a, p012d.a.f8676c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f8994j, 0);
        Resources resources = this.f3358a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(p012d.d.f8709a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f3358a.getResources().getBoolean(p012d.b.f8700a);
    }

    public boolean h() {
        return true;
    }
}
