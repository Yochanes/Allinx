package com.google.common.util.concurrent;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
public final class MoreExecutors {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC45551 implements Runnable {
        final /* synthetic */ ListenableFuture val$future;
        final /* synthetic */ BlockingQueue val$queue;

        public RunnableC45551(BlockingQueue blockingQueue, ListenableFuture listenableFuture) {
            this.val$queue = blockingQueue;
            this.val$future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$queue.add(this.val$future);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ExecutorC45562 implements Executor {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Supplier val$nameSupplier;

        public ExecutorC45562(Executor executor, Supplier supplier) {
            this.val$executor = executor;
            this.val$nameSupplier = supplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.val$executor.execute(Callables.threadRenaming(runnable, (Supplier<String>) this.val$nameSupplier));
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C45573 extends WrappingExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45573(ExecutorService executorService, Supplier supplier) {
            super(executorService);
            this.val$nameSupplier = supplier;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) this.val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable runnable) {
            return Callables.threadRenaming(runnable, (Supplier<String>) this.val$nameSupplier);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C45584 extends WrappingScheduledExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45584(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
            super(scheduledExecutorService);
            this.val$nameSupplier = supplier;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) this.val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable runnable) {
            return Callables.threadRenaming(runnable, (Supplier<String>) this.val$nameSupplier);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$5 */
    /* JADX INFO: compiled from: Proguard */
    public class ExecutorC45595 implements Executor {
        final /* synthetic */ Executor val$delegate;
        final /* synthetic */ AbstractFuture val$future;

        public ExecutorC45595(Executor executor, AbstractFuture abstractFuture) {
            this.val$delegate = executor;
            this.val$future = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.val$delegate.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.val$future.setException(e);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @J2ktIncompatible
    @GwtIncompatible
    public static class ListeningDecorator extends AbstractListeningExecutorService {
        private final ExecutorService delegate;

        public ListeningDecorator(ExecutorService executorService) {
            this.delegate = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.delegate.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.delegate.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.delegate.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.delegate + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @GwtIncompatible
    @J2ktIncompatible
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        final ScheduledExecutorService delegate;

        /* JADX INFO: compiled from: Proguard */
        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            private final ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.scheduledDelegate = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z2) {
                boolean zCancel = super.cancel(z2);
                if (zCancel) {
                    this.scheduledDelegate.cancel(z2);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
                return compareTo2(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.scheduledDelegate.getDelay(timeUnit);
            }

            /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
            public int compareTo2(Delayed delayed) {
                return this.scheduledDelegate.compareTo(delayed);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @GwtIncompatible
        @J2ktIncompatible
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            private final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.delegate = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String pendingToString() {
                return "task=[" + this.delegate + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.delegate.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }
        }

        public ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.delegate = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return schedule(runnable, j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            return schedule(callable, j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(runnable, null);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, j, timeUnit));
        }
    }

    private MoreExecutors() {
    }

    public static /* synthetic */ void access$000(ThreadPoolExecutor threadPoolExecutor) {
        useDaemonThreadFactory(threadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
        new Application().addDelayedShutdownHook(executorService, j, timeUnit);
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        return new Application().getExitingExecutorService(threadPoolExecutor, j, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        return new Application().getExitingScheduledExecutorService(scheduledThreadPoolExecutor, j, timeUnit);
    }

    @J2ktIncompatible
    @ParametricNullness
    @GwtIncompatible
    public static <T> T invokeAnyImpl(ListeningExecutorService listeningExecutorService, Collection<? extends Callable<T>> collection, boolean z2, long j, TimeUnit timeUnit) throws ExecutionException {
        long jNanoTime;
        long jNanoTime2;
        Preconditions.checkNotNull(listeningExecutorService);
        Preconditions.checkNotNull(timeUnit);
        int size = collection.size();
        Preconditions.checkArgument(size > 0);
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(size);
        LinkedBlockingQueue linkedBlockingQueueNewLinkedBlockingQueue = Queues.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j);
        if (z2) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                Iterator it = arrayListNewArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
        int i = size - 1;
        int i2 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i > 0) {
                    i--;
                    arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
                    i2++;
                } else {
                    if (i2 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z2) {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j2 = nanos;
            int i3 = i;
            if (future != null) {
                i2--;
                try {
                    T t = (T) future.get();
                    Iterator it3 = arrayListNewArrayListWithCapacity.iterator();
                    while (it3.hasNext()) {
                        ((Future) it3.next()).cancel(true);
                    }
                    return t;
                } catch (InterruptedException e) {
                    throw e;
                } catch (ExecutionException e2) {
                    executionException = e2;
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                } catch (Exception e3) {
                    executionException = new ExecutionException(e3);
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                }
            }
            i = i3;
            nanos = j2;
            jNanoTime = jNanoTime2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static boolean isAppEngineWithApiClasses() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
        return executorService instanceof ListeningExecutorService ? (ListeningExecutorService) executorService : executorService instanceof ScheduledExecutorService ? new ScheduledListeningDecorator((ScheduledExecutorService) executorService) : new ListeningDecorator(executorService);
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
        return new DirectExecutorService();
    }

    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Thread newThread(String str, Runnable runnable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(runnable);
        Thread threadNewThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e2) {
            throw Throwables.propagate(e2.getCause());
        }
    }

    public static Executor rejectionPropagatingExecutor(Executor executor, AbstractFuture<?> abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        return executor == directExecutor() ? executor : new ExecutorC45595(executor, abstractFuture);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Executor renamingDecorator(Executor executor, Supplier<String> supplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        return new ExecutorC45562(executor, supplier);
    }

    @CanIgnoreReturnValue
    @J2ktIncompatible
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static <T> ListenableFuture<T> submitAndAddQueueListener(ListeningExecutorService listeningExecutorService, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        ListenableFuture<T> listenableFutureSubmit = listeningExecutorService.submit((Callable) callable);
        listenableFutureSubmit.addListener(new RunnableC45551(blockingQueue, listenableFutureSubmit), directExecutor());
        return listenableFutureSubmit;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static void useDaemonThreadFactory(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return new Application().getExitingExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: compiled from: Proguard */
    @GwtIncompatible
    @VisibleForTesting
    @J2ktIncompatible
    public static class Application {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        /* JADX INFO: compiled from: Proguard */
        public class RunnableC45601 implements Runnable {
            final /* synthetic */ Application this$0;
            final /* synthetic */ ExecutorService val$service;
            final /* synthetic */ long val$terminationTimeout;
            final /* synthetic */ TimeUnit val$timeUnit;

            public RunnableC45601(Application application, ExecutorService executorService, long j, TimeUnit timeUnit) {
                this.val$service = executorService;
                this.val$terminationTimeout = j;
                this.val$timeUnit = timeUnit;
                this.this$0 = application;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.val$service.shutdown();
                    this.val$service.awaitTermination(this.val$terminationTimeout, this.val$timeUnit);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
            Preconditions.checkNotNull(executorService);
            Preconditions.checkNotNull(timeUnit);
            addShutdownHook(MoreExecutors.newThread("DelayedShutdownHook-for-" + executorService, new RunnableC45601(this, executorService, j, timeUnit)));
        }

        @VisibleForTesting
        public void addShutdownHook(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.access$000(threadPoolExecutor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            addDelayedShutdownHook(threadPoolExecutor, j, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.access$000(scheduledThreadPoolExecutor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            addDelayedShutdownHook(scheduledThreadPoolExecutor, j, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }

        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
            return getExitingExecutorService(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return getExitingScheduledExecutorService(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new Application().getExitingScheduledExecutorService(scheduledThreadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService renamingDecorator(ExecutorService executorService, Supplier<String> supplier) {
        Preconditions.checkNotNull(executorService);
        Preconditions.checkNotNull(supplier);
        return new C45573(executorService, supplier);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ListeningScheduledExecutorService) {
            return (ListeningScheduledExecutorService) scheduledExecutorService;
        }
        return new ScheduledListeningDecorator(scheduledExecutorService);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService renamingDecorator(ScheduledExecutorService scheduledExecutorService, Supplier<String> supplier) {
        Preconditions.checkNotNull(scheduledExecutorService);
        Preconditions.checkNotNull(supplier);
        return new C45584(scheduledExecutorService, supplier);
    }
}
