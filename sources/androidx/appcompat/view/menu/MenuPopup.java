package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class MenuPopup implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f880a;

    /* JADX INFO: renamed from: c */
    public static int m484c(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo449b(MenuBuilder menuBuilder);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo450d(View view);

    /* JADX INFO: renamed from: e */
    public abstract void mo451e(boolean z2);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo452f(int i);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo454h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo455i(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: j */
    public abstract void mo456j(boolean z2);

    /* JADX INFO: renamed from: k */
    public abstract void mo457k(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter) listAdapter).f830a.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof CascadingMenuPopup) ? 0 : 4);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
    }
}
