package androidx.compose.p013ui.layout;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LayoutNodeKt;
import androidx.compose.p013ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.spatial.ThrottledCallbacks.Entry;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OnLayoutRectChangedNode extends Modifier.Node {

    /* JADX INFO: renamed from: t */
    public ThrottledCallbacks.Entry f18558t;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        m5663X1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        ThrottledCallbacks.Entry entry = this.f18558t;
        if (entry != null) {
            entry.m6322a();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m5663X1() {
        ThrottledCallbacks.Entry entry = this.f18558t;
        if (entry != null) {
            entry.m6322a();
        }
        LayoutNode layoutNodeM5743g = DelegatableNodeKt.m5743g(this);
        int i = layoutNodeM5743g.f18733b;
        ThrottledCallbacks throttledCallbacks = LayoutNodeKt.m5833a(layoutNodeM5743g).getRectManager().f19854b;
        throttledCallbacks.getClass();
        ThrottledCallbacks.Entry entry2 = throttledCallbacks.new Entry(i, 0L, this);
        MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.f19865a;
        Object objM1992b = mutableIntObjectMap.m1992b(i);
        if (objM1992b == null) {
            mutableIntObjectMap.m2028h(i, entry2);
            objM1992b = entry2;
        }
        ThrottledCallbacks.Entry entry3 = (ThrottledCallbacks.Entry) objM1992b;
        if (entry3 != entry2) {
            while (true) {
                ThrottledCallbacks.Entry entry4 = entry3.f19873d;
                if (entry4 == null) {
                    break;
                } else {
                    entry3 = entry4;
                }
            }
            entry3.f19873d = entry2;
        }
        this.f18558t = entry2;
    }
}
