package com.king.ultraswiperefresh.indicator.lottie;

import com.king.ultraswiperefresh.UltraSwipeFooterState;
import com.king.ultraswiperefresh.UltraSwipeHeaderState;
import com.king.ultraswiperefresh.UltraSwipeRefreshState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class LottieRefreshIndicatorKt$LottieRefreshIndicator$isPlaying$2$1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f43268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UltraSwipeRefreshState f43269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRefreshIndicatorKt$LottieRefreshIndicator$isPlaying$2$1(boolean z2, UltraSwipeRefreshState ultraSwipeRefreshState) {
        super(0);
        this.f43268a = z2;
        this.f43269b = ultraSwipeRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2 = this.f43268a;
        boolean z3 = false;
        UltraSwipeRefreshState ultraSwipeRefreshState = this.f43269b;
        if (!z2 ? ultraSwipeRefreshState.m15379e() == UltraSwipeHeaderState.f43015c : ultraSwipeRefreshState.m15378d() == UltraSwipeFooterState.f43011c) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
