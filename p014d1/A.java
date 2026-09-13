package p014d1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p042k1.e;
import p062p1.a;

/* JADX INFO: loaded from: classes.dex */
public interface A {
    a a(Context context, String str, Bundle bundle);

    e b();

    void c(Context context);

    void d(Activity activity);

    void e(Activity activity, B1.a aVar);

    void f(Activity activity);

    boolean g();

    void h(Activity activity);

    void onActivityResult(Activity activity, int i3, int i4, Intent intent);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z3);
}
