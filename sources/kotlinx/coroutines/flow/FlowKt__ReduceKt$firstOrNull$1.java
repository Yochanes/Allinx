package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m18559f = "Reduce.kt", m18560l = {179}, m18561m = "firstOrNull")
final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f55979a;

    /* JADX INFO: renamed from: b */
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 f55980b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f55981c;

    /* JADX INFO: renamed from: d */
    public int f55982d;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        this.f55981c = obj;
        int i = (this.f55982d | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55982d = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 = this.f55980b;
            objectRef = this.f55979a;
            try {
                ResultKt.m18313b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.f56197a != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) {
                }
            }
            return objectRef.f51659a;
        }
        ResultKt.m18313b(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1(objectRef2);
        try {
            this.f55979a = objectRef2;
            this.f55980b = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1;
            this.f55982d = 1;
            throw null;
        } catch (AbortFlowException e3) {
            objectRef = objectRef2;
            e = e3;
        }
        if (e.f56197a != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) {
            throw e;
        }
        return objectRef.f51659a;
    }
}
