package androidx.compose.p013ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class DelegatingNode extends Modifier.Node {

    /* JADX INFO: renamed from: t */
    public final int f18660t = NodeKindKt.m5945e(this);

    /* JADX INFO: renamed from: u */
    public Modifier.Node f18661u;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: N1 */
    public final void mo4866N1() {
        super.mo4866N1();
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4872W1(this.f17188j);
            if (!node.f17194s) {
                node.mo4866N1();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: O1 */
    public final void mo4867O1() {
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4867O1();
        }
        super.mo4867O1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: S1 */
    public final void mo4868S1() {
        super.mo4868S1();
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4868S1();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: T1 */
    public final void mo4869T1() {
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4869T1();
        }
        super.mo4869T1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: U1 */
    public final void mo4870U1() {
        super.mo4870U1();
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4870U1();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: V1 */
    public final void mo4871V1(Modifier.Node node) {
        this.f17181a = node;
        for (Modifier.Node node2 = this.f18661u; node2 != null; node2 = node2.f17186g) {
            node2.mo4871V1(node);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: W1 */
    public final void mo4872W1(NodeCoordinator nodeCoordinator) {
        this.f17188j = nodeCoordinator;
        for (Modifier.Node node = this.f18661u; node != null; node = node.f17186g) {
            node.mo4872W1(nodeCoordinator);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final DelegatableNode m5746X1(DelegatableNode delegatableNode) {
        Modifier.Node f17181a = delegatableNode.getF17181a();
        if (f17181a != delegatableNode) {
            Modifier.Node node = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node node2 = node != null ? node.f17185f : null;
            if (f17181a != this.f17181a || !Intrinsics.m18594b(node2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (f17181a.f17194s) {
                InlineClassHelperKt.m5597b("Cannot delegate to an already attached node");
            }
            f17181a.mo4871V1(this.f17181a);
            int i = this.f17183c;
            int iM5946f = NodeKindKt.m5946f(f17181a);
            f17181a.f17183c = iM5946f;
            int i2 = this.f17183c;
            int i3 = iM5946f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof LayoutModifierNode)) {
                InlineClassHelperKt.m5597b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + f17181a);
            }
            f17181a.f17186g = this.f18661u;
            this.f18661u = f17181a;
            f17181a.f17185f = this;
            m5748Z1(iM5946f | this.f17183c, false);
            if (this.f17194s) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo4872W1(this.f17188j);
                } else {
                    NodeChain nodeChain = DelegatableNodeKt.m5743g(this).f18721M;
                    this.f17181a.mo4872W1(null);
                    nodeChain.m5902h();
                }
                f17181a.mo4866N1();
                f17181a.mo4869T1();
                if (!f17181a.f17194s) {
                    InlineClassHelperKt.m5597b("autoInvalidateInsertedNode called on unattached node");
                }
                NodeKindKt.m5941a(f17181a, -1, 1);
            }
        }
        return delegatableNode;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m5747Y1(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.f18661u; node2 != null; node2 = node2.f17186g) {
            if (node2 == delegatableNode) {
                boolean z2 = node2.f17194s;
                if (z2) {
                    MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f18976a;
                    if (!z2) {
                        InlineClassHelperKt.m5597b("autoInvalidateRemovedNode called on unattached node");
                    }
                    NodeKindKt.m5941a(node2, -1, 2);
                    node2.mo4870U1();
                    node2.mo4867O1();
                }
                node2.mo4871V1(node2);
                node2.f17184d = 0;
                if (node == null) {
                    this.f18661u = node2.f17186g;
                } else {
                    node.f17186g = node2.f17186g;
                }
                node2.f17186g = null;
                node2.f17185f = null;
                int i = this.f17183c;
                int iM5946f = NodeKindKt.m5946f(this);
                m5748Z1(iM5946f, true);
                if (this.f17194s && (i & 2) != 0 && (iM5946f & 2) == 0) {
                    NodeChain nodeChain = DelegatableNodeKt.m5743g(this).f18721M;
                    this.f17181a.mo4872W1(null);
                    nodeChain.m5902h();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m5748Z1(int i, boolean z2) {
        Modifier.Node node;
        int i2 = this.f17183c;
        this.f17183c = i;
        if (i2 != i) {
            Modifier.Node node2 = this.f17181a;
            if (node2 == this) {
                this.f17184d = i;
            }
            if (this.f17194s) {
                Modifier.Node node3 = this;
                while (node3 != null) {
                    i |= node3.f17183c;
                    node3.f17183c = i;
                    if (node3 == node2) {
                        break;
                    } else {
                        node3 = node3.f17185f;
                    }
                }
                if (z2 && node3 == node2) {
                    i = NodeKindKt.m5946f(node2);
                    node2.f17183c = i;
                }
                int i3 = i | ((node3 == null || (node = node3.f17186g) == null) ? 0 : node.f17184d);
                while (node3 != null) {
                    i3 |= node3.f17183c;
                    node3.f17184d = i3;
                    node3 = node3.f17185f;
                }
            }
        }
    }
}
