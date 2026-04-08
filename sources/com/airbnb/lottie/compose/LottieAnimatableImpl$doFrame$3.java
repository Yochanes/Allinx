package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class LottieAnimatableImpl$doFrame$3 extends Lambda implements Function1<Long, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LottieAnimatableImpl f34345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$doFrame$3(LottieAnimatableImpl lottieAnimatableImpl, int i) {
        super(1);
        this.f34345a = lottieAnimatableImpl;
        this.f34346b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(LottieAnimatableImpl.m12630e(this.f34345a, this.f34346b, ((Number) obj).longValue()));
    }
}
