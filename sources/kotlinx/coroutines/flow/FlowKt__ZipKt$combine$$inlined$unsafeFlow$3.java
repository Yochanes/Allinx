package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 176)
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
    public final class C63101 extends ContinuationImpl {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f56101a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56101a = obj;
            throw null;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Intrinsics.m18605m();
        throw null;
    }
}
