package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ContextualFlowItemIterator implements Iterator<Measurable>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f6337a;

    /* JADX INFO: renamed from: c */
    public final Measurable m2760c(FlowLineInfo flowLineInfo) {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Measurable next() {
        float f = 0;
        return m2760c(new FlowLineInfo(f, f));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
