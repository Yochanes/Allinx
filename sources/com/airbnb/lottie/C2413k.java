package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.airbnb.lottie.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2413k implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LottieDrawable f34466b;

    public /* synthetic */ C2413k(LottieDrawable lottieDrawable, int i) {
        this.f34465a = i;
        this.f34466b = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        LottieDrawable lottieDrawable = this.f34466b;
        switch (this.f34465a) {
            case 0:
                ThreadPoolExecutor threadPoolExecutor = LottieDrawable.f34057N;
                lottieDrawable.m12575i();
                break;
            default:
                ThreadPoolExecutor threadPoolExecutor2 = LottieDrawable.f34057N;
                lottieDrawable.m12573g();
                break;
        }
    }
}
