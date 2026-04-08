package kotlinx.coroutines.scheduling;

import androidx.compose.animation.AbstractC0455a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nR\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f56445j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f56446n = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56447o = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: p */
    public static final Symbol f56448p = new Symbol("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f56449a;

    /* JADX INFO: renamed from: b */
    public final int f56450b;

    /* JADX INFO: renamed from: c */
    public final long f56451c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f56452d;

    /* JADX INFO: renamed from: f */
    public final GlobalQueue f56453f;

    /* JADX INFO: renamed from: g */
    public final GlobalQueue f56454g;

    /* JADX INFO: renamed from: i */
    public final ResizableAtomicArray f56455i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "Lkotlinx/coroutines/internal/Symbol;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "", "PARKED", "I", "CLAIMED", "TERMINATED", "BLOCKING_SHIFT", "", "CREATED_MASK", "J", "BLOCKING_MASK", "CPU_PERMITS_SHIFT", "CPU_PERMITS_MASK", "MIN_SUPPORTED_POOL_SIZE", "MAX_SUPPORTED_POOL_SIZE", "PARKED_INDEX_MASK", "PARKED_VERSION_MASK", "PARKED_VERSION_INC", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkerState workerState = WorkerState.f56465a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkerState workerState2 = WorkerState.f56465a;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkerState workerState3 = WorkerState.f56465a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                WorkerState workerState4 = WorkerState.f56465a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\b\u0010\u0012\u001a\u00020\u00118\u0006¨\u0006\u0013"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "", FirebaseAnalytics.Param.INDEX, "indexInArray", "I", "b", "()I", "f", "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class Worker extends Thread {

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f56456n = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a */
        public final WorkQueue f56457a;

        /* JADX INFO: renamed from: b */
        public final Ref.ObjectRef f56458b;

        /* JADX INFO: renamed from: c */
        public WorkerState f56459c;

        /* JADX INFO: renamed from: d */
        public long f56460d;

        /* JADX INFO: renamed from: f */
        public long f56461f;

        /* JADX INFO: renamed from: g */
        public int f56462g;

        /* JADX INFO: renamed from: i */
        public boolean f56463i;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public Worker(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f56457a = new WorkQueue();
            this.f56458b = new Ref.ObjectRef();
            this.f56459c = WorkerState.f56468d;
            this.nextParkedWorker = CoroutineScheduler.f56448p;
            int iNanoTime = (int) System.nanoTime();
            this.f56462g = iNanoTime == 0 ? 42 : iNanoTime;
            m20886f(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            r13 = kotlinx.coroutines.scheduling.WorkQueue.f56489d.get(r3);
            r0 = kotlinx.coroutines.scheduling.WorkQueue.f56488c.get(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r13 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        
            if (kotlinx.coroutines.scheduling.WorkQueue.f56490e.get(r3) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        
            r0 = r0 - 1;
            r1 = r3.m20892c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            r2 = r1;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Task m20881a(boolean z2) {
            Task taskM20885e;
            Task taskM20885e2;
            CoroutineScheduler coroutineScheduler;
            long j;
            WorkerState workerState = this.f56459c;
            WorkerState workerState2 = WorkerState.f56465a;
            Task task = null;
            WorkQueue workQueue = this.f56457a;
            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f56446n;
                do {
                    coroutineScheduler = CoroutineScheduler.this;
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        workQueue.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.f56487b;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null || !task2.f56478b) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                if (atomicReferenceFieldUpdater.get(workQueue) != task2) {
                                    break;
                                }
                            }
                            task = task2;
                            break loop1;
                        }
                        if (task != null) {
                            return task;
                        }
                        Task task3 = (Task) coroutineScheduler2.f56454g.m20837d();
                        return task3 == null ? m20889i(1) : task3;
                    }
                } while (!CoroutineScheduler.f56446n.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.f56459c = WorkerState.f56465a;
            }
            if (z2) {
                boolean z3 = m20884d(coroutineScheduler2.f56449a * 2) == 0;
                if (z3 && (taskM20885e2 = m20885e()) != null) {
                    return taskM20885e2;
                }
                workQueue.getClass();
                Task taskM20891b = (Task) WorkQueue.f56487b.getAndSet(workQueue, null);
                if (taskM20891b == null) {
                    taskM20891b = workQueue.m20891b();
                }
                if (taskM20891b != null) {
                    return taskM20891b;
                }
                if (!z3 && (taskM20885e = m20885e()) != null) {
                    return taskM20885e;
                }
            } else {
                Task taskM20885e3 = m20885e();
                if (taskM20885e3 != null) {
                    return taskM20885e3;
                }
            }
            return m20889i(3);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: d */
        public final int m20884d(int i) {
            int i2 = this.f56462g;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f56462g = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX INFO: renamed from: e */
        public final Task m20885e() {
            int iM20884d = m20884d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iM20884d == 0) {
                Task task = (Task) coroutineScheduler.f56453f.m20837d();
                return task != null ? task : (Task) coroutineScheduler.f56454g.m20837d();
            }
            Task task2 = (Task) coroutineScheduler.f56454g.m20837d();
            return task2 != null ? task2 : (Task) coroutineScheduler.f56453f.m20837d();
        }

        /* JADX INFO: renamed from: f */
        public final void m20886f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f56452d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* JADX INFO: renamed from: g */
        public final void m20887g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m20888h(WorkerState workerState) {
            WorkerState workerState2 = this.f56459c;
            boolean z2 = workerState2 == WorkerState.f56465a;
            if (z2) {
                CoroutineScheduler.f56446n.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f56459c = workerState;
            }
            return z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            r7 = -2;
            r23 = r6;
         */
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Task m20889i(int i) {
            int i2;
            long j;
            Task taskM20892c;
            long j2;
            long j3;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f56446n;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i3 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            Task task = null;
            if (i3 < 2) {
                return null;
            }
            int iM20884d = m20884d(i3);
            int i4 = 0;
            long jMin = Long.MAX_VALUE;
            while (i4 < i3) {
                int i5 = iM20884d + 1;
                if (i5 > i3) {
                    i5 = 1;
                }
                Worker worker = (Worker) coroutineScheduler.f56455i.m20846b(i5);
                if (worker == null || worker == this) {
                    i2 = i5;
                } else {
                    WorkQueue workQueue = worker.f56457a;
                    if (i != 3) {
                        workQueue.getClass();
                        int i6 = WorkQueue.f56489d.get(workQueue);
                        int i7 = WorkQueue.f56488c.get(workQueue);
                        boolean z2 = i == 1;
                        while (true) {
                            if (i6 == i7) {
                                j = 0;
                                break;
                            }
                            j = 0;
                            if (!z2 || WorkQueue.f56490e.get(workQueue) != 0) {
                                int i8 = i6 + 1;
                                taskM20892c = workQueue.m20892c(i6, z2);
                                if (taskM20892c != null) {
                                    break;
                                }
                                i6 = i8;
                            } else {
                                break;
                            }
                        }
                    } else {
                        taskM20892c = workQueue.m20891b();
                        j = 0;
                    }
                    Ref.ObjectRef objectRef = this.f56458b;
                    if (taskM20892c != null) {
                        objectRef.f51659a = taskM20892c;
                        i2 = i5;
                        j3 = -1;
                        j2 = -1;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.f56487b;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null) {
                                j2 = -1;
                                break;
                            }
                            j2 = -1;
                            if (((task2.f56478b ? 1 : 2) & i) == 0) {
                                break;
                            }
                            TasksKt.f56485f.getClass();
                            i2 = i5;
                            long jNanoTime = System.nanoTime() - task2.f56477a;
                            long j4 = TasksKt.f56481b;
                            if (jNanoTime < j4) {
                                j3 = j4 - jNanoTime;
                                task = null;
                                break;
                            }
                            do {
                                task = null;
                                if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                    objectRef.f51659a = task2;
                                    j3 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(workQueue) == task2);
                            i5 = i2;
                            task = null;
                        }
                    }
                    if (j3 == j2) {
                        Task task3 = (Task) objectRef.f51659a;
                        objectRef.f51659a = task;
                        return task3;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i4++;
                iM20884d = i2;
                task = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f56461f = jMin;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j;
            int i;
            long j2;
            loop0: while (true) {
                boolean z2 = false;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler.f56447o.get(coroutineScheduler) == 0) {
                        WorkerState workerState = this.f56459c;
                        WorkerState workerState2 = WorkerState.f56469f;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        Task taskM20881a = m20881a(this.f56463i);
                        if (taskM20881a != null) {
                            this.f56461f = 0L;
                            this.f56460d = 0L;
                            if (this.f56459c == WorkerState.f56467c) {
                                this.f56459c = WorkerState.f56466b;
                            }
                            boolean z3 = taskM20881a.f56478b;
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            if (z3) {
                                if (m20888h(WorkerState.f56466b) && !coroutineScheduler2.m20880i() && !coroutineScheduler2.m20879h(CoroutineScheduler.f56446n.get(coroutineScheduler2))) {
                                    coroutineScheduler2.m20880i();
                                }
                                coroutineScheduler2.getClass();
                                try {
                                    taskM20881a.run();
                                } catch (Throwable th) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                }
                                CoroutineScheduler.f56446n.addAndGet(coroutineScheduler2, -2097152L);
                                if (this.f56459c != workerState2) {
                                    this.f56459c = WorkerState.f56468d;
                                }
                            } else {
                                coroutineScheduler2.getClass();
                                try {
                                    taskM20881a.run();
                                } catch (Throwable th2) {
                                    Thread threadCurrentThread2 = Thread.currentThread();
                                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                                }
                            }
                        } else {
                            this.f56463i = false;
                            if (this.f56461f == 0) {
                                Object obj = this.nextParkedWorker;
                                Symbol symbol = CoroutineScheduler.f56448p;
                                long j3 = 2097151;
                                if (obj != symbol) {
                                    f56456n.set(this, -1);
                                    while (this.nextParkedWorker != CoroutineScheduler.f56448p) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56456n;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                            coroutineScheduler3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler.f56447o;
                                            if (atomicIntegerFieldUpdater2.get(coroutineScheduler3) != 0) {
                                                break;
                                            }
                                            WorkerState workerState3 = this.f56459c;
                                            WorkerState workerState4 = WorkerState.f56469f;
                                            if (workerState3 == workerState4) {
                                                break;
                                            }
                                            m20888h(WorkerState.f56467c);
                                            Thread.interrupted();
                                            if (this.f56460d == 0) {
                                                j2 = j3;
                                                this.f56460d = System.nanoTime() + CoroutineScheduler.this.f56451c;
                                            } else {
                                                j2 = j3;
                                            }
                                            LockSupport.parkNanos(CoroutineScheduler.this.f56451c);
                                            if (System.nanoTime() - this.f56460d >= 0) {
                                                this.f56460d = 0L;
                                                CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                                synchronized (coroutineScheduler4.f56455i) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.f56446n;
                                                            if (((int) (atomicLongFieldUpdater2.get(coroutineScheduler4) & j2)) > coroutineScheduler4.f56449a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i2 = this.indexInArray;
                                                                    m20886f(0);
                                                                    coroutineScheduler4.m20878g(this, i2, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(coroutineScheduler4) & j2);
                                                                    if (andDecrement != i2) {
                                                                        Object objM20846b = coroutineScheduler4.f56455i.m20846b(andDecrement);
                                                                        Intrinsics.m18596d(objM20846b);
                                                                        Worker worker = (Worker) objM20846b;
                                                                        coroutineScheduler4.f56455i.m20847c(i2, worker);
                                                                        worker.m20886f(i2);
                                                                        coroutineScheduler4.m20878g(worker, andDecrement, i2);
                                                                    }
                                                                    coroutineScheduler4.f56455i.m20847c(andDecrement, null);
                                                                    this.f56459c = workerState4;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            j3 = j2;
                                        }
                                    }
                                } else {
                                    CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                                    coroutineScheduler5.getClass();
                                    if (this.nextParkedWorker == symbol) {
                                        do {
                                            atomicLongFieldUpdater = CoroutineScheduler.f56445j;
                                            j = atomicLongFieldUpdater.get(coroutineScheduler5);
                                            i = this.indexInArray;
                                            this.nextParkedWorker = coroutineScheduler5.f56455i.m20846b((int) (j & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(coroutineScheduler5, j, ((2097152 + j) & (-2097152)) | ((long) i)));
                                    }
                                }
                            } else {
                                if (z2) {
                                    m20888h(WorkerState.f56467c);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f56461f);
                                    this.f56461f = 0L;
                                    break;
                                }
                                z2 = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            m20888h(WorkerState.f56469f);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class WorkerState {

        /* JADX INFO: renamed from: a */
        public static final WorkerState f56465a;

        /* JADX INFO: renamed from: b */
        public static final WorkerState f56466b;

        /* JADX INFO: renamed from: c */
        public static final WorkerState f56467c;

        /* JADX INFO: renamed from: d */
        public static final WorkerState f56468d;

        /* JADX INFO: renamed from: f */
        public static final WorkerState f56469f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ WorkerState[] f56470g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ EnumEntries f56471i;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            f56465a = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            f56466b = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            f56467c = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            f56468d = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            f56469f = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            f56470g = workerStateArr;
            f56471i = EnumEntriesKt.m18563a(workerStateArr);
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f56470g.clone();
        }
    }

    public CoroutineScheduler(String str, int i, long j, int i2) {
        this.f56449a = i;
        this.f56450b = i2;
        this.f56451c = j;
        this.f56452d = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f56453f = new GlobalQueue();
        this.f56454g = new GlobalQueue();
        this.f56455i = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20875d(CoroutineScheduler coroutineScheduler, Runnable runnable, int i) {
        coroutineScheduler.m20877b(runnable, false, (i & 4) == 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m20876a() {
        synchronized (this.f56455i) {
            try {
                if (f56447o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f56446n;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f56449a) {
                    return 0;
                }
                if (i >= this.f56450b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f56455i.m20846b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(i3);
                this.f56455i.m20847c(i3, worker);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                worker.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20877b(Runnable runnable, boolean z2, boolean z3) {
        Task taskImpl;
        WorkerState workerState;
        TasksKt.f56485f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof Task) {
            taskImpl = (Task) runnable;
            taskImpl.f56477a = jNanoTime;
            taskImpl.f56478b = z2;
        } else {
            taskImpl = new TaskImpl(runnable, jNanoTime, z2);
        }
        boolean z4 = taskImpl.f56478b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f56446n;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.m18594b(CoroutineScheduler.this, this)) {
            worker = null;
        }
        if (worker != null && (workerState = worker.f56459c) != WorkerState.f56469f && (taskImpl.f56478b || workerState != WorkerState.f56466b)) {
            worker.f56463i = true;
            WorkQueue workQueue = worker.f56457a;
            if (z3) {
                taskImpl = workQueue.m20890a(taskImpl);
            } else {
                workQueue.getClass();
                Task task = (Task) WorkQueue.f56487b.getAndSet(workQueue, taskImpl);
                taskImpl = task == null ? null : workQueue.m20890a(task);
            }
        }
        if (taskImpl != null) {
            if (!(taskImpl.f56478b ? this.f56454g.m20834a(taskImpl) : this.f56453f.m20834a(taskImpl))) {
                throw new RejectedExecutionException(AbstractC0000a.m19p(new StringBuilder(), this.f56452d, " was terminated"));
            }
        }
        boolean z5 = z3 && worker != null;
        if (z4) {
            if (z5 || m20880i() || m20879h(jAddAndGet)) {
                return;
            }
            m20880i();
            return;
        }
        if (z5 || m20880i() || m20879h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m20880i();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        Task taskM20881a;
        if (f56447o.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
            if (worker == null || !Intrinsics.m18594b(CoroutineScheduler.this, this)) {
                worker = null;
            }
            synchronized (this.f56455i) {
                i = (int) (f56446n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM20846b = this.f56455i.m20846b(i2);
                    Intrinsics.m18596d(objM20846b);
                    Worker worker2 = (Worker) objM20846b;
                    if (worker2 != worker) {
                        while (worker2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker2);
                            worker2.join(10000L);
                        }
                        WorkQueue workQueue = worker2.f56457a;
                        GlobalQueue globalQueue = this.f56454g;
                        workQueue.getClass();
                        Task task = (Task) WorkQueue.f56487b.getAndSet(workQueue, null);
                        if (task != null) {
                            globalQueue.m20834a(task);
                        }
                        while (true) {
                            Task taskM20891b = workQueue.m20891b();
                            if (taskM20891b == null) {
                                break;
                            } else {
                                globalQueue.m20834a(taskM20891b);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f56454g.m20835b();
            this.f56453f.m20835b();
            while (true) {
                if (worker == null) {
                    taskM20881a = (Task) this.f56453f.m20837d();
                    if (taskM20881a == null && (taskM20881a = (Task) this.f56454g.m20837d()) == null) {
                        break;
                    }
                } else {
                    taskM20881a = worker.m20881a(true);
                    if (taskM20881a == null) {
                    }
                }
                try {
                    taskM20881a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (worker != null) {
                worker.m20888h(WorkerState.f56469f);
            }
            f56445j.set(this, 0L);
            f56446n.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m20875d(this, runnable, 6);
    }

    /* JADX INFO: renamed from: g */
    public final void m20878g(Worker worker, int i, int i2) {
        while (true) {
            long j = f56445j.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object nextParkedWorker = worker.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == f56448p) {
                            i3 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i3 = 0;
                            break;
                        }
                        Worker worker2 = (Worker) nextParkedWorker;
                        int indexInArray = worker2.getIndexInArray();
                        if (indexInArray != 0) {
                            i3 = indexInArray;
                            break;
                        }
                        nextParkedWorker = worker2.getNextParkedWorker();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f56445j.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20879h(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f56449a;
        if (i < i2) {
            int iM20876a = m20876a();
            if (iM20876a == 1 && i2 > 1) {
                m20876a();
            }
            if (iM20876a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m20880i() {
        Symbol symbol;
        int indexInArray;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f56445j;
            long j = atomicLongFieldUpdater.get(this);
            Worker worker = (Worker) this.f56455i.m20846b((int) (2097151 & j));
            if (worker == null) {
                worker = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object nextParkedWorker = worker.getNextParkedWorker();
                while (true) {
                    symbol = f56448p;
                    if (nextParkedWorker == symbol) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    Worker worker2 = (Worker) nextParkedWorker;
                    indexInArray = worker2.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = worker2.getNextParkedWorker();
                }
                if (indexInArray >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) indexInArray))) {
                    worker.m20887g(symbol);
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.f56456n.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.f56455i;
        int iM20845a = resizableAtomicArray.m20845a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM20845a; i6++) {
            Worker worker = (Worker) resizableAtomicArray.m20846b(i6);
            if (worker != null) {
                WorkQueue workQueue = worker.f56457a;
                workQueue.getClass();
                int i7 = WorkQueue.f56487b.get(workQueue) != null ? (WorkQueue.f56488c.get(workQueue) - WorkQueue.f56489d.get(workQueue)) + 1 : WorkQueue.f56488c.get(workQueue) - WorkQueue.f56489d.get(workQueue);
                int iOrdinal = worker.f56459c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = f56446n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f56452d);
        sb4.append('@');
        sb4.append(DebugStringsKt.m20565a(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f56449a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f56450b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f56453f.m20836c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f56454g.m20836c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
