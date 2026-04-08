package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.airbnb.lottie.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2423n implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LottieDrawable f34744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34745b;

    public /* synthetic */ C2423n(LottieDrawable lottieDrawable, int i) {
        this.f34744a = lottieDrawable;
        this.f34745b = i;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        ThreadPoolExecutor threadPoolExecutor = LottieDrawable.f34057N;
        this.f34744a.m12577k(this.f34745b);
    }
}
