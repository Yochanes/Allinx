package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    /* JADX INFO: renamed from: a */
    public final int mo3157a(int i, int i2) {
        long j = i;
        long j2 = 1;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        int i3 = (int) j3;
        long j4 = j + j2;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        return RangesKt.m18656c(i2, i3, (int) j4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PagerSnapDistanceMaxPages)) {
            return false;
        }
        ((PagerSnapDistanceMaxPages) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }
}
