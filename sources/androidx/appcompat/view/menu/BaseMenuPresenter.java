package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class BaseMenuPresenter implements MenuPresenter {

    /* JADX INFO: renamed from: a */
    public Context f756a;

    /* JADX INFO: renamed from: b */
    public Context f757b;

    /* JADX INFO: renamed from: c */
    public MenuBuilder f758c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f759d;

    /* JADX INFO: renamed from: f */
    public MenuPresenter.Callback f760f;

    /* JADX INFO: renamed from: g */
    public int f761g;

    /* JADX INFO: renamed from: i */
    public int f762i;

    /* JADX INFO: renamed from: j */
    public MenuView f763j;

    /* JADX INFO: renamed from: n */
    public int f764n;

    /* JADX INFO: renamed from: a */
    public abstract void mo442a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    /* JADX INFO: renamed from: b */
    public boolean mo443b(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public View mo444c(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.f759d.inflate(this.f762i, viewGroup, false);
        mo442a(menuItemImpl, itemView);
        return (View) itemView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo445d(MenuItemImpl menuItemImpl) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.f764n;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f757b = context;
        LayoutInflater.from(context);
        this.f758c = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f760f;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.f760f;
        MenuBuilder menuBuilder = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.f758c;
        }
        return callback.mo315a(menuBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f763j;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f758c;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.flagActionItems();
            ArrayList<MenuItemImpl> visibleItems = this.f758c.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = visibleItems.get(i3);
                if (mo445d(menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewMo444c = mo444c(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewMo444c.setPressed(false);
                        viewMo444c.jumpDrawablesToCurrentState();
                    }
                    if (viewMo444c != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo444c.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo444c);
                        }
                        ((ViewGroup) this.f763j).addView(viewMo444c, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo443b(viewGroup, i)) {
                i++;
            }
        }
    }
}
