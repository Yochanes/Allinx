package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m18559f = "Count.kt", m18560l = {26}, m18561m = "emit")
final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f55762a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowKt__CountKt$count$4 f55764c;

    /* JADX INFO: renamed from: d */
    public int f55765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4 flowKt__CountKt$count$4, Continuation continuation) {
        super(continuation);
        this.f55764c = flowKt__CountKt$count$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55763b = obj;
        this.f55765d |= Integer.MIN_VALUE;
        this.f55764c.emit(null, this);
        return Unit.f51459a;
    }
}
