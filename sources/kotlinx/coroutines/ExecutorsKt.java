package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0010\b\u0007\u0010\u0002\"\u00020\u00002\u00020\u0000B\u0002\b\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ExecutorsKt {
    /* JADX INFO: renamed from: a */
    public static final CoroutineDispatcher m20593a(Executor executor) {
        if ((executor instanceof DispatcherExecutor ? (DispatcherExecutor) executor : null) != null) {
            return null;
        }
        return new ExecutorCoroutineDispatcherImpl(executor);
    }
}
