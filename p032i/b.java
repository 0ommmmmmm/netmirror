package p032i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p044l.g;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f9508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f9510c;

    b(Context context) {
        this.f9508a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof p052n.b)) {
            return menuItem;
        }
        p052n.b bVar = (p052n.b) menuItem;
        if (this.f9509b == null) {
            this.f9509b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f9509b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f9508a, bVar);
        this.f9509b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        g gVar = this.f9509b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f9510c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i3) {
        if (this.f9509b == null) {
            return;
        }
        int i4 = 0;
        while (i4 < this.f9509b.size()) {
            if (((p052n.b) this.f9509b.i(i4)).getGroupId() == i3) {
                this.f9509b.k(i4);
                i4--;
            }
            i4++;
        }
    }

    final void g(int i3) {
        if (this.f9509b == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f9509b.size(); i4++) {
            if (((p052n.b) this.f9509b.i(i4)).getItemId() == i3) {
                this.f9509b.k(i4);
                return;
            }
        }
    }
}
