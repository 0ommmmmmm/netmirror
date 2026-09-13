package p032i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0232b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends p032i.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p052n.b f9511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f9512e;

    private class a extends AbstractC0232b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC0232b.InterfaceC0067b f9513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f9514e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f9514e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0232b
        public boolean a() {
            return this.f9514e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0232b
        public boolean b() {
            return this.f9514e.isVisible();
        }

        @Override // androidx.core.view.AbstractC0232b
        public View c() {
            return this.f9514e.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0232b
        public View d(MenuItem menuItem) {
            return this.f9514e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0232b
        public boolean e() {
            return this.f9514e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0232b
        public void f(SubMenu subMenu) {
            this.f9514e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC0232b
        public boolean g() {
            return this.f9514e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0232b
        public void j(AbstractC0232b.InterfaceC0067b interfaceC0067b) {
            this.f9513d = interfaceC0067b;
            this.f9514e.setVisibilityListener(interfaceC0067b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z3) {
            AbstractC0232b.InterfaceC0067b interfaceC0067b = this.f9513d;
            if (interfaceC0067b != null) {
                interfaceC0067b.onActionProviderVisibilityChanged(z3);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f9516b;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f9516b = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f9516b;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f9516b.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void d() {
            this.f9516b.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: i.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0132c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f9517a;

        MenuItemOnActionExpandListenerC0132c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f9517a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f9517a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f9517a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f9519a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f9519a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f9519a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, p052n.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9511d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f9511d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f9511d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0232b abstractC0232bB = this.f9511d.b();
        if (abstractC0232bB instanceof a) {
            return ((a) abstractC0232bB).f9514e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f9511d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9511d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9511d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9511d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9511d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9511d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9511d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9511d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9511d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9511d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9511d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9511d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9511d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9511d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f9511d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9511d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f9511d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9511d.getTooltipText();
    }

    public void h(boolean z3) {
        try {
            if (this.f9512e == null) {
                this.f9512e = this.f9511d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f9512e.invoke(this.f9511d, Boolean.valueOf(z3));
        } catch (Exception e4) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f9511d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f9511d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f9511d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f9511d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f9511d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f9511d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f9508a, actionProvider);
        p052n.b bVar = this.f9511d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f9511d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f9511d.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f9511d.setCheckable(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f9511d.setChecked(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f9511d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f9511d.setEnabled(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9511d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9511d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9511d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9511d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f9511d.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9511d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0132c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9511d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f9511d.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i3) {
        this.f9511d.setShowAsAction(i3);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i3) {
        this.f9511d.setShowAsActionFlags(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9511d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9511d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f9511d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        return this.f9511d.setVisible(z3);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i3) {
        this.f9511d.setAlphabeticShortcut(c4, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f9511d.setIcon(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i3) {
        this.f9511d.setNumericShortcut(c4, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i3, int i4) {
        this.f9511d.setShortcut(c4, c5, i3, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        this.f9511d.setTitle(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i3) {
        this.f9511d.setActionView(i3);
        View actionView = this.f9511d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f9511d.setActionView(new b(actionView));
        }
        return this;
    }
}
