package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropNode;
import androidx.compose.p013ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p013ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p013ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DragAndDropTargetNode extends DelegatingNode {

    /* JADX INFO: renamed from: v */
    public DragAndDropTargetModifierNode f5294v;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        DragAndDropNode dragAndDropNodeM4934a = DragAndDropNodeKt.m4934a(new DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(this), null);
        m5746X1(dragAndDropNodeM4934a);
        this.f5294v = dragAndDropNodeM4934a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.f5294v;
        Intrinsics.m18596d(dragAndDropTargetModifierNode);
        m5747Y1(dragAndDropTargetModifierNode);
    }
}
