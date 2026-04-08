package com.exchange.allin.p024ui.dialog.trades.flash;

import flash.kline.p031v1.FlashProto;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.flash.FlashDialogKt$LayoutMarket$lambda$32$lambda$31$lambda$30$lambda$27$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C2652x9a48f1e<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((FlashProto.TickerInfo) obj2).getChange()), Double.valueOf(((FlashProto.TickerInfo) obj).getChange()));
    }
}
