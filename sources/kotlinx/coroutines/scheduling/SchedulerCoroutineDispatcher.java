package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public CoroutineScheduler f56476c;

    public void close() throws InterruptedException {
        this.f56476c.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.m20875d(this.f56476c, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: y0 */
    public final void mo16938y0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.m20875d(this.f56476c, runnable, 2);
    }
}
