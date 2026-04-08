package com.airbnb.lottie;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.airbnb.lottie.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2411i implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LottieComposition f34461a;

    public /* synthetic */ CallableC2411i(LottieComposition lottieComposition) {
        this.f34461a = lottieComposition;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = LottieCompositionFactory.f34054a;
        return new LottieResult(this.f34461a);
    }
}
