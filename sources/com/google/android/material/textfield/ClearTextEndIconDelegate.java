package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C3734R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;

    @NonNull
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;

    @NonNull
    private final TimeInterpolator animationScaleInterpolator;

    @Nullable
    private EditText editText;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private final View.OnClickListener onIconClickListener;

    /* JADX INFO: renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40051 extends AnimatorListenerAdapter {
        public C40051() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40062 extends AnimatorListenerAdapter {
        public C40062() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(false);
        }
    }

    public ClearTextEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new ViewOnClickListenerC4019a(this, 0);
        this.onFocusChangeListener = new ViewOnFocusChangeListenerC4020b(this, 0);
        this.animationFadeDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), C3734R.attr.motionDurationShort3, 100);
        this.animationScaleDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), C3734R.attr.motionDurationShort3, DEFAULT_ANIMATION_SCALE_DURATION);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), C3734R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.animationScaleInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), C3734R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14733a(ClearTextEndIconDelegate clearTextEndIconDelegate, View view) {
        clearTextEndIconDelegate.lambda$new$0(view);
    }

    private void animateIcon(boolean z2) {
        boolean z3 = this.endLayout.isEndIconVisible() == z2;
        if (z2 && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z3) {
                this.iconInAnim.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.iconInAnim.cancel();
        this.iconOutAnim.start();
        if (z3) {
            this.iconOutAnim.end();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14734b(ClearTextEndIconDelegate clearTextEndIconDelegate, View view, boolean z2) {
        clearTextEndIconDelegate.lambda$new$1(view, z2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14735c(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.lambda$getAlphaAnimator$3(valueAnimator);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14736d(ClearTextEndIconDelegate clearTextEndIconDelegate, ValueAnimator valueAnimator) {
        clearTextEndIconDelegate.lambda$getScaleAnimator$4(valueAnimator);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14737e(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        clearTextEndIconDelegate.lambda$tearDown$2();
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.animationFadeInterpolator);
        valueAnimatorOfFloat.setDuration(this.animationFadeDuration);
        valueAnimatorOfFloat.addUpdateListener(new C4021c(this, 0));
        return valueAnimatorOfFloat;
    }

    private ValueAnimator getScaleAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.animationScaleInterpolator);
        valueAnimatorOfFloat.setDuration(this.animationScaleDuration);
        valueAnimatorOfFloat.addUpdateListener(new C4021c(this, 1));
        return valueAnimatorOfFloat;
    }

    private void initAnimators() {
        ValueAnimator scaleAnimator = getScaleAnimator();
        ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.iconInAnim.addListener(new C40051());
        ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new C40062());
    }

    private /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(fFloatValue);
        this.endIconView.setScaleY(fFloatValue);
    }

    private /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        refreshIconState();
    }

    private /* synthetic */ void lambda$new$1(View view, boolean z2) {
        animateIcon(shouldBeVisible());
    }

    private /* synthetic */ void lambda$tearDown$2() {
        animateIcon(true);
    }

    private boolean shouldBeVisible() {
        EditText editText = this.editText;
        if (editText != null) {
            return (editText.hasFocus() || this.endIconView.hasFocus()) && this.editText.getText().length() > 0;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(@NonNull Editable editable) {
        if (this.endLayout.getSuffixText() != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconContentDescriptionResId() {
        return C3734R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconDrawableResId() {
        return C3734R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.editText = editText;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onSuffixVisibilityChanged(boolean z2) {
        if (this.endLayout.getSuffixText() == null) {
            return;
        }
        animateIcon(z2);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        initAnimators();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.post(new RunnableC4022d(this, 0));
        }
    }
}
