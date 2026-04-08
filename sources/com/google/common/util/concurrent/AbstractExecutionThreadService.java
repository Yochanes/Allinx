package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractExecutionThreadService implements Service {
    private static final LazyLogger logger = new LazyLogger(AbstractExecutionThreadService.class);
    private final Service delegate = new C45101();

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C45101 extends AbstractService {
        public C45101() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ String m15069a(C45101 c45101) {
            return c45101.lambda$doStart$0();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m15070b(C45101 c45101) {
            c45101.lambda$doStart$1();
        }

        private /* synthetic */ String lambda$doStart$0() {
            return AbstractExecutionThreadService.this.serviceName();
        }

        private /* synthetic */ void lambda$doStart$1() {
            try {
                AbstractExecutionThreadService.this.startUp();
                notifyStarted();
                if (isRunning()) {
                    try {
                        AbstractExecutionThreadService.this.run();
                    } catch (Throwable th) {
                        Platform.restoreInterruptIfIsInterruptedException(th);
                        try {
                            AbstractExecutionThreadService.this.shutDown();
                        } catch (Exception e) {
                            Platform.restoreInterruptIfIsInterruptedException(e);
                            AbstractExecutionThreadService.access$000().get().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                        }
                        notifyFailed(th);
                        return;
                    }
                }
                AbstractExecutionThreadService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                Platform.restoreInterruptIfIsInterruptedException(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.renamingDecorator(AbstractExecutionThreadService.this.executor(), new C4574b(this, 0)).execute(new RunnableC4575c(this, 0));
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15068a(AbstractExecutionThreadService abstractExecutionThreadService, Runnable runnable) {
        abstractExecutionThreadService.lambda$executor$0(runnable);
    }

    public static /* synthetic */ LazyLogger access$000() {
        return logger;
    }

    private /* synthetic */ void lambda$executor$0(Runnable runnable) {
        MoreExecutors.newThread(serviceName(), runnable).start();
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
        return new ExecutorC4573a(this, 0);
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public abstract void run();

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
    public final void awaitRunning(long j, TimeUnit timeUnit) {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) {
        this.delegate.awaitTerminated(j, timeUnit);
    }

    public void shutDown() {
    }

    public void startUp() {
    }

    public void triggerShutdown() {
    }
}
