package app.netmirror.netmirrornew;

import D2.h;
import android.content.Context;
import bin.mt.signature.KillerApplication;
import com.facebook.react.defaults.d;
import com.facebook.react.defaults.g;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import p014d1.A;
import p014d1.C0460k;
import p014d1.InterfaceC0473y;
import p014d1.N;

/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends KillerApplication implements InterfaceC0473y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f5568b = new a(this);

    public static final class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f5569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f5570d;

        a(MainApplication mainApplication) {
            super(mainApplication);
            this.f5569c = true;
            this.f5570d = true;
        }

        @Override // p014d1.N
        protected String j() {
            return "index";
        }

        @Override // p014d1.N
        protected List m() {
            ArrayList arrayListA = new C0460k(this).a();
            h.e(arrayListA, "apply(...)");
            return arrayListA;
        }

        @Override // p014d1.N
        public boolean u() {
            return false;
        }

        @Override // com.facebook.react.defaults.g
        protected Boolean y() {
            return Boolean.valueOf(this.f5570d);
        }

        @Override // com.facebook.react.defaults.g
        protected boolean z() {
            return this.f5569c;
        }
    }

    @Override // p014d1.InterfaceC0473y
    public N a() {
        return this.f5568b;
    }

    @Override // p014d1.InterfaceC0473y
    public A b() {
        Context applicationContext = getApplicationContext();
        h.e(applicationContext, "getApplicationContext(...)");
        return d.e(applicationContext, a(), null, 4, null);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SoLoader.l(this, OpenSourceMergedSoMapping.f7228a);
        com.facebook.react.defaults.a.c(false, false, false, 7, null);
    }
}
