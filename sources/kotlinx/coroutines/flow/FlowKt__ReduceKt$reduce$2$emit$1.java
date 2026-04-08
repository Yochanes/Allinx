package kotlinx.coroutines.flow;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", m18559f = "Reduce.kt", m18560l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m18561m = "emit")
final class FlowKt__ReduceKt$reduce$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__ReduceKt$reduce$2 f56003b;

    /* JADX INFO: renamed from: c */
    public int f56004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$reduce$2$emit$1(FlowKt__ReduceKt$reduce$2 flowKt__ReduceKt$reduce$2, Continuation continuation) {
        super(continuation);
        this.f56003b = flowKt__ReduceKt$reduce$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56002a = obj;
        this.f56004c |= Integer.MIN_VALUE;
        this.f56003b.emit(null, this);
        return Unit.f51459a;
    }
}
