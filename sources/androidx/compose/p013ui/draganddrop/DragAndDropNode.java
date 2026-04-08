package androidx.compose.p013ui.draganddrop;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {

    /* JADX INFO: renamed from: t */
    public final Function2 f17360t;

    /* JADX INFO: renamed from: u */
    public final Function1 f17361u;

    /* JADX INFO: renamed from: v */
    public final Object f17362v;

    /* JADX INFO: renamed from: w */
    public DragAndDropNode f17363w;

    /* JADX INFO: renamed from: x */
    public DragAndDropTarget f17364x;

    /* JADX INFO: renamed from: y */
    public long f17365y;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "DragAndDropTraversableKey", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class DragAndDropTraversableKey {

            /* JADX INFO: renamed from: a */
            public static final DragAndDropTraversableKey f17366a = new DragAndDropTraversableKey();
        }
    }

    public DragAndDropNode(Function2 function2, Function1 function1, int i) {
        function2 = (i & 1) != 0 ? null : function2;
        function1 = (i & 2) != 0 ? null : function1;
        this.f17360t = function2;
        this.f17361u = function1;
        this.f17362v = Companion.DragAndDropTraversableKey.f17366a;
        this.f17365y = 0L;
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: G1 */
    public final void mo2529G1(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(dragAndDropEvent);
        if (dragAndDropNode$onEnded$1.invoke(this) != TraversableNode.Companion.TraverseDescendantsAction.f19016a) {
            return;
        }
        TraversableNodeKt.m5978c(this, dragAndDropNode$onEnded$1);
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: M */
    public final boolean mo2530M(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.f17363w;
        if (dragAndDropNode != null) {
            return dragAndDropNode.mo2530M(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.f17364x;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.mo2530M(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: O */
    public final void mo2531O(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f17364x;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.mo2531O(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.f17363w;
        if (dragAndDropNode != null) {
            dragAndDropNode.mo2531O(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropSourceModifierNode
    /* JADX INFO: renamed from: Q0 */
    public final boolean mo4932Q0() {
        DelegatableNodeKt.m5744h(this).getDragAndDropManager().getClass();
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        this.f17364x = null;
        this.f17363w = null;
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: R */
    public final void mo3360R(DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.f17363w;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.m4935b(dragAndDropNode2, DragAndDrop_androidKt.m4936a(dragAndDropEvent))) {
            if (this.f17181a.f17194s) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.m5978c(this, new DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(objectRef, this, dragAndDropEvent));
                traversableNode = (TraversableNode) objectRef.f51659a;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            dragAndDropNode.mo2532h1(dragAndDropEvent);
            dragAndDropNode.mo3360R(dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.f17364x;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.mo2533v0(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.f17364x;
            if (dragAndDropTarget2 != null) {
                dragAndDropTarget2.mo2532h1(dragAndDropEvent);
                dragAndDropTarget2.mo3360R(dragAndDropEvent);
            }
            dragAndDropNode2.mo2533v0(dragAndDropEvent);
        } else if (!Intrinsics.m18594b(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                dragAndDropNode.mo2532h1(dragAndDropEvent);
                dragAndDropNode.mo3360R(dragAndDropEvent);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.mo2533v0(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.mo3360R(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.f17364x;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.mo3360R(dragAndDropEvent);
            }
        }
        this.f17363w = dragAndDropNode;
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    /* JADX INFO: renamed from: S, reason: from getter */
    public final Object getF17362v() {
        return this.f17362v;
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: h1 */
    public final void mo2532h1(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f17364x;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.mo2532h1(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.f17363w;
        if (dragAndDropNode != null) {
            dragAndDropNode.mo2532h1(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: m */
    public final void mo2547m(long j) {
        this.f17365y = j;
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropSourceModifierNode
    /* JADX INFO: renamed from: r */
    public final void mo4933r(long j) {
        if (this.f17360t == null) {
            InlineClassHelperKt.m5597b("Check failed.");
        }
        DelegatableNodeKt.m5744h(this).getDragAndDropManager().mo4928a(this, j);
    }

    @Override // androidx.compose.p013ui.draganddrop.DragAndDropTarget
    /* JADX INFO: renamed from: v0 */
    public final void mo2533v0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.f17364x;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.mo2533v0(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.f17363w;
        if (dragAndDropNode != null) {
            dragAndDropNode.mo2533v0(dragAndDropEvent);
        }
        this.f17363w = null;
    }
}
