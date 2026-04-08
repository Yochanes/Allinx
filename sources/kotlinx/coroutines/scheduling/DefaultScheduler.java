package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DefaultScheduler extends SchedulerCoroutineDispatcher {

    /* JADX INFO: renamed from: d */
    public static final DefaultScheduler f56474d;

    static {
        int i = TasksKt.f56482c;
        int i2 = TasksKt.f56483d;
        long j = TasksKt.f56484e;
        String str = TasksKt.f56480a;
        DefaultScheduler defaultScheduler = new DefaultScheduler();
        defaultScheduler.f56476c = new CoroutineScheduler(str, i, j, i2);
        f56474d = defaultScheduler;
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
