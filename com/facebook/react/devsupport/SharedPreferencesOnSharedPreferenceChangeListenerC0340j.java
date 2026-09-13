package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.devsupport.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC0340j implements C1.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6733e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H1.d f6736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6737d;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.j$b */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC0340j(Context context, b bVar) {
        D2.h.f(context, "applicationContext");
        this.f6734a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        D2.h.e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f6735b = defaultSharedPreferences;
        this.f6736c = new H1.d(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f6737d = p026g1.a.f9424b;
    }

    @Override // C1.a
    public void c(boolean z3) {
        this.f6735b.edit().putBoolean("fps_debug", z3).apply();
    }

    @Override // C1.a
    public void f(boolean z3) {
        this.f6735b.edit().putBoolean("hot_module_replacement", z3).apply();
    }

    @Override // C1.a
    public boolean g() {
        return this.f6735b.getBoolean("inspector_debug", false);
    }

    @Override // C1.a
    public H1.d h() {
        return this.f6736c;
    }

    @Override // C1.a
    public void i(boolean z3) {
        this.f6735b.edit().putBoolean("inspector_debug", z3).apply();
    }

    @Override // C1.a
    public boolean j() {
        return this.f6737d;
    }

    @Override // C1.a
    public void k(boolean z3) {
        this.f6735b.edit().putBoolean("js_dev_mode_debug", z3).apply();
    }

    @Override // C1.a
    public boolean l() {
        return this.f6735b.getBoolean("js_minify_debug", false);
    }

    @Override // C1.a
    public boolean m() {
        return this.f6735b.getBoolean("fps_debug", false);
    }

    @Override // C1.a
    public boolean n() {
        return this.f6735b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // C1.a
    public boolean o() {
        return this.f6735b.getBoolean("hot_module_replacement", true);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        D2.h.f(sharedPreferences, "sharedPreferences");
        if (this.f6734a != null) {
            if (D2.h.b("fps_debug", str) || D2.h.b("js_dev_mode_debug", str) || D2.h.b("js_minify_debug", str)) {
                this.f6734a.a();
            }
        }
    }
}
