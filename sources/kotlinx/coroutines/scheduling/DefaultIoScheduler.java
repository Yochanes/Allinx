package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {

    /* JADX INFO: renamed from: c */
    public static final DefaultIoScheduler f56472c = new DefaultIoScheduler();

    /* JADX INFO: renamed from: d */
    public static final CoroutineDispatcher f56473d;

    static {
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.f56486c;
        int iM20853a = SystemPropsKt.m20853a();
        if (64 >= iM20853a) {
            iM20853a = 64;
        }
        f56473d = unlimitedIoScheduler.mo20558Z0(SystemPropsKt.m20856d(iM20853a, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: Z0 */
    public final CoroutineDispatcher mo20558Z0(int i) {
        return UnlimitedIoScheduler.f56486c.mo20558Z0(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo6095j0(EmptyCoroutineContext.f51581a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        f56473d.mo6095j0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: y0 */
    public final void mo16938y0(CoroutineContext coroutineContext, Runnable runnable) {
        f56473d.mo16938y0(coroutineContext, runnable);
    }
}
