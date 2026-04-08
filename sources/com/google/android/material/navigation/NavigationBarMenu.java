package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public final class NavigationBarMenu extends MenuBuilder {
    private final int maxItemCount;

    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItemAddInternal).m474f(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM23t = AbstractC0000a.m23t("Maximum number of items supported by ", simpleName, " is ");
        sbM23t.append(this.maxItemCount);
        sbM23t.append(". Limit can be checked with ");
        sbM23t.append(simpleName);
        sbM23t.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM23t.toString());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
