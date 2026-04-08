package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "T", "Landroidx/compose/foundation/gestures/DragGestureNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AnchoredDraggableNode<T> extends DragGestureNode {

    /* JADX INFO: renamed from: E */
    public FlingBehavior f5354E;

    /* JADX INFO: renamed from: F */
    public Density f5355F;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: j2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2571j2(AnchoredDraggableNode anchoredDraggableNode, float f, ContinuationImpl continuationImpl) {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        anchoredDraggableNode.getClass();
        if (continuationImpl instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) continuationImpl;
            int i = anchoredDraggableNode$fling$1.f5364c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.f5364c = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(anchoredDraggableNode, continuationImpl);
            }
        }
        Object obj = anchoredDraggableNode$fling$1.f5362a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = anchoredDraggableNode$fling$1.f5364c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i2 == 1) {
            ResultKt.m18313b(obj);
            return obj;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        m2577l2();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: e2 */
    public final Object mo2572e2(Function2 function2, Continuation continuation) {
        new AnchoredDraggableNode$drag$2(function2, this, null);
        MutatePriority mutatePriority = MutatePriority.f5091a;
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: g2 */
    public final void mo2574g2(long j) {
        if (this.f17194s) {
            BuildersKt.m20507c(m4865L1(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: h2 */
    public final boolean mo2575h2() {
        throw null;
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m2576k2() {
        if (DelegatableNodeKt.m5743g(this).f18715G != LayoutDirection.f20570b) {
            return false;
        }
        Orientation orientation = Orientation.f5829a;
        return false;
    }

    /* JADX INFO: renamed from: l2 */
    public final void m2577l2() {
        TweenSpec tweenSpec = AnchoredDraggableDefaults.f5309a;
        Function1 function1 = AnchoredDraggableDefaults.f5310b;
        Density density = DelegatableNodeKt.m5743g(this).f18714F;
        this.f5355F = density;
        DecayAnimationSpec decayAnimationSpec = AnchoredDraggableKt.f5315c;
        AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1 anchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1 = new AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1(new AnchoredDraggableKt$anchoredDraggableFlingBehavior$1(density), function1);
        float f = SnapFlingBehaviorKt.f6175a;
        this.f5354E = new SnapFlingBehavior(anchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1, decayAnimationSpec, tweenSpec);
    }

    @Override // androidx.compose.p013ui.node.DelegatableNode, androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: y */
    public final void mo2578y() {
        mo2397C0();
        if (this.f17194s) {
            Density density = DelegatableNodeKt.m5743g(this).f18714F;
            Density density2 = this.f5355F;
            if (density2 == null || !density2.equals(density)) {
                this.f5355F = density;
                m2577l2();
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: f2 */
    public final void mo2573f2(long j) {
    }
}
