package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.bridge.UiThreadUtil;
import p014d1.AbstractC0461l;
import p014d1.AbstractC0462m;
import p014d1.AbstractC0464o;
import p014d1.AbstractC0466q;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements p042k1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p064q.i f6672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f6673b;

    public a0(p064q.i iVar) {
        D2.h.f(iVar, "contextSupplier");
        this.f6672a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a0 a0Var) {
        Dialog dialog = a0Var.f6673b;
        if (dialog != null) {
            dialog.dismiss();
        }
        a0Var.f6673b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a0 a0Var, String str, final k1.e.a aVar) {
        Dialog dialog = a0Var.f6673b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) a0Var.f6672a.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC0464o.f9259d, (ViewGroup) null);
        D2.h.e(viewInflate, "inflate(...)");
        viewInflate.findViewById(AbstractC0462m.f9240l).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.h(aVar, view);
            }
        });
        ((TextView) viewInflate.findViewById(AbstractC0462m.f9241m)).setText(str);
        Dialog dialog2 = new Dialog(context, AbstractC0466q.f9301a);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        a0Var.f6673b = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            D2.h.e(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(AbstractC0461l.f9223a);
        }
        Dialog dialog3 = a0Var.f6673b;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(k1.e.a aVar, View view) {
        aVar.a();
    }

    @Override // p042k1.h
    public void d(final String str, final k1.e.a aVar) {
        D2.h.f(str, "message");
        D2.h.f(aVar, "listener");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.X
            @Override // java.lang.Runnable
            public final void run() {
                a0.g(this.f6667b, str, aVar);
            }
        });
    }

    @Override // p042k1.h
    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.Y
            @Override // java.lang.Runnable
            public final void run() {
                a0.f(this.f6670b);
            }
        });
    }
}
