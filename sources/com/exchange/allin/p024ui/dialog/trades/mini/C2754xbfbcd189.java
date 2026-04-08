package com.exchange.allin.p024ui.dialog.trades.mini;

import com.exchange.allin.data.FuturesMarketState;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.mini.MiniFuturesDialogKt$LayoutChoice$lambda$40$lambda$39$lambda$38$lambda$32$$inlined$sortedBy$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C2754xbfbcd189<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((FuturesMarketState) obj).getChange()), Double.valueOf(((FuturesMarketState) obj2).getChange()));
    }
}
