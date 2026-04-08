package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import me.jessyan.autosize.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m18559f = "Reduce.kt", m18560l = {BuildConfig.VERSION_CODE}, m18561m = "emit")
public final class FlowKt__ReduceKt$fold$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__ReduceKt$fold$2 f55991b;

    /* JADX INFO: renamed from: c */
    public int f55992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$fold$2$emit$1(FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2, Continuation continuation) {
        super(continuation);
        this.f55991b = flowKt__ReduceKt$fold$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55990a = obj;
        this.f55992c |= Integer.MIN_VALUE;
        this.f55991b.emit(null, this);
        return Unit.f51459a;
    }
}
