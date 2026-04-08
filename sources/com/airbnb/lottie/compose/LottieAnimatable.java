package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface LottieAnimatable extends LottieAnimationState {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: k */
    Object mo12628k(LottieComposition lottieComposition, float f, boolean z2, Continuation continuation);

    /* JADX INFO: renamed from: s */
    Object mo12629s(LottieComposition lottieComposition, int i, int i2, boolean z2, float f, LottieClipSpec lottieClipSpec, float f2, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation);
}
