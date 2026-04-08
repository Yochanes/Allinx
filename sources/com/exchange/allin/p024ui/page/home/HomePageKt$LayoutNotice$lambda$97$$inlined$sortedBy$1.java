package com.exchange.allin.p024ui.page.home;

import com.exchange.allin.data.Announcement;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HomePageKt$LayoutNotice$lambda$97$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a(Integer.valueOf(((Announcement) obj).getSort()), Integer.valueOf(((Announcement) obj2).getSort()));
    }
}
