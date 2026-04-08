package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.airbnb.lottie.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2415m implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LottieDrawable f34468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f34469b;

    public /* synthetic */ C2415m(LottieDrawable lottieDrawable, float f) {
        this.f34468a = lottieDrawable;
        this.f34469b = f;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        ThreadPoolExecutor threadPoolExecutor = LottieDrawable.f34057N;
        this.f34468a.m12578l(this.f34469b);
    }
}
