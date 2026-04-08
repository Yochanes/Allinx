package com.exchange.allin.p024ui.page.market;

import com.exchange.allin.data.SpotTickerData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.MarketPageKt$LayoutMemes$1$3$invoke$lambda$16$lambda$15$lambda$9$$inlined$sortedBy$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3346x3980fa08<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((SpotTickerData) obj).getPrice()), Double.valueOf(((SpotTickerData) obj2).getPrice()));
    }
}
