package kotlinx.coroutines;

import androidx.compose.animation.AbstractC0455a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\n\u000b\f\rR\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\u000e"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55304i = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55305j = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55306n = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class DelayedResumeTask extends DelayedTask {

        /* JADX INFO: renamed from: c */
        public final CancellableContinuationImpl f55307c;

        public DelayedResumeTask(long j, CancellableContinuationImpl cancellableContinuationImpl) {
            super(j);
            this.f55307c = cancellableContinuationImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f55307c.m20519D(EventLoopImplBase.this, Unit.f51459a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.f55307c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DelayedRunnableTask extends DelayedTask {

        /* JADX INFO: renamed from: c */
        public final Runnable f55309c;

        public DelayedRunnableTask(Runnable runnable, long j) {
            super(j);
            this.f55309c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f55309c.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.f55309c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "_heap", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a */
        public long f55310a;

        /* JADX INFO: renamed from: b */
        public int f55311b = -1;

        public DelayedTask(long j) {
            this.f55310a = j;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* JADX INFO: renamed from: a */
        public final void mo20589a(DelayedTaskQueue delayedTaskQueue) {
            if (this._heap == EventLoop_commonKt.f55313a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = delayedTaskQueue;
        }

        /* JADX INFO: renamed from: c */
        public final int m20590c(long j, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.f55313a) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f56364a;
                        DelayedTask delayedTask = (DelayedTask) (threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EventLoopImplBase.f55304i;
                        eventLoopImplBase.getClass();
                        if (EventLoopImplBase.f55306n.get(eventLoopImplBase) != 0) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.f55312c = j;
                        } else {
                            long j2 = delayedTask.f55310a;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - delayedTaskQueue.f55312c > 0) {
                                delayedTaskQueue.f55312c = j;
                            }
                        }
                        long j3 = this.f55310a;
                        long j4 = delayedTaskQueue.f55312c;
                        if (j3 - j4 < 0) {
                            this.f55310a = j4;
                        }
                        delayedTaskQueue.m20860a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(DelayedTask delayedTask) {
            long j = this.f55310a - delayedTask.f55310a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    Symbol symbol = EventLoop_commonKt.f55313a;
                    if (obj == symbol) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        synchronized (delayedTaskQueue) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof ThreadSafeHeap ? (ThreadSafeHeap) obj2 : null) != null) {
                                delayedTaskQueue.m20861b(this.f55311b);
                            }
                        }
                    }
                    this._heap = symbol;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void setIndex(int i) {
            this.f55311b = i;
        }

        public String toString() {
            return AbstractC0455a.m2240o(new StringBuilder("Delayed[nanos="), this.f55310a, ']');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* JADX INFO: renamed from: c */
        public long f55312c;
    }

    /* JADX INFO: renamed from: S */
    public DisposableHandle mo20567S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return DefaultExecutorKt.f55289a.mo20567S(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: b */
    public final void mo20572b(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        long jM20591a = EventLoop_commonKt.m20591a(j);
        if (jM20591a < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jM20591a + jNanoTime, cancellableContinuationImpl);
            m20588l1(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.m20542a(cancellableContinuationImpl, delayedResumeTask);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // kotlinx.coroutines.EventLoop
    /* JADX INFO: renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo20583d1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Symbol symbol;
        Runnable runnable;
        ThreadSafeHeapNode threadSafeHeapNode;
        if (!m20584e1()) {
            m20585i1();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f55304i;
                Object obj = atomicReferenceFieldUpdater.get(this);
                symbol = EventLoop_commonKt.f55314b;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != symbol) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object objM20841d = lockFreeTaskQueueCore.m20841d();
                if (objM20841d != LockFreeTaskQueueCore.f56344g) {
                    runnable = (Runnable) objM20841d;
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore.m20840c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCoreM20840c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque arrayDeque = this.f55303f;
            if (((arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof LockFreeTaskQueueCore) {
                        long j = LockFreeTaskQueueCore.f56343f.get((LockFreeTaskQueueCore) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == symbol) {
                        return Long.MAX_VALUE;
                    }
                }
                DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f55305j.get(this);
                if (delayedTaskQueue != null) {
                    synchronized (delayedTaskQueue) {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f56364a;
                        threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    }
                    DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                    if (delayedTask != null) {
                        long jNanoTime = delayedTask.f55310a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: h1 */
    public void mo20569h1(Runnable runnable) {
        m20585i1();
        if (!m20586j1(runnable)) {
            DefaultExecutor.f55287o.mo20569h1(runnable);
            return;
        }
        Thread threadMo20504f1 = getF55258o();
        if (Thread.currentThread() != threadMo20504f1) {
            LockSupport.unpark(threadMo20504f1);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m20585i1() {
        ThreadSafeHeapNode threadSafeHeapNodeM20861b;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f55305j.get(this);
        if (delayedTaskQueue == null || ThreadSafeHeap.f56363b.get(delayedTaskQueue) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (delayedTaskQueue) {
                try {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f56364a;
                    ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    if (threadSafeHeapNode != null) {
                        DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                        threadSafeHeapNodeM20861b = ((jNanoTime - delayedTask.f55310a) > 0L ? 1 : ((jNanoTime - delayedTask.f55310a) == 0L ? 0 : -1)) >= 0 ? m20586j1(delayedTask) : false ? delayedTaskQueue.m20861b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((DelayedTask) threadSafeHeapNodeM20861b) != null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        mo20569h1(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m20586j1(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55304i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f55306n.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof LockFreeTaskQueueCore)) {
                        if (obj != EventLoop_commonKt.f55314b) {
                            LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                            lockFreeTaskQueueCore.m20838a((Runnable) obj);
                            lockFreeTaskQueueCore.m20838a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
                    int iM20838a = lockFreeTaskQueueCore2.m20838a(runnable);
                    if (iM20838a == 0) {
                        break;
                    }
                    if (iM20838a == 1) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCoreM20840c = lockFreeTaskQueueCore2.m20840c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCoreM20840c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM20838a == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m20587k1() {
        DelayedTaskQueue delayedTaskQueue;
        ArrayDeque arrayDeque = this.f55303f;
        if (!(arrayDeque != null ? arrayDeque.isEmpty() : true) || ((delayedTaskQueue = (DelayedTaskQueue) f55305j.get(this)) != null && ThreadSafeHeap.f56363b.get(delayedTaskQueue) != 0)) {
            return false;
        }
        Object obj = f55304i.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                long j = LockFreeTaskQueueCore.f56343f.get((LockFreeTaskQueueCore) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != EventLoop_commonKt.f55314b) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m20588l1(long j, DelayedTask delayedTask) {
        int iM20590c;
        Thread threadMo20504f1;
        boolean z2 = f55306n.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55305j;
        if (z2) {
            iM20590c = 1;
        } else {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
            if (delayedTaskQueue == null) {
                DelayedTaskQueue delayedTaskQueue2 = new DelayedTaskQueue();
                delayedTaskQueue2.f55312c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, delayedTaskQueue2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.m18596d(obj);
                delayedTaskQueue = (DelayedTaskQueue) obj;
            }
            iM20590c = delayedTask.m20590c(j, delayedTaskQueue, this);
        }
        if (iM20590c != 0) {
            if (iM20590c == 1) {
                mo20568g1(j, delayedTask);
                return;
            } else {
                if (iM20590c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        DelayedTaskQueue delayedTaskQueue3 = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue3 != null) {
            synchronized (delayedTaskQueue3) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue3.f56364a;
                threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
            }
            threadSafeHeapNode = (DelayedTask) threadSafeHeapNode;
        }
        if (threadSafeHeapNode != delayedTask || Thread.currentThread() == (threadMo20504f1 = getF55258o())) {
            return;
        }
        LockSupport.unpark(threadMo20504f1);
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadSafeHeapNode threadSafeHeapNodeM20861b;
        ThreadLocalEventLoop.f55362a.set(null);
        f55306n.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55304i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = EventLoop_commonKt.f55314b;
            if (obj != null) {
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != symbol) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                        lockFreeTaskQueueCore.m20838a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((LockFreeTaskQueueCore) obj).m20839b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo20583d1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) f55305j.get(this);
            if (delayedTaskQueue == null) {
                return;
            }
            synchronized (delayedTaskQueue) {
                threadSafeHeapNodeM20861b = ThreadSafeHeap.f56363b.get(delayedTaskQueue) > 0 ? delayedTaskQueue.m20861b(0) : null;
            }
            DelayedTask delayedTask = (DelayedTask) threadSafeHeapNodeM20861b;
            if (delayedTask == null) {
                return;
            } else {
                mo20568g1(jNanoTime, delayedTask);
            }
        }
    }
}
