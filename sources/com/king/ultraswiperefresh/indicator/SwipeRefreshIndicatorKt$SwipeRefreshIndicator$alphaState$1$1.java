package com.king.ultraswiperefresh.indicator;

import com.king.ultraswiperefresh.UltraSwipeRefreshState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$alphaState$1$1 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f43246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UltraSwipeRefreshState f43247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$alphaState$1$1(boolean z2, UltraSwipeRefreshState ultraSwipeRefreshState) {
        super(0);
        this.f43246a = z2;
        this.f43247b = ultraSwipeRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UltraSwipeRefreshState ultraSwipeRefreshState = this.f43247b;
        float f = 0.0f;
        boolean z2 = this.f43246a;
        if ((!z2 && ultraSwipeRefreshState.m15380f() > 0.0f) || (z2 && ultraSwipeRefreshState.m15380f() < 0.0f)) {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
