package com.king.ultraswiperefresh.indicator.lottie;

import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class LottieRefreshIndicatorKt$LottieRefreshIndicator$1$1$1 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LottieAnimatable f43256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRefreshIndicatorKt$LottieRefreshIndicator$1$1$1(LottieAnimatable lottieAnimatable) {
        super(0);
        this.f43256a = lottieAnimatable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(((Number) this.f43256a.getF20325a()).floatValue());
    }
}
