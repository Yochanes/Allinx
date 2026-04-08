package com.exchange.allin.p024ui.page.futures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class FuturesViewModel$startFundingRateCountdown$1$1$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public static final FuturesViewModel$startFundingRateCountdown$1$1$2 f39180a = new FuturesViewModel$startFundingRateCountdown$1$1$2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        ((Number) obj).longValue();
        return Unit.f51459a;
    }
}
