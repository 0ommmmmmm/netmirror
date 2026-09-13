package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.devsupport.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339i implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f6724a = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.devsupport.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.devsupport.H
    public p042k1.e a(Context context, c0 c0Var, String str, boolean z3, p042k1.i iVar, p042k1.b bVar, int i3, Map map, p018e1.k kVar, p042k1.c cVar, p042k1.h hVar, boolean z4) {
        D2.h.f(context, "applicationContext");
        D2.h.f(c0Var, "reactInstanceManagerHelper");
        if (z4) {
            return new C0331a(context, c0Var, str, z3, iVar, bVar, i3, map, kVar, cVar, hVar);
        }
        return p026g1.a.f9426d ? new b0(context) : new k0();
    }

    @Override // com.facebook.react.devsupport.H
    public p042k1.e b(Context context, c0 c0Var, String str, boolean z3, p042k1.i iVar, p042k1.b bVar, int i3, Map map, p018e1.k kVar, p042k1.c cVar, p042k1.h hVar) {
        D2.h.f(context, "applicationContext");
        D2.h.f(c0Var, "reactInstanceManagerHelper");
        if (!z3) {
            return new k0();
        }
        try {
            String str2 = "com.facebook.react.devsupport.BridgeDevSupportManager";
            D2.h.e(str2, "toString(...)");
            Object objNewInstance = Class.forName(str2).getConstructor(Context.class, c0.class, String.class, Boolean.TYPE, p042k1.i.class, p042k1.b.class, Integer.TYPE, Map.class, p018e1.k.class, p042k1.c.class, p042k1.h.class).newInstance(context, c0Var, str, Boolean.TRUE, iVar, bVar, Integer.valueOf(i3), map, kVar, cVar, hVar);
            D2.h.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (p042k1.e) objNewInstance;
        } catch (Exception unused) {
            return new b0(context);
        }
    }
}
