package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {

    /* JADX INFO: renamed from: t */
    public MutableInteractionSource f5006t;

    /* JADX INFO: renamed from: u */
    public HoverInteraction.Enter f5007u;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: X1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2474X1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        HoverInteraction.Enter enter;
        hoverableNode.getClass();
        if (continuationImpl instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuationImpl;
            int i = hoverableNode$emitEnter$1.f5012f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.f5012f = i - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(hoverableNode, continuationImpl);
            }
        }
        Object obj = hoverableNode$emitEnter$1.f5010c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = hoverableNode$emitEnter$1.f5012f;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (hoverableNode.f5007u == null) {
                enter = new HoverInteraction.Enter();
                MutableInteractionSource mutableInteractionSource = hoverableNode.f5006t;
                hoverableNode$emitEnter$1.f5008a = hoverableNode;
                hoverableNode$emitEnter$1.f5009b = enter;
                hoverableNode$emitEnter$1.f5012f = 1;
                if (mutableInteractionSource.mo2697a(enter, hoverableNode$emitEnter$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f51459a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        HoverInteraction.Enter enter2 = hoverableNode$emitEnter$1.f5009b;
        HoverableNode hoverableNode2 = (HoverableNode) hoverableNode$emitEnter$1.f5008a;
        ResultKt.m18313b(obj);
        enter = enter2;
        hoverableNode = hoverableNode2;
        hoverableNode.f5007u = enter;
        return Unit.f51459a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: Y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2475Y1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        hoverableNode.getClass();
        if (continuationImpl instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuationImpl;
            int i = hoverableNode$emitExit$1.f5016d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.f5016d = i - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(hoverableNode, continuationImpl);
            }
        }
        Object obj = hoverableNode$emitExit$1.f5014b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = hoverableNode$emitExit$1.f5016d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            HoverInteraction.Enter enter = hoverableNode.f5007u;
            if (enter != null) {
                HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
                MutableInteractionSource mutableInteractionSource = hoverableNode.f5006t;
                hoverableNode$emitExit$1.f5013a = hoverableNode;
                hoverableNode$emitExit$1.f5016d = 1;
                if (mutableInteractionSource.mo2697a(exit, hoverableNode$emitExit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f51459a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hoverableNode = (HoverableNode) hoverableNode$emitExit$1.f5013a;
        ResultKt.m18313b(obj);
        hoverableNode.f5007u = null;
        return Unit.f51459a;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: C0 */
    public final void mo2397C0() {
        m2476Z1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        m2476Z1();
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m2476Z1() {
        HoverInteraction.Enter enter = this.f5007u;
        if (enter != null) {
            this.f5006t.mo2698b(new HoverInteraction.Exit(enter));
            this.f5007u = null;
        }
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: z0 */
    public final void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.f18288b) {
            int i = pointerEvent.f18286e;
            if (i == 4) {
                BuildersKt.m20507c(m4865L1(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (i == 5) {
                BuildersKt.m20507c(m4865L1(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }
}
