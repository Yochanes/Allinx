package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m18559f = "Errors.kt", m18560l = {154}, m18561m = "emit")
final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f55865a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowKt__ErrorsKt$catchImpl$2 f55867c;

    /* JADX INFO: renamed from: d */
    public int f55868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2, Continuation continuation) {
        super(continuation);
        this.f55867c = flowKt__ErrorsKt$catchImpl$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55866b = obj;
        this.f55868d |= Integer.MIN_VALUE;
        return this.f55867c.emit(null, this);
    }
}
