package com.facebook.react.views.text.frescosupport;

import Z1.p;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Locale;
import p064q.g;

/* JADX INFO: loaded from: classes.dex */
class a extends Y1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Uri f7951A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ReadableMap f7952B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p065q0.b f7953C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Object f7954D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f7956F;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f7955E = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f7957G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7958H = 0;

    public a(p065q0.b bVar, Object obj) {
        this.f7953C = bVar;
        this.f7954D = obj;
    }

    private static Uri A1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    public Uri B1() {
        return this.f7951A;
    }

    @Override // com.facebook.react.uimanager.C0415r0, com.facebook.react.uimanager.InterfaceC0414q0
    public boolean R() {
        return true;
    }

    @L1.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f7952B = readableMap;
    }

    @Override // com.facebook.react.uimanager.U
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f7957G = (float) dynamic.asDouble();
        } else {
            Y.a.I("ReactNative", "Inline images must not have percentage based height");
            this.f7957G = Float.NaN;
        }
    }

    @L1.a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f7956F = str;
    }

    @L1.a(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri uriA1 = null;
        String string = (readableArray == null || readableArray.size() == 0 || readableArray.getType(0) != ReadableType.Map) ? null : ((ReadableMap) g.g(readableArray.getMap(0))).getString("uri");
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                try {
                    if (uri.getScheme() != null) {
                        uriA1 = uri;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (uriA1 == null) {
                uriA1 = A1(l(), string);
            }
        }
        if (uriA1 != this.f7951A) {
            y0();
        }
        this.f7951A = uriA1;
    }

    @L1.a(customType = "Color", name = "tintColor")
    public void setTintColor(int i3) {
        this.f7958H = i3;
    }

    @Override // com.facebook.react.uimanager.U
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f7955E = (float) dynamic.asDouble();
        } else {
            Y.a.I("ReactNative", "Inline images must not have percentage based width");
            this.f7955E = Float.NaN;
        }
    }

    @Override // Y1.a
    public p w1() {
        return new b(l().getResources(), (int) Math.ceil(this.f7957G), (int) Math.ceil(this.f7955E), this.f7958H, B1(), z1(), y1(), x1(), this.f7956F);
    }

    public Object x1() {
        return this.f7954D;
    }

    public p065q0.b y1() {
        return this.f7953C;
    }

    public ReadableMap z1() {
        return this.f7952B;
    }
}
