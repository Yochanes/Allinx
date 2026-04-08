package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/DisposeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class DisposeOnCompletion extends JobNode {

    /* JADX INFO: renamed from: f */
    public final DisposableHandle f55298f;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.f55298f = disposableHandle;
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: k */
    public final boolean mo20497k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    /* JADX INFO: renamed from: l */
    public final void mo20498l(Throwable th) {
        this.f55298f.dispose();
    }
}
