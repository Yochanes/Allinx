package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m18559f = "Limit.kt", m18560l = {58, 60}, m18561m = "emit")
final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__LimitKt$take$2$1 f55915b;

    /* JADX INFO: renamed from: c */
    public int f55916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1, Continuation continuation) {
        super(continuation);
        this.f55915b = flowKt__LimitKt$take$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55914a = obj;
        this.f55916c |= Integer.MIN_VALUE;
        return this.f55915b.emit(null, this);
    }
}
