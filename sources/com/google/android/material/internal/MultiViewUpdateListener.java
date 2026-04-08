package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        void onAnimationUpdate(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener listener, @NonNull View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14685a(ValueAnimator valueAnimator, View view) {
        setScale(valueAnimator, view);
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new C3892a(3), viewArr);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14686b(ValueAnimator valueAnimator, View view) {
        setTranslationY(valueAnimator, view);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14687c(ValueAnimator valueAnimator, View view) {
        setAlpha(valueAnimator, view);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14688d(ValueAnimator valueAnimator, View view) {
        setTranslationX(valueAnimator, view);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new C3892a(1), viewArr);
    }

    private static void setAlpha(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static void setScale(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    private static void setTranslationX(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static void setTranslationY(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new C3892a(0), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new C3892a(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view);
        }
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new C3892a(3), collection);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new C3892a(1), collection);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new C3892a(0), collection);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new C3892a(2), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener listener, @NonNull Collection<View> collection) {
        this.listener = listener;
        this.views = (View[]) collection.toArray(new View[0]);
    }
}
