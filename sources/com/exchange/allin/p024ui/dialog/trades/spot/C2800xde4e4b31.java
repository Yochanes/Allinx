package com.exchange.allin.p024ui.dialog.trades.spot;

import com.exchange.allin.data.SpotTickerData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.spot.SpotDialogKt$LayoutMarket$lambda$107$lambda$106$lambda$105$lambda$98$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C2800xde4e4b31<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((SpotTickerData) obj2).getPrice()), Double.valueOf(((SpotTickerData) obj).getPrice()));
    }
}
