package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/DisposableFutureHandle;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class DisposableFutureHandle implements DisposableHandle {

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f55296a;

    public DisposableFutureHandle(ScheduledFuture scheduledFuture) {
        this.f55296a = scheduledFuture;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.f55296a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f55296a + ']';
    }
}
