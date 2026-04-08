package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {
    static final float FADE_THROUGH_THRESHOLD = 0.35f;
    private float progressThreshold = FADE_THROUGH_THRESHOLD;

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40611 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ float val$endFraction;
        final /* synthetic */ float val$endValue;
        final /* synthetic */ float val$startFraction;
        final /* synthetic */ float val$startValue;
        final /* synthetic */ View val$view;

        public C40611(View view, float f, float f2, float f3, float f4) {
            this.val$view = view;
            this.val$startValue = f;
            this.val$endValue = f2;
            this.val$startFraction = f3;
            this.val$endFraction = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.val$view.setAlpha(TransitionUtils.lerp(this.val$startValue, this.val$endValue, this.val$startFraction, this.val$endFraction, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40622 extends AnimatorListenerAdapter {
        final /* synthetic */ float val$originalAlpha;
        final /* synthetic */ View val$view;

        public C40622(View view, float f) {
            this.val$view = view;
            this.val$originalAlpha = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$view.setAlpha(this.val$originalAlpha);
        }
    }

    private static Animator createFadeThroughAnimator(View view, float f, float f2, @FloatRange float f3, @FloatRange float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C40611(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C40622(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, 0.0f, alpha, this.progressThreshold, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, alpha, 0.0f, 0.0f, this.progressThreshold, alpha);
    }

    public float getProgressThreshold() {
        return this.progressThreshold;
    }

    public void setProgressThreshold(@FloatRange float f) {
        this.progressThreshold = f;
    }
}
