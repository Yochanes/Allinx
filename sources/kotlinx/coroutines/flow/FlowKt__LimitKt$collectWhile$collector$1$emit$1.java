package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m18559f = "Limit.kt", m18560l = {127}, m18561m = "emit")
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public FlowKt__LimitKt$collectWhile$collector$1 f55881a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 f55883c;

    /* JADX INFO: renamed from: d */
    public int f55884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, Continuation continuation) {
        super(continuation);
        this.f55883c = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55882b = obj;
        this.f55884d |= Integer.MIN_VALUE;
        this.f55883c.emit(null, this);
        return Unit.f51459a;
    }
}
