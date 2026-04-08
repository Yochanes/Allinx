package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: a */
    public NestedScrollNode f18213a;

    /* JADX INFO: renamed from: b */
    public NestedScrollNode f18214b;

    /* JADX INFO: renamed from: c */
    public Lambda f18215c = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* JADX INFO: renamed from: d */
    public CoroutineScope f18216d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5521a(long j, long j2, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j3;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPostFling$1.f18220c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.f18220c = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
            }
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objMo21915onPostFlingRZ2iAVY = nestedScrollDispatcher$dispatchPostFling$12.f18218a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = nestedScrollDispatcher$dispatchPostFling$12.f18220c;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            NestedScrollNode nestedScrollNode = this.f18213a;
            NestedScrollNode nestedScrollNode2 = null;
            j3 = 0;
            if (((nestedScrollNode == null || !nestedScrollNode.f17194s) ? null : (NestedScrollNode) TraversableNodeKt.m5976a(nestedScrollNode)) == null) {
                NestedScrollNode nestedScrollNode3 = this.f18214b;
                if (nestedScrollNode3 != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.f18220c = 1;
                    objMo21915onPostFlingRZ2iAVY = nestedScrollNode3.mo21915onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                }
            } else {
                NestedScrollNode nestedScrollNode4 = this.f18213a;
                if (nestedScrollNode4 != null && nestedScrollNode4.f17194s) {
                    nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.m5976a(nestedScrollNode4);
                }
                if (nestedScrollNode2 != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.f18220c = 2;
                    objMo21915onPostFlingRZ2iAVY = nestedScrollNode2.mo21915onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                } else {
                    j3 = 0;
                }
            }
        } else if (i2 == 1) {
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            j3 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            j3 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
        }
        return new Velocity(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5522b(long j, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j2;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPreFling$1.f18223c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.f18223c = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
            }
        }
        Object objMo21924onPreFlingQWom1Mo = nestedScrollDispatcher$dispatchPreFling$1.f18221a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.f18223c;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21924onPreFlingQWom1Mo);
            NestedScrollNode nestedScrollNode = this.f18213a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f17194s) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.m5976a(nestedScrollNode);
            }
            if (nestedScrollNode2 == null) {
                j2 = 0;
                return new Velocity(j2);
            }
            nestedScrollDispatcher$dispatchPreFling$1.f18223c = 1;
            objMo21924onPreFlingQWom1Mo = nestedScrollNode2.mo21924onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
            if (objMo21924onPreFlingQWom1Mo == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objMo21924onPreFlingQWom1Mo);
        }
        j2 = ((Velocity) objMo21924onPreFlingQWom1Mo).f20578a;
        return new Velocity(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: c */
    public final CoroutineScope m5523c() {
        CoroutineScope coroutineScope = (CoroutineScope) this.f18215c.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
