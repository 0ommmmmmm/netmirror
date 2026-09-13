package com.facebook.react.animated;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f6455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f6457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JavaOnlyMap f6458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private UIManager f6459j;

    public q(ReadableMap readableMap, o oVar) {
        D2.h.f(readableMap, "config");
        D2.h.f(oVar, "nativeAnimatedNodesManager");
        this.f6455f = oVar;
        this.f6456g = -1;
        this.f6458i = new JavaOnlyMap();
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.f6457h = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f6457h.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "PropsAnimatedNode[" + this.f6382d + "] connectedViewTag: " + this.f6456g + " propNodeMapping: " + this.f6457h + " propMap: " + this.f6458i;
    }

    public final void i(int i3, UIManager uIManager) {
        if (this.f6456g == -1) {
            this.f6456g = i3;
            this.f6459j = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f6382d + " is already attached to a view: " + this.f6456g);
    }

    public final void j(int i3) {
        int i4 = this.f6456g;
        if (i4 == i3 || i4 == -1) {
            this.f6456g = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i3 + " but is connected to view " + this.f6456g);
    }

    public final View k() {
        Object objA;
        try {
            r2.j.a aVar = p071r2.j.f10591b;
            UIManager uIManager = this.f6459j;
            objA = p071r2.j.a(uIManager != null ? uIManager.resolveView(this.f6456g) : null);
        } catch (Throwable th) {
            r2.j.a aVar2 = p071r2.j.f10591b;
            objA = p071r2.j.a(p071r2.k.a(th));
        }
        return (View) (p071r2.j.b(objA) ? null : objA);
    }

    public final void l() {
        int i3 = this.f6456g;
        if (i3 == -1 || M1.a.a(i3) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.f6458i.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.f6458i.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = this.f6459j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f6456g, this.f6458i);
        }
    }

    public final void m() {
        if (this.f6456g == -1) {
            return;
        }
        for (Map.Entry entry : this.f6457h.entrySet()) {
            String str = (String) entry.getKey();
            b bVarL = this.f6455f.l(((Number) entry.getValue()).intValue());
            if (bVarL == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (bVarL instanceof s) {
                ((s) bVarL).i(this.f6458i);
            } else if (bVarL instanceof w) {
                w wVar = (w) bVarL;
                Object objK = wVar.k();
                if (objK instanceof Integer) {
                    this.f6458i.putInt(str, ((Number) objK).intValue());
                } else if (objK instanceof String) {
                    this.f6458i.putString(str, (String) objK);
                } else {
                    this.f6458i.putDouble(str, wVar.l());
                }
            } else if (bVarL instanceof f) {
                this.f6458i.putInt(str, ((f) bVarL).i());
            } else {
                if (!(bVarL instanceof p)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + bVarL.getClass());
                }
                ((p) bVarL).i(str, this.f6458i);
            }
        }
        UIManager uIManager = this.f6459j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f6456g, this.f6458i);
        }
    }
}
