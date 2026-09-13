package p032i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC0232b;
import p052n.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f9491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f9492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f9493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f9494g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f9496i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f9498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f9499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f9500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f9501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f9502o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9495h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9497j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f9503p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f9504q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9505r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9506s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9507t = 16;

    public a(Context context, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f9499l = context;
        this.f9488a = i4;
        this.f9489b = i3;
        this.f9490c = i6;
        this.f9491d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f9498k;
        if (drawable != null) {
            if (this.f9505r || this.f9506s) {
                Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable);
                this.f9498k = drawableJ;
                Drawable drawableMutate = drawableJ.mutate();
                this.f9498k = drawableMutate;
                if (this.f9505r) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f9503p);
                }
                if (this.f9506s) {
                    androidx.core.graphics.drawable.a.h(this.f9498k, this.f9504q);
                }
            }
        }
    }

    @Override // p052n.b
    public b a(AbstractC0232b abstractC0232b) {
        throw new UnsupportedOperationException();
    }

    @Override // p052n.b
    public AbstractC0232b b() {
        return null;
    }

    @Override // p052n.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p052n.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // p052n.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p052n.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p052n.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p052n.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p052n.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9497j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9496i;
    }

    @Override // p052n.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9501n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9489b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9498k;
    }

    @Override // p052n.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9503p;
    }

    @Override // p052n.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9504q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9493f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9488a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p052n.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9495h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9494g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9490c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9491d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9492e;
        return charSequence != null ? charSequence : this.f9491d;
    }

    @Override // p052n.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9502o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p052n.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f9507t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f9507t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f9507t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f9507t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f9496i = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f9507t = (z3 ? 1 : 0) | (this.f9507t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f9507t = (z3 ? 2 : 0) | (this.f9507t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f9507t = (z3 ? 16 : 0) | (this.f9507t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9498k = drawable;
        c();
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9503p = colorStateList;
        this.f9505r = true;
        c();
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9504q = mode;
        this.f9506s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9493f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f9494g = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9500m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f9494g = c4;
        this.f9496i = Character.toLowerCase(c5);
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9491d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9492e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        this.f9507t = (this.f9507t & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i3) {
        this.f9496i = Character.toLowerCase(c4);
        this.f9497j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f9501n = charSequence;
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i3) {
        this.f9494g = c4;
        this.f9495h = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        this.f9491d = this.f9499l.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f9502o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f9498k = androidx.core.content.a.d(this.f9499l, i3);
        c();
        return this;
    }

    @Override // p052n.b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i3, int i4) {
        this.f9494g = c4;
        this.f9495h = KeyEvent.normalizeMetaState(i3);
        this.f9496i = Character.toLowerCase(c5);
        this.f9497j = KeyEvent.normalizeMetaState(i4);
        return this;
    }
}
