package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4044a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockHandView f42518a;

    public /* synthetic */ C4044a(ClockHandView clockHandView) {
        this.f42518a = clockHandView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ClockHandView.m14748a(this.f42518a, valueAnimator);
    }
}
