package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.react.devsupport.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0331a extends E {
    public C0331a(Context context, c0 c0Var, String str) {
        this(context.getApplicationContext(), c0Var, str, true, null, null, 2, null, null, null, null);
    }

    @Override // com.facebook.react.devsupport.E
    protected String k0() {
        return "Bridgeless";
    }

    @Override // p042k1.e
    public void s() {
        UiThreadUtil.assertOnUiThread();
        q();
        this.f6604f.j("BridgelessDevSupportManager.handleReloadJS()");
    }

    public C0331a(Context context, c0 c0Var, String str, boolean z3, p042k1.i iVar, p042k1.b bVar, int i3, Map<String, H1.f> map, p018e1.k kVar, p042k1.c cVar, p042k1.h hVar) {
        super(context, c0Var, str, z3, iVar, bVar, i3, map, kVar, cVar, hVar);
    }
}
