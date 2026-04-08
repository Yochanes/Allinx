package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final SlotTable f16580a;

    /* JADX INFO: renamed from: b */
    public final int f16581b;

    /* JADX INFO: renamed from: c */
    public final int f16582c;

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        this.f16580a = slotTable;
        this.f16581b = i;
        this.f16582c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        int i;
        ArrayList arrayList;
        int iM4465e;
        SlotTable slotTable = this.f16580a;
        if (slotTable.f16576j != this.f16582c) {
            SlotTableKt.m4466f();
        }
        HashMap map = slotTable.f16578o;
        GroupSourceInformation groupSourceInformation = null;
        int i2 = this.f16581b;
        if (map != null) {
            if (slotTable.f16575i) {
                ComposerKt.m4316c("use active SlotWriter to crate an anchor for location instead");
            }
            Anchor anchor = (i2 < 0 || i2 >= (i = slotTable.f16570b) || (iM4465e = SlotTableKt.m4465e((arrayList = slotTable.f16577n), i2, i)) < 0) ? null : (Anchor) arrayList.get(iM4465e);
            if (anchor != null) {
                groupSourceInformation = (GroupSourceInformation) map.get(anchor);
            }
        }
        return groupSourceInformation != null ? new SourceInformationGroupIterator(slotTable, i2, groupSourceInformation, new AnchoredGroupPath()) : new GroupIterator(slotTable, i2 + 1, slotTable.f16569a[(i2 * 5) + 3] + i2);
    }
}
