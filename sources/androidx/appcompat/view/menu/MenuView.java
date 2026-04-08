package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface MenuView {

    /* JADX INFO: compiled from: Proguard */
    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i);
    }

    void initialize(MenuBuilder menuBuilder);
}
