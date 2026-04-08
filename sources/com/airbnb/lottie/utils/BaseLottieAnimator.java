package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLottieAnimator extends ValueAnimator {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f34859a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f34860b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArraySet f34861c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public final void m12730a(boolean z2) {
        for (Animator.AnimatorListener animatorListener : this.f34860b) {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC2433a.m12773p(animatorListener, this, z2);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f34860b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f34861c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34859a.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public final void m12731b() {
        Iterator it = this.f34859a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f34860b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f34859a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f34860b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f34861c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f34859a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
