package com.king.ultraswiperefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class UltraSwipeRefreshKt$UltraSwipeRefresh$1$3$vibrateState$1$1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UltraSwipeRefreshState f43093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltraSwipeRefreshKt$UltraSwipeRefresh$1$3$vibrateState$1$1(UltraSwipeRefreshState ultraSwipeRefreshState) {
        super(0);
        this.f43093a = ultraSwipeRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UltraSwipeRefreshState ultraSwipeRefreshState = this.f43093a;
        return Boolean.valueOf(ultraSwipeRefreshState.m15379e() == UltraSwipeHeaderState.f43014b || ultraSwipeRefreshState.m15378d() == UltraSwipeFooterState.f43010b);
    }
}
