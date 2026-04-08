package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/flow/StartedEagerly;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    /* JADX INFO: renamed from: a */
    public final Flow mo20799a(StateFlow stateFlow) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(SharingCommand.f56146a);
    }

    public final String toString() {
        return "SharingStarted.Eagerly";
    }
}
