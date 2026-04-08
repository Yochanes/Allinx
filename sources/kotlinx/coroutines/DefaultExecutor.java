package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.EventLoopImplBase;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m18302d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: o */
    public static final DefaultExecutor f55287o;

    /* JADX INFO: renamed from: p */
    public static final long f55288p;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f55287o = defaultExecutor;
        defaultExecutor.m20582c1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f55288p = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: S */
    public final DisposableHandle mo20567S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long jM20591a = EventLoop_commonKt.m20591a(j);
        if (jM20591a >= 4611686018427387903L) {
            return NonDisposableHandle.f55357a;
        }
        long jNanoTime = System.nanoTime();
        EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new EventLoopImplBase.DelayedRunnableTask(runnable, jM20591a + jNanoTime);
        m20588l1(jNanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* JADX INFO: renamed from: f1 */
    public final Thread getF55258o() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f55287o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* JADX INFO: renamed from: g1 */
    public final void mo20568g1(long j, EventLoopImplBase.DelayedTask delayedTask) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    /* JADX INFO: renamed from: h1 */
    public final void mo20569h1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo20569h1(runnable);
    }

    /* JADX INFO: renamed from: m1 */
    public final synchronized void m20570m1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            EventLoopImplBase.f55304i.set(this, null);
            EventLoopImplBase.f55305j.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM20587k1;
        ThreadLocalEventLoop.f55362a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM20587k1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo20583d1 = mo20583d1();
                    if (jMo20583d1 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f55288p + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m20570m1();
                            if (m20587k1()) {
                                return;
                            }
                            getF55258o();
                            return;
                        }
                        if (jMo20583d1 > j2) {
                            jMo20583d1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo20583d1 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m20570m1();
                            if (m20587k1()) {
                                return;
                            }
                            getF55258o();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo20583d1);
                    }
                }
            }
        } finally {
            _thread = null;
            m20570m1();
            if (!m20587k1()) {
                getF55258o();
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }
}
