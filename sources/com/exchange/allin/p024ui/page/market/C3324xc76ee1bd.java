package com.exchange.allin.p024ui.page.market;

import com.exchange.allin.data.SpotTickerData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.MarketPageKt$LayoutMarket$1$4$invoke$lambda$33$lambda$32$lambda$6$$inlined$sortedBy$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3324xc76ee1bd<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((SpotTickerData) obj).getAmount()), Double.valueOf(((SpotTickerData) obj2).getAmount()));
    }
}
