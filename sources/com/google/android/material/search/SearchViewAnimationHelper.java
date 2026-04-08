package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final MaterialMainContainerBackHelper backHelper;

    @Nullable
    private AnimatorSet backProgressAnimatorSet;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    /* JADX INFO: renamed from: com.google.android.material.search.SearchViewAnimationHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C39421 extends AnimatorListenerAdapter {
        public C39421() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).requestFocusAndShowKeyboardIfNeeded();
            }
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.access$100(SearchViewAnimationHelper.this).setVisibility(0);
            SearchViewAnimationHelper.access$300(SearchViewAnimationHelper.this).stopOnLoadAnimation();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchViewAnimationHelper$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C39432 extends AnimatorListenerAdapter {
        public C39432() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchViewAnimationHelper.access$100(SearchViewAnimationHelper.this).setVisibility(8);
            if (!SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).clearFocusAndHideKeyboard();
            }
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchViewAnimationHelper$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C39443 extends AnimatorListenerAdapter {
        public C39443() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).requestFocusAndShowKeyboardIfNeeded();
            }
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.access$100(SearchViewAnimationHelper.this).setVisibility(0);
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchViewAnimationHelper$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C39454 extends AnimatorListenerAdapter {
        public C39454() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchViewAnimationHelper.access$100(SearchViewAnimationHelper.this).setVisibility(8);
            if (!SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).clearFocusAndHideKeyboard();
            }
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.access$000(SearchViewAnimationHelper.this).setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchViewAnimationHelper$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C39465 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$show;

        public C39465(boolean z2) {
            this.val$show = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchViewAnimationHelper.access$200(SearchViewAnimationHelper.this, this.val$show ? 1.0f : 0.0f);
            SearchViewAnimationHelper.access$100(SearchViewAnimationHelper.this).resetClipBoundsAndCornerRadius();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.access$200(SearchViewAnimationHelper.this, this.val$show ? 0.0f : 1.0f);
        }
    }

    public SearchViewAnimationHelper(SearchView searchView) {
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.backHelper = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14709a(SearchViewAnimationHelper searchViewAnimationHelper) {
        searchViewAnimationHelper.lambda$startShowAnimationTranslate$1();
    }

    public static /* synthetic */ SearchView access$000(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.searchView;
    }

    public static /* synthetic */ ClippableRoundedCornerLayout access$100(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.rootView;
    }

    public static /* synthetic */ void access$200(SearchViewAnimationHelper searchViewAnimationHelper, float f) {
        searchViewAnimationHelper.setContentViewsAlpha(f);
    }

    public static /* synthetic */ SearchBar access$300(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.searchBar;
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getFromTranslationXEnd(actionMenuView), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawableM7609d = DrawableCompat.m7609d(navigationIconButton.getDrawable());
        if (!this.searchView.isAnimatedNavigationIcon()) {
            setFullDrawableProgressIfNeeded(drawableM7609d);
        } else {
            addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, drawableM7609d);
            addFadeThroughDrawableAnimatorIfNeeded(animatorSet, drawableM7609d);
        }
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getFromTranslationXStart(navigationIconButton), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new C3948b((DrawerArrowDrawable) drawable, 1));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new C3948b((FadeThroughDrawable) drawable, 2));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14710b(SearchViewAnimationHelper searchViewAnimationHelper, float f, float f2, Rect rect, ValueAnimator valueAnimator) {
        searchViewAnimationHelper.lambda$getRootViewAnimator$2(f, f2, rect, valueAnimator);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14711c(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(drawerArrowDrawable, valueAnimator);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14712d(SearchViewAnimationHelper searchViewAnimationHelper) {
        searchViewAnimationHelper.lambda$startShowAnimationExpand$0();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14713e(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        lambda$addFadeThroughDrawableAnimatorIfNeeded$4(fadeThroughDrawable, valueAnimator);
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z2 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.searchView.isMenuItemsAnimated()) {
            valueAnimatorOfFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.dummyToolbar), ToolbarUtils.getActionMenuView(this.toolbar)));
        }
        return valueAnimatorOfFloat;
    }

    private AnimatorSet getButtonsProgressAnimator(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z2 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getButtonsTranslationAnimator(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        addActionMenuViewAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z2 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getClearButtonAnimator(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z2 ? SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS : HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS);
        valueAnimatorOfFloat.setStartDelay(z2 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.clearButton));
        return valueAnimatorOfFloat;
    }

    private Animator getContentAlphaAnimator(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z2 ? 150L : HIDE_CONTENT_ALPHA_DURATION_MS);
        valueAnimatorOfFloat.setStartDelay(z2 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.divider, this.contentContainer));
        return valueAnimatorOfFloat;
    }

    private Animator getContentAnimator(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getContentAlphaAnimator(z2), getDividerAnimator(z2), getContentScaleAnimator(z2));
        return animatorSet;
    }

    private Animator getContentScaleAnimator(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CONTENT_FROM_SCALE, 1.0f);
        valueAnimatorOfFloat.setDuration(z2 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.contentContainer));
        return valueAnimatorOfFloat;
    }

    private Animator getDividerAnimator(boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.contentContainer.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z2 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.divider));
        return valueAnimatorOfFloat;
    }

    private Animator getDummyToolbarAnimator(boolean z2) {
        return getTranslationAnimator(z2, false, this.dummyToolbar);
    }

    private Animator getEditTextAnimator(boolean z2) {
        return getTranslationAnimator(z2, true, this.editText);
    }

    private AnimatorSet getExpandCollapseAnimatorSet(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.backProgressAnimatorSet == null) {
            animatorSet.playTogether(getButtonsProgressAnimator(z2), getButtonsTranslationAnimator(z2));
        }
        animatorSet.playTogether(getScrimAlphaAnimator(z2), getRootViewAnimator(z2), getClearButtonAnimator(z2), getContentAnimator(z2), getHeaderContainerAnimator(z2), getDummyToolbarAnimator(z2), getActionMenuViewsAlphaAnimator(z2), getEditTextAnimator(z2), getSearchPrefixAnimator(z2));
        animatorSet.addListener(new C39465(z2));
        return animatorSet;
    }

    private int getFromTranslationXEnd(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return ViewUtils.isLayoutRtl(this.searchBar) ? this.searchBar.getLeft() - marginEnd : (this.searchBar.getRight() - this.searchView.getWidth()) + marginEnd;
    }

    private int getFromTranslationXStart(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        SearchBar searchBar = this.searchBar;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int paddingStart = searchBar.getPaddingStart();
        return ViewUtils.isLayoutRtl(this.searchBar) ? ((this.searchBar.getWidth() - this.searchBar.getRight()) + marginStart) - paddingStart : (this.searchBar.getLeft() - marginStart) + paddingStart;
    }

    private int getFromTranslationY() {
        return ((this.searchBar.getBottom() + this.searchBar.getTop()) / 2) - ((this.toolbarContainer.getBottom() + this.toolbarContainer.getTop()) / 2);
    }

    private Animator getHeaderContainerAnimator(boolean z2) {
        return getTranslationAnimator(z2, false, this.headerContainer);
    }

    private Animator getRootViewAnimator(boolean z2) {
        Rect initialHideToClipBounds = this.backHelper.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.backHelper.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.searchView);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.rootView, this.searchBar);
        }
        Rect rect = new Rect(initialHideFromClipBounds);
        float cornerSize = this.searchBar.getCornerSize();
        float fMax = Math.max(this.rootView.getCornerRadius(), this.backHelper.getExpandedCornerSize());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        valueAnimatorOfObject.addUpdateListener(new C3957k(this, cornerSize, fMax, rect));
        valueAnimatorOfObject.setDuration(z2 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    private Animator getScrimAlphaAnimator(boolean z2) {
        TimeInterpolator timeInterpolator = z2 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z2 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.scrim));
        return valueAnimatorOfFloat;
    }

    private Animator getSearchPrefixAnimator(boolean z2) {
        return getTranslationAnimator(z2, true, this.searchPrefix);
    }

    private AnimatorSet getTranslateAnimatorSet(boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getTranslationYAnimator());
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z2 ? SHOW_TRANSLATE_DURATION_MS : 300L);
        return animatorSet;
    }

    private Animator getTranslationAnimator(boolean z2, boolean z3, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z3 ? getFromTranslationXStart(view) : getFromTranslationXEnd(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z2 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m14689of(z2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getTranslationYAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.rootView.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.rootView));
        return valueAnimatorOfFloat;
    }

    private static void lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (drawerArrowDrawable.f650i != fFloatValue) {
            drawerArrowDrawable.f650i = fFloatValue;
            drawerArrowDrawable.invalidateSelf();
        }
    }

    private static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$4(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private /* synthetic */ void lambda$getRootViewAnimator$2(float f, float f2, Rect rect, ValueAnimator valueAnimator) {
        this.rootView.updateClipBoundsAndCornerRadius(rect, AnimationUtils.lerp(f, f2, valueAnimator.getAnimatedFraction()));
    }

    private /* synthetic */ void lambda$startShowAnimationExpand$0() {
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(true);
        expandCollapseAnimatorSet.addListener(new C39421());
        expandCollapseAnimatorSet.start();
    }

    private /* synthetic */ void lambda$startShowAnimationTranslate$1() {
        this.rootView.setTranslationY(r0.getHeight());
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(true);
        translateAnimatorSet.addListener(new C39443());
        translateAnimatorSet.start();
    }

    private void setActionMenuViewAlphaIfNeeded(float f) {
        ActionMenuView actionMenuView;
        if (!this.searchView.isMenuItemsAnimated() || (actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar)) == null) {
            return;
        }
        actionMenuView.setAlpha(f);
    }

    private void setContentViewsAlpha(float f) {
        this.clearButton.setAlpha(f);
        this.divider.setAlpha(f);
        this.contentContainer.setAlpha(f);
        setActionMenuViewAlphaIfNeeded(f);
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            if (drawerArrowDrawable.f650i != 1.0f) {
                drawerArrowDrawable.f650i = 1.0f;
                drawerArrowDrawable.invalidateSelf();
            }
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    private void setMenuItemsNotClickable(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                View childAt = actionMenuView.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void setUpDummyToolbarIfNeeded() {
        Menu menu = this.dummyToolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.searchBar.getMenuResId() == -1 || !this.searchView.isMenuItemsAnimated()) {
            this.dummyToolbar.setVisibility(8);
            return;
        }
        this.dummyToolbar.inflateMenu(this.searchBar.getMenuResId());
        setMenuItemsNotClickable(this.dummyToolbar);
        this.dummyToolbar.setVisibility(0);
    }

    private AnimatorSet startHideAnimationCollapse() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(false);
        expandCollapseAnimatorSet.addListener(new C39432());
        expandCollapseAnimatorSet.start();
        return expandCollapseAnimatorSet;
    }

    private AnimatorSet startHideAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
        translateAnimatorSet.addListener(new C39454());
        translateAnimatorSet.start();
        return translateAnimatorSet;
    }

    private void startShowAnimationExpand() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
        setUpDummyToolbarIfNeeded();
        this.editText.setText(this.searchBar.getText());
        EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
        this.rootView.setVisibility(4);
        this.rootView.post(new RunnableC3958l(this, 0));
    }

    private void startShowAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            SearchView searchView = this.searchView;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new RunnableC3953g(searchView, 3), 150L);
        }
        this.rootView.setVisibility(4);
        this.rootView.post(new RunnableC3958l(this, 1));
    }

    @RequiresApi
    public void cancelBackProgress() {
        this.backHelper.cancelBackProgress(this.searchBar);
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            AbstractC2433a.m12774q(animatorSet);
        }
        this.backProgressAnimatorSet = null;
    }

    @RequiresApi
    public void finishBackProgress() {
        this.backHelper.finishBackProgress(hide().getTotalDuration(), this.searchBar);
        if (this.backProgressAnimatorSet != null) {
            getButtonsTranslationAnimator(false).start();
            this.backProgressAnimatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }

    @CanIgnoreReturnValue
    public AnimatorSet hide() {
        return this.searchBar != null ? startHideAnimationCollapse() : startHideAnimationTranslate();
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    public void setSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    public void show() {
        if (this.searchBar != null) {
            startShowAnimationExpand();
        } else {
            startShowAnimationTranslate();
        }
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.backHelper.startBackProgress(backEventCompat, this.searchBar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @RequiresApi
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (backEventCompat.f60c <= 0.0f) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            AbstractC1329b.m6465o(animatorSet, (long) (backEventCompat.f60c * animatorSet.getDuration()));
            return;
        }
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        if (this.searchView.isAnimatedNavigationIcon()) {
            AnimatorSet buttonsProgressAnimator = getButtonsProgressAnimator(false);
            this.backProgressAnimatorSet = buttonsProgressAnimator;
            buttonsProgressAnimator.start();
            this.backProgressAnimatorSet.pause();
        }
    }
}
