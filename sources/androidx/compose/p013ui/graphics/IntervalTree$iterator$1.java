package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.IntervalTree;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntervalTree$iterator$1 implements Iterator<Interval<Object>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public IntervalTree.Node f17606a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Interval<Object> next() {
        IntervalTree.Node node;
        IntervalTree.Node node2 = this.f17606a;
        IntervalTree.Node node3 = node2.f17603b;
        IntervalTree intervalTree = IntervalTree.this;
        if (node3 != intervalTree.f17601a) {
            node3.getClass();
            node = node3;
            while (true) {
                IntervalTree.Node node4 = node.f17602a;
                if (node4 == IntervalTree.this.f17601a) {
                    break;
                }
                node = node4;
            }
        } else {
            IntervalTree.Node node5 = node2.f17604c;
            IntervalTree.Node node6 = node2;
            while (node5 != intervalTree.f17601a && node6 == node5.f17603b) {
                node6 = node5;
                node5 = node5.f17604c;
            }
            node = node5;
        }
        this.f17606a = node;
        return node2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
