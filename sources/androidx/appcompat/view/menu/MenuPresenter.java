package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface MenuPresenter {

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
        /* JADX INFO: renamed from: a */
        boolean mo315a(MenuBuilder menuBuilder);

        void onCloseMenu(MenuBuilder menuBuilder, boolean z2);
    }

    boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, MenuBuilder menuBuilder);

    void onCloseMenu(MenuBuilder menuBuilder, boolean z2);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder);

    void setCallback(Callback callback);

    void updateMenuView(boolean z2);
}
