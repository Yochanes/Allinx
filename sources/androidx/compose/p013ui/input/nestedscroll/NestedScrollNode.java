package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {

    /* JADX INFO: renamed from: t */
    public NestedScrollConnection f18226t;

    /* JADX INFO: renamed from: u */
    public NestedScrollDispatcher f18227u;

    /* JADX INFO: renamed from: v */
    public NestedScrollNode f18228v;

    /* JADX INFO: renamed from: w */
    public final String f18229w;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f18226t = nestedScrollConnection;
        this.f18227u = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.f18229w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f18227u;
        nestedScrollDispatcher.f18213a = this;
        nestedScrollDispatcher.f18214b = null;
        this.f18228v = null;
        nestedScrollDispatcher.f18215c = new NestedScrollNode$updateDispatcherFields$1(this);
        nestedScrollDispatcher.f18216d = m4865L1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.m5977b(this, new NestedScrollNodeKt$findNearestAttachedAncestor$1(objectRef));
        NestedScrollNode nestedScrollNode = (NestedScrollNode) ((TraversableNode) objectRef.f51659a);
        this.f18228v = nestedScrollNode;
        NestedScrollDispatcher nestedScrollDispatcher = this.f18227u;
        nestedScrollDispatcher.f18214b = nestedScrollNode;
        if (nestedScrollDispatcher.f18213a == this) {
            nestedScrollDispatcher.f18213a = null;
        }
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    /* JADX INFO: renamed from: S */
    public final Object getF17362v() {
        return this.f18229w;
    }

    /* JADX INFO: renamed from: X1 */
    public final CoroutineScope m5525X1() {
        NestedScrollNode nestedScrollNode = this.f17194s ? (NestedScrollNode) TraversableNodeKt.m5976a(this) : null;
        if (nestedScrollNode != null) {
            return nestedScrollNode.m5525X1();
        }
        CoroutineScope coroutineScope = this.f18227u.f18216d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        NestedScrollNode nestedScrollNode;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i = nestedScrollNode$onPostFling$1.f18235g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.f18235g = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        }
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
        Object objMo21915onPostFlingRZ2iAVY = nestedScrollNode$onPostFling$12.f18233d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = nestedScrollNode$onPostFling$12.f18235g;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            NestedScrollConnection nestedScrollConnection = this.f18226t;
            nestedScrollNode$onPostFling$12.f18230a = this;
            nestedScrollNode$onPostFling$12.f18231b = j;
            nestedScrollNode$onPostFling$12.f18232c = j2;
            nestedScrollNode$onPostFling$12.f18235g = 1;
            objMo21915onPostFlingRZ2iAVY = nestedScrollConnection.mo21915onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$12);
            if (objMo21915onPostFlingRZ2iAVY != coroutineSingletons) {
                nestedScrollNode = this;
                j3 = j;
                j4 = j2;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = nestedScrollNode$onPostFling$12.f18231b;
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            j6 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
            j5 = j7;
            return new Velocity(Velocity.m6688e(j5, j6));
        }
        j4 = nestedScrollNode$onPostFling$12.f18232c;
        j3 = nestedScrollNode$onPostFling$12.f18231b;
        nestedScrollNode = nestedScrollNode$onPostFling$12.f18230a;
        ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
        j5 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
        boolean z2 = nestedScrollNode.f17194s;
        NestedScrollNode nestedScrollNode2 = z2 ? (z2 && z2) ? (NestedScrollNode) TraversableNodeKt.m5976a(nestedScrollNode) : null : nestedScrollNode.f18228v;
        if (nestedScrollNode2 == null) {
            j6 = 0;
            return new Velocity(Velocity.m6688e(j5, j6));
        }
        long jM6688e = Velocity.m6688e(j3, j5);
        long jM6687d = Velocity.m6687d(j4, j5);
        nestedScrollNode$onPostFling$12.f18230a = null;
        nestedScrollNode$onPostFling$12.f18231b = j5;
        nestedScrollNode$onPostFling$12.f18235g = 2;
        objMo21915onPostFlingRZ2iAVY = nestedScrollNode2.mo21915onPostFlingRZ2iAVY(jM6688e, jM6687d, nestedScrollNode$onPostFling$12);
        if (objMo21915onPostFlingRZ2iAVY != coroutineSingletons) {
            j7 = j5;
            j6 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
            j5 = j7;
            return new Velocity(Velocity.m6688e(j5, j6));
        }
        return coroutineSingletons;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        long jMo21916onPostScrollDzOQY0M = this.f18226t.mo21916onPostScrollDzOQY0M(j, j2, i);
        boolean z2 = this.f17194s;
        NestedScrollNode nestedScrollNode = null;
        if (z2 && z2) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.m5976a(this);
        }
        NestedScrollNode nestedScrollNode2 = nestedScrollNode;
        return Offset.m5058h(jMo21916onPostScrollDzOQY0M, nestedScrollNode2 != null ? nestedScrollNode2.mo21916onPostScrollDzOQY0M(Offset.m5058h(j, jMo21916onPostScrollDzOQY0M), Offset.m5057g(j2, jMo21916onPostScrollDzOQY0M), i) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long j2;
        NestedScrollNode nestedScrollNode;
        long j3;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i = nestedScrollNode$onPreFling$1.f18240f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.f18240f = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object objMo21924onPreFlingQWom1Mo = nestedScrollNode$onPreFling$1.f18238c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = nestedScrollNode$onPreFling$1.f18240f;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21924onPreFlingQWom1Mo);
            boolean z2 = this.f17194s;
            NestedScrollNode nestedScrollNode2 = (z2 && z2) ? (NestedScrollNode) TraversableNodeKt.m5976a(this) : null;
            if (nestedScrollNode2 != null) {
                nestedScrollNode$onPreFling$1.f18236a = this;
                nestedScrollNode$onPreFling$1.f18237b = j;
                nestedScrollNode$onPreFling$1.f18240f = 1;
                objMo21924onPreFlingQWom1Mo = nestedScrollNode2.mo21924onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                if (objMo21924onPreFlingQWom1Mo != coroutineSingletons) {
                    nestedScrollNode = this;
                }
                return coroutineSingletons;
            }
            j2 = 0;
            nestedScrollNode = this;
            long j4 = j2;
            long j5 = j;
            j3 = j4;
            NestedScrollConnection nestedScrollConnection = nestedScrollNode.f18226t;
            long jM6687d = Velocity.m6687d(j5, j3);
            nestedScrollNode$onPreFling$1.f18236a = null;
            nestedScrollNode$onPreFling$1.f18237b = j3;
            nestedScrollNode$onPreFling$1.f18240f = 2;
            objMo21924onPreFlingQWom1Mo = nestedScrollConnection.mo21924onPreFlingQWom1Mo(jM6687d, nestedScrollNode$onPreFling$1);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = nestedScrollNode$onPreFling$1.f18237b;
                ResultKt.m18313b(objMo21924onPreFlingQWom1Mo);
                return new Velocity(Velocity.m6688e(j3, ((Velocity) objMo21924onPreFlingQWom1Mo).f20578a));
            }
            j = nestedScrollNode$onPreFling$1.f18237b;
            nestedScrollNode = nestedScrollNode$onPreFling$1.f18236a;
            ResultKt.m18313b(objMo21924onPreFlingQWom1Mo);
        }
        j2 = ((Velocity) objMo21924onPreFlingQWom1Mo).f20578a;
        long j42 = j2;
        long j52 = j;
        j3 = j42;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.f18226t;
        long jM6687d2 = Velocity.m6687d(j52, j3);
        nestedScrollNode$onPreFling$1.f18236a = null;
        nestedScrollNode$onPreFling$1.f18237b = j3;
        nestedScrollNode$onPreFling$1.f18240f = 2;
        objMo21924onPreFlingQWom1Mo = nestedScrollConnection2.mo21924onPreFlingQWom1Mo(jM6687d2, nestedScrollNode$onPreFling$1);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        boolean z2 = this.f17194s;
        NestedScrollNode nestedScrollNode = null;
        if (z2 && z2) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.m5976a(this);
        }
        long jMo21925onPreScrollOzD1aCk = nestedScrollNode != null ? nestedScrollNode.mo21925onPreScrollOzD1aCk(j, i) : 0L;
        return Offset.m5058h(jMo21925onPreScrollOzD1aCk, this.f18226t.mo21925onPreScrollOzD1aCk(Offset.m5057g(j, jMo21925onPreScrollOzD1aCk), i));
    }
}
