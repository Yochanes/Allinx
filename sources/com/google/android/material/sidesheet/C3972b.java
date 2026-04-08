package com.google.android.material.sidesheet;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3972b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SideSheetBehavior f42497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f42498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f42500d;

    public /* synthetic */ C3972b(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view) {
        this.f42497a = sideSheetBehavior;
        this.f42498b = marginLayoutParams;
        this.f42499c = i;
        this.f42500d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SideSheetBehavior.m14717c(this.f42497a, this.f42498b, this.f42499c, this.f42500d, valueAnimator);
    }
}
