package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "Companion", "Watchdog", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: h */
    public static final ReentrantLock f57817h;

    /* JADX INFO: renamed from: i */
    public static final Condition f57818i;

    /* JADX INFO: renamed from: j */
    public static final long f57819j;

    /* JADX INFO: renamed from: k */
    public static final long f57820k;

    /* JADX INFO: renamed from: l */
    public static AsyncTimeout f57821l;

    /* JADX INFO: renamed from: e */
    public int f57822e;

    /* JADX INFO: renamed from: f */
    public AsyncTimeout f57823f;

    /* JADX INFO: renamed from: g */
    public long f57824g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m18302d2 = {"Lokio/AsyncTimeout$Companion;", "", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "Lokio/AsyncTimeout;", "head", "Lokio/AsyncTimeout;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final void m21559a(AsyncTimeout asyncTimeout, long j, boolean z2) {
            AsyncTimeout asyncTimeout2;
            ReentrantLock reentrantLock = AsyncTimeout.f57817h;
            if (AsyncTimeout.f57821l == null) {
                AsyncTimeout.f57821l = new AsyncTimeout();
                Watchdog watchdog = new Watchdog("Okio Watchdog");
                watchdog.setDaemon(true);
                watchdog.start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z2) {
                asyncTimeout.f57824g = Math.min(j, asyncTimeout.mo21653c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                asyncTimeout.f57824g = j + jNanoTime;
            } else {
                if (!z2) {
                    throw new AssertionError();
                }
                asyncTimeout.f57824g = asyncTimeout.mo21653c();
            }
            long j2 = asyncTimeout.f57824g - jNanoTime;
            AsyncTimeout asyncTimeout3 = AsyncTimeout.f57821l;
            Intrinsics.m18596d(asyncTimeout3);
            while (true) {
                asyncTimeout2 = asyncTimeout3.f57823f;
                if (asyncTimeout2 == null || j2 < asyncTimeout2.f57824g - jNanoTime) {
                    break;
                }
                Intrinsics.m18596d(asyncTimeout2);
                asyncTimeout3 = asyncTimeout2;
            }
            asyncTimeout.f57823f = asyncTimeout2;
            asyncTimeout3.f57823f = asyncTimeout;
            if (asyncTimeout3 == AsyncTimeout.f57821l) {
                AsyncTimeout.f57818i.signal();
            }
        }

        /* JADX INFO: renamed from: b */
        public static AsyncTimeout m21560b() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.f57821l;
            Intrinsics.m18596d(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.f57823f;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.f57818i.await(AsyncTimeout.f57819j, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.f57821l;
                Intrinsics.m18596d(asyncTimeout3);
                if (asyncTimeout3.f57823f != null || System.nanoTime() - jNanoTime < AsyncTimeout.f57820k) {
                    return null;
                }
                return AsyncTimeout.f57821l;
            }
            long jNanoTime2 = asyncTimeout2.f57824g - System.nanoTime();
            if (jNanoTime2 > 0) {
                AsyncTimeout.f57818i.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.f57821l;
            Intrinsics.m18596d(asyncTimeout4);
            asyncTimeout4.f57823f = asyncTimeout2.f57823f;
            asyncTimeout2.f57823f = null;
            asyncTimeout2.f57822e = 2;
            return asyncTimeout2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            AsyncTimeout asyncTimeoutM21560b;
            while (true) {
                try {
                    ReentrantLock reentrantLock2 = AsyncTimeout.f57817h;
                    reentrantLock = AsyncTimeout.f57817h;
                    reentrantLock.lock();
                    try {
                        asyncTimeoutM21560b = Companion.m21560b();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutM21560b == AsyncTimeout.f57821l) {
                    AsyncTimeout.f57821l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (asyncTimeoutM21560b != null) {
                        asyncTimeoutM21560b.mo21401l();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f57817h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.m18598f(conditionNewCondition, "newCondition(...)");
        f57818i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f57819j = millis;
        f57820k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: i */
    public final void m21557i() {
        long j = this.f57915c;
        boolean z2 = this.f57913a;
        if (j != 0 || z2) {
            ReentrantLock reentrantLock = f57817h;
            reentrantLock.lock();
            try {
                if (this.f57822e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f57822e = 1;
                Companion.m21559a(this, j, z2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21558j() {
        ReentrantLock reentrantLock = f57817h;
        reentrantLock.lock();
        try {
            int i = this.f57822e;
            this.f57822e = 0;
            if (i != 1) {
                return i == 2;
            }
            AsyncTimeout asyncTimeout = f57821l;
            while (asyncTimeout != null) {
                AsyncTimeout asyncTimeout2 = asyncTimeout.f57823f;
                if (asyncTimeout2 == this) {
                    asyncTimeout.f57823f = this.f57823f;
                    this.f57823f = null;
                    return false;
                }
                asyncTimeout = asyncTimeout2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public IOException mo21484k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: l */
    public void mo21401l() {
    }
}
