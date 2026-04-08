package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f803b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuBuilder f804a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context, attributeSet, f803b, R.attr.listViewStyle, 0);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayM704f.m706b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(tintTypedArrayM704f.m706b(1));
        }
        tintTypedArrayM704f.m709g();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    /* JADX INFO: renamed from: a */
    public final boolean mo461a(MenuItemImpl menuItemImpl) {
        return this.f804a.performItemAction(menuItemImpl, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(MenuBuilder menuBuilder) {
        this.f804a = menuBuilder;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo461a((MenuItemImpl) getAdapter().getItem(i));
    }
}
