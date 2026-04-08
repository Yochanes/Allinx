package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class MenuAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuBuilder f830a;

    /* JADX INFO: renamed from: b */
    public int f831b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f832c;

    /* JADX INFO: renamed from: d */
    public final boolean f833d;

    /* JADX INFO: renamed from: f */
    public final LayoutInflater f834f;

    /* JADX INFO: renamed from: g */
    public final int f835g;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f833d = z2;
        this.f834f = layoutInflater;
        this.f830a = menuBuilder;
        this.f835g = i;
        m466a();
    }

    /* JADX INFO: renamed from: a */
    public final void m466a() {
        MenuBuilder menuBuilder = this.f830a;
        MenuItemImpl expandedItem = menuBuilder.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = menuBuilder.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f831b = i;
                    return;
                }
            }
        }
        this.f831b = -1;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItemImpl m467c(int i) {
        MenuBuilder menuBuilder = this.f830a;
        ArrayList<MenuItemImpl> nonActionItems = this.f833d ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        int i2 = this.f831b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        MenuBuilder menuBuilder = this.f830a;
        return this.f831b < 0 ? (this.f833d ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return m467c(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f834f.inflate(this.f835g, viewGroup, false);
        }
        int i2 = m467c(i).f844b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f830a.isGroupDividerEnabled() && i2 != (i3 >= 0 ? m467c(i3).f844b : i2));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f832c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(m467c(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m466a();
        super.notifyDataSetChanged();
    }
}
