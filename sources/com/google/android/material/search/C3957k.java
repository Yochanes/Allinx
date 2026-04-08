package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.google.android.material.search.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3957k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchViewAnimationHelper f42488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f42489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f42490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Rect f42491d;

    public /* synthetic */ C3957k(SearchViewAnimationHelper searchViewAnimationHelper, float f, float f2, Rect rect) {
        this.f42488a = searchViewAnimationHelper;
        this.f42489b = f;
        this.f42490c = f2;
        this.f42491d = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SearchViewAnimationHelper.m14710b(this.f42488a, this.f42489b, this.f42490c, this.f42491d, valueAnimator);
    }
}
