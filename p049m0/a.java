package p049m0;

import O0.d;
import O0.e;
import V0.b;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p077t0.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements N0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f9797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N0.a f9798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0.a f9799c;

    public a(Resources resources, N0.a aVar, N0.a aVar2) {
        this.f9797a = resources;
        this.f9798b = aVar;
        this.f9799c = aVar2;
    }

    private static boolean c(e eVar) {
        return (eVar.s0() == 1 || eVar.s0() == 0) ? false : true;
    }

    private static boolean d(e eVar) {
        return (eVar.N() == 0 || eVar.N() == -1) ? false : true;
    }

    @Override // N0.a
    public boolean a(d dVar) {
        return true;
    }

    @Override // N0.a
    public Drawable b(d dVar) {
        try {
            if (b.d()) {
                b.a("DefaultDrawableFactory#createDrawable");
            }
            if (dVar instanceof e) {
                e eVar = (e) dVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f9797a, eVar.C());
                return (d(eVar) || c(eVar)) ? new i(bitmapDrawable, eVar.N(), eVar.s0()) : bitmapDrawable;
            }
            N0.a aVar = this.f9798b;
            if (aVar != null && aVar.a(dVar)) {
                return this.f9798b.b(dVar);
            }
            N0.a aVar2 = this.f9799c;
            if (aVar2 == null || !aVar2.a(dVar)) {
            }
            return this.f9799c.b(dVar);
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    public a(Resources resources, N0.a aVar) {
        this(resources, aVar, null);
    }
}
