package io.ktor.client.engine;

import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpClientJvmEngine$_dispatcher$2 extends Lambda implements Function0<ExecutorCoroutineDispatcher> {

    /* JADX INFO: renamed from: io.ktor.client.engine.HttpClientJvmEngine$_dispatcher$2$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Runnable;", "newThread"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class ThreadFactoryC58811 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        throw null;
    }
}
