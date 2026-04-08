package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class MenuItemImpl implements SupportMenuItem {

    /* JADX INFO: renamed from: A */
    public ActionProvider f839A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f840B;

    /* JADX INFO: renamed from: D */
    public ContextMenu.ContextMenuInfo f842D;

    /* JADX INFO: renamed from: a */
    public final int f843a;

    /* JADX INFO: renamed from: b */
    public final int f844b;

    /* JADX INFO: renamed from: c */
    public final int f845c;

    /* JADX INFO: renamed from: d */
    public final int f846d;

    /* JADX INFO: renamed from: e */
    public CharSequence f847e;

    /* JADX INFO: renamed from: f */
    public CharSequence f848f;

    /* JADX INFO: renamed from: g */
    public Intent f849g;

    /* JADX INFO: renamed from: h */
    public char f850h;

    /* JADX INFO: renamed from: j */
    public char f852j;

    /* JADX INFO: renamed from: l */
    public Drawable f854l;

    /* JADX INFO: renamed from: n */
    public final MenuBuilder f856n;

    /* JADX INFO: renamed from: o */
    public SubMenuBuilder f857o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f858p;

    /* JADX INFO: renamed from: q */
    public CharSequence f859q;

    /* JADX INFO: renamed from: r */
    public CharSequence f860r;

    /* JADX INFO: renamed from: y */
    public int f867y;

    /* JADX INFO: renamed from: z */
    public View f868z;

    /* JADX INFO: renamed from: i */
    public int f851i = 4096;

    /* JADX INFO: renamed from: k */
    public int f853k = 4096;

    /* JADX INFO: renamed from: m */
    public int f855m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f861s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f862t = null;

    /* JADX INFO: renamed from: u */
    public boolean f863u = false;

    /* JADX INFO: renamed from: v */
    public boolean f864v = false;

    /* JADX INFO: renamed from: w */
    public boolean f865w = false;

    /* JADX INFO: renamed from: x */
    public int f866x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f841C = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C00921 implements ActionProvider.VisibilityListener {
        public C00921() {
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f856n = menuBuilder;
        this.f843a = i2;
        this.f844b = i;
        this.f845c = i3;
        this.f846d = i4;
        this.f847e = charSequence;
        this.f867y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m471c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    /* JADX INFO: renamed from: a */
    public final SupportMenuItem mo432a(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f839A;
        if (actionProvider2 != null) {
            actionProvider2.f23347b = null;
            actionProvider2.f23346a = null;
        }
        this.f868z = null;
        this.f839A = actionProvider;
        this.f856n.onItemsChanged(true);
        ActionProvider actionProvider3 = this.f839A;
        if (actionProvider3 != null) {
            actionProvider3.mo483h(new C00921());
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    /* JADX INFO: renamed from: b */
    public final ActionProvider mo433b() {
        return this.f839A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f867y & 8) == 0) {
            return false;
        }
        if (this.f868z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f840B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f856n.collapseItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m472d(Drawable drawable) {
        if (drawable != null && this.f865w && (this.f863u || this.f864v)) {
            drawable = drawable.mutate();
            if (this.f863u) {
                drawable.setTintList(this.f861s);
            }
            if (this.f864v) {
                drawable.setTintMode(this.f862t);
            }
            this.f865w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m473e() {
        ActionProvider actionProvider;
        if ((this.f867y & 8) == 0) {
            return false;
        }
        if (this.f868z == null && (actionProvider = this.f839A) != null) {
            this.f868z = actionProvider.mo479d(this);
        }
        return this.f868z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m473e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f840B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f856n.expandItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m474f(boolean z2) {
        this.f866x = (z2 ? 4 : 0) | (this.f866x & (-5));
    }

    /* JADX INFO: renamed from: g */
    public final void m475g(boolean z2) {
        if (z2) {
            this.f866x |= 32;
        } else {
            this.f866x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f868z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f839A;
        if (actionProvider == null) {
            return null;
        }
        View viewMo479d = actionProvider.mo479d(this);
        this.f868z = viewMo479d;
        return viewMo479d;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f853k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f852j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f859q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f844b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f854l;
        if (drawable != null) {
            return m472d(drawable);
        }
        if (this.f855m == 0) {
            return null;
        }
        Drawable drawableM395a = AppCompatResources.m395a(this.f856n.getContext(), this.f855m);
        this.f855m = 0;
        this.f854l = drawableM395a;
        return m472d(drawableM395a);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f861s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f862t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f849g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f843a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f842D;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f851i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f850h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f845c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f857o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f847e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f848f;
        return charSequence != null ? charSequence : this.f847e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f860r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f857o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f841C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f866x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f866x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f866x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider actionProvider = this.f839A;
        return (actionProvider == null || !actionProvider.mo482g()) ? (this.f866x & 8) == 0 : (this.f866x & 8) == 0 && this.f839A.mo477b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f868z = view;
        this.f839A = null;
        if (view != null && view.getId() == -1 && (i = this.f843a) > 0) {
            view.setId(i);
        }
        this.f856n.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f852j == c2) {
            return this;
        }
        this.f852j = Character.toLowerCase(c2);
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f866x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f866x = i2;
        if (i != i2) {
            this.f856n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f866x;
        if ((i & 4) != 0) {
            this.f856n.setExclusiveItemChecked(this);
            return this;
        }
        int i2 = (z2 ? 2 : 0) | (i & (-3));
        this.f866x = i2;
        if (i != i2) {
            this.f856n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f866x |= 16;
        } else {
            this.f866x &= -17;
        }
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f855m = 0;
        this.f854l = drawable;
        this.f865w = true;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f861s = colorStateList;
        this.f863u = true;
        this.f865w = true;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f862t = mode;
        this.f864v = true;
        this.f865w = true;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f849g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f850h == c2) {
            return this;
        }
        this.f850h = c2;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f840B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f858p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f850h = c2;
        this.f852j = Character.toLowerCase(c3);
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f867y = i;
        this.f856n.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f847e = charSequence;
        this.f856n.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder = this.f857o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f848f = charSequence;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f866x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f866x = i2;
        if (i != i2) {
            this.f856n.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f847e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f859q = charSequence;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f860r = charSequence;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f852j == c2 && this.f853k == i) {
            return this;
        }
        this.f852j = Character.toLowerCase(c2);
        this.f853k = KeyEvent.normalizeMetaState(i);
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f850h == c2 && this.f851i == i) {
            return this;
        }
        this.f850h = c2;
        this.f851i = KeyEvent.normalizeMetaState(i);
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f850h = c2;
        this.f851i = KeyEvent.normalizeMetaState(i);
        this.f852j = Character.toLowerCase(c3);
        this.f853k = KeyEvent.normalizeMetaState(i2);
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f854l = null;
        this.f855m = i;
        this.f865w = true;
        this.f856n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f856n.getContext().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f856n.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f868z = viewInflate;
        this.f839A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f843a) > 0) {
            viewInflate.setId(i2);
        }
        this.f856n.onItemActionRequestChanged(this);
        return this;
    }
}
