package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m18559f = "Limit.kt", m18560l = {133}, m18561m = "collectWhile")
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public FlowKt__LimitKt$collectWhile$collector$1 f55878a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55879b;

    /* JADX INFO: renamed from: c */
    public int f55880c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55879b = obj;
        int i = (this.f55880c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55880c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        try {
        } catch (AbortFlowException e) {
            if (e.f56197a != i) {
                throw e;
            }
        }
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55878a = new FlowKt__LimitKt$collectWhile$collector$1();
            this.f55880c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = this.f55878a;
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
