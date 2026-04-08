package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import com.exchange.allin.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f768A;

    /* JADX INFO: renamed from: B */
    public MenuPresenter.Callback f769B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserver f770C;

    /* JADX INFO: renamed from: D */
    public PopupWindow.OnDismissListener f771D;

    /* JADX INFO: renamed from: E */
    public boolean f772E;

    /* JADX INFO: renamed from: b */
    public final Context f773b;

    /* JADX INFO: renamed from: c */
    public final int f774c;

    /* JADX INFO: renamed from: d */
    public final int f775d;

    /* JADX INFO: renamed from: f */
    public final boolean f776f;

    /* JADX INFO: renamed from: g */
    public final Handler f777g;

    /* JADX INFO: renamed from: s */
    public View f785s;

    /* JADX INFO: renamed from: t */
    public View f786t;

    /* JADX INFO: renamed from: u */
    public int f787u;

    /* JADX INFO: renamed from: v */
    public boolean f788v;

    /* JADX INFO: renamed from: w */
    public boolean f789w;

    /* JADX INFO: renamed from: x */
    public int f790x;

    /* JADX INFO: renamed from: y */
    public int f791y;

    /* JADX INFO: renamed from: i */
    public final ArrayList f778i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f779j = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener f780n = new ViewTreeObserverOnGlobalLayoutListenerC00891();

    /* JADX INFO: renamed from: o */
    public final View.OnAttachStateChangeListener f781o = new ViewOnAttachStateChangeListenerC00902();

    /* JADX INFO: renamed from: p */
    public final MenuItemHoverListener f782p = new C00913();

    /* JADX INFO: renamed from: q */
    public int f783q = 0;

    /* JADX INFO: renamed from: r */
    public int f784r = 0;

    /* JADX INFO: renamed from: z */
    public boolean f792z = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewTreeObserverOnGlobalLayoutListenerC00891 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC00891() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.mo448a()) {
                ArrayList arrayList = cascadingMenuPopup.f779j;
                if (arrayList.size() <= 0 || ((CascadingMenuInfo) arrayList.get(0)).f800a.f1306D) {
                    return;
                }
                View view = cascadingMenuPopup.f786t;
                if (view == null || !view.isShown()) {
                    cascadingMenuPopup.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CascadingMenuInfo) it.next()).f800a.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C00913 implements MenuItemHoverListener {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CascadingMenuInfo f796a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MenuItemImpl f797b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ MenuBuilder f798c;

            public AnonymousClass1(CascadingMenuInfo cascadingMenuInfo, MenuItemImpl menuItemImpl, MenuBuilder menuBuilder) {
                this.f796a = cascadingMenuInfo;
                this.f797b = menuItemImpl;
                this.f798c = menuBuilder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CascadingMenuInfo cascadingMenuInfo = this.f796a;
                if (cascadingMenuInfo != null) {
                    C00913 c00913 = C00913.this;
                    CascadingMenuPopup.this.f772E = true;
                    cascadingMenuInfo.f801b.close(false);
                    CascadingMenuPopup.this.f772E = false;
                }
                MenuItemImpl menuItemImpl = this.f797b;
                if (menuItemImpl.isEnabled() && menuItemImpl.hasSubMenu()) {
                    this.f798c.performItemAction(menuItemImpl, 4);
                }
            }
        }

        public C00913() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        /* JADX INFO: renamed from: c */
        public final void mo459c(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.f777g.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.f779j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).f801b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            cascadingMenuPopup.f777g.postAtTime(new AnonymousClass1(i2 < arrayList.size() ? (CascadingMenuInfo) arrayList.get(i2) : null, menuItemImpl, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        /* JADX INFO: renamed from: m */
        public final void mo460m(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            CascadingMenuPopup.this.f777g.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CascadingMenuInfo {

        /* JADX INFO: renamed from: a */
        public final MenuPopupWindow f800a;

        /* JADX INFO: renamed from: b */
        public final MenuBuilder f801b;

        /* JADX INFO: renamed from: c */
        public final int f802c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f800a = menuPopupWindow;
            this.f801b = menuBuilder;
            this.f802c = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(Context context, View view, int i, boolean z2) {
        this.f773b = context;
        this.f785s = view;
        this.f775d = i;
        this.f776f = z2;
        this.f787u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f774c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f777g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* JADX INFO: renamed from: a */
    public final boolean mo448a() {
        ArrayList arrayList = this.f779j;
        return arrayList.size() > 0 && ((CascadingMenuInfo) arrayList.get(0)).f800a.f1307E.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: b */
    public final void mo449b(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f773b);
        if (mo448a()) {
            m458l(menuBuilder);
        } else {
            this.f778i.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: d */
    public final void mo450d(View view) {
        if (this.f785s != view) {
            this.f785s = view;
            this.f784r = Gravity.getAbsoluteGravity(this.f783q, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.f779j;
        int size = arrayList.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) arrayList.toArray(new CascadingMenuInfo[size]);
            for (int i = size - 1; i >= 0; i--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i];
                if (cascadingMenuInfo.f800a.f1307E.isShowing()) {
                    cascadingMenuInfo.f800a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: e */
    public final void mo451e(boolean z2) {
        this.f792z = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: f */
    public final void mo452f(int i) {
        if (this.f783q != i) {
            this.f783q = i;
            this.f784r = Gravity.getAbsoluteGravity(i, this.f785s.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* JADX INFO: renamed from: g */
    public final ListView mo453g() {
        ArrayList arrayList = this.f779j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) AbstractC0000a.m8e(1, arrayList)).f800a.f1310c;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: h */
    public final void mo454h(int i) {
        this.f788v = true;
        this.f790x = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: i */
    public final void mo455i(PopupWindow.OnDismissListener onDismissListener) {
        this.f771D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: j */
    public final void mo456j(boolean z2) {
        this.f768A = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* JADX INFO: renamed from: k */
    public final void mo457k(int i) {
        this.f789w = true;
        this.f791y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
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
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m458l(MenuBuilder menuBuilder) {
        boolean z2;
        int i;
        int i2;
        CascadingMenuInfo cascadingMenuInfo;
        View childAt;
        int i3;
        int i4;
        int i5;
        int width;
        MenuItem item;
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f773b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        MenuAdapter menuAdapter2 = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.f776f, R.layout.abc_cascading_menu_item_layout);
        int i6 = 1;
        if (!mo448a() && this.f792z) {
            menuAdapter2.f832c = true;
        } else if (mo448a()) {
            int size = menuBuilder.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item2 = menuBuilder.getItem(i7);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            menuAdapter2.f832c = z2;
        }
        int iM484c = MenuPopup.m484c(menuAdapter2, context, this.f774c);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, null, this.f775d);
        menuPopupWindow.f1336H = this.f782p;
        menuPopupWindow.f1323u = this;
        menuPopupWindow.f1307E.setOnDismissListener(this);
        menuPopupWindow.f1322t = this.f785s;
        menuPopupWindow.f1319q = this.f784r;
        menuPopupWindow.f1306D = true;
        menuPopupWindow.f1307E.setFocusable(true);
        menuPopupWindow.f1307E.setInputMethodMode(2);
        menuPopupWindow.mo577n(menuAdapter2);
        menuPopupWindow.m663p(iM484c);
        menuPopupWindow.f1319q = this.f784r;
        ArrayList arrayList = this.f779j;
        if (arrayList.size() > 0) {
            cascadingMenuInfo = (CascadingMenuInfo) AbstractC0000a.m8e(1, arrayList);
            MenuBuilder menuBuilder2 = cascadingMenuInfo.f801b;
            int size2 = menuBuilder2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    item = null;
                    break;
                }
                item = menuBuilder2.getItem(i8);
                if (item.hasSubMenu() && menuBuilder == item.getSubMenu()) {
                    break;
                } else {
                    i8++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
                i2 = 0;
            } else {
                DropDownListView dropDownListView = cascadingMenuInfo.f800a.f1310c;
                ListAdapter adapter = dropDownListView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                int count = menuAdapter.getCount();
                int i9 = 0;
                i2 = 0;
                while (true) {
                    i = i6;
                    if (i9 >= count) {
                        i9 = -1;
                        break;
                    } else {
                        if (item == menuAdapter.m467c(i9)) {
                            break;
                        }
                        i9++;
                        i6 = i;
                    }
                }
                if (i9 != -1 && (firstVisiblePosition = (i9 + headersCount) - dropDownListView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView.getChildCount()) {
                    childAt = dropDownListView.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                menuPopupWindow.m669s();
                menuPopupWindow.m667q();
                DropDownListView dropDownListView2 = ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).f800a.f1310c;
                int[] iArr = new int[2];
                dropDownListView2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f786t.getWindowVisibleDisplayFrame(rect);
                if (this.f787u == i) {
                    i3 = (dropDownListView2.getWidth() + iArr[i2]) + iM484c > rect.right ? i2 : 1;
                } else if (iArr[i2] - iM484c < 0) {
                }
                int i10 = i3 == 1 ? 1 : i2;
                this.f787u = i3;
                if (Build.VERSION.SDK_INT >= 26) {
                    menuPopupWindow.f1322t = childAt;
                    i5 = i2;
                    i4 = i5;
                } else {
                    int[] iArr2 = new int[2];
                    this.f785s.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f784r & 7) == 5) {
                        iArr2[i2] = this.f785s.getWidth() + iArr2[i2];
                        iArr3[i2] = childAt.getWidth() + iArr3[i2];
                    }
                    i4 = iArr3[i2] - iArr2[i2];
                    i5 = iArr3[1] - iArr2[1];
                }
                if ((this.f784r & 5) != 5) {
                    width = i10 != 0 ? i4 + childAt.getWidth() : i4 - iM484c;
                    menuPopupWindow.f1313g = width;
                    menuPopupWindow.f1318p = true;
                    menuPopupWindow.f1317o = true;
                    menuPopupWindow.m660i(i5);
                } else if (i10 != 0) {
                    width = i4 + iM484c;
                    menuPopupWindow.f1313g = width;
                    menuPopupWindow.f1318p = true;
                    menuPopupWindow.f1317o = true;
                    menuPopupWindow.m660i(i5);
                } else {
                    iM484c = childAt.getWidth();
                    menuPopupWindow.f1313g = width;
                    menuPopupWindow.f1318p = true;
                    menuPopupWindow.f1317o = true;
                    menuPopupWindow.m660i(i5);
                }
            } else {
                if (this.f788v) {
                    menuPopupWindow.f1313g = this.f790x;
                }
                if (this.f789w) {
                    menuPopupWindow.m660i(this.f791y);
                }
                Rect rect2 = this.f880a;
                menuPopupWindow.f1305C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.f787u));
            menuPopupWindow.show();
            DropDownListView dropDownListView3 = menuPopupWindow.f1310c;
            dropDownListView3.setOnKeyListener(this);
            if (cascadingMenuInfo == null || !this.f768A || menuBuilder.getHeaderTitle() == null) {
                return;
            }
            boolean z3 = i2;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, dropDownListView3, z3);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z3);
            textView.setText(menuBuilder.getHeaderTitle());
            dropDownListView3.addHeaderView(frameLayout, null, z3);
            menuPopupWindow.show();
            return;
        }
        i = 1;
        i2 = 0;
        cascadingMenuInfo = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new CascadingMenuInfo(menuPopupWindow, menuBuilder, this.f787u));
        menuPopupWindow.show();
        DropDownListView dropDownListView32 = menuPopupWindow.f1310c;
        dropDownListView32.setOnKeyListener(this);
        if (cascadingMenuInfo == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        ArrayList arrayList = this.f779j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i)).f801b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((CascadingMenuInfo) arrayList.get(i2)).f801b.close(false);
        }
        CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) arrayList.remove(i);
        cascadingMenuInfo.f801b.removeMenuPresenter(this);
        boolean z3 = this.f772E;
        MenuPopupWindow menuPopupWindow = cascadingMenuInfo.f800a;
        if (z3) {
            menuPopupWindow.m668r();
            menuPopupWindow.f1307E.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f787u = ((CascadingMenuInfo) arrayList.get(size2 - 1)).f802c;
        } else {
            this.f787u = this.f785s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((CascadingMenuInfo) arrayList.get(0)).f801b.close(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f769B;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.f770C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f770C.removeGlobalOnLayoutListener(this.f780n);
            }
            this.f770C = null;
        }
        this.f786t.removeOnAttachStateChangeListener(this.f781o);
        ((MenuPopupHelper.C00931) this.f771D).onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        ArrayList arrayList = this.f779j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) arrayList.get(i);
            if (!cascadingMenuInfo.f800a.f1307E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.f801b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.f779j) {
            if (subMenuBuilder == cascadingMenuInfo.f801b) {
                cascadingMenuInfo.f800a.f1310c.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        mo449b(subMenuBuilder);
        MenuPresenter.Callback callback = this.f769B;
        if (callback != null) {
            callback.mo315a(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f769B = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (mo448a()) {
            return;
        }
        ArrayList arrayList = this.f778i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m458l((MenuBuilder) it.next());
        }
        arrayList.clear();
        View view = this.f785s;
        this.f786t = view;
        if (view != null) {
            boolean z2 = this.f770C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f770C = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f780n);
            }
            this.f786t.addOnAttachStateChangeListener(this.f781o);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z2) {
        Iterator it = this.f779j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((CascadingMenuInfo) it.next()).f800a.f1310c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnAttachStateChangeListenerC00902 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC00902() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.f770C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.f770C = view.getViewTreeObserver();
                }
                cascadingMenuPopup.f770C.removeGlobalOnLayoutListener(cascadingMenuPopup.f780n);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
