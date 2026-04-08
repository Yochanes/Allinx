package com.google.android.material.slider;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.slider.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewTreeObserverOnScrollChangedListenerC3980a implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseSlider f42503a;

    public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC3980a(BaseSlider baseSlider) {
        this.f42503a = baseSlider;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        BaseSlider.m14719a(this.f42503a);
    }
}
