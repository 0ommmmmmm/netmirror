package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f6387n = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f6388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReactApplicationContext f6389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ReadableMap f6394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f6395m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Context b(b bVar) {
            List list = bVar.f6379a;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return null;
            }
            b bVar2 = (b) it.next();
            if (!(bVar2 instanceof q)) {
                return f.f6387n.b(bVar2);
            }
            View viewK = ((q) bVar2).k();
            if (viewK != null) {
                return viewK.getContext();
            }
            return null;
        }

        private a() {
        }
    }

    public f(ReadableMap readableMap, o oVar, ReactApplicationContext reactApplicationContext) {
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        D2.h.f(reactApplicationContext, "reactApplicationContext");
        this.f6388f = oVar;
        this.f6389g = reactApplicationContext;
        a(readableMap);
    }

    private final Context j() {
        Activity currentActivity = this.f6389g.getCurrentActivity();
        return currentActivity != null ? currentActivity : f6387n.b(this);
    }

    private final void k() {
        Context contextJ;
        if (this.f6394l == null || this.f6395m || (contextJ = j()) == null) {
            return;
        }
        Integer color = ColorPropConverter.getColor(this.f6394l, contextJ);
        w wVar = (w) this.f6388f.l(this.f6390h);
        w wVar2 = (w) this.f6388f.l(this.f6391i);
        w wVar3 = (w) this.f6388f.l(this.f6392j);
        w wVar4 = (w) this.f6388f.l(this.f6393k);
        if (wVar != null) {
            D2.h.c(color);
            wVar.f6496f = Color.red(color.intValue());
        }
        if (wVar2 != null) {
            D2.h.c(color);
            wVar2.f6496f = Color.green(color.intValue());
        }
        if (wVar3 != null) {
            D2.h.c(color);
            wVar3.f6496f = Color.blue(color.intValue());
        }
        if (wVar4 != null) {
            D2.h.c(color);
            wVar4.f6496f = ((double) Color.alpha(color.intValue())) / 255.0d;
        }
        this.f6395m = true;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f6390h = 0;
            this.f6391i = 0;
            this.f6392j = 0;
            this.f6393k = 0;
            this.f6394l = null;
            this.f6395m = false;
            return;
        }
        this.f6390h = readableMap.getInt("r");
        this.f6391i = readableMap.getInt("g");
        this.f6392j = readableMap.getInt("b");
        this.f6393k = readableMap.getInt("a");
        this.f6394l = readableMap.getMap("nativeColor");
        this.f6395m = false;
        k();
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ColorAnimatedNode[" + this.f6382d + "]: r: " + this.f6390h + "  g: " + this.f6391i + " b: " + this.f6392j + " a: " + this.f6393k;
    }

    public final int i() {
        k();
        w wVar = (w) this.f6388f.l(this.f6390h);
        w wVar2 = (w) this.f6388f.l(this.f6391i);
        w wVar3 = (w) this.f6388f.l(this.f6392j);
        w wVar4 = (w) this.f6388f.l(this.f6393k);
        return com.facebook.react.views.view.d.b(wVar != null ? wVar.f6496f : 0.0d, wVar2 != null ? wVar2.f6496f : 0.0d, wVar3 != null ? wVar3.f6496f : 0.0d, wVar4 != null ? wVar4.f6496f : 0.0d);
    }
}
