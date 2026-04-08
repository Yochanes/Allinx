package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractIdleService implements Service {
    private final Supplier<String> threadNameSupplier = new ThreadNameSupplier(this, null);
    private final Service delegate = new DelegateService(this, null);

    /* JADX INFO: compiled from: Proguard */
    public final class DelegateService extends AbstractService {
        private DelegateService() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15072a(DelegateService delegateService) {
            delegateService.lambda$doStop$1();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m15073b(DelegateService delegateService) {
            delegateService.lambda$doStart$0();
        }

        private /* synthetic */ void lambda$doStart$0() {
            try {
                AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (Throwable th) {
                Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        private /* synthetic */ void lambda$doStop$1() {
            try {
                AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (Throwable th) {
                Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.renamingDecorator(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.access$200(AbstractIdleService.this)).execute(new RunnableC4577e(this, 1));
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            MoreExecutors.renamingDecorator(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.access$200(AbstractIdleService.this)).execute(new RunnableC4577e(this, 0));
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }

        public /* synthetic */ DelegateService(AbstractIdleService abstractIdleService, C45141 c45141) {
            this();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ThreadNameSupplier implements Supplier<String> {
        private ThreadNameSupplier() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ String get() {
            return get2();
        }

        public /* synthetic */ ThreadNameSupplier(AbstractIdleService abstractIdleService, C45141 c45141) {
            this();
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public String get2() {
            return AbstractIdleService.this.serviceName() + " " + AbstractIdleService.this.state();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15071a(AbstractIdleService abstractIdleService, Runnable runnable) {
        abstractIdleService.lambda$executor$0(runnable);
    }

    public static /* synthetic */ Supplier access$200(AbstractIdleService abstractIdleService) {
        return abstractIdleService.threadNameSupplier;
    }

    private /* synthetic */ void lambda$executor$0(Runnable runnable) {
        MoreExecutors.newThread(this.threadNameSupplier.get(), runnable).start();
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

    public Executor executor() {
        return new ExecutorC4573a(this, 1);
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public abstract void shutDown();

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    public abstract void startUp();

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
    public final void awaitRunning(long j, TimeUnit timeUnit) {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) {
        this.delegate.awaitTerminated(j, timeUnit);
    }
}
