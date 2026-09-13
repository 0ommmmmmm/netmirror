package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements U0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7679b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7680a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U0.d a(List list) {
            D2.h.f(list, "postprocessors");
            int size = list.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new e(list, defaultConstructorMarker) : (U0.d) list.get(0);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // U0.d
    public p005b0.a a(Bitmap bitmap, G0.b bVar) {
        Bitmap bitmap2;
        D2.h.f(bitmap, "sourceBitmap");
        D2.h.f(bVar, "bitmapFactory");
        p005b0.a aVarA = null;
        try {
            p005b0.a aVarClone = null;
            for (U0.d dVar : this.f7680a) {
                if (aVarClone == null || (bitmap2 = (Bitmap) aVarClone.P()) == null) {
                    bitmap2 = bitmap;
                }
                aVarA = dVar.a(bitmap2, bVar);
                p005b0.a.D(aVarClone);
                aVarClone = aVarA.clone();
            }
            if (aVarA != null) {
                p005b0.a aVarClone2 = aVarA.clone();
                D2.h.e(aVarClone2, "clone(...)");
                p005b0.a.D(aVarA);
                return aVarClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.f7680a.size()).toString());
        } catch (Throwable th) {
            p005b0.a.D(null);
            throw th;
        }
    }

    @Override // U0.d
    public R.d b() {
        List list = this.f7680a;
        ArrayList arrayList = new ArrayList(AbstractC0492n.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((U0.d) it.next()).b());
        }
        return new R.f(arrayList);
    }

    @Override // U0.d
    public String getName() {
        return "MultiPostProcessor (" + AbstractC0492n.S(this.f7680a, ",", null, null, 0, null, null, 62, null) + ")";
    }

    private e(List list) {
        this.f7680a = new LinkedList(list);
    }
}
