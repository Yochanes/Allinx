package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final SlotTable f16366a;

    /* JADX INFO: renamed from: b */
    public final int f16367b;

    /* JADX INFO: renamed from: c */
    public int f16368c;

    /* JADX INFO: renamed from: d */
    public final int f16369d;

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.f16366a = slotTable;
        this.f16367b = i2;
        this.f16368c = i;
        this.f16369d = slotTable.f16576j;
        if (slotTable.f16575i) {
            SlotTableKt.m4466f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16368c < this.f16367b;
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        SlotTable slotTable = this.f16366a;
        int i = slotTable.f16576j;
        int i2 = this.f16369d;
        if (i != i2) {
            SlotTableKt.m4466f();
        }
        int i3 = this.f16368c;
        this.f16368c = SlotTableKt.m4461a(i3, slotTable.f16569a) + i3;
        return new SlotTableGroup(slotTable, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
