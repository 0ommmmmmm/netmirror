package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7947b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f7948c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p022f1.a f7949a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d dVar = d.f7948c;
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(p022f1.a.f9382c.c(), null);
            d.f7948c = dVar2;
            return dVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ d(p022f1.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final d c() {
        return f7947b.a();
    }

    public final Typeface d(String str, int i3, AssetManager assetManager) {
        D2.h.f(str, "fontFamilyName");
        D2.h.f(assetManager, "assetManager");
        return this.f7949a.d(str, i3, assetManager);
    }

    private d(p022f1.a aVar) {
        this.f7949a = aVar;
    }
}
