package com.exchange.allin.p024ui.page.market;

import com.exchange.allin.data.FuturesMarketState;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.MarketPageKt$LayoutChoice$2$4$invoke$lambda$36$lambda$35$lambda$25$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3294x8d9b5c8<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((FuturesMarketState) obj2).getAmount()), Double.valueOf(((FuturesMarketState) obj).getAmount()));
    }
}
