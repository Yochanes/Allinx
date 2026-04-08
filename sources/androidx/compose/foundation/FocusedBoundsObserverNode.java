package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "TraverseKey", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {

    /* JADX INFO: renamed from: u */
    public static final TraverseKey f4997u = new TraverseKey();

    /* JADX INFO: renamed from: t */
    public Function1 f4998t;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode$TraverseKey;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TraverseKey {
    }

    public FocusedBoundsObserverNode(Function1 function1) {
        this.f4998t = function1;
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    /* JADX INFO: renamed from: S */
    public final Object getF17362v() {
        return f4997u;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m2471X1(LayoutCoordinates layoutCoordinates) {
        this.f4998t.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.m5976a(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.m2471X1(layoutCoordinates);
        }
    }
}
