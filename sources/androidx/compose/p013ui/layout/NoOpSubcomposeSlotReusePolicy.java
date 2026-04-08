package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/NoOpSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {

    /* JADX INFO: renamed from: a */
    public static final NoOpSubcomposeSlotReusePolicy f18555a = new NoOpSubcomposeSlotReusePolicy();

    @Override // androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy
    /* JADX INFO: renamed from: a */
    public final void mo3058a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        slotIdsSet.clear();
    }

    @Override // androidx.compose.p013ui.layout.SubcomposeSlotReusePolicy
    /* JADX INFO: renamed from: b */
    public final boolean mo3059b(Object obj, Object obj2) {
        return false;
    }
}
