package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {

    /* JADX INFO: renamed from: d */
    public final SupportMenu f893d;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f893d = supportMenu;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m446c(this.f893d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f893d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m446c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m447d(this.f893d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        SimpleArrayMap simpleArrayMap = this.f766b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f767c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
        this.f893d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f893d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m446c(this.f893d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m446c(this.f893d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f893d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f893d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f893d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f893d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f766b != null) {
            int i2 = 0;
            while (true) {
                SimpleArrayMap simpleArrayMap = this.f766b;
                if (i2 >= simpleArrayMap.f3884c) {
                    break;
                }
                if (((SupportMenuItem) simpleArrayMap.m2128j(i2)).getGroupId() == i) {
                    this.f766b.mo2129k(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f893d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f766b != null) {
            int i2 = 0;
            while (true) {
                SimpleArrayMap simpleArrayMap = this.f766b;
                if (i2 >= simpleArrayMap.f3884c) {
                    break;
                }
                if (((SupportMenuItem) simpleArrayMap.m2128j(i2)).getItemId() == i) {
                    this.f766b.mo2129k(i2);
                    break;
                }
                i2++;
            }
        }
        this.f893d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        this.f893d.setGroupCheckable(i, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        this.f893d.setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        this.f893d.setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f893d.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f893d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m446c(this.f893d.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m447d(this.f893d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m446c(this.f893d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m447d(this.f893d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m446c(this.f893d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m447d(this.f893d.addSubMenu(i, i2, i3, i4));
    }
}
