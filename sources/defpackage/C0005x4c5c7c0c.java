package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: BottomModalDialogBuilderKt$BottomModalSearchSortListContent$lambda$11$lambda$10$lambda$9$$inlined$sortedBy$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0005x4c5c7c0c<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.m18545a((String) ((Pair) CollectionsKt.m18398B((List) obj)).f51426a, (String) ((Pair) CollectionsKt.m18398B((List) obj2)).f51426a);
    }
}
