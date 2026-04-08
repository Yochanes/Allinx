package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractScheduledService implements Service {
    private static final LazyLogger logger = new LazyLogger(AbstractScheduledService.class);
    private final AbstractService delegate = new ServiceDelegate(this, null);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C45151 extends Service.Listener {
        final /* synthetic */ AbstractScheduledService this$0;
        final /* synthetic */ ScheduledExecutorService val$executor;

        public C45151(AbstractScheduledService abstractScheduledService, ScheduledExecutorService scheduledExecutorService) {
            this.val$executor = scheduledExecutorService;
            this.this$0 = abstractScheduledService;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
            this.val$executor.shutdown();
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            this.val$executor.shutdown();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl, reason: invalid class name */
    /* JADX INFO: compiled from: Proguard */
    public class C1ThreadFactoryImpl implements ThreadFactory {
        public C1ThreadFactoryImpl() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return MoreExecutors.newThread(AbstractScheduledService.this.serviceName(), runnable);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Cancellable {
        void cancel(boolean z2);

        boolean isCancelled();
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CustomScheduler extends Scheduler {

        /* JADX INFO: compiled from: Proguard */
        public final class ReschedulableCallable implements Callable<Void> {

            @CheckForNull
            @GuardedBy("lock")
            private SupplantableFuture cancellationDelegate;
            private final ScheduledExecutorService executor;
            private final ReentrantLock lock = new ReentrantLock();
            private final AbstractService service;
            private final Runnable wrappedRunnable;

            public ReschedulableCallable(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.wrappedRunnable = runnable;
                this.executor = scheduledExecutorService;
                this.service = abstractService;
            }

            @GuardedBy("lock")
            private Cancellable initializeOrUpdateCancellationDelegate(Schedule schedule) {
                SupplantableFuture supplantableFuture = this.cancellationDelegate;
                if (supplantableFuture == null) {
                    SupplantableFuture supplantableFuture2 = new SupplantableFuture(this.lock, submitToExecutor(schedule));
                    this.cancellationDelegate = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!SupplantableFuture.access$600(supplantableFuture).isCancelled()) {
                    SupplantableFuture.access$602(this.cancellationDelegate, submitToExecutor(schedule));
                }
                return this.cancellationDelegate;
            }

            private ScheduledFuture<Void> submitToExecutor(Schedule schedule) {
                return this.executor.schedule(this, Schedule.access$700(schedule), Schedule.access$800(schedule));
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            public /* bridge */ /* synthetic */ Void call() {
                return call2();
            }

            @CanIgnoreReturnValue
            public Cancellable reschedule() {
                Cancellable futureAsCancellable;
                try {
                    Schedule nextSchedule = CustomScheduler.this.getNextSchedule();
                    this.lock.lock();
                    try {
                        futureAsCancellable = initializeOrUpdateCancellationDelegate(nextSchedule);
                        this.lock.unlock();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            futureAsCancellable = new FutureAsCancellable(Futures.immediateCancelledFuture());
                        } finally {
                            this.lock.unlock();
                        }
                    }
                    if (th != null) {
                        this.service.notifyFailed(th);
                    }
                    return futureAsCancellable;
                } catch (Throwable th2) {
                    Platform.restoreInterruptIfIsInterruptedException(th2);
                    this.service.notifyFailed(th2);
                    return new FutureAsCancellable(Futures.immediateCancelledFuture());
                }
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() {
                this.wrappedRunnable.run();
                reschedule();
                return null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Schedule {
            private final long delay;
            private final TimeUnit unit;

            public Schedule(long j, TimeUnit timeUnit) {
                this.delay = j;
                this.unit = (TimeUnit) Preconditions.checkNotNull(timeUnit);
            }

            public static /* synthetic */ long access$700(Schedule schedule) {
                return schedule.delay;
            }

            public static /* synthetic */ TimeUnit access$800(Schedule schedule) {
                return schedule.unit;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class SupplantableFuture implements Cancellable {

            @GuardedBy("lock")
            private Future<Void> currentFuture;
            private final ReentrantLock lock;

            public SupplantableFuture(ReentrantLock reentrantLock, Future<Void> future) {
                this.lock = reentrantLock;
                this.currentFuture = future;
            }

            public static /* synthetic */ Future access$600(SupplantableFuture supplantableFuture) {
                return supplantableFuture.currentFuture;
            }

            public static /* synthetic */ Future access$602(SupplantableFuture supplantableFuture, Future future) {
                supplantableFuture.currentFuture = future;
                return future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean z2) {
                this.lock.lock();
                try {
                    this.currentFuture.cancel(z2);
                } finally {
                    this.lock.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                this.lock.lock();
                try {
                    return this.currentFuture.isCancelled();
                } finally {
                    this.lock.unlock();
                }
            }
        }

        public CustomScheduler() {
            super(null);
        }

        public abstract Schedule getNextSchedule();

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        public final Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new ReschedulableCallable(abstractService, scheduledExecutorService, runnable).reschedule();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FutureAsCancellable implements Cancellable {
        private final Future<?> delegate;

        public FutureAsCancellable(Future<?> future) {
            this.delegate = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean z2) {
            this.delegate.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Scheduler {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C45161 extends Scheduler {
            final /* synthetic */ long val$delay;
            final /* synthetic */ long val$initialDelay;
            final /* synthetic */ TimeUnit val$unit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45161(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.val$initialDelay = j;
                this.val$delay = j2;
                this.val$unit = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.val$initialDelay, this.val$delay, this.val$unit));
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C45172 extends Scheduler {
            final /* synthetic */ long val$initialDelay;
            final /* synthetic */ long val$period;
            final /* synthetic */ TimeUnit val$unit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45172(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.val$initialDelay = j;
                this.val$period = j2;
                this.val$unit = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, this.val$initialDelay, this.val$period, this.val$unit));
            }
        }

        public /* synthetic */ Scheduler(C45151 c45151) {
            this();
        }

        public static Scheduler newFixedDelaySchedule(long j, long j2, TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j2 > 0, "delay must be > 0, found %s", j2);
            return new C45161(j, j2, timeUnit);
        }

        public static Scheduler newFixedRateSchedule(long j, long j2, TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j2 > 0, "period must be > 0, found %s", j2);
            return new C45172(j, j2, timeUnit);
        }

        public abstract Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private Scheduler() {
        }
    }

    public static /* synthetic */ LazyLogger access$400() {
        return logger;
    }

    public static /* synthetic */ AbstractService access$500(AbstractScheduledService abstractScheduledService) {
        return abstractScheduledService.delegate;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    public ScheduledExecutorService executor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new C1ThreadFactoryImpl());
        addListener(new C45151(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor), MoreExecutors.directExecutor());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public abstract void runOneIteration();

    public abstract Scheduler scheduler();

    public String serviceName() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitTerminated(j, timeUnit);
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ServiceDelegate extends AbstractService {

        @CheckForNull
        private volatile ScheduledExecutorService executorService;
        private final ReentrantLock lock;

        @CheckForNull
        private volatile Cancellable runningTask;
        private final Runnable task;

        /* JADX INFO: compiled from: Proguard */
        public class Task implements Runnable {
            public Task() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ServiceDelegate.access$200(ServiceDelegate.this).lock();
                try {
                    Cancellable cancellableAccess$300 = ServiceDelegate.access$300(ServiceDelegate.this);
                    Objects.requireNonNull(cancellableAccess$300);
                    if (!cancellableAccess$300.isCancelled()) {
                        AbstractScheduledService.this.runOneIteration();
                    }
                } catch (Throwable th) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(th);
                        try {
                            AbstractScheduledService.this.shutDown();
                        } catch (Exception e) {
                            Platform.restoreInterruptIfIsInterruptedException(e);
                            AbstractScheduledService.access$400().get().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                        }
                        ServiceDelegate.this.notifyFailed(th);
                        Cancellable cancellableAccess$3002 = ServiceDelegate.access$300(ServiceDelegate.this);
                        Objects.requireNonNull(cancellableAccess$3002);
                        cancellableAccess$3002.cancel(false);
                    } finally {
                        ServiceDelegate.access$200(ServiceDelegate.this).unlock();
                    }
                }
            }
        }

        private ServiceDelegate() {
            this.lock = new ReentrantLock();
            this.task = new Task();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ String m15074a(ServiceDelegate serviceDelegate) {
            return serviceDelegate.lambda$doStart$0();
        }

        public static /* synthetic */ ReentrantLock access$200(ServiceDelegate serviceDelegate) {
            return serviceDelegate.lock;
        }

        public static /* synthetic */ Cancellable access$300(ServiceDelegate serviceDelegate) {
            return serviceDelegate.runningTask;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m15075b(ServiceDelegate serviceDelegate) {
            serviceDelegate.lambda$doStart$1();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m15076c(ServiceDelegate serviceDelegate) {
            serviceDelegate.lambda$doStop$2();
        }

        private /* synthetic */ String lambda$doStart$0() {
            return AbstractScheduledService.this.serviceName() + " " + state();
        }

        private /* synthetic */ void lambda$doStart$1() {
            this.lock.lock();
            try {
                AbstractScheduledService.this.startUp();
                Objects.requireNonNull(this.executorService);
                this.runningTask = AbstractScheduledService.this.scheduler().schedule(AbstractScheduledService.access$500(AbstractScheduledService.this), this.executorService, this.task);
                notifyStarted();
            } catch (Throwable th) {
                try {
                    Platform.restoreInterruptIfIsInterruptedException(th);
                    notifyFailed(th);
                    if (this.runningTask != null) {
                        this.runningTask.cancel(false);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        private /* synthetic */ void lambda$doStop$2() {
            try {
                this.lock.lock();
                try {
                    if (state() != Service.State.STOPPING) {
                        return;
                    }
                    AbstractScheduledService.this.shutDown();
                    this.lock.unlock();
                    notifyStopped();
                } finally {
                    this.lock.unlock();
                }
            } catch (Throwable th) {
                Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            this.executorService = MoreExecutors.renamingDecorator(AbstractScheduledService.this.executor(), (Supplier<String>) new C4574b(this, 1));
            this.executorService.execute(new RunnableC4578f(this, 0));
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            Objects.requireNonNull(this.runningTask);
            Objects.requireNonNull(this.executorService);
            this.runningTask.cancel(false);
            this.executorService.execute(new RunnableC4578f(this, 1));
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }

        public /* synthetic */ ServiceDelegate(AbstractScheduledService abstractScheduledService, C45151 c45151) {
            this();
        }
    }

    public void shutDown() {
    }

    public void startUp() {
    }
}
