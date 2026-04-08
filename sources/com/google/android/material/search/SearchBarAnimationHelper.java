package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private boolean collapsing;

    @Nullable
    private Animator defaultCenterViewAnimator;
    private boolean expanding;

    @Nullable
    private Animator secondaryViewAnimator;
    private final Set<SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> expandAnimationListeners = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> collapseAnimationListeners = new LinkedHashSet();
    private boolean onLoadAnimationFadeInEnabled = true;
    private Animator runningExpandOrCollapseAnimator = null;

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C39341 extends AnimatorListenerAdapter {
        public C39341() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.access$000(SearchBarAnimationHelper.this, new C3949c(1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C39352 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$centerView;
        final /* synthetic */ Animator val$secondaryViewAnimator;

        public C39352(View view, Animator animator) {
            this.val$centerView = view;
            this.val$secondaryViewAnimator = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$centerView.setVisibility(8);
            this.val$secondaryViewAnimator.start();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C39363 extends AnimatorListenerAdapter {
        public C39363() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.access$202(SearchBarAnimationHelper.this, null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C39374 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBar val$searchBar;

        public C39374(SearchBar searchBar) {
            this.val$searchBar = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.access$102(SearchBarAnimationHelper.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.val$searchBar.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C39385 extends AnimatorListenerAdapter {
        public C39385() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.access$202(SearchBarAnimationHelper.this, null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBarAnimationHelper$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C39396 extends AnimatorListenerAdapter {
        final /* synthetic */ SearchBar val$searchBar;

        public C39396(SearchBar searchBar) {
            this.val$searchBar = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$searchBar.setVisibility(0);
            SearchBarAnimationHelper.access$302(SearchBarAnimationHelper.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.val$searchBar.stopOnLoadAnimation();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14696a(ValueAnimator valueAnimator, View view) {
        lambda$getFadeOutChildrenAnimator$2(view, valueAnimator);
    }

    public static /* synthetic */ void access$000(SearchBarAnimationHelper searchBarAnimationHelper, OnLoadAnimationInvocation onLoadAnimationInvocation) {
        searchBarAnimationHelper.dispatchOnLoadAnimation(onLoadAnimationInvocation);
    }

    public static /* synthetic */ boolean access$102(SearchBarAnimationHelper searchBarAnimationHelper, boolean z2) {
        searchBarAnimationHelper.expanding = z2;
        return z2;
    }

    public static /* synthetic */ Animator access$202(SearchBarAnimationHelper searchBarAnimationHelper, Animator animator) {
        searchBarAnimationHelper.runningExpandOrCollapseAnimator = animator;
        return animator;
    }

    public static /* synthetic */ boolean access$302(SearchBarAnimationHelper searchBarAnimationHelper, boolean z2) {
        searchBarAnimationHelper.collapsing = z2;
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14697b(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z2) {
        searchBarAnimationHelper.lambda$startExpandAnimation$0(searchBar, view, appBarLayout, z2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14698c(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        lambda$getExpandedViewBackgroundUpdateListener$1(materialShapeDrawable, view, valueAnimator);
    }

    private void dispatchOnLoadAnimation(OnLoadAnimationInvocation onLoadAnimationInvocation) {
        Iterator<SearchBar.OnLoadAnimationCallback> it = this.onLoadAnimationCallbacks.iterator();
        while (it.hasNext()) {
            onLoadAnimationInvocation.invoke(it.next());
        }
    }

    private Animator getCollapseAnimator(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(250L).addListener(new C39396(searchBar)).getCollapseAnimator();
    }

    private Animator getDefaultCenterViewAnimator(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.onLoadAnimationFadeInEnabled ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.onLoadAnimationFadeInEnabled ? ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    private List<View> getEndAnchoredViews(View view) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((!zIsLayoutRtl && (childAt instanceof ActionMenuView)) || (zIsLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private Animator getExpandAnimator(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(300L).addListener(new C39374(searchBar)).getExpandAnimator();
    }

    private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(getExpandedViewBackgroundUpdateListener(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(getEndAnchoredViews(view));
    }

    private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar searchBar, View view) {
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        materialShapeDrawableCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        materialShapeDrawableCreateWithElevationOverlay.setElevation(ViewCompat.m7792k(searchBar));
        return new C3951e(view, materialShapeDrawableCreateWithElevationOverlay);
    }

    private List<View> getFadeChildren(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    private Animator getFadeInChildrenAnimator(SearchBar searchBar) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.setDuration(COLLAPSE_FADE_IN_CHILDREN_DURATION_MS);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    private Animator getFadeOutChildrenAnimator(SearchBar searchBar, View view) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.addUpdateListener(new C3948b(view, 0));
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    private Animator getSecondaryActionMenuItemAnimator(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    private Animator getSecondaryViewAnimator(TextView textView, @Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(getTextViewAnimator(textView));
        if (view != null) {
            animatorSet.play(getSecondaryActionMenuItemAnimator(view));
        }
        return animatorSet;
    }

    private Animator getTextViewAnimator(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    private static void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        view.setBackground(materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    private static /* synthetic */ void lambda$getFadeOutChildrenAnimator$2(View view, ValueAnimator valueAnimator) {
        view.setAlpha(0.0f);
    }

    private /* synthetic */ void lambda$startExpandAnimation$0(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getFadeOutChildrenAnimator(searchBar, view), getExpandAnimator(searchBar, view, appBarLayout));
        animatorSet.addListener(new C39363());
        Iterator<AnimatorListenerAdapter> it = this.expandAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z2) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.collapseAnimationListeners.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.expandAnimationListeners.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.onLoadAnimationCallbacks.add(onLoadAnimationCallback);
    }

    public boolean isCollapsing() {
        return this.collapsing;
    }

    public boolean isExpanding() {
        return this.expanding;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.onLoadAnimationFadeInEnabled;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.collapseAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.expandAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.onLoadAnimationCallbacks.remove(onLoadAnimationCallback);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z2) {
        this.onLoadAnimationFadeInEnabled = z2;
    }

    public void startCollapseAnimation(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout, boolean z2) {
        Animator animator;
        if (isExpanding() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.collapsing = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getCollapseAnimator(searchBar, view, appBarLayout), getFadeInChildrenAnimator(searchBar));
        animatorSet.addListener(new C39385());
        Iterator<AnimatorListenerAdapter> it = this.collapseAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z2) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    public void startExpandAnimation(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout, boolean z2) {
        Animator animator;
        if (isCollapsing() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.expanding = true;
        view.setVisibility(4);
        view.post(new RunnableC3950d(this, searchBar, view, appBarLayout, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startOnLoadAnimation(SearchBar searchBar) {
        dispatchOnLoadAnimation(new C3949c(0));
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        Animator secondaryViewAnimator = getSecondaryViewAnimator(textView, secondaryActionMenuItemView);
        secondaryViewAnimator.addListener(new C39341());
        this.secondaryViewAnimator = secondaryViewAnimator;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new C3947a(secondaryViewAnimator));
            return;
        }
        if (centerView == 0) {
            secondaryViewAnimator.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator defaultCenterViewAnimator = getDefaultCenterViewAnimator(centerView);
        this.defaultCenterViewAnimator = defaultCenterViewAnimator;
        defaultCenterViewAnimator.addListener(new C39352(centerView, secondaryViewAnimator));
        defaultCenterViewAnimator.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopOnLoadAnimation(SearchBar searchBar) {
        Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }
}
