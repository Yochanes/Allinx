package com.google.android.material.carousel;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC3789a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CarouselLayoutManager f42425a;

    public /* synthetic */ ViewOnLayoutChangeListenerC3789a(CarouselLayoutManager carouselLayoutManager) {
        this.f42425a = carouselLayoutManager;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CarouselLayoutManager.m14504e(this.f42425a, view, i, i2, i3, i4, i5, i6, i7, i8);
    }
}
