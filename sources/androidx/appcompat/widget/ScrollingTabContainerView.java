package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionBarPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC01271 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class TabAdapter extends BaseAdapter {
        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                getItem(i);
                throw null;
            }
            getItem(i);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class TabClickListener implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((TabView) view).getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class TabView extends LinearLayout {
        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            throw null;
        }

        @Override // android.view.View
        public final void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy();
        actionBarPolicy.f657a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.f262a, com.exchange.allin.R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!actionBarPolicy.f657a.getResources().getBoolean(com.exchange.allin.R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(com.exchange.allin.R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(com.exchange.allin.R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TabView) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    public void setContentHeight(int i) {
        requestLayout();
    }

    public void setTabSelected(int i) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z2) {
    }
}
