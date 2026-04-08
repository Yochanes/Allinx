package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.exchange.allin.R;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    private static final String TAG = "Toolbar";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    MenuBuilder.Callback mMenuBuilderCallback;
    final MenuHostHelper mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C01411 implements ActionMenuView.OnMenuItemClickListener {
        public C01411() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar toolbar = Toolbar.this;
            Iterator it = toolbar.mMenuHostHelper.f23376b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).mo7745a(menuItem)) {
                    return true;
                }
            }
            OnMenuItemClickListener onMenuItemClickListener = toolbar.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC01422 implements Runnable {
        public RunnableC01422() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$3 */
    /* JADX INFO: compiled from: Proguard */
    class C01433 implements MenuBuilder.Callback {
        public C01433() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            MenuBuilder.Callback callback = Toolbar.this.mMenuBuilderCallback;
            return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.mMenuView.f1014f;
            if (actionMenuPresenter == null || !actionMenuPresenter.m514f()) {
                Iterator it = toolbar.mMenuHostHelper.f23376b.iterator();
                while (it.hasNext()) {
                    ((MenuProvider) it.next()).mo7748d(menuBuilder);
                }
            }
            MenuBuilder.Callback callback = toolbar.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$4 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC01444 implements View.OnClickListener {
        public ViewOnClickListenerC01444() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m727a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m728b(@NonNull Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0150c(runnable);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m729c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m730d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1422a;

        /* JADX INFO: renamed from: b */
        public int f1423b;

        /* JADX INFO: renamed from: c */
        public int f1424c;

        /* JADX INFO: renamed from: d */
        public int f1425d;

        /* JADX INFO: renamed from: e */
        public int f1426e;

        /* JADX INFO: renamed from: f */
        public int f1427f;

        /* JADX INFO: renamed from: g */
        public int f1428g;

        /* JADX INFO: renamed from: h */
        public int f1429h;

        /* JADX INFO: renamed from: i */
        public int f1430i;

        /* JADX INFO: renamed from: j */
        public int f1431j;

        /* JADX INFO: renamed from: k */
        public int f1432k;

        /* JADX INFO: renamed from: l */
        public int f1433l;

        /* JADX INFO: renamed from: m */
        public int f1434m;

        /* JADX INFO: renamed from: n */
        public int f1435n;

        /* JADX INFO: renamed from: o */
        public int f1436o;

        /* JADX INFO: renamed from: p */
        public int f1437p;

        /* JADX INFO: renamed from: q */
        public int f1438q;

        /* JADX INFO: renamed from: r */
        public int f1439r;

        /* JADX INFO: renamed from: s */
        public int f1440s;

        /* JADX INFO: renamed from: t */
        public int f1441t;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1422a = AbstractC0151d.m791o(propertyMapper);
            this.f1423b = AbstractC0151d.m800x(propertyMapper);
            this.f1424c = AbstractC0151d.m801y(propertyMapper);
            this.f1425d = AbstractC0151d.m802z(propertyMapper);
            this.f1426e = AbstractC0151d.m773A(propertyMapper);
            this.f1427f = AbstractC0151d.m774B(propertyMapper);
            this.f1428g = AbstractC0151d.m775C(propertyMapper);
            this.f1429h = AbstractC0151d.m776D(propertyMapper);
            this.f1430i = AbstractC0151d.m789m(propertyMapper);
            this.f1431j = AbstractC0151d.m790n(propertyMapper);
            this.f1432k = AbstractC0151d.m792p(propertyMapper);
            this.f1433l = AbstractC0151d.m793q(propertyMapper);
            this.f1434m = AbstractC0151d.m794r(propertyMapper);
            this.f1435n = AbstractC0151d.m795s(propertyMapper);
            this.f1436o = AbstractC0151d.m796t(propertyMapper);
            this.f1437p = AbstractC0151d.m797u(propertyMapper);
            this.f1438q = AbstractC0151d.m798v(propertyMapper);
            this.f1439r = AbstractC0151d.m777a(propertyMapper);
            this.f1440s = AbstractC0151d.m788l(propertyMapper);
            this.f1441t = AbstractC0151d.m799w(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            Toolbar toolbar = (Toolbar) obj;
            AbstractC0148a.m752f(propertyReader, this.f1422a, toolbar.getCollapseContentDescription());
            AbstractC0148a.m751e(propertyReader, this.f1423b, toolbar.getCollapseIcon());
            AbstractC0020a.m53g(propertyReader, this.f1424c, toolbar.getContentInsetEnd());
            AbstractC0020a.m53g(propertyReader, this.f1425d, toolbar.getContentInsetEndWithActions());
            AbstractC0020a.m53g(propertyReader, this.f1426e, toolbar.getContentInsetLeft());
            AbstractC0020a.m53g(propertyReader, this.f1427f, toolbar.getContentInsetRight());
            AbstractC0020a.m53g(propertyReader, this.f1428g, toolbar.getContentInsetStart());
            AbstractC0020a.m53g(propertyReader, this.f1429h, toolbar.getContentInsetStartWithNavigation());
            AbstractC0148a.m751e(propertyReader, this.f1430i, toolbar.getLogo());
            AbstractC0148a.m752f(propertyReader, this.f1431j, toolbar.getLogoDescription());
            AbstractC0151d.m787k(propertyReader, this.f1432k, toolbar.getMenu());
            AbstractC0148a.m752f(propertyReader, this.f1433l, toolbar.getNavigationContentDescription());
            AbstractC0148a.m751e(propertyReader, this.f1434m, toolbar.getNavigationIcon());
            AbstractC0151d.m786j(propertyReader, this.f1435n, toolbar.getPopupTheme());
            AbstractC0148a.m752f(propertyReader, this.f1436o, toolbar.getSubtitle());
            AbstractC0148a.m752f(propertyReader, this.f1437p, toolbar.getTitle());
            AbstractC0020a.m53g(propertyReader, this.f1438q, toolbar.getTitleMarginBottom());
            AbstractC0020a.m53g(propertyReader, this.f1439r, toolbar.getTitleMarginEnd());
            AbstractC0020a.m53g(propertyReader, this.f1440s, toolbar.getTitleMarginStart());
            AbstractC0020a.m53g(propertyReader, this.f1441t, toolbar.getTitleMarginTop());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: b */
        public int f1442b;
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C01451();

        /* JADX INFO: renamed from: a */
        public int f1443a;

        /* JADX INFO: renamed from: b */
        public boolean f1444b;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C01451 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1443a = parcel.readInt();
            this.f1444b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1443a);
            parcel.writeInt(this.f1444b ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static int m712h(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: i */
    public static int m713i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m714a(int i, List list) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1442b == 0 && m726o(childAt)) {
                    int i3 = layoutParams.f288a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1442b == 0 && m726o(childAt2)) {
                int i5 = layoutParams2.f288a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.mMenuHostHelper;
        menuHostHelper.f23376b.add(menuProvider);
        menuHostHelper.f23375a.run();
    }

    /* JADX INFO: renamed from: b */
    public final void m715b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParamsGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParamsGenerateDefaultLayoutParams.f1442b = 1;
        if (!z2 || this.mExpandedActionView == null) {
            addView(view, layoutParamsGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m716c() {
        if (this.mContentInsets == null) {
            RtlSpacingHelper rtlSpacingHelper = new RtlSpacingHelper();
            rtlSpacingHelper.f1349a = 0;
            rtlSpacingHelper.f1350b = 0;
            rtlSpacingHelper.f1351c = Integer.MIN_VALUE;
            rtlSpacingHelper.f1352d = Integer.MIN_VALUE;
            rtlSpacingHelper.f1353e = 0;
            rtlSpacingHelper.f1354f = 0;
            rtlSpacingHelper.f1355g = false;
            rtlSpacingHelper.f1356h = false;
            this.mContentInsets = rtlSpacingHelper;
        }
    }

    @RestrictTo
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f1013d;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f1420b;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m717d() {
        m718e();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f1010a == null) {
            MenuBuilder menuBuilder = (MenuBuilder) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1014f) == null) {
            return;
        }
        actionMenuPresenter.m513e();
        ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.f1000z;
        if (actionButtonSubmenu == null || !actionButtonSubmenu.m486b()) {
            return;
        }
        actionButtonSubmenu.f889i.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m718e() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            C01433 c01433 = new C01433();
            actionMenuView2.f1015g = callback;
            actionMenuView2.f1016i = c01433;
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f288a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            m715b(this.mMenuView, false);
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f288a = (this.mButtonGravity & 112) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f1442b = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC01444());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m719f() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f288a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m720g(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f288a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.mGravity & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1355g ? rtlSpacingHelper.f1349a : rtlSpacingHelper.f1350b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1349a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1350b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1355g ? rtlSpacingHelper.f1350b : rtlSpacingHelper.f1349a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (menuBuilder = actionMenuView.f1010a) == null || !menuBuilder.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m717d();
        return this.mMenuView.getMenu();
    }

    @Nullable
    @VisibleForTesting
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        m717d();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @RestrictTo
    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.f1420b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1014f) == null || !actionMenuPresenter.m513e()) ? false : true;
    }

    public void inflateMenu(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @MainThread
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuHostHelper menuHostHelper = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = menuHostHelper.f23376b.iterator();
        while (it2.hasNext()) {
            ((MenuProvider) it2.next()).mo7747c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @RestrictTo
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1014f) == null) {
            return false;
        }
        return actionMenuPresenter.f985A != null || actionMenuPresenter.m514f();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1014f) == null || !actionMenuPresenter.m514f()) ? false : true;
    }

    @RestrictTo
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m721j(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    /* JADX INFO: renamed from: k */
    public final int m722k(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM720g = m720g(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM720g, iMax + measuredWidth, view.getMeasuredHeight() + iM720g);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: l */
    public final int m723l(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM720g = m720g(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM720g, iMax, view.getMeasuredHeight() + iM720g);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    /* JADX INFO: renamed from: m */
    public final int m724m(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: n */
    public final void m725n(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, Ints.MAX_POWER_OF_TWO);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m726o(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0293 A[LOOP:0: B:102:0x0291->B:103:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b1 A[LOOP:1: B:105:0x02af->B:106:0x02b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d8 A[LOOP:2: B:108:0x02d6->B:109:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032b A[LOOP:3: B:117:0x0329->B:118:0x032b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int iM722k;
        int iM723l;
        int iMax;
        boolean zM726o;
        boolean zM726o2;
        boolean z3;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int size4;
        int i14;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!m726o(this.mNavButtonView)) {
            iM722k = paddingLeft;
        } else {
            if (z4) {
                iM723l = m723l(this.mNavButtonView, i15, iMin, iArr);
                iM722k = paddingLeft;
                if (m726o(this.mCollapseButtonView)) {
                    if (z4) {
                        iM723l = m723l(this.mCollapseButtonView, iM723l, iMin, iArr);
                    } else {
                        iM722k = m722k(this.mCollapseButtonView, iM722k, iMin, iArr);
                    }
                }
                if (m726o(this.mMenuView)) {
                    if (z4) {
                        iM722k = m722k(this.mMenuView, iM722k, iMin, iArr);
                    } else {
                        iM723l = m723l(this.mMenuView, iM723l, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM722k);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iM723l));
                iMax = Math.max(iM722k, currentContentInsetLeft);
                int iMin2 = Math.min(iM723l, i15 - currentContentInsetRight);
                if (m726o(this.mExpandedActionView)) {
                    if (z4) {
                        iMin2 = m723l(this.mExpandedActionView, iMin2, iMin, iArr);
                    } else {
                        iMax = m722k(this.mExpandedActionView, iMax, iMin, iArr);
                    }
                }
                if (m726o(this.mLogoView)) {
                    if (z4) {
                        iMin2 = m723l(this.mLogoView, iMin2, iMin, iArr);
                    } else {
                        iMax = m722k(this.mLogoView, iMax, iMin, iArr);
                    }
                }
                zM726o = m726o(this.mTitleTextView);
                zM726o2 = m726o(this.mSubtitleTextView);
                if (zM726o) {
                    z3 = z4;
                    measuredHeight = 0;
                } else {
                    LayoutParams layoutParams = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    z3 = z4;
                    measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                if (!zM726o2) {
                    LayoutParams layoutParams2 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + measuredHeight;
                }
                if (!zM726o || zM726o2) {
                    TextView textView = !zM726o ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !zM726o2 ? this.mSubtitleTextView : this.mTitleTextView;
                    LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z5 = (zM726o && this.mTitleTextView.getMeasuredWidth() > 0) || (zM726o2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i5 = this.mGravity & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.mTitleMarginTop;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                        int i19 = this.mTitleMarginTop;
                        if (iMax2 < i18 + i19) {
                            iMax2 = i18 + i19;
                        } else {
                            int i20 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i21 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            int i22 = this.mTitleMarginBottom;
                            if (i20 < i21 + i22) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i22) - i20));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.mTitleMarginBottom) - i16;
                    }
                    if (z3) {
                        int i23 = (z5 ? this.mTitleMarginStart : 0) - iArr[1];
                        iMin2 -= Math.max(0, i23);
                        iArr[1] = Math.max(0, -i23);
                        if (zM726o) {
                            LayoutParams layoutParams5 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = iMin2 - this.mTitleTextView.getMeasuredWidth();
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.mTitleMarginEnd;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zM726o2) {
                            int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i24, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i24);
                            i9 = iMin2 - this.mTitleMarginEnd;
                        } else {
                            i9 = iMin2;
                        }
                        if (z5) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i25 = (z5 ? this.mTitleMarginStart : 0) - iArr[0];
                        iMax = Math.max(0, i25) + i17;
                        iArr[0] = Math.max(0, -i25);
                        if (zM726o) {
                            LayoutParams layoutParams6 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.mTitleMarginEnd;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zM726o2) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                            this.mSubtitleTextView.layout(iMax, i26, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i26);
                            i7 = measuredWidth3 + this.mTitleMarginEnd;
                        } else {
                            i7 = iMax;
                        }
                        if (z5) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                m714a(3, this.mTempViews);
                size = this.mTempViews.size();
                for (i10 = 0; i10 < size; i10++) {
                    iMax = m722k(this.mTempViews.get(i10), iMax, iMin, iArr);
                }
                m714a(5, this.mTempViews);
                size2 = this.mTempViews.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = m723l(this.mTempViews.get(i11), iMin2, iMin, iArr);
                }
                m714a(1, this.mTempViews);
                ArrayList<View> arrayList = this.mTempViews;
                int i27 = iArr[0];
                int i28 = iArr[1];
                size3 = arrayList.size();
                int i29 = i28;
                int i30 = i27;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view = arrayList.get(i12);
                    LayoutParams layoutParams7 = (LayoutParams) view.getLayoutParams();
                    ArrayList<View> arrayList2 = arrayList;
                    int i31 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i30;
                    int i32 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i29;
                    int iMax3 = Math.max(0, i31);
                    int iMax4 = Math.max(0, i32);
                    int iMax5 = Math.max(0, -i31);
                    int iMax6 = Math.max(0, -i32);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i12++;
                    i29 = iMax6;
                    i30 = iMax5;
                    arrayList = arrayList2;
                }
                i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i33 = measuredWidth4 + i13;
                if (i13 >= iMax) {
                    iMax = i33 > iMin2 ? i13 - (i33 - iMin2) : i13;
                }
                size4 = this.mTempViews.size();
                for (i14 = 0; i14 < size4; i14++) {
                    iMax = m722k(this.mTempViews.get(i14), iMax, iMin, iArr);
                }
                this.mTempViews.clear();
            }
            iM722k = m722k(this.mNavButtonView, paddingLeft, iMin, iArr);
        }
        iM723l = i15;
        if (m726o(this.mCollapseButtonView)) {
        }
        if (m726o(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM722k);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iM723l));
        iMax = Math.max(iM722k, currentContentInsetLeft2);
        int iMin22 = Math.min(iM723l, i15 - currentContentInsetRight2);
        if (m726o(this.mExpandedActionView)) {
        }
        if (m726o(this.mLogoView)) {
        }
        zM726o = m726o(this.mTitleTextView);
        zM726o2 = m726o(this.mSubtitleTextView);
        if (zM726o) {
        }
        if (!zM726o2) {
        }
        if (!zM726o) {
            if (!zM726o) {
            }
            if (!zM726o2) {
            }
            LayoutParams layoutParams32 = (LayoutParams) textView.getLayoutParams();
            LayoutParams layoutParams42 = (LayoutParams) textView2.getLayoutParams();
            int i162 = measuredHeight;
            if (zM726o) {
                i5 = this.mGravity & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z3) {
                }
            } else {
                i5 = this.mGravity & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z3) {
                }
            }
        }
        m714a(3, this.mTempViews);
        size = this.mTempViews.size();
        while (i10 < size) {
        }
        m714a(5, this.mTempViews);
        size2 = this.mTempViews.size();
        while (i11 < size2) {
        }
        m714a(1, this.mTempViews);
        ArrayList<View> arrayList3 = this.mTempViews;
        int i272 = iArr[0];
        int i282 = iArr[1];
        size3 = arrayList3.size();
        int i292 = i282;
        int i302 = i272;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i332 = measuredWidth42 + i13;
        if (i13 >= iMax) {
        }
        size4 = this.mTempViews.size();
        while (i14 < size4) {
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iM712h;
        int iMax;
        int iCombineMeasuredStates;
        int iM712h2;
        int iMax2;
        int iCombineMeasuredStates2;
        int iM713i;
        int[] iArr = this.mTempMargins;
        boolean z2 = ViewUtils.f1490a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (m726o(this.mNavButtonView)) {
            m725n(this.mNavButtonView, i, 0, i2, this.mMaxButtonHeight);
            iM712h = m712h(this.mNavButtonView) + this.mNavButtonView.getMeasuredWidth();
            iMax = Math.max(0, m713i(this.mNavButtonView) + this.mNavButtonView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            iM712h = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m726o(this.mCollapseButtonView)) {
            m725n(this.mCollapseButtonView, i, 0, i2, this.mMaxButtonHeight);
            iM712h = m712h(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredWidth();
            iMax = Math.max(iMax, m713i(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM712h);
        iArr[c3] = Math.max(0, currentContentInsetStart - iM712h);
        if (m726o(this.mMenuView)) {
            m725n(this.mMenuView, i, iMax3, i2, this.mMaxButtonHeight);
            iM712h2 = m712h(this.mMenuView) + this.mMenuView.getMeasuredWidth();
            iMax = Math.max(iMax, m713i(this.mMenuView) + this.mMenuView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            iM712h2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iM712h2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iM712h2);
        if (m726o(this.mExpandedActionView)) {
            iMax4 += m724m(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m713i(this.mExpandedActionView) + this.mExpandedActionView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m726o(this.mLogoView)) {
            iMax4 += m724m(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m713i(this.mLogoView) + this.mLogoView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).f1442b == 0 && m726o(childAt)) {
                iMax4 += m724m(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, m713i(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i7 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m726o(this.mTitleTextView)) {
            m724m(this.mTitleTextView, i, i5 + i7, i2, i6, iArr);
            int iM712h3 = m712h(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            int iM713i2 = m713i(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            iMax2 = iM712h3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iM713i = iM713i2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iM713i = 0;
        }
        if (m726o(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m724m(this.mSubtitleTextView, i, i5 + i7, i2, i6 + iM713i, iArr));
            iM713i += m713i(this.mSubtitleTextView) + this.mSubtitleTextView.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM713i);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.mCollapsible) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m726o(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        MenuBuilder menuBuilder = actionMenuView != null ? actionMenuView.f1010a : null;
        int i = savedState.f1443a;
        if (i != 0 && this.mExpandedMenuPresenter != null && menuBuilder != null && (menuItemFindItem = menuBuilder.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1444b) {
            removeCallbacks(this.mShowOverflowMenuRunnable);
            post(this.mShowOverflowMenuRunnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m716c();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        boolean z2 = i == 1;
        if (z2 == rtlSpacingHelper.f1355g) {
            return;
        }
        rtlSpacingHelper.f1355g = z2;
        if (!rtlSpacingHelper.f1356h) {
            rtlSpacingHelper.f1349a = rtlSpacingHelper.f1353e;
            rtlSpacingHelper.f1350b = rtlSpacingHelper.f1354f;
            return;
        }
        if (z2) {
            int i2 = rtlSpacingHelper.f1352d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rtlSpacingHelper.f1353e;
            }
            rtlSpacingHelper.f1349a = i2;
            int i3 = rtlSpacingHelper.f1351c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rtlSpacingHelper.f1354f;
            }
            rtlSpacingHelper.f1350b = i3;
            return;
        }
        int i4 = rtlSpacingHelper.f1351c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rtlSpacingHelper.f1353e;
        }
        rtlSpacingHelper.f1349a = i4;
        int i5 = rtlSpacingHelper.f1352d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rtlSpacingHelper.f1354f;
        }
        rtlSpacingHelper.f1350b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.f1420b) != null) {
            savedState.f1443a = menuItemImpl.f843a;
        }
        savedState.f1444b = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f1442b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.m7732c(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.mBackInvokedCallbackEnabled != z2) {
            this.mBackInvokedCallbackEnabled = z2;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(AppCompatResources.m395a(getContext(), i));
    }

    @RestrictTo
    public void setCollapsible(boolean z2) {
        this.mCollapsible = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m716c();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        rtlSpacingHelper.f1356h = false;
        if (i != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1353e = i;
            rtlSpacingHelper.f1349a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1354f = i2;
            rtlSpacingHelper.f1350b = i2;
        }
    }

    public void setContentInsetsRelative(int i, int i2) {
        m716c();
        this.mContentInsets.m682a(i, i2);
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(AppCompatResources.m395a(getContext(), i));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    @RestrictTo
    public void setMenu(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        m718e();
        MenuBuilder menuBuilder2 = this.mMenuView.f1010a;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            menuBuilder2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.f997w = true;
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    @RestrictTo
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f1015g = callback;
            actionMenuView.f1016i = callback2;
        }
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(AppCompatResources.m395a(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m719f();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        m717d();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1014f) == null || !actionMenuPresenter.m516h()) ? false : true;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM727a = Api33Impl.m727a(this);
            boolean z2 = hasExpandedActionView() && onBackInvokedDispatcherM727a != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z2 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = Api33Impl.m728b(new RunnableC0149b(this, 0));
                }
                Api33Impl.m729c(onBackInvokedDispatcherM727a, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM727a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            Api33Impl.m730d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new MenuHostHelper(new RunnableC0149b(this, 1));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new C01411();
        this.mShowOverflowMenuRunnable = new RunnableC01422();
        Context context2 = getContext();
        int[] iArr = androidx.appcompat.R.styleable.f286y;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context2, attributeSet, iArr, i, 0);
        ViewCompat.m7807z(this, context, iArr, attributeSet, tintTypedArrayM704f.f1413b, i);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        this.mTitleTextAppearance = typedArray.getResourceId(28, 0);
        this.mSubtitleTextAppearance = typedArray.getResourceId(19, 0);
        this.mGravity = typedArray.getInteger(0, this.mGravity);
        this.mButtonGravity = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m716c();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        rtlSpacingHelper.f1356h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1353e = dimensionPixelSize;
            rtlSpacingHelper.f1349a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1354f = dimensionPixelSize2;
            rtlSpacingHelper.f1350b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            rtlSpacingHelper.m682a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.mCollapseIcon = tintTypedArrayM704f.m706b(4);
        this.mCollapseDescription = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM706b = tintTypedArrayM704f.m706b(16);
        if (drawableM706b != null) {
            setNavigationIcon(drawableM706b);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM706b2 = tintTypedArrayM704f.m706b(11);
        if (drawableM706b2 != null) {
            setLogo(drawableM706b2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(tintTypedArrayM704f.m705a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(tintTypedArrayM704f.m705a(20));
        }
        if (typedArray.hasValue(14)) {
            inflateMenu(typedArray.getResourceId(14, 0));
        }
        tintTypedArrayM704f.m709g();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f1442b = 0;
        layoutParams.f288a = 8388627;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.mLogoView == null) {
                this.mLogoView = new AppCompatImageView(getContext());
            }
            if (!m721j(this.mLogoView)) {
                m715b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m721j(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m719f();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.m733a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m719f();
            if (!m721j(this.mNavButtonView)) {
                m715b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m721j(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m721j(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m721j(this.mSubtitleTextView)) {
                m715b(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && m721j(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m721j(this.mTitleTextView)) {
                m715b(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f288a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f263b);
        layoutParams.f288a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        layoutParams.f1442b = 0;
        return layoutParams;
    }

    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m7730a(menuProvider, lifecycleOwner);
    }

    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.m7731b(menuProvider, lifecycleOwner, state);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f1442b = 0;
            layoutParams3.f1442b = layoutParams2.f1442b;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar.LayoutParams) layoutParams);
            layoutParams4.f1442b = 0;
            return layoutParams4;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            LayoutParams layoutParams5 = new LayoutParams(marginLayoutParams);
            layoutParams5.f1442b = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = marginLayoutParams.bottomMargin;
            return layoutParams5;
        }
        LayoutParams layoutParams6 = new LayoutParams(layoutParams);
        layoutParams6.f1442b = 0;
        return layoutParams6;
    }

    /* JADX INFO: compiled from: Proguard */
    public class ExpandedActionViewMenuPresenter implements MenuPresenter {

        /* JADX INFO: renamed from: a */
        public MenuBuilder f1419a;

        /* JADX INFO: renamed from: b */
        public MenuItemImpl f1420b;

        public ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo418c();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.f1420b = null;
            toolbar.requestLayout();
            menuItemImpl.f841C = false;
            menuItemImpl.f856n.onItemsChanged(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = menuItemImpl.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.f1420b = menuItemImpl;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.f288a = (toolbar.mButtonGravity & 112) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.f1442b = 2;
                toolbar.mExpandedActionView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            toolbar.removeChildrenForExpandedActionView();
            toolbar.requestLayout();
            menuItemImpl.f841C = true;
            menuItemImpl.f856n.onItemsChanged(false);
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo417b();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f1419a;
            if (menuBuilder2 != null && (menuItemImpl = this.f1420b) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.f1419a = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void updateMenuView(boolean z2) {
            if (this.f1420b != null) {
                MenuBuilder menuBuilder = this.f1419a;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1419a.getItem(i) == this.f1420b) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f1419a, this.f1420b);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        }
    }
}
