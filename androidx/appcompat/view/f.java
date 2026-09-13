package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f3374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f3375b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f3376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f3377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f3378c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final p044l.g f3379d = new p044l.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f3377b = context;
            this.f3376a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f3379d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p032i.d dVar = new p032i.d(this.f3377b, (p052n.a) menu);
            this.f3379d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f3376a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void b(b bVar) {
            this.f3376a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f3376a.onActionItemClicked(e(bVar), new p032i.c(this.f3377b, (p052n.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f3376a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f3378c.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = (f) this.f3378c.get(i3);
                if (fVar != null && fVar.f3375b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f3377b, bVar);
            this.f3378c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f3374a = context;
        this.f3375b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f3375b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f3375b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p032i.d(this.f3374a, (p052n.a) this.f3375b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f3375b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f3375b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f3375b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f3375b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f3375b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f3375b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f3375b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f3375b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f3375b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f3375b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f3375b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z3) {
        this.f3375b.s(z3);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i3) {
        this.f3375b.n(i3);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i3) {
        this.f3375b.q(i3);
    }
}
