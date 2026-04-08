package com.google.android.material.card;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.card.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3783a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCardViewHelper f42424a;

    public /* synthetic */ C3783a(MaterialCardViewHelper materialCardViewHelper) {
        this.f42424a = materialCardViewHelper;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialCardViewHelper.m14502a(this.f42424a, valueAnimator);
    }
}
