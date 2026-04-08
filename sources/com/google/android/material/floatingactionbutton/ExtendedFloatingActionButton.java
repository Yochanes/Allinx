package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C3734R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    private static final int HIDE = 1;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    private int animState;
    private boolean animateShowBeforeLayout;

    @NonNull
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;

    @NonNull
    private final MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;

    @NonNull
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final MotionStrategy showStrategy;

    @NonNull
    private final MotionStrategy shrinkStrategy;
    private static final int DEF_STYLE_RES = C3734R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> WIDTH = new C38606(Float.class, "width");
    static final Property<View, Float> HEIGHT = new C38617(Float.class, "height");
    static final Property<View, Float> PADDING_START = new C38628(Float.class, "paddingStart");
    static final Property<View, Float> PADDING_END = new C38639(Float.class, "paddingEnd");

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38551 implements Size {
        public C38551() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C38562 implements Size {
        public C38562() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
            return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this) + ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this) + (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C38573 implements Size {
        final /* synthetic */ Size val$wrapContentSize;

        public C38573(Size size) {
            this.val$wrapContentSize = size;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) != -1) {
                return (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -2) ? this.val$wrapContentSize.getHeight() : ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this);
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.val$wrapContentSize.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
            }
            return this.val$wrapContentSize.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 ? -2 : ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this));
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.val$wrapContentSize.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
            }
            return this.val$wrapContentSize.getWidth();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C38584 implements Size {
        final /* synthetic */ Size val$matchParentSize;
        final /* synthetic */ Size val$wrapContentSize;

        public C38584(Size size, Size size2) {
            this.val$matchParentSize = size;
            this.val$wrapContentSize = size2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
            return ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -1 ? this.val$matchParentSize.getHeight() : (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -2) ? this.val$wrapContentSize.getHeight() : ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == 0 ? -2 : ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this), ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) != 0 ? ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
            return ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == -1 ? this.val$matchParentSize.getWidth() : (ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == -2) ? this.val$wrapContentSize.getWidth() : ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C38595 extends AnimatorListenerAdapter {
        private boolean cancelled;
        final /* synthetic */ OnChangedCallback val$callback;
        final /* synthetic */ MotionStrategy val$strategy;

        public C38595(MotionStrategy motionStrategy, OnChangedCallback onChangedCallback) {
            this.val$strategy = motionStrategy;
            this.val$callback = onChangedCallback;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.cancelled = true;
            this.val$strategy.onAnimationCancel();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$strategy.onAnimationEnd();
            if (this.cancelled) {
                return;
            }
            this.val$strategy.onChange(this.val$callback);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.val$strategy.onAnimationStart(animator);
            this.cancelled = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C38606 extends Property<View, Float> {
        public C38606(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
            return get2(view);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f) {
            set2(view, f);
        }

        @NonNull
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7 */
    /* JADX INFO: compiled from: Proguard */
    public class C38617 extends Property<View, Float> {
        public C38617(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
            return get2(view);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f) {
            set2(view, f);
        }

        @NonNull
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8 */
    /* JADX INFO: compiled from: Proguard */
    public class C38628 extends Property<View, Float> {
        public C38628(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
            return get2(view);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f) {
            set2(view, f);
        }

        @NonNull
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return Float.valueOf(view.getPaddingStart());
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f) {
            int iIntValue = f.intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            view.setPaddingRelative(iIntValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9 */
    /* JADX INFO: compiled from: Proguard */
    public class C38639 extends Property<View, Float> {
        public C38639(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Float get(@NonNull View view) {
            return get2(view);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull View view, @NonNull Float f) {
            set2(view, f);
        }

        @NonNull
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(@NonNull View view) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return Float.valueOf(view.getPaddingEnd());
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(@NonNull View view, @NonNull Float f) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ChangeSizeStrategy extends BaseMotionStrategy {
        private final boolean extending;
        private final Size size;

        public ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z2) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.size = size;
            this.extending = z2;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @NonNull
        public AnimatorSet createAnimator() {
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.size.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.size.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValues3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), this.size.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValues4[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                propertyValuesHolder2.setFloatValues(extendedFloatingActionButton2.getPaddingEnd(), this.size.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z2 = this.extending;
                propertyValues5[0].setFloatValues(z2 ? 0.0f : 1.0f, z2 ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.createAnimator(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return this.extending ? C3734R.animator.mtrl_extended_fab_change_size_expand_motion_spec : C3734R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$602(ExtendedFloatingActionButton.this, false);
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.access$502(ExtendedFloatingActionButton.this, this.extending);
            ExtendedFloatingActionButton.access$602(ExtendedFloatingActionButton.this, true);
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.extending) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.access$502(ExtendedFloatingActionButton.this, this.extending);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.extending) {
                ExtendedFloatingActionButton.access$302(ExtendedFloatingActionButton.this, layoutParams.width);
                ExtendedFloatingActionButton.access$202(ExtendedFloatingActionButton.this, layoutParams.height);
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int paddingStart = this.size.getPaddingStart();
            int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
            int paddingEnd = this.size.getPaddingEnd();
            int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            extendedFloatingActionButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.extending == ExtendedFloatingActionButton.access$500(ExtendedFloatingActionButton.this) || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;

        @Nullable
        private OnChangedCallback internalAutoHideCallback;

        @Nullable
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        private static boolean isBottomSheet(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).f22912a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean shouldUpdateVisibility(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).f22917f == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z2 = this.autoShrinkEnabled;
            ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 3 : 0, z2 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            return getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.f22919h == 0) {
                layoutParams.f22919h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            return onDependentViewChanged(coordinatorLayout, (ExtendedFloatingActionButton) view, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return onLayoutChild(coordinatorLayout, (ExtendedFloatingActionButton) view, i);
        }

        public void setAutoHideEnabled(boolean z2) {
            this.autoHideEnabled = z2;
        }

        public void setAutoShrinkEnabled(boolean z2) {
            this.autoShrinkEnabled = z2;
        }

        @VisibleForTesting
        public void setInternalAutoHideCallback(@Nullable OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        @VisibleForTesting
        public void setInternalAutoShrinkCallback(@Nullable OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z2 = this.autoShrinkEnabled;
            ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 2 : 1, z2 ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3734R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(C3734R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.autoShrinkEnabled = typedArrayObtainStyledAttributes.getBoolean(C3734R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class HideStrategy extends BaseMotionStrategy {
        private boolean isCancelled;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C3734R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 0);
            if (this.isCancelled) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.isCancelled = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 1);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.access$900(ExtendedFloatingActionButton.this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C3734R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 0);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 2);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.access$800(ExtendedFloatingActionButton.this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$000(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.extendedPaddingStart;
    }

    public static /* synthetic */ int access$100(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.extendedPaddingEnd;
    }

    public static /* synthetic */ int access$200(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.originalHeight;
    }

    public static /* synthetic */ int access$202(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        extendedFloatingActionButton.originalHeight = i;
        return i;
    }

    public static /* synthetic */ int access$300(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.originalWidth;
    }

    public static /* synthetic */ int access$302(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        extendedFloatingActionButton.originalWidth = i;
        return i;
    }

    public static /* synthetic */ void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, int i, OnChangedCallback onChangedCallback) {
        extendedFloatingActionButton.performMotion(i, onChangedCallback);
    }

    public static /* synthetic */ boolean access$500(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isExtended;
    }

    public static /* synthetic */ boolean access$502(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z2) {
        extendedFloatingActionButton.isExtended = z2;
        return z2;
    }

    public static /* synthetic */ boolean access$602(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z2) {
        extendedFloatingActionButton.isTransforming = z2;
        return z2;
    }

    public static /* synthetic */ int access$702(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        extendedFloatingActionButton.animState = i;
        return i;
    }

    public static /* synthetic */ boolean access$800(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isOrWillBeShown();
    }

    public static /* synthetic */ boolean access$900(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isOrWillBeHidden();
    }

    private Size getSizeFromExtendStrategyType(int i) {
        C38562 c38562 = new C38562();
        C38573 c38573 = new C38573(c38562);
        return i != 1 ? i != 2 ? new C38584(c38573, c38562) : c38573 : c38562;
    }

    private boolean isOrWillBeHidden() {
        return getVisibility() == 0 ? this.animState == 1 : this.animState != 2;
    }

    private boolean isOrWillBeShown() {
        return getVisibility() != 0 ? this.animState == 2 : this.animState != 1;
    }

    private void performMotion(int i, @Nullable OnChangedCallback onChangedCallback) {
        MotionStrategy motionStrategy;
        if (i == 0) {
            motionStrategy = this.showStrategy;
        } else if (i == 1) {
            motionStrategy = this.hideStrategy;
        } else if (i == 2) {
            motionStrategy = this.shrinkStrategy;
        } else {
            if (i != 3) {
                throw new IllegalStateException(AbstractC0000a.m9f(i, "Unknown strategy type: "));
            }
            motionStrategy = this.extendStrategy;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = motionStrategy.createAnimator();
        animatorSetCreateAnimator.addListener(new C38595(motionStrategy, onChangedCallback));
        Iterator<Animator.AnimatorListener> it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            animatorSetCreateAnimator.addListener(it.next());
        }
        animatorSetCreateAnimator.start();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        return (isLaidOut() || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.extendStrategy.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.hideStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.showStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.addAnimationListener(animatorListener);
    }

    public void extend() {
        performMotion(3, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.collapsedSize;
        if (i >= 0) {
            return i;
        }
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.getMotionSpec();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.hideStrategy.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.showStrategy.getMotionSpec();
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.getMotionSpec();
    }

    public void hide() {
        performMotion(1, null);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.performNow();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.extendStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.hideStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.showStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
        this.animateShowBeforeLayout = z2;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.extendStrategy.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setExtended(boolean z2) {
        if (this.isExtended == z2) {
            return;
        }
        MotionStrategy motionStrategy = z2 ? this.extendStrategy : this.shrinkStrategy;
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideStrategy.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showStrategy.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.shrinkStrategy.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    public void show() {
        performMotion(0, null);
    }

    public void shrink() {
        performMotion(2, null);
    }

    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3734R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
        performMotion(3, onChangedCallback);
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
        performMotion(1, onChangedCallback);
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
        performMotion(0, onChangedCallback);
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
        performMotion(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.animState = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.changeVisibilityTracker = animatorTracker;
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.showStrategy = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C3734R.styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C3734R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C3734R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C3734R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C3734R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3734R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(C3734R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i3;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new C38551(), false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.setMotionSpec(motionSpecCreateFromAttribute);
        hideStrategy.setMotionSpec(motionSpecCreateFromAttribute2);
        changeSizeStrategy.setMotionSpec(motionSpecCreateFromAttribute3);
        changeSizeStrategy2.setMotionSpec(motionSpecCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
