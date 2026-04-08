package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropNode;
import androidx.compose.p013ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {

    /* JADX INFO: renamed from: v */
    public Function1 f5289v;

    /* JADX INFO: renamed from: w */
    public final DragAndDropSourceModifierNode f5290w;

    /* JADX INFO: renamed from: x */
    public PointerInputModifierNode f5291x;

    public DragAndDropSourceNode(Function1 function1) {
        this.f5289v = function1;
        DragAndDropNode dragAndDropNode = new DragAndDropNode(new DragAndDropSourceNode$dragAndDropModifierNode$1(this), null, 2);
        m5746X1(dragAndDropNode);
        this.f5290w = dragAndDropNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        if (this.f5290w.mo4932Q0()) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplM5574a = SuspendingPointerInputFilterKt.m5574a(new DragAndDropSourceNode$onAttach$1(this));
            m5746X1(suspendingPointerInputModifierNodeImplM5574a);
            this.f5291x = suspendingPointerInputModifierNodeImplM5574a;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        PointerInputModifierNode pointerInputModifierNode = this.f5291x;
        if (pointerInputModifierNode != null) {
            m5747Y1(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: m */
    public final void mo2547m(long j) {
        this.f5290w.mo2547m(j);
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: p */
    public final void mo2548p(LayoutCoordinates layoutCoordinates) {
        this.f5290w.mo2548p(layoutCoordinates);
    }
}
