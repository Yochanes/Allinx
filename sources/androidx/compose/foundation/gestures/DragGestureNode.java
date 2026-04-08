package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {

    /* JADX INFO: renamed from: A */
    public BufferedChannel f5643A;

    /* JADX INFO: renamed from: B */
    public DragInteraction.Start f5644B;

    /* JADX INFO: renamed from: C */
    public boolean f5645C;

    /* JADX INFO: renamed from: D */
    public SuspendingPointerInputModifierNode f5646D;

    /* JADX INFO: renamed from: v */
    public Orientation f5647v;

    /* JADX INFO: renamed from: w */
    public Function1 f5648w;

    /* JADX INFO: renamed from: x */
    public boolean f5649x;

    /* JADX INFO: renamed from: y */
    public MutableInteractionSource f5650y;

    /* JADX INFO: renamed from: z */
    public final Function1 f5651z = new DragGestureNode$_canDrag$1(this);

    public DragGestureNode(Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.f5647v = orientation;
        this.f5648w = function1;
        this.f5649x = z2;
        this.f5650y = mutableInteractionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: a2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2612a2(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i = dragGestureNode$processDragCancel$1.f5675d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.f5675d = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(dragGestureNode, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragCancel$1.f5673b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = dragGestureNode$processDragCancel$1.f5675d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            DragInteraction.Start start = dragGestureNode.f5644B;
            if (start != null) {
                MutableInteractionSource mutableInteractionSource = dragGestureNode.f5650y;
                if (mutableInteractionSource != null) {
                    DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                    dragGestureNode$processDragCancel$1.f5672a = dragGestureNode;
                    dragGestureNode$processDragCancel$1.f5675d = 1;
                    if (mutableInteractionSource.mo2697a(cancel, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.mo2574g2(0L);
            return Unit.f51459a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dragGestureNode = dragGestureNode$processDragCancel$1.f5672a;
        ResultKt.m18313b(obj);
        dragGestureNode.f5644B = null;
        dragGestureNode.mo2574g2(0L);
        return Unit.f51459a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: b2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2613b2(DragGestureNode dragGestureNode, DragEvent.DragStarted dragStarted, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        DragGestureNode dragGestureNode2;
        DragInteraction.Start start2;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i = dragGestureNode$processDragStart$1.f5681g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.f5681g = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(dragGestureNode, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragStart$1.f5679d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = dragGestureNode$processDragStart$1.f5681g;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            DragInteraction.Start start3 = dragGestureNode.f5644B;
            if (start3 != null && (mutableInteractionSource = dragGestureNode.f5650y) != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                dragGestureNode$processDragStart$1.f5676a = dragGestureNode;
                dragGestureNode$processDragStart$1.f5677b = dragStarted;
                dragGestureNode$processDragStart$1.f5681g = 1;
                if (mutableInteractionSource.mo2697a(cancel, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            dragGestureNode.f5644B = start;
            dragGestureNode.mo2573f2(dragStarted.f5506a);
            return Unit.f51459a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            start2 = dragGestureNode$processDragStart$1.f5678c;
            dragStarted = dragGestureNode$processDragStart$1.f5677b;
            dragGestureNode2 = dragGestureNode$processDragStart$1.f5676a;
            ResultKt.m18313b(obj);
            start = start2;
            dragGestureNode = dragGestureNode2;
            dragGestureNode.f5644B = start;
            dragGestureNode.mo2573f2(dragStarted.f5506a);
            return Unit.f51459a;
        }
        dragStarted = dragGestureNode$processDragStart$1.f5677b;
        dragGestureNode = dragGestureNode$processDragStart$1.f5676a;
        ResultKt.m18313b(obj);
        start = new DragInteraction.Start();
        MutableInteractionSource mutableInteractionSource2 = dragGestureNode.f5650y;
        if (mutableInteractionSource2 != null) {
            dragGestureNode$processDragStart$1.f5676a = dragGestureNode;
            dragGestureNode$processDragStart$1.f5677b = dragStarted;
            dragGestureNode$processDragStart$1.f5678c = start;
            dragGestureNode$processDragStart$1.f5681g = 2;
            if (mutableInteractionSource2.mo2697a(start, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                dragGestureNode2 = dragGestureNode;
                start2 = start;
                start = start2;
                dragGestureNode = dragGestureNode2;
            }
            return coroutineSingletons;
        }
        dragGestureNode.f5644B = start;
        dragGestureNode.mo2573f2(dragStarted.f5506a);
        return Unit.f51459a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: c2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2614c2(DragGestureNode dragGestureNode, DragEvent.DragStopped dragStopped, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        dragGestureNode.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i = dragGestureNode$processDragStop$1.f5686f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.f5686f = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(dragGestureNode, continuationImpl);
            }
        }
        Object obj = dragGestureNode$processDragStop$1.f5684c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = dragGestureNode$processDragStop$1.f5686f;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            DragInteraction.Start start = dragGestureNode.f5644B;
            if (start != null) {
                MutableInteractionSource mutableInteractionSource = dragGestureNode.f5650y;
                if (mutableInteractionSource != null) {
                    DragInteraction.Stop stop = new DragInteraction.Stop(start);
                    dragGestureNode$processDragStop$1.f5682a = dragGestureNode;
                    dragGestureNode$processDragStop$1.f5683b = dragStopped;
                    dragGestureNode$processDragStop$1.f5686f = 1;
                    if (mutableInteractionSource.mo2697a(stop, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            dragGestureNode.mo2574g2(dragStopped.f5507a);
            return Unit.f51459a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dragStopped = dragGestureNode$processDragStop$1.f5683b;
        dragGestureNode = dragGestureNode$processDragStop$1.f5682a;
        ResultKt.m18313b(obj);
        dragGestureNode.f5644B = null;
        dragGestureNode.mo2574g2(dragStopped.f5507a);
        return Unit.f51459a;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: C0 */
    public final void mo2397C0() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.f5646D;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo2397C0();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        this.f5645C = false;
        m2615d2();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m2615d2() {
        DragInteraction.Start start = this.f5644B;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.f5650y;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.mo2698b(new DragInteraction.Cancel(start));
            }
            this.f5644B = null;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public abstract Object mo2572e2(Function2 function2, Continuation continuation);

    /* JADX INFO: renamed from: f2 */
    public abstract void mo2573f2(long j);

    /* JADX INFO: renamed from: g2 */
    public abstract void mo2574g2(long j);

    /* JADX INFO: renamed from: h2 */
    public abstract boolean mo2575h2();

    /* JADX INFO: renamed from: i2 */
    public final void m2616i2(Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.f5648w = function1;
        boolean z4 = true;
        if (this.f5649x != z2) {
            this.f5649x = z2;
            if (!z2) {
                m2615d2();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.f5646D;
                if (suspendingPointerInputModifierNode2 != null) {
                    m5747Y1(suspendingPointerInputModifierNode2);
                }
                this.f5646D = null;
            }
            z3 = true;
        }
        if (!Intrinsics.m18594b(this.f5650y, mutableInteractionSource)) {
            m2615d2();
            this.f5650y = mutableInteractionSource;
        }
        if (this.f5647v != orientation) {
            this.f5647v = orientation;
        } else {
            z4 = z3;
        }
        if (!z4 || (suspendingPointerInputModifierNode = this.f5646D) == null) {
            return;
        }
        suspendingPointerInputModifierNode.mo5580K1();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: z0 */
    public void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (this.f5649x && this.f5646D == null) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplM5574a = SuspendingPointerInputFilterKt.m5574a(new DragGestureNode$initializePointerInputNode$1(this));
            m5746X1(suspendingPointerInputModifierNodeImplM5574a);
            this.f5646D = suspendingPointerInputModifierNodeImplM5574a;
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.f5646D;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo2411z0(pointerEvent, pointerEventPass, j);
        }
    }
}
