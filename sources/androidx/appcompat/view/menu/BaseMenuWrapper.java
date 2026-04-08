package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class BaseMenuWrapper {

    /* JADX INFO: renamed from: a */
    public final Context f765a;

    /* JADX INFO: renamed from: b */
    public SimpleArrayMap f766b;

    /* JADX INFO: renamed from: c */
    public SimpleArrayMap f767c;

    public BaseMenuWrapper(Context context) {
        this.f765a = context;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItem m446c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f766b == null) {
            this.f766b = new SimpleArrayMap(0);
        }
        MenuItem menuItem2 = (MenuItem) this.f766b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f765a, supportMenuItem);
        this.f766b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* JADX INFO: renamed from: d */
    public final SubMenu m447d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f767c == null) {
            this.f767c = new SimpleArrayMap(0);
        }
        SubMenu subMenu2 = (SubMenu) this.f767c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f765a, supportSubMenu);
        this.f767c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
