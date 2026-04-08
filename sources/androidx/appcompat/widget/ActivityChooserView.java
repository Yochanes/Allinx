package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {

    /* JADX INFO: renamed from: a */
    public ActionProvider f1041a;

    /* JADX INFO: renamed from: b */
    public final DataSetObserver f1042b;

    /* JADX INFO: renamed from: c */
    public final ViewTreeObserver.OnGlobalLayoutListener f1043c;

    /* JADX INFO: renamed from: d */
    public ListPopupWindow f1044d;

    /* JADX INFO: renamed from: f */
    public PopupWindow.OnDismissListener f1045f;

    /* JADX INFO: renamed from: g */
    public boolean f1046g;

    /* JADX INFO: renamed from: i */
    public int f1047i;

    /* JADX INFO: renamed from: j */
    public boolean f1048j;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C01031 extends DataSetObserver {
        public C01031() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.getClass();
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewTreeObserverOnGlobalLayoutListenerC01042 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC01042() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.m525b()) {
                if (!activityChooserView.isShown()) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                ActionProvider actionProvider = activityChooserView.f1041a;
                if (actionProvider == null || (subUiVisibilityListener = actionProvider.f23346a) == null) {
                    return;
                }
                ((ActionMenuPresenter) subUiVisibilityListener).m515g(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$3 */
    /* JADX INFO: compiled from: Proguard */
    class C01053 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$4 */
    /* JADX INFO: compiled from: Proguard */
    class C01064 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: b */
        public final ShowableListMenu mo439b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: c */
        public final boolean mo440c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: d */
        public final boolean mo517d() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$5 */
    /* JADX INFO: compiled from: Proguard */
    class C01075 extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ActivityChooserViewAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ActivityChooserModel f1051a;

        /* JADX INFO: renamed from: b */
        public int f1052b;

        /* JADX INFO: renamed from: c */
        public boolean f1053c;

        /* JADX INFO: renamed from: d */
        public boolean f1054d;

        /* JADX INFO: renamed from: f */
        public boolean f1055f;

        @Override // android.widget.Adapter
        public final int getCount() {
            int size;
            ActivityChooserModel activityChooserModel = this.f1051a;
            synchronized (activityChooserModel.f1031a) {
                activityChooserModel.m522a();
                size = activityChooserModel.f1032b.size();
            }
            if (!this.f1053c) {
                this.f1051a.m523c();
            }
            int iMin = Math.min(size, this.f1052b);
            return this.f1055f ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1053c) {
                this.f1051a.m523c();
            }
            ActivityChooserModel activityChooserModel = this.f1051a;
            synchronized (activityChooserModel.f1031a) {
                activityChooserModel.m522a();
                throw null;
            }
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (this.f1055f && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    throw null;
                }
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != 1) {
                throw null;
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public static final int[] f1056a = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayM703e = TintTypedArray.m703e(context, attributeSet, f1056a);
            setBackgroundDrawable(tintTypedArrayM703e.m706b(0));
            tintTypedArrayM703e.m709g();
        }
    }

    public ActivityChooserView() {
        super(null, null, 0);
        this.f1042b = new C01031();
        this.f1043c = new ViewTreeObserverOnGlobalLayoutListenerC01042();
        this.f1047i = 4;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m524a() {
        if (m525b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1043c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m525b() {
        return getListPopupWindow().f1307E.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final void m526c(int i) {
        throw null;
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        throw null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f1044d == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1044d = listPopupWindow;
            listPopupWindow.mo577n(null);
            ListPopupWindow listPopupWindow2 = this.f1044d;
            listPopupWindow2.f1322t = this;
            listPopupWindow2.f1306D = true;
            listPopupWindow2.f1307E.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f1044d;
            listPopupWindow3.f1323u = null;
            listPopupWindow3.f1307E.setOnDismissListener(null);
        }
        return this.f1044d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        throw null;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        getContext().getString(i);
        throw null;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    public void setInitialActivityCount(int i) {
        this.f1047i = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1045f = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.f1041a = actionProvider;
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }
}
