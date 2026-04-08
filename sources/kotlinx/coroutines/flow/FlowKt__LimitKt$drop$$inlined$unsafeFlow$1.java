package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Flow f55885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55886b;

    public FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(Flow flow, int i) {
        this.f55885a = flow;
        this.f55886b = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f55885a.collect(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f55886b, flowCollector), continuation);
        return objCollect == CoroutineSingletons.f51584a ? objCollect : Unit.f51459a;
    }
}
