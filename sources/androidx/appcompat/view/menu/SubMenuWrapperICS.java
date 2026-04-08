package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final SupportSubMenu f915e;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f915e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f915e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m446c(this.f915e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f915e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f915e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f915e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f915e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f915e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f915e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f915e.setIcon(drawable);
        return this;
    }
}
