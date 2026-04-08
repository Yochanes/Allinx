package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final SupportMenuItem f870d;

    /* JADX INFO: renamed from: e */
    public Method f871e;

    /* JADX INFO: compiled from: Proguard */
    public class ActionProviderWrapper extends ActionProvider implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: c */
        public ActionProvider.VisibilityListener f872c;

        /* JADX INFO: renamed from: d */
        public final android.view.ActionProvider f873d;

        public ActionProviderWrapper(android.view.ActionProvider actionProvider) {
            this.f873d = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: a */
        public final boolean mo476a() {
            return this.f873d.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: b */
        public final boolean mo477b() {
            return this.f873d.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: c */
        public final View mo478c() {
            return this.f873d.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: d */
        public final View mo479d(MenuItemImpl menuItemImpl) {
            return this.f873d.onCreateActionView(menuItemImpl);
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: e */
        public final boolean mo480e() {
            return this.f873d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: f */
        public final void mo481f(SubMenuBuilder subMenuBuilder) {
            this.f873d.onPrepareSubMenu(MenuItemWrapperICS.this.m447d(subMenuBuilder));
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: g */
        public final boolean mo482g() {
            return this.f873d.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        /* JADX INFO: renamed from: h */
        public final void mo483h(ActionProvider.VisibilityListener visibilityListener) {
            this.f872c = visibilityListener;
            this.f873d.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z2) {
            ActionProvider.VisibilityListener visibilityListener = this.f872c;
            if (visibilityListener != null) {
                MenuItemImpl menuItemImpl = MenuItemImpl.this;
                menuItemImpl.f856n.onItemVisibleChanged(menuItemImpl);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {

        /* JADX INFO: renamed from: a */
        public final android.view.CollapsibleActionView f875a;

        /* JADX WARN: Multi-variable type inference failed */
        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f875a = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        /* JADX INFO: renamed from: b */
        public final void mo417b() {
            this.f875a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        /* JADX INFO: renamed from: c */
        public final void mo418c() {
            this.f875a.onActionViewCollapsed();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f876a;

        public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f876a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f876a.onMenuItemActionCollapse(MenuItemWrapperICS.this.m446c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f876a.onMenuItemActionExpand(MenuItemWrapperICS.this.m446c(menuItem));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f878a;

        public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f878a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f878a.onMenuItemClick(MenuItemWrapperICS.this.m446c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f870d = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f870d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f870d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider actionProviderMo433b = this.f870d.mo433b();
        if (actionProviderMo433b instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) actionProviderMo433b).f873d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f870d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? (View) ((CollapsibleActionViewWrapper) actionView).f875a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f870d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f870d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f870d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f870d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f870d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f870d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f870d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f870d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f870d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f870d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f870d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f870d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f870d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m447d(this.f870d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f870d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f870d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f870d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f870d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f870d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f870d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f870d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f870d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f870d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapper actionProviderWrapper = new ActionProviderWrapper(actionProvider);
        if (actionProvider == null) {
            actionProviderWrapper = null;
        }
        this.f870d.mo432a(actionProviderWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f870d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f870d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f870d.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f870d.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f870d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f870d.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f870d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f870d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f870d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f870d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f870d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f870d.setOnActionExpandListener(onActionExpandListener != null ? new OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f870d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f870d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f870d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f870d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f870d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f870d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f870d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.f870d.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f870d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f870d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f870d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f870d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f870d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        SupportMenuItem supportMenuItem = this.f870d;
        supportMenuItem.setActionView(i);
        View actionView = supportMenuItem.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            supportMenuItem.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
