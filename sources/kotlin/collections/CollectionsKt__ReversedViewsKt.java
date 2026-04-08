package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    /* JADX INFO: renamed from: d */
    public static final int m18473d(int i, List list) {
        if (i >= 0 && i <= CollectionsKt.m18405F(list)) {
            return CollectionsKt.m18405F(list) - i;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Element index ", " must be in range [");
        sbM20q.append(new IntRange(0, CollectionsKt.m18405F(list), 1));
        sbM20q.append("].");
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }

    /* JADX INFO: renamed from: e */
    public static final int m18474e(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Position index ", " must be in range [");
        sbM20q.append(new IntRange(0, list.size(), 1));
        sbM20q.append("].");
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }
}
