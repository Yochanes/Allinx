package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m18559f = "Merge.kt", m18560l = {79}, m18561m = "emit")
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1 f55944b;

    /* JADX INFO: renamed from: c */
    public int f55945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1 flowKt__MergeKt$flattenConcat$1$1, Continuation continuation) {
        super(continuation);
        this.f55944b = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55943a = obj;
        this.f55945c |= Integer.MIN_VALUE;
        this.f55944b.m20770a(null, this);
        return Unit.f51459a;
    }
}
