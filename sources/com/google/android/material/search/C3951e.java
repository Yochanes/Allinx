package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: renamed from: com.google.android.material.search.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3951e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialShapeDrawable f42480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f42481b;

    public /* synthetic */ C3951e(View view, MaterialShapeDrawable materialShapeDrawable) {
        this.f42480a = materialShapeDrawable;
        this.f42481b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SearchBarAnimationHelper.m14698c(this.f42480a, this.f42481b, valueAnimator);
    }
}
