package com.exchange.allin.utils;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.utils.NumberFormaterKt$_get_numFormatUnits_$lambda$27$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3558x61b85223<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a((Integer) ((Pair) obj2).f51426a, (Integer) ((Pair) obj).f51426a);
    }
}
