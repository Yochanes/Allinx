package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.value.LottieFrameInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "T", "", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class LottieDynamicProperty<T> {

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieDynamicProperty$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C24051 extends Lambda implements Function1<LottieFrameInfo<Object>, Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            LottieFrameInfo it = (LottieFrameInfo) obj;
            Intrinsics.m18599g(it, "it");
            return null;
        }
    }
}
