package com.exchange.allin.p024ui.page.assets.account;

import com.exchange.allin.data.SpotAsset;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.assets.account.AssetsAccountPageKt$AssetsAccountPage$1$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3008xa9b453<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Double.valueOf(((SpotAsset) obj2).getTotal()), Double.valueOf(((SpotAsset) obj).getTotal()));
    }
}
