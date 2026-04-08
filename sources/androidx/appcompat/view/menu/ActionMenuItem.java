package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ActionMenuItem implements SupportMenuItem {

    /* JADX INFO: renamed from: a */
    public CharSequence f728a;

    /* JADX INFO: renamed from: b */
    public CharSequence f729b;

    /* JADX INFO: renamed from: c */
    public Intent f730c;

    /* JADX INFO: renamed from: d */
    public char f731d;

    /* JADX INFO: renamed from: e */
    public int f732e;

    /* JADX INFO: renamed from: f */
    public char f733f;

    /* JADX INFO: renamed from: g */
    public int f734g;

    /* JADX INFO: renamed from: h */
    public Drawable f735h;

    /* JADX INFO: renamed from: i */
    public Context f736i;

    /* JADX INFO: renamed from: j */
    public CharSequence f737j;

    /* JADX INFO: renamed from: k */
    public CharSequence f738k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f739l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f740m;

    /* JADX INFO: renamed from: n */
    public boolean f741n;

    /* JADX INFO: renamed from: o */
    public boolean f742o;

    /* JADX INFO: renamed from: p */
    public int f743p;

    @Override // androidx.core.internal.view.SupportMenuItem
    /* JADX INFO: renamed from: a */
    public final SupportMenuItem mo432a(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    /* JADX INFO: renamed from: b */
    public final ActionProvider mo433b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m434c() {
        Drawable drawable = this.f735h;
        if (drawable != null) {
            if (this.f741n || this.f742o) {
                this.f735h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f735h = drawableMutate;
                if (this.f741n) {
                    drawableMutate.setTintList(this.f739l);
                }
                if (this.f742o) {
                    this.f735h.setTintMode(this.f740m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f734g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f733f;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f737j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f735h;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f739l;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f740m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f730c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f732e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f731d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f728a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f729b;
        return charSequence != null ? charSequence : this.f728a;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f738k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f743p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f743p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f743p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f743p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f733f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f743p = (z2 ? 1 : 0) | (this.f743p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f743p = (z2 ? 2 : 0) | (this.f743p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f737j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f743p = (z2 ? 16 : 0) | (this.f743p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f735h = drawable;
        m434c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f739l = colorStateList;
        this.f741n = true;
        m434c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f740m = mode;
        this.f742o = true;
        m434c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f730c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f731d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f731d = c2;
        this.f733f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f728a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f729b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f738k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f743p = (this.f743p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f733f = Character.toLowerCase(c2);
        this.f734g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f737j = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f731d = c2;
        this.f732e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f728a = this.f736i.getResources().getString(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f738k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f735h = this.f736i.getDrawable(i);
        m434c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f731d = c2;
        this.f732e = KeyEvent.normalizeMetaState(i);
        this.f733f = Character.toLowerCase(c3);
        this.f734g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
