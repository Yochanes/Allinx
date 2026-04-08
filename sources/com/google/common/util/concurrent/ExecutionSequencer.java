package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {
    private final AtomicReference<ListenableFuture<Void>> ref = new AtomicReference<>(Futures.immediateVoidFuture());

    @LazyInit
    private ThreadConfinedTaskQueue latestTaskQueue = new ThreadConfinedTaskQueue(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C45501<T> implements AsyncCallable<T> {
        final /* synthetic */ ExecutionSequencer this$0;
        final /* synthetic */ Callable val$callable;

        public C45501(ExecutionSequencer executionSequencer, Callable callable) {
            this.val$callable = callable;
            this.this$0 = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() {
            return Futures.immediateFuture(this.val$callable.call());
        }

        public String toString() {
            return this.val$callable.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C45512<T> implements AsyncCallable<T> {
        final /* synthetic */ ExecutionSequencer this$0;
        final /* synthetic */ AsyncCallable val$callable;
        final /* synthetic */ TaskNonReentrantExecutor val$taskExecutor;

        public C45512(ExecutionSequencer executionSequencer, TaskNonReentrantExecutor taskNonReentrantExecutor, AsyncCallable asyncCallable) {
            this.val$taskExecutor = taskNonReentrantExecutor;
            this.val$callable = asyncCallable;
            this.this$0 = executionSequencer;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() {
            return !TaskNonReentrantExecutor.access$200(this.val$taskExecutor) ? Futures.immediateCancelledFuture() : this.val$callable.call();
        }

        public String toString() {
            return this.val$callable.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        @CheckForNull
        Executor delegate;

        @CheckForNull
        ExecutionSequencer sequencer;

        @CheckForNull
        @LazyInit
        Thread submitting;

        @CheckForNull
        Runnable task;

        public /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, C45501 c45501) {
            this(executor, executionSequencer);
        }

        public static /* synthetic */ boolean access$200(TaskNonReentrantExecutor taskNonReentrantExecutor) {
            return taskNonReentrantExecutor.trySetStarted();
        }

        public static /* synthetic */ boolean access$400(TaskNonReentrantExecutor taskNonReentrantExecutor) {
            return taskNonReentrantExecutor.trySetCancelled();
        }

        private boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        private boolean trySetStarted() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.sequencer;
                Objects.requireNonNull(executionSequencer);
                ThreadConfinedTaskQueue threadConfinedTaskQueueAccess$300 = ExecutionSequencer.access$300(executionSequencer);
                if (threadConfinedTaskQueueAccess$300.thread == this.submitting) {
                    this.sequencer = null;
                    Preconditions.checkState(threadConfinedTaskQueueAccess$300.nextTask == null);
                    threadConfinedTaskQueueAccess$300.nextTask = runnable;
                    Executor executor = this.delegate;
                    Objects.requireNonNull(executor);
                    threadConfinedTaskQueueAccess$300.nextExecutor = executor;
                    this.delegate = null;
                } else {
                    Executor executor2 = this.delegate;
                    Objects.requireNonNull(executor2);
                    this.delegate = null;
                    this.task = runnable;
                    executor2.execute(this);
                }
                this.submitting = null;
            } catch (Throwable th) {
                this.submitting = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread != this.submitting) {
                Runnable runnable = this.task;
                Objects.requireNonNull(runnable);
                this.task = null;
                runnable.run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue(null);
            threadConfinedTaskQueue.thread = threadCurrentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            Objects.requireNonNull(executionSequencer);
            ExecutionSequencer.access$302(executionSequencer, threadConfinedTaskQueue);
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                Objects.requireNonNull(runnable2);
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = threadConfinedTaskQueue.nextTask;
                    if (runnable3 == null || (executor = threadConfinedTaskQueue.nextExecutor) == null) {
                        break;
                    }
                    threadConfinedTaskQueue.nextTask = null;
                    threadConfinedTaskQueue.nextExecutor = null;
                    executor.execute(runnable3);
                }
            } finally {
                threadConfinedTaskQueue.thread = null;
            }
        }

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.delegate = executor;
            this.sequencer = executionSequencer;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThreadConfinedTaskQueue {

        @CheckForNull
        Executor nextExecutor;

        @CheckForNull
        Runnable nextTask;

        @CheckForNull
        @LazyInit
        Thread thread;

        private ThreadConfinedTaskQueue() {
        }

        public /* synthetic */ ThreadConfinedTaskQueue(C45501 c45501) {
            this();
        }
    }

    private ExecutionSequencer() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15085a(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        lambda$submitAsync$0(trustedListenableFutureTask, settableFuture, listenableFuture, listenableFuture2, taskNonReentrantExecutor);
    }

    public static /* synthetic */ ThreadConfinedTaskQueue access$300(ExecutionSequencer executionSequencer) {
        return executionSequencer.latestTaskQueue;
    }

    public static /* synthetic */ ThreadConfinedTaskQueue access$302(ExecutionSequencer executionSequencer, ThreadConfinedTaskQueue threadConfinedTaskQueue) {
        executionSequencer.latestTaskQueue = threadConfinedTaskQueue;
        return threadConfinedTaskQueue;
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    private static /* synthetic */ void lambda$submitAsync$0(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            settableFuture.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && TaskNonReentrantExecutor.access$400(taskNonReentrantExecutor)) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        return submitAsync(new C45501(this, callable), executor);
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        Preconditions.checkNotNull(executor);
        TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this, null);
        C45512 c45512 = new C45512(this, taskNonReentrantExecutor, asyncCallable);
        SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture<Void> andSet = this.ref.getAndSet(settableFutureCreate);
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(c45512);
        andSet.addListener(trustedListenableFutureTaskCreate, taskNonReentrantExecutor);
        ListenableFuture<T> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(trustedListenableFutureTaskCreate);
        RunnableC4584l runnableC4584l = new RunnableC4584l(trustedListenableFutureTaskCreate, settableFutureCreate, andSet, listenableFutureNonCancellationPropagating, taskNonReentrantExecutor);
        listenableFutureNonCancellationPropagating.addListener(runnableC4584l, MoreExecutors.directExecutor());
        trustedListenableFutureTaskCreate.addListener(runnableC4584l, MoreExecutors.directExecutor());
        return listenableFutureNonCancellationPropagating;
    }
}
