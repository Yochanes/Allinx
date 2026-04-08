package androidx.compose.p013ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    @Override // androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy
    /* JADX INFO: renamed from: a */
    public final void mo3058a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int i;
        MutableOrderedScatterSet mutableOrderedScatterSet = slotIdsSet.f18601a;
        if (mutableOrderedScatterSet.f3829g > 0) {
            long[] jArr = mutableOrderedScatterSet.f3825c;
            int i2 = mutableOrderedScatterSet.f3826d;
            while (i2 != Integer.MAX_VALUE && (i = mutableOrderedScatterSet.f3829g) > 0 && i != 0) {
                int i3 = (int) (jArr[i2] & 2147483647L);
                mutableOrderedScatterSet.m2073i(i2);
                i2 = i3;
            }
        }
    }

    @Override // androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy
    /* JADX INFO: renamed from: b */
    public final boolean mo3059b(Object obj, Object obj2) {
        return true;
    }
}
