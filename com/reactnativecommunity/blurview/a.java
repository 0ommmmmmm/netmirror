package com.reactnativecommunity.blurview;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.B0;
import java.util.Objects;
import p067q2.c;

/* JADX INFO: loaded from: classes.dex */
abstract class a {
    public static c a(B0 b4) {
        c cVar = new c(b4);
        Activity currentActivity = b4.getCurrentActivity();
        Objects.requireNonNull(currentActivity);
        View decorView = currentActivity.getWindow().getDecorView();
        cVar.f((ViewGroup) decorView.findViewById(R.id.content)).a(decorView.getBackground()).e(10.0f);
        return cVar;
    }

    public static void b(c cVar, boolean z3) {
        cVar.b(z3);
        cVar.invalidate();
    }

    public static void c(c cVar, boolean z3) {
        cVar.c(z3);
    }

    public static void d(c cVar, int i3) {
        cVar.e(i3);
        cVar.invalidate();
    }

    public static void e(c cVar, int i3) {
        cVar.d(i3);
        cVar.invalidate();
    }
}
