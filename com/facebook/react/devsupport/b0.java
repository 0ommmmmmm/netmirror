package com.facebook.react.devsupport;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1.a f6688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0341k f6689c;

    public static final class a implements SharedPreferencesOnSharedPreferenceChangeListenerC0340j.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0340j.b
        public void a() {
        }
    }

    public b0(Context context) {
        D2.h.f(context, "applicationContext");
        this.f6688b = new SharedPreferencesOnSharedPreferenceChangeListenerC0340j(context, new a());
        this.f6689c = new C0341k(o(), context, o().h());
    }

    @Override // com.facebook.react.devsupport.k0, p042k1.e
    public void m() {
        this.f6689c.i();
    }

    @Override // com.facebook.react.devsupport.k0, p042k1.e
    public C1.a o() {
        return this.f6688b;
    }

    @Override // com.facebook.react.devsupport.k0, p042k1.e
    public void u() {
        this.f6689c.y();
    }
}
