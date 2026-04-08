package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 implements Flow<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f55742a;

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Object obj) {
        this.f55742a = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objEmit = flowCollector.emit(this.f55742a, continuation);
        return objEmit == CoroutineSingletons.f51584a ? objEmit : Unit.f51459a;
    }
}
