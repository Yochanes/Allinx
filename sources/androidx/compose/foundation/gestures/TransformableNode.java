package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: v */
    public final Function1 f6101v = new TransformableNode$updatedCanPan$1(this);

    /* JADX INFO: renamed from: w */
    public final BufferedChannel f6102w = ChannelKt.m20709a(Integer.MAX_VALUE, 6, null);

    /* JADX INFO: renamed from: x */
    public ScrollConfig f6103x;

    /* JADX INFO: renamed from: y */
    public final SuspendingPointerInputModifierNode f6104y;

    public TransformableNode() {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplM5574a = SuspendingPointerInputFilterKt.m5574a(new TransformableNode$pointerInputNode$1(this));
        m5746X1(suspendingPointerInputModifierNodeImplM5574a);
        this.f6104y = suspendingPointerInputModifierNodeImplM5574a;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: C0 */
    public final void mo2397C0() {
        this.f6104y.mo2397C0();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        this.f6103x = new AndroidConfig(ViewConfiguration.get(DelegatableNode_androidKt.m5745a(this).getContext()));
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: z0 */
    public final void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.f6104y.mo2411z0(pointerEvent, pointerEventPass, j);
    }
}
