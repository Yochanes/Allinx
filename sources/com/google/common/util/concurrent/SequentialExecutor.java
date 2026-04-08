package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class SequentialExecutor implements Executor {
    private static final LazyLogger log = new LazyLogger(SequentialExecutor.class);
    private final Executor executor;

    @GuardedBy("queue")
    private final Deque<Runnable> queue = new ArrayDeque();

    @GuardedBy("queue")
    @LazyInit
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;

    @GuardedBy("queue")
    private long workerRunCount = 0;

    @RetainedWith
    private final QueueWorker worker = new QueueWorker(this, null);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SequentialExecutor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC45631 implements Runnable {
        final /* synthetic */ SequentialExecutor this$0;
        final /* synthetic */ Runnable val$task;

        public RunnableC45631(SequentialExecutor sequentialExecutor, Runnable runnable) {
            this.val$task = runnable;
            this.this$0 = sequentialExecutor;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$task.run();
        }

        public String toString() {
            return this.val$task.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class QueueWorker implements Runnable {

        @CheckForNull
        Runnable task;

        private QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.access$400().get().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            Runnable runnable;
            boolean z2 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.access$100(SequentialExecutor.this)) {
                        if (z2) {
                            runnable = (Runnable) SequentialExecutor.access$100(SequentialExecutor.this).poll();
                            this.task = runnable;
                            if (runnable != null) {
                            }
                        } else {
                            WorkerRunningState workerRunningStateAccess$200 = SequentialExecutor.access$200(SequentialExecutor.this);
                            WorkerRunningState workerRunningState = WorkerRunningState.RUNNING;
                            if (workerRunningStateAccess$200 != workerRunningState) {
                                SequentialExecutor.access$308(SequentialExecutor.this);
                                SequentialExecutor.access$202(SequentialExecutor.this, workerRunningState);
                                z2 = true;
                                runnable = (Runnable) SequentialExecutor.access$100(SequentialExecutor.this).poll();
                                this.task = runnable;
                                if (runnable != null) {
                                    SequentialExecutor.access$202(SequentialExecutor.this, WorkerRunningState.IDLE);
                                }
                            }
                        }
                    }
                    if (!zInterrupted) {
                        return;
                    }
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.access$100(SequentialExecutor.this)) {
                    SequentialExecutor.access$202(SequentialExecutor.this, WorkerRunningState.IDLE);
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.access$200(SequentialExecutor.this) + "}";
        }

        public /* synthetic */ QueueWorker(SequentialExecutor sequentialExecutor, RunnableC45631 runnableC45631) {
            this();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ Deque access$100(SequentialExecutor sequentialExecutor) {
        return sequentialExecutor.queue;
    }

    public static /* synthetic */ WorkerRunningState access$200(SequentialExecutor sequentialExecutor) {
        return sequentialExecutor.workerRunningState;
    }

    public static /* synthetic */ WorkerRunningState access$202(SequentialExecutor sequentialExecutor, WorkerRunningState workerRunningState) {
        sequentialExecutor.workerRunningState = workerRunningState;
        return workerRunningState;
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    public static /* synthetic */ LazyLogger access$400() {
        return log;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z2;
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            WorkerRunningState workerRunningState2 = this.workerRunningState;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j = this.workerRunCount;
                RunnableC45631 runnableC45631 = new RunnableC45631(this, runnable);
                this.queue.add(runnableC45631);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.workerRunningState = workerRunningState3;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != workerRunningState3) {
                        return;
                    }
                    synchronized (this.queue) {
                        try {
                            if (this.workerRunCount == j && this.workerRunningState == workerRunningState3) {
                                this.workerRunningState = workerRunningState;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.queue) {
                        try {
                            WorkerRunningState workerRunningState4 = this.workerRunningState;
                            if (workerRunningState4 == WorkerRunningState.IDLE || workerRunningState4 == WorkerRunningState.QUEUING) {
                                z2 = this.queue.removeLastOccurrence(runnableC45631);
                            }
                            if (!(th instanceof RejectedExecutionException) || z2) {
                                throw th;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.queue.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
